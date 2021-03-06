//
// FleetVehicleLocation.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains the location and speed of a vehicle at a particular time */
public class FleetVehicleLocation: JSONEncodable {
    /** The latitude of the location in degrees. */
    public var latitude: Double?
    /** The best effort (street,city,state) for the latitude and longitude. */
    public var location: String?
    /** The longitude of the location in degrees. */
    public var longitude: Double?
    /** The speed calculated from GPS that the asset was traveling at in miles per hour. */
    public var speedMilesPerHour: Double?
    /** Time in Unix milliseconds since epoch when the asset was at the location. */
    public var timeMs: Int64?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["latitude"] = self.latitude
        nillableDictionary["location"] = self.location
        nillableDictionary["longitude"] = self.longitude
        nillableDictionary["speedMilesPerHour"] = self.speedMilesPerHour
        nillableDictionary["timeMs"] = self.timeMs?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
