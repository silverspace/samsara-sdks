//
// HumidityResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains the current humidity of a sensor. */
public class HumidityResponse: JSONEncodable {
    public var groupId: Int64?
    public var sensors: [HumidityResponseSensors]?

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
