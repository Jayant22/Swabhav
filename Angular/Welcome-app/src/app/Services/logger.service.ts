import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerService {

  constructor() { }

  Log(Num: any){
    console.log("Inside Logger Service");
  }
}
