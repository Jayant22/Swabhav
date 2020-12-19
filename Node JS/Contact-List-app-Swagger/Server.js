const express = require('express');
const path = require('path');
const app = express();
const fs = require('fs');
const swaggerJsDoc = require('swagger-jsdoc');
const swaggerUI = require('swagger-ui-express');

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

const swaggerOptions = {
  swaggerDefinition: {
    info: {
      title: "Contact API",
      version: '1.0.0',
    },
  },
  apis: ["Server.js"],
};

const swaggerDocs = swaggerJsDoc(swaggerOptions);
app.use('/api-docs', swaggerUI.serve, swaggerUI.setup(swaggerDocs));

app.get('/', function(req,res){
    res.sendFile(path.join(__dirname + '/Index.html'));   
});

/**
 * @swagger
 * /contacts:
 *   get:
 *     description: Get all Contacts
 *     responses:
 *       200:
 *         description: Success
 * 
 */
app.get("/contacts", logStuff, function(req,res){
    res.send(contactList);
});

/**
*  @swagger
*   /contacts/{id}:
*     get:
*       description: Gets a Conatct by id
*       parameters:
*         - in: path
*           name: id
*           type: integer
*           required: true
*       responses:
*         "200":
*           description: Success 
*/

app.get("/contacts/:id", function(req,res){
    let contact = contactList.find(function (item) {
		return item.id == req.params.id;
	});

	contact ? res.status(200).json(contact) : res.sendStatus(404);
});

app.listen(3000, function () {
    console.log("Conatct List App listening on port 3000",);
  });

  