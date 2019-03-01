//
// User.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct User: Codable {

    /** The ID of the User record. */
    public var _id: Int64?
    /** The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
    public var organizationRole: String?
    /** The specific tags this user has access to. This will be blank for users that have full access to the organization. */
    public var tagRoles: [UserTagRole]?

    public init(_id: Int64?, organizationRole: String?, tagRoles: [UserTagRole]?) {
        self._id = _id
        self.organizationRole = organizationRole
        self.tagRoles = tagRoles
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case organizationRole
        case tagRoles
    }


}
