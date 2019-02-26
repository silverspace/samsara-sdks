/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of VehicleDefect
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('VehicleDefect', ['BaseModel', VehicleDefectModel]);

    function VehicleDefectModel(BaseModel) {
        var VehicleDefect = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.comment = this.getValue(obj.comment);
            this.defectType = this.getValue(obj.defectType);
        };

        VehicleDefect.prototype = new BaseModel();
        VehicleDefect.prototype.constructor = VehicleDefect;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        VehicleDefect.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'comment', realName: 'comment' },
                { name: 'defectType', realName: 'defectType' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        VehicleDefect.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * The comment describing the type of DVIR defect
         *
         * @return {string|null}
         */
        VehicleDefect.prototype.getComment = function () {
            return this.comment;
        };
    
        /**
         * Setter for Comment
         * 
         * @param {string|null} value 
         */
        VehicleDefect.prototype.setComment = function (value) {
            this.comment = value;
        };
    
        /**
         * The type of DVIR defect
         *
         * @return {string|null}
         */
        VehicleDefect.prototype.getDefectType = function () {
            return this.defectType;
        };
    
        /**
         * Setter for DefectType
         * 
         * @param {string|null} value 
         */
        VehicleDefect.prototype.setDefectType = function (value) {
            this.defectType = value;
        };
    
        return VehicleDefect;
    }

}(angular));