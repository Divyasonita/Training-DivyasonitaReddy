import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import {HomeComponent} from './home/home.component';
import{EmployeeComponent} from './employee/employee.component';
import {LoginComponent} from './login/login.component';
const routes: Routes = [
  {path:"",component:HomeComponent},
  {path:'home',component:HomeComponent},
  {path:'employee',component:EmployeeComponent},
  {path:'login',component:LoginComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
