//
// DriverForCreate.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct DriverForCreate: Codable {

    /** Flag indicating this driver may use Adverse Weather exemptions in ELD logs. */
    public var eldAdverseWeatherExemptionEnabled: Bool?
    /** Flag indicating this driver may use Big Day excemptions in ELD logs. */
    public var eldBigDayExemptionEnabled: Bool?
    /** 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. */
    public var eldDayStartHour: Int?
    /** Flag indicating this driver is exempt from the Electronic Logging Mandate. */
    public var eldExempt: Bool?
    /** Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). */
    public var eldExemptReason: String?
    /** Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. */
    public var eldPcEnabled: Bool?
    /** Flag indicating this driver may select the Yard Move duty status in ELD logs. */
    public var eldYmEnabled: Bool?
    /** Dictionary of external IDs (string key-value pairs) */
    public var externalIds: [String:String]?
    /** ID of the group if the organization has multiple groups (uncommon). */
    public var groupId: Int64?
    /** Driver&#39;s state issued license number. */
    public var licenseNumber: String?
    /** Abbreviation of state that issued driver&#39;s license. */
    public var licenseState: String?
    /** Driver&#39;s name. */
    public var name: String
    /** Notes about the driver. */
    public var notes: String?
    /** Driver&#39;s phone number. Please include only digits, ex. 4157771234 */
    public var phone: String?
    /** Driver&#39;s login username into the driver app. */
    public var username: String?
    /** ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). */
    public var vehicleId: Int64?
    /** Driver&#39;s password for the driver app. */
    public var password: String
    public var tagIds: TagIds?

    public init(eldAdverseWeatherExemptionEnabled: Bool?, eldBigDayExemptionEnabled: Bool?, eldDayStartHour: Int?, eldExempt: Bool?, eldExemptReason: String?, eldPcEnabled: Bool?, eldYmEnabled: Bool?, externalIds: [String:String]?, groupId: Int64?, licenseNumber: String?, licenseState: String?, name: String, notes: String?, phone: String?, username: String?, vehicleId: Int64?, password: String, tagIds: TagIds?) {
        self.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled
        self.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled
        self.eldDayStartHour = eldDayStartHour
        self.eldExempt = eldExempt
        self.eldExemptReason = eldExemptReason
        self.eldPcEnabled = eldPcEnabled
        self.eldYmEnabled = eldYmEnabled
        self.externalIds = externalIds
        self.groupId = groupId
        self.licenseNumber = licenseNumber
        self.licenseState = licenseState
        self.name = name
        self.notes = notes
        self.phone = phone
        self.username = username
        self.vehicleId = vehicleId
        self.password = password
        self.tagIds = tagIds
    }


}

