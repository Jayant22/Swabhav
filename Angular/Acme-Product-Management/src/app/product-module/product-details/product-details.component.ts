import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/appService/product.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  product: any = {};
  productId: any;

  constructor(private productService: ProductService) { }

  ngOnInit(): void {

    this.productId = localStorage.getItem('productID');
    // localStorage.removeItem('productID');
    console.log(this.productId);

    this.getProductDetails();
    
  }

  getProductDetails = function(){

    this.productService.getProducts().subscribe(result => {
      console.log(result);
      
      for (let index = 0; index < result.length; index++) {
      
        if (this.productId == result[index].productId) {
          
          this.product = {
            'productId': result[index].productId,
            'productName': result[index].productName,
            'productCode': result[index].productCode,
            'description': result[index].description,
            'releaseDate': result[index].releaseDate,
            'price': result[index].price,
            'starRating':result[index].starRating,
            'imageUrl': result[index].imageUrl
          }
        }
      }
    },
    error => {
      console.log(error);
      
    })
  } 
}
