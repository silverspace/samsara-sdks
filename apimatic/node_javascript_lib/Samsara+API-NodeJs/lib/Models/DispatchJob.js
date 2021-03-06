/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of DispatchJob
 */
class DispatchJob extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.arrivedAtMs = this.constructor.getValue(obj.arrivedAtMs || obj.arrived_at_ms);
        this.completedAtMs = this.constructor.getValue(obj.completedAtMs || obj.completed_at_ms);
        this.dispatchRouteId =
          this.constructor.getValue(obj.dispatchRouteId
     || obj.dispatch_route_id);
        this.driverId = this.constructor.getValue(obj.driverId || obj.driver_id);
        this.enRouteAtMs = this.constructor.getValue(obj.enRouteAtMs || obj.en_route_at_ms);
        this.estimatedArrivalMs =
          this.constructor.getValue(obj.estimatedArrivalMs
     || obj.estimated_arrival_ms);
        this.fleetViewerUrl = this.constructor.getValue(obj.fleetViewerUrl || obj.fleet_viewer_url);
        this.groupId = this.constructor.getValue(obj.groupId || obj.group_id);
        this.id = this.constructor.getValue(obj.id);
        this.jobState = this.constructor.getValue(obj.jobState || obj.job_state);
        this.skippedAtMs = this.constructor.getValue(obj.skippedAtMs || obj.skipped_at_ms);
        this.vehicleId = this.constructor.getValue(obj.vehicleId || obj.vehicle_id);
        this.destinationAddress =
          this.constructor.getValue(obj.destinationAddress
     || obj.destination_address);
        this.destinationAddressId =
          this.constructor.getValue(obj.destinationAddressId
     || obj.destination_address_id);
        this.destinationLat = this.constructor.getValue(obj.destinationLat || obj.destination_lat);
        this.destinationLng = this.constructor.getValue(obj.destinationLng || obj.destination_lng);
        this.destinationName =
          this.constructor.getValue(obj.destinationName
     || obj.destination_name);
        this.notes = this.constructor.getValue(obj.notes);
        this.scheduledArrivalTimeMs =
          this.constructor.getValue(obj.scheduledArrivalTimeMs
     || obj.scheduled_arrival_time_ms);
        this.scheduledDepartureTimeMs =
          this.constructor.getValue(obj.scheduledDepartureTimeMs
     || obj.scheduled_departure_time_ms);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
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
            { name: 'scheduledDepartureTimeMs', realName: 'scheduled_departure_time_ms' },
        ]);
    }

    /**
     * Function containing information about discriminator values
     * mapped with their corresponding model class names
     *
     * @return   {object}  Object containing Key-Value pairs mapping discriminator
     *                     values with their corresponding model classes
     */
    static discriminatorMap() {
        return {};
    }
}

module.exports = DispatchJob;
