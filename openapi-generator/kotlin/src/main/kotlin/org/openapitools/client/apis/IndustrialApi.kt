/**
* Samsara API
* # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import org.openapitools.client.models.DataInputHistoryResponse
import org.openapitools.client.models.InlineObject17
import org.openapitools.client.models.InlineObject18
import org.openapitools.client.models.InlineResponse2006
import org.openapitools.client.models.InlineResponse2007
import org.openapitools.client.models.MachineHistoryResponse

import org.openapitools.client.infrastructure.*

class IndustrialApi(basePath: kotlin.String = "https://api.samsara.com/v1") : ApiClient(basePath) {

    /**
    * /industrial/data
    * Fetch all of the data inputs for a group.
    * @param accessToken Samsara API access token. 
    * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
    * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional, default to null)
    * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional, default to null)
    * @return InlineResponse2006
    */
    @Suppress("UNCHECKED_CAST")
    fun getAllDataInputs(accessToken: kotlin.String, groupId: kotlin.Long, startMs: kotlin.Long, endMs: kotlin.Long) : InlineResponse2006 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "group_id" to listOf("$groupId"), "startMs" to listOf("$startMs"), "endMs" to listOf("$endMs"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/industrial/data",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse2006>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse2006
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /industrial/data/{data_input_id:[0-9]+}
    * Fetch datapoints from a given data input.
    * @param accessToken Samsara API access token. 
    * @param dataInputId ID of the data input 
    * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional, default to null)
    * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional, default to null)
    * @return DataInputHistoryResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getDataInput(accessToken: kotlin.String, dataInputId: kotlin.Long, startMs: kotlin.Long, endMs: kotlin.Long) : DataInputHistoryResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "startMs" to listOf("$startMs"), "endMs" to listOf("$endMs"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/industrial/data/{data_input_id}".replace("{"+"data_input_id"+"}", "$dataInputId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DataInputHistoryResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DataInputHistoryResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /machines/list
    * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
    * @param accessToken Samsara API access token. 
    * @param groupParam  
    * @return InlineResponse2007
    */
    @Suppress("UNCHECKED_CAST")
    fun getMachines(accessToken: kotlin.String, groupParam: InlineObject18) : InlineResponse2007 {
        val localVariableBody: kotlin.Any? = groupParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/machines/list",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse2007>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse2007
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /machines/history
    * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
    * @param accessToken Samsara API access token. 
    * @param historyParam  
    * @return MachineHistoryResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getMachinesHistory(accessToken: kotlin.String, historyParam: InlineObject17) : MachineHistoryResponse {
        val localVariableBody: kotlin.Any? = historyParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/machines/history",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<MachineHistoryResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as MachineHistoryResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}