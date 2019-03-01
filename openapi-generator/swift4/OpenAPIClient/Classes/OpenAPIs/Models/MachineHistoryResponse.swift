//
// MachineHistoryResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains the results for a machine history request */

public struct MachineHistoryResponse: Codable {

    public var machines: [MachineHistoryResponseMachines]?

    public init(machines: [MachineHistoryResponseMachines]?) {
        self.machines = machines
    }


}

