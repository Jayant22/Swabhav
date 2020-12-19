const express = require("express");
const app = express();
const ContactService = require("../Services/contactService");

const contactService = new ContactService();

/**
 * @swagger
 *
 * definitions:
 *   NewContact:
 *     type: object
 *     required:
 *       - id
 *       - name
 *     properties:
 *       id:
 *         type: number
 *       name:
 *         type: string
 *   Contact:
 *     allOf:
 *       - $ref: '#/definitions/NewContact'
 */

/**
 * @swagger
 * /contacts:
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

app.get("/", function (req, res) {
	res.status(200).json(contactService.getContactList());
});

/**
*  @swagger
*   /contacts/{id}:
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

app.get("/:id", function (req, res) {
    let contact = contactService.getContactIdFromList(req.params.id);
    console.log(contact);
	contact ? res.status(200).json(contact) : res.sendStatus(404);
});

/**
 * @swagger
 *
 * /contacts:
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

app.post("/", function (req, res) {
	const { id, name } = req.body;

	let contact = {
		id: id,
		name: name,
    };
    contactService.addContactToList(contact);
	res.status(201).json(contact);
});

module.exports = app;