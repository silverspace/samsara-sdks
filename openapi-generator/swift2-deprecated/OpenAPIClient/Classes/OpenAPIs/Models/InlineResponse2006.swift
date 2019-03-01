//
// InlineResponse2006.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class InlineResponse2006: JSONEncodable {
    public var dataInputs: [DataInputHistoryResponse]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["dataInputs"] = self.dataInputs?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}