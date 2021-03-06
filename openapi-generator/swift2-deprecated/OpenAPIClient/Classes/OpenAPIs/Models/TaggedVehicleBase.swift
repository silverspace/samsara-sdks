//
// TaggedVehicleBase.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class TaggedVehicleBase: JSONEncodable {
    /** The ID of the Vehicle being tagged. */
    public var id: Int64?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["id"] = self.id?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
