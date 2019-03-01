//
// AssetReeferResponseReeferStatsReturnAirTemp.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class AssetReeferResponseReeferStatsReturnAirTemp: JSONEncodable {
    /** Return air temperature in millidegree Celsius. */
    public var tempInMilliC: Int64?
    /** Timestamp in Unix milliseconds since epoch. */
    public var changedAtMs: Int64?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["tempInMilliC"] = self.tempInMilliC?.encodeToJSON()
        nillableDictionary["changedAtMs"] = self.changedAtMs?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
