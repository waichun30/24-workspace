import { Injectable } from '@angular/core';
import {environment} from "../../environments/environment.prod";

@Injectable({
  providedIn: 'root'
})
export class EndPointService {

  testapi='';
  testorder='';


  constructor() {
    this.testapi =environment.apiHost + '/1.0/test/status';
    this.testorder =environment.apiHost + '/1.0/test/order';

  }
}
