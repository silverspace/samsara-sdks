/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of GroupParam
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('GroupParam', ['BaseModel', GroupParamModel]);

    function GroupParamModel(BaseModel) {
        var GroupParam = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.groupId = this.getValue(obj.groupId);
        };

        GroupParam.prototype = new BaseModel();
        GroupParam.prototype.constructor = GroupParam;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        GroupParam.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'groupId', realName: 'groupId' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        GroupParam.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * Group ID to query.
         *
         * @return {long}
         */
        GroupParam.prototype.getGroupId = function () {
            return this.groupId;
        };
    
        /**
         * Setter for GroupId
         * 
         * @param {long} value 
         */
        GroupParam.prototype.setGroupId = function (value) {
            this.groupId = value;
        };
    
        return GroupParam;
    }

}(angular));