const Calc = require('./EventEmitter');

const calcObj = new Calc();

calcObj.on('add_complete',(r) => {
    console.log(r,'Is the Result Of Addition');
})

calcObj.add(10,20);