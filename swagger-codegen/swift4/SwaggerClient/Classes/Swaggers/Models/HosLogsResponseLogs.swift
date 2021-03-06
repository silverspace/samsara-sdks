//
// HosLogsResponseLogs.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct HosLogsResponseLogs: Codable {

    public var codriverIds: [Int64]?
    /** ID of the driver. */
    public var driverId: Int64?
    /** ID of the group. */
    public var groupId: Int64?
    /** City in which the log was recorded. */
    public var locCity: String?
    /** Latitude at which the log was recorded. */
    public var locLat: Double?
    /** Longitude at which the log was recorded. */
    public var locLng: Double?
    /** Name of location at which the log was recorded. */
    public var locName: String?
    /** State in which the log was recorded. */
    public var locState: String?
    /** The time at which the log/HOS status started in UNIX milliseconds. */
    public var logStartMs: Int64?
    /** Remark associated with the log entry. */
    public var remark: String?
    /** The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. */
    public var statusType: String?
    /** ID of the vehicle. */
    public var vehicleId: Int64?

    public init(codriverIds: [Int64]?, driverId: Int64?, groupId: Int64?, locCity: String?, locLat: Double?, locLng: Double?, locName: String?, locState: String?, logStartMs: Int64?, remark: String?, statusType: String?, vehicleId: Int64?) {
        self.codriverIds = codriverIds
        self.driverId = driverId
        self.groupId = groupId
        self.locCity = locCity
        self.locLat = locLat
        self.locLng = locLng
        self.locName = locName
        self.locState = locState
        self.logStartMs = logStartMs
        self.remark = remark
        self.statusType = statusType
        self.vehicleId = vehicleId
    }


}

