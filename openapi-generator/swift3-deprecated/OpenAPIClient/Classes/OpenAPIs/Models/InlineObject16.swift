//
// InlineObject16.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class InlineObject16: JSONEncodable {

    public var externalIds: [String:String]?
    /** Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic */
    public var harshAccelSetting: Int32?
    /** Name */
    public var name: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["externalIds"] = self.externalIds?.encodeToJSON()
        nillableDictionary["harsh_accel_setting"] = self.harshAccelSetting?.encodeToJSON()
        nillableDictionary["name"] = self.name

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

