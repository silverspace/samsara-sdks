//
// VehicleSafetyScoreResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Safety score details for a vehicle */
public class VehicleSafetyScoreResponse: JSONEncodable {
    /** Crash event count */
    public var crashCount: Int32?
    /** Harsh acceleration event count */
    public var harshAccelCount: Int32?
    /** Harsh braking event count */
    public var harshBrakingCount: Int32?
    public var harshEvents: [SafetyReportHarshEvent]?
    /** Harsh turning event count */
    public var harshTurningCount: Int32?
    /** Safety Score */
    public var safetyScore: Int32?
    /** Safety Score Rank */
    public var safetyScoreRank: String?
    /** Amount of time driven over the speed limit in milliseconds */
    public var timeOverSpeedLimitMs: Int32?
    /** Total distance driven in meters */
    public var totalDistanceDrivenMeters: Int32?
    /** Total harsh event count */
    public var totalHarshEventCount: Int32?
    /** Amount of time driven in milliseconds */
    public var totalTimeDrivenMs: Int32?
    /** Vehicle ID */
    public var vehicleId: Int32?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["crashCount"] = self.crashCount?.encodeToJSON()
        nillableDictionary["harshAccelCount"] = self.harshAccelCount?.encodeToJSON()
        nillableDictionary["harshBrakingCount"] = self.harshBrakingCount?.encodeToJSON()
        nillableDictionary["harshEvents"] = self.harshEvents?.encodeToJSON()
        nillableDictionary["harshTurningCount"] = self.harshTurningCount?.encodeToJSON()
        nillableDictionary["safetyScore"] = self.safetyScore?.encodeToJSON()
        nillableDictionary["safetyScoreRank"] = self.safetyScoreRank
        nillableDictionary["timeOverSpeedLimitMs"] = self.timeOverSpeedLimitMs?.encodeToJSON()
        nillableDictionary["totalDistanceDrivenMeters"] = self.totalDistanceDrivenMeters?.encodeToJSON()
        nillableDictionary["totalHarshEventCount"] = self.totalHarshEventCount?.encodeToJSON()
        nillableDictionary["totalTimeDrivenMs"] = self.totalTimeDrivenMs?.encodeToJSON()
        nillableDictionary["vehicleId"] = self.vehicleId?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
