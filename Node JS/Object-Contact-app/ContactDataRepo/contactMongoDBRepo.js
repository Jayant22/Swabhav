const MongoClient = require('mongodb').MongoClient;
const uri = "mongodb+srv://root:Root@cluster0.caila.mongodb.net/ContactDB?retryWrites=true&w=majority";

module.exports = class mongoDBRepoClass {
    constructor() {
        this.client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });
    }

    get() {
        let results = [];
        let connectClient = this.client;
        return new Promise(function(resolve, reject){
            connectClient.connect(async err => {
                const db = connectClient.db("ContactDB");
                let collection = db.collection('Contacts').find();
                await collection.forEach(data =>{
                    results.push(data);
                });
                if(results === undefined)
                    reject(new Error("Error result is undefined"));
                else
                    resolve(JSON.stringify(results));
            });                                                
        })
    }

    add(contact) {
        let connectClient = this.client;
        return new Promise(function(resolve, reject){
            connectClient.connect(async err => {
                const db = connectClient.db("ContactDB");
                let result = await db.collection('Contacts').insertOne(contact);
                if(result === undefined)
                    reject(new Error("Error result is undefined"));
                else
                    resolve(JSON.stringify(result.insertedId));
            });                                                
        })
    }

    getById(id) {
        let connectClient = this.client;
        return new Promise(function(resolve, reject){
            connectClient.connect(async err => {
                let find_Id = { contact_id: parseInt(id) };
                console.log(find_Id,typeof(id));
                const db = connectClient.db("ContactDB");
                await db.collection("Contacts").find(find_Id).toArray(function(err, result) {
                    if (err) throw err;
                    if(result === undefined)
                        reject(new Error("Error result is undefined"));
                    else
                        resolve(JSON.stringify(result));   
                });                
            });                                                
        })
    }
}