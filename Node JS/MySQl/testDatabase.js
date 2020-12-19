let mysql = require('mysql');

let connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'Root',
    database: 'swabhavdb'
});

connection.connect(function(err) {
    if (err) throw err;
    console.log("Connected!");
    var create = "CREATE TABLE Student (Id INT(12), Name VARCHAR(255), Roll_No INT(12))";
    connection.query(create, function (err, result) {
        if (err) throw err;
        console.log("Table created");
    });
    var insert = "INSERT INTO Student (Id, Name, Roll_No) VALUES (2, 'Paras', 101)";
    connection.query(insert, function (err, result) {
        if (err) throw err;
        console.log("1 record inserted");
    });
    connection.query("SELECT * FROM Student WHERE Id = '1'", function (err, result) {
        if (err) throw err;
        console.log(result);
    });
    var update = "UPDATE Student SET Roll_No = '102' WHERE Name = 'Paras'";
    connection.query(update, function (err, result) {
        if (err) throw err;
        console.log(result.affectedRows + " record(s) updated");
    });
    connection.query("SELECT * FROM Student", function (err, result, fields) {
        if (err) throw err;
        console.log(result);
    });
});
