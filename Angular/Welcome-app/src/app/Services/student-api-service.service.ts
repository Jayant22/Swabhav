import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { IStudentAPI } from '../student-api/IStudentAPI';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentApiServiceService {

  url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";

  constructor(private http: HttpClient) { }

  getStudentDetails(studentID?: number): Observable<IStudentAPI[]> {

    if(studentID == undefined) {
      return this.http.get<IStudentAPI[]>(this.url);
    } else {
      return this.http.get<IStudentAPI[]>(this.url + studentID);
    }
  }

  addNewStudent(studentDetails): Observable<any> {

    let studentJSON: string = JSON.stringify(studentDetails);
    let httpHeaders = new HttpHeaders( { 'Content-type': 'application/json; charset=utf-8'} );

    console.log(studentJSON);    

    return this.http.post<any>(this.url, studentJSON, {'headers': httpHeaders} );

  }
}
