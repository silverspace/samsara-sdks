/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of TagMetadata
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('TagMetadata', ['BaseModel', TagMetadataModel]);

    function TagMetadataModel(BaseModel) {
        var TagMetadata = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.id = this.getValue(obj.id);
            this.name = this.getValue(obj.name);
        };

        TagMetadata.prototype = new BaseModel();
        TagMetadata.prototype.constructor = TagMetadata;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        TagMetadata.prototype.mappingInfo = function() {
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
        TagMetadata.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * The ID of this tag.
         *
         * @return {long}
         */
        TagMetadata.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {long} value 
         */
        TagMetadata.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * Name of this tag.
         *
         * @return {string}
         */
        TagMetadata.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string} value 
         */
        TagMetadata.prototype.setName = function (value) {
            this.name = value;
        };
    
        return TagMetadata;
    }

}(angular));