const ContactService = require("../Services/contactService");
var fs = require('fs');
const { Buffer } = require("buffer");

module.exports = class contactController{
	constructor(){
		this.contactService = new ContactService();
		/**
		 * @swagger
		 *
		 * definitions:
		 *   NewContact:
		 *     type: object
		 *     required:
		 *       - name
		 *       - contact_No
		 *     properties:
		 *       contact_id:
		 *         type: string
		 *       name:
		 *         type: string
		 *       contact_No:
		 *         type: number
		 *   Contact:
		 *     allOf:
		 *       - $ref: '#/definitions/NewContact'
		 */ 
	}

	/**
	 * @swagger
	 * /api/contacts:
	 *   get:
	 *     summary: Retrieve a list of Contacts
	 *     description: Retrieve a list of contact from Memory Repo
	 *     produces:
	 *      - application/json
	 *     responses:
	 *       200:
	 *         description: A list of contacts.
	 *         schema:
	 *           type: array
	 *           items:
	 *             $ref: '#/definitions/Contact'
	 */

	getContacts = (req, res) => {
		this.contactService.getContactList().then(contact_List => {
			res.status(200).json(contact_List);
		}).catch(err => {
			console.log("Promise rejection error: "+err);
			res.status(404).send(err);   
		});
	}

	/**
	*  @swagger
	*   /api/contact/{id}:
	*     get:
	*       summary: Retrieve a particular id of Contacts
	*       description: Gets a Conatct by id
	*       parameters:
	*         - in: path
	*           name: id
	*           type: string
	*           required: true
	*       responses:
	*         "200":
	*           description: Success 
	*/

	getContactById = (req, res) => {
		this.contactService.searchContactFromList(req.params.id,function(contact){
			contact ? res.status(200).json(contact) : res.sendStatus(404);
		});		
	}

	/**
	 * @swagger
	 *
	 * /api/contacts:
	 *   post:
	 *     summary: This Create a New Contact
	 *     description: Creates a Contact
	 *     produces:
	 *       - application/json
	 *     parameters:
	 *       - name: contact
	 *         description: contact object
	 *         in:  body
	 *         required: true
	 *         type: string
	 *         schema:
	 *           $ref: '#/definitions/NewContact'
	 *     responses:
	 *       200:
	 *         description: Contacts
	 *         schema:
	 *           $ref: '#/definitions/Contact'
	 */

	addContact = (req, res) => {
		console.log(req.body);
	    this.contactService.addContactToList(req.body).then(insertionResult => {
			console.log(
				`1 documents were inserted with the _id: ${insertionResult._id}`,   
			);
			res.status(200).json(req.body);
		}).catch(err => {
			console.log("Promise rejection error: "+err);
			res.status(404).send(err);   
		});
	}

	updateContact = async (req, res) => {
		// let imageData,imgType;
		// if (req.file == undefined) {
		// 	await this.contactService.searchContactFromList({ _id: req.body._id }).then(function(contact){
		// 		imageData = contact[0].imageSrc.imgData;
		// 		imgType = contact[0].imageSrc.contentType;
		// 	});
		// }else{
		// 	imageData = new Buffer.from(fs.readFileSync(req.file.path).toString('base64'), 'base64');
		// 	imgType = req.file.mimetype;
		// }	
		// let contact = {
		// 	firstName: req.body.firstName,
		// 	lastName: req.body.lastName,
		// 	address: {
		// 		permanent: {
		// 			building: req.body.permanentBuilding,
		// 			street: req.body.permanentStreet
		// 		},
		// 		correspondence: {
		// 			building: req.body.correspondenceBuilding,
		// 			street: req.body.correspondenceStreet
		// 		},
		// 		city: req.body.city,
		// 		state: req.body.state,
		// 		zip: req.body.zip
		// 	},
		// 	imageSrc: {
		// 		imgData: imageData,
		// 		contentType: imgType
		// 	},
		// 	contact_No: req.body.Contact_No
		// }
		console.log(req.body);
		let id = req.body._id;
    	delete req.body._id;
	    this.contactService.updateContactInList(id, req.body).then(updataionResult => {
			console.log(
				`${updataionResult.nModified} documents were Updated`,   
			);
			res.status(200 ).json(req.body);
		}).catch(err => {
			console.log("Promise rejection error: "+err);
			res.status(404).send(err);   
		});
	}

	searchContact = (req,res) => {
		console.log(req.query);
		this.contactService.searchContactFromList(req.query).then(function(contact){
			contact ? res.status(200).json(contact) : res.sendStatus(404);
		}).catch(err => {
			console.log("Promise rejection error: "+err);
			res.status(404).send(err);   
		});
	}

	deleteContact = (req,res) => {
		this.contactService.deleteContact(req.query).then(deletedContact => {
			console.log(
				`${deletedContact.deletedCount} documents were Deleted`,   
			);
			res.status(200).json(req.query);
		}).catch(err => {
			console.log("Promise rejection error: "+err);
			res.status(404).send(err);   
		});    
	}

	processRequest = (req, res, next) => {
		delete req.body.file;
		for (let property in req.body) {
		  	req.body[property] = JSON.parse(req.body[property]);
		}
		delete req.body.$$hashKey;
		next();
	};
	
	processImage = (req, res, next) => {
		if (req.file) {
			req.body.imageSrc = {
				imgData: new Buffer.from(fs.readFileSync(req.file.path).toString('base64'), 'base64'),
				contentType: req.file.mimetype,
			};
		}
		next();
	};
}