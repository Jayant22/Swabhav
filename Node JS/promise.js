function f1(resolve,reject){
    console.log("inside f1()");

    let r1 = Math.random()*10;
    console.log({r1});
    
    if(r1>5){
        console.log("Inside If : ");
        resolve(r1);
    }
    else{
        console.log("Inside Else : ");
        reject(r1);
    }   
}

var promise = new Promise(f1);
console.log({promise});

console.log("promise returned");

promise.then(result => console.log({result})).catch(error => console.log({error}));
        