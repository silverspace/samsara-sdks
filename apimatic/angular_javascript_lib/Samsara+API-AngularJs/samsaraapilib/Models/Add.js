/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Add
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Add', ['BaseModel', AddModel]);

    function AddModel(BaseModel) {
        var Add = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.assets = this.getValue(obj.assets);
            this.drivers = this.getValue(obj.drivers);
            this.machines = this.getValue(obj.machines);
            this.sensors = this.getValue(obj.sensors);
            this.vehicles = this.getValue(obj.vehicles);
        };

        Add.prototype = new BaseModel();
        Add.prototype.constructor = Add;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Add.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'assets', realName: 'assets', array: true, type: 'TaggedAssetBase' },
                { name: 'drivers', realName: 'drivers', array: true, type: 'TaggedDriverBase' },
                { name: 'machines', realName: 'machines', array: true, type: 'TaggedMachineBase' },
                { name: 'sensors', realName: 'sensors', array: true, type: 'TaggedSensorBase' },
                { name: 'vehicles', realName: 'vehicles', array: true, type: 'TaggedVehicleBase' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Add.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * The assets to be added to this tag.
         *
         * @return {array|null}
         */
        Add.prototype.getAssets = function () {
            return this.assets;
        };
    
        /**
         * Setter for Assets
         * 
         * @param {array|null} value 
         */
        Add.prototype.setAssets = function (value) {
            this.assets = value;
        };
    
        /**
         * The drivers to be added to this tag.
         *
         * @return {array|null}
         */
        Add.prototype.getDrivers = function () {
            return this.drivers;
        };
    
        /**
         * Setter for Drivers
         * 
         * @param {array|null} value 
         */
        Add.prototype.setDrivers = function (value) {
            this.drivers = value;
        };
    
        /**
         * The machines to be added to this tag.
         *
         * @return {array|null}
         */
        Add.prototype.getMachines = function () {
            return this.machines;
        };
    
        /**
         * Setter for Machines
         * 
         * @param {array|null} value 
         */
        Add.prototype.setMachines = function (value) {
            this.machines = value;
        };
    
        /**
         * The sensors to be added to this tag.
         *
         * @return {array|null}
         */
        Add.prototype.getSensors = function () {
            return this.sensors;
        };
    
        /**
         * Setter for Sensors
         * 
         * @param {array|null} value 
         */
        Add.prototype.setSensors = function (value) {
            this.sensors = value;
        };
    
        /**
         * The vehicles to be added to this tag.
         *
         * @return {array|null}
         */
        Add.prototype.getVehicles = function () {
            return this.vehicles;
        };
    
        /**
         * Setter for Vehicles
         * 
         * @param {array|null} value 
         */
        Add.prototype.setVehicles = function (value) {
            this.vehicles = value;
        };
    
        return Add;
    }

}(angular));
