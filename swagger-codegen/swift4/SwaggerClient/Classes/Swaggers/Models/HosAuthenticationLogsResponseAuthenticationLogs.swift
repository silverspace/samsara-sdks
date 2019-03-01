//
// HosAuthenticationLogsResponseAuthenticationLogs.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct HosAuthenticationLogsResponseAuthenticationLogs: Codable {

    /** The log type - one of &#39;signin&#39; or &#39;signout&#39; */
    public var actionType: String?
    /** Address at which the log was recorded, if applicable. */
    public var address: String?
    /** Address name from the group address book at which the log was recorded, if applicable. */
    public var addressName: String?
    /** City in which the log was recorded, if applicable. */
    public var city: String?
    /** The time at which the event was recorded in UNIX milliseconds. */
    public var happenedAtMs: Int64?
    /** State in which the log was recorded, if applicable. */
    public var state: String?

    public init(actionType: String?, address: String?, addressName: String?, city: String?, happenedAtMs: Int64?, state: String?) {
        self.actionType = actionType
        self.address = address
        self.addressName = addressName
        self.city = city
        self.happenedAtMs = happenedAtMs
        self.state = state
    }


}

