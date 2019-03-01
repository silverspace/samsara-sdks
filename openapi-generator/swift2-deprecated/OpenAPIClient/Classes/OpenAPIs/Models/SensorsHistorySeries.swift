//
// SensorsHistorySeries.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Sensor ID and field to query. */
public class SensorsHistorySeries: JSONEncodable {
    public enum Field: String { 
        case Ambienttemperature = "ambientTemperature"
        case Probetemperature = "probeTemperature"
        case Currentloop1raw = "currentLoop1Raw"
        case Currentloop1mapped = "currentLoop1Mapped"
        case Currentloop2raw = "currentLoop2Raw"
        case Currentloop2mapped = "currentLoop2Mapped"
        case Pmpowertotal = "pmPowerTotal"
        case Pmphase1power = "pmPhase1Power"
        case Pmphase2power = "pmPhase2Power"
        case Pmphase3power = "pmPhase3Power"
        case Pmphase1powerfactor = "pmPhase1PowerFactor"
        case Pmphase2powerfactor = "pmPhase2PowerFactor"
        case Pmphase3powerfactor = "pmPhase3PowerFactor"
    }
    /** Field to query. */
    public var field: Field?
    /** Sensor ID to query. */
    public var widgetId: Int64?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["field"] = self.field?.rawValue
        nillableDictionary["widgetId"] = self.widgetId?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
