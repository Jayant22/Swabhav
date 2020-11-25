import { Component, OnInit } from '@angular/core';

import { NumbersApiService } from '../Services/numbers-api.service';
import * as moment from 'moment';

@Component({
  selector: 'app-numbers-api',
  templateUrl: './numbers-api.component.html',
  styleUrls: ['./numbers-api.component.css'],
})
export class NumbersAPIComponent implements OnInit {

  numberFactInfo = [];
  isPresent = false;
  constructor(private numberService: NumbersApiService) { }

  ngOnInit(): void {
    
    this.numberService.getFactsfromLocal()
      .subscribe( result =>{
        // console.log(result);
        this.numberFactInfo = result;
        let newFormulalist =  this.numberFactInfo.filter((v,i) => this.numberFactInfo.findIndex(item => item.numberFact == v.numberFact) === i);
        this.numberFactInfo = newFormulalist;
        console.log(this.numberFactInfo)
      },
      error => {
        console.log(error);
      })
  }

  getNumberFact = function(userInput: any){

    console.log(userInput);
    
    for (var key of this.numberFactInfo) {
      let keySplit = key.numberFact.split(" ");
      if(keySplit[0] == userInput)
        this.isPresent = true;
    }

    if(!this.isPresent){
      this.numberService.getFact(userInput)
        .subscribe((result: string) => {
          this.numberFactInfo.push({
            numberFact: result,
            time: this.numberService.calculateTimeDifference(moment().format('DD-MM-YYYY hh:mm:ss'))
          })
          this.setNumberFact(result, moment().format('DD-MM-YYYY hh:mm:ss'));
        },
          (error: any) => {
          console.log(error);
        })
    }else
      console.log("Number Is Already Present In the List");
      this.isPresent = false;
  }

  setNumberFact = function(setData,setTime){
    this.numberService.setFactsToLocal(setData,setTime);
  }
}
