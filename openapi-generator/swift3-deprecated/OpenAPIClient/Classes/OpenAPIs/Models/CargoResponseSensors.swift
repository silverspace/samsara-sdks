//
// CargoResponseSensors.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class CargoResponseSensors: JSONEncodable {

    /** Flag indicating whether the current cargo is empty or loaded. */
    public var cargoEmpty: Bool?
    /** Name of the sensor. */
    public var name: String?
    /** ID of the sensor. */
    public var id: Int64?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["cargoEmpty"] = self.cargoEmpty
        nillableDictionary["name"] = self.name
        nillableDictionary["id"] = self.id?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

