/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of ReactivateDriverParam
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('ReactivateDriverParam', ['BaseModel', ReactivateDriverParamModel]);

    function ReactivateDriverParamModel(BaseModel) {
        var ReactivateDriverParam = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.reactivate = this.getValue(obj.reactivate);
        };

        ReactivateDriverParam.prototype = new BaseModel();
        ReactivateDriverParam.prototype.constructor = ReactivateDriverParam;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        ReactivateDriverParam.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'reactivate', realName: 'reactivate' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        ReactivateDriverParam.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * True indicates that this driver should be reactivated.
         *
         * @return {bool}
         */
        ReactivateDriverParam.prototype.getReactivate = function () {
            return this.reactivate;
        };
    
        /**
         * Setter for Reactivate
         * 
         * @param {bool} value 
         */
        ReactivateDriverParam.prototype.setReactivate = function (value) {
            this.reactivate = value;
        };
    
        return ReactivateDriverParam;
    }

}(angular));
