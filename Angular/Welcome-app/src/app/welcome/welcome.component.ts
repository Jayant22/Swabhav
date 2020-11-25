import { Component, OnInit } from '@angular/core';
import * as moment from 'moment';


@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  message:string;
  name:string;
  date;
  constructor() {}

  ngOnInit(): void {
    this.message = "Swabhav Techlab says ,Welcome to Angular 10 Components "
    this.name = "Peter"
  }

  updateName() {
    this.name = 'John';
  }
}
