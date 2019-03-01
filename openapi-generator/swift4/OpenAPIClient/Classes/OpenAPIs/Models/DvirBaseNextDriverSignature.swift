//
// DvirBaseNextDriverSignature.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** The next driver signature for the DVIR. */

public struct DvirBaseNextDriverSignature: Codable {

    /** ID of the driver who signed the DVIR */
    public var driverId: Int64?
    /** The name of the driver who signed the next DVIR on this vehicle. */
    public var name: String?
    /** The time in millis when the next driver signed the DVIR on this vehicle. */
    public var signedAt: Int64?
    /** Type corresponds to driver. */
    public var type: String?
    /** Email of the  driver who signed the next DVIR on this vehicle. */
    public var email: String?
    /** Username of the  driver who signed the next DVIR on this vehicle. */
    public var username: String?

    public init(driverId: Int64?, name: String?, signedAt: Int64?, type: String?, email: String?, username: String?) {
        self.driverId = driverId
        self.name = name
        self.signedAt = signedAt
        self.type = type
        self.email = email
        self.username = username
    }


}

