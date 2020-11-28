import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-star-component, [app-star-component]',
  templateUrl: './star-component.component.html',
  styleUrls: ['./star-component.component.css']
})
export class StarComponentComponent implements OnInit {

  @Input() rating;
  maxRating = 5;

  constructor() { }

  ngOnInit(): void {  }
}
