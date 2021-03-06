//
// VehicleMaintenanceJ1939CheckEngineLight.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** J1939 check engine lights. */

public struct VehicleMaintenanceJ1939CheckEngineLight: Codable {

    public var protectIsOn: Bool?
    public var stopIsOn: Bool?
    public var warningIsOn: Bool?
    public var emissionsIsOn: Bool?

    public init(protectIsOn: Bool?, stopIsOn: Bool?, warningIsOn: Bool?, emissionsIsOn: Bool?) {
        self.protectIsOn = protectIsOn
        self.stopIsOn = stopIsOn
        self.warningIsOn = warningIsOn
        self.emissionsIsOn = emissionsIsOn
    }


}

