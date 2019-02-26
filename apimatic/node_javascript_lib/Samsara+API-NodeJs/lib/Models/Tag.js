/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of Tag
 */
class Tag extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.addresses = this.constructor.getValue(obj.addresses);
        this.assets = this.constructor.getValue(obj.assets);
        this.drivers = this.constructor.getValue(obj.drivers);
        this.groupId = this.constructor.getValue(obj.groupId);
        this.id = this.constructor.getValue(obj.id);
        this.machines = this.constructor.getValue(obj.machines);
        this.name = this.constructor.getValue(obj.name);
        this.parentTagId = this.constructor.getValue(obj.parentTagId);
        this.sensors = this.constructor.getValue(obj.sensors);
        this.vehicles = this.constructor.getValue(obj.vehicles);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'addresses', realName: 'addresses', array: true, type: 'TaggedAddress' },
            { name: 'assets', realName: 'assets', array: true, type: 'TaggedAsset' },
            { name: 'drivers', realName: 'drivers', array: true, type: 'TaggedDriver' },
            { name: 'groupId', realName: 'groupId' },
            { name: 'id', realName: 'id' },
            { name: 'machines', realName: 'machines', array: true, type: 'TaggedMachine' },
            { name: 'name', realName: 'name' },
            { name: 'parentTagId', realName: 'parentTagId' },
            { name: 'sensors', realName: 'sensors', array: true, type: 'TaggedSensor' },
            { name: 'vehicles', realName: 'vehicles', array: true, type: 'TaggedVehicle' },
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

module.exports = Tag;