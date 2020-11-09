import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {EndPointService} from "../api/end-point.service";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class WebService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };

  constructor(private http: HttpClient,private endpointProvider: EndPointService) {
  }

  testPost1 ():Observable<any>{
    return this.http.post<any>(this.endpointProvider.testapi, "{\"type\": \"1\"}", this.httpOptions);
  }

  testPost2 ():Observable<any>{
    return this.http.post<any>(this.endpointProvider.testapi, "{\"type\": \"2\"}", this.httpOptions);
  }

  testPost3 ():Observable<any>{
    return this.http.post<any>(this.endpointProvider.testapi, "{\"type\": \"3\"}", this.httpOptions);
  }
}
