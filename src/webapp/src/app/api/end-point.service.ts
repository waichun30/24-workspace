import { Injectable } from '@angular/core';
import {environment} from "../../environments/environment.prod";

@Injectable({
  providedIn: 'root'
})
export class EndPointService {

  testapi='';


  constructor() {
    this.testapi =environment.apiHost + '/1.0/test/status';

  }
}
