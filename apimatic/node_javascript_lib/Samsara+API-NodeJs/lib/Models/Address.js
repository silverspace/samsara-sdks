/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of Address
 */
class Address extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.contacts = this.constructor.getValue(obj.contacts);
        this.formattedAddress = this.constructor.getValue(obj.formattedAddress);
        this.geofence = this.constructor.getValue(obj.geofence);
        this.id = this.constructor.getValue(obj.id);
        this.name = this.constructor.getValue(obj.name);
        this.notes = this.constructor.getValue(obj.notes);
        this.tags = this.constructor.getValue(obj.tags);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'contacts', realName: 'contacts', array: true, type: 'Contact' },
            { name: 'formattedAddress', realName: 'formattedAddress' },
            { name: 'geofence', realName: 'geofence', type: 'AddressGeofence' },
            { name: 'id', realName: 'id' },
            { name: 'name', realName: 'name' },
            { name: 'notes', realName: 'notes' },
            { name: 'tags', realName: 'tags', array: true, type: 'TagMetadata' },
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

module.exports = Address;
