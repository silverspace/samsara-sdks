//
// MachineHistoryResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Contains the results for a machine history request */

public struct MachineHistoryResponse: Codable {

    public var machines: [MachineHistoryResponseMachines]?

    public init(machines: [MachineHistoryResponseMachines]?) {
        self.machines = machines
    }


}

