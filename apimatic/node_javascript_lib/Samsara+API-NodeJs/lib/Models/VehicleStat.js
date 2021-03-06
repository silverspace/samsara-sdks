/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of VehicleStat
 */
class VehicleStat extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.auxInput1 = this.constructor.getValue(obj.auxInput1);
        this.auxInput2 = this.constructor.getValue(obj.auxInput2);
        this.engineState = this.constructor.getValue(obj.engineState);
        this.vehicleId = this.constructor.getValue(obj.vehicleId);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'auxInput1', realName: 'auxInput1', type: 'AuxInputSeries' },
            { name: 'auxInput2', realName: 'auxInput2', type: 'AuxInputSeries' },
            { name: 'engineState', realName: 'engineState', array: true, type: 'EngineState' },
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

module.exports = VehicleStat;
