//
// AssetReeferResponseReeferStatsSetPoint.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct AssetReeferResponseReeferStatsSetPoint: Codable {

    /** Timestamp in Unix milliseconds since epoch. */
    public var changedAtMs: Int64?
    /** Set point temperature in millidegree Celsius. */
    public var tempInMilliC: Int64?

    public init(changedAtMs: Int64?, tempInMilliC: Int64?) {
        self.changedAtMs = changedAtMs
        self.tempInMilliC = tempInMilliC
    }


}
