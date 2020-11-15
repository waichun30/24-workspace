import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {OrderService} from "../order/order.service";
import {ListService} from "./list.service";
import {Order} from "../model/order";
import {Category} from "../model/category";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  qrCode: string;
  category: Category [];


  constructor(private route: ActivatedRoute, private listService: ListService) {

  }
  ngOnInit() {
    this.qrCode = this.route.snapshot.paramMap.get("qrCode");
    this.listService.getOrder(this.qrCode)
      .subscribe(
        result => {
          this.category = result.category;
        }
      );
  }

  addToCart(productCode: string){
    console.log('got come in');
    console.log('got ' + productCode);


    this.listService.updateOrder(productCode).subscribe(
        result => {
          console.log('post d');
          var current = (document.getElementById(productCode) as HTMLElement).innerHTML;

          console.log(current);
          var add = parseInt(current)+ 1;
          console.log(add);
          var value = add as unknown as string;
          console.log(value);
          document.getElementById(productCode).textContent=value;
        }
      );
  }

  removeFromCart(productCode: string){
    console.log('got come in');
    console.log('got ' + productCode);
    var current = (document.getElementById(productCode) as HTMLElement).innerHTML;

    if(current.toString() == "0"){
      return;
    }
    this.listService.updateOrder(productCode).subscribe(
      result => {
        console.log('post d');
        console.log(current);
        var add = parseInt(current)- 1;
        console.log(add);
        var value = add as unknown as string;
        console.log(value);
        document.getElementById(productCode).textContent=value;
      }
    );
  }

}
