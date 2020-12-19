const express = require("express"),
      bodyParser = require("body-parser"),
      swaggerJsDoc = require("swagger-jsdoc"),
      swaggerUI = require("swagger-ui-express"),
      path = require('path');

const app = express();
app.use(bodyParser.urlencoded({ extended : true  }));

app.use(bodyParser.json());

const swaggerOptions = {
    swaggerDefinition: {
      info: {
        title: "Contact API",
        version: '1.0.0',
      },
    },
    apis: ["contactController.js"],
  };
  
const swaggerDocs = swaggerJsDoc(swaggerOptions);
app.use('/api-docs', swaggerUI.serve, swaggerUI.setup(swaggerDocs, { explorer: true }));

app.get('/', function(req,res){
    res.sendFile(path.join(__dirname + '/Index.html'));   
});

app.use("/contacts", require("./Controllers/contactController"));

app.listen(5000, function () {
    console.log("Example app listening on port http://localhost:5000/");
});
