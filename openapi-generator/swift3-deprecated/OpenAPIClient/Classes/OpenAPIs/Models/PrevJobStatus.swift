//
// PrevJobStatus.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** The previous state of the dispatch job. */
public enum PrevJobStatus: String {
    case unassigned = "JobState_Unassigned"
    case scheduled = "JobState_Scheduled"
    case enRoute = "JobState_EnRoute"
    case arrived = "JobState_Arrived"
    case completed = "JobState_Completed"
    case skipped = "JobState_Skipped"

    func encodeToJSON() -> Any { return self.rawValue }
}