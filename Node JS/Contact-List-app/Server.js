const express = require('express');
const path = require('path');
const app = express();
const fs = require('fs');

const CONTACT_DB_FILE = 'contacts.json';
let contactList = [];

fs.readFile(CONTACT_DB_FILE, (err, data) => {
    if (err) throw err;
    contactList = JSON.parse(data);
});

function logRequestTime(req, res, next){
    console.log('Time:', Date.now())
    next()
}

function logOriginalUrl (req, res, next) {
    console.log('Request URL:', req.originalUrl)
    next()
}

function logMethod (req, res, next) {
console.log('Request Type:', req.method)
next()
}

var logStuff = [logOriginalUrl, logMethod, logRequestTime];

app.get('/', function(req,res){
    res.sendFile(path.join(__dirname + '/Index.html'));   
});

app.get("/contacts", logStuff, function(req,res){
    res.send(contactList);
});

app.get("/contacts/:id", function(req,res){
    res.send(
        contactList.find((contact) => {
          return contact.id == req.params.id;
        })
    );
});

app.listen(5000, function () {
    console.log("Conatct List App listening on port 5000",);
  });
