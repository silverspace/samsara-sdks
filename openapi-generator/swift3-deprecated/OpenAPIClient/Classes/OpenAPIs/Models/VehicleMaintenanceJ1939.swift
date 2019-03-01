//
// VehicleMaintenanceJ1939.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** J1939 based data. Null if no data is available. */
open class VehicleMaintenanceJ1939: JSONEncodable {

    public var checkEngineLight: VehicleMaintenanceJ1939CheckEngineLight?
    /** J1939 DTCs. */
    public var diagnosticTroubleCodes: [VehicleMaintenanceJ1939DiagnosticTroubleCodes]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["checkEngineLight"] = self.checkEngineLight?.encodeToJSON()
        nillableDictionary["diagnosticTroubleCodes"] = self.diagnosticTroubleCodes?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

