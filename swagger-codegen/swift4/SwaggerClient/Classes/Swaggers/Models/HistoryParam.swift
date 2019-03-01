//
// HistoryParam.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct HistoryParam: Codable {

    /** End of the time range, specified in milliseconds UNIX time. */
    public var endMs: Int
    /** Group ID to query. */
    public var groupId: Int64
    /** Beginning of the time range, specified in milliseconds UNIX time. */
    public var startMs: Int

    public init(endMs: Int, groupId: Int64, startMs: Int) {
        self.endMs = endMs
        self.groupId = groupId
        self.startMs = startMs
    }


}

