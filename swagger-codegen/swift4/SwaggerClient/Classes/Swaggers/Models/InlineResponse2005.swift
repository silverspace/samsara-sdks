//
// InlineResponse2005.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct InlineResponse2005: Codable {

    public var pagination: Pagination?
    public var vehicleStats: [InlineResponse2005VehicleStats]

    public init(pagination: Pagination?, vehicleStats: [InlineResponse2005VehicleStats]) {
        self.pagination = pagination
        self.vehicleStats = vehicleStats
    }


}

