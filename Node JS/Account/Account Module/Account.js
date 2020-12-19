const EventEmitter = require('events');

module.exports = class Account extends EventEmitter{
    constructor(){
        super();
        this.balance = 10000;
    }

    withdraw(amount){
        this.balance -= Number(amount);
        this.emit('balanceChange', this.balance);
    }
    deposit(amount){
        this.balance += Number(amount);
        this.emit('balanceChange', this.balance);
    }
}