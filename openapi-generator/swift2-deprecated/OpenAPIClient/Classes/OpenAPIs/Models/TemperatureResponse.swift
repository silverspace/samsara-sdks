//
// TemperatureResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains the current temperatures of a sensor. */
public class TemperatureResponse: JSONEncodable {
    public var groupId: Int64?
    public var sensors: [TemperatureResponseSensors]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["groupId"] = self.groupId?.encodeToJSON()
        nillableDictionary["sensors"] = self.sensors?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
