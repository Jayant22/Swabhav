import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

import * as moment from 'moment';

@Injectable({
  providedIn: 'root'
})
export class NumbersApiService {

  private url = "http://numbersapi.com/";
  private localStorageData : any = [];

  private options = { headers: new HttpHeaders().set('Content-Type', 'text/plain'), responseType: 'text' as 'json' };

  constructor(private http: HttpClient) { }

  laodLocalStroage = function(){
    for(var localnumberFact in window.localStorage) {
      if(window.localStorage.hasOwnProperty(localnumberFact)) {
    
        this.localStorageData.push({
          numberFact: localnumberFact,
          time:  this.calculateTimeDifference(localStorage.getItem(localnumberFact)) 
        });
      }
    }
    return this.localStorageData;
  }
  
  getFact(num: number): Observable<string>{
    return this.http.get<string>(this.url + num, this.options);
  }

  getFactsfromLocal():Observable<any>{
    return new Observable((observer) => observer.next(this.laodLocalStroage()));
  }

  setFactsToLocal(key,value){
    localStorage.setItem(key,value)
  }

  calculateTimeDifference = function(time: string) {
    let date = moment().format('DD-MM-YYYY hh:mm:ss');
    let taskAddedTime = moment(time,'DD-MM-YYYY hh:mm:ss');
    let currentTime = moment(date,'DD-MM-YYYY hh:mm:ss');
    let compare = moment.duration(taskAddedTime.diff(currentTime));
    return compare.humanize(true);
  }

  

}
