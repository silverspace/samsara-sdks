/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of AllRouteJobUpdates
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('AllRouteJobUpdates', ['BaseModel', AllRouteJobUpdatesModel]);

    function AllRouteJobUpdatesModel(BaseModel) {
        var AllRouteJobUpdates = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.jobUpdates = this.getValue(obj.jobUpdates);
            this.sequenceId = this.getValue(obj.sequenceId);
        };

        AllRouteJobUpdates.prototype = new BaseModel();
        AllRouteJobUpdates.prototype.constructor = AllRouteJobUpdates;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        AllRouteJobUpdates.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'jobUpdates', realName: 'job_updates', array: true, type: 'JobUpdateObject' },
                { name: 'sequenceId', realName: 'sequence_id' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        AllRouteJobUpdates.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {array|null}
         */
        AllRouteJobUpdates.prototype.getJobUpdates = function () {
            return this.jobUpdates;
        };
    
        /**
         * Setter for JobUpdates
         * 
         * @param {array|null} value 
         */
        AllRouteJobUpdates.prototype.setJobUpdates = function (value) {
            this.jobUpdates = value;
        };
    
        /**
         * Sequence ID of the last update returned in the response
         *
         * @return {string|null}
         */
        AllRouteJobUpdates.prototype.getSequenceId = function () {
            return this.sequenceId;
        };
    
        /**
         * Setter for SequenceId
         * 
         * @param {string|null} value 
         */
        AllRouteJobUpdates.prototype.setSequenceId = function (value) {
            this.sequenceId = value;
        };
    
        return AllRouteJobUpdates;
    }

}(angular));
