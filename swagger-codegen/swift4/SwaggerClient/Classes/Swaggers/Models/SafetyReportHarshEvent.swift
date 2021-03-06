//
// SafetyReportHarshEvent.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** List of harsh events */

public struct SafetyReportHarshEvent: Codable {

    /** Type of the harsh event */
    public var harshEventType: String?
    /** Timestamp that the harsh event occurred in Unix milliseconds since epoch */
    public var timestampMs: Int?
    /** Vehicle associated with the harsh event */
    public var vehicleId: Int?

    public init(harshEventType: String?, timestampMs: Int?, vehicleId: Int?) {
        self.harshEventType = harshEventType
        self.timestampMs = timestampMs
        self.vehicleId = vehicleId
    }


}

