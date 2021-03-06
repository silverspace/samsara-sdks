//
// HumidityResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains the current humidity of a sensor. */
open class HumidityResponse: JSONEncodable {

    public var groupId: Int64?
    public var sensors: [HumidityResponseSensors]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["groupId"] = self.groupId?.encodeToJSON()
        nillableDictionary["sensors"] = self.sensors?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

