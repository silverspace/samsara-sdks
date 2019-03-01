//
// DvirBaseAuthorSignature.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** The authors signature for the DVIR. */
open class DvirBaseAuthorSignature: JSONEncodable {

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

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["mechanicUserId"] = self.mechanicUserId?.encodeToJSON()
        nillableDictionary["driverId"] = self.driverId?.encodeToJSON()
        nillableDictionary["name"] = self.name
        nillableDictionary["signedAt"] = self.signedAt?.encodeToJSON()
        nillableDictionary["type"] = self.type
        nillableDictionary["email"] = self.email
        nillableDictionary["username"] = self.username

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
