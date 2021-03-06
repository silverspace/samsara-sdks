//
// DocumentField.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct DocumentField: Codable {

    /** Descriptive name of this field. */
    public var label: String
    /** DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string. */
    public var value: Any?

    public init(label: String, value: Any?) {
        self.label = label
        self.value = value
    }


}

