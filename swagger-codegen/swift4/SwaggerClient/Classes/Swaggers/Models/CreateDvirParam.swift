//
// CreateDvirParam.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct CreateDvirParam: Codable {

    public enum InspectionType: String, Codable { 
        case mechanic = "mechanic"
    }
    public enum Safe: String, Codable { 
        case safe = "safe"
        case unsafe = "unsafe"
    }
    /** Only type &#39;mechanic&#39; is currently accepted. */
    public var inspectionType: InspectionType
    /** Any notes from the mechanic. */
    public var mechanicNotes: String?
    /** The current odometer of the vehicle. */
    public var odometerMiles: Int?
    /** Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
    public var previousDefectsCorrected: Bool?
    /** Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
    public var previousDefectsIgnored: Bool?
    /** Whether or not this vehicle or trailer is safe to drive. */
    public var safe: Safe
    /** Id of trailer being inspected. Either vehicleId or trailerId must be provided. */
    public var trailerId: Int?
    /** The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email. */
    public var userEmail: String
    /** Id of vehicle being inspected. Either vehicleId or trailerId must be provided. */
    public var vehicleId: Int?

    public init(inspectionType: InspectionType, mechanicNotes: String?, odometerMiles: Int?, previousDefectsCorrected: Bool?, previousDefectsIgnored: Bool?, safe: Safe, trailerId: Int?, userEmail: String, vehicleId: Int?) {
        self.inspectionType = inspectionType
        self.mechanicNotes = mechanicNotes
        self.odometerMiles = odometerMiles
        self.previousDefectsCorrected = previousDefectsCorrected
        self.previousDefectsIgnored = previousDefectsIgnored
        self.safe = safe
        self.trailerId = trailerId
        self.userEmail = userEmail
        self.vehicleId = vehicleId
    }


}

