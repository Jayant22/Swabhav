function Quiz(questions) {
    this.score = 0;
    this.questions = questions;
    this.questionIndex = 0;
}

Quiz.prototype.getQuestionLegth = function() {
    return this.questions.length;
}

Quiz.prototype.getScore = function() {
    return this.score;
}

Quiz.prototype.getQuestionIndex = function() {
    return this.questions[this.questionIndex];
}
 
Quiz.prototype.guess = function(answer) {
    if(this.getQuestionIndex().isCorrectAnswer(answer)) {
        this.score++;
    }
 
    this.questionIndex++;
}
 
Quiz.prototype.isEnded = function() {
    return this.questionIndex === this.questions.length;
}
 
 
function Question(text, choices, answer) {
    this.text = text;
    this.choices = choices;
    this.answer = answer;
}
 
Question.prototype.isCorrectAnswer = function(choice) {
    return this.answer === choice;
}
 
 
function populate() {
    if(quiz.isEnded()) {
        showScores();
    }
    else {
        // show question
        var element = document.getElementById("question");
        element.innerHTML = quiz.getQuestionIndex().text;
 
        // show options
        var choices = quiz.getQuestionIndex().choices;
        for(var i = 0; i < choices.length; i++) {
            var element = document.getElementById("choice" + i);
            element.innerHTML = choices[i];
            guess("btn" + i, choices[i]);
        }
 
        showProgress();
    }
};
 
function guess(id, guess) {
    var button = document.getElementById(id);
    button.onclick = function() {
        quiz.guess(guess);
        populate();
    }
};
  
function showProgress() {
    var currentQuestionNumber = quiz.questionIndex + 1;
    var element = document.getElementById("progress");
    element.innerHTML = "Question " + currentQuestionNumber + " of " + quiz.questions.length;
};
 
function showScores() {
    var gameOverHTML = "<h1>Result</h1>";
    gameOverHTML += "<h2 id='score'> Your scores: " + quiz.score + "</h2>";
    var element = document.getElementById("quiz");
    element.innerHTML = gameOverHTML;

    let rightAnswers = quiz.getScore();
    let wrongAnswers = quiz.getQuestionLegth() - quiz.getScore();

    const piechartDiv = document.createElement('div');
    piechartDiv.setAttribute('id', 'piechart');
    element.appendChild(piechartDiv);

    google.charts.load('current', {
        'packages': ['corechart']
    });
    google.charts.setOnLoadCallback(drawPieChart);

    function drawPieChart() {
        var charData = google.visualization.arrayToDataTable([
            ['questions', 'Result'],
            ['Right Answers', rightAnswers],
            ['Wrong Answers', wrongAnswers],
        ]);
        
        var options = {'title':`Result Piechart`, 'width':550, 'height':400};
    
        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
        chart.draw(charData, options);
    }

    var strbtn = document.createElement('Button');
    strbtn.setAttribute('id','playAgain');
    strbtn.textContent = 'Take the quiz again';
    element.appendChild(strbtn);

    strbtn.onclick = function(){
        history.go(-1);
    }
};
 
// create questions here
var questions = [
    new Question("Hyper Text Markup Language Stand For?", ["JavaScript", "XHTML","CSS", "HTML"], "HTML"),
    new Question("Which language is used for styling web pages?", ["HTML", "JQuery", "CSS", "XML"], "CSS"),
    new Question("Which is not a JavaScript Framework?", ["Python Script", "JQuery","Django", "NodeJS"], "Django"),
    new Question("Which is used for Connect To Database?", ["PHP", "HTML", "JS", "All"], "PHP"),
    new Question("What is the difference between a jungle and a rain forest?", ["Web Design", "Graphic Design", "SEO & Development", "All"], "All")
];
 
// create quiz
var quiz = new Quiz(questions);

const prevBtn = document.body.getElementById('prevbtn');
 
// display quiz
populate();