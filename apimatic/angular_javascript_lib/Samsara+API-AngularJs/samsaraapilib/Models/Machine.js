/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Machine
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Machine', ['BaseModel', MachineModel]);

    function MachineModel(BaseModel) {
        var Machine = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.id = this.getValue(obj.id);
            this.name = this.getValue(obj.name);
            this.notes = this.getValue(obj.notes);
        };

        Machine.prototype = new BaseModel();
        Machine.prototype.constructor = Machine;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Machine.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'id', realName: 'id' },
                { name: 'name', realName: 'name' },
                { name: 'notes', realName: 'notes' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Machine.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * ID of the machine.
         *
         * @return {long}
         */
        Machine.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {long} value 
         */
        Machine.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * Name of the machine.
         *
         * @return {string|null}
         */
        Machine.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string|null} value 
         */
        Machine.prototype.setName = function (value) {
            this.name = value;
        };
    
        /**
         * Notes about the machine
         *
         * @return {string|null}
         */
        Machine.prototype.getNotes = function () {
            return this.notes;
        };
    
        /**
         * Setter for Notes
         * 
         * @param {string|null} value 
         */
        Machine.prototype.setNotes = function (value) {
            this.notes = value;
        };
    
        return Machine;
    }

}(angular));
