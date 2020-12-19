const readline = require('readline');

let randomNumber = Math.round(Math.random() * 10);
let count = 0;
var terminate;

const terminal = readline.createInterface({
  input : process.stdin,
  output : process.stdout
});

let recursiveAsyncReadLine = function () {
  terminal.question('Guess the number! (1-10): ', function (inputNumber) {
    inputNumber = parseInt(inputNumber);
    if (inputNumber > randomNumber)
      console.log('Guess Number Is Too High!!!');
    if (inputNumber < randomNumber)
      console.log('Guess Number Is Too Low!!!');
    if (inputNumber === randomNumber)
    {
      console.log('Guess Number Is Right!!!');
      console.log('Number Of Attempts Are::', count+1);
      terminal.question('Do You Want To play Again? Y/N', (answer) => {
        if (answer == 'Y' || answer == 'y'){
          randomNumber = Math.round(Math.random() * 10);
          count = 0;
          recursiveAsyncReadLine();
        }
        else{
          console.log("Good Byee!!! Come Again To Play");
          process.exit(0);
        }
      });
    }
    count++;
    recursiveAsyncReadLine();
  });
};

recursiveAsyncReadLine();

terminal.on('close', function(){
  console.log('GOOD BYEEE!')
  process.exit(1);
});



