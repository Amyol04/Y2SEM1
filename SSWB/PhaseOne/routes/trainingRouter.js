// this creates and stores the new training bookings. 

const express = require('express');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');

const Training = require('../models/training');


const trainingRouter = express.Router();

trainingRouter.route('/')
.get((req,res,next) => {
    res.end("Hello")
})


// creating the booking
trainingRouter.route('/create')
.get((req,res,next) =>{
    res.render('newtraining.ejs', {title: 'New Training'})
})


.post((req, res, next) => {
    Training.create(req.body) // the model.create creates a single or multiple documents
    .then((trainingcreated) => { // the request body contains the info of the training
        Training.find() // to check if there are any trainings
        .then((trainingsfound) => { // if there are trainings, they are stored in trainingsfound
            res.render('traininglist', { 'traininglist': trainingsfound, title: 'All Trainings' }); // displays all trainings. 
        }, (err) => next(err))
        .catch((err) => next(err));
    }, (err) => next(err))
    .catch((err) => next(err));
})

module.exports = trainingRouter;
