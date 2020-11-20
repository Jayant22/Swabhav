interface IEmployee {
    empCode: number;
    name: string;
    getSalary:(arg0: number)=>number;
}

class Employees implements IEmployee { 
    empCode: number;
    name: string;

    constructor(code: number, name: string) { 
                this.empCode = code;
                this.name = name;
    }

    getSalary(empCode:number):number { 
        return 20000;
    }
}

let emp1 = new Employee(1, "Steve");
console.log(emp1);