//
// HosAuthenticationLogsResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class HosAuthenticationLogsResponse: JSONEncodable {

    public var authenticationLogs: [HosAuthenticationLogsResponseAuthenticationLogs]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["authenticationLogs"] = self.authenticationLogs?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
