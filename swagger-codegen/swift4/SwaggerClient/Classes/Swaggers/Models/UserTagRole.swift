//
// UserTagRole.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct UserTagRole: Codable {

    /** The name of the role the user has been granted on this tag. */
    public var role: String?
    /** The id of the role the user has been granted on this tag. */
    public var roleId: String
    public var tag: UserTagRoleTag

    public init(role: String?, roleId: String, tag: UserTagRoleTag) {
        self.role = role
        self.roleId = roleId
        self.tag = tag
    }


}
