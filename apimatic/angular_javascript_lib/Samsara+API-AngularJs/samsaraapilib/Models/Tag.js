/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Tag
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Tag', ['BaseModel', TagModel]);

    function TagModel(BaseModel) {
        var Tag = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.addresses = this.getValue(obj.addresses);
            this.assets = this.getValue(obj.assets);
            this.drivers = this.getValue(obj.drivers);
            this.groupId = this.getValue(obj.groupId);
            this.id = this.getValue(obj.id);
            this.machines = this.getValue(obj.machines);
            this.name = this.getValue(obj.name);
            this.parentTagId = this.getValue(obj.parentTagId);
            this.sensors = this.getValue(obj.sensors);
            this.vehicles = this.getValue(obj.vehicles);
        };

        Tag.prototype = new BaseModel();
        Tag.prototype.constructor = Tag;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Tag.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'addresses', realName: 'addresses', array: true, type: 'TaggedAddress' },
                { name: 'assets', realName: 'assets', array: true, type: 'TaggedAsset' },
                { name: 'drivers', realName: 'drivers', array: true, type: 'TaggedDriver' },
                { name: 'groupId', realName: 'groupId' },
                { name: 'id', realName: 'id' },
                { name: 'machines', realName: 'machines', array: true, type: 'TaggedMachine' },
                { name: 'name', realName: 'name' },
                { name: 'parentTagId', realName: 'parentTagId' },
                { name: 'sensors', realName: 'sensors', array: true, type: 'TaggedSensor' },
                { name: 'vehicles', realName: 'vehicles', array: true, type: 'TaggedVehicle' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Tag.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * The addresses that belong to this tag.
         *
         * @return {array|null}
         */
        Tag.prototype.getAddresses = function () {
            return this.addresses;
        };
    
        /**
         * Setter for Addresses
         * 
         * @param {array|null} value 
         */
        Tag.prototype.setAddresses = function (value) {
            this.addresses = value;
        };
    
        /**
         * The assets that belong to this tag.
         *
         * @return {array|null}
         */
        Tag.prototype.getAssets = function () {
            return this.assets;
        };
    
        /**
         * Setter for Assets
         * 
         * @param {array|null} value 
         */
        Tag.prototype.setAssets = function (value) {
            this.assets = value;
        };
    
        /**
         * The drivers that belong to this tag.
         *
         * @return {array|null}
         */
        Tag.prototype.getDrivers = function () {
            return this.drivers;
        };
    
        /**
         * Setter for Drivers
         * 
         * @param {array|null} value 
         */
        Tag.prototype.setDrivers = function (value) {
            this.drivers = value;
        };
    
        /**
         * The GroupID that this tag belongs to.
         *
         * @return {long|null}
         */
        Tag.prototype.getGroupId = function () {
            return this.groupId;
        };
    
        /**
         * Setter for GroupId
         * 
         * @param {long|null} value 
         */
        Tag.prototype.setGroupId = function (value) {
            this.groupId = value;
        };
    
        /**
         * The ID of this tag.
         *
         * @return {long}
         */
        Tag.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {long} value 
         */
        Tag.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * The machines that belong to this tag.
         *
         * @return {array|null}
         */
        Tag.prototype.getMachines = function () {
            return this.machines;
        };
    
        /**
         * Setter for Machines
         * 
         * @param {array|null} value 
         */
        Tag.prototype.setMachines = function (value) {
            this.machines = value;
        };
    
        /**
         * Name of this tag.
         *
         * @return {string}
         */
        Tag.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string} value 
         */
        Tag.prototype.setName = function (value) {
            this.name = value;
        };
    
        /**
         * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's
         * parent tag.
         *
         * @return {long|null}
         */
        Tag.prototype.getParentTagId = function () {
            return this.parentTagId;
        };
    
        /**
         * Setter for ParentTagId
         * 
         * @param {long|null} value 
         */
        Tag.prototype.setParentTagId = function (value) {
            this.parentTagId = value;
        };
    
        /**
         * The sensors that belong to this tag.
         *
         * @return {array|null}
         */
        Tag.prototype.getSensors = function () {
            return this.sensors;
        };
    
        /**
         * Setter for Sensors
         * 
         * @param {array|null} value 
         */
        Tag.prototype.setSensors = function (value) {
            this.sensors = value;
        };
    
        /**
         * The vehicles that belong to this tag.
         *
         * @return {array|null}
         */
        Tag.prototype.getVehicles = function () {
            return this.vehicles;
        };
    
        /**
         * Setter for Vehicles
         * 
         * @param {array|null} value 
         */
        Tag.prototype.setVehicles = function (value) {
            this.vehicles = value;
        };
    
        return Tag;
    }

}(angular));