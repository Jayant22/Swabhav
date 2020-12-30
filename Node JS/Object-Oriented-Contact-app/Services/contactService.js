const contactDataRepo = require('../ContactDataRepo/MongoDBRepo/DataBaseRepo/contactMongooseDBRepo')

module.exports = class ContactService {
  constructor() {
    this.contactDataRepoObj = new contactDataRepo();
  }

  getContactList() {
    return this.contactDataRepoObj.get();
  }

  addContactToList(contact) {
    return this.contactDataRepoObj.add(contact);
  }

  updateContactInList(_id,contact) {
    return this.contactDataRepoObj.update(_id,contact);
  }
  
  searchContactFromList(searchObj) {
    return this.contactDataRepoObj.search(searchObj);
  }

  deleteContact(deleteObj){
    return this.contactDataRepoObj.delete(deleteObj);
  }
};



 