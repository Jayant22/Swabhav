module.exports = class MemoryRepo{
    constructor(){
        this.Contacts = [
            {
                contact_id : 1,
                name : "Jayant",
                contact_No : 1234567890
            },
            {
                contact_id : 2,
                name : "Paras",
                contact_No : 1234567890
            },
            {
                contact_id : 3,
                name : "Kaushik",
                contact_No : 1234567890
            },
            {
                contact_id : 4,
                name : "Shailesh",
                contact_No : 1234567890
            }
        ]
    }
    
    get(){
        let contacts = this.Contacts;
        return new Promise(function(resolve, reject){
            console.log(contacts);
            if(contacts === undefined)
                reject(new Error("Error result is undefined"));
            else
                resolve(JSON.stringify(contacts));                                             
        })
    }

    add(contact){
        let contacts = this.Contacts;
        return new Promise(function(resolve, reject){
            contacts.push(contact);
            console.log("1 record inserted");

            if(contacts === undefined)
                reject(new Error("Error result is undefined"));
            else
                resolve(contacts[contacts.length]);                                              
        })
        
    }
}
