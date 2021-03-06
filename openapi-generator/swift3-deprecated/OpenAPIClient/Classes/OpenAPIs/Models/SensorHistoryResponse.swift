//
// SensorHistoryResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair. */
open class SensorHistoryResponse: JSONEncodable {

    public var results: [SensorHistoryResponseResults]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["results"] = self.results?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

