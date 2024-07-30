// register.component.ts
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CustomService } from '../../services/custom.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  registerForm: FormGroup;
  username:string
  password:string


  constructor(private fb: FormBuilder,private customserv:CustomService) {
    this.registerForm = this.fb.group({
      username: ['', [Validators.required]],
      password: ['', [Validators.required, Validators.minLength(6)]]
      
    }, );
  }

  //passwordMatchValidator(form: FormGroup) {
   // return form.get('password').value === form.get('confirmPassword').value ? null : { mismatch: true };
  //}

  onSubmit() {
     
      // Handle registration
      let data = {
        id:0,
        password:this.password,
        username:this.username
        
        
      }
      
      
      console.log(data);
      this.customserv.addUser(this.registerForm.value).subscribe(Response=>console.log(Response),
          error=>console.log(error))
      console.log(this.registerForm.value);
    }
  
}
