/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of Document
 */
class Document extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.documentType = this.constructor.getValue(obj.documentType);
        this.driverCreatedAtMs = this.constructor.getValue(obj.driverCreatedAtMs);
        this.driverId = this.constructor.getValue(obj.driverId);
        this.fields = this.constructor.getValue(obj.fields);
        this.vehicleId = this.constructor.getValue(obj.vehicleId);
        this.dispatchJobId = this.constructor.getValue(obj.dispatchJobId);
        this.notes = this.constructor.getValue(obj.notes);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'documentType', realName: 'documentType' },
            { name: 'driverCreatedAtMs', realName: 'driverCreatedAtMs' },
            { name: 'driverId', realName: 'driverId' },
            { name: 'fields', realName: 'fields', array: true, type: 'DocumentField' },
            { name: 'vehicleId', realName: 'vehicleId' },
            { name: 'dispatchJobId', realName: 'dispatchJobId' },
            { name: 'notes', realName: 'notes' },
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

module.exports = Document;
