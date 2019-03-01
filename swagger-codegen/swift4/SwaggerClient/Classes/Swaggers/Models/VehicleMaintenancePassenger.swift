//
// VehicleMaintenancePassenger.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
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
