import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginformComponent} from './loginform/loginform.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  { path: 'login', component: LoginformComponent },
  { path: 'register', component: RegisterComponent },
  { path: ' ', component: LoginformComponent}
  // { path: 'list-user', component: ListUserComponent },
  // { path: 'edit-user', component: EditUserComponent },
  // {path : '', component : LoginComponent}
];
export const routing = RouterModule.forRoot(routes);

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
