/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of Summary
 */
class Summary extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.activeMs = this.constructor.getValue(obj.activeMs);
        this.distanceMiles = this.constructor.getValue(obj.distanceMiles);
        this.driveMs = this.constructor.getValue(obj.driveMs);
        this.driverId = this.constructor.getValue(obj.driverId);
        this.driverName = this.constructor.getValue(obj.driverName);
        this.driverUsername = this.constructor.getValue(obj.driverUsername);
        this.groupId = this.constructor.getValue(obj.groupId);
        this.onDutyMs = this.constructor.getValue(obj.onDutyMs);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'activeMs', realName: 'activeMs' },
            { name: 'distanceMiles', realName: 'distanceMiles' },
            { name: 'driveMs', realName: 'driveMs' },
            { name: 'driverId', realName: 'driverId' },
            { name: 'driverName', realName: 'driverName' },
            { name: 'driverUsername', realName: 'driverUsername' },
            { name: 'groupId', realName: 'groupId' },
            { name: 'onDutyMs', realName: 'onDutyMs' },
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

module.exports = Summary;
