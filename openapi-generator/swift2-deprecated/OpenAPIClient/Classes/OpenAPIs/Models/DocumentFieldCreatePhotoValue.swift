//
// DocumentFieldCreatePhotoValue.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class DocumentFieldCreatePhotoValue: JSONEncodable {
    /** Photo URL for a JPG image */
    public var url: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["url"] = self.url
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
