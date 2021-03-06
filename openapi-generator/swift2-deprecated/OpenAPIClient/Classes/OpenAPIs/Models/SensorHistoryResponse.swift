//
// SensorHistoryResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair. */
public class SensorHistoryResponse: JSONEncodable {
    public var results: [SensorHistoryResponseResults]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["results"] = self.results?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
