//
// InlineObject21.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct InlineObject21: Codable {

    public enum FillMissing: String, Codable {
        case withnull = "withNull"
        case withprevious = "withPrevious"
    }
    /** End of the time range, specified in milliseconds UNIX time. */
    public var endMs: Int
    public var fillMissing: FillMissing? = .withNull
    /** Group ID to query. */
    public var groupId: Int64
    public var series: [SensorsHistorySeries]
    /** Beginning of the time range, specified in milliseconds UNIX time. */
    public var startMs: Int
    /** Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. */
    public var stepMs: Int

    public init(endMs: Int, fillMissing: FillMissing?, groupId: Int64, series: [SensorsHistorySeries], startMs: Int, stepMs: Int) {
        self.endMs = endMs
        self.fillMissing = fillMissing
        self.groupId = groupId
        self.series = series
        self.startMs = startMs
        self.stepMs = stepMs
    }


}
