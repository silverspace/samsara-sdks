//
// DispatchRouteHistory.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct DispatchRouteHistory: Codable {

    /** History of the route&#39;s state changes. */
    public var history: [DispatchRouteHistoricalEntry]?

    public init(history: [DispatchRouteHistoricalEntry]?) {
        self.history = history
    }


}

