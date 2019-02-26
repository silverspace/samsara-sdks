/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of Contact
 */
class Contact extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.email = this.constructor.getValue(obj.email);
        this.firstName = this.constructor.getValue(obj.firstName);
        this.id = this.constructor.getValue(obj.id);
        this.lastName = this.constructor.getValue(obj.lastName);
        this.phone = this.constructor.getValue(obj.phone);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'email', realName: 'email' },
            { name: 'firstName', realName: 'firstName' },
            { name: 'id', realName: 'id' },
            { name: 'lastName', realName: 'lastName' },
            { name: 'phone', realName: 'phone' },
        ]);
    }

    /**
     * Function containing information about discriminator values
     * mapped with their corresponding model class names
     *
     * @return   {object}  Object containing Key-Value pairs mapping discriminator
     *                     values with their corresponding model classes
     */
    static discriminatorMap() {
        return {};
    }
}

module.exports = Contact;