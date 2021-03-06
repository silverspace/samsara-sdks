//
// DispatchRouteHistory.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct DispatchRouteHistory: Codable {

    /** History of the route&#39;s state changes. */
    public var history: [DispatchRouteHistoricalEntry]?

    public init(history: [DispatchRouteHistoricalEntry]?) {
        self.history = history
    }


}

