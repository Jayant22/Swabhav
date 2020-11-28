import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit {

  deptId: number;
  constructor(private route:ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe((params: ParamMap) => {
      this.deptId = parseInt(params.get('deptId'));
      console.log('deptId ',this.deptId);

      if(isNaN(this.deptId)){
        console.log('sending Back');
        this.router.navigate(['/notfound'])
      }
    });
  }
}
