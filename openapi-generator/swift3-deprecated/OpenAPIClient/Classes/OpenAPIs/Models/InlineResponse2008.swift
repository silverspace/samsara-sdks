//
// InlineResponse2008.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class InlineResponse2008: JSONEncodable {

    public var sensors: [Sensor]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["sensors"] = self.sensors?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

