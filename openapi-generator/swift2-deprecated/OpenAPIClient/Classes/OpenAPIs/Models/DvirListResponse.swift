//
// DvirListResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class DvirListResponse: JSONEncodable {
    public var dvirs: [DvirBase]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["dvirs"] = self.dvirs?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}