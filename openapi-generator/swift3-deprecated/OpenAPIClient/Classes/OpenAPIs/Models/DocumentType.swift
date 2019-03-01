//
// DocumentType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class DocumentType: JSONEncodable {

    /** The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have. */
    public var fieldTypes: [Array]?
    /** Name of the document type. */
    public var name: String?
    /** ID for the organization this document belongs to. */
    public var orgId: Int64?
    /** Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type. */
    public var uuid: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["fieldTypes"] = self.fieldTypes?.encodeToJSON()
        nillableDictionary["name"] = self.name
        nillableDictionary["orgId"] = self.orgId?.encodeToJSON()
        nillableDictionary["uuid"] = self.uuid

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
