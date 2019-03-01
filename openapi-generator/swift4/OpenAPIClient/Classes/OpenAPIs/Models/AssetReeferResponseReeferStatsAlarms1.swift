//
// AssetReeferResponseReeferStatsAlarms1.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct AssetReeferResponseReeferStatsAlarms1: Codable {

    public var alarms: [AssetReeferResponseReeferStatsAlarms]?
    /** Timestamp when the alarms were reported, in Unix milliseconds since epoch */
    public var changedAtMs: Int64?

    public init(alarms: [AssetReeferResponseReeferStatsAlarms]?, changedAtMs: Int64?) {
        self.alarms = alarms
        self.changedAtMs = changedAtMs
    }


}
