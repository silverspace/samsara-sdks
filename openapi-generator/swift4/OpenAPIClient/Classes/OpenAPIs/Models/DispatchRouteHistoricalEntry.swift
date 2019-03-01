//
// DispatchRouteHistoricalEntry.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct DispatchRouteHistoricalEntry: Codable {

    /** Timestamp that the route was updated, represented as Unix milliseconds since epoch. */
    public var changedAtMs: Int64?
    public var route: DispatchRoute?

    public init(changedAtMs: Int64?, route: DispatchRoute?) {
        self.changedAtMs = changedAtMs
        self.route = route
    }

    public enum CodingKeys: String, CodingKey { 
        case changedAtMs = "changed_at_ms"
        case route
    }


}

