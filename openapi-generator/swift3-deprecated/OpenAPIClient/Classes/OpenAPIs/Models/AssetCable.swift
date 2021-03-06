//
// AssetCable.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class AssetCable: JSONEncodable {

    /** Asset type */
    public var assetType: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["assetType"] = self.assetType

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

