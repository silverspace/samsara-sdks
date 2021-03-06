/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DispatchRoute
 *
 * @constructor
 */
angular.module('SamsaraAPILib')
    .factory('DispatchRoute', ['BaseModel', DispatchRouteModel]);

    function DispatchRouteModel(BaseModel) {
        var DispatchRoute = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.dispatchJobs = this.getValue(obj.dispatchJobs);
            this.id = this.getValue(obj.id);
            this.actualEndMs = this.getValue(obj.actualEndMs);
            this.actualStartMs = this.getValue(obj.actualStartMs);
            this.driverId = this.getValue(obj.driverId);
            this.groupId = this.getValue(obj.groupId);
            this.name = this.getValue(obj.name);
            this.scheduledEndMs = this.getValue(obj.scheduledEndMs);
            this.scheduledMeters = this.getValue(obj.scheduledMeters);
            this.scheduledStartMs = this.getValue(obj.scheduledStartMs);
            this.startLocationAddress = this.getValue(obj.startLocationAddress);
            this.startLocationAddressId = this.getValue(obj.startLocationAddressId);
            this.startLocationLat = this.getValue(obj.startLocationLat);
            this.startLocationLng = this.getValue(obj.startLocationLng);
            this.startLocationName = this.getValue(obj.startLocationName);
            this.trailerId = this.getValue(obj.trailerId);
            this.vehicleId = this.getValue(obj.vehicleId);
        };

        DispatchRoute.prototype = new BaseModel();
        DispatchRoute.prototype.constructor = DispatchRoute;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DispatchRoute.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'dispatchJobs', realName: 'dispatch_jobs', array: true, type: 'DispatchJob' },
                { name: 'id', realName: 'id' },
                { name: 'actualEndMs', realName: 'actual_end_ms' },
                { name: 'actualStartMs', realName: 'actual_start_ms' },
                { name: 'driverId', realName: 'driver_id' },
                { name: 'groupId', realName: 'group_id' },
                { name: 'name', realName: 'name' },
                { name: 'scheduledEndMs', realName: 'scheduled_end_ms' },
                { name: 'scheduledMeters', realName: 'scheduled_meters' },
                { name: 'scheduledStartMs', realName: 'scheduled_start_ms' },
                { name: 'startLocationAddress', realName: 'start_location_address' },
                { name: 'startLocationAddressId', realName: 'start_location_address_id' },
                { name: 'startLocationLat', realName: 'start_location_lat' },
                { name: 'startLocationLng', realName: 'start_location_lng' },
                { name: 'startLocationName', realName: 'start_location_name' },
                { name: 'trailerId', realName: 'trailer_id' },
                { name: 'vehicleId', realName: 'vehicle_id' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        DispatchRoute.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * The dispatch jobs associated with this route.
         *
         * @return {array}
         */
        DispatchRoute.prototype.getDispatchJobs = function () {
            return this.dispatchJobs;
        };
    
        /**
         * Setter for DispatchJobs
         * 
         * @param {array} value 
         */
        DispatchRoute.prototype.setDispatchJobs = function (value) {
            this.dispatchJobs = value;
        };
    
        /**
         * ID of the Samsara dispatch route.
         *
         * @return {long}
         */
        DispatchRoute.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {long} value 
         */
        DispatchRoute.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * The time in Unix epoch milliseconds that the route actually ended.
         *
         * @return {long|null}
         */
        DispatchRoute.prototype.getActualEndMs = function () {
            return this.actualEndMs;
        };
    
        /**
         * Setter for ActualEndMs
         * 
         * @param {long|null} value 
         */
        DispatchRoute.prototype.setActualEndMs = function (value) {
            this.actualEndMs = value;
        };
    
        /**
         * The time in Unix epoch milliseconds that the route actually started.
         *
         * @return {long|null}
         */
        DispatchRoute.prototype.getActualStartMs = function () {
            return this.actualStartMs;
        };
    
        /**
         * Setter for ActualStartMs
         * 
         * @param {long|null} value 
         */
        DispatchRoute.prototype.setActualStartMs = function (value) {
            this.actualStartMs = value;
        };
    
        /**
         * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually
         * exclusive. If neither is specified, then the route is unassigned.
         *
         * @return {long|null}
         */
        DispatchRoute.prototype.getDriverId = function () {
            return this.driverId;
        };
    
        /**
         * Setter for DriverId
         * 
         * @param {long|null} value 
         */
        DispatchRoute.prototype.setDriverId = function (value) {
            this.driverId = value;
        };
    
        /**
         * ID of the group if the organization has multiple groups (optional).
         *
         * @return {long|null}
         */
        DispatchRoute.prototype.getGroupId = function () {
            return this.groupId;
        };
    
        /**
         * Setter for GroupId
         * 
         * @param {long|null} value 
         */
        DispatchRoute.prototype.setGroupId = function (value) {
            this.groupId = value;
        };
    
        /**
         * Descriptive name of this route.
         *
         * @return {string}
         */
        DispatchRoute.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string} value 
         */
        DispatchRoute.prototype.setName = function (value) {
            this.name = value;
        };
    
        /**
         * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
         *
         * @return {long}
         */
        DispatchRoute.prototype.getScheduledEndMs = function () {
            return this.scheduledEndMs;
        };
    
        /**
         * Setter for ScheduledEndMs
         * 
         * @param {long} value 
         */
        DispatchRoute.prototype.setScheduledEndMs = function (value) {
            this.scheduledEndMs = value;
        };
    
        /**
         * The distance expected to be traveled for this route in meters.
         *
         * @return {long|null}
         */
        DispatchRoute.prototype.getScheduledMeters = function () {
            return this.scheduledMeters;
        };
    
        /**
         * Setter for ScheduledMeters
         * 
         * @param {long|null} value 
         */
        DispatchRoute.prototype.setScheduledMeters = function (value) {
            this.scheduledMeters = value;
        };
    
        /**
         * The time in Unix epoch milliseconds that the route is scheduled to start.
         *
         * @return {long}
         */
        DispatchRoute.prototype.getScheduledStartMs = function () {
            return this.scheduledStartMs;
        };
    
        /**
         * Setter for ScheduledStartMs
         * 
         * @param {long} value 
         */
        DispatchRoute.prototype.setScheduledStartMs = function (value) {
            this.scheduledStartMs = value;
        };
    
        /**
         * The address of the route's starting location, as it would be recognized if provided to maps.google.com.
         * Optional if a valid start location address ID is provided.
         *
         * @return {string|null}
         */
        DispatchRoute.prototype.getStartLocationAddress = function () {
            return this.startLocationAddress;
        };
    
        /**
         * Setter for StartLocationAddress
         * 
         * @param {string|null} value 
         */
        DispatchRoute.prototype.setStartLocationAddress = function (value) {
            this.startLocationAddress = value;
        };
    
        /**
         * ID of the start location associated with an address book entry. Optional if valid values are provided for
         * start location address or latitude/longitude. If a valid start location address ID is provided,
         * address/latitude/longitude will be used from the address book entry. Name of the address book entry will
         * only be used if the start location name is not provided.
         *
         * @return {long|null}
         */
        DispatchRoute.prototype.getStartLocationAddressId = function () {
            return this.startLocationAddressId;
        };
    
        /**
         * Setter for StartLocationAddressId
         * 
         * @param {long|null} value 
         */
        DispatchRoute.prototype.setStartLocationAddressId = function (value) {
            this.startLocationAddressId = value;
        };
    
        /**
         * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is
         * provided.
         *
         * @return {double|null}
         */
        DispatchRoute.prototype.getStartLocationLat = function () {
            return this.startLocationLat;
        };
    
        /**
         * Setter for StartLocationLat
         * 
         * @param {double|null} value 
         */
        DispatchRoute.prototype.setStartLocationLat = function (value) {
            this.startLocationLat = value;
        };
    
        /**
         * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is
         * provided.
         *
         * @return {double|null}
         */
        DispatchRoute.prototype.getStartLocationLng = function () {
            return this.startLocationLng;
        };
    
        /**
         * Setter for StartLocationLng
         * 
         * @param {double|null} value 
         */
        DispatchRoute.prototype.setStartLocationLng = function (value) {
            this.startLocationLng = value;
        };
    
        /**
         * The name of the route's starting location. If provided, it will take precedence over the name of the
         * address book entry.
         *
         * @return {string|null}
         */
        DispatchRoute.prototype.getStartLocationName = function () {
            return this.startLocationName;
        };
    
        /**
         * Setter for StartLocationName
         * 
         * @param {string|null} value 
         */
        DispatchRoute.prototype.setStartLocationName = function (value) {
            this.startLocationName = value;
        };
    
        /**
         * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that
         * have a Vehicle or Driver assigned to them.
         *
         * @return {long|null}
         */
        DispatchRoute.prototype.getTrailerId = function () {
            return this.trailerId;
        };
    
        /**
         * Setter for TrailerId
         * 
         * @param {long|null} value 
         */
        DispatchRoute.prototype.setTrailerId = function (value) {
            this.trailerId = value;
        };
    
        /**
         * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually
         * exclusive. If neither is specified, then the route is unassigned.
         *
         * @return {long|null}
         */
        DispatchRoute.prototype.getVehicleId = function () {
            return this.vehicleId;
        };
    
        /**
         * Setter for VehicleId
         * 
         * @param {long|null} value 
         */
        DispatchRoute.prototype.setVehicleId = function (value) {
            this.vehicleId = value;
        };
    
        return DispatchRoute;
    }

}(angular));
