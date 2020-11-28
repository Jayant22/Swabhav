import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from "@angular/forms";
import { Router } from '@angular/router';
import { StudentApiServiceService } from '../AppServices/student-api-service.service';

@Component({
  selector: 'app-student-update',
  templateUrl: './student-update.component.html',
  styleUrls: ['./student-update.component.css']
})
export class StudentUpdateComponent implements OnInit {

  updateStudentControl: FormGroup;
  studentID: string;
  
  constructor(private studentService: StudentApiServiceService, private router: Router, private formBuilder: FormBuilder) { 

    this.getStudentDetails();

    this.updateStudentControl = formBuilder.group({
      stdName: ['', Validators.required],
      stdRollNo: ['', Validators.required],
      stdAge: ['', Validators.required],
      stdEmail: ['', [Validators.required, Validators.email, Validators.pattern('^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$')]],
      stdDate: ['', Validators.required],
      stdGender: ['', Validators.required],
    });

  }

  ngOnInit(): void {  }

  getStudentDetails() {
    this.studentID = localStorage.getItem('StudentId');
    localStorage.removeItem('StudentId');
  
    this.studentService.getStudentDetails(this.studentID)
    .subscribe(response => {

      this.updateStudentControl.setValue({  
        stdName: response[0].name,
        stdRollNo: response[0].rollNo,  
        stdAge: response[0].age,
        stdEmail: response[0].email,
        stdDate: response[0].date,
        stdGender: (response[0].isMale == true) ? "Male": "Female"
      });
      
    }, 
    e => {
      console.log(e);  
    })
  }

  updateStudent(updateStudentControl){

    this.studentService.updateStudent(this.studentID,{
      "name": updateStudentControl.controls.stdName.value,
      "rollNo": updateStudentControl.controls.stdRollNo.value,
      "age": updateStudentControl.controls.stdAge.value,
      "email": updateStudentControl.controls.stdEmail.value,
      "date": updateStudentControl.controls.stdDate.value,
      "isMale": updateStudentControl.controls.stdGender.value == "Male" ? true: false,
    })
    .subscribe(res => {

      setTimeout(() => {
        alert("Details successfully updated");
        this.router.navigateByUrl('/studentList');
      }, 100);

    },
    e => {
      console.log(e); 
    })
  }

  isFieldValid(fieldName){
    let field = this.updateStudentControl.get(fieldName);    
    return field.invalid;
  }

  isFieldRequired(fieldName){
    let fieldRequired = this.updateStudentControl.get(fieldName); 
    return fieldRequired.errors.required;
  }

  isValidEmail(fieldName){
    let fieldRequired = this.updateStudentControl.get(fieldName);
    return fieldRequired.errors.pattern;
  }
}
