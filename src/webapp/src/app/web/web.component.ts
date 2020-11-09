import {Component, OnInit} from '@angular/core';
import {TestwebService} from "../testweb/testweb.service";
import {Object1} from "../model/object1";
import {WebService} from "./web.service";

@Component({
  selector: 'app-web',
  templateUrl: './web.component.html',
  styleUrls: ['./web.component.css']
})
export class WebComponent implements OnInit {

  object1: Object1[] = [];

  object2: Object1[] = [];

  object3: Object1[] = [];

  constructor(private webService: WebService) {
  }


  ngOnInit() {
    this.webService.testPost1().subscribe(result => {
      this.object1 = result.productsList
      console.log(this.object1);
    });

    this.webService.testPost2().subscribe(result => {
      this.object2 = result.productsList
      console.log(this.object2);
    });

    this.webService.testPost3().subscribe(result => {
        this.object3 = result.productsList
        console.log(this.object3);
      }
    )

  }

}
