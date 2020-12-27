const mongoose = require('mongoose');
let Contact = require("./contactSchema");
const uri = "mongodb+srv://root:Root@cluster0.caila.mongodb.net/ContactDB?retryWrites=true&w=majority";

module.exports = class mongoDBRepoClass {
    constructor() {
       this._connect();
    }

    _connect() {
        mongoose.connect(uri, { useNewUrlParser: true, useUnifiedTopology: true, useCreateIndex: true, useFindAndModify: false })
            .then(() => {
                console.log('connected to Database');
            }).catch((error) => {
                console.log(error)
            })
    }

    async get(){
        return await Contact.find({});
    }
    
    add(addcontact) {
        return new Contact(addcontact).save();
    };

    async update(id,updateContact){
        return await Contact.updateOne({ _id: id}, updateContact);
    }

    async search(getcontact){
        return await Contact.find(getcontact);
    }

    async delete(deleteContact){
        return await Contact.deleteOne(deleteContact);
    }
}
