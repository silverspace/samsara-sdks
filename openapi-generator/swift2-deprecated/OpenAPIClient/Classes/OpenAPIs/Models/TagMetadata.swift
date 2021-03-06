//
// TagMetadata.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class TagMetadata: JSONEncodable {
    /** The ID of this tag. */
    public var id: Int64?
    /** Name of this tag. */
    public var name: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["name"] = self.name
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
