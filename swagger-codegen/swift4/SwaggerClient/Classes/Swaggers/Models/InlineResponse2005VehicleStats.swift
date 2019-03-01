//
// InlineResponse2005VehicleStats.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct InlineResponse2005VehicleStats: Codable {

    public var auxInput1: AuxInputSeries?
    public var auxInput2: AuxInputSeries?
    public var engineState: [EngineState]?
    /** ID of the vehicle. */
    public var vehicleId: Int64

    public init(auxInput1: AuxInputSeries?, auxInput2: AuxInputSeries?, engineState: [EngineState]?, vehicleId: Int64) {
        self.auxInput1 = auxInput1
        self.auxInput2 = auxInput2
        self.engineState = engineState
        self.vehicleId = vehicleId
    }


}

