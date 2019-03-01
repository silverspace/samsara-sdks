//
// HosLogsSummaryResponseDrivers.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct HosLogsSummaryResponseDrivers: Codable {

    /** The amount of remaining cycle time (in ms). */
    public var cycleRemaining: Int64?
    /** The amount of cycle time (in ms) available tomorrow. */
    public var cycleTomorrow: Int64?
    /** ID of the driver. */
    public var driverId: Int64?
    /** Name of the driver. */
    public var driverName: String?
    /** The amount of driving time in violation in this cycle (in ms). */
    public var drivingInViolationCycle: Int64?
    /** The amount of driving time in violation today (in ms). */
    public var drivingInViolationToday: Int64?
    /** The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. */
    public var dutyStatus: String?
    /** The amount of remaining shift drive time (in ms). */
    public var shiftDriveRemaining: Int64?
    /** The amount of remaining shift time (in ms). */
    public var shiftRemaining: Int64?
    /** The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;. */
    public var timeInCurrentStatus: Int64?
    /** The amount of time (in ms) remaining until the driver cannot drive without a rest break. */
    public var timeUntilBreak: Int64?
    /** Name of the vehicle. */
    public var vehicleName: String?

    public init(cycleRemaining: Int64?, cycleTomorrow: Int64?, driverId: Int64?, driverName: String?, drivingInViolationCycle: Int64?, drivingInViolationToday: Int64?, dutyStatus: String?, shiftDriveRemaining: Int64?, shiftRemaining: Int64?, timeInCurrentStatus: Int64?, timeUntilBreak: Int64?, vehicleName: String?) {
        self.cycleRemaining = cycleRemaining
        self.cycleTomorrow = cycleTomorrow
        self.driverId = driverId
        self.driverName = driverName
        self.drivingInViolationCycle = drivingInViolationCycle
        self.drivingInViolationToday = drivingInViolationToday
        self.dutyStatus = dutyStatus
        self.shiftDriveRemaining = shiftDriveRemaining
        self.shiftRemaining = shiftRemaining
        self.timeInCurrentStatus = timeInCurrentStatus
        self.timeUntilBreak = timeUntilBreak
        self.vehicleName = vehicleName
    }


}

