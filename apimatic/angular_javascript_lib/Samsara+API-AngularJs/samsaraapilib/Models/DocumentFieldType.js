/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DocumentFieldType
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('DocumentFieldType', ['BaseModel', DocumentFieldTypeModel]);

    function DocumentFieldTypeModel(BaseModel) {
        var DocumentFieldType = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.label = this.getValue(obj.label);
            this.numberValueTypeMetadata = this.getValue(obj.numberValueTypeMetadata);
            this.valueType = this.getValue(obj.valueType);
        };

        DocumentFieldType.prototype = new BaseModel();
        DocumentFieldType.prototype.constructor = DocumentFieldType;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DocumentFieldType.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'label', realName: 'label' },
                {
                    name: 'numberValueTypeMetadata',
                    realName: 'numberValueTypeMetadata',
                    type: 'NumberValueTypeMetadata',
                },
                { name: 'valueType', realName: 'valueType' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        DocumentFieldType.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Descriptive name of this field type.
         *
         * @return {string}
         */
        DocumentFieldType.prototype.getLabel = function () {
            return this.label;
        };
    
        /**
         * Setter for Label
         * 
         * @param {string} value 
         */
        DocumentFieldType.prototype.setLabel = function (value) {
            this.label = value;
        };
    
        /**
         * Additional metadata information for a number field type. Only defined when a field type has valueType:
         * ValueType_Number.
         *
         * @return {NumberValueTypeMetadata|null}
         */
        DocumentFieldType.prototype.getNumberValueTypeMetadata = function () {
            return this.numberValueTypeMetadata;
        };
    
        /**
         * Setter for NumberValueTypeMetadata
         * 
         * @param {NumberValueTypeMetadata|null} value 
         */
        DocumentFieldType.prototype.setNumberValueTypeMetadata = function (value) {
            this.numberValueTypeMetadata = value;
        };
    
        /**
         * The kind of value that can be submitted for this fieldType. It should be either ValueType_Number,
         * ValueType_String, or ValueType_Photo.
         *
         * @return {string}
         */
        DocumentFieldType.prototype.getValueType = function () {
            return this.valueType;
        };
    
        /**
         * Setter for ValueType
         * 
         * @param {string} value 
         */
        DocumentFieldType.prototype.setValueType = function (value) {
            this.valueType = value;
        };
    
        return DocumentFieldType;
    }

}(angular));
