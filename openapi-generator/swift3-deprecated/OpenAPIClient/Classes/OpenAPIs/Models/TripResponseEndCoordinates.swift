//
// TripResponseEndCoordinates.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** End (latitude, longitude) in decimal degrees. */
open class TripResponseEndCoordinates: JSONEncodable {

    public var latitude: Double?
    public var longitude: Double?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["latitude"] = self.latitude
        nillableDictionary["longitude"] = self.longitude

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
