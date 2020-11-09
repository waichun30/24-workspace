import { Component, OnInit } from '@angular/core';
import {TestwebService} from "./testweb.service";
import {log} from "util";
import {Object1} from "../model/object1";

@Component({
  selector: 'app-testweb',
  templateUrl: './testweb.component.html',
  styleUrls: ['./testweb.component.css']
})
export class TestwebComponent implements OnInit {

  a: String;
  object1: Object1[] = [];

  constructor(private testWebService: TestwebService) { }

  ngOnInit() {
    this.testWebService.testPost().subscribe(result => {

      this.object1=result.productsList
        console.log(this.object1);


      }
    )
  }


  // public getJSON() {
  //   this.http.get("assets/file.json")
  //     .subscribe(response => {
  //
  //       //here iam converting response as json
  //       let temp=response.item.json();
  //
  //       //here iam getting fruits data in temp variable
  //       this.object1=temp.img;
  //       //printing fruits Array.
  //       // console.log("Fruits",this.object1);
  //       //
  //       // //here iam newly added access in typescript file
  //       // for(let fruit of this.fruits){
  //       //   console.log("Fruit Name",fruit.name);
  //       // }
  //       // console.log("Fruits access via index--->",this.fruits[0].name);
  //     })
  // }
}
