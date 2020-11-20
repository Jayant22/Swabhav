import { Component, OnInit } from '@angular/core';
import { MathObservableServiceService } from '../math-observable-service.service';

@Component({
  selector: 'app-observable',
  templateUrl: './observable.component.html',
  styleUrls: ['./observable.component.css']
})
export class ObservableComponent implements OnInit {

  squaredOfNum: number;

  constructor(private service: MathObservableServiceService) { }

  ngOnInit(): void {

    this.service.getSquare(12)
      .subscribe(data => {
        this.squaredOfNum = data;
        console.log(data);
      },
      e =>{ console.log(e); });
      () => { console.log("Completed ")}
  }
}
