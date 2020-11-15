import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {EndPointService} from "../api/end-point.service";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ListService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };

  constructor(private http: HttpClient,private endpointProvider: EndPointService) {
  }

  getOrder (qrCode):Observable<any>{
    return this.http.get<any>(this.endpointProvider.prod + '/' + qrCode, this.httpOptions);
  }

  updateOrder (productCode):Observable<any>{
    return this.http.post<any>(this.endpointProvider.updateCart, "{ \"productCode\":\""+productCode+"\", \"cartId\":\"ORD20201111586269\", \"quantity\":\"2\", \"memo\":\"hello\" }", this.httpOptions);
  }
}
