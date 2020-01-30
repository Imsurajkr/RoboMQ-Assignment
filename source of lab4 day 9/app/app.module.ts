import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ReactiveFormsModule } from '@angular/forms';
import {LoginformComponent} from './loginform/loginform.component';
import { RegisterComponent } from './register/register.component';
// import { RouterModule, Routes } from '@angular/router';
import { routing , AppRoutingModule} from './app.routing';
@NgModule({
  declarations: [
    AppComponent,
    LoginformComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    routing,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
