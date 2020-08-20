function drawChart() {
    let rightAnswers = 0;
    let wrongAnswers = 0;
    var quiz = new Quiz();
    
    const myDiv = document.body.getElementById('quiz');
    const piechartDiv = document.createElement('div');
    piechartDiv.setAttribute('id', 'piechart');

    myDiv.appendChild(piechartDiv);

    rightAnswers = quiz.getScore();
    wrongAnswers = quiz.getQuestionLegth() - quiz.getScore(); 

    console.log(rightAnswers, wrongAnswers);

    // getting the piechart
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
}