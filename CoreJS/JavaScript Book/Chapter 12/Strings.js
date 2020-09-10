
function charAt() {
    var myString = 'jQuery FTW!!!';
    console.log(myString.charAt(7));
}
function concat() {
    var message="Sam"
    var final=message.concat(" is a"," hopeless romantic.")
    //alerts "Sam is a hopeless romantic."
    console.log(message)
    console.log(final)
}
function indexOf() {
    var sentence="Hi, my name is Sam!"
    if (sentence.indexOf("Sam")!=-1)
    console.log("Sam is in there!")
}
function match() {
    //match(regexp) //select integers only
    var intRegex = /[0-9 -()+]+$/;  
 
    var myNumber = '999';
    var myInt = myNumber.match(intRegex);
    console.log(myInt);
    //output: 999
}
function replace() {
    var myString = '999 JavaScript Coders';
    console.log(myString.replace(/JavaScript/i, "jQuery"));
    
}
function slice() {
    var text="excellent"
    console.log(text.slice(0,4))  //returns "exce"
    console.log(text.slice(2,4)) //returns "ce"
    
}
function split() {
    //split(delimiter)
    var message="Welcome to jQuery4u"
    //word[0] contains "We"
    //word[1] contains "lcome to jQuery4u"
    var word = message.split("l")
    console.log(word)
}
function substring() {
    var myString = 'javascript rox';
    myString = myString.substring(0,10);
    console.log(myString)
}
function repeat() {
    var string = "Welcome to Edureka";
    console.log(string.repeat(2));  
}
function trim() {
    var str = "     Hello Swabhav!     ";
    console.log(str.trim());
}

charAt();
concat();
indexOf();
match();
replace();
slice();
split();
substring();
repeat();
trim();