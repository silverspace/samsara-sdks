//
// VehicleMaintenanceJ1939CheckEngineLight.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** J1939 check engine lights. */
open class VehicleMaintenanceJ1939CheckEngineLight: JSONEncodable {

    public var protectIsOn: Bool?
    public var stopIsOn: Bool?
    public var warningIsOn: Bool?
    public var emissionsIsOn: Bool?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["protectIsOn"] = self.protectIsOn
        nillableDictionary["stopIsOn"] = self.stopIsOn
        nillableDictionary["warningIsOn"] = self.warningIsOn
        nillableDictionary["emissionsIsOn"] = self.emissionsIsOn

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
