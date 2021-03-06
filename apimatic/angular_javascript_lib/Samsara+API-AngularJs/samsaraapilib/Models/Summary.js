/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Summary
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Summary', ['BaseModel', SummaryModel]);

    function SummaryModel(BaseModel) {
        var Summary = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.activeMs = this.getValue(obj.activeMs);
            this.distanceMiles = this.getValue(obj.distanceMiles);
            this.driveMs = this.getValue(obj.driveMs);
            this.driverId = this.getValue(obj.driverId);
            this.driverName = this.getValue(obj.driverName);
            this.driverUsername = this.getValue(obj.driverUsername);
            this.groupId = this.getValue(obj.groupId);
            this.onDutyMs = this.getValue(obj.onDutyMs);
        };

        Summary.prototype = new BaseModel();
        Summary.prototype.constructor = Summary;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Summary.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'activeMs', realName: 'activeMs' },
                { name: 'distanceMiles', realName: 'distanceMiles' },
                { name: 'driveMs', realName: 'driveMs' },
                { name: 'driverId', realName: 'driverId' },
                { name: 'driverName', realName: 'driverName' },
                { name: 'driverUsername', realName: 'driverUsername' },
                { name: 'groupId', realName: 'groupId' },
                { name: 'onDutyMs', realName: 'onDutyMs' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Summary.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Duration in milliseconds that driver was on duty or driving during the requested time range
         *
         * @return {long|null}
         */
        Summary.prototype.getActiveMs = function () {
            return this.activeMs;
        };
    
        /**
         * Setter for ActiveMs
         * 
         * @param {long|null} value 
         */
        Summary.prototype.setActiveMs = function (value) {
            this.activeMs = value;
        };
    
        /**
         * Distance driven in miles, rounded to two decimal places.
         *
         * @return {double|null}
         */
        Summary.prototype.getDistanceMiles = function () {
            return this.distanceMiles;
        };
    
        /**
         * Setter for DistanceMiles
         * 
         * @param {double|null} value 
         */
        Summary.prototype.setDistanceMiles = function (value) {
            this.distanceMiles = value;
        };
    
        /**
         * Duration in milliseconds that driver was driving during the requested time range
         *
         * @return {long|null}
         */
        Summary.prototype.getDriveMs = function () {
            return this.driveMs;
        };
    
        /**
         * Setter for DriveMs
         * 
         * @param {long|null} value 
         */
        Summary.prototype.setDriveMs = function (value) {
            this.driveMs = value;
        };
    
        /**
         * ID of the driver.
         *
         * @return {long|null}
         */
        Summary.prototype.getDriverId = function () {
            return this.driverId;
        };
    
        /**
         * Setter for DriverId
         * 
         * @param {long|null} value 
         */
        Summary.prototype.setDriverId = function (value) {
            this.driverId = value;
        };
    
        /**
         * Name of the driver.
         *
         * @return {string|null}
         */
        Summary.prototype.getDriverName = function () {
            return this.driverName;
        };
    
        /**
         * Setter for DriverName
         * 
         * @param {string|null} value 
         */
        Summary.prototype.setDriverName = function (value) {
            this.driverName = value;
        };
    
        /**
         * Username of the driver.
         *
         * @return {string|null}
         */
        Summary.prototype.getDriverUsername = function () {
            return this.driverUsername;
        };
    
        /**
         * Setter for DriverUsername
         * 
         * @param {string|null} value 
         */
        Summary.prototype.setDriverUsername = function (value) {
            this.driverUsername = value;
        };
    
        /**
         * Group of the driver.
         *
         * @return {long|null}
         */
        Summary.prototype.getGroupId = function () {
            return this.groupId;
        };
    
        /**
         * Setter for GroupId
         * 
         * @param {long|null} value 
         */
        Summary.prototype.setGroupId = function (value) {
            this.groupId = value;
        };
    
        /**
         * Duration in milliseconds that driver was on duty during the requested time range
         *
         * @return {long|null}
         */
        Summary.prototype.getOnDutyMs = function () {
            return this.onDutyMs;
        };
    
        /**
         * Setter for OnDutyMs
         * 
         * @param {long|null} value 
         */
        Summary.prototype.setOnDutyMs = function (value) {
            this.onDutyMs = value;
        };
    
        return Summary;
    }

}(angular));
