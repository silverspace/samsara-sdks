/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of DriverBase
 */
class DriverBase extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.eldAdverseWeatherExemptionEnabled =
          this.constructor.getValue(obj.eldAdverseWeatherExemptionEnabled);
        this.eldBigDayExemptionEnabled = this.constructor.getValue(obj.eldBigDayExemptionEnabled);
        this.eldDayStartHour = this.constructor.getValue(obj.eldDayStartHour);
        this.eldExempt = this.constructor.getValue(obj.eldExempt);
        this.eldExemptReason = this.constructor.getValue(obj.eldExemptReason);
        this.eldPcEnabled = this.constructor.getValue(obj.eldPcEnabled, false);
        this.eldYmEnabled = this.constructor.getValue(obj.eldYmEnabled, false);
        this.externalIds = this.constructor.getValue(obj.externalIds);
        this.groupId = this.constructor.getValue(obj.groupId);
        this.licenseNumber = this.constructor.getValue(obj.licenseNumber);
        this.licenseState = this.constructor.getValue(obj.licenseState);
        this.name = this.constructor.getValue(obj.name);
        this.notes = this.constructor.getValue(obj.notes);
        this.phone = this.constructor.getValue(obj.phone);
        this.username = this.constructor.getValue(obj.username);
        this.vehicleId = this.constructor.getValue(obj.vehicleId);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            {
                name: 'eldAdverseWeatherExemptionEnabled',
                realName: 'eldAdverseWeatherExemptionEnabled',
            },
            { name: 'eldBigDayExemptionEnabled', realName: 'eldBigDayExemptionEnabled' },
            { name: 'eldDayStartHour', realName: 'eldDayStartHour' },
            { name: 'eldExempt', realName: 'eldExempt' },
            { name: 'eldExemptReason', realName: 'eldExemptReason' },
            { name: 'eldPcEnabled', realName: 'eldPcEnabled' },
            { name: 'eldYmEnabled', realName: 'eldYmEnabled' },
            { name: 'externalIds', realName: 'externalIds' },
            { name: 'groupId', realName: 'groupId' },
            { name: 'licenseNumber', realName: 'licenseNumber' },
            { name: 'licenseState', realName: 'licenseState' },
            { name: 'name', realName: 'name' },
            { name: 'notes', realName: 'notes' },
            { name: 'phone', realName: 'phone' },
            { name: 'username', realName: 'username' },
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

module.exports = DriverBase;
