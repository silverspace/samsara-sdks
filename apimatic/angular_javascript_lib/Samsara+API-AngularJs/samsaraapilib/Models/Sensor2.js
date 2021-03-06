/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Sensor2
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Sensor2', ['BaseModel', Sensor2Model]);

    function Sensor2Model(BaseModel) {
        var Sensor2 = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.humidity = this.getValue(obj.humidity);
            this.id = this.getValue(obj.id);
            this.name = this.getValue(obj.name);
        };

        Sensor2.prototype = new BaseModel();
        Sensor2.prototype.constructor = Sensor2;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Sensor2.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'humidity', realName: 'humidity' },
                { name: 'id', realName: 'id' },
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
        Sensor2.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Currently reported relative humidity in percent, from 0-100.
         *
         * @return {int|null}
         */
        Sensor2.prototype.getHumidity = function () {
            return this.humidity;
        };
    
        /**
         * Setter for Humidity
         * 
         * @param {int|null} value 
         */
        Sensor2.prototype.setHumidity = function (value) {
            this.humidity = value;
        };
    
        /**
         * ID of the sensor.
         *
         * @return {long|null}
         */
        Sensor2.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {long|null} value 
         */
        Sensor2.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * Name of the sensor.
         *
         * @return {string|null}
         */
        Sensor2.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string|null} value 
         */
        Sensor2.prototype.setName = function (value) {
            this.name = value;
        };
    
        return Sensor2;
    }

}(angular));
