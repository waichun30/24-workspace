import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {EndPointService} from "../api/end-point.service";

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json'
    })
  };

  constructor(private http: HttpClient,private endpointProvider: EndPointService) {
  }

  checkOrder(orderId) {
    return this.http.get<any>(this.endpointProvider.testorder + "/" + orderId)
  }
}
