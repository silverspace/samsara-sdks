//
// FleetVehicleResponseVehicleInfo.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct FleetVehicleResponseVehicleInfo: Codable {

    /** Year of the vehicle. */
    public var year: Int64?
    /** Model of the Vehicle. */
    public var model: String?
    /** Vehicle Identification Number. */
    public var vin: String?
    /** Make of the vehicle. */
    public var make: String?

    public init(year: Int64?, model: String?, vin: String?, make: String?) {
        self.year = year
        self.model = model
        self.vin = vin
        self.make = make
    }


}

