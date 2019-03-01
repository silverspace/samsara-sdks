//
// SensorsAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Alamofire



public class SensorsAPI: APIBase {
    /**
     /sensors/list
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupParam: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getSensors(accessToken accessToken: String, groupParam: InlineObject23, completion: ((data: InlineResponse2008?, error: ErrorType?) -> Void)) {
        getSensorsWithRequestBuilder(accessToken: accessToken, groupParam: groupParam).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /sensors/list
     - POST /sensors/list
     - Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.     - examples: [{contentType=application/json, example={
  "sensors" : [ {
    "macAddress" : "11:11:11:11:11:11",
    "name" : "Freezer ABC",
    "id" : 123
  }, {
    "macAddress" : "11:11:11:11:11:11",
    "name" : "Freezer ABC",
    "id" : 123
  } ]
}, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupParam: (body)  

     - returns: RequestBuilder<InlineResponse2008> 
     */
    public class func getSensorsWithRequestBuilder(accessToken accessToken: String, groupParam: InlineObject23) -> RequestBuilder<InlineResponse2008> {
        let path = "/sensors/list"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = groupParam.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<InlineResponse2008>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /sensors/cargo
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getSensorsCargo(accessToken accessToken: String, sensorParam: InlineObject19, completion: ((data: CargoResponse?, error: ErrorType?) -> Void)) {
        getSensorsCargoWithRequestBuilder(accessToken: accessToken, sensorParam: sensorParam).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /sensors/cargo
     - POST /sensors/cargo
     - Get cargo monitor status (empty / full) for requested sensors.     - examples: [{contentType=application/json, example={
  "sensors" : [ {
    "cargoEmpty" : true,
    "name" : "Trailer Cargo Sensor",
    "id" : 122
  }, {
    "cargoEmpty" : true,
    "name" : "Trailer Cargo Sensor",
    "id" : 122
  } ],
  "groupId" : 101
}, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body)  

     - returns: RequestBuilder<CargoResponse> 
     */
    public class func getSensorsCargoWithRequestBuilder(accessToken accessToken: String, sensorParam: InlineObject19) -> RequestBuilder<CargoResponse> {
        let path = "/sensors/cargo"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = sensorParam.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<CargoResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /sensors/door
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getSensorsDoor(accessToken accessToken: String, sensorParam: InlineObject20, completion: ((data: DoorResponse?, error: ErrorType?) -> Void)) {
        getSensorsDoorWithRequestBuilder(accessToken: accessToken, sensorParam: sensorParam).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /sensors/door
     - POST /sensors/door
     - Get door monitor status (closed / open) for requested sensors.     - examples: [{contentType=application/json, example={
  "sensors" : [ {
    "doorClosed" : true,
    "name" : "Trailer Door Sensor",
    "id" : 122
  }, {
    "doorClosed" : true,
    "name" : "Trailer Door Sensor",
    "id" : 122
  } ],
  "groupId" : 101
}, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body)  

     - returns: RequestBuilder<DoorResponse> 
     */
    public class func getSensorsDoorWithRequestBuilder(accessToken accessToken: String, sensorParam: InlineObject20) -> RequestBuilder<DoorResponse> {
        let path = "/sensors/door"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = sensorParam.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<DoorResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /sensors/history
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter historyParam: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getSensorsHistory(accessToken accessToken: String, historyParam: InlineObject21, completion: ((data: SensorHistoryResponse?, error: ErrorType?) -> Void)) {
        getSensorsHistoryWithRequestBuilder(accessToken: accessToken, historyParam: historyParam).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /sensors/history
     - POST /sensors/history
     - Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.     - examples: [{contentType=application/json, example={
  "results" : [ {
    "series" : [ 1, 1 ],
    "timeMs" : 1453449599999
  }, {
    "series" : [ 1, 1 ],
    "timeMs" : 1453449599999
  } ]
}, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter historyParam: (body)  

     - returns: RequestBuilder<SensorHistoryResponse> 
     */
    public class func getSensorsHistoryWithRequestBuilder(accessToken accessToken: String, historyParam: InlineObject21) -> RequestBuilder<SensorHistoryResponse> {
        let path = "/sensors/history"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = historyParam.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<SensorHistoryResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /sensors/humidity
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getSensorsHumidity(accessToken accessToken: String, sensorParam: InlineObject22, completion: ((data: HumidityResponse?, error: ErrorType?) -> Void)) {
        getSensorsHumidityWithRequestBuilder(accessToken: accessToken, sensorParam: sensorParam).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /sensors/humidity
     - POST /sensors/humidity
     - Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.     - examples: [{contentType=application/json, example={
  "sensors" : [ {
    "name" : "Freezer Humidity Sensor",
    "humidity" : 53,
    "id" : 122
  }, {
    "name" : "Freezer Humidity Sensor",
    "humidity" : 53,
    "id" : 122
  } ],
  "groupId" : 101
}, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body)  

     - returns: RequestBuilder<HumidityResponse> 
     */
    public class func getSensorsHumidityWithRequestBuilder(accessToken accessToken: String, sensorParam: InlineObject22) -> RequestBuilder<HumidityResponse> {
        let path = "/sensors/humidity"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = sensorParam.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<HumidityResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /sensors/temperature
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getSensorsTemperature(accessToken accessToken: String, sensorParam: InlineObject24, completion: ((data: TemperatureResponse?, error: ErrorType?) -> Void)) {
        getSensorsTemperatureWithRequestBuilder(accessToken: accessToken, sensorParam: sensorParam).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /sensors/temperature
     - POST /sensors/temperature
     - Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.     - examples: [{contentType=application/json, example={
  "sensors" : [ {
    "probeTemperature" : -20145,
    "name" : "Freezer Temp Sensor",
    "id" : 122,
    "ambientTemperature" : 11057
  }, {
    "probeTemperature" : -20145,
    "name" : "Freezer Temp Sensor",
    "id" : 122,
    "ambientTemperature" : 11057
  } ],
  "groupId" : 101
}, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter sensorParam: (body)  

     - returns: RequestBuilder<TemperatureResponse> 
     */
    public class func getSensorsTemperatureWithRequestBuilder(accessToken accessToken: String, sensorParam: InlineObject24) -> RequestBuilder<TemperatureResponse> {
        let path = "/sensors/temperature"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = sensorParam.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<TemperatureResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

}
