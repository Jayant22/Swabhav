import { Component, OnInit } from '@angular/core';

import { IStudent } from './IStudent';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  public student: { id: number; name: string; cgpa: number; };
  public students = [];
  public isActive = false;
  studentList: IStudent[] = [];
  img = '../../assets/Resource/Student.jpg';
  width = 10 + 'em';
  height = 10 + 'em';

  constructor() {}

  ngOnInit(): void {

    this.studentInfo({
      id: 101,
      name: "sam",
      cgpa: 7.3
    });

    this.studentsData();
    
    this.students = [
      {
          id: 101,
          name: "sam",
          cgpa: 7.1
      },
      {
          id: 102,
          name: "tom",
          cgpa: 7.5
      },    
      {
          id: 103,
          name: "ben",
          cgpa: 6.2
      },
    ]

  }

  studentInfo(student : IStudent) {

    this.student = {
      id: student.id,
      name: student.name,
      cgpa: student.cgpa,
    }
    console.log(this.student);
  }

  studentsData(){
    for(let std of this.students) {
      this.studentList.push({
        id: std.id,
        name: std.name,
        cgpa:std.cgpa,
      })
    }
  }

  loadAllStudents() {
    this.isActive = (this.isActive ? false: true);
  }
}
