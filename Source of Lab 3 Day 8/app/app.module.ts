import { AppComponent } from "./app.component";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import {
  MatInputModule,
  MatCardModule,
  MatButtonModule,
  MatToolbarModule,
  MatExpansionModule } from "@angular/material";
import {BrowserModule } from "@angular/platform-browser";
import { TableCreateComponent } from "./table-create/table-create.component";
import { HeadingComponent } from "./heading/heading.component";
import { TableListComponent } from "./table-list/table-list.component";
// import { PostCreateComponent } from './posts/post-create/post-create.component';
// import { HeaderComponent } from "./header/header.component";
// import { PostListComponent } from "./posts/post-list/post-list.component";

@NgModule({
  declarations: [
    AppComponent,
    TableCreateComponent,
    HeadingComponent,
    TableListComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatCardModule,
    MatButtonModule,
    MatToolbarModule,
    MatExpansionModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}

