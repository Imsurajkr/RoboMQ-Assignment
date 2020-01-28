import { Component, OnInit, Output , EventEmitter} from '@angular/core';

@Component({
  selector: 'app-table-create',
  templateUrl: './table-create.component.html',
  styleUrls: ['./table-create.component.css']
})
export class TableCreateComponent {

  constructor() { }
  id: ' ';
  name: ' ';
  sal: ' ';
  @Output() tableCreated = new EventEmitter();
  empAdd() {
    const post = {
      id: this.id,
      empName: this.name,
      empSal: this.sal
    };
    this.tableCreated.emit(post);
  }

}
