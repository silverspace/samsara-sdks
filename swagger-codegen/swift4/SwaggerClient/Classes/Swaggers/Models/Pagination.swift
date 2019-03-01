//
// Pagination.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct Pagination: Codable {

    /** Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter. */
    public var endCursor: String
    /** True if there are more pages of results after this response. */
    public var hasNextPage: Bool
    /** True if there are more pages of results before this response. */
    public var hasPrevPage: Bool
    /** Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter. */
    public var startCursor: String

    public init(endCursor: String, hasNextPage: Bool, hasPrevPage: Bool, startCursor: String) {
        self.endCursor = endCursor
        self.hasNextPage = hasNextPage
        self.hasPrevPage = hasPrevPage
        self.startCursor = startCursor
    }


}
