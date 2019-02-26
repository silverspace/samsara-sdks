/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Location
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Location', ['BaseModel', LocationModel]);

    function LocationModel(BaseModel) {
        var Location = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.address = this.getValue(obj.address);
            this.latitude = this.getValue(obj.latitude);
            this.longitude = this.getValue(obj.longitude);
        };

        Location.prototype = new BaseModel();
        Location.prototype.constructor = Location;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Location.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'address', realName: 'address' },
                { name: 'latitude', realName: 'latitude' },
                { name: 'longitude', realName: 'longitude' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Location.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Address of location where the harsh event occurred
         *
         * @return {string|null}
         */
        Location.prototype.getAddress = function () {
            return this.address;
        };
    
        /**
         * Setter for Address
         * 
         * @param {string|null} value 
         */
        Location.prototype.setAddress = function (value) {
            this.address = value;
        };
    
        /**
         * Latitude of location where the harsh event occurred
         *
         * @return {string|null}
         */
        Location.prototype.getLatitude = function () {
            return this.latitude;
        };
    
        /**
         * Setter for Latitude
         * 
         * @param {string|null} value 
         */
        Location.prototype.setLatitude = function (value) {
            this.latitude = value;
        };
    
        /**
         * Longitude of location where the harsh event occurred
         *
         * @return {string|null}
         */
        Location.prototype.getLongitude = function () {
            return this.longitude;
        };
    
        /**
         * Setter for Longitude
         * 
         * @param {string|null} value 
         */
        Location.prototype.setLongitude = function (value) {
            this.longitude = value;
        };
    
        return Location;
    }

}(angular));