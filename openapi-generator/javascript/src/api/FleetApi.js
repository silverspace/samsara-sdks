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
 *
 */


import ApiClient from "../ApiClient";
import Address from '../model/Address';
import AllRouteJobUpdates from '../model/AllRouteJobUpdates';
import AssetReeferResponse from '../model/AssetReeferResponse';
import Contact from '../model/Contact';
import DispatchRoute from '../model/DispatchRoute';
import DispatchRouteCreate from '../model/DispatchRouteCreate';
import DispatchRouteHistory from '../model/DispatchRouteHistory';
import Document from '../model/Document';
import DocumentCreate from '../model/DocumentCreate';
import DocumentType from '../model/DocumentType';
import Driver from '../model/Driver';
import DriverDailyLogResponse from '../model/DriverDailyLogResponse';
import DriverForCreate from '../model/DriverForCreate';
import DriverSafetyScoreResponse from '../model/DriverSafetyScoreResponse';
import DriversResponse from '../model/DriversResponse';
import DriversSummaryResponse from '../model/DriversSummaryResponse';
import DvirBase from '../model/DvirBase';
import DvirListResponse from '../model/DvirListResponse';
import FleetVehicleLocation from '../model/FleetVehicleLocation';
import FleetVehicleResponse from '../model/FleetVehicleResponse';
import HosAuthenticationLogsResponse from '../model/HosAuthenticationLogsResponse';
import HosLogsResponse from '../model/HosLogsResponse';
import HosLogsSummaryResponse from '../model/HosLogsSummaryResponse';
import InlineObject from '../model/InlineObject';
import InlineObject1 from '../model/InlineObject1';
import InlineObject10 from '../model/InlineObject10';
import InlineObject11 from '../model/InlineObject11';
import InlineObject12 from '../model/InlineObject12';
import InlineObject13 from '../model/InlineObject13';
import InlineObject14 from '../model/InlineObject14';
import InlineObject15 from '../model/InlineObject15';
import InlineObject16 from '../model/InlineObject16';
import InlineObject2 from '../model/InlineObject2';
import InlineObject3 from '../model/InlineObject3';
import InlineObject4 from '../model/InlineObject4';
import InlineObject5 from '../model/InlineObject5';
import InlineObject6 from '../model/InlineObject6';
import InlineObject7 from '../model/InlineObject7';
import InlineObject8 from '../model/InlineObject8';
import InlineObject9 from '../model/InlineObject9';
import InlineResponse200 from '../model/InlineResponse200';
import InlineResponse2001 from '../model/InlineResponse2001';
import InlineResponse2002 from '../model/InlineResponse2002';
import InlineResponse2003 from '../model/InlineResponse2003';
import InlineResponse2004 from '../model/InlineResponse2004';
import InlineResponse2005 from '../model/InlineResponse2005';
import TripResponse from '../model/TripResponse';
import VehicleHarshEventResponse from '../model/VehicleHarshEventResponse';
import VehicleSafetyScoreResponse from '../model/VehicleSafetyScoreResponse';

/**
* Fleet service.
* @module api/FleetApi
* @version 1.0.0
*/
export default class FleetApi {

