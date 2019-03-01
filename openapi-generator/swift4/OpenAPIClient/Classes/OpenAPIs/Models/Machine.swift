//
// Machine.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains information about a machine. */

public struct Machine: Codable {

    /** ID of the machine. */
    public var _id: Int64
    /** Name of the machine. */
    public var name: String?
    /** Notes about the machine */
    public var notes: String?

    public init(_id: Int64, name: String?, notes: String?) {
        self._id = _id
        self.name = name
        self.notes = notes
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case notes
    }


}

