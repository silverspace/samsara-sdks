/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of DriverSafetyScoreResponse
 */
class DriverSafetyScoreResponse extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.crashCount = this.constructor.getValue(obj.crashCount);
        this.driverId = this.constructor.getValue(obj.driverId);
        this.harshAccelCount = this.constructor.getValue(obj.harshAccelCount);
        this.harshBrakingCount = this.constructor.getValue(obj.harshBrakingCount);
        this.harshEvents = this.constructor.getValue(obj.harshEvents);
        this.harshTurningCount = this.constructor.getValue(obj.harshTurningCount);
        this.safetyScore = this.constructor.getValue(obj.safetyScore);
        this.safetyScoreRank = this.constructor.getValue(obj.safetyScoreRank);
        this.timeOverSpeedLimitMs = this.constructor.getValue(obj.timeOverSpeedLimitMs);
        this.totalDistanceDrivenMeters = this.constructor.getValue(obj.totalDistanceDrivenMeters);
        this.totalHarshEventCount = this.constructor.getValue(obj.totalHarshEventCount);
        this.totalTimeDrivenMs = this.constructor.getValue(obj.totalTimeDrivenMs);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'crashCount', realName: 'crashCount' },
            { name: 'driverId', realName: 'driverId' },
            { name: 'harshAccelCount', realName: 'harshAccelCount' },
            { name: 'harshBrakingCount', realName: 'harshBrakingCount' },
            {
                name: 'harshEvents',
                realName: 'harshEvents',
                array: true,
                type: 'SafetyReportHarshEvent',
            },
            { name: 'harshTurningCount', realName: 'harshTurningCount' },
            { name: 'safetyScore', realName: 'safetyScore' },
            { name: 'safetyScoreRank', realName: 'safetyScoreRank' },
            { name: 'timeOverSpeedLimitMs', realName: 'timeOverSpeedLimitMs' },
            { name: 'totalDistanceDrivenMeters', realName: 'totalDistanceDrivenMeters' },
            { name: 'totalHarshEventCount', realName: 'totalHarshEventCount' },
            { name: 'totalTimeDrivenMs', realName: 'totalTimeDrivenMs' },
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

module.exports = DriverSafetyScoreResponse;