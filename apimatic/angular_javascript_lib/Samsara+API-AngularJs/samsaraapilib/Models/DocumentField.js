/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DocumentField
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('DocumentField', ['BaseModel', DocumentFieldModel]);

    function DocumentFieldModel(BaseModel) {
        var DocumentField = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.label = this.getValue(obj.label);
            this.value = this.getValue(obj.value);
            this.numberValue = this.getValue(obj.numberValue);
            this.photoValue = this.getValue(obj.photoValue);
            this.stringValue = this.getValue(obj.stringValue);
            this.valueType = this.getValue(obj.valueType);
        };

        DocumentField.prototype = new BaseModel();
        DocumentField.prototype.constructor = DocumentField;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DocumentField.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'label', realName: 'label' },
                { name: 'value', realName: 'value' },
                { name: 'numberValue', realName: 'numberValue' },
                { name: 'photoValue', realName: 'photoValue', array: true, type: 'PhotoValue' },
                { name: 'stringValue', realName: 'stringValue' },
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
        DocumentField.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Descriptive name of this field.
         *
         * @return {string}
         */
        DocumentField.prototype.getLabel = function () {
            return this.label;
        };
    
        /**
         * Setter for Label
         * 
         * @param {string} value 
         */
        DocumentField.prototype.setLabel = function (value) {
            this.label = value;
        };
    
        /**
         * DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on
         * what kind of field it is, this may be one of the following: an array of image urls, a float, an integer,
         * or a string.
         *
         * @return {object|null}
         */
        DocumentField.prototype.getValue = function () {
            return this.value;
        };
    
        /**
         * Setter for Value
         * 
         * @param {object|null} value 
         */
        DocumentField.prototype.setValue = function (value) {
            this.value = value;
        };
    
        /**
         * Value of this field if this document field has valueType: ValueType_Number.
         *
         * @return {double|null}
         */
        DocumentField.prototype.getNumberValue = function () {
            return this.numberValue;
        };
    
        /**
         * Setter for NumberValue
         * 
         * @param {double|null} value 
         */
        DocumentField.prototype.setNumberValue = function (value) {
            this.numberValue = value;
        };
    
        /**
         * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where
         * each object contains a URL for a photo.
         *
         * @return {array|null}
         */
        DocumentField.prototype.getPhotoValue = function () {
            return this.photoValue;
        };
    
        /**
         * Setter for PhotoValue
         * 
         * @param {array|null} value 
         */
        DocumentField.prototype.setPhotoValue = function (value) {
            this.photoValue = value;
        };
    
        /**
         * Value of this field if this document field has valueType: ValueType_String.
         *
         * @return {string|null}
         */
        DocumentField.prototype.getStringValue = function () {
            return this.stringValue;
        };
    
        /**
         * Setter for StringValue
         * 
         * @param {string|null} value 
         */
        DocumentField.prototype.setStringValue = function (value) {
            this.stringValue = value;
        };
    
        /**
         * Determines the type of this field and what type of value this field has. It should be either
         * ValueType_Number, ValueType_String, or ValueType_Photo.
         *
         * @return {string}
         */
        DocumentField.prototype.getValueType = function () {
            return this.valueType;
        };
    
        /**
         * Setter for ValueType
         * 
         * @param {string} value 
         */
        DocumentField.prototype.setValueType = function (value) {
            this.valueType = value;
        };
    
        return DocumentField;
    }

}(angular));