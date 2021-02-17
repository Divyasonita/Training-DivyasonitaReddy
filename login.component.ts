import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  UserName:string;
  Password:string;
  isvalid:boolean;
  isinvalid:boolean;
  constructor() { }
  ngOnInit(): void {  }
  CheckUser(){
    if(this.UserName=="Admin" && this.Password=="Admin"){
      this.isvalid=true;
      this.isinvalid=false;
    }
    else{
      this.isvalid=false;
      this.isinvalid=true;
    }
  }

}
