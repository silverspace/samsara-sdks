/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Machine1
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Machine1', ['BaseModel', Machine1Model]);

    function Machine1Model(BaseModel) {
        var Machine1 = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.id = this.getValue(obj.id);
            this.name = this.getValue(obj.name);
            this.vibrations = this.getValue(obj.vibrations);
        };

        Machine1.prototype = new BaseModel();
        Machine1.prototype.constructor = Machine1;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Machine1.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'id', realName: 'id' },
                { name: 'name', realName: 'name' },
                { name: 'vibrations', realName: 'vibrations', array: true, type: 'Vibration' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Machine1.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Machine ID
         *
         * @return {int|null}
         */
        Machine1.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {int|null} value 
         */
        Machine1.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * Machine name
         *
         * @return {string|null}
         */
        Machine1.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string|null} value 
         */
        Machine1.prototype.setName = function (value) {
            this.name = value;
        };
    
        /**
         * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
         *
         * @return {array|null}
         */
        Machine1.prototype.getVibrations = function () {
            return this.vibrations;
        };
    
        /**
         * Setter for Vibrations
         * 
         * @param {array|null} value 
         */
        Machine1.prototype.setVibrations = function (value) {
            this.vibrations = value;
        };
    
        return Machine1;
    }

}(angular));