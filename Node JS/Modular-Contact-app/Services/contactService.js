module.exports = class ContactService {
    constructor() {
      this.contacts = require("../contactInMemoRepo");
    }
    getContactList() {
      return this.contacts;
    }
  
    addContactToList(contact) {
        this.contacts.push(contact);
    }
  
    getContactIdFromList(id) {
        return this.contacts.find((contact) => {
            return contact.id == id;
        });
    }
};