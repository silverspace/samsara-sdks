//
// InlineResponse2007.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class InlineResponse2007: JSONEncodable {
    public var machines: [Machine]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["machines"] = self.machines?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}