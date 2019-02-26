/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DispatchRouteHistory
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('DispatchRouteHistory', ['BaseModel', DispatchRouteHistoryModel]);

    function DispatchRouteHistoryModel(BaseModel) {
        var DispatchRouteHistory = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.history = this.getValue(obj.history);
        };

        DispatchRouteHistory.prototype = new BaseModel();
        DispatchRouteHistory.prototype.constructor = DispatchRouteHistory;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DispatchRouteHistory.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'history', realName: 'history', array: true, type: 'DispatchRouteHistoricalEntry' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        DispatchRouteHistory.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * History of the route's state changes.
         *
         * @return {array|null}
         */
        DispatchRouteHistory.prototype.getHistory = function () {
            return this.history;
        };
    
        /**
         * Setter for History
         * 
         * @param {array|null} value 
         */
        DispatchRouteHistory.prototype.setHistory = function (value) {
            this.history = value;
        };
    
        return DispatchRouteHistory;
    }

}(angular));