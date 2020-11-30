const express = require('express');
const app = express();
const path = require('path');

app.use(express.static(__dirname + '/dist/acme-product-management'));

app.get('/*', function(req, res) {
    // res.sendFile(path.join(__dirname + '/dist/acme-product-management/index.html'));
    res.set("Content-Security-Policy", "'self' data:", "'self' 'unsafe-inline'");
    res.sendFile('index.html', {root: 'dist/acme-product-management/'});
});

app.disable('ETag');

app.listen(process.env.PORT || 5000);

console.log('server started ' + __dirname);