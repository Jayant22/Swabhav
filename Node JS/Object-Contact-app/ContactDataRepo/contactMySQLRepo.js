let mysql = require('mysql');

module.exports = class mySQLRepoClass{
    constructor(){
        this.connection = mysql.createConnection({
            host: 'localhost',
            user: 'root',
            password: 'Root',
            database: 'contactdb'
        });
        this.connection.connect(function(err) {
            if (err) throw err;
            console.log("Connected!");    
        });   
    }
    
    get(){
        let connect = this.connection;
        return new Promise(function(resolve, reject){
            connect.query("SELECT * FROM Contacts", function(error, results) {
                if (error)  throw error;
                if(results === undefined)
                    reject(new Error("Error result is undefined"));
                else
                    resolve(JSON.stringify(results));
            });                                                
        })
    }

    add(contact){
        let connect = this.connection;
        return new Promise(function(resolve, reject){
            connect.query("INSERT INTO Contacts SET ?", contact, function (error, results, fields) {
                if (error) throw error;
                console.log("1 record inserted");
                if(results === undefined)
                    reject(new Error("Error result is undefined"));
                else
                    resolve(results.insertId);
            });                                               
        })
    }

    getById(id){
        let connect = this.connection;
        return new Promise(function(resolve, reject){
            connect.query("SELECT * FROM Contacts WHERE id = ?", [id], function(error, results) {
                if (error)  throw error;
                if(results === undefined)
                    reject(new Error("Error result is undefined"));
                else
                    resolve(JSON.stringify(results));
            });                                                
        })
    }
}