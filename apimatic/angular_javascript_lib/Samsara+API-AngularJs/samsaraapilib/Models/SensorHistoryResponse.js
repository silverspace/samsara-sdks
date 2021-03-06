/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of SensorHistoryResponse
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('SensorHistoryResponse', ['BaseModel', SensorHistoryResponseModel]);

    function SensorHistoryResponseModel(BaseModel) {
        var SensorHistoryResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.results = this.getValue(obj.results);
        };

        SensorHistoryResponse.prototype = new BaseModel();
        SensorHistoryResponse.prototype.constructor = SensorHistoryResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        SensorHistoryResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'results', realName: 'results', array: true, type: 'Result' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        SensorHistoryResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {array|null}
         */
        SensorHistoryResponse.prototype.getResults = function () {
            return this.results;
        };
    
        /**
         * Setter for Results
         * 
         * @param {array|null} value 
         */
        SensorHistoryResponse.prototype.setResults = function (value) {
            this.results = value;
        };
    
        return SensorHistoryResponse;
    }

}(angular));
