//
// AssetReeferResponseReeferStatsAlarms1.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class AssetReeferResponseReeferStatsAlarms1: JSONEncodable {
    public var alarms: [AssetReeferResponseReeferStatsAlarms]?
    /** Timestamp when the alarms were reported, in Unix milliseconds since epoch */
    public var changedAtMs: Int64?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["alarms"] = self.alarms?.encodeToJSON()
        nillableDictionary["changedAtMs"] = self.changedAtMs?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
