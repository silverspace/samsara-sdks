//
// SensorsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class SensorsAPI {
    /**
     /sensors/list
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupParam: (body) Group ID to query. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getSensors(accessToken: String, groupParam: GroupParam, completion: @escaping ((_ data: InlineResponse2008?,_ error: Error?) -> Void)) {
        getSensorsWithRequestBuilder(accessToken: accessToken, groupParam: groupParam).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /sensors/list
     - POST /sensors/list
     - Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     - examples: [{example={
  "sensors" : [ {
    "id" : 123,
    "name" : "Freezer ABC",
    "macAddress" : "11:11:11:11:11:11"
  }, {
    "id" : 123,
    "name" : "Freezer ABC",
    "macAddress" : "11:11:11:11:11:11"
  } ]
}, contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupParam: (body) Group ID to query. 

     - returns: RequestBuilder<InlineResponse2008> 
     */
    open class func getSensorsWithRequestBuilder(accessToken: String, groupParam: GroupParam) -> RequestBuilder<InlineResponse2008> {
        let path = "/sensors/list"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: groupParam)

        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<InlineResponse2008>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     /sensors/cargo
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body) Group ID and list of sensor IDs to query. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getSensorsCargo(accessToken: String, sensorParam: SensorParam, completion: @escaping ((_ data: CargoResponse?,_ error: Error?) -> Void)) {
        getSensorsCargoWithRequestBuilder(accessToken: accessToken, sensorParam: sensorParam).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /sensors/cargo
     - POST /sensors/cargo
     - Get cargo monitor status (empty / full) for requested sensors.
     - examples: [{example={
  "sensors" : [ {
    "id" : 122,
    "name" : "Trailer Cargo Sensor",
    "cargoEmpty" : true
  }, {
    "id" : 122,
    "name" : "Trailer Cargo Sensor",
    "cargoEmpty" : true
  } ],
  "groupId" : 101
}, contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body) Group ID and list of sensor IDs to query. 

     - returns: RequestBuilder<CargoResponse> 
     */
    open class func getSensorsCargoWithRequestBuilder(accessToken: String, sensorParam: SensorParam) -> RequestBuilder<CargoResponse> {
        let path = "/sensors/cargo"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: sensorParam)

        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<CargoResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     /sensors/door
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body) Group ID and list of sensor IDs to query. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getSensorsDoor(accessToken: String, sensorParam: SensorParam, completion: @escaping ((_ data: DoorResponse?,_ error: Error?) -> Void)) {
        getSensorsDoorWithRequestBuilder(accessToken: accessToken, sensorParam: sensorParam).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /sensors/door
     - POST /sensors/door
     - Get door monitor status (closed / open) for requested sensors.
     - examples: [{example={
  "sensors" : [ {
    "id" : 122,
    "doorClosed" : true,
    "name" : "Trailer Door Sensor"
  }, {
    "id" : 122,
    "doorClosed" : true,
    "name" : "Trailer Door Sensor"
  } ],
  "groupId" : 101
}, contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body) Group ID and list of sensor IDs to query. 

     - returns: RequestBuilder<DoorResponse> 
     */
    open class func getSensorsDoorWithRequestBuilder(accessToken: String, sensorParam: SensorParam) -> RequestBuilder<DoorResponse> {
        let path = "/sensors/door"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: sensorParam)

        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<DoorResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     /sensors/history
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter historyParam: (body) Group ID, time range and resolution, and list of sensor ID, field pairs to query. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getSensorsHistory(accessToken: String, historyParam: HistoryParam1, completion: @escaping ((_ data: SensorHistoryResponse?,_ error: Error?) -> Void)) {
        getSensorsHistoryWithRequestBuilder(accessToken: accessToken, historyParam: historyParam).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /sensors/history
     - POST /sensors/history
     - Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     - examples: [{example={
  "results" : [ {
    "series" : [ 1, 1 ],
    "timeMs" : 1453449599999
  }, {
    "series" : [ 1, 1 ],
    "timeMs" : 1453449599999
  } ]
}, contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter historyParam: (body) Group ID, time range and resolution, and list of sensor ID, field pairs to query. 

     - returns: RequestBuilder<SensorHistoryResponse> 
     */
    open class func getSensorsHistoryWithRequestBuilder(accessToken: String, historyParam: HistoryParam1) -> RequestBuilder<SensorHistoryResponse> {
        let path = "/sensors/history"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: historyParam)

        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<SensorHistoryResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     /sensors/humidity
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body) Group ID and list of sensor IDs to query. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getSensorsHumidity(accessToken: String, sensorParam: SensorParam, completion: @escaping ((_ data: HumidityResponse?,_ error: Error?) -> Void)) {
        getSensorsHumidityWithRequestBuilder(accessToken: accessToken, sensorParam: sensorParam).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /sensors/humidity
     - POST /sensors/humidity
     - Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     - examples: [{example={
  "sensors" : [ {
    "id" : 122,
    "humidity" : 53,
    "name" : "Freezer Humidity Sensor"
  }, {
    "id" : 122,
    "humidity" : 53,
    "name" : "Freezer Humidity Sensor"
  } ],
  "groupId" : 101
}, contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body) Group ID and list of sensor IDs to query. 

     - returns: RequestBuilder<HumidityResponse> 
     */
    open class func getSensorsHumidityWithRequestBuilder(accessToken: String, sensorParam: SensorParam) -> RequestBuilder<HumidityResponse> {
        let path = "/sensors/humidity"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: sensorParam)

        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<HumidityResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     /sensors/temperature
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body) Group ID and list of sensor IDs to query. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getSensorsTemperature(accessToken: String, sensorParam: SensorParam, completion: @escaping ((_ data: TemperatureResponse?,_ error: Error?) -> Void)) {
        getSensorsTemperatureWithRequestBuilder(accessToken: accessToken, sensorParam: sensorParam).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /sensors/temperature
     - POST /sensors/temperature
     - Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     - examples: [{example={
  "sensors" : [ {
    "id" : 122,
    "name" : "Freezer Temp Sensor",
    "probeTemperature" : -20145,
    "ambientTemperature" : 11057
  }, {
    "id" : 122,
    "name" : "Freezer Temp Sensor",
    "probeTemperature" : -20145,
    "ambientTemperature" : 11057
  } ],
  "groupId" : 101
}, contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body) Group ID and list of sensor IDs to query. 

     - returns: RequestBuilder<TemperatureResponse> 
     */
    open class func getSensorsTemperatureWithRequestBuilder(accessToken: String, sensorParam: SensorParam) -> RequestBuilder<TemperatureResponse> {
        let path = "/sensors/temperature"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: sensorParam)

        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<TemperatureResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

}