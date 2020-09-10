$(document).ready(function() {

    $("#date").datepicker({ dateFormat: "dd-m-yy" }); 

    $('form').on('submit', function(event) {

        event.preventDefault();

        const url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";
        
        let studentName = $('#studentName').val();
        let rollno = $('#rollNo').val();
        let studentAge = $('#age').val();
        let studentEmail = $('#email').val();
        let dob = $('#date').val();
        let gender = $("input[name='gender']:checked").val();
        gender = (gender == 'Male' ? true : false);

        console.log(dob);
        console.log(gender);

        let studentDetails = {
            rollNo: rollno,
            name: studentName,
            age: studentAge,
            email: studentEmail,
            date: dob,
            isMale: gender
        };

        $.ajax({
            method: 'POST',
            url: url,
            data: studentDetails,
            success: function() {
                alert("Student Details Added!!!");
            },
            error: function(err) {
                console.log(err);
            }
        });

        setTimeout(function() {
            location.href = '../HTML/StudentList.html';
        }, 3000);

    }); 
});