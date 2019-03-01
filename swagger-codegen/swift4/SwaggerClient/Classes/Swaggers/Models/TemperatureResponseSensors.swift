//
// TemperatureResponseSensors.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct TemperatureResponseSensors: Codable {

    /** Currently reported ambient temperature in millidegrees celsius. */
    public var ambientTemperature: Int?
    /** ID of the sensor. */
    public var _id: Int64?
    /** Name of the sensor. */
    public var name: String?
    /** Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported. */
    public var probeTemperature: Int?

    public init(ambientTemperature: Int?, _id: Int64?, name: String?, probeTemperature: Int?) {
        self.ambientTemperature = ambientTemperature
        self._id = _id
        self.name = name
        self.probeTemperature = probeTemperature
    }

    public enum CodingKeys: String, CodingKey { 
        case ambientTemperature
        case _id = "id"
        case name
        case probeTemperature
    }


}

