function f1(){
    console.log("Inside f1");
}
f1()

let f2 = () => {
    console.log("Inside f2");
}

f2()

setTimeout( () => {
    console.log("After 3 seconds");},3000
);