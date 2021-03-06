//
// Contact.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Information about a notification contact for alerts. */
public class Contact: JSONEncodable {
    /** Email address of the contact */
    public var email: String?
    /** First name of the contact */
    public var firstName: String?
    /** ID of the contact */
    public var id: Int64?
    /** Last name of the contact */
    public var lastName: String?
    /** Phone number of the contact */
    public var phone: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["email"] = self.email
        nillableDictionary["firstName"] = self.firstName
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["lastName"] = self.lastName
        nillableDictionary["phone"] = self.phone
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
