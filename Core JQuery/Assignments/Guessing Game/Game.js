let count = 0;
let randNumber = Math.floor(Math.random()  * 50) + 1;
let isWin = false;

console.log(randNumber);

$(document).ready(function(){

    for(let i = 1; i <= 50; i++){
        $('#child').append('<button id="'+ i +'" class="btn" onclick="buttonClicked(event)" >'+ i +'</button>');
    }
});    

function buttonClicked(event){
    if (count == 3) {
        changeButtonColor(event);
        if (event.currentTarget.id != randNumber) {
            cheakResultForWinner();
        }
    } else if (count < 4) {
        changeButtonColor(event);
    }
    
    $("#attemptsLeft").text(4 - count);
}

function changeButtonColor(e) {
    if (e.currentTarget.id == randNumber){
        e.currentTarget.style.backgroundColor = "#0074FF";
        isWin = true;
        cheakResultForWinner();
    }
    else if (e.currentTarget.id < randNumber) {
        e.currentTarget.style.backgroundColor = "#FF0000";
        count++;
    } else if (e.currentTarget.id > randNumber) {
        e.currentTarget.style.backgroundColor = "#17FF00";
        count++;
    }
}

function cheakResultForWinner() {

    if(isWin) {
        $('body').append('<p>You won the game!!!!!</p>');
    } else {
        $('body').append('<p>Sorry, you lost the game!!!!!</p>');
    }

    $('body').append('<button id="start" onclick="startAgain()">Start Again</button>');

}

function startAgain(){
    setTimeout(function(){
        location.reload();
    },100);
}