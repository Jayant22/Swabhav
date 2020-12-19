var Account = require('../Account Module/Account');
var readline = require('readline-sync');

var accountObj = new Account();

accountObj.on('balanceChange',sendSms);
accountObj.on('balanceChange',sendEmail);

var deposit = readline.question("Enter The Amount To Deposit:: ");
accountObj.deposit(deposit);

var withdraw = readline.question("Enter The Amount To Withdraw:: ");
accountObj.withdraw(withdraw);

function sendSms(balance){
    console.log("\nSending SMS, updated balance: "+balance);
}

function sendEmail(balance){
    console.log("Sending Email, updated balance: "+balance);
    console.log("\n");
}