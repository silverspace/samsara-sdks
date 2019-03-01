//
// DriversAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class DriversAPI {
    /**
     /fleet/drivers/create
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter createDriverParam: (body) Driver creation body 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func createDriver(accessToken: String, createDriverParam: DriverForCreate, completion: @escaping ((_ data: Driver?,_ error: Error?) -> Void)) {
        createDriverWithRequestBuilder(accessToken: accessToken, createDriverParam: createDriverParam).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /fleet/drivers/create
     - POST /fleet/drivers/create
     - Create a new driver.
     - examples: [{example="", contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter createDriverParam: (body) Driver creation body 

     - returns: RequestBuilder<Driver> 
     */
    open class func createDriverWithRequestBuilder(accessToken: String, createDriverParam: DriverForCreate) -> RequestBuilder<Driver> {
        let path = "/fleet/drivers/create"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: createDriverParam)

        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<Driver>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverIdOrExternalId: (path) ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func deactivateDriver(accessToken: String, driverIdOrExternalId: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        deactivateDriverWithRequestBuilder(accessToken: accessToken, driverIdOrExternalId: driverIdOrExternalId).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     - DELETE /fleet/drivers/{driver_id_or_external_id}
     - Deactivate a driver with the given id.
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverIdOrExternalId: (path) ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 

     - returns: RequestBuilder<Void> 
     */
    open class func deactivateDriverWithRequestBuilder(accessToken: String, driverIdOrExternalId: String) -> RequestBuilder<Void> {
        var path = "/fleet/drivers/{driver_id_or_external_id}"
        let driverIdOrExternalIdPreEscape = "\(driverIdOrExternalId)"
        let driverIdOrExternalIdPostEscape = driverIdOrExternalIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{driver_id_or_external_id}", with: driverIdOrExternalIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     /fleet/drivers/inactive
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getAllDeactivatedDrivers(accessToken: String, groupId: Int64? = nil, completion: @escaping ((_ data: [Driver]?,_ error: Error?) -> Void)) {
        getAllDeactivatedDriversWithRequestBuilder(accessToken: accessToken, groupId: groupId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /fleet/drivers/inactive
     - GET /fleet/drivers/inactive
     - Fetch all deactivated drivers for the group.
     - examples: [{example=[ "", "" ], contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)

     - returns: RequestBuilder<[Driver]> 
     */
    open class func getAllDeactivatedDriversWithRequestBuilder(accessToken: String, groupId: Int64? = nil) -> RequestBuilder<[Driver]> {
        let path = "/fleet/drivers/inactive"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken, 
            "group_id": groupId?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<[Driver]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverIdOrExternalId: (path) ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getDeactivatedDriverById(accessToken: String, driverIdOrExternalId: String, completion: @escaping ((_ data: Driver?,_ error: Error?) -> Void)) {
        getDeactivatedDriverByIdWithRequestBuilder(accessToken: accessToken, driverIdOrExternalId: driverIdOrExternalId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     - GET /fleet/drivers/inactive/{driver_id_or_external_id}
     - Fetch deactivated driver by id.
     - examples: [{example="", contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverIdOrExternalId: (path) ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 

     - returns: RequestBuilder<Driver> 
     */
    open class func getDeactivatedDriverByIdWithRequestBuilder(accessToken: String, driverIdOrExternalId: String) -> RequestBuilder<Driver> {
        var path = "/fleet/drivers/inactive/{driver_id_or_external_id}"
        let driverIdOrExternalIdPreEscape = "\(driverIdOrExternalId)"
        let driverIdOrExternalIdPostEscape = driverIdOrExternalIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{driver_id_or_external_id}", with: driverIdOrExternalIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<Driver>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverIdOrExternalId: (path) ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getDriverById(accessToken: String, driverIdOrExternalId: String, completion: @escaping ((_ data: CurrentDriver?,_ error: Error?) -> Void)) {
        getDriverByIdWithRequestBuilder(accessToken: accessToken, driverIdOrExternalId: driverIdOrExternalId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     - GET /fleet/drivers/{driver_id_or_external_id}
     - Fetch driver by id.
     - examples: [{example="", contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverIdOrExternalId: (path) ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 

     - returns: RequestBuilder<CurrentDriver> 
     */
    open class func getDriverByIdWithRequestBuilder(accessToken: String, driverIdOrExternalId: String) -> RequestBuilder<CurrentDriver> {
        var path = "/fleet/drivers/{driver_id_or_external_id}"
        let driverIdOrExternalIdPreEscape = "\(driverIdOrExternalId)"
        let driverIdOrExternalIdPostEscape = driverIdOrExternalIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{driver_id_or_external_id}", with: driverIdOrExternalIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<CurrentDriver>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverIdOrExternalId: (path) ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
     - parameter reactivateDriverParam: (body) Driver reactivation body 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func reactivateDriverById(accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: ReactivateDriverParam, completion: @escaping ((_ data: CurrentDriver?,_ error: Error?) -> Void)) {
        reactivateDriverByIdWithRequestBuilder(accessToken: accessToken, driverIdOrExternalId: driverIdOrExternalId, reactivateDriverParam: reactivateDriverParam).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     - PUT /fleet/drivers/inactive/{driver_id_or_external_id}
     - Reactivate the inactive driver having id.
     - examples: [{example="", contentType=application/json}]
     
     - parameter accessToken: (query) Samsara API access token. 
     - parameter driverIdOrExternalId: (path) ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
     - parameter reactivateDriverParam: (body) Driver reactivation body 

     - returns: RequestBuilder<CurrentDriver> 
     */
    open class func reactivateDriverByIdWithRequestBuilder(accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: ReactivateDriverParam) -> RequestBuilder<CurrentDriver> {
        var path = "/fleet/drivers/inactive/{driver_id_or_external_id}"
        let driverIdOrExternalIdPreEscape = "\(driverIdOrExternalId)"
        let driverIdOrExternalIdPostEscape = driverIdOrExternalIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{driver_id_or_external_id}", with: driverIdOrExternalIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: reactivateDriverParam)

        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<CurrentDriver>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

}