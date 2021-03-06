//
// RoutesAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Alamofire



public class RoutesAPI: APIBase {
    /**
     /fleet/dispatch/routes
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter createDispatchRouteParams: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func createDispatchRoute(accessToken accessToken: String, createDispatchRouteParams: DispatchRouteCreate, completion: ((data: DispatchRoute?, error: ErrorType?) -> Void)) {
        createDispatchRouteWithRequestBuilder(accessToken: accessToken, createDispatchRouteParams: createDispatchRouteParams).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /fleet/dispatch/routes
     - POST /fleet/dispatch/routes
     - Create a new dispatch route.     - examples: [{contentType=application/json, example=null, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter createDispatchRouteParams: (body)  

     - returns: RequestBuilder<DispatchRoute> 
     */
    public class func createDispatchRouteWithRequestBuilder(accessToken accessToken: String, createDispatchRouteParams: DispatchRouteCreate) -> RequestBuilder<DispatchRoute> {
        let path = "/fleet/dispatch/routes"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = createDispatchRouteParams.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<DispatchRoute>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverId: (path) ID of the driver with the associated routes. 
     - parameter createDispatchRouteParams: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func createDriverDispatchRoute(accessToken accessToken: String, driverId: Int64, createDispatchRouteParams: DispatchRouteCreate, completion: ((data: DispatchRoute?, error: ErrorType?) -> Void)) {
        createDriverDispatchRouteWithRequestBuilder(accessToken: accessToken, driverId: driverId, createDispatchRouteParams: createDispatchRouteParams).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     - POST /fleet/drivers/{driverId}/dispatch/routes
     - Create a new dispatch route for the driver with driver_id.     - examples: [{contentType=application/json, example=null, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverId: (path) ID of the driver with the associated routes. 
     - parameter createDispatchRouteParams: (body)  

     - returns: RequestBuilder<DispatchRoute> 
     */
    public class func createDriverDispatchRouteWithRequestBuilder(accessToken accessToken: String, driverId: Int64, createDispatchRouteParams: DispatchRouteCreate) -> RequestBuilder<DispatchRoute> {
        var path = "/fleet/drivers/{driverId}/dispatch/routes"
        path = path.stringByReplacingOccurrencesOfString("{driver_id}", withString: "\(driverId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = createDispatchRouteParams.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<DispatchRoute>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter vehicleId: (path) ID of the vehicle with the associated routes. 
     - parameter createDispatchRouteParams: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func createVehicleDispatchRoute(accessToken accessToken: String, vehicleId: Int64, createDispatchRouteParams: DispatchRouteCreate, completion: ((data: DispatchRoute?, error: ErrorType?) -> Void)) {
        createVehicleDispatchRouteWithRequestBuilder(accessToken: accessToken, vehicleId: vehicleId, createDispatchRouteParams: createDispatchRouteParams).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     - POST /fleet/vehicles/{vehicleId}/dispatch/routes
     - Create a new dispatch route for the vehicle with vehicle_id.     - examples: [{contentType=application/json, example=null, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter vehicleId: (path) ID of the vehicle with the associated routes. 
     - parameter createDispatchRouteParams: (body)  

     - returns: RequestBuilder<DispatchRoute> 
     */
    public class func createVehicleDispatchRouteWithRequestBuilder(accessToken accessToken: String, vehicleId: Int64, createDispatchRouteParams: DispatchRouteCreate) -> RequestBuilder<DispatchRoute> {
        var path = "/fleet/vehicles/{vehicleId}/dispatch/routes"
        path = path.stringByReplacingOccurrencesOfString("{vehicle_id}", withString: "\(vehicleId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = createDispatchRouteParams.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<DispatchRoute>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /fleet/dispatch/routes/{route_id:[0-9]+}/
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter routeId: (path) ID of the dispatch route. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deleteDispatchRouteById(accessToken accessToken: String, routeId: Int64, completion: ((error: ErrorType?) -> Void)) {
        deleteDispatchRouteByIdWithRequestBuilder(accessToken: accessToken, routeId: routeId).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     /fleet/dispatch/routes/{route_id:[0-9]+}/
     - DELETE /fleet/dispatch/routes/{routeId}
     - Delete a dispatch route and its associated jobs.     - parameter accessToken: (query) Samsara API access token. 
     - parameter routeId: (path) ID of the dispatch route. 

     - returns: RequestBuilder<Void> 
     */
    public class func deleteDispatchRouteByIdWithRequestBuilder(accessToken accessToken: String, routeId: Int64) -> RequestBuilder<Void> {
        var path = "/fleet/dispatch/routes/{routeId}"
        path = path.stringByReplacingOccurrencesOfString("{route_id}", withString: "\(routeId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "access_token": accessToken
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /fleet/dispatch/routes
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)
     - parameter endTime: (query) Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     - parameter duration: (query) Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func fetchAllDispatchRoutes(accessToken accessToken: String, groupId: Int64? = nil, endTime: Int64? = nil, duration: Int64? = nil, completion: ((data: [DispatchRoute]?, error: ErrorType?) -> Void)) {
        fetchAllDispatchRoutesWithRequestBuilder(accessToken: accessToken, groupId: groupId, endTime: endTime, duration: duration).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /fleet/dispatch/routes
     - GET /fleet/dispatch/routes
     - Fetch all of the dispatch routes for the group.     - examples: [{contentType=application/json, example=null, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)
     - parameter endTime: (query) Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     - parameter duration: (query) Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)

     - returns: RequestBuilder<[DispatchRoute]> 
     */
    public class func fetchAllDispatchRoutesWithRequestBuilder(accessToken accessToken: String, groupId: Int64? = nil, endTime: Int64? = nil, duration: Int64? = nil) -> RequestBuilder<[DispatchRoute]> {
        let path = "/fleet/dispatch/routes"
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "access_token": accessToken,
            "group_id": groupId?.encodeToJSON(),
            "end_time": endTime?.encodeToJSON(),
            "duration": duration?.encodeToJSON()
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[DispatchRoute]>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /fleet/dispatch/routes/job_updates
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)
     - parameter sequenceId: (query) Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     - parameter include: (query) Optionally set include&#x3D;route to include route object in response payload. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func fetchAllRouteJobUpdates(accessToken accessToken: String, groupId: Int64? = nil, sequenceId: String? = nil, include: String? = nil, completion: ((data: AllRouteJobUpdates?, error: ErrorType?) -> Void)) {
        fetchAllRouteJobUpdatesWithRequestBuilder(accessToken: accessToken, groupId: groupId, sequenceId: sequenceId, include: include).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /fleet/dispatch/routes/job_updates
     - GET /fleet/dispatch/routes/job_updates
     - Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID     - examples: [{contentType=application/json, example={
  "sequence_id" : "eyJpZCI6MywiY3JlYXRlZF9hdCI6MTQ5OTQyOTIyMDAwMn0=",
  "job_updates" : [ {
    "changed_at_ms" : 1462881998034,
    "route_id" : 556,
    "job_id" : 773,
    "prev_job_state" : "JobState_EnRoute",
    "job_state" : "JobState_Arrived"
  }, {
    "changed_at_ms" : 1462881998034,
    "route_id" : 556,
    "job_id" : 773,
    "prev_job_state" : "JobState_EnRoute",
    "job_state" : "JobState_Arrived"
  } ]
}, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)
     - parameter sequenceId: (query) Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     - parameter include: (query) Optionally set include&#x3D;route to include route object in response payload. (optional)

     - returns: RequestBuilder<AllRouteJobUpdates> 
     */
    public class func fetchAllRouteJobUpdatesWithRequestBuilder(accessToken accessToken: String, groupId: Int64? = nil, sequenceId: String? = nil, include: String? = nil) -> RequestBuilder<AllRouteJobUpdates> {
        let path = "/fleet/dispatch/routes/job_updates"
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "access_token": accessToken,
            "group_id": groupId?.encodeToJSON(),
            "sequence_id": sequenceId,
            "include": include
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<AllRouteJobUpdates>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /fleet/dispatch/routes/{route_id:[0-9]+}
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter routeId: (path) ID of the dispatch route. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getDispatchRouteById(accessToken accessToken: String, routeId: Int64, completion: ((data: DispatchRoute?, error: ErrorType?) -> Void)) {
        getDispatchRouteByIdWithRequestBuilder(accessToken: accessToken, routeId: routeId).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /fleet/dispatch/routes/{route_id:[0-9]+}
     - GET /fleet/dispatch/routes/{routeId}
     - Fetch a dispatch route by id.     - examples: [{contentType=application/json, example=null, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter routeId: (path) ID of the dispatch route. 

     - returns: RequestBuilder<DispatchRoute> 
     */
    public class func getDispatchRouteByIdWithRequestBuilder(accessToken accessToken: String, routeId: Int64) -> RequestBuilder<DispatchRoute> {
        var path = "/fleet/dispatch/routes/{routeId}"
        path = path.stringByReplacingOccurrencesOfString("{route_id}", withString: "\(routeId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "access_token": accessToken
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<DispatchRoute>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /fleet/dispatch/routes/{route_id:[0-9]+}/history
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter routeId: (path) ID of the route with history. 
     - parameter startTime: (query) Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     - parameter endTime: (query) Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getDispatchRouteHistory(accessToken accessToken: String, routeId: Int64, startTime: Int64? = nil, endTime: Int64? = nil, completion: ((data: DispatchRouteHistory?, error: ErrorType?) -> Void)) {
        getDispatchRouteHistoryWithRequestBuilder(accessToken: accessToken, routeId: routeId, startTime: startTime, endTime: endTime).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /fleet/dispatch/routes/{route_id:[0-9]+}/history
     - GET /fleet/dispatch/routes/{routeId}/history
     - Fetch the history of a dispatch route.     - examples: [{contentType=application/json, example={
  "history" : [ {
    "changed_at_ms" : 1499411220000
  }, {
    "changed_at_ms" : 1499411220000
  } ]
}, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter routeId: (path) ID of the route with history. 
     - parameter startTime: (query) Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     - parameter endTime: (query) Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)

     - returns: RequestBuilder<DispatchRouteHistory> 
     */
    public class func getDispatchRouteHistoryWithRequestBuilder(accessToken accessToken: String, routeId: Int64, startTime: Int64? = nil, endTime: Int64? = nil) -> RequestBuilder<DispatchRouteHistory> {
        var path = "/fleet/dispatch/routes/{routeId}/history"
        path = path.stringByReplacingOccurrencesOfString("{route_id}", withString: "\(routeId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "access_token": accessToken,
            "start_time": startTime?.encodeToJSON(),
            "end_time": endTime?.encodeToJSON()
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<DispatchRouteHistory>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverId: (path) ID of the driver with the associated routes. 
     - parameter endTime: (query) Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     - parameter duration: (query) Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getDispatchRoutesByDriverId(accessToken accessToken: String, driverId: Int64, endTime: Int64? = nil, duration: Int64? = nil, completion: ((data: [DispatchRoute]?, error: ErrorType?) -> Void)) {
        getDispatchRoutesByDriverIdWithRequestBuilder(accessToken: accessToken, driverId: driverId, endTime: endTime, duration: duration).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     - GET /fleet/drivers/{driverId}/dispatch/routes
     - Fetch all of the dispatch routes for a given driver.     - examples: [{contentType=application/json, example=null, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverId: (path) ID of the driver with the associated routes. 
     - parameter endTime: (query) Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     - parameter duration: (query) Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)

     - returns: RequestBuilder<[DispatchRoute]> 
     */
    public class func getDispatchRoutesByDriverIdWithRequestBuilder(accessToken accessToken: String, driverId: Int64, endTime: Int64? = nil, duration: Int64? = nil) -> RequestBuilder<[DispatchRoute]> {
        var path = "/fleet/drivers/{driverId}/dispatch/routes"
        path = path.stringByReplacingOccurrencesOfString("{driver_id}", withString: "\(driverId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "access_token": accessToken,
            "end_time": endTime?.encodeToJSON(),
            "duration": duration?.encodeToJSON()
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[DispatchRoute]>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter vehicleId: (path) ID of the vehicle with the associated routes. 
     - parameter endTime: (query) Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     - parameter duration: (query) Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getDispatchRoutesByVehicleId(accessToken accessToken: String, vehicleId: Int64, endTime: Int64? = nil, duration: Int64? = nil, completion: ((data: [DispatchRoute]?, error: ErrorType?) -> Void)) {
        getDispatchRoutesByVehicleIdWithRequestBuilder(accessToken: accessToken, vehicleId: vehicleId, endTime: endTime, duration: duration).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     - GET /fleet/vehicles/{vehicleId}/dispatch/routes
     - Fetch all of the dispatch routes for a given vehicle.     - examples: [{contentType=application/json, example=null, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter vehicleId: (path) ID of the vehicle with the associated routes. 
     - parameter endTime: (query) Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     - parameter duration: (query) Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)

     - returns: RequestBuilder<[DispatchRoute]> 
     */
    public class func getDispatchRoutesByVehicleIdWithRequestBuilder(accessToken accessToken: String, vehicleId: Int64, endTime: Int64? = nil, duration: Int64? = nil) -> RequestBuilder<[DispatchRoute]> {
        var path = "/fleet/vehicles/{vehicleId}/dispatch/routes"
        path = path.stringByReplacingOccurrencesOfString("{vehicle_id}", withString: "\(vehicleId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "access_token": accessToken,
            "end_time": endTime?.encodeToJSON(),
            "duration": duration?.encodeToJSON()
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[DispatchRoute]>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     /fleet/dispatch/routes/{route_id:[0-9]+}/
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter routeId: (path) ID of the dispatch route. 
     - parameter updateDispatchRouteParams: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func updateDispatchRouteById(accessToken accessToken: String, routeId: Int64, updateDispatchRouteParams: DispatchRoute, completion: ((data: DispatchRoute?, error: ErrorType?) -> Void)) {
        updateDispatchRouteByIdWithRequestBuilder(accessToken: accessToken, routeId: routeId, updateDispatchRouteParams: updateDispatchRouteParams).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     /fleet/dispatch/routes/{route_id:[0-9]+}/
     - PUT /fleet/dispatch/routes/{routeId}
     - Update a dispatch route and its associated jobs.     - examples: [{contentType=application/json, example=null, statusCode=200}]
     - parameter accessToken: (query) Samsara API access token. 
     - parameter routeId: (path) ID of the dispatch route. 
     - parameter updateDispatchRouteParams: (body)  

     - returns: RequestBuilder<DispatchRoute> 
     */
    public class func updateDispatchRouteByIdWithRequestBuilder(accessToken accessToken: String, routeId: Int64, updateDispatchRouteParams: DispatchRoute) -> RequestBuilder<DispatchRoute> {
        var path = "/fleet/dispatch/routes/{routeId}"
        path = path.stringByReplacingOccurrencesOfString("{route_id}", withString: "\(routeId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = updateDispatchRouteParams.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<DispatchRoute>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

}
