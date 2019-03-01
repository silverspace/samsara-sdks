//
// AssetLocationResponseInner.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Asset location details. */

public struct AssetLocationResponseInner: Codable {

    /** The latitude of the location in degrees. */
    public var latitude: Double?
    /** The best effort (street,city,state) for the latitude and longitude. */
    public var location: String?
    /** The longitude of the location in degrees. */
    public var longitude: Double?
    /** The speed calculated from GPS that the asset was traveling at in miles per hour. */
    public var speedMilesPerHour: Double?
    /** Time in Unix milliseconds since epoch when the asset was at the location. */
    public var time: Double?

    public init(latitude: Double?, location: String?, longitude: Double?, speedMilesPerHour: Double?, time: Double?) {
        self.latitude = latitude
        self.location = location
        self.longitude = longitude
        self.speedMilesPerHour = speedMilesPerHour
        self.time = time
    }


}

