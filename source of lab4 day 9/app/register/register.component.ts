import { Component, OnInit } from '@angular/core';
import { Validators, FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  RegiterForm: FormGroup;
  submitted: boolean ;
  InvalidLogin = false;
  constructor(private formBuilder: FormBuilder) { }
  onSubmit() {
    this.submitted = true;
    if (this.RegiterForm.controls.mail.value === 'suraj'
    && this.RegiterForm.controls.password.value === '1') {
      console.log("Enter to system");
      this.InvalidLogin = true;
    } else {
        this.InvalidLogin = false;
        console.log("restricted");
      }
    }
  ngOnInit() {
    this.RegiterForm = this.formBuilder.group({
      id: ['', Validators.required] ,
      name: ['', [ Validators.required , Validators.maxLength(20), Validators.pattern('^[a-zA-Z ]*$')] ],
      email: ['', [ Validators.required , Validators.email]],
      mobile: ['', [ Validators.required ,  Validators.maxLength(10), Validators.pattern('^[0-9]$')]],
      password: ['', [ Validators.required , Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}')]]
    });
  }

}
