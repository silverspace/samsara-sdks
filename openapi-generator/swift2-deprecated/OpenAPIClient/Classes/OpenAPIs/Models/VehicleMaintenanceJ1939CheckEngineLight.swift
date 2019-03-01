//
// VehicleMaintenanceJ1939CheckEngineLight.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** J1939 check engine lights. */
public class VehicleMaintenanceJ1939CheckEngineLight: JSONEncodable {
    public var protectIsOn: Bool?
    public var stopIsOn: Bool?
    public var warningIsOn: Bool?
    public var emissionsIsOn: Bool?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["protectIsOn"] = self.protectIsOn
        nillableDictionary["stopIsOn"] = self.stopIsOn
        nillableDictionary["warningIsOn"] = self.warningIsOn
        nillableDictionary["emissionsIsOn"] = self.emissionsIsOn
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}