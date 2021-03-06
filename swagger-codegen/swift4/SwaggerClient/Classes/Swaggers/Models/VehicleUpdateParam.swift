//
// VehicleUpdateParam.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct VehicleUpdateParam: Codable {

    /** Group ID to query. */
    public var groupId: Int64
    public var vehicles: [Vehicle]

    public init(groupId: Int64, vehicles: [Vehicle]) {
        self.groupId = groupId
        self.vehicles = vehicles
    }


}

