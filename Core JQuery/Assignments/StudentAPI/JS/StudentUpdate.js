var studentID;
$(document).ready(function() {

    $("#date").datepicker({ dateFormat: "dd-m-yy" });

    window.studentID = sessionStorage.getItem('StudentID');
    console.log(window.studentID);
    const url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + window.studentID;

    $.ajax({
        method: 'get',
        url: url,
        dataType: 'json',
        success: function(studentsDetails) {
            for (let i = 0; i < studentsDetails.length; i++) {

                $('#studentName').val(studentsDetails[i].name);
                $('#rollNo').val(studentsDetails[i].rollNo);
                $('#age').val(studentsDetails[i].age);
                $('#email').val(studentsDetails[i].email); 
                $('#date').val(studentsDetails[i].date);

                if(studentsDetails[i].isMale){
                    $("#male").prop("checked", true);
                }else{
                    $("#female").prop("checked", true);
                }
            }
        },
        error: function(err) {
            console.log(err.statusText);
        }
    });

    $('form').on('submit', function(event) {

        event.preventDefault();    
        
        let studentName = $('#studentName').val();
        let rollno = $('#rollNo').val();
        let studentAge = $('#age').val();
        let studentEmail = $('#email').val();
        let dob = $('#date').val();
        let gender = $("input[name='gender']:checked").val();
        gender = (gender == 'Male' ? true : false);

        let studentDetails = {
            rollNo: rollno,
            name: studentName,
            age: studentAge,
            email: studentEmail,
            date: dob,
            isMale: gender
        };

        $.ajax({
            method: 'PUT',
            url: url,
            data: studentDetails,
            success: function() {
                console.log("SUCCESS");
                alert("Student Details Updated!!!");

            },
            error: function(err) {
                console.log(err);
            }
        });

        setTimeout(function() {
            location.href = '../HTML/StudentList.html'
        }, 3000);

    }); 
});