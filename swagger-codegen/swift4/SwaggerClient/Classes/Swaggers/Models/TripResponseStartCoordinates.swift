//
// TripResponseStartCoordinates.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Start (latitude, longitude) in decimal degrees. */

public struct TripResponseStartCoordinates: Codable {

    public var latitude: Double?
    public var longitude: Double?

    public init(latitude: Double?, longitude: Double?) {
        self.latitude = latitude
        self.longitude = longitude
    }


}
