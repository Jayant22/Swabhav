import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentApiComponent } from './student-api/student-api.component';

@NgModule({
  
  declarations: [ 
    WelcomeComponent,  
    StudentApiComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [
    WelcomeComponent,  
    StudentApiComponent
  ]
})
export class AppModule { }
