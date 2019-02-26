/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of VehicleHarshEventResponse
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('VehicleHarshEventResponse', ['BaseModel', VehicleHarshEventResponseModel]);

    function VehicleHarshEventResponseModel(BaseModel) {
        var VehicleHarshEventResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.downloadForwardVideoUrl = this.getValue(obj.downloadForwardVideoUrl);
            this.downloadInwardVideoUrl = this.getValue(obj.downloadInwardVideoUrl);
            this.downloadTrackedInwardVideoUrl = this.getValue(obj.downloadTrackedInwardVideoUrl);
            this.harshEventType = this.getValue(obj.harshEventType);
            this.incidentReportUrl = this.getValue(obj.incidentReportUrl);
            this.isDistracted = this.getValue(obj.isDistracted);
            this.location = this.getValue(obj.location);
        };

        VehicleHarshEventResponse.prototype = new BaseModel();
        VehicleHarshEventResponse.prototype.constructor = VehicleHarshEventResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        VehicleHarshEventResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'downloadForwardVideoUrl', realName: 'downloadForwardVideoUrl' },
                { name: 'downloadInwardVideoUrl', realName: 'downloadInwardVideoUrl' },
                { name: 'downloadTrackedInwardVideoUrl', realName: 'downloadTrackedInwardVideoUrl' },
                { name: 'harshEventType', realName: 'harshEventType' },
                { name: 'incidentReportUrl', realName: 'incidentReportUrl' },
                { name: 'isDistracted', realName: 'isDistracted' },
                { name: 'location', realName: 'location', type: 'Location' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        VehicleHarshEventResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * URL for downloading the forward facing video
         *
         * @return {string|null}
         */
        VehicleHarshEventResponse.prototype.getDownloadForwardVideoUrl = function () {
            return this.downloadForwardVideoUrl;
        };
    
        /**
         * Setter for DownloadForwardVideoUrl
         * 
         * @param {string|null} value 
         */
        VehicleHarshEventResponse.prototype.setDownloadForwardVideoUrl = function (value) {
            this.downloadForwardVideoUrl = value;
        };
    
        /**
         * URL for downloading the inward facing video
         *
         * @return {string|null}
         */
        VehicleHarshEventResponse.prototype.getDownloadInwardVideoUrl = function () {
            return this.downloadInwardVideoUrl;
        };
    
        /**
         * Setter for DownloadInwardVideoUrl
         * 
         * @param {string|null} value 
         */
        VehicleHarshEventResponse.prototype.setDownloadInwardVideoUrl = function (value) {
            this.downloadInwardVideoUrl = value;
        };
    
        /**
         * URL for downloading the tracked inward facing video
         *
         * @return {string|null}
         */
        VehicleHarshEventResponse.prototype.getDownloadTrackedInwardVideoUrl = function () {
            return this.downloadTrackedInwardVideoUrl;
        };
    
        /**
         * Setter for DownloadTrackedInwardVideoUrl
         * 
         * @param {string|null} value 
         */
        VehicleHarshEventResponse.prototype.setDownloadTrackedInwardVideoUrl = function (value) {
            this.downloadTrackedInwardVideoUrl = value;
        };
    
        /**
         * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP
         * Brake, YC Engine, YC Brake, Harsh Event]
         *
         * @return {string}
         */
        VehicleHarshEventResponse.prototype.getHarshEventType = function () {
            return this.harshEventType;
        };
    
        /**
         * Setter for HarshEventType
         * 
         * @param {string} value 
         */
        VehicleHarshEventResponse.prototype.setHarshEventType = function (value) {
            this.harshEventType = value;
        };
    
        /**
         * URL of the associated incident report page
         *
         * @return {string}
         */
        VehicleHarshEventResponse.prototype.getIncidentReportUrl = function () {
            return this.incidentReportUrl;
        };
    
        /**
         * Setter for IncidentReportUrl
         * 
         * @param {string} value 
         */
        VehicleHarshEventResponse.prototype.setIncidentReportUrl = function (value) {
            this.incidentReportUrl = value;
        };
    
        /**
         * Whether the driver was deemed distracted during this harsh event
         *
         * @return {bool|null}
         */
        VehicleHarshEventResponse.prototype.getIsDistracted = function () {
            return this.isDistracted;
        };
    
        /**
         * Setter for IsDistracted
         * 
         * @param {bool|null} value 
         */
        VehicleHarshEventResponse.prototype.setIsDistracted = function (value) {
            this.isDistracted = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {Location|null}
         */
        VehicleHarshEventResponse.prototype.getLocation = function () {
            return this.location;
        };
    
        /**
         * Setter for Location
         * 
         * @param {Location|null} value 
         */
        VehicleHarshEventResponse.prototype.setLocation = function (value) {
            this.location = value;
        };
    
        return VehicleHarshEventResponse;
    }

}(angular));
