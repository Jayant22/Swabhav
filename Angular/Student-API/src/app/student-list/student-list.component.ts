import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StudentApiServiceService } from '../AppServices/student-api-service.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  studentDetails = [];

  constructor(private studentService: StudentApiServiceService, private router: Router) { }

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

  saveStudentID = function(studentId){
    console.log(studentId);
    localStorage.setItem('StudentId', studentId);
    this.router.navigateByUrl('/studentUpdate')
  }

  deleteStudent = function(studentId){
    if (confirm("Are You Sure Do You Want To Delete")) {
      console.log(studentId);
      this.studentService.deleteStudent(studentId)
      .subscribe(res=> {
        this.ngOnInit();
      })
    }
  }
}
