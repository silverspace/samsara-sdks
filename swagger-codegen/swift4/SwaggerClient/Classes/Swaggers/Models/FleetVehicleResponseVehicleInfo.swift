//
// FleetVehicleResponseVehicleInfo.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct FleetVehicleResponseVehicleInfo: Codable {

    /** Make of the vehicle. */
    public var make: String?
    /** Model of the Vehicle. */
    public var model: String?
    /** Vehicle Identification Number. */
    public var vin: String?
    /** Year of the vehicle. */
    public var year: Int64?

    public init(make: String?, model: String?, vin: String?, year: Int64?) {
        self.make = make
        self.model = model
        self.vin = vin
        self.year = year
    }


}
