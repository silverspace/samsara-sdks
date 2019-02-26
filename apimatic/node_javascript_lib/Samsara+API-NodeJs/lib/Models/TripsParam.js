/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of TripsParam
 */
class TripsParam extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.endMs = this.constructor.getValue(obj.endMs);
        this.groupId = this.constructor.getValue(obj.groupId);
        this.startMs = this.constructor.getValue(obj.startMs);
        this.vehicleId = this.constructor.getValue(obj.vehicleId);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'endMs', realName: 'endMs' },
            { name: 'groupId', realName: 'groupId' },
            { name: 'startMs', realName: 'startMs' },
            { name: 'vehicleId', realName: 'vehicleId' },
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

module.exports = TripsParam;