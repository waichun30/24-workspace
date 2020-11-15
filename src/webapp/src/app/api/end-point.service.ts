import { Injectable } from '@angular/core';
import {environment} from "../../environments/environment.prod";

@Injectable({
  providedIn: 'root'
})
export class EndPointService {

  testapi='';
  testorder='';
  prod="";
  updateCart="";

  constructor() {
    this.testapi =environment.apiHost + '/1.0/test/status';
    this.testorder =environment.apiHost + '/1.0/test/order';
    this.prod=environment.apiHost+'/1.0/prod';
    this.updateCart= environment.apiHost+'/1.0/prod/add/cart';
  }
}
