import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-star-rating',
  templateUrl: './star-rating.component.html',
  styleUrls: ['./star-rating.component.css']
})
export class StarRatingComponent implements OnInit {

  rating;
  currentRating: number = 4.5;

  constructor() { }

  ngOnInit(): void {  }

  onMouseOverHandler = function() {
    console.log("Mouseover: " + this.currentRating);
  }
}
