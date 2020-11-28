import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { StarComponentComponent } from './star/star-component.component';


@NgModule({
  declarations: [StarComponentComponent],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports: [
    CommonModule,
    FormsModule,
    StarComponentComponent
  ]
})
export class SharedModuleModule { }
