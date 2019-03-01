//
// TagModifyAdd.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Specify devices, etc. that should be added to the tag. */

public struct TagModifyAdd: Codable {

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

    public init(assets: [TaggedAssetBase]?, sensors: [TaggedSensorBase]?, vehicles: [TaggedVehicleBase]?, machines: [TaggedMachineBase]?, drivers: [TaggedDriverBase]?) {
        self.assets = assets
        self.sensors = sensors
        self.vehicles = vehicles
        self.machines = machines
        self.drivers = drivers
    }


}

