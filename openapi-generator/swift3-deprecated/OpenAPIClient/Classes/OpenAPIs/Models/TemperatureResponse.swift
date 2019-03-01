//
// TemperatureResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains the current temperatures of a sensor. */
open class TemperatureResponse: JSONEncodable {

    public var groupId: Int64?
    public var sensors: [TemperatureResponseSensors]?

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
