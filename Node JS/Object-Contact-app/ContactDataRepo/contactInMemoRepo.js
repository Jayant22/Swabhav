module.exports = class MemoryRepo{
    constructor(){
        this.Contacts = [
            {
                id : 1,
                name : "Jayant"
            },
            {
                id : 2, 
                name : "Paras"
            },
            {
                id : 3, 
                name : "Kaushik"
            },
            {
                id : 4, 
                name : "Shailesh"
            }
        ]
    }
    
    get(){
        return this.Contacts;
    }

    add(contact){
        this.Contacts.push(contact);
    }
}
