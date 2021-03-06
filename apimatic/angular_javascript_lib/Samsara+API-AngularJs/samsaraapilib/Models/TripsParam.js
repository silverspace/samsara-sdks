/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of TripsParam
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('TripsParam', ['BaseModel', TripsParamModel]);

    function TripsParamModel(BaseModel) {
        var TripsParam = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.endMs = this.getValue(obj.endMs);
            this.groupId = this.getValue(obj.groupId);
            this.startMs = this.getValue(obj.startMs);
            this.vehicleId = this.getValue(obj.vehicleId);
        };

        TripsParam.prototype = new BaseModel();
        TripsParam.prototype.constructor = TripsParam;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        TripsParam.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'endMs', realName: 'endMs' },
                { name: 'groupId', realName: 'groupId' },
                { name: 'startMs', realName: 'startMs' },
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
        TripsParam.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * End of the time range, specified in milliseconds UNIX time.
         *
         * @return {long}
         */
        TripsParam.prototype.getEndMs = function () {
            return this.endMs;
        };
    
        /**
         * Setter for EndMs
         * 
         * @param {long} value 
         */
        TripsParam.prototype.setEndMs = function (value) {
            this.endMs = value;
        };
    
        /**
         * Group ID to query.
         *
         * @return {long}
         */
        TripsParam.prototype.getGroupId = function () {
            return this.groupId;
        };
    
        /**
         * Setter for GroupId
         * 
         * @param {long} value 
         */
        TripsParam.prototype.setGroupId = function (value) {
            this.groupId = value;
        };
    
        /**
         * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect
         * to startMs and endMs
         *
         * @return {long}
         */
        TripsParam.prototype.getStartMs = function () {
            return this.startMs;
        };
    
        /**
         * Setter for StartMs
         * 
         * @param {long} value 
         */
        TripsParam.prototype.setStartMs = function (value) {
            this.startMs = value;
        };
    
        /**
         * Vehicle ID to query.
         *
         * @return {long}
         */
        TripsParam.prototype.getVehicleId = function () {
            return this.vehicleId;
        };
    
        /**
         * Setter for VehicleId
         * 
         * @param {long} value 
         */
        TripsParam.prototype.setVehicleId = function (value) {
            this.vehicleId = value;
        };
    
        return TripsParam;
    }

}(angular));
