//
// IndustrialAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import Alamofire


open class IndustrialAPI: APIBase {
    /**
     /industrial/data
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)
     - parameter startMs: (query) Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     - parameter endMs: (query) Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getAllDataInputs(accessToken: String, groupId: Int64? = nil, startMs: Int64? = nil, endMs: Int64? = nil, completion: @escaping ((_ data: InlineResponse2006?, _ error: ErrorResponse?) -> Void)) {
        getAllDataInputsWithRequestBuilder(accessToken: accessToken, groupId: groupId, startMs: startMs, endMs: endMs).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /industrial/data
     - GET /industrial/data
     - Fetch all of the data inputs for a group.
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupId: (query) Optional group ID if the organization has multiple groups (uncommon). (optional)
     - parameter startMs: (query) Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     - parameter endMs: (query) Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     - returns: RequestBuilder<InlineResponse2006> 
     */
    open class func getAllDataInputsWithRequestBuilder(accessToken: String, groupId: Int64? = nil, startMs: Int64? = nil, endMs: Int64? = nil) -> RequestBuilder<InlineResponse2006> {
        let path = "/industrial/data"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
            "access_token": accessToken,
            "group_id": groupId?.encodeToJSON(),
            "startMs": startMs?.encodeToJSON(),
            "endMs": endMs?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<InlineResponse2006>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     /industrial/data/{data_input_id:[0-9]+}
     - parameter accessToken: (query) Samsara API access token. 
     - parameter dataInputId: (path) ID of the data input 
     - parameter startMs: (query) Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     - parameter endMs: (query) Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getDataInput(accessToken: String, dataInputId: Int64, startMs: Int64? = nil, endMs: Int64? = nil, completion: @escaping ((_ data: DataInputHistoryResponse?, _ error: ErrorResponse?) -> Void)) {
        getDataInputWithRequestBuilder(accessToken: accessToken, dataInputId: dataInputId, startMs: startMs, endMs: endMs).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /industrial/data/{data_input_id:[0-9]+}
     - GET /industrial/data/{data_input_id}
     - Fetch datapoints from a given data input.
     - parameter accessToken: (query) Samsara API access token. 
     - parameter dataInputId: (path) ID of the data input 
     - parameter startMs: (query) Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     - parameter endMs: (query) Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     - returns: RequestBuilder<DataInputHistoryResponse> 
     */
    open class func getDataInputWithRequestBuilder(accessToken: String, dataInputId: Int64, startMs: Int64? = nil, endMs: Int64? = nil) -> RequestBuilder<DataInputHistoryResponse> {
        var path = "/industrial/data/{data_input_id}"
        let dataInputIdPreEscape = "\(dataInputId)"
        let dataInputIdPostEscape = dataInputIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{data_input_id}", with: dataInputIdPostEscape, options: .literal, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
            "access_token": accessToken,
            "startMs": startMs?.encodeToJSON(),
            "endMs": endMs?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<DataInputHistoryResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     /machines/list
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupParam: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getMachines(accessToken: String, groupParam: InlineObject18, completion: @escaping ((_ data: InlineResponse2007?, _ error: ErrorResponse?) -> Void)) {
        getMachinesWithRequestBuilder(accessToken: accessToken, groupParam: groupParam).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /machines/list
     - POST /machines/list
     - Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     - parameter accessToken: (query) Samsara API access token. 
     - parameter groupParam: (body)  
     - returns: RequestBuilder<InlineResponse2007> 
     */
    open class func getMachinesWithRequestBuilder(accessToken: String, groupParam: InlineObject18) -> RequestBuilder<InlineResponse2007> {
        let path = "/machines/list"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = groupParam.encodeToJSON()

        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<InlineResponse2007>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     /machines/history
     - parameter accessToken: (query) Samsara API access token. 
     - parameter historyParam: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getMachinesHistory(accessToken: String, historyParam: InlineObject17, completion: @escaping ((_ data: MachineHistoryResponse?, _ error: ErrorResponse?) -> Void)) {
        getMachinesHistoryWithRequestBuilder(accessToken: accessToken, historyParam: historyParam).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     /machines/history
     - POST /machines/history
     - Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     - parameter accessToken: (query) Samsara API access token. 
     - parameter historyParam: (body)  
     - returns: RequestBuilder<MachineHistoryResponse> 
     */
    open class func getMachinesHistoryWithRequestBuilder(accessToken: String, historyParam: InlineObject17) -> RequestBuilder<MachineHistoryResponse> {
        let path = "/machines/history"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = historyParam.encodeToJSON()

        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
            "access_token": accessToken
        ])

        let requestBuilder: RequestBuilder<MachineHistoryResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

}
