//
// SensorHistoryResponseResults.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct SensorHistoryResponseResults: Codable {

    /** List of datapoints, one for each requested (sensor, field) pair. */
    public var series: [Int64]?
    /** Timestamp in UNIX milliseconds. */
    public var timeMs: Int?

    public init(series: [Int64]?, timeMs: Int?) {
        self.series = series
        self.timeMs = timeMs
    }


}

