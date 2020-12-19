const contactDataRepo = require('../ContactDataRepo/contactMongoDBRepo')

module.exports = class ContactService {
  constructor() {
    this.contactDataRepoObj = new contactDataRepo();
  }

  getContactList(callback) {
    this.contactDataRepoObj.get()
      .then(function(results){
        return callback(results);
      })
      .catch(function(err){
        console.log("Promise rejection error: "+err);
      })
  }

  addContactToList(contact,callback) {
    this.contactDataRepoObj.add(contact)
      .then(function(results){
        return callback(results);
      })
      .catch(function(err){
        console.log("Promise rejection error: "+err);
      })
  }

  getContactByIdFromList(id,callback) {
    this.contactDataRepoObj.getById(id)
      .then(function(results){
        console.log(results);
        return callback(JSON.parse(results));
      })
      .catch(function(err){
        console.log("Promise rejection error: "+err);
      })
  }
};



 