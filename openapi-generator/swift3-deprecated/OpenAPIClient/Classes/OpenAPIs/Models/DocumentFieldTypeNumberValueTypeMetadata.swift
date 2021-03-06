//
// DocumentFieldTypeNumberValueTypeMetadata.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number. */
open class DocumentFieldTypeNumberValueTypeMetadata: JSONEncodable {

    /** Number of decimal places that values for this field type can have. */
    public var numDecimalPlaces: Int64?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["numDecimalPlaces"] = self.numDecimalPlaces?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

