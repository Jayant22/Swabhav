const express = require('express');
const app = express();
const path = require('path');

app.use(express.static(__dirname + '/dist/student-api'));

app.get('/*', function(req, res) {
    res.setHeader("Content-Security-Policy", "'self' data:", "'self' 'unsafe-inline'");
    res.sendFile(path.join(__dirname + '/dist/student-api/index.html'));
    // res.sendFile('index.html', {root: 'dist/student-api/'}
});

app.disable('ETag');

app.listen(process.env.PORT || 8080);

console.log('server started ' + __dirname);