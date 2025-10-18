var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');
var mongoose = require('mongoose'); // ORM for MongoDB

// Import routes
var indexRouter = require('./routes/index');
const trainingRouter = require('./routes/trainingRouter');

var app = express();

// View engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

// Database connection
const url = 'mongodb://localhost:27017/trainingcenter'; 
mongoose.connect(url)
  .then(() => {
      console.log("Connected correctly to MongoDB server");
  })
  .catch((err) => console.log(err));

// Sends About Page
app.get('/about', function(req, res) {
    res.render('about', { title: 'About Page' });
});

// Sends Help Page
app.get('/help', function(req, res) {
    res.render('help', { title: 'Help Page' });
});

// Routes
app.use('/', indexRouter); // Home page
app.use('/trainings', trainingRouter); // Create/List trainings


// Catch 404 and forward to error handler
app.use(function(req, res, next) {
  next(createError(404));
});

// Error handler
app.use(function(err, req, res, next) {
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  res.status(err.status || 500);
  res.render('error', {
      code: err.status,
      message: err.message
  });
});

module.exports = app;
