//
// InlineResponse2008.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class InlineResponse2008: JSONEncodable {
    public var sensors: [Sensor]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["sensors"] = self.sensors?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
