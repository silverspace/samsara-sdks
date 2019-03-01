//
// TaggedMachine.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class TaggedMachine: JSONEncodable {

    /** The ID of the Machine being tagged. */
    public var id: Int64?
    /** Name of the Machine being tagged. */
    public var name: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["name"] = self.name

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

