import { Employee } from '../Export/Empolyee';

class EmployeeTest extends Employee{
    constructor(name: string){
       super(name); 
    }
}

let Jayant: EmployeeTest =  new EmployeeTest("Jayant");
Jayant.display();