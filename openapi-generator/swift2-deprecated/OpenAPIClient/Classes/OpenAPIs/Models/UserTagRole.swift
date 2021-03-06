//
// UserTagRole.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class UserTagRole: JSONEncodable {
    /** The name of the role the user has been granted on this tag. */
    public var role: String?
    /** The id of the role the user has been granted on this tag. */
    public var roleId: String?
    public var tag: UserTagRoleTag?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["role"] = self.role
        nillableDictionary["roleId"] = self.roleId
        nillableDictionary["tag"] = self.tag?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
