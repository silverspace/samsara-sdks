//
// VehicleLocation.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Contains the location, in latitude and longitude, of a vehicle. */

public struct VehicleLocation: Codable {

    /** Heading in degrees. */
    public var heading: Double?
    /** ID of the vehicle. */
    public var _id: Int64
    /** Latitude in decimal degrees. */
    public var latitude: Double?
    /** Text representation of nearest identifiable location to (latitude, longitude) coordinates. */
    public var location: String?
    /** Longitude in decimal degrees. */
    public var longitude: Double?
    /** Name of the vehicle. */
    public var name: String?
    /** The number of meters reported by the odometer. */
    public var odometerMeters: Int64?
    /** Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. */
    public var onTrip: Bool?
    /** Speed in miles per hour. */
    public var speed: Double?
    /** The time the reported location was logged, reported as a UNIX timestamp in milliseconds. */
    public var time: Int?
    /** Vehicle Identification Number (VIN) of the vehicle. */
    public var vin: String?

    public init(heading: Double?, _id: Int64, latitude: Double?, location: String?, longitude: Double?, name: String?, odometerMeters: Int64?, onTrip: Bool?, speed: Double?, time: Int?, vin: String?) {
        self.heading = heading
        self._id = _id
        self.latitude = latitude
        self.location = location
        self.longitude = longitude
        self.name = name
        self.odometerMeters = odometerMeters
        self.onTrip = onTrip
        self.speed = speed
        self.time = time
        self.vin = vin
    }

    public enum CodingKeys: String, CodingKey { 
        case heading
        case _id = "id"
        case latitude
        case location
        case longitude
        case name
        case odometerMeters
        case onTrip
        case speed
        case time
        case vin
    }


}
