//
// CargoResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
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

