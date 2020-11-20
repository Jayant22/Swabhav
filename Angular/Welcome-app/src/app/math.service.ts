import { Injectable } from '@angular/core';
import { LoggerService } from './logger.service';


@Injectable({
  providedIn: 'root'
})
export class MathService {

  constructor( private service: LoggerService ) { }

  cubeEven(Number: number): number {
    console.log('inside Mathservice');
    this.service.Log(Number);
    return Number ** 3;
  }

}
