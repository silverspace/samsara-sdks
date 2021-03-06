//
// Document.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class Document: JSONEncodable {
    /** ID of the Samsara dispatch job for which the document is submitted */
    public var dispatchJobId: Int64?
    /** Notes submitted with this document. */
    public var notes: String?
    /** Descriptive name of this type of document. */
    public var documentType: String?
    /** The time in Unix epoch milliseconds that the document is created. */
    public var driverCreatedAtMs: Int64?
    /** ID of the driver for whom the document is submitted */
    public var driverId: Int64?
    /** The fields associated with this document. */
    public var fields: [DocumentField]?
    /** VehicleID of the driver at document creation. */
    public var vehicleId: Int64?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["dispatchJobId"] = self.dispatchJobId?.encodeToJSON()
        nillableDictionary["notes"] = self.notes
        nillableDictionary["documentType"] = self.documentType
        nillableDictionary["driverCreatedAtMs"] = self.driverCreatedAtMs?.encodeToJSON()
        nillableDictionary["driverId"] = self.driverId?.encodeToJSON()
        nillableDictionary["fields"] = self.fields?.encodeToJSON()
        nillableDictionary["vehicleId"] = self.vehicleId?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
