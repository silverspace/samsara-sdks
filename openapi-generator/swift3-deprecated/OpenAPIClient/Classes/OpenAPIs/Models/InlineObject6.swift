//
// InlineObject6.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class InlineObject6: JSONEncodable {

    /** Driver ID to query. */
    public var driverId: Int64?
    /** End of the time range, specified in milliseconds UNIX time. */
    public var endMs: Int32?
    /** Group ID to query. */
    public var groupId: Int64?
    /** Beginning of the time range, specified in milliseconds UNIX time. */
    public var startMs: Int32?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["driverId"] = self.driverId?.encodeToJSON()
        nillableDictionary["endMs"] = self.endMs?.encodeToJSON()
        nillableDictionary["groupId"] = self.groupId?.encodeToJSON()
        nillableDictionary["startMs"] = self.startMs?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

