//
// TaggedAssetBase.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class TaggedAssetBase: JSONEncodable {

    /** The ID of the Asset being tagged. */
    public var id: Int64?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["id"] = self.id?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
