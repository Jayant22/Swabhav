var balance = 10000;

exports.withdraw = function(amount){
    return (balance = Number(balance) - Number(amount));
}

exports.deposit = function(amount){
    return (balance = Number(balance) + Number(amount));
}