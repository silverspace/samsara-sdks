//
// InlineObject2.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class InlineObject2: JSONEncodable {
    /** The address of the entry to add, as it would be recognized if provided to maps.google.com. */
    public var address: String?
    /** Group ID to query. */
    public var groupId: Int64?
    /** Name of the location to add to the address book. */
    public var name: String?
    /** Radius in meters of the address (used for matching vehicle trip stops to this location). */
    public var radius: Int32?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["address"] = self.address
        nillableDictionary["groupId"] = self.groupId?.encodeToJSON()
        nillableDictionary["name"] = self.name
        nillableDictionary["radius"] = self.radius?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
