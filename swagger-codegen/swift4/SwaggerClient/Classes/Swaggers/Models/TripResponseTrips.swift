//
// TripResponseTrips.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct TripResponseTrips: Codable {

    /** Length of the trip in meters. */
    public var distanceMeters: Int?
    /** ID of the driver. */
    public var driverId: Int?
    /** Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. */
    public var endAddress: String?
    public var endCoordinates: TripResponseEndCoordinates?
    /** Geocoded street address of start (latitude, longitude) coordinates. */
    public var endLocation: String?
    /** End of the trip in UNIX milliseconds. */
    public var endMs: Int?
    /** Odometer reading at the end of the trip. */
    public var endOdometer: Int?
    /** Amount in milliliters of fuel consumed on this trip. */
    public var fuelConsumedMl: Int?
    /** Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. */
    public var startAddress: String?
    public var startCoordinates: TripResponseStartCoordinates?
    /** Geocoded street address of start (latitude, longitude) coordinates. */
    public var startLocation: String?
    /** Beginning of the trip in UNIX milliseconds. */
    public var startMs: Int?
    /** Odometer reading at the beginning of the trip. */
    public var startOdometer: Int?
    /** Length in meters trip spent on toll roads. */
    public var tollMeters: Int?

    public init(distanceMeters: Int?, driverId: Int?, endAddress: String?, endCoordinates: TripResponseEndCoordinates?, endLocation: String?, endMs: Int?, endOdometer: Int?, fuelConsumedMl: Int?, startAddress: String?, startCoordinates: TripResponseStartCoordinates?, startLocation: String?, startMs: Int?, startOdometer: Int?, tollMeters: Int?) {
        self.distanceMeters = distanceMeters
        self.driverId = driverId
        self.endAddress = endAddress
        self.endCoordinates = endCoordinates
        self.endLocation = endLocation
        self.endMs = endMs
        self.endOdometer = endOdometer
        self.fuelConsumedMl = fuelConsumedMl
        self.startAddress = startAddress
        self.startCoordinates = startCoordinates
        self.startLocation = startLocation
        self.startMs = startMs
        self.startOdometer = startOdometer
        self.tollMeters = tollMeters
    }


}

