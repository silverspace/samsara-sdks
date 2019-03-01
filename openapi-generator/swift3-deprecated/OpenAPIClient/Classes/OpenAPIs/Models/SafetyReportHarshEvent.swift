//
// SafetyReportHarshEvent.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** List of harsh events */
open class SafetyReportHarshEvent: JSONEncodable {

    /** Type of the harsh event */
    public var harshEventType: String?
    /** Timestamp that the harsh event occurred in Unix milliseconds since epoch */
    public var timestampMs: Int32?
    /** Vehicle associated with the harsh event */
    public var vehicleId: Int32?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["harshEventType"] = self.harshEventType
        nillableDictionary["timestampMs"] = self.timestampMs?.encodeToJSON()
        nillableDictionary["vehicleId"] = self.vehicleId?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

