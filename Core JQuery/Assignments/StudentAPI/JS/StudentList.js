$(document).ready(function() {

    const url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";

    $.ajax({
        method: 'GET',
        url: url,
        
        success: function(studentsDetails) {
            displayStudentDetails(studentsDetails);
        },
        error: function(err) {
            console.log(err.statusText);
        }
    });

    $("#tbUser").on('click','.btnDelete',function(){
        console.log($('.btnDelete').val());
      });

    function displayStudentDetails(studentsDetails) {
        
        for(let i=0; i < studentsDetails.length; i++) {
            $('table tbody').append(
                '<tr><td>' + studentsDetails[i].id + '</td>' +
                '<td>' + studentsDetails[i].rollNo + '</td>' +
                '<td>' + studentsDetails[i].name + '</td>' +
                '<td>' + studentsDetails[i].age + '</td>' +
                '<td>' + studentsDetails[i].email + '</td>' +
                '<td>' + studentsDetails[i].date + '</td>' +
                '<td>' + studentsDetails[i].isMale + '</td>' +
                '<td><button id="'+studentsDetails[i].id+'" onclick="storeIdToStorage(this.id)"class="btnUpdate">UPDATE</button></td>' +
                '<td><button id="'+ studentsDetails[i].id +'" onclick="deleteStudentFromAPI(this.id)" >DELETE</button></td>'
                
            );
        }
    }
});

function deleteStudentFromAPI(id){
    console.log(id);
    const url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + id;

    $.ajax({
        method: 'DELETE',
        url: url,
        success: function() {
            alert('Student data successfully deleted');
        },
        error: function(err) {
            console.log(err.statusText);
        }
    });

    setTimeout(function() {
        location.reload(true);
    }, 3000);
}

function storeIdToStorage(id){
    console.log(id);
    sessionStorage.setItem('StudentID', id);
    location.href = '../HTMl/StudentUpdate.html';
}