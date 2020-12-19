function Account (){
    this.balance = 10000;

};
Account.prototype.withdraw = function withdraw(amount){
    this.balance = Number(this.balance) - Number(amount);
    return this.balance; 
};

Account.prototype.deposit = function deposit(amount){
    this.balance = Number(this.balance) + Number(amount)
    return this.balance
};

module.exports = Account;

