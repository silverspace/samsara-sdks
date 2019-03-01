//
// DriversResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class DriversResponse: JSONEncodable {
    public var drivers: [Driver]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["drivers"] = self.drivers?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
