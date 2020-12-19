const EventEmitter = require('events');
module.exports = class Calc extends EventEmitter {
    constructor(){
        super();
    }
    add(a,b){
        this.emit('add_complete', a + b);
    }
}