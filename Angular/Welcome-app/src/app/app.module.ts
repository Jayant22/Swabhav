import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { WelcomeComponent } from './welcome/welcome.component';
//import { ObservableComponent } from './observable/observable.component';
import { StarRatingComponent } from './star-rating/star-rating.component';
import { StarComponent } from './star-rating/star/star.component';

@NgModule({
  
  declarations: [ 
    WelcomeComponent,  
    StarRatingComponent,
    StarComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [
    WelcomeComponent,  
    StarRatingComponent,
    StarComponent
  ]
})
export class AppModule { }
