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

    //Using Escape Keyword
    var studentId = '1';
    var sql = "SELECT * FROM Student WHERE id = ? ";
 
    connection.query(sql, [studentId], function(error, results, fields) {
        if (error)  throw error;
        console.log(results);
    });
    
    // Expoiting the SQL Injection 
    var insert = "INSERT INTO Student (Id, Name, Roll_No) VALUES (3, 'Shailesh', 103)";
    connection.query(insert, function (err, result) {
        if (err) throw err;
        console.log("1 record inserted");
    });

    //Prevention Using Escaping query values
    var student  = {id: 5, Name: 'Pawan', Roll_No: 105};
    var query = connection.query('INSERT INTO Student SET ?', student, function (error, results, fields) {
        if (error) throw error;
        console.log("1 record inserted");
    });
    console.log(query.sql);    
});