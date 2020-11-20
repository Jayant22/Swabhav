export class Employee{
    public Ename: string;
    constructor(name: string){
        this.Ename = name;
    }

    public display(){
        console.log(`My Name Is ${this.Ename}`);
    }
}