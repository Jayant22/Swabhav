const express = require("express");
const app = express();
const pug = require("pug");
const path = require("path");
const bodyParser = require("body-parser");
const compiledFunction = pug.compileFile("auth.pug");

app.use(bodyParser.urlencoded({ extended: true }));

app.get('/', function(req,res){
    res.sendFile(path.join(__dirname + '/Index.html'));   
});

app.get("/auth.pug", (req, res) => {
  console.log(req.query);
  let responseFile = compiledFunction({
    username: req.query.username,
    password: req.query.password,
  });
  res.send(responseFile);
});

app.post("/auth.pug", (req, res) => {
    console.log(req.body);
    let responseFile = compiledFunction({
        username: req.body.username,
        password: req.body.password,
    });
    res.send(responseFile);
});

app.listen(3000, function () {
  console.log("Example app listening on port http://localhost:3000/");
});
