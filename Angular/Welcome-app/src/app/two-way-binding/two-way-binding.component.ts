import { Component, OnInit } from '@angular/core';

import { MathService } from '../math.service';
import { LoggerService } from '../logger.service';

@Component({
  selector: 'app-two-way-binding',
  templateUrl: './two-way-binding.component.html',
  styleUrls: ['./two-way-binding.component.css'],
  providers:[LoggerService,MathService]
})
export class TwoWayBindingComponent implements OnInit {

  firstName: string ;
  lastName: string = "Kodam";

  constructor(private Math: MathService,private Logger: LoggerService) { }

  ngOnInit(): void {
    let result = this.Math.cubeEven(3);
    console.log(result);
  }

  firstNameChange(event){
    console.log(event);
    this.firstName = event.toUpperCase()
  }
}
