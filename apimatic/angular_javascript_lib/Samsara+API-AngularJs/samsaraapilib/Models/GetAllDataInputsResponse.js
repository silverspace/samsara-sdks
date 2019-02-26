/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of GetAllDataInputsResponse
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('GetAllDataInputsResponse', ['BaseModel', GetAllDataInputsResponseModel]);

    function GetAllDataInputsResponseModel(BaseModel) {
        var GetAllDataInputsResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.dataInputs = this.getValue(obj.dataInputs);
        };

        GetAllDataInputsResponse.prototype = new BaseModel();
        GetAllDataInputsResponse.prototype.constructor = GetAllDataInputsResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        GetAllDataInputsResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'dataInputs', realName: 'dataInputs', array: true, type: 'DataInputHistoryResponse' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        GetAllDataInputsResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {array|null}
         */
        GetAllDataInputsResponse.prototype.getDataInputs = function () {
            return this.dataInputs;
        };
    
        /**
         * Setter for DataInputs
         * 
         * @param {array|null} value 
         */
        GetAllDataInputsResponse.prototype.setDataInputs = function (value) {
            this.dataInputs = value;
        };
    
        return GetAllDataInputsResponse;
    }

}(angular));
