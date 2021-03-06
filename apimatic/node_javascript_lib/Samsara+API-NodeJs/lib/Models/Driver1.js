/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of Driver1
 */
class Driver1 extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.cycleRemaining = this.constructor.getValue(obj.cycleRemaining);
        this.cycleTomorrow = this.constructor.getValue(obj.cycleTomorrow);
        this.driverId = this.constructor.getValue(obj.driverId);
        this.driverName = this.constructor.getValue(obj.driverName);
        this.drivingInViolationCycle = this.constructor.getValue(obj.drivingInViolationCycle);
        this.drivingInViolationToday = this.constructor.getValue(obj.drivingInViolationToday);
        this.dutyStatus = this.constructor.getValue(obj.dutyStatus);
        this.shiftDriveRemaining = this.constructor.getValue(obj.shiftDriveRemaining);
        this.shiftRemaining = this.constructor.getValue(obj.shiftRemaining);
        this.timeInCurrentStatus = this.constructor.getValue(obj.timeInCurrentStatus);
        this.timeUntilBreak = this.constructor.getValue(obj.timeUntilBreak);
        this.vehicleName = this.constructor.getValue(obj.vehicleName);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'cycleRemaining', realName: 'cycleRemaining' },
            { name: 'cycleTomorrow', realName: 'cycleTomorrow' },
            { name: 'driverId', realName: 'driverId' },
            { name: 'driverName', realName: 'driverName' },
            { name: 'drivingInViolationCycle', realName: 'drivingInViolationCycle' },
            { name: 'drivingInViolationToday', realName: 'drivingInViolationToday' },
            { name: 'dutyStatus', realName: 'dutyStatus' },
            { name: 'shiftDriveRemaining', realName: 'shiftDriveRemaining' },
            { name: 'shiftRemaining', realName: 'shiftRemaining' },
            { name: 'timeInCurrentStatus', realName: 'timeInCurrentStatus' },
            { name: 'timeUntilBreak', realName: 'timeUntilBreak' },
            { name: 'vehicleName', realName: 'vehicleName' },
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

module.exports = Driver1;
