//
// InlineObject20.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class InlineObject20: JSONEncodable {

    /** Group ID to query. */
    public var groupId: Int64?
    /** List of sensor IDs to query. */
    public var sensors: [Int64]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["groupId"] = self.groupId?.encodeToJSON()
        nillableDictionary["sensors"] = self.sensors?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

