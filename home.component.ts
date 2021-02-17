import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent  {

  Sno:number;
  M1:number;
  M2:number;
  M3:number;
  Total:number;
  Percentage:number;
  public Display(){
    this.Total=this.M1+this.M2+this.M3;
    this.Percentage=this.Total/3;
  }


}
