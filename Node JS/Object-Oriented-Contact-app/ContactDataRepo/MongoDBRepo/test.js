const contactDataRepo = require('./contactMongoRepo');
var fs = require('fs');
var path = require('path');

// let kaushik = {
//   name: {
//     firstName: "Jayant",
//     lastName: "Kodam"
//   },
//   address: [
//     {
//         city: "Mumbai",
//         state: "Maharastra",
//     },
//     {
//         city: "Solapur",
//         state: "Maharastra",
//     }],
//   contact_No: 123456789
// }

// let jayant = {
//     _id: "5fe215b7071f53532498f26c"
// } 

// var newImg = fs.readFileSync('../../Public/Upload/Logo.jpg');
// var encImg = newImg.toString('base64');

var img = ""

let newObj = {
  name: {
    firstName: "Jayant",
    lastName: "Kodam"
  },
  address: [
    {
        city: "Mumbai",
        state: "Maharastra",
    },
    {
        city: "Solapur",
        state: "Maharastra",
    }],
  imgData: img ,
  contact_No: 123456789
}

let m = new contactDataRepo();

m.add(newObj).then((res => console.log("in add test",res)));

// m.get().then((res => console.log("in get test",res)));

// m.getById(jayant).then((res => {
//     console.log("get id:",res)
//     console.log(res[0].address[0],res[0].address[1]);
// }));

// m.delete(jayant).then((res => console.log(res.deletedCount)));