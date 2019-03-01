//
// VehicleMaintenanceJ1939.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** J1939 based data. Null if no data is available. */

public struct VehicleMaintenanceJ1939: Codable {

    public var checkEngineLight: VehicleMaintenanceJ1939CheckEngineLight?
    /** J1939 DTCs. */
    public var diagnosticTroubleCodes: [VehicleMaintenanceJ1939DiagnosticTroubleCodes]?

    public init(checkEngineLight: VehicleMaintenanceJ1939CheckEngineLight?, diagnosticTroubleCodes: [VehicleMaintenanceJ1939DiagnosticTroubleCodes]?) {
        self.checkEngineLight = checkEngineLight
        self.diagnosticTroubleCodes = diagnosticTroubleCodes
    }


}

