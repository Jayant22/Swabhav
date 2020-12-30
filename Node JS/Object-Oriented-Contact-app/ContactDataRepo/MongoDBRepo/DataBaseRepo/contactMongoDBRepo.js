const MongoClient = require('mongodb').MongoClient;
const uri = "mongodb+srv://root:Root@cluster0.caila.mongodb.net/ContactDB?retryWrites=true&w=majority";

module.exports = class mongoDBRepoClass {
    constructor() {
        this.client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });
        this.dbName = 'ContactDB';
    }

    connect(){
        return new Promise((resolve, reject) => {
            this.client.connect(error => {
              if (error) reject(error);
              resolve(this.client.db(this.dbName));
            });
        });
    }

    async get(){
        let results = [];
        return this.connect().then(async db => {
            let collection = db.collection('Contacts').find();
            await collection.forEach(data =>{
                results.push(data);
            });
            return JSON.stringify(results);
        })
    }

    async add(contact) {
        return this.connect().then(async db => {
            let result = await db.collection('Contacts').insertOne(contact);
            return JSON.stringify(result.insertedId);
        })
    }

    async getById(searchObj) {
        let contact = [];
        return this.connect().then(async db => {
            let collection = db.collection('Contacts').find(searchObj);
            await collection.forEach(data =>{
                contact.push(data);
            });
            this.client.close();
            return JSON.stringify(contact);
        })
    }
}