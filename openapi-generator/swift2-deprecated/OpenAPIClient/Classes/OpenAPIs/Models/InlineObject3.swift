//
// InlineObject3.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class InlineObject3: JSONEncodable {
    /** Group ID to query. */
    public var groupId: Int64?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["groupId"] = self.groupId?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}