//
// MachineHistoryResponseVibrations.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct MachineHistoryResponseVibrations: Codable {

    public var X: Double?
    public var Y: Double?
    public var Z: Double?
    public var time: Int64?

    public init(X: Double?, Y: Double?, Z: Double?, time: Int64?) {
        self.X = X
        self.Y = Y
        self.Z = Z
        self.time = time
    }


}
