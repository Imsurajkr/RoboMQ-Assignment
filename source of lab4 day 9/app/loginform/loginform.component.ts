import { Component, OnInit } from '@angular/core';
import { Validators, FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-loginform',
  templateUrl: './loginform.component.html',
  styleUrls: ['./loginform.component.css']
})
export class LoginformComponent implements OnInit {
  logInForm: FormGroup;
  submitted: boolean ;
  InvalidLogin = false;
  constructor(private formBuilder: FormBuilder) { }
  onSubmit() {
    this.submitted = true;
    // if (this.logInForm.invalid) {
    //   return ;
    // }
    if (this.logInForm.controls.mail.value === 'suraj'
    && this.logInForm.controls.password.value === '1') {
      console.log("Enter to system");
      this.InvalidLogin = true;
    } else {
        this.InvalidLogin = false;
        console.log("restricted");
      }
    }
    ngOnInit(): void {
    this.logInForm = this.formBuilder.group({
      mail: ['', Validators.required],
      password: ['', Validators.required]
    });
  }
}


