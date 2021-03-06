//
// DriversSummaryParam.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct DriversSummaryParam: Codable {

    /** End time (ms) of queried time period. */
    public var endMs: Int64
    /** Org ID to query. */
    public var orgId: Int64
    /** Start time (ms) of queried time period. */
    public var startMs: Int64

    public init(endMs: Int64, orgId: Int64, startMs: Int64) {
        self.endMs = endMs
        self.orgId = orgId
        self.startMs = startMs
    }


}

