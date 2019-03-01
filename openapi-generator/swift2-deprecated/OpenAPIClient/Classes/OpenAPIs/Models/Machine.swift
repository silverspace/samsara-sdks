//
// Machine.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains information about a machine. */
public class Machine: JSONEncodable {
    /** ID of the machine. */
    public var id: Int64?
    /** Name of the machine. */
    public var name: String?
    /** Notes about the machine */
    public var notes: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["name"] = self.name
        nillableDictionary["notes"] = self.notes
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}