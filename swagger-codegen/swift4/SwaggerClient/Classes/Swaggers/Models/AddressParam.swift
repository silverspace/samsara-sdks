//
// AddressParam.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct AddressParam: Codable {

    /** The address of the entry to add, as it would be recognized if provided to maps.google.com. */
    public var address: String
    /** Group ID to query. */
    public var groupId: Int64
    /** Name of the location to add to the address book. */
    public var name: String
    /** Radius in meters of the address (used for matching vehicle trip stops to this location). */
    public var radius: Int

    public init(address: String, groupId: Int64, name: String, radius: Int) {
        self.address = address
        self.groupId = groupId
        self.name = name
        self.radius = radius
    }


}

