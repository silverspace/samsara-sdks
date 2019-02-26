/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DispatchJob
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('DispatchJob', ['BaseModel', DispatchJobModel]);

    function DispatchJobModel(BaseModel) {
        var DispatchJob = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.arrivedAtMs = this.getValue(obj.arrivedAtMs);
            this.completedAtMs = this.getValue(obj.completedAtMs);
            this.dispatchRouteId = this.getValue(obj.dispatchRouteId);
            this.driverId = this.getValue(obj.driverId);
            this.enRouteAtMs = this.getValue(obj.enRouteAtMs);
            this.estimatedArrivalMs = this.getValue(obj.estimatedArrivalMs);
            this.fleetViewerUrl = this.getValue(obj.fleetViewerUrl);
            this.groupId = this.getValue(obj.groupId);
            this.id = this.getValue(obj.id);
            this.jobState = this.getValue(obj.jobState);
            this.skippedAtMs = this.getValue(obj.skippedAtMs);
            this.vehicleId = this.getValue(obj.vehicleId);
            this.destinationAddress = this.getValue(obj.destinationAddress);
            this.destinationAddressId = this.getValue(obj.destinationAddressId);
            this.destinationLat = this.getValue(obj.destinationLat);
            this.destinationLng = this.getValue(obj.destinationLng);
            this.destinationName = this.getValue(obj.destinationName);
            this.notes = this.getValue(obj.notes);
            this.scheduledArrivalTimeMs = this.getValue(obj.scheduledArrivalTimeMs);
            this.scheduledDepartureTimeMs = this.getValue(obj.scheduledDepartureTimeMs);
        };

        DispatchJob.prototype = new BaseModel();
        DispatchJob.prototype.constructor = DispatchJob;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DispatchJob.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'arrivedAtMs', realName: 'arrived_at_ms' },
                { name: 'completedAtMs', realName: 'completed_at_ms' },
                { name: 'dispatchRouteId', realName: 'dispatch_route_id' },
                { name: 'driverId', realName: 'driver_id' },
                { name: 'enRouteAtMs', realName: 'en_route_at_ms' },
                { name: 'estimatedArrivalMs', realName: 'estimated_arrival_ms' },
                { name: 'fleetViewerUrl', realName: 'fleet_viewer_url' },
                { name: 'groupId', realName: 'group_id' },
                { name: 'id', realName: 'id' },
                { name: 'jobState', realName: 'job_state' },
                { name: 'skippedAtMs', realName: 'skipped_at_ms' },
                { name: 'vehicleId', realName: 'vehicle_id' },
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
        DispatchJob.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * The time at which the driver arrived at the job destination.
         *
         * @return {long|null}
         */
        DispatchJob.prototype.getArrivedAtMs = function () {
            return this.arrivedAtMs;
        };
    
        /**
         * Setter for ArrivedAtMs
         * 
         * @param {long|null} value 
         */
        DispatchJob.prototype.setArrivedAtMs = function (value) {
            this.arrivedAtMs = value;
        };
    
        /**
         * The time at which the job was marked complete (e.g. started driving to the next destination).
         *
         * @return {long|null}
         */
        DispatchJob.prototype.getCompletedAtMs = function () {
            return this.completedAtMs;
        };
    
        /**
         * Setter for CompletedAtMs
         * 
         * @param {long|null} value 
         */
        DispatchJob.prototype.setCompletedAtMs = function (value) {
            this.completedAtMs = value;
        };
    
        /**
         * ID of the route that this job belongs to.
         *
         * @return {long}
         */
        DispatchJob.prototype.getDispatchRouteId = function () {
            return this.dispatchRouteId;
        };
    
        /**
         * Setter for DispatchRouteId
         * 
         * @param {long} value 
         */
        DispatchJob.prototype.setDispatchRouteId = function (value) {
            this.dispatchRouteId = value;
        };
    
        /**
         * ID of the driver assigned to the dispatch job.
         *
         * @return {long|null}
         */
        DispatchJob.prototype.getDriverId = function () {
            return this.driverId;
        };
    
        /**
         * Setter for DriverId
         * 
         * @param {long|null} value 
         */
        DispatchJob.prototype.setDriverId = function (value) {
            this.driverId = value;
        };
    
        /**
         * The time at which the assigned driver started fulfilling the job (e.g. started driving to the
         * destination).
         *
         * @return {long|null}
         */
        DispatchJob.prototype.getEnRouteAtMs = function () {
            return this.enRouteAtMs;
        };
    
        /**
         * Setter for EnRouteAtMs
         * 
         * @param {long|null} value 
         */
        DispatchJob.prototype.setEnRouteAtMs = function (value) {
            this.enRouteAtMs = value;
        };
    
        /**
         * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-
         * route jobs.
         *
         * @return {long|null}
         */
        DispatchJob.prototype.getEstimatedArrivalMs = function () {
            return this.estimatedArrivalMs;
        };
    
        /**
         * Setter for EstimatedArrivalMs
         * 
         * @param {long|null} value 
         */
        DispatchJob.prototype.setEstimatedArrivalMs = function (value) {
            this.estimatedArrivalMs = value;
        };
    
        /**
         * Fleet viewer url of the dispatch job.
         *
         * @return {string|null}
         */
        DispatchJob.prototype.getFleetViewerUrl = function () {
            return this.fleetViewerUrl;
        };
    
        /**
         * Setter for FleetViewerUrl
         * 
         * @param {string|null} value 
         */
        DispatchJob.prototype.setFleetViewerUrl = function (value) {
            this.fleetViewerUrl = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {long}
         */
        DispatchJob.prototype.getGroupId = function () {
            return this.groupId;
        };
    
        /**
         * Setter for GroupId
         * 
         * @param {long} value 
         */
        DispatchJob.prototype.setGroupId = function (value) {
            this.groupId = value;
        };
    
        /**
         * ID of the Samsara dispatch job.
         *
         * @return {long}
         */
        DispatchJob.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {long} value 
         */
        DispatchJob.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * The current state of the dispatch job.
         *
         * @return {JobStatusEnum}
         */
        DispatchJob.prototype.getJobState = function () {
            return this.jobState;
        };
    
        /**
         * Setter for JobState
         * 
         * @param {JobStatusEnum} value 
         */
        DispatchJob.prototype.setJobState = function (value) {
            this.jobState = value;
        };
    
        /**
         * The time at which the job was marked skipped.
         *
         * @return {long|null}
         */
        DispatchJob.prototype.getSkippedAtMs = function () {
            return this.skippedAtMs;
        };
    
        /**
         * Setter for SkippedAtMs
         * 
         * @param {long|null} value 
         */
        DispatchJob.prototype.setSkippedAtMs = function (value) {
            this.skippedAtMs = value;
        };
    
        /**
         * ID of the vehicle used for the dispatch job.
         *
         * @return {long|null}
         */
        DispatchJob.prototype.getVehicleId = function () {
            return this.vehicleId;
        };
    
        /**
         * Setter for VehicleId
         * 
         * @param {long|null} value 
         */
        DispatchJob.prototype.setVehicleId = function (value) {
            this.vehicleId = value;
        };
    
        /**
         * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if
         * a valid destination address ID is provided.
         *
         * @return {string|null}
         */
        DispatchJob.prototype.getDestinationAddress = function () {
            return this.destinationAddress;
        };
    
        /**
         * Setter for DestinationAddress
         * 
         * @param {string|null} value 
         */
        DispatchJob.prototype.setDestinationAddress = function (value) {
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
        DispatchJob.prototype.getDestinationAddressId = function () {
            return this.destinationAddressId;
        };
    
        /**
         * Setter for DestinationAddressId
         * 
         * @param {long|null} value 
         */
        DispatchJob.prototype.setDestinationAddressId = function (value) {
            this.destinationAddressId = value;
        };
    
        /**
         * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
         *
         * @return {double|null}
         */
        DispatchJob.prototype.getDestinationLat = function () {
            return this.destinationLat;
        };
    
        /**
         * Setter for DestinationLat
         * 
         * @param {double|null} value 
         */
        DispatchJob.prototype.setDestinationLat = function (value) {
            this.destinationLat = value;
        };
    
        /**
         * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
         *
         * @return {double|null}
         */
        DispatchJob.prototype.getDestinationLng = function () {
            return this.destinationLng;
        };
    
        /**
         * Setter for DestinationLng
         * 
         * @param {double|null} value 
         */
        DispatchJob.prototype.setDestinationLng = function (value) {
            this.destinationLng = value;
        };
    
        /**
         * The name of the job destination. If provided, it will take precedence over the name of the address book
         * entry.
         *
         * @return {string|null}
         */
        DispatchJob.prototype.getDestinationName = function () {
            return this.destinationName;
        };
    
        /**
         * Setter for DestinationName
         * 
         * @param {string|null} value 
         */
        DispatchJob.prototype.setDestinationName = function (value) {
            this.destinationName = value;
        };
    
        /**
         * Notes regarding the details of this job.
         *
         * @return {string|null}
         */
        DispatchJob.prototype.getNotes = function () {
            return this.notes;
        };
    
        /**
         * Setter for Notes
         * 
         * @param {string|null} value 
         */
        DispatchJob.prototype.setNotes = function (value) {
            this.notes = value;
        };
    
        /**
         * The time at which the assigned driver is scheduled to arrive at the job destination.
         *
         * @return {long}
         */
        DispatchJob.prototype.getScheduledArrivalTimeMs = function () {
            return this.scheduledArrivalTimeMs;
        };
    
        /**
         * Setter for ScheduledArrivalTimeMs
         * 
         * @param {long} value 
         */
        DispatchJob.prototype.setScheduledArrivalTimeMs = function (value) {
            this.scheduledArrivalTimeMs = value;
        };
    
        /**
         * The time at which the assigned driver is scheduled to depart from the job destination.
         *
         * @return {long|null}
         */
        DispatchJob.prototype.getScheduledDepartureTimeMs = function () {
            return this.scheduledDepartureTimeMs;
        };
    
        /**
         * Setter for ScheduledDepartureTimeMs
         * 
         * @param {long|null} value 
         */
        DispatchJob.prototype.setScheduledDepartureTimeMs = function (value) {
            this.scheduledDepartureTimeMs = value;
        };
    
        return DispatchJob;
    }

}(angular));