import { Customer } from '../Export/Customer';

class CustomerTest extends Customer{
    constructor(id: number, name: string){
        super(id,name);
    }

}

let Jayant: CustomerTest =  new CustomerTest(101, "Jayant");
console.log("Initialize From Constructor::");
console.log(Jayant.Id);
console.log(Jayant.Name);
Jayant.Id = 105;
Jayant.Name = "Jay";
console.log("Assigning From Setter::");
console.log(Jayant.Id);
console.log(Jayant.Name);


