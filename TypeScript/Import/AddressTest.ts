import { Address } from '../Export/Address'

class AddressTest extends Address{
    constructor(address: string){
        super(address);
    }
}

let address: AddressTest = new AddressTest("Solapur");
console.log(address.Address);