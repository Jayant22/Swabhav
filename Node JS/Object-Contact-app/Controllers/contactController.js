const ContactService = require("../Services/contactService");

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
		 *         type: number
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

	getContacts = (req, res, next) => {
		this.contactService.getContactList(function(contact_List){
			res.status(200).json(JSON.parse(contact_List));
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
	*           type: integer
	*           required: true
	*       responses:
	*         "200":
	*           description: Success 
	*/

	getContactById = (req, res, next) => {
		this.contactService.getContactByIdFromList(req.params.id,function(contact){
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

	addContact = (req, res, next) => {
		const { contact_id, name, contact_No } = req.body;

		let contact = {
			contact_id: contact_id,
			name: name,
			contact_No: contact_No
	    };
	    this.contactService.addContactToList(contact,function(insertionResult){
			console.log(
				`1 documents were inserted with the _id: ${insertionResult}`,
			);
			res.status(201).json(contact);
		});	
	}
}