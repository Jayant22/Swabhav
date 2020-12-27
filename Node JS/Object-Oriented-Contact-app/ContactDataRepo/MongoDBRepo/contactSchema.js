const mongoose = require('mongoose');

let contactSchema = mongoose.Schema({
    
    firstName: {
        type: String,
        // required: [true, "can't be blank"], 
        // match: [/^[a-zA-Z0-9]+$/, 'is invalid']
    },

    lastName: String,

    address: {

        permanent: {
            building: {
                type: String
            },
            street: {
                type: String
            }
        },
        correspondence: {
            building: {
                type: String
            },
            street: {
                type: String
            }
        },
        city: {
            type: String,
            // required: [true, "can't be blank"],
        },
        state: {
            type: String,
            // required: [true, "can't be blank"], 
        },
        zip: {
            type: String,
            // required: [true, "can't be blank"],
        }
    },
    imageSrc: {
        imgData: Buffer,
        contentType: String
    },

    contact_No: {
        type: String,
        // required: [true, "can't be blank"],
    }    
}, { versionKey: false });

module.exports = new mongoose.model('Contact', contactSchema);