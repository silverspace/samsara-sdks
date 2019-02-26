/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of Series1
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('Series1', ['BaseModel', Series1Model]);

    function Series1Model(BaseModel) {
        var Series1 = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.field = this.getValue(obj.field);
            this.widgetId = this.getValue(obj.widgetId);
        };

        Series1.prototype = new BaseModel();
        Series1.prototype.constructor = Series1;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        Series1.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'field', realName: 'field' },
                { name: 'widgetId', realName: 'widgetId' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        Series1.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Field to query.
         *
         * @return {FieldEnum}
         */
        Series1.prototype.getField = function () {
            return this.field;
        };
    
        /**
         * Setter for Field
         * 
         * @param {FieldEnum} value 
         */
        Series1.prototype.setField = function (value) {
            this.field = value;
        };
    
        /**
         * Sensor ID to query.
         *
         * @return {long}
         */
        Series1.prototype.getWidgetId = function () {
            return this.widgetId;
        };
    
        /**
         * Setter for WidgetId
         * 
         * @param {long} value 
         */
        Series1.prototype.setWidgetId = function (value) {
            this.widgetId = value;
        };
    
        return Series1;
    }

}(angular));