/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of MechanicOrAgentSignature
 */
class MechanicOrAgentSignature extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.driverId = this.constructor.getValue(obj.driverId);
        this.email = this.constructor.getValue(obj.email);
        this.mechanicUserId = this.constructor.getValue(obj.mechanicUserId);
        this.name = this.constructor.getValue(obj.name);
        this.signedAt = this.constructor.getValue(obj.signedAt);
        this.type = this.constructor.getValue(obj.type);
        this.username = this.constructor.getValue(obj.username);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'driverId', realName: 'driverId' },
            { name: 'email', realName: 'email' },
            { name: 'mechanicUserId', realName: 'mechanicUserId' },
            { name: 'name', realName: 'name' },
            { name: 'signedAt', realName: 'signedAt' },
            { name: 'type', realName: 'type' },
            { name: 'username', realName: 'username' },
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

module.exports = MechanicOrAgentSignature;