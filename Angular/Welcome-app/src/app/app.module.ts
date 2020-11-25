import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from "@angular/common/http";
import { ReactiveFormsModule } from "@angular/forms";

import { WelcomeComponent } from './welcome/welcome.component';
// import { StudentApiComponent } from './student-api/student-api.component';
import { NumbersAPIComponent } from './numbers-api/numbers-api.component';

@NgModule({
  
  declarations: [ 
    WelcomeComponent,  
    NumbersAPIComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [
  ],
  bootstrap: [
    WelcomeComponent,  
    NumbersAPIComponent
  ]
})
export class AppModule { }
