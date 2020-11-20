import { Component, OnInit, Input} from '@angular/core';

@Component({
  selector: 'app-star',
  templateUrl: './star.component.html',
  styleUrls: ['./star.component.css']
})
export class StarComponent implements OnInit {

  @Input() rating;
  maxRating = 5;

  constructor() { }

  ngOnInit(): void {
    if (this.rating) {
      console.log("OnInit Rating::",this.rating);  
    }
  }
}
