//
// Sensor.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains information about a sensor. */
open class Sensor: JSONEncodable {

    /** ID of the sensor. */
    public var id: Int64?
    /** MAC address of the sensor. */
    public var macAddress: String?
    /** Name of the sensor. */
    public var name: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["macAddress"] = self.macAddress
        nillableDictionary["name"] = self.name

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

