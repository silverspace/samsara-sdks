//
// AssetsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class AssetsAPI {
    /**
     /fleet/assets/locations
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getAllAssetCurrentLocations(accessToken: String, groupId: Int64? = nil, completion: @escaping ((_ data: InlineResponse2001?,_ error: Error?) -> Void)) {
        getAllAssetCurrentLocationsWithRequestBuilder(accessToken: accessToken, groupId: groupId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /fleet/assets/locations
     - GET /fleet/assets/locations
     - Fetch current locations of all assets for the group.
     - examples: [{example={
  "assets" : [ {
    "id" : 1,
    "engineHours" : 104,
    "location" : [ {
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "latitude" : 37.0,
      "timeMs" : 12314151
    }, {
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "latitude" : 37.0,
      "timeMs" : 12314151
    } ],
    "name" : "Trailer 123",
    "cable" : [ {
      "assetType" : "Reefer (Thermo King)"
    }, {
      "assetType" : "Reefer (Thermo King)"
    } ]
  }, {
    "id" : 1,
    "engineHours" : 104,
    "location" : [ {
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "latitude" : 37.0,
      "timeMs" : 12314151
    }, {
      "speedMilesPerHour" : 35.0,
      "location" : "525 York, San Francisco, CA",
      "longitude" : -122.7,
      "latitude" : 37.0,
      "timeMs" : 12314151
    } ],
    "name" : "Trailer 123",
    "cable" : [ {
      "assetType" : "Reefer (Thermo King)"
    }, {
      "assetType" : "Reefer (Thermo King)"
    } ]
  } ]
}, contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)

     - returns: RequestBuilder<InlineResponse2001> 
     */
    open class func getAllAssetCurrentLocationsWithRequestBuilder(accessToken: String, groupId: Int64? = nil) -> RequestBuilder<InlineResponse2001> {
        let path = "/fleet/assets/locations"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken, 
            "group_id": groupId?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<InlineResponse2001>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     /fleet/assets
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getAllAssets(accessToken: String, groupId: Int64? = nil, completion: @escaping ((_ data: InlineResponse200?,_ error: Error?) -> Void)) {
        getAllAssetsWithRequestBuilder(accessToken: accessToken, groupId: groupId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /fleet/assets
     - GET /fleet/assets
     - Fetch all of the assets for the group.
     - examples: [{example={
  "assets" : [ {
    "id" : 1,
    "assetSerialNumber" : "SNTEST123",
    "engineHours" : 104,
    "name" : "Trailer 123",
    "cable" : [ {
      "assetType" : "Reefer (Thermo King)"
    }, {
      "assetType" : "Reefer (Thermo King)"
    } ]
  }, {
    "id" : 1,
    "assetSerialNumber" : "SNTEST123",
    "engineHours" : 104,
    "name" : "Trailer 123",
    "cable" : [ {
      "assetType" : "Reefer (Thermo King)"
    }, {
      "assetType" : "Reefer (Thermo King)"
    } ]
  } ]
}, contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)

     - returns: RequestBuilder<InlineResponse200> 
     */
    open class func getAllAssetsWithRequestBuilder(accessToken: String, groupId: Int64? = nil) -> RequestBuilder<InlineResponse200> {
        let path = "/fleet/assets"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken, 
            "group_id": groupId?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<InlineResponse200>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     /fleet/assets/{assetId:[0-9]+}/locations
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter assetId: (path) ID of the asset 
     - parameter startMs: (query) Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     - parameter endMs: (query) Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getAssetLocation(accessToken: String, assetId: Int64, startMs: Int64, endMs: Int64, completion: @escaping ((_ data: AssetLocationResponse?,_ error: Error?) -> Void)) {
        getAssetLocationWithRequestBuilder(accessToken: accessToken, assetId: assetId, startMs: startMs, endMs: endMs).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /fleet/assets/{assetId:[0-9]+}/locations
     - GET /fleet/assets/{asset_id}/locations
     - Fetch the historical locations for the asset.
     - examples: [{example="", contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter assetId: (path) ID of the asset 
     - parameter startMs: (query) Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     - parameter endMs: (query) Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 

     - returns: RequestBuilder<AssetLocationResponse> 
     */
    open class func getAssetLocationWithRequestBuilder(accessToken: String, assetId: Int64, startMs: Int64, endMs: Int64) -> RequestBuilder<AssetLocationResponse> {
        var path = "/fleet/assets/{asset_id}/locations"
        let assetIdPreEscape = "\(assetId)"
        let assetIdPostEscape = assetIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{asset_id}", with: assetIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken, 
            "startMs": startMs.encodeToJSON(), 
            "endMs": endMs.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<AssetLocationResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     /fleet/assets/{assetId:[0-9]+}/reefer
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter assetId: (path) ID of the asset 
     - parameter startMs: (query) Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     - parameter endMs: (query) Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getAssetReefer(accessToken: String, assetId: Int64, startMs: Int64, endMs: Int64, completion: @escaping ((_ data: AssetReeferResponse?,_ error: Error?) -> Void)) {
        getAssetReeferWithRequestBuilder(accessToken: accessToken, assetId: assetId, startMs: startMs, endMs: endMs).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /fleet/assets/{assetId:[0-9]+}/reefer
     - GET /fleet/assets/{asset_id}/reefer
     - Fetch the reefer-specific stats of an asset.
     - examples: [{example={
  "id" : 1,
  "reeferStats" : {
    "powerStatus" : [ {
      "status" : "Active (Continuous)",
      "changedAtMs" : 1453449599999
    }, {
      "status" : "Active (Continuous)",
      "changedAtMs" : 1453449599999
    } ],
    "engineHours" : [ {
      "engineHours" : 1200,
      "changedAtMs" : 1453449599999
    }, {
      "engineHours" : 1200,
      "changedAtMs" : 1453449599999
    } ],
    "returnAirTemp" : [ {
      "changedAtMs" : 1453449599999,
      "tempInMilliC" : 31110
    }, {
      "changedAtMs" : 1453449599999,
      "tempInMilliC" : 31110
    } ],
    "fuelPercentage" : [ {
      "fuelPercentage" : 99,
      "changedAtMs" : 1453449599999
    }, {
      "fuelPercentage" : 99,
      "changedAtMs" : 1453449599999
    } ],
    "setPoint" : [ {
      "changedAtMs" : 1453449599999,
      "tempInMilliC" : 31110
    }, {
      "changedAtMs" : 1453449599999,
      "tempInMilliC" : 31110
    } ],
    "alarms" : [ {
      "changedAtMs" : 1453449599999,
      "alarms" : [ {
        "description" : "Check Return Air Sensor",
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "alarmCode" : 102
      }, {
        "description" : "Check Return Air Sensor",
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "alarmCode" : 102
      } ]
    }, {
      "changedAtMs" : 1453449599999,
      "alarms" : [ {
        "description" : "Check Return Air Sensor",
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "alarmCode" : 102
      }, {
        "description" : "Check Return Air Sensor",
        "severity" : 1,
        "operatorAction" : "Check and repair at end of trip",
        "alarmCode" : 102
      } ]
    } ]
  },
  "assetType" : "Reefer (Thermo King)",
  "name" : "Reefer 123"
}, contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter assetId: (path) ID of the asset 
     - parameter startMs: (query) Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     - parameter endMs: (query) Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 

     - returns: RequestBuilder<AssetReeferResponse> 
     */
    open class func getAssetReeferWithRequestBuilder(accessToken: String, assetId: Int64, startMs: Int64, endMs: Int64) -> RequestBuilder<AssetReeferResponse> {
        var path = "/fleet/assets/{asset_id}/reefer"
        let assetIdPreEscape = "\(assetId)"
        let assetIdPostEscape = assetIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{asset_id}", with: assetIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken, 
            "startMs": startMs.encodeToJSON(), 
            "endMs": endMs.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<AssetReeferResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
