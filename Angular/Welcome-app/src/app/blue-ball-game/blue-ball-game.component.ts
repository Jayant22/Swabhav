import { Component, OnInit } from '@angular/core';

import { IBall } from "./IBall";

@Component({
  selector: 'app-blue-ball-game',
  templateUrl: './blue-ball-game.component.html',
  styleUrls: ['./blue-ball-game.component.css']
})
export class BlueBallGameComponent implements OnInit {

  minBalls: number = 1;
  maxBalls: number = 50;
  attempts: number = 4;
  randomNumberGenerated: number;
  gameIsRunning = false;
  result:string;
  balls: IBall[] = [];

  constructor() { }

  ngOnInit(): void {
  }

  startGame(){
    this.gameIsRunning = true;
    this.generateNumber();
    this.generateBalls();
  }

  generateNumber(){
    this.randomNumberGenerated = Math.floor((Math.random() * this.maxBalls) + this.minBalls);
    console.log(this.randomNumberGenerated);
  }

  generateBalls(){

    for(let i = this.minBalls; i <= this.maxBalls; i++){
      this.balls.push({
        id: i,
        bgColor: '#989898',
        currentColor: '#989898',
        disabled: false
      });
    }
  }

  cheakGameResult(id){
    console.log(id);

    if(this.balls[id-1].id == this.randomNumberGenerated){
      this.balls[id-1].currentColor = 'Blue';
      this.result = 'Congralution!! You Have Won The Game';
      this.endGame();
    }
    if (this.balls[id-1].id < this.randomNumberGenerated && this.attempts != 0) {
      this.attempts--;
      this.balls[id-1].currentColor = 'Red';
    }
    if (this.balls[id-1].id > this.randomNumberGenerated && this.attempts != 0) {
      this.attempts--;
      this.balls[id-1].currentColor = 'Green';
    }
    if(this.attempts == 0){
      this.result = "Sorry!! You have lost the game"
      this.endGame();
    }

  }

  endGame(){
    for(let i=this.minBalls; i <= this.maxBalls; i++) {      
      this.balls[i-1].disabled = true;
    }
  }
  
}
