//
// AssetCurrentLocationsResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Basic information of an asset */
open class AssetCurrentLocationsResponse: JSONEncodable {

    /** The cable connected to the asset */
    public var cable: [AssetCable]?
    /** Engine hours */
    public var engineHours: Int32?
    /** Asset ID */
    public var id: Int64?
    /** Current location of an asset */
    public var location: [AssetCurrentLocation]?
    /** Asset name */
    public var name: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["cable"] = self.cable?.encodeToJSON()
        nillableDictionary["engineHours"] = self.engineHours?.encodeToJSON()
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["location"] = self.location?.encodeToJSON()
        nillableDictionary["name"] = self.name

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

