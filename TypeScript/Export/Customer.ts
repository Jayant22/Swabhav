export class Customer{

    constructor(private _id: number, private _name: string){    }

    public get Id(){
        return this._id;
    }
    public get Name(){
        return this._name;
    }
    public set Id(id:number){
        this._id = id;
    }
    public set Name(name:string){
        this._name = name;
    }
}