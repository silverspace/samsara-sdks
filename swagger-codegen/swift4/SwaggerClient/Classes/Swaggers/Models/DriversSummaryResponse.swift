//
// DriversSummaryResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct DriversSummaryResponse: Codable {

    public var summaries: [DriversSummaryResponseSummaries]?

    public init(summaries: [DriversSummaryResponseSummaries]?) {
        self.summaries = summaries
    }

    public enum CodingKeys: String, CodingKey { 
        case summaries = "Summaries"
    }


}
