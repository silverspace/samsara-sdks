//
// AssetCable.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class AssetCable: JSONEncodable {
    /** Asset type */
    public var assetType: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["assetType"] = self.assetType
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}