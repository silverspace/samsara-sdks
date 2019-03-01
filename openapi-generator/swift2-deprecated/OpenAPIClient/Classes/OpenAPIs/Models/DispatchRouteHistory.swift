//
// DispatchRouteHistory.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class DispatchRouteHistory: JSONEncodable {
    /** History of the route&#39;s state changes. */
    public var history: [DispatchRouteHistoricalEntry]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["history"] = self.history?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
