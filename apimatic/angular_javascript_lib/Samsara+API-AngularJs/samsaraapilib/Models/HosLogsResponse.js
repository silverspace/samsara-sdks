/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of HosLogsResponse
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('HosLogsResponse', ['BaseModel', HosLogsResponseModel]);

    function HosLogsResponseModel(BaseModel) {
        var HosLogsResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.logs = this.getValue(obj.logs);
        };

        HosLogsResponse.prototype = new BaseModel();
        HosLogsResponse.prototype.constructor = HosLogsResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        HosLogsResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'logs', realName: 'logs', array: true, type: 'Log' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        HosLogsResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {array|null}
         */
        HosLogsResponse.prototype.getLogs = function () {
            return this.logs;
        };
    
        /**
         * Setter for Logs
         * 
         * @param {array|null} value 
         */
        HosLogsResponse.prototype.setLogs = function (value) {
            this.logs = value;
        };
    
        return HosLogsResponse;
    }

}(angular));