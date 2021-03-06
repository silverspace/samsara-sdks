//
// User.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class User: JSONEncodable {
    public enum AuthType: String { 
        case Default = "default"
        case Saml = "saml"
    }
    /** The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. */
    public var authType: AuthType?
    /** The email address of this user. */
    public var email: String?
    /** The first and last name of the user. */
    public var name: String?
    /** The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
    public var organizationRoleId: String?
    /** The ID of the User record. */
    public var id: Int64?
    /** The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
    public var organizationRole: String?
    /** The specific tags this user has access to. This will be blank for users that have full access to the organization. */
    public var tagRoles: [UserTagRole]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["authType"] = self.authType?.rawValue
        nillableDictionary["email"] = self.email
        nillableDictionary["name"] = self.name
        nillableDictionary["organizationRoleId"] = self.organizationRoleId
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["organizationRole"] = self.organizationRole
        nillableDictionary["tagRoles"] = self.tagRoles?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
