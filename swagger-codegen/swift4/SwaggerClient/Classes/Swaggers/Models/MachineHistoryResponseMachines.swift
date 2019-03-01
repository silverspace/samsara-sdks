//
// MachineHistoryResponseMachines.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct MachineHistoryResponseMachines: Codable {

    /** Machine ID */
    public var _id: Int?
    /** Machine name */
    public var name: String?
    /** List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s */
    public var vibrations: [MachineHistoryResponseVibrations]?

    public init(_id: Int?, name: String?, vibrations: [MachineHistoryResponseVibrations]?) {
        self._id = _id
        self.name = name
        self.vibrations = vibrations
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case vibrations
    }


}
