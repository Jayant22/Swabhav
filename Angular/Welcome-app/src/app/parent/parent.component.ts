import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  onPColor;
  offPColor;
  bgColor = "black";
  constructor() { }

  ngOnInit(): void {
    this.onPColor = "blue";
    this.offPColor = "black";
    console.log("OnInit: ",this.offPColor,this.onPColor);
  }

  stateChangeHandler = function(event) {
    console.log(event);
    this.bgColor = event;
  }

}
