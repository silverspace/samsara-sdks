//
// DriverSafetyScoreResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Safety score details for a driver */

public struct DriverSafetyScoreResponse: Codable {

    /** Crash event count */
    public var crashCount: Int?
    /** Driver ID */
    public var driverId: Int?
    /** Harsh acceleration event count */
    public var harshAccelCount: Int?
    /** Harsh braking event count */
    public var harshBrakingCount: Int?
    public var harshEvents: [SafetyReportHarshEvent]?
    /** Harsh turning event count */
    public var harshTurningCount: Int?
    /** Safety Score */
    public var safetyScore: Int?
    /** Safety Score Rank */
    public var safetyScoreRank: String?
    /** Amount of time driven over the speed limit in milliseconds */
    public var timeOverSpeedLimitMs: Int?
    /** Total distance driven in meters */
    public var totalDistanceDrivenMeters: Int?
    /** Total harsh event count */
    public var totalHarshEventCount: Int?
    /** Amount of time driven in milliseconds */
    public var totalTimeDrivenMs: Int?

    public init(crashCount: Int?, driverId: Int?, harshAccelCount: Int?, harshBrakingCount: Int?, harshEvents: [SafetyReportHarshEvent]?, harshTurningCount: Int?, safetyScore: Int?, safetyScoreRank: String?, timeOverSpeedLimitMs: Int?, totalDistanceDrivenMeters: Int?, totalHarshEventCount: Int?, totalTimeDrivenMs: Int?) {
        self.crashCount = crashCount
        self.driverId = driverId
        self.harshAccelCount = harshAccelCount
        self.harshBrakingCount = harshBrakingCount
        self.harshEvents = harshEvents
        self.harshTurningCount = harshTurningCount
        self.safetyScore = safetyScore
        self.safetyScoreRank = safetyScoreRank
        self.timeOverSpeedLimitMs = timeOverSpeedLimitMs
        self.totalDistanceDrivenMeters = totalDistanceDrivenMeters
        self.totalHarshEventCount = totalHarshEventCount
        self.totalTimeDrivenMs = totalTimeDrivenMs
    }


}

