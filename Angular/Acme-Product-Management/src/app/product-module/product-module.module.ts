import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { ProductModuleRoutingModule } from './product-module-routing.module';
import { ProductListComponent } from './product-list/product-list.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { SharedModuleModule } from '../shared-module/shared-module.module';
import { SearchFilterPipe } from '../appService/search-filter.pipe';


@NgModule({
  declarations: [ProductListComponent, ProductDetailsComponent,SearchFilterPipe],
  imports: [
    CommonModule,
    FormsModule,
    SharedModuleModule,
    ProductModuleRoutingModule
  ],
  exports: [
    ProductListComponent,
    ProductDetailsComponent
  ]
})
export class ProductModuleModule { }


