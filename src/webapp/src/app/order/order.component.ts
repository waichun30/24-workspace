import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {OrderService} from "./order.service";

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  orderId: string;
  result: string;

  constructor(private route: ActivatedRoute, private orderService: OrderService) {

  }

  ngOnInit() {

    this.orderId = this.route.snapshot.paramMap.get("orderId");
    this.orderService.checkOrder(this.orderId)
      .subscribe(
        result => {
          this.result = result;
        }
      );
  }

}
