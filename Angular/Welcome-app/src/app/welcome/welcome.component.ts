import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  message:string;
  name:string;
  constructor() {}

  ngOnInit(): void {
    this.message = "Swabhav Techlab says ,Welcome to Angular 10 Components "
    this.name = "Peter"
  }

  updateName() {
    this.name = 'John';
  }

}
