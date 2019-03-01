//
// AssetReeferResponseReeferStatsEngineHours.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct AssetReeferResponseReeferStatsEngineHours: Codable {

    /** Engine hours of the reefer. */
    public var engineHours: Int64?
    /** Timestamp in Unix milliseconds since epoch. */
    public var changedAtMs: Int64?

    public init(engineHours: Int64?, changedAtMs: Int64?) {
        self.engineHours = engineHours
        self.changedAtMs = changedAtMs
    }


}

