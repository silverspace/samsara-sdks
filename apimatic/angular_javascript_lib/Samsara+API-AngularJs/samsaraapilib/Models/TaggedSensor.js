/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of TaggedSensor
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('TaggedSensor', ['BaseModel', TaggedSensorModel]);

    function TaggedSensorModel(BaseModel) {
        var TaggedSensor = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.id = this.getValue(obj.id);
            this.name = this.getValue(obj.name);
        };

        TaggedSensor.prototype = new BaseModel();
        TaggedSensor.prototype.constructor = TaggedSensor;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        TaggedSensor.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
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
        TaggedSensor.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * The ID of the Sensor being tagged.
         *
         * @return {long}
         */
        TaggedSensor.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {long} value 
         */
        TaggedSensor.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * Name of the Sensor being tagged.
         *
         * @return {string|null}
         */
        TaggedSensor.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string|null} value 
         */
        TaggedSensor.prototype.setName = function (value) {
            this.name = value;
        };
    
        return TaggedSensor;
    }

}(angular));
