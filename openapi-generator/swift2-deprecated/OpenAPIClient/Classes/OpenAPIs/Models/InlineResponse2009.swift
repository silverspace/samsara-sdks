//
// InlineResponse2009.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class InlineResponse2009: JSONEncodable {
    public var tags: [Tag]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["tags"] = self.tags?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
