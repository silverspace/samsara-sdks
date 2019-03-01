//
// AuxInput.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Digital value of an aux input. */
open class AuxInput: JSONEncodable {

    /** Timestamp in Unix epoch milliseconds. */
    public var timeMs: Any?
    /** Boolean representing the digital value of the aux input. */
    public var value: Bool?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["timeMs"] = self.timeMs
        nillableDictionary["value"] = self.value

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

