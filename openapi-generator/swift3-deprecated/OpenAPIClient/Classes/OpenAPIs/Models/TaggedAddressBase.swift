//
// TaggedAddressBase.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class TaggedAddressBase: JSONEncodable {

    /** The ID of the address being tagged. */
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

