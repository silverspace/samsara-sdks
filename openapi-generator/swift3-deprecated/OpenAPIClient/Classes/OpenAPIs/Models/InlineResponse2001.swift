//
// InlineResponse2001.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class InlineResponse2001: JSONEncodable {

    public var assets: [AssetCurrentLocationsResponse]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["assets"] = self.assets?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

