//
// EngineState.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** The state of the vehicle over time. State can be Running, Off, or Idle. */

public struct EngineState: Codable {

    public enum Value: String, Codable {
        case running = "Running"
        case off = "Off"
        case idle = "Idle"
    }
    /** Timestamp in Unix epoch milliseconds. */
    public var timeMs: Any
    public var value: Value

    public init(timeMs: Any, value: Value) {
        self.timeMs = timeMs
        self.value = value
    }


}

