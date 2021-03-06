//
// CargoResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Contains the current cargo status of a sensor. */

public struct CargoResponse: Codable {

    public var groupId: Int64?
    public var sensors: [CargoResponseSensors]?

    public init(groupId: Int64?, sensors: [CargoResponseSensors]?) {
        self.groupId = groupId
        self.sensors = sensors
    }


}

