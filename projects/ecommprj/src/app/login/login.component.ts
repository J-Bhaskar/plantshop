// login.component.ts
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CustomService } from '../../services/custom.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username:string='';
password:string='';


// constructor() is a hook. and use for dependency injection of multiple modules or services
constructor(private customserv:CustomService,private route:Router){}


onSubmit()
{

let obj ={id:0,username:this.username,password:this.password}
this.customserv.userexists(obj).subscribe(
                                            response => 
                                            {
                                              console.log(response)
                                              // dynamic navigation
                                              if(response)
                                                {
                                                  this.route.navigate(["/dashboard"]);
                                                }
                                            
                                            },
                                            error=>console.log(error)
                                          );
}

}