    /**
    * Constructs a new FleetApi. 
    * @alias module:api/FleetApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the addFleetAddress operation.
     * @callback module:api/FleetApi~addFleetAddressCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/add_address
     * This method adds an address book entry to the specified group.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject2} addressParam 
     * @param {module:api/FleetApi~addFleetAddressCallback} callback The callback function, accepting three arguments: error, data, response
     */
    addFleetAddress(accessToken, addressParam, callback) {
      let postBody = addressParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling addFleetAddress");
      }
      // verify the required parameter 'addressParam' is set
      if (addressParam === undefined || addressParam === null) {
        throw new Error("Missing the required parameter 'addressParam' when calling addFleetAddress");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = null;
      return this.apiClient.callApi(
        '/fleet/add_address', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the addOrganizationAddresses operation.
     * @callback module:api/FleetApi~addOrganizationAddressesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Address>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /addresses
     * Add one or more addresses to the organization
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject} addresses 
     * @param {module:api/FleetApi~addOrganizationAddressesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Address>}
     */
    addOrganizationAddresses(accessToken, addresses, callback) {
      let postBody = addresses;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling addOrganizationAddresses");
      }
      // verify the required parameter 'addresses' is set
      if (addresses === undefined || addresses === null) {
        throw new Error("Missing the required parameter 'addresses' when calling addOrganizationAddresses");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = [Address];
      return this.apiClient.callApi(
        '/addresses', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the createDispatchRoute operation.
     * @callback module:api/FleetApi~createDispatchRouteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRoute} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes
     * Create a new dispatch route.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/DispatchRouteCreate} createDispatchRouteParams 
     * @param {module:api/FleetApi~createDispatchRouteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRoute}
     */
    createDispatchRoute(accessToken, createDispatchRouteParams, callback) {
      let postBody = createDispatchRouteParams;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling createDispatchRoute");
      }
      // verify the required parameter 'createDispatchRouteParams' is set
      if (createDispatchRouteParams === undefined || createDispatchRouteParams === null) {
        throw new Error("Missing the required parameter 'createDispatchRouteParams' when calling createDispatchRoute");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DispatchRoute;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the createDriver operation.
     * @callback module:api/FleetApi~createDriverCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Driver} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/create
     * Create a new driver.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/DriverForCreate} createDriverParam Driver creation body
     * @param {module:api/FleetApi~createDriverCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Driver}
     */
    createDriver(accessToken, createDriverParam, callback) {
      let postBody = createDriverParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling createDriver");
      }
      // verify the required parameter 'createDriverParam' is set
      if (createDriverParam === undefined || createDriverParam === null) {
        throw new Error("Missing the required parameter 'createDriverParam' when calling createDriver");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Driver;
      return this.apiClient.callApi(
        '/fleet/drivers/create', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the createDriverDispatchRoute operation.
     * @callback module:api/FleetApi~createDriverDispatchRouteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRoute} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the driver with driver_id.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} driverId ID of the driver with the associated routes.
     * @param {module:model/DispatchRouteCreate} createDispatchRouteParams 
     * @param {module:api/FleetApi~createDriverDispatchRouteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRoute}
     */
    createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, callback) {
      let postBody = createDispatchRouteParams;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling createDriverDispatchRoute");
      }
      // verify the required parameter 'driverId' is set
      if (driverId === undefined || driverId === null) {
        throw new Error("Missing the required parameter 'driverId' when calling createDriverDispatchRoute");
      }
      // verify the required parameter 'createDispatchRouteParams' is set
      if (createDispatchRouteParams === undefined || createDispatchRouteParams === null) {
        throw new Error("Missing the required parameter 'createDispatchRouteParams' when calling createDriverDispatchRoute");
      }

      let pathParams = {
        'driver_id': driverId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DispatchRoute;
      return this.apiClient.callApi(
        '/fleet/drivers/{driver_id}/dispatch/routes', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the createDriverDocument operation.
     * @callback module:api/FleetApi~createDriverDocumentCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Document} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     * Create a driver document for the given driver.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} driverId ID of the driver for whom the document is created.
     * @param {module:model/DocumentCreate} createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
     * @param {module:api/FleetApi~createDriverDocumentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Document}
     */
    createDriverDocument(accessToken, driverId, createDocumentParams, callback) {
      let postBody = createDocumentParams;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling createDriverDocument");
      }
      // verify the required parameter 'driverId' is set
      if (driverId === undefined || driverId === null) {
        throw new Error("Missing the required parameter 'driverId' when calling createDriverDocument");
      }
      // verify the required parameter 'createDocumentParams' is set
      if (createDocumentParams === undefined || createDocumentParams === null) {
        throw new Error("Missing the required parameter 'createDocumentParams' when calling createDriverDocument");
      }

      let pathParams = {
        'driver_id': driverId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Document;
      return this.apiClient.callApi(
        '/fleet/drivers/{driver_id}/documents', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the createDvir operation.
     * @callback module:api/FleetApi~createDvirCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DvirBase} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/maintenance/dvirs
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject12} createDvirParam 
     * @param {module:api/FleetApi~createDvirCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DvirBase}
     */
    createDvir(accessToken, createDvirParam, callback) {
      let postBody = createDvirParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling createDvir");
      }
      // verify the required parameter 'createDvirParam' is set
      if (createDvirParam === undefined || createDvirParam === null) {
        throw new Error("Missing the required parameter 'createDvirParam' when calling createDvir");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DvirBase;
      return this.apiClient.callApi(
        '/fleet/maintenance/dvirs', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the createVehicleDispatchRoute operation.
     * @callback module:api/FleetApi~createVehicleDispatchRouteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRoute} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} vehicleId ID of the vehicle with the associated routes.
     * @param {module:model/DispatchRouteCreate} createDispatchRouteParams 
     * @param {module:api/FleetApi~createVehicleDispatchRouteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRoute}
     */
    createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, callback) {
      let postBody = createDispatchRouteParams;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling createVehicleDispatchRoute");
      }
      // verify the required parameter 'vehicleId' is set
      if (vehicleId === undefined || vehicleId === null) {
        throw new Error("Missing the required parameter 'vehicleId' when calling createVehicleDispatchRoute");
      }
      // verify the required parameter 'createDispatchRouteParams' is set
      if (createDispatchRouteParams === undefined || createDispatchRouteParams === null) {
        throw new Error("Missing the required parameter 'createDispatchRouteParams' when calling createVehicleDispatchRoute");
      }

      let pathParams = {
        'vehicle_id': vehicleId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DispatchRoute;
      return this.apiClient.callApi(
        '/fleet/vehicles/{vehicle_id}/dispatch/routes', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the deactivateDriver operation.
     * @callback module:api/FleetApi~deactivateDriverCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Deactivate a driver with the given id.
     * @param {String} accessToken Samsara API access token.
     * @param {String} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {module:api/FleetApi~deactivateDriverCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deactivateDriver(accessToken, driverIdOrExternalId, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling deactivateDriver");
      }
      // verify the required parameter 'driverIdOrExternalId' is set
      if (driverIdOrExternalId === undefined || driverIdOrExternalId === null) {
        throw new Error("Missing the required parameter 'driverIdOrExternalId' when calling deactivateDriver");
      }

      let pathParams = {
        'driver_id_or_external_id': driverIdOrExternalId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = null;
      return this.apiClient.callApi(
        '/fleet/drivers/{driver_id_or_external_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteDispatchRouteById operation.
     * @callback module:api/FleetApi~deleteDispatchRouteByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Delete a dispatch route and its associated jobs.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} routeId ID of the dispatch route.
     * @param {module:api/FleetApi~deleteDispatchRouteByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteDispatchRouteById(accessToken, routeId, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling deleteDispatchRouteById");
      }
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling deleteDispatchRouteById");
      }

      let pathParams = {
        'route_id': routeId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = null;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes/{route_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteOrganizationAddress operation.
     * @callback module:api/FleetApi~deleteOrganizationAddressCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /addresses/{addressId}
     * Delete an address.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} addressId ID of the address/geofence
     * @param {module:api/FleetApi~deleteOrganizationAddressCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteOrganizationAddress(accessToken, addressId, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling deleteOrganizationAddress");
      }
      // verify the required parameter 'addressId' is set
      if (addressId === undefined || addressId === null) {
        throw new Error("Missing the required parameter 'addressId' when calling deleteOrganizationAddress");
      }

      let pathParams = {
        'addressId': addressId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = null;
      return this.apiClient.callApi(
        '/addresses/{addressId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fetchAllDispatchRoutes operation.
     * @callback module:api/FleetApi~fetchAllDispatchRoutesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DispatchRoute>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes
     * Fetch all of the dispatch routes for the group.
     * @param {String} accessToken Samsara API access token.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {Number} opts.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {Number} opts.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {module:api/FleetApi~fetchAllDispatchRoutesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DispatchRoute>}
     */
    fetchAllDispatchRoutes(accessToken, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling fetchAllDispatchRoutes");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'group_id': opts['groupId'],
        'end_time': opts['endTime'],
        'duration': opts['duration']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [DispatchRoute];
      return this.apiClient.callApi(
        '/fleet/dispatch/routes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fetchAllRouteJobUpdates operation.
     * @callback module:api/FleetApi~fetchAllRouteJobUpdatesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AllRouteJobUpdates} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes/job_updates
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @param {String} accessToken Samsara API access token.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {String} opts.sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
     * @param {String} opts.include Optionally set include&#x3D;route to include route object in response payload.
     * @param {module:api/FleetApi~fetchAllRouteJobUpdatesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AllRouteJobUpdates}
     */
    fetchAllRouteJobUpdates(accessToken, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling fetchAllRouteJobUpdates");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'group_id': opts['groupId'],
        'sequence_id': opts['sequenceId'],
        'include': opts['include']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AllRouteJobUpdates;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes/job_updates', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getAllAssetCurrentLocations operation.
     * @callback module:api/FleetApi~getAllAssetCurrentLocationsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse2001} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/assets/locations
     * Fetch current locations of all assets for the group.
     * @param {String} accessToken Samsara API access token.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {module:api/FleetApi~getAllAssetCurrentLocationsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse2001}
     */
    getAllAssetCurrentLocations(accessToken, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getAllAssetCurrentLocations");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'group_id': opts['groupId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse2001;
      return this.apiClient.callApi(
        '/fleet/assets/locations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getAllAssets operation.
     * @callback module:api/FleetApi~getAllAssetsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/assets
     * Fetch all of the assets for the group.
     * @param {String} accessToken Samsara API access token.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {module:api/FleetApi~getAllAssetsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse200}
     */
    getAllAssets(accessToken, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getAllAssets");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'group_id': opts['groupId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;
      return this.apiClient.callApi(
        '/fleet/assets', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getAllDeactivatedDrivers operation.
     * @callback module:api/FleetApi~getAllDeactivatedDriversCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Driver>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/inactive
     * Fetch all deactivated drivers for the group.
     * @param {String} accessToken Samsara API access token.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {module:api/FleetApi~getAllDeactivatedDriversCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Driver>}
     */
    getAllDeactivatedDrivers(accessToken, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getAllDeactivatedDrivers");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'group_id': opts['groupId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Driver];
      return this.apiClient.callApi(
        '/fleet/drivers/inactive', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getAssetLocation operation.
     * @callback module:api/FleetApi~getAssetLocationCallback
     * @param {String} error Error message, if any.
     * @param {Array.<Object>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     * Fetch the historical locations for the asset.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} assetId ID of the asset
     * @param {Number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {Number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {module:api/FleetApi~getAssetLocationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<Object>}
     */
    getAssetLocation(accessToken, assetId, startMs, endMs, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getAssetLocation");
      }
      // verify the required parameter 'assetId' is set
      if (assetId === undefined || assetId === null) {
        throw new Error("Missing the required parameter 'assetId' when calling getAssetLocation");
      }
      // verify the required parameter 'startMs' is set
      if (startMs === undefined || startMs === null) {
        throw new Error("Missing the required parameter 'startMs' when calling getAssetLocation");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getAssetLocation");
      }

      let pathParams = {
        'asset_id': assetId
      };
      let queryParams = {
        'access_token': accessToken,
        'startMs': startMs,
        'endMs': endMs
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Object];
      return this.apiClient.callApi(
        '/fleet/assets/{asset_id}/locations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getAssetReefer operation.
     * @callback module:api/FleetApi~getAssetReeferCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AssetReeferResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     * Fetch the reefer-specific stats of an asset.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} assetId ID of the asset
     * @param {Number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {Number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {module:api/FleetApi~getAssetReeferCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AssetReeferResponse}
     */
    getAssetReefer(accessToken, assetId, startMs, endMs, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getAssetReefer");
      }
      // verify the required parameter 'assetId' is set
      if (assetId === undefined || assetId === null) {
        throw new Error("Missing the required parameter 'assetId' when calling getAssetReefer");
      }
      // verify the required parameter 'startMs' is set
      if (startMs === undefined || startMs === null) {
        throw new Error("Missing the required parameter 'startMs' when calling getAssetReefer");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getAssetReefer");
      }

      let pathParams = {
        'asset_id': assetId
      };
      let queryParams = {
        'access_token': accessToken,
        'startMs': startMs,
        'endMs': endMs
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AssetReeferResponse;
      return this.apiClient.callApi(
        '/fleet/assets/{asset_id}/reefer', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDeactivatedDriverById operation.
     * @callback module:api/FleetApi~getDeactivatedDriverByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Driver} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch deactivated driver by id.
     * @param {String} accessToken Samsara API access token.
     * @param {String} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {module:api/FleetApi~getDeactivatedDriverByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Driver}
     */
    getDeactivatedDriverById(accessToken, driverIdOrExternalId, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDeactivatedDriverById");
      }
      // verify the required parameter 'driverIdOrExternalId' is set
      if (driverIdOrExternalId === undefined || driverIdOrExternalId === null) {
        throw new Error("Missing the required parameter 'driverIdOrExternalId' when calling getDeactivatedDriverById");
      }

      let pathParams = {
        'driver_id_or_external_id': driverIdOrExternalId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Driver;
      return this.apiClient.callApi(
        '/fleet/drivers/inactive/{driver_id_or_external_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDispatchRouteById operation.
     * @callback module:api/FleetApi~getDispatchRouteByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRoute} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     * Fetch a dispatch route by id.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} routeId ID of the dispatch route.
     * @param {module:api/FleetApi~getDispatchRouteByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRoute}
     */
    getDispatchRouteById(accessToken, routeId, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDispatchRouteById");
      }
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling getDispatchRouteById");
      }

      let pathParams = {
        'route_id': routeId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = DispatchRoute;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes/{route_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDispatchRouteHistory operation.
     * @callback module:api/FleetApi~getDispatchRouteHistoryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRouteHistory} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * Fetch the history of a dispatch route.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} routeId ID of the route with history.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
     * @param {Number} opts.endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
     * @param {module:api/FleetApi~getDispatchRouteHistoryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRouteHistory}
     */
    getDispatchRouteHistory(accessToken, routeId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDispatchRouteHistory");
      }
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling getDispatchRouteHistory");
      }

      let pathParams = {
        'route_id': routeId
      };
      let queryParams = {
        'access_token': accessToken,
        'start_time': opts['startTime'],
        'end_time': opts['endTime']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = DispatchRouteHistory;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes/{route_id}/history', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDispatchRoutesByDriverId operation.
     * @callback module:api/FleetApi~getDispatchRoutesByDriverIdCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DispatchRoute>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given driver.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} driverId ID of the driver with the associated routes.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {Number} opts.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {module:api/FleetApi~getDispatchRoutesByDriverIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DispatchRoute>}
     */
    getDispatchRoutesByDriverId(accessToken, driverId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDispatchRoutesByDriverId");
      }
      // verify the required parameter 'driverId' is set
      if (driverId === undefined || driverId === null) {
        throw new Error("Missing the required parameter 'driverId' when calling getDispatchRoutesByDriverId");
      }

      let pathParams = {
        'driver_id': driverId
      };
      let queryParams = {
        'access_token': accessToken,
        'end_time': opts['endTime'],
        'duration': opts['duration']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [DispatchRoute];
      return this.apiClient.callApi(
        '/fleet/drivers/{driver_id}/dispatch/routes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDispatchRoutesByVehicleId operation.
     * @callback module:api/FleetApi~getDispatchRoutesByVehicleIdCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DispatchRoute>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given vehicle.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} vehicleId ID of the vehicle with the associated routes.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {Number} opts.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {module:api/FleetApi~getDispatchRoutesByVehicleIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DispatchRoute>}
     */
    getDispatchRoutesByVehicleId(accessToken, vehicleId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDispatchRoutesByVehicleId");
      }
      // verify the required parameter 'vehicleId' is set
      if (vehicleId === undefined || vehicleId === null) {
        throw new Error("Missing the required parameter 'vehicleId' when calling getDispatchRoutesByVehicleId");
      }

      let pathParams = {
        'vehicle_id': vehicleId
      };
      let queryParams = {
        'access_token': accessToken,
        'end_time': opts['endTime'],
        'duration': opts['duration']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [DispatchRoute];
      return this.apiClient.callApi(
        '/fleet/vehicles/{vehicle_id}/dispatch/routes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDriverById operation.
     * @callback module:api/FleetApi~getDriverByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Driver} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch driver by id.
     * @param {String} accessToken Samsara API access token.
     * @param {String} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {module:api/FleetApi~getDriverByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Driver}
     */
    getDriverById(accessToken, driverIdOrExternalId, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDriverById");
      }
      // verify the required parameter 'driverIdOrExternalId' is set
      if (driverIdOrExternalId === undefined || driverIdOrExternalId === null) {
        throw new Error("Missing the required parameter 'driverIdOrExternalId' when calling getDriverById");
      }

      let pathParams = {
        'driver_id_or_external_id': driverIdOrExternalId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Driver;
      return this.apiClient.callApi(
        '/fleet/drivers/{driver_id_or_external_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDriverDocumentTypesByOrgId operation.
     * @callback module:api/FleetApi~getDriverDocumentTypesByOrgIdCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DocumentType>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/document_types
     * Fetch all of the document types.
     * @param {module:api/FleetApi~getDriverDocumentTypesByOrgIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DocumentType>}
     */
    getDriverDocumentTypesByOrgId(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [DocumentType];
      return this.apiClient.callApi(
        '/fleet/drivers/document_types', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDriverDocumentsByOrgId operation.
     * @callback module:api/FleetApi~getDriverDocumentsByOrgIdCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Document>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/documents
     * Fetch all of the documents.
     * @param {String} accessToken Samsara API access token.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
     * @param {Number} opts.durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
     * @param {module:api/FleetApi~getDriverDocumentsByOrgIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Document>}
     */
    getDriverDocumentsByOrgId(accessToken, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDriverDocumentsByOrgId");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'endMs': opts['endMs'],
        'durationMs': opts['durationMs']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Document];
      return this.apiClient.callApi(
        '/fleet/drivers/documents', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDriverSafetyScore operation.
     * @callback module:api/FleetApi~getDriverSafetyScoreCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DriverSafetyScoreResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     * Fetch the safety score for the driver.
     * @param {Number} driverId ID of the driver
     * @param {String} accessToken Samsara API access token.
     * @param {Number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {Number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {module:api/FleetApi~getDriverSafetyScoreCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DriverSafetyScoreResponse}
     */
    getDriverSafetyScore(driverId, accessToken, startMs, endMs, callback) {
      let postBody = null;
      // verify the required parameter 'driverId' is set
      if (driverId === undefined || driverId === null) {
        throw new Error("Missing the required parameter 'driverId' when calling getDriverSafetyScore");
      }
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDriverSafetyScore");
      }
      // verify the required parameter 'startMs' is set
      if (startMs === undefined || startMs === null) {
        throw new Error("Missing the required parameter 'startMs' when calling getDriverSafetyScore");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getDriverSafetyScore");
      }

      let pathParams = {
        'driverId': driverId
      };
      let queryParams = {
        'access_token': accessToken,
        'startMs': startMs,
        'endMs': endMs
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = DriverSafetyScoreResponse;
      return this.apiClient.callApi(
        '/fleet/drivers/{driverId}/safety/score', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDvirs operation.
     * @callback module:api/FleetApi~getDvirsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DvirListResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/maintenance/dvirs
     * Get DVIRs for the org within provided time constraints
     * @param {String} accessToken Samsara API access token.
     * @param {Number} endMs time in millis until the last dvir log.
     * @param {Number} durationMs time in millis which corresponds to the duration before the end_ms.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.groupId Group ID to query.
     * @param {module:api/FleetApi~getDvirsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DvirListResponse}
     */
    getDvirs(accessToken, endMs, durationMs, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDvirs");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getDvirs");
      }
      // verify the required parameter 'durationMs' is set
      if (durationMs === undefined || durationMs === null) {
        throw new Error("Missing the required parameter 'durationMs' when calling getDvirs");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'end_ms': endMs,
        'duration_ms': durationMs,
        'group_id': opts['groupId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = DvirListResponse;
      return this.apiClient.callApi(
        '/fleet/maintenance/dvirs', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getFleetDrivers operation.
     * @callback module:api/FleetApi~getFleetDriversCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DriversResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers
     * Get all the drivers for the specified group.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject3} groupDriversParam 
     * @param {module:api/FleetApi~getFleetDriversCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DriversResponse}
     */
    getFleetDrivers(accessToken, groupDriversParam, callback) {
      let postBody = groupDriversParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getFleetDrivers");
      }
      // verify the required parameter 'groupDriversParam' is set
      if (groupDriversParam === undefined || groupDriversParam === null) {
        throw new Error("Missing the required parameter 'groupDriversParam' when calling getFleetDrivers");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DriversResponse;
      return this.apiClient.callApi(
        '/fleet/drivers', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getFleetDriversHosDailyLogs operation.
     * @callback module:api/FleetApi~getFleetDriversHosDailyLogsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DriverDailyLogResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     * Get summarized daily HOS charts for a specified driver.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} driverId ID of the driver with HOS logs.
     * @param {module:model/InlineObject6} hosLogsParam 
     * @param {module:api/FleetApi~getFleetDriversHosDailyLogsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DriverDailyLogResponse}
     */
    getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam, callback) {
      let postBody = hosLogsParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getFleetDriversHosDailyLogs");
      }
      // verify the required parameter 'driverId' is set
      if (driverId === undefined || driverId === null) {
        throw new Error("Missing the required parameter 'driverId' when calling getFleetDriversHosDailyLogs");
      }
      // verify the required parameter 'hosLogsParam' is set
      if (hosLogsParam === undefined || hosLogsParam === null) {
        throw new Error("Missing the required parameter 'hosLogsParam' when calling getFleetDriversHosDailyLogs");
      }

      let pathParams = {
        'driver_id': driverId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DriverDailyLogResponse;
      return this.apiClient.callApi(
        '/fleet/drivers/{driver_id}/hos_daily_logs', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getFleetDriversSummary operation.
     * @callback module:api/FleetApi~getFleetDriversSummaryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DriversSummaryResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/summary
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject5} driversSummaryParam 
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.snapToDayBounds Snap query result to HOS day boundaries.
     * @param {module:api/FleetApi~getFleetDriversSummaryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DriversSummaryResponse}
     */
    getFleetDriversSummary(accessToken, driversSummaryParam, opts, callback) {
      opts = opts || {};
      let postBody = driversSummaryParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getFleetDriversSummary");
      }
      // verify the required parameter 'driversSummaryParam' is set
      if (driversSummaryParam === undefined || driversSummaryParam === null) {
        throw new Error("Missing the required parameter 'driversSummaryParam' when calling getFleetDriversSummary");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'snap_to_day_bounds': opts['snapToDayBounds']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DriversSummaryResponse;
      return this.apiClient.callApi(
        '/fleet/drivers/summary', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getFleetHosAuthenticationLogs operation.
     * @callback module:api/FleetApi~getFleetHosAuthenticationLogsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/HosAuthenticationLogsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/hos_authentication_logs
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject7} hosAuthenticationLogsParam 
     * @param {module:api/FleetApi~getFleetHosAuthenticationLogsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/HosAuthenticationLogsResponse}
     */
    getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam, callback) {
      let postBody = hosAuthenticationLogsParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getFleetHosAuthenticationLogs");
      }
      // verify the required parameter 'hosAuthenticationLogsParam' is set
      if (hosAuthenticationLogsParam === undefined || hosAuthenticationLogsParam === null) {
        throw new Error("Missing the required parameter 'hosAuthenticationLogsParam' when calling getFleetHosAuthenticationLogs");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = HosAuthenticationLogsResponse;
      return this.apiClient.callApi(
        '/fleet/hos_authentication_logs', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getFleetHosLogs operation.
     * @callback module:api/FleetApi~getFleetHosLogsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/HosLogsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/hos_logs
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject8} hosLogsParam 
     * @param {module:api/FleetApi~getFleetHosLogsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/HosLogsResponse}
     */
    getFleetHosLogs(accessToken, hosLogsParam, callback) {
      let postBody = hosLogsParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getFleetHosLogs");
      }
      // verify the required parameter 'hosLogsParam' is set
      if (hosLogsParam === undefined || hosLogsParam === null) {
        throw new Error("Missing the required parameter 'hosLogsParam' when calling getFleetHosLogs");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = HosLogsResponse;
      return this.apiClient.callApi(
        '/fleet/hos_logs', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getFleetHosLogsSummary operation.
     * @callback module:api/FleetApi~getFleetHosLogsSummaryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/HosLogsSummaryResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/hos_logs_summary
     * Get the current HOS status for all drivers in the group.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject9} hosLogsParam 
     * @param {module:api/FleetApi~getFleetHosLogsSummaryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/HosLogsSummaryResponse}
     */
    getFleetHosLogsSummary(accessToken, hosLogsParam, callback) {
      let postBody = hosLogsParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getFleetHosLogsSummary");
      }
      // verify the required parameter 'hosLogsParam' is set
      if (hosLogsParam === undefined || hosLogsParam === null) {
        throw new Error("Missing the required parameter 'hosLogsParam' when calling getFleetHosLogsSummary");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = HosLogsSummaryResponse;
      return this.apiClient.callApi(
        '/fleet/hos_logs_summary', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getFleetLocations operation.
     * @callback module:api/FleetApi~getFleetLocationsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse2003} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/locations
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject11} groupParam 
     * @param {module:api/FleetApi~getFleetLocationsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse2003}
     */
    getFleetLocations(accessToken, groupParam, callback) {
      let postBody = groupParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getFleetLocations");
      }
      // verify the required parameter 'groupParam' is set
      if (groupParam === undefined || groupParam === null) {
        throw new Error("Missing the required parameter 'groupParam' when calling getFleetLocations");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse2003;
      return this.apiClient.callApi(
        '/fleet/locations', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getFleetMaintenanceList operation.
     * @callback module:api/FleetApi~getFleetMaintenanceListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse2004} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/maintenance/list
     * Get list of the vehicles with any engine faults or check light data.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject13} groupParam 
     * @param {module:api/FleetApi~getFleetMaintenanceListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse2004}
     */
    getFleetMaintenanceList(accessToken, groupParam, callback) {
      let postBody = groupParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getFleetMaintenanceList");
      }
      // verify the required parameter 'groupParam' is set
      if (groupParam === undefined || groupParam === null) {
        throw new Error("Missing the required parameter 'groupParam' when calling getFleetMaintenanceList");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse2004;
      return this.apiClient.callApi(
        '/fleet/maintenance/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getFleetTrips operation.
     * @callback module:api/FleetApi~getFleetTripsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TripResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/trips
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject15} tripsParam 
     * @param {module:api/FleetApi~getFleetTripsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TripResponse}
     */
    getFleetTrips(accessToken, tripsParam, callback) {
      let postBody = tripsParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getFleetTrips");
      }
      // verify the required parameter 'tripsParam' is set
      if (tripsParam === undefined || tripsParam === null) {
        throw new Error("Missing the required parameter 'tripsParam' when calling getFleetTrips");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = TripResponse;
      return this.apiClient.callApi(
        '/fleet/trips', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getFleetVehicle operation.
     * @callback module:api/FleetApi~getFleetVehicleCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FleetVehicleResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Gets a specific vehicle.
     * @param {String} accessToken Samsara API access token.
     * @param {String} vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     * @param {module:api/FleetApi~getFleetVehicleCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FleetVehicleResponse}
     */
    getFleetVehicle(accessToken, vehicleIdOrExternalId, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getFleetVehicle");
      }
      // verify the required parameter 'vehicleIdOrExternalId' is set
      if (vehicleIdOrExternalId === undefined || vehicleIdOrExternalId === null) {
        throw new Error("Missing the required parameter 'vehicleIdOrExternalId' when calling getFleetVehicle");
      }

      let pathParams = {
        'vehicle_id_or_external_id': vehicleIdOrExternalId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = FleetVehicleResponse;
      return this.apiClient.callApi(
        '/fleet/vehicles/{vehicle_id_or_external_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getOrganizationAddress operation.
     * @callback module:api/FleetApi~getOrganizationAddressCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Address} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /addresses/{addressId}
     * Fetch an address by its id.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} addressId ID of the address/geofence
     * @param {module:api/FleetApi~getOrganizationAddressCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Address}
     */
    getOrganizationAddress(accessToken, addressId, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getOrganizationAddress");
      }
      // verify the required parameter 'addressId' is set
      if (addressId === undefined || addressId === null) {
        throw new Error("Missing the required parameter 'addressId' when calling getOrganizationAddress");
      }

      let pathParams = {
        'addressId': addressId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Address;
      return this.apiClient.callApi(
        '/addresses/{addressId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getOrganizationAddresses operation.
     * @callback module:api/FleetApi~getOrganizationAddressesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Address>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /addresses
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @param {String} accessToken Samsara API access token.
     * @param {module:api/FleetApi~getOrganizationAddressesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Address>}
     */
    getOrganizationAddresses(accessToken, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getOrganizationAddresses");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Address];
      return this.apiClient.callApi(
        '/addresses', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getOrganizationContact operation.
     * @callback module:api/FleetApi~getOrganizationContactCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Contact} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /contacts/{contact_id}
     * Fetch a contact by its id.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} contactId ID of the contact
     * @param {module:api/FleetApi~getOrganizationContactCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Contact}
     */
    getOrganizationContact(accessToken, contactId, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getOrganizationContact");
      }
      // verify the required parameter 'contactId' is set
      if (contactId === undefined || contactId === null) {
        throw new Error("Missing the required parameter 'contactId' when calling getOrganizationContact");
      }

      let pathParams = {
        'contact_id': contactId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Contact;
      return this.apiClient.callApi(
        '/contacts/{contact_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getVehicleHarshEvent operation.
     * @callback module:api/FleetApi~getVehicleHarshEventCallback
     * @param {String} error Error message, if any.
     * @param {module:model/VehicleHarshEventResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * Fetch harsh event details for a vehicle.
     * @param {Number} vehicleId ID of the vehicle
     * @param {String} accessToken Samsara API access token.
     * @param {Number} timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
     * @param {module:api/FleetApi~getVehicleHarshEventCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/VehicleHarshEventResponse}
     */
    getVehicleHarshEvent(vehicleId, accessToken, timestamp, callback) {
      let postBody = null;
      // verify the required parameter 'vehicleId' is set
      if (vehicleId === undefined || vehicleId === null) {
        throw new Error("Missing the required parameter 'vehicleId' when calling getVehicleHarshEvent");
      }
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getVehicleHarshEvent");
      }
      // verify the required parameter 'timestamp' is set
      if (timestamp === undefined || timestamp === null) {
        throw new Error("Missing the required parameter 'timestamp' when calling getVehicleHarshEvent");
      }

      let pathParams = {
        'vehicleId': vehicleId
      };
      let queryParams = {
        'access_token': accessToken,
        'timestamp': timestamp
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = VehicleHarshEventResponse;
      return this.apiClient.callApi(
        '/fleet/vehicles/{vehicleId}/safety/harsh_event', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getVehicleLocations operation.
     * @callback module:api/FleetApi~getVehicleLocationsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/FleetVehicleLocation>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} vehicleId ID of the vehicle with the associated routes.
     * @param {Number} startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
     * @param {Number} endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
     * @param {module:api/FleetApi~getVehicleLocationsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/FleetVehicleLocation>}
     */
    getVehicleLocations(accessToken, vehicleId, startMs, endMs, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getVehicleLocations");
      }
      // verify the required parameter 'vehicleId' is set
      if (vehicleId === undefined || vehicleId === null) {
        throw new Error("Missing the required parameter 'vehicleId' when calling getVehicleLocations");
      }
      // verify the required parameter 'startMs' is set
      if (startMs === undefined || startMs === null) {
        throw new Error("Missing the required parameter 'startMs' when calling getVehicleLocations");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getVehicleLocations");
      }

      let pathParams = {
        'vehicle_id': vehicleId
      };
      let queryParams = {
        'access_token': accessToken,
        'startMs': startMs,
        'endMs': endMs
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [FleetVehicleLocation];
      return this.apiClient.callApi(
        '/fleet/vehicles/{vehicle_id}/locations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getVehicleSafetyScore operation.
     * @callback module:api/FleetApi~getVehicleSafetyScoreCallback
     * @param {String} error Error message, if any.
     * @param {module:model/VehicleSafetyScoreResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * Fetch the safety score for the vehicle.
     * @param {Number} vehicleId ID of the vehicle
     * @param {String} accessToken Samsara API access token.
     * @param {Number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {Number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {module:api/FleetApi~getVehicleSafetyScoreCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/VehicleSafetyScoreResponse}
     */
    getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, callback) {
      let postBody = null;
      // verify the required parameter 'vehicleId' is set
      if (vehicleId === undefined || vehicleId === null) {
        throw new Error("Missing the required parameter 'vehicleId' when calling getVehicleSafetyScore");
      }
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getVehicleSafetyScore");
      }
      // verify the required parameter 'startMs' is set
      if (startMs === undefined || startMs === null) {
        throw new Error("Missing the required parameter 'startMs' when calling getVehicleSafetyScore");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getVehicleSafetyScore");
      }

      let pathParams = {
        'vehicleId': vehicleId
      };
      let queryParams = {
        'access_token': accessToken,
        'startMs': startMs,
        'endMs': endMs
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = VehicleSafetyScoreResponse;
      return this.apiClient.callApi(
        '/fleet/vehicles/{vehicleId}/safety/score', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getVehicleStats operation.
     * @callback module:api/FleetApi~getVehicleStatsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse2005} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/stats
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} startMs Time in Unix epoch milliseconds for the start of the query.
     * @param {Number} endMs Time in Unix epoch milliseconds for the end of the query.
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
     * @param {String} opts.tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
     * @param {String} opts.startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
     * @param {String} opts.endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
     * @param {Number} opts.limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
     * @param {module:api/FleetApi~getVehicleStatsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse2005}
     */
    getVehicleStats(accessToken, startMs, endMs, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getVehicleStats");
      }
      // verify the required parameter 'startMs' is set
      if (startMs === undefined || startMs === null) {
        throw new Error("Missing the required parameter 'startMs' when calling getVehicleStats");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getVehicleStats");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'startMs': startMs,
        'endMs': endMs,
        'series': opts['series'],
        'tagIds': opts['tagIds'],
        'startingAfter': opts['startingAfter'],
        'endingBefore': opts['endingBefore'],
        'limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse2005;
      return this.apiClient.callApi(
        '/fleet/vehicles/stats', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getVehiclesLocations operation.
     * @callback module:api/FleetApi~getVehiclesLocationsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<Object>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
     * @param {Number} endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
     * @param {module:api/FleetApi~getVehiclesLocationsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<Object>}
     */
    getVehiclesLocations(accessToken, startMs, endMs, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getVehiclesLocations");
      }
      // verify the required parameter 'startMs' is set
      if (startMs === undefined || startMs === null) {
        throw new Error("Missing the required parameter 'startMs' when calling getVehiclesLocations");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getVehiclesLocations");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'startMs': startMs,
        'endMs': endMs
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Object];
      return this.apiClient.callApi(
        '/fleet/vehicles/locations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the listContacts operation.
     * @callback module:api/FleetApi~listContactsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Contact>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /contacts
     * Fetch all contacts for the organization.
     * @param {String} accessToken Samsara API access token.
     * @param {module:api/FleetApi~listContactsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Contact>}
     */
    listContacts(accessToken, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling listContacts");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Contact];
      return this.apiClient.callApi(
        '/contacts', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the listFleet operation.
     * @callback module:api/FleetApi~listFleetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse2002} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/list
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject10} groupParam 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
     * @param {String} opts.endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
     * @param {Number} opts.limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
     * @param {module:api/FleetApi~listFleetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse2002}
     */
    listFleet(accessToken, groupParam, opts, callback) {
      opts = opts || {};
      let postBody = groupParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling listFleet");
      }
      // verify the required parameter 'groupParam' is set
      if (groupParam === undefined || groupParam === null) {
        throw new Error("Missing the required parameter 'groupParam' when calling listFleet");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'startingAfter': opts['startingAfter'],
        'endingBefore': opts['endingBefore'],
        'limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse2002;
      return this.apiClient.callApi(
        '/fleet/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the patchFleetVehicle operation.
     * @callback module:api/FleetApi~patchFleetVehicleCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FleetVehicleResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * @param {String} accessToken Samsara API access token.
     * @param {String} vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     * @param {module:model/InlineObject16} data 
     * @param {module:api/FleetApi~patchFleetVehicleCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FleetVehicleResponse}
     */
    patchFleetVehicle(accessToken, vehicleIdOrExternalId, data, callback) {
      let postBody = data;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling patchFleetVehicle");
      }
      // verify the required parameter 'vehicleIdOrExternalId' is set
      if (vehicleIdOrExternalId === undefined || vehicleIdOrExternalId === null) {
        throw new Error("Missing the required parameter 'vehicleIdOrExternalId' when calling patchFleetVehicle");
      }
      // verify the required parameter 'data' is set
      if (data === undefined || data === null) {
        throw new Error("Missing the required parameter 'data' when calling patchFleetVehicle");
      }

      let pathParams = {
        'vehicle_id_or_external_id': vehicleIdOrExternalId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json', 'application/merge-patch+json'];
      let accepts = ['application/json'];
      let returnType = FleetVehicleResponse;
      return this.apiClient.callApi(
        '/fleet/vehicles/{vehicle_id_or_external_id}', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the reactivateDriverById operation.
     * @callback module:api/FleetApi~reactivateDriverByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Driver} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Reactivate the inactive driver having id.
     * @param {String} accessToken Samsara API access token.
     * @param {String} driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param {module:model/InlineObject4} reactivateDriverParam 
     * @param {module:api/FleetApi~reactivateDriverByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Driver}
     */
    reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, callback) {
      let postBody = reactivateDriverParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling reactivateDriverById");
      }
      // verify the required parameter 'driverIdOrExternalId' is set
      if (driverIdOrExternalId === undefined || driverIdOrExternalId === null) {
        throw new Error("Missing the required parameter 'driverIdOrExternalId' when calling reactivateDriverById");
      }
      // verify the required parameter 'reactivateDriverParam' is set
      if (reactivateDriverParam === undefined || reactivateDriverParam === null) {
        throw new Error("Missing the required parameter 'reactivateDriverParam' when calling reactivateDriverById");
      }

      let pathParams = {
        'driver_id_or_external_id': driverIdOrExternalId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Driver;
      return this.apiClient.callApi(
        '/fleet/drivers/inactive/{driver_id_or_external_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the updateDispatchRouteById operation.
     * @callback module:api/FleetApi~updateDispatchRouteByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRoute} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Update a dispatch route and its associated jobs.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} routeId ID of the dispatch route.
     * @param {module:model/DispatchRoute} updateDispatchRouteParams 
     * @param {module:api/FleetApi~updateDispatchRouteByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRoute}
     */
    updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, callback) {
      let postBody = updateDispatchRouteParams;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling updateDispatchRouteById");
      }
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling updateDispatchRouteById");
      }
      // verify the required parameter 'updateDispatchRouteParams' is set
      if (updateDispatchRouteParams === undefined || updateDispatchRouteParams === null) {
        throw new Error("Missing the required parameter 'updateDispatchRouteParams' when calling updateDispatchRouteById");
      }

      let pathParams = {
        'route_id': routeId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DispatchRoute;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes/{route_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the updateOrganizationAddress operation.
     * @callback module:api/FleetApi~updateOrganizationAddressCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /addresses/{addressId}
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} addressId ID of the address/geofence
     * @param {module:model/InlineObject1} address 
     * @param {module:api/FleetApi~updateOrganizationAddressCallback} callback The callback function, accepting three arguments: error, data, response
     */
    updateOrganizationAddress(accessToken, addressId, address, callback) {
      let postBody = address;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling updateOrganizationAddress");
      }
      // verify the required parameter 'addressId' is set
      if (addressId === undefined || addressId === null) {
        throw new Error("Missing the required parameter 'addressId' when calling updateOrganizationAddress");
      }
      // verify the required parameter 'address' is set
      if (address === undefined || address === null) {
        throw new Error("Missing the required parameter 'address' when calling updateOrganizationAddress");
      }

      let pathParams = {
        'addressId': addressId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = null;
      return this.apiClient.callApi(
        '/addresses/{addressId}', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the updateVehicles operation.
     * @callback module:api/FleetApi~updateVehiclesCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/set_data
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject14} vehicleUpdateParam 
     * @param {module:api/FleetApi~updateVehiclesCallback} callback The callback function, accepting three arguments: error, data, response
     */
    updateVehicles(accessToken, vehicleUpdateParam, callback) {
      let postBody = vehicleUpdateParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling updateVehicles");
      }
      // verify the required parameter 'vehicleUpdateParam' is set
      if (vehicleUpdateParam === undefined || vehicleUpdateParam === null) {
        throw new Error("Missing the required parameter 'vehicleUpdateParam' when calling updateVehicles");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = null;
      return this.apiClient.callApi(
        '/fleet/set_data', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
