import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {EndPointService} from "../api/end-point.service";
import { DeviceDetectorService } from 'ngx-device-detector';
import { Observable, interval } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TestwebService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };

  constructor(private http: HttpClient,private endpointProvider: EndPointService) {
  }

  testPost ():Observable<any>{
    return this.http.post<any>(this.endpointProvider.testapi, "{}", this.httpOptions);

  }

}
