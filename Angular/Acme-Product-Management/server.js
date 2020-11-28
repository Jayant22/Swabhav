const express = require('express');
const app = express();
const path = require('path');

app.use(express.static(__dirname + '/dist/acme-modular-app/'));

app.get('/*', function(req, res) {
    // res.sendFile(path.join(__dirname + '/dist/acme-modular-app/index.html'));
    res.setHeader('Last-Modified', (new Date()).toUTCString());
    res.sendFile('index.html', {root: 'dist/acme-modular-app/'}
);
});

app.disable('ETag');

app.listen(process.env.PORT || 8080);

console.log('server started ' + __dirname);