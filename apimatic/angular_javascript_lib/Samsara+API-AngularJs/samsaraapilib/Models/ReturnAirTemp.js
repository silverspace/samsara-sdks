/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of ReturnAirTemp
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('ReturnAirTemp', ['BaseModel', ReturnAirTempModel]);

    function ReturnAirTempModel(BaseModel) {
        var ReturnAirTemp = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.changedAtMs = this.getValue(obj.changedAtMs);
            this.tempInMilliC = this.getValue(obj.tempInMilliC);
        };

        ReturnAirTemp.prototype = new BaseModel();
        ReturnAirTemp.prototype.constructor = ReturnAirTemp;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        ReturnAirTemp.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'changedAtMs', realName: 'changedAtMs' },
                { name: 'tempInMilliC', realName: 'tempInMilliC' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        ReturnAirTemp.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Timestamp in Unix milliseconds since epoch.
         *
         * @return {long|null}
         */
        ReturnAirTemp.prototype.getChangedAtMs = function () {
            return this.changedAtMs;
        };
    
        /**
         * Setter for ChangedAtMs
         * 
         * @param {long|null} value 
         */
        ReturnAirTemp.prototype.setChangedAtMs = function (value) {
            this.changedAtMs = value;
        };
    
        /**
         * Return air temperature in millidegree Celsius.
         *
         * @return {long|null}
         */
        ReturnAirTemp.prototype.getTempInMilliC = function () {
            return this.tempInMilliC;
        };
    
        /**
         * Setter for TempInMilliC
         * 
         * @param {long|null} value 
         */
        ReturnAirTemp.prototype.setTempInMilliC = function (value) {
            this.tempInMilliC = value;
        };
    
        return ReturnAirTemp;
    }

}(angular));
