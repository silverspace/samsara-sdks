/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DispatchRouteHistoricalEntry
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('DispatchRouteHistoricalEntry', ['BaseModel', DispatchRouteHistoricalEntryModel]);

    function DispatchRouteHistoricalEntryModel(BaseModel) {
        var DispatchRouteHistoricalEntry = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.changedAtMs = this.getValue(obj.changedAtMs);
            this.route = this.getValue(obj.route);
        };

        DispatchRouteHistoricalEntry.prototype = new BaseModel();
        DispatchRouteHistoricalEntry.prototype.constructor = DispatchRouteHistoricalEntry;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DispatchRouteHistoricalEntry.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'changedAtMs', realName: 'changed_at_ms' },
                { name: 'route', realName: 'route', type: 'DispatchRoute' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        DispatchRouteHistoricalEntry.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Timestamp that the route was updated, represented as Unix milliseconds since epoch.
         *
         * @return {long|null}
         */
        DispatchRouteHistoricalEntry.prototype.getChangedAtMs = function () {
            return this.changedAtMs;
        };
    
        /**
         * Setter for ChangedAtMs
         * 
         * @param {long|null} value 
         */
        DispatchRouteHistoricalEntry.prototype.setChangedAtMs = function (value) {
            this.changedAtMs = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {DispatchRoute|null}
         */
        DispatchRouteHistoricalEntry.prototype.getRoute = function () {
            return this.route;
        };
    
        /**
         * Setter for Route
         * 
         * @param {DispatchRoute|null} value 
         */
        DispatchRouteHistoricalEntry.prototype.setRoute = function (value) {
            this.route = value;
        };
    
        return DispatchRouteHistoricalEntry;
    }

}(angular));
