const mongoose = require('mongoose');
const Schema = mongoose.Schema;

require('mongoose-currency').loadType(mongoose);
const Currency = mongoose.Types.Currency;

const trainingSchema = new Schema({
    name: {
        type: String,
        required: true,
    },
    identification: {
        type: String,
        required: true,
        maxlength: 10
    },
    date: {
        type: Date,
        required: true,
        default: Date.now
    },
    time: {
        type: String,
        required: true,
    },
    card_no: {
        type: String,
        required: true,
        minlength: 12,
        maxlength: 19
    },
    card_date: {
        type: String,
        required: true
    },
    cvv: {
        type: String,
        required: true,
        minlength: 3,
        maxlength: 4
    },

}, {
    timestamps: true
});

var Training = mongoose.model('Training', trainingSchema);
module.exports = Training;
