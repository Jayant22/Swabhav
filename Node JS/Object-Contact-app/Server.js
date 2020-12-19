const express = require("express"),
      bodyParser = require("body-parser"),
      swaggerJsDoc = require("swagger-jsdoc"),
      swaggerUI = require("swagger-ui-express"),
      path = require('path'),
      controller = require('./Controllers/contactController');

const contactCtrl = new controller();
const app = express();
app.use(bodyParser.urlencoded({ extended : true  }));

app.use(express.static(__dirname + '/Public')); 

app.use(bodyParser.json());

const swaggerOptions = {
    swaggerDefinition: {
      info: {
        title: "Contact API",
        version: '1.0.0',
      },
    },
    apis: ['./Controllers/contactController.js'],
  };
  
const swaggerDocs = swaggerJsDoc(swaggerOptions);
app.use('/api-docs', swaggerUI.serve, swaggerUI.setup(swaggerDocs, { explorer: true }));

app.get('/', function(req,res){
  res.sendFile(path.join(__dirname + '/Presentation/Index.html'));   
});

app.get('/api/contacts', contactCtrl.getContacts);

app.get('/api/contact/:id', contactCtrl.getContactById);

app.post('/api/contacts', contactCtrl.addContact);



app.listen(5000, function () {
    console.log("Example app listening on port http://localhost:5000/");
});
