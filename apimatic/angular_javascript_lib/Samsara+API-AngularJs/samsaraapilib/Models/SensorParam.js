/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of SensorParam
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('SensorParam', ['BaseModel', SensorParamModel]);

    function SensorParamModel(BaseModel) {
        var SensorParam = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.groupId = this.getValue(obj.groupId);
            this.sensors = this.getValue(obj.sensors);
        };

        SensorParam.prototype = new BaseModel();
        SensorParam.prototype.constructor = SensorParam;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        SensorParam.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'groupId', realName: 'groupId' },
                { name: 'sensors', realName: 'sensors', array: true }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        SensorParam.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Group ID to query.
         *
         * @return {long}
         */
        SensorParam.prototype.getGroupId = function () {
            return this.groupId;
        };
    
        /**
         * Setter for GroupId
         * 
         * @param {long} value 
         */
        SensorParam.prototype.setGroupId = function (value) {
            this.groupId = value;
        };
    
        /**
         * List of sensor IDs to query.
         *
         * @return {array}
         */
        SensorParam.prototype.getSensors = function () {
            return this.sensors;
        };
    
        /**
         * Setter for Sensors
         * 
         * @param {array} value 
         */
        SensorParam.prototype.setSensors = function (value) {
            this.sensors = value;
        };
    
        return SensorParam;
    }

}(angular));