/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Vehicle2
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Vehicle2', ['BaseModel', Vehicle2Model]);

    function Vehicle2Model(BaseModel) {
        var Vehicle2 = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.id = this.getValue(obj.id);
            this.name = this.getValue(obj.name);
        };

        Vehicle2.prototype = new BaseModel();
        Vehicle2.prototype.constructor = Vehicle2;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Vehicle2.prototype.mappingInfo = function() {
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
        Vehicle2.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * The vehicle id on which DVIR was done.
         *
         * @return {long|null}
         */
        Vehicle2.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {long|null} value 
         */
        Vehicle2.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * The vehicle on which DVIR was done.
         *
         * @return {string|null}
         */
        Vehicle2.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string|null} value 
         */
        Vehicle2.prototype.setName = function (value) {
            this.name = value;
        };
    
        return Vehicle2;
    }

}(angular));