//
// SensorHistoryResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair. */

public struct SensorHistoryResponse: Codable {

    public var results: [SensorHistoryResponseResults]?

    public init(results: [SensorHistoryResponseResults]?) {
        self.results = results
    }


}

