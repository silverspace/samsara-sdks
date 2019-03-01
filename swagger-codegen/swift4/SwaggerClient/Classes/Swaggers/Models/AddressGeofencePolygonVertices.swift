//
// AddressGeofencePolygonVertices.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct AddressGeofencePolygonVertices: Codable {

    /** The longitude of a geofence vertex */
    public var latitude: Double?
    /** The longitude of a geofence vertex */
    public var longitude: Double?

    public init(latitude: Double?, longitude: Double?) {
        self.latitude = latitude
        self.longitude = longitude
    }


}

