import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  @Input() onColor: string;
  @Input() offColor: string;

  @Output() stateChange = new EventEmitter<string>();

  value:string = 'OFF';

  constructor() { }

  ngOnInit(): void {
    console.log("OnInit: ",this.offColor,this.onColor);
  }

  changeBgColor = function() {

    if(this.value === 'OFF') {
      console.log("onColor ",this.onColor);
      this.value='ON';
      this.stateChange.emit(this.onColor);    
    } else {
      console.log("offColor ",this.offColor);
      this.value='OFF';
      this.stateChange.emit(this.offColor);
    }

  }

}
