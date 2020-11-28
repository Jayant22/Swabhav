import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from 'src/app/appService/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  btnValue: string = 'Show Image';
  showImage: boolean = true;
  products: any = [];
  searchText: string = '';

  constructor(private productService: ProductService, private route: Router) { }

  ngOnInit(): void {
    this.productService.getProducts()
      .subscribe( result => {
        this.products = result;
        console.log(this.products);
      },
      error => {
        console.log(error);  
      })
  }

  showAllImage(){
    if (this.btnValue == 'Show Image') {
      this.showImage = false;
      this.btnValue = "Hide Image";
      console.log(this.showImage);
  } else {
      this.showImage = true;
      this.btnValue = "Show Image";
      console.log(this.showImage);
    }
  }

  setProductID = function(productId) {
    localStorage.setItem('productID', productId);
  }

}
