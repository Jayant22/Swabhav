import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { IStudentAPI } from '../IStudentAPI';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentApiServiceService {

  url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";

  constructor(private http: HttpClient) { }

  getStudentDetails(studentID?: string): Observable<IStudentAPI[]> {

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

  deleteStudent(studentID: string): Observable<IStudentAPI>{
    return this.http.delete<IStudentAPI>(this.url + studentID);
  }

  updateStudent(studentID: string, studentDetails): Observable<IStudentAPI> {

    let httpHeaders = new HttpHeaders( { 'Content-type': 'application/json; charset=utf-8'} );
    let studentJSON: string = JSON.stringify(studentDetails);
    
    return this.http.put<IStudentAPI>(`${this.url} ${studentID}`, studentJSON, {'headers': httpHeaders} );

  }
}
