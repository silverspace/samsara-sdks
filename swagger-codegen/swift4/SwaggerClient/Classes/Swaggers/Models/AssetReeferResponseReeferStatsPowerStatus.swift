//
// AssetReeferResponseReeferStatsPowerStatus.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct AssetReeferResponseReeferStatsPowerStatus: Codable {

    /** Timestamp in Unix milliseconds since epoch. */
    public var changedAtMs: Int64?
    /** Power status of the reefer. */
    public var status: String?

    public init(changedAtMs: Int64?, status: String?) {
        self.changedAtMs = changedAtMs
        self.status = status
    }


}
