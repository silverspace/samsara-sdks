//
// Sensor.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Contains information about a sensor. */

public struct Sensor: Codable {

    /** ID of the sensor. */
    public var _id: Int64
    /** MAC address of the sensor. */
    public var macAddress: String?
    /** Name of the sensor. */
    public var name: String?

    public init(_id: Int64, macAddress: String?, name: String?) {
        self._id = _id
        self.macAddress = macAddress
        self.name = name
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case macAddress
        case name
    }


}

