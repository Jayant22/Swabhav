const fs = require('fs');
const readline = require('readline');
const class_Obj = require('../Service/service.js');

const movie_Obj = new class_Obj();
let moviesList = [];

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  prompt: 'COMMAND MENU\nlist - List all Movies\nadd - Add the Movie\ndel - Delete a Movie\nfind - Find a Movie\nexit - Exit Program\n\nCommand:: '
});

rl.prompt();

rl.on('line', (line) => {
  switch (line.trim()) {
    case 'add':
        addMovieDataToDatabaseFile();
      break;
    case 'list':
        readMoviesDatabaseFile();
      break;
    case 'del':
        removeMovieDataFromDatabaseFile();
      break;
    case 'find':
        findMovieDataInDatabaseFile();
      break;  
    default:
        console.log("Program Exit");
      break;
  }
  rl.prompt();
});

rl.on('close', () => {
  console.log('Have a great day!');
  process.exit(0);
});

let readMoviesDatabaseFile = function(){
    let index = 0;
    movie_Obj.getMovieList().forEach(function(item) {
        console.log(++index,'.',item.name,'('+item.year+') ','@',item.price);
    });
    console.log("\n");
}
let addMovieDataToDatabaseFile = function(){
  let addMovieItem = {};
  listLength = Object.keys(moviesList).length;
  
  rl.question("Name: ", function(name) {
    rl.question("Year: ", function(year) {
        rl.question("Price: ",function(price){
        movie_Obj.addMovieToList({
            name: name,
            year: year,
            price: price
        });
        console.log(name, 'Was Added');
        // readMoviesDatabaseFile();
        });
    });
  });
}

let removeMovieDataFromDatabaseFile = function(){
  readMoviesDatabaseFile();
  rl.question("Delete::", function(deleteItem){
    let removedItems = movie_Obj.deleteMovieFromList(deleteItem);
    console.log(removedItems.name, 'Was Deleted');
    // readMoviesDatabaseFile();
  });
}

let findMovieDataInDatabaseFile = function(){
  rl.question("Year:", function(searchItem){
        let item = movie_Obj.searchMovieInList(searchItem);
        console.log(item.name,'was released in',item.year);
    });
}
