//
// TagModifyAdd.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Specify devices, etc. that should be added to the tag. */
open class TagModifyAdd: JSONEncodable {

    /** The assets to be added to this tag. */
    public var assets: [TaggedAssetBase]?
    /** The sensors to be added to this tag. */
    public var sensors: [TaggedSensorBase]?
    /** The vehicles to be added to this tag. */
    public var vehicles: [TaggedVehicleBase]?
    /** The machines to be added to this tag. */
    public var machines: [TaggedMachineBase]?
    /** The drivers to be added to this tag. */
    public var drivers: [TaggedDriverBase]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["assets"] = self.assets?.encodeToJSON()
        nillableDictionary["sensors"] = self.sensors?.encodeToJSON()
        nillableDictionary["vehicles"] = self.vehicles?.encodeToJSON()
        nillableDictionary["machines"] = self.machines?.encodeToJSON()
        nillableDictionary["drivers"] = self.drivers?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

