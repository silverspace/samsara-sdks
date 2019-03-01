//
// HosLogsResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class HosLogsResponse: JSONEncodable {

    public var logs: [HosLogsResponseLogs]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["logs"] = self.logs?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

