//
// DocumentFieldCreate.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class DocumentFieldCreate: JSONEncodable {
    /** Value of this field if this document field has valueType: ValueType_Number. */
    public var numberValue: Double?
    /** Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. */
    public var photoValue: [DocumentFieldCreatePhotoValue]?
    /** Value of this field if this document field has valueType: ValueType_String. */
    public var stringValue: String?
    /** Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
    public var valueType: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["numberValue"] = self.numberValue
        nillableDictionary["photoValue"] = self.photoValue?.encodeToJSON()
        nillableDictionary["stringValue"] = self.stringValue
        nillableDictionary["valueType"] = self.valueType
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
