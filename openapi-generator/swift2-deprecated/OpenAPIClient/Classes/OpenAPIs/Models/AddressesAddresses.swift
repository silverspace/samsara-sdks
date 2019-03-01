//
// AddressesAddresses.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class AddressesAddresses: JSONEncodable {
    /** Notes associated with an address. */
    public var notes: String?
    /** The full address associated with this address/geofence, as it might be recognized by maps.google.com */
    public var formattedAddress: String?
    public var geofence: AddressGeofence?
    /** A list of tag IDs. */
    public var tagIds: [Int64]?
    /** The name of this address/geofence */
    public var name: String?
    /** A list of IDs for contact book entries. */
    public var contactIds: [Int64]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["notes"] = self.notes
        nillableDictionary["formattedAddress"] = self.formattedAddress
        nillableDictionary["geofence"] = self.geofence?.encodeToJSON()
        nillableDictionary["tagIds"] = self.tagIds?.encodeToJSON()
        nillableDictionary["name"] = self.name
        nillableDictionary["contactIds"] = self.contactIds?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
