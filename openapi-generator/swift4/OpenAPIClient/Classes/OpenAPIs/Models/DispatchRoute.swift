//
// DispatchRoute.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct DispatchRoute: Codable {

    /** The dispatch jobs associated with this route. */
    public var dispatchJobs: [DispatchJob]
    /** ID of the Samsara dispatch route. */
    public var _id: Int64

    public init(dispatchJobs: [DispatchJob], _id: Int64) {
        self.dispatchJobs = dispatchJobs
        self._id = _id
    }

    public enum CodingKeys: String, CodingKey { 
        case dispatchJobs = "dispatch_jobs"
        case _id = "id"
    }


}

