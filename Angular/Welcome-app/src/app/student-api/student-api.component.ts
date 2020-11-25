import { Component, OnInit } from '@angular/core';
import { StudentApiServiceService } from '../Services/student-api-service.service';

@Component({
  selector: 'app-student-api',
  templateUrl: './student-api.component.html',
  styleUrls: ['./student-api.component.css']
})
export class StudentApiComponent implements OnInit {

  studentDetails = [];
  isDisabled: boolean = false;

  constructor(private studentService: StudentApiServiceService ) { }

  ngOnInit(): void {
    this.studentService.getStudentDetails()
      .subscribe(result => {
        this.studentDetails = result;
        for (let i = 0; i < this.studentDetails.length; i++) {
          this.studentDetails[i].isMale =  this.studentDetails[i].isMale == true? "Male": "Female";
        }
        console.log(this.studentDetails);
      },
      error =>{
        console.log(error);
      }
    )
  }

  addStudent = function(studentDetails){
    console.log(studentDetails.form.controls.gender.value);

    if (confirm("Are Sure Do You Want To Load Deatils??")) {
      this.studentService.addNewStudent({
        "rollNo": studentDetails.form.controls.rollNo.value,
        "name": studentDetails.form.controls.name.value,
        "age": studentDetails.form.controls.age.value,
        "email": studentDetails.form.controls.email.value,
        "date": studentDetails.form.controls.date.value,
        "isMale": studentDetails.form.controls.gender.value == "Male" ? true: false,
      })
      .subscribe(result => {
        console.log(result);
        alert("Student successfully added!");
        this.isDisabled = false;
      },
      error => {
        console.log(error);
      });
    }
  }

  showAddStudent(){
    this.isDisabled = true;
  }

}
