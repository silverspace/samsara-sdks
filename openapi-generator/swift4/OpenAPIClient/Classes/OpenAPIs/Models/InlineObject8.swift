//
// InlineObject8.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct InlineObject8: Codable {

    /** Driver ID to query. */
    public var driverId: Int64
    /** End of the time range, specified in milliseconds UNIX time. */
    public var endMs: Int
    /** Group ID to query. */
    public var groupId: Int64
    /** Beginning of the time range, specified in milliseconds UNIX time. */
    public var startMs: Int

    public init(driverId: Int64, endMs: Int, groupId: Int64, startMs: Int) {
        self.driverId = driverId
        self.endMs = endMs
        self.groupId = groupId
        self.startMs = startMs
    }


}

