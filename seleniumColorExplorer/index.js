// index.js
const express = require('express');
var fs = require('fs');
const app = express();

app.get('/', (req, res) => {

//  var html = fs.readFileSync('../Reports/ColorExplorer.html', 'utf8')
var path = require('path');
res.sendFile(path.resolve('Reports/ColorExplorer.html'));
});

app.get('/about', (req, res) => { // new
  res.send('RNS Unit Testing.');
});

app.listen(5000, '0.0.0.0',() => console.log('listening on port 5000'));
