let count = 0;
let randNumber = Math.floor(Math.random()  * 50) + 1;
let isWin = false;
let atmpLeft = document.getElementById("attemptsLeft");
let child = document.getElementById("child");

console.log(randNumber);

(function() {
    for(let i = 1; i <= 50; i++){
        var btn = document.createElement('button');
        btn.setAttribute('id', 'btn');
        btn.setAttribute('value', i)
        btn.innerHTML = i;
        child.appendChild(btn);
    }

})();

for(let i = 0; i < btn.length; i++) {

    btn[i].addEventListener('click', function(e) {

        if (count == 3) {
            changeButtonColor(e);
            if (e.currentTarget.value != randNumber) {
                cheakResultForWinner();
            }
        } else if (count < 4) {
            changeButtonColor(e);
        }

        atmpLeft.innerHTML = (4 - count);
    })
}

function changeButtonColor(e) {
    if (e.currentTarget.value == randNumber){
        e.currentTarget.style.backgroundColor = "#0074FF";
        isWin = true;
        cheakResultForWinner();
    }
    else if (e.currentTarget.value < randNumber) {
        e.currentTarget.style.backgroundColor = "#17FF00";
        count++;
    } else if (e.currentTarget.value > randNumber) {
        e.currentTarget.style.backgroundColor = "#FF0000";
        count++;
    }
}

function cheakResultForWinner() {

    var para = document.createElement('p');
    var srtbtn = document.createElement('button');
    srtbtn.setAttribute('id','reload');
    srtbtn.setAttribute('onclick','relaod()');
    srtbtn.innerHTML = 'Start Again';
    document.body.appendChild(para);
    if(isWin) {
        para.innerHTML = 'You won the game!!!!!';
    } else {
            para1.innerHTML  = 'Sorry, you lost the game!!!!!';
    }

    document.body.appendChild(srtbtn);

    srtbtn.onclick = function(){
        setTimeout(function(){
            location.reload();
        },100);
    }
}

