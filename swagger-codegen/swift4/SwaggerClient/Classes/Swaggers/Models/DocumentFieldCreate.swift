//
// DocumentFieldCreate.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct DocumentFieldCreate: Codable {

    /** Value of this field if this document field has valueType: ValueType_Number. */
    public var numberValue: Double?
    /** Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. */
    public var photoValue: [DocumentFieldCreatePhotoValue]?
    /** Value of this field if this document field has valueType: ValueType_String. */
    public var stringValue: String?
    /** Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
    public var valueType: String

    public init(numberValue: Double?, photoValue: [DocumentFieldCreatePhotoValue]?, stringValue: String?, valueType: String) {
        self.numberValue = numberValue
        self.photoValue = photoValue
        self.stringValue = stringValue
        self.valueType = valueType
    }


}

