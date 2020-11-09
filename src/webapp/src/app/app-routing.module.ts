import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TestwebComponent} from "./testweb/testweb.component";
import { WebComponent} from "./web/web.component";
import {OrderComponent} from "./order/order.component";


const routes: Routes = [
  {path: 'reload', component: TestwebComponent},
  {path: 'web', component: WebComponent},
  {path: 'order/:orderId', component: OrderComponent}
];

@NgModule({

  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule],
})
export class AppRoutingModule { }
