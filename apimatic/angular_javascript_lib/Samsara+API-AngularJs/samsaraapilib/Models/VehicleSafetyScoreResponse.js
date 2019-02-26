/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of VehicleSafetyScoreResponse
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('VehicleSafetyScoreResponse', ['BaseModel', VehicleSafetyScoreResponseModel]);

    function VehicleSafetyScoreResponseModel(BaseModel) {
        var VehicleSafetyScoreResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.crashCount = this.getValue(obj.crashCount);
            this.harshAccelCount = this.getValue(obj.harshAccelCount);
            this.harshBrakingCount = this.getValue(obj.harshBrakingCount);
            this.harshEvents = this.getValue(obj.harshEvents);
            this.harshTurningCount = this.getValue(obj.harshTurningCount);
            this.safetyScore = this.getValue(obj.safetyScore);
            this.safetyScoreRank = this.getValue(obj.safetyScoreRank);
            this.timeOverSpeedLimitMs = this.getValue(obj.timeOverSpeedLimitMs);
            this.totalDistanceDrivenMeters = this.getValue(obj.totalDistanceDrivenMeters);
            this.totalHarshEventCount = this.getValue(obj.totalHarshEventCount);
            this.totalTimeDrivenMs = this.getValue(obj.totalTimeDrivenMs);
            this.vehicleId = this.getValue(obj.vehicleId);
        };

        VehicleSafetyScoreResponse.prototype = new BaseModel();
        VehicleSafetyScoreResponse.prototype.constructor = VehicleSafetyScoreResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        VehicleSafetyScoreResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'crashCount', realName: 'crashCount' },
                { name: 'harshAccelCount', realName: 'harshAccelCount' },
                { name: 'harshBrakingCount', realName: 'harshBrakingCount' },
                { name: 'harshEvents', realName: 'harshEvents', array: true, type: 'SafetyReportHarshEvent' },
                { name: 'harshTurningCount', realName: 'harshTurningCount' },
                { name: 'safetyScore', realName: 'safetyScore' },
                { name: 'safetyScoreRank', realName: 'safetyScoreRank' },
                { name: 'timeOverSpeedLimitMs', realName: 'timeOverSpeedLimitMs' },
                { name: 'totalDistanceDrivenMeters', realName: 'totalDistanceDrivenMeters' },
                { name: 'totalHarshEventCount', realName: 'totalHarshEventCount' },
                { name: 'totalTimeDrivenMs', realName: 'totalTimeDrivenMs' },
                { name: 'vehicleId', realName: 'vehicleId' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        VehicleSafetyScoreResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Crash event count
         *
         * @return {int|null}
         */
        VehicleSafetyScoreResponse.prototype.getCrashCount = function () {
            return this.crashCount;
        };
    
        /**
         * Setter for CrashCount
         * 
         * @param {int|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setCrashCount = function (value) {
            this.crashCount = value;
        };
    
        /**
         * Harsh acceleration event count
         *
         * @return {int|null}
         */
        VehicleSafetyScoreResponse.prototype.getHarshAccelCount = function () {
            return this.harshAccelCount;
        };
    
        /**
         * Setter for HarshAccelCount
         * 
         * @param {int|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setHarshAccelCount = function (value) {
            this.harshAccelCount = value;
        };
    
        /**
         * Harsh braking event count
         *
         * @return {int|null}
         */
        VehicleSafetyScoreResponse.prototype.getHarshBrakingCount = function () {
            return this.harshBrakingCount;
        };
    
        /**
         * Setter for HarshBrakingCount
         * 
         * @param {int|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setHarshBrakingCount = function (value) {
            this.harshBrakingCount = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {array|null}
         */
        VehicleSafetyScoreResponse.prototype.getHarshEvents = function () {
            return this.harshEvents;
        };
    
        /**
         * Setter for HarshEvents
         * 
         * @param {array|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setHarshEvents = function (value) {
            this.harshEvents = value;
        };
    
        /**
         * Harsh turning event count
         *
         * @return {int|null}
         */
        VehicleSafetyScoreResponse.prototype.getHarshTurningCount = function () {
            return this.harshTurningCount;
        };
    
        /**
         * Setter for HarshTurningCount
         * 
         * @param {int|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setHarshTurningCount = function (value) {
            this.harshTurningCount = value;
        };
    
        /**
         * Safety Score
         *
         * @return {int|null}
         */
        VehicleSafetyScoreResponse.prototype.getSafetyScore = function () {
            return this.safetyScore;
        };
    
        /**
         * Setter for SafetyScore
         * 
         * @param {int|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setSafetyScore = function (value) {
            this.safetyScore = value;
        };
    
        /**
         * Safety Score Rank
         *
         * @return {string|null}
         */
        VehicleSafetyScoreResponse.prototype.getSafetyScoreRank = function () {
            return this.safetyScoreRank;
        };
    
        /**
         * Setter for SafetyScoreRank
         * 
         * @param {string|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setSafetyScoreRank = function (value) {
            this.safetyScoreRank = value;
        };
    
        /**
         * Amount of time driven over the speed limit in milliseconds
         *
         * @return {int|null}
         */
        VehicleSafetyScoreResponse.prototype.getTimeOverSpeedLimitMs = function () {
            return this.timeOverSpeedLimitMs;
        };
    
        /**
         * Setter for TimeOverSpeedLimitMs
         * 
         * @param {int|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setTimeOverSpeedLimitMs = function (value) {
            this.timeOverSpeedLimitMs = value;
        };
    
        /**
         * Total distance driven in meters
         *
         * @return {int|null}
         */
        VehicleSafetyScoreResponse.prototype.getTotalDistanceDrivenMeters = function () {
            return this.totalDistanceDrivenMeters;
        };
    
        /**
         * Setter for TotalDistanceDrivenMeters
         * 
         * @param {int|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setTotalDistanceDrivenMeters = function (value) {
            this.totalDistanceDrivenMeters = value;
        };
    
        /**
         * Total harsh event count
         *
         * @return {int|null}
         */
        VehicleSafetyScoreResponse.prototype.getTotalHarshEventCount = function () {
            return this.totalHarshEventCount;
        };
    
        /**
         * Setter for TotalHarshEventCount
         * 
         * @param {int|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setTotalHarshEventCount = function (value) {
            this.totalHarshEventCount = value;
        };
    
        /**
         * Amount of time driven in milliseconds
         *
         * @return {int|null}
         */
        VehicleSafetyScoreResponse.prototype.getTotalTimeDrivenMs = function () {
            return this.totalTimeDrivenMs;
        };
    
        /**
         * Setter for TotalTimeDrivenMs
         * 
         * @param {int|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setTotalTimeDrivenMs = function (value) {
            this.totalTimeDrivenMs = value;
        };
    
        /**
         * Vehicle ID
         *
         * @return {int|null}
         */
        VehicleSafetyScoreResponse.prototype.getVehicleId = function () {
            return this.vehicleId;
        };
    
        /**
         * Setter for VehicleId
         * 
         * @param {int|null} value 
         */
        VehicleSafetyScoreResponse.prototype.setVehicleId = function (value) {
            this.vehicleId = value;
        };
    
        return VehicleSafetyScoreResponse;
    }

}(angular));
