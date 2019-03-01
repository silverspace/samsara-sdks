//
// DvirBaseAuthorSignature.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** The authors signature for the DVIR. */

public struct DvirBaseAuthorSignature: Codable {

    /** ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. */
    public var driverId: Int64?
    /** Email of the  driver|mechanic who signed the DVIR. */
    public var email: String?
    /** ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. */
    public var mechanicUserId: Int64?
    /** The name of the driver or mechanic who signed the DVIR. */
    public var name: String?
    /** The time in millis when the DVIR was signed */
    public var signedAt: Int64?
    /** Type corresponds to whether the signature corresponds to driver|mechanic. */
    public var type: String?
    /** Username of the  driver|mechanic who signed the DVIR. */
    public var username: String?

    public init(driverId: Int64?, email: String?, mechanicUserId: Int64?, name: String?, signedAt: Int64?, type: String?, username: String?) {
        self.driverId = driverId
        self.email = email
        self.mechanicUserId = mechanicUserId
        self.name = name
        self.signedAt = signedAt
        self.type = type
        self.username = username
    }


}
