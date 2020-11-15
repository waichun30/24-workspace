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

  myAngular(productCode: String){
    console.log('got come in');

      this.listService.updateOrder(productCode).subscribe(
        result => {
          console.log('post d');
        }
      );
  }

}
