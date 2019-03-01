//
// TagCreate.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct TagCreate: Codable {

    /** The assets that belong to this tag. */
    public var assets: [TaggedAssetBase]?
    /** The drivers that belong to this tag. */
    public var drivers: [TaggedDriverBase]?
    /** The machines that belong to this tag. */
    public var machines: [TaggedMachineBase]?
    /** Name of this tag. */
    public var name: String
    /** If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag. */
    public var parentTagId: Int64?
    /** The sensors that belong to this tag. */
    public var sensors: [TaggedSensorBase]?
    /** The vehicles that belong to this tag. */
    public var vehicles: [TaggedVehicleBase]?

    public init(assets: [TaggedAssetBase]?, drivers: [TaggedDriverBase]?, machines: [TaggedMachineBase]?, name: String, parentTagId: Int64?, sensors: [TaggedSensorBase]?, vehicles: [TaggedVehicleBase]?) {
        self.assets = assets
        self.drivers = drivers
        self.machines = machines
        self.name = name
        self.parentTagId = parentTagId
        self.sensors = sensors
        self.vehicles = vehicles
    }


}

