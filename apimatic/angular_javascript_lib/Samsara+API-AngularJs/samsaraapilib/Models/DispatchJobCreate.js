/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DispatchJobCreate
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('DispatchJobCreate', ['BaseModel', DispatchJobCreateModel]);

    function DispatchJobCreateModel(BaseModel) {
        var DispatchJobCreate = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.destinationAddress = this.getValue(obj.destinationAddress);
            this.destinationAddressId = this.getValue(obj.destinationAddressId);
            this.destinationLat = this.getValue(obj.destinationLat);
            this.destinationLng = this.getValue(obj.destinationLng);
            this.destinationName = this.getValue(obj.destinationName);
            this.notes = this.getValue(obj.notes);
            this.scheduledArrivalTimeMs = this.getValue(obj.scheduledArrivalTimeMs);
            this.scheduledDepartureTimeMs = this.getValue(obj.scheduledDepartureTimeMs);
        };

        DispatchJobCreate.prototype = new BaseModel();
        DispatchJobCreate.prototype.constructor = DispatchJobCreate;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DispatchJobCreate.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'destinationAddress', realName: 'destination_address' },
                { name: 'destinationAddressId', realName: 'destination_address_id' },
                { name: 'destinationLat', realName: 'destination_lat' },
                { name: 'destinationLng', realName: 'destination_lng' },
                { name: 'destinationName', realName: 'destination_name' },
                { name: 'notes', realName: 'notes' },
                { name: 'scheduledArrivalTimeMs', realName: 'scheduled_arrival_time_ms' },
                { name: 'scheduledDepartureTimeMs', realName: 'scheduled_departure_time_ms' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        DispatchJobCreate.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if
         * a valid destination address ID is provided.
         *
         * @return {string|null}
         */
        DispatchJobCreate.prototype.getDestinationAddress = function () {
            return this.destinationAddress;
        };
    
        /**
         * Setter for DestinationAddress
         * 
         * @param {string|null} value 
         */
        DispatchJobCreate.prototype.setDestinationAddress = function (value) {
            this.destinationAddress = value;
        };
    
        /**
         * ID of the job destination associated with an address book entry. Optional if valid values are provided
         * for destination address or latitude/longitude. If a valid destination address ID is provided,
         * address/latitude/longitude will be used from the address book entry. Name of the address book entry will
         * only be used if the destination name is not provided.
         *
         * @return {long|null}
         */
        DispatchJobCreate.prototype.getDestinationAddressId = function () {
            return this.destinationAddressId;
        };
    
        /**
         * Setter for DestinationAddressId
         * 
         * @param {long|null} value 
         */
        DispatchJobCreate.prototype.setDestinationAddressId = function (value) {
            this.destinationAddressId = value;
        };
    
        /**
         * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
         *
         * @return {double|null}
         */
        DispatchJobCreate.prototype.getDestinationLat = function () {
            return this.destinationLat;
        };
    
        /**
         * Setter for DestinationLat
         * 
         * @param {double|null} value 
         */
        DispatchJobCreate.prototype.setDestinationLat = function (value) {
            this.destinationLat = value;
        };
    
        /**
         * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
         *
         * @return {double|null}
         */
        DispatchJobCreate.prototype.getDestinationLng = function () {
            return this.destinationLng;
        };
    
        /**
         * Setter for DestinationLng
         * 
         * @param {double|null} value 
         */
        DispatchJobCreate.prototype.setDestinationLng = function (value) {
            this.destinationLng = value;
        };
    
        /**
         * The name of the job destination. If provided, it will take precedence over the name of the address book
         * entry.
         *
         * @return {string|null}
         */
        DispatchJobCreate.prototype.getDestinationName = function () {
            return this.destinationName;
        };
    
        /**
         * Setter for DestinationName
         * 
         * @param {string|null} value 
         */
        DispatchJobCreate.prototype.setDestinationName = function (value) {
            this.destinationName = value;
        };
    
        /**
         * Notes regarding the details of this job.
         *
         * @return {string|null}
         */
        DispatchJobCreate.prototype.getNotes = function () {
            return this.notes;
        };
    
        /**
         * Setter for Notes
         * 
         * @param {string|null} value 
         */
        DispatchJobCreate.prototype.setNotes = function (value) {
            this.notes = value;
        };
    
        /**
         * The time at which the assigned driver is scheduled to arrive at the job destination.
         *
         * @return {long}
         */
        DispatchJobCreate.prototype.getScheduledArrivalTimeMs = function () {
            return this.scheduledArrivalTimeMs;
        };
    
        /**
         * Setter for ScheduledArrivalTimeMs
         * 
         * @param {long} value 
         */
        DispatchJobCreate.prototype.setScheduledArrivalTimeMs = function (value) {
            this.scheduledArrivalTimeMs = value;
        };
    
        /**
         * The time at which the assigned driver is scheduled to depart from the job destination.
         *
         * @return {long|null}
         */
        DispatchJobCreate.prototype.getScheduledDepartureTimeMs = function () {
            return this.scheduledDepartureTimeMs;
        };
    
        /**
         * Setter for ScheduledDepartureTimeMs
         * 
         * @param {long|null} value 
         */
        DispatchJobCreate.prototype.setScheduledDepartureTimeMs = function (value) {
            this.scheduledDepartureTimeMs = value;
        };
    
        return DispatchJobCreate;
    }

}(angular));
