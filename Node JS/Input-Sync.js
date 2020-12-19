var readlineSync = require("readline-sync");

var firstName = readlineSync.question("Enter your First Name::");
var lastName = readlineSync.question("Enter Your Last Name::")

console.log("Hi " + firstName + " " + lastName);