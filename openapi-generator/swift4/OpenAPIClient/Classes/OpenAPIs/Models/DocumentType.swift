//
// DocumentType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct DocumentType: Codable {

    /** The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have. */
    public var fieldTypes: [Array]?
    /** Name of the document type. */
    public var name: String
    /** ID for the organization this document belongs to. */
    public var orgId: Int64
    /** Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type. */
    public var uuid: String

    public init(fieldTypes: [Array]?, name: String, orgId: Int64, uuid: String) {
        self.fieldTypes = fieldTypes
        self.name = name
        self.orgId = orgId
        self.uuid = uuid
    }


}

