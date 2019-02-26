/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of FleetVehiclesLocation
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('FleetVehiclesLocation', ['BaseModel', FleetVehiclesLocationModel]);

    function FleetVehiclesLocationModel(BaseModel) {
        var FleetVehiclesLocation = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.id = this.getValue(obj.id);
            this.locations = this.getValue(obj.locations);
            this.name = this.getValue(obj.name);
        };

        FleetVehiclesLocation.prototype = new BaseModel();
        FleetVehiclesLocation.prototype.constructor = FleetVehiclesLocation;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        FleetVehiclesLocation.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'id', realName: 'id' },
                { name: 'locations', realName: 'locations', array: true, type: 'FleetVehicleLocation' },
                { name: 'name', realName: 'name' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        FleetVehiclesLocation.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * ID of the vehicle.
         *
         * @return {long|null}
         */
        FleetVehiclesLocation.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {long|null} value 
         */
        FleetVehiclesLocation.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {array|null}
         */
        FleetVehiclesLocation.prototype.getLocations = function () {
            return this.locations;
        };
    
        /**
         * Setter for Locations
         * 
         * @param {array|null} value 
         */
        FleetVehiclesLocation.prototype.setLocations = function (value) {
            this.locations = value;
        };
    
        /**
         * Name of the vehicle.
         *
         * @return {string|null}
         */
        FleetVehiclesLocation.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string|null} value 
         */
        FleetVehiclesLocation.prototype.setName = function (value) {
            this.name = value;
        };
    
        return FleetVehiclesLocation;
    }

}(angular));
