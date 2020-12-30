const express = require("express"),
      bodyParser = require("body-parser"),
      swaggerJsDoc = require("swagger-jsdoc"),
      multer = require('multer'),
      swaggerUI = require("swagger-ui-express"),
      path = require('path'),
      ContactController = require('./Controllers/contactController'),
      UserController = require('./Controllers/userController');

const contactCtrl = new ContactController();
const app = express();

app.use(bodyParser.json({limit: '1mb'}));
app.use(bodyParser.urlencoded({limit: '1mb', extended: true}));

app.use(express.static(__dirname + '/Public')); 

app.use(bodyParser.json());

var storage = multer.diskStorage({
  destination: function (req, file, cb) {
    cb(null, './Uploads')
  },
  filename: function (req, file, cb) {
    cb(null, file.fieldname + '-' + Date.now() + path.extname(file.originalname));
  }
})
 
var upload = multer({ storage: storage })

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
  res.sendFile(path.join(__dirname + '/Public/contactDetails.html'));   
});

app.get('/api/contacts', contactCtrl.getContacts);

app.get('/api/contact/:id', contactCtrl.getContactById);

app.post('/api/contacts/add', upload.single('file'), contactCtrl.processRequest, contactCtrl.processImage, contactCtrl.addContact); 

app.get('/api/contact', contactCtrl.searchContact);

app.delete('/api/contacts/delete', contactCtrl.deleteContact);

app.post('/api/contacts/update', upload.single('file'), contactCtrl.processRequest, contactCtrl.processImage, contactCtrl.updateContact); 
    
app.listen(5000, function () {
  console.log("Example app listening on port http://localhost:5000/");
});
