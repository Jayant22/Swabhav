import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StudentApiServiceService } from '../AppServices/student-api-service.service';

@Component({
  selector: 'app-student-form',
  templateUrl: './student-form.component.html',
  styleUrls: ['./student-form.component.css']
})
export class StudentFormComponent implements OnInit {

  constructor(private studentService: StudentApiServiceService, private router: Router) { }

  ngOnInit(): void {
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
        this.router.navigateByUrl('/studentList')
      },
      error => {
        console.log(error);
      });
    }
  }
}
