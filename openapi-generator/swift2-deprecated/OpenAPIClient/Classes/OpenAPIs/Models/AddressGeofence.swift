//
// AddressGeofence.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type. */
public class AddressGeofence: JSONEncodable {
    public var circle: AddressGeofenceCircle?
    public var polygon: AddressGeofencePolygon?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["circle"] = self.circle?.encodeToJSON()
        nillableDictionary["polygon"] = self.polygon?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
