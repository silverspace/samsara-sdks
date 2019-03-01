//
// DvirBaseAuthorSignature.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** The authors signature for the DVIR. */

public struct DvirBaseAuthorSignature: Codable {

    /** ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. */
    public var mechanicUserId: Int64?
    /** ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. */
    public var driverId: Int64?
    /** The name of the driver or mechanic who signed the DVIR. */
    public var name: String?
    /** The time in millis when the DVIR was signed */
    public var signedAt: Int64?
    /** Type corresponds to whether the signature corresponds to driver|mechanic. */
    public var type: String?
    /** Email of the  driver|mechanic who signed the DVIR. */
    public var email: String?
    /** Username of the  driver|mechanic who signed the DVIR. */
    public var username: String?

    public init(mechanicUserId: Int64?, driverId: Int64?, name: String?, signedAt: Int64?, type: String?, email: String?, username: String?) {
        self.mechanicUserId = mechanicUserId
        self.driverId = driverId
        self.name = name
        self.signedAt = signedAt
        self.type = type
        self.email = email
        self.username = username
    }


}

