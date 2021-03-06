//
// TagModifyDelete.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Specify devices, etc. that should be removed from the tag. */
public class TagModifyDelete: JSONEncodable {
    /** The assets to be removed from this tag. */
    public var assets: [TaggedAssetBase]?
    /** The sensors to be removed from this tag. */
    public var sensors: [TaggedSensorBase]?
    /** The vehicles to be removed from this tag. */
    public var vehicles: [TaggedVehicleBase]?
    /** The machines to be removed from this tag. */
    public var machines: [TaggedMachineBase]?
    /** The drivers to be removed from this tag. */
    public var drivers: [TaggedDriverBase]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["assets"] = self.assets?.encodeToJSON()
        nillableDictionary["sensors"] = self.sensors?.encodeToJSON()
        nillableDictionary["vehicles"] = self.vehicles?.encodeToJSON()
        nillableDictionary["machines"] = self.machines?.encodeToJSON()
        nillableDictionary["drivers"] = self.drivers?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
