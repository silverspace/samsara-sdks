//
// TripResponseStartCoordinates.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Start (latitude, longitude) in decimal degrees. */
public class TripResponseStartCoordinates: JSONEncodable {
    public var latitude: Double?
    public var longitude: Double?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["latitude"] = self.latitude
        nillableDictionary["longitude"] = self.longitude
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
