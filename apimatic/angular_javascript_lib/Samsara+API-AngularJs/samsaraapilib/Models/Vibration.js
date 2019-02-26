/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Vibration
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Vibration', ['BaseModel', VibrationModel]);

    function VibrationModel(BaseModel) {
        var Vibration = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.x = this.getValue(obj.x);
            this.y = this.getValue(obj.y);
            this.z = this.getValue(obj.z);
            this.time = this.getValue(obj.time);
        };

        Vibration.prototype = new BaseModel();
        Vibration.prototype.constructor = Vibration;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Vibration.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'x', realName: 'X' },
                { name: 'y', realName: 'Y' },
                { name: 'z', realName: 'Z' },
                { name: 'time', realName: 'time' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Vibration.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {double|null}
         */
        Vibration.prototype.getX = function () {
            return this.x;
        };
    
        /**
         * Setter for X
         * 
         * @param {double|null} value 
         */
        Vibration.prototype.setX = function (value) {
            this.x = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {double|null}
         */
        Vibration.prototype.getY = function () {
            return this.y;
        };
    
        /**
         * Setter for Y
         * 
         * @param {double|null} value 
         */
        Vibration.prototype.setY = function (value) {
            this.y = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {double|null}
         */
        Vibration.prototype.getZ = function () {
            return this.z;
        };
    
        /**
         * Setter for Z
         * 
         * @param {double|null} value 
         */
        Vibration.prototype.setZ = function (value) {
            this.z = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {long|null}
         */
        Vibration.prototype.getTime = function () {
            return this.time;
        };
    
        /**
         * Setter for Time
         * 
         * @param {long|null} value 
         */
        Vibration.prototype.setTime = function (value) {
            this.time = value;
        };
    
        return Vibration;
    }

}(angular));