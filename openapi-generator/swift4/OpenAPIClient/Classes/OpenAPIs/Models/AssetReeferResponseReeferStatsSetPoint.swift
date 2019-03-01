//
// AssetReeferResponseReeferStatsSetPoint.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct AssetReeferResponseReeferStatsSetPoint: Codable {

    /** Set point temperature in millidegree Celsius. */
    public var tempInMilliC: Int64?
    /** Timestamp in Unix milliseconds since epoch. */
    public var changedAtMs: Int64?

    public init(tempInMilliC: Int64?, changedAtMs: Int64?) {
        self.tempInMilliC = tempInMilliC
        self.changedAtMs = changedAtMs
    }


}

