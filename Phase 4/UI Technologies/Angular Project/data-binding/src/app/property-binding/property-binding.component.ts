import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  lname:string ="Patil";
  f1:boolean = false;
  f2:boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

}
