//
// VehicleMaintenancePassenger.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Passenger vehicle data. Null if no data is available. */

public struct VehicleMaintenancePassenger: Codable {

    public var checkEngineLight: VehicleMaintenancePassengerCheckEngineLight?
    /** Passenger vehicle DTCs. */
    public var diagnosticTroubleCodes: [VehicleMaintenancePassengerDiagnosticTroubleCodes]?

    public init(checkEngineLight: VehicleMaintenancePassengerCheckEngineLight?, diagnosticTroubleCodes: [VehicleMaintenancePassengerDiagnosticTroubleCodes]?) {
        self.checkEngineLight = checkEngineLight
        self.diagnosticTroubleCodes = diagnosticTroubleCodes
    }


}
