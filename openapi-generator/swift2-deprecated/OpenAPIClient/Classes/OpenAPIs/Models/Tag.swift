//
// Tag.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class Tag: JSONEncodable {
    /** The addresses that belong to this tag. */
    public var addresses: [TaggedAddress]?
    /** The assets that belong to this tag. */
    public var assets: [TaggedAsset]?
    /** The drivers that belong to this tag. */
    public var drivers: [TaggedDriver]?
    /** The GroupID that this tag belongs to. */
    public var groupId: Int64?
    /** The ID of this tag. */
    public var id: Int64?
    /** The machines that belong to this tag. */
    public var machines: [TaggedMachine]?
    /** Name of this tag. */
    public var name: String?
    /** If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag. */
    public var parentTagId: Int64?
    /** The sensors that belong to this tag. */
    public var sensors: [TaggedSensor]?
    /** The vehicles that belong to this tag. */
    public var vehicles: [TaggedVehicle]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["addresses"] = self.addresses?.encodeToJSON()
        nillableDictionary["assets"] = self.assets?.encodeToJSON()
        nillableDictionary["drivers"] = self.drivers?.encodeToJSON()
        nillableDictionary["groupId"] = self.groupId?.encodeToJSON()
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["machines"] = self.machines?.encodeToJSON()
        nillableDictionary["name"] = self.name
        nillableDictionary["parentTagId"] = self.parentTagId?.encodeToJSON()
        nillableDictionary["sensors"] = self.sensors?.encodeToJSON()
        nillableDictionary["vehicles"] = self.vehicles?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}