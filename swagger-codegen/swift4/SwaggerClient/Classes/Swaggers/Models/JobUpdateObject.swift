//
// JobUpdateObject.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct JobUpdateObject: Codable {

    /** Timestamp that this event was updated, represented as Unix milliseconds since epoch. */
    public var changedAtMs: Int64?
    /** ID of the Samsara job. */
    public var jobId: Int64?
    public var jobState: JobStatus?
    public var prevJobState: PrevJobStatus?
    public var route: DispatchRoute?
    /** ID of the Samsara dispatch route. */
    public var routeId: Int64?

    public init(changedAtMs: Int64?, jobId: Int64?, jobState: JobStatus?, prevJobState: PrevJobStatus?, route: DispatchRoute?, routeId: Int64?) {
        self.changedAtMs = changedAtMs
        self.jobId = jobId
        self.jobState = jobState
        self.prevJobState = prevJobState
        self.route = route
        self.routeId = routeId
    }

    public enum CodingKeys: String, CodingKey { 
        case changedAtMs = "changed_at_ms"
        case jobId = "job_id"
        case jobState = "job_state"
        case prevJobState = "prev_job_state"
        case route
        case routeId = "route_id"
    }


}

