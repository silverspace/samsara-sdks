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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  DocumentCreate,
  Address,
  HosLogsSummaryResponse,
  InlineObject7,
  VehicleHarshEventResponse,
  InlineObject6,
  InlineObject5,
  InlineObject4,
  Document,
  InlineObject3,
  InlineObject2,
  InlineObject1,
  AllRouteJobUpdates,
  DispatchRouteCreate,
  HosAuthenticationLogsResponse,
  DispatchRouteHistory,
  AssetReeferResponse,
  DriverDailyLogResponse,
  HosLogsResponse,
  DriversSummaryResponse,
  VehicleSafetyScoreResponse,
  InlineObject,
  DvirListResponse,
  InlineObject9,
  InlineObject8,
  FleetVehicleLocation,
  Driver,
  InlineResponse200,
  DvirBase,
  DriverSafetyScoreResponse,
  InlineObject10,
  TripResponse,
  DriversResponse,
  FleetVehicleResponse,
  DocumentType,
  InlineObject16,
  InlineObject15,
  InlineObject14,
  InlineObject13,
  InlineObject12,
  InlineObject11,
  Contact,
  DispatchRoute,
  InlineResponse2001,
  DriverForCreate,
  InlineResponse2003,
  InlineResponse2002,
  InlineResponse2005,
  InlineResponse2004,
} from './models';

/**
 * addFleetAddress - parameters interface
 */
export interface IAddFleetAddressParams {
  accessToken: string;
  addressParam: InlineObject2;
}

/**
 * addOrganizationAddresses - parameters interface
 */
export interface IAddOrganizationAddressesParams {
  accessToken: string;
  addresses: InlineObject;
}

/**
 * createDispatchRoute - parameters interface
 */
export interface ICreateDispatchRouteParams {
  accessToken: string;
  createDispatchRouteParams: DispatchRouteCreate;
}

/**
 * createDriver - parameters interface
 */
export interface ICreateDriverParams {
  accessToken: string;
  createDriverParam: DriverForCreate;
}

/**
 * createDriverDispatchRoute - parameters interface
 */
export interface ICreateDriverDispatchRouteParams {
  accessToken: string;
  driverId: number;
  createDispatchRouteParams: DispatchRouteCreate;
}

/**
 * createDriverDocument - parameters interface
 */
export interface ICreateDriverDocumentParams {
  accessToken: string;
  driverId: number;
  createDocumentParams: DocumentCreate;
}

/**
 * createDvir - parameters interface
 */
export interface ICreateDvirParams {
  accessToken: string;
  createDvirParam: InlineObject12;
}

/**
 * createVehicleDispatchRoute - parameters interface
 */
export interface ICreateVehicleDispatchRouteParams {
  accessToken: string;
  vehicleId: number;
  createDispatchRouteParams: DispatchRouteCreate;
}

/**
 * deactivateDriver - parameters interface
 */
export interface IDeactivateDriverParams {
  accessToken: string;
  driverIdOrExternalId: string;
}

/**
 * deleteDispatchRouteById - parameters interface
 */
export interface IDeleteDispatchRouteByIdParams {
  accessToken: string;
  routeId: number;
}

/**
 * deleteOrganizationAddress - parameters interface
 */
export interface IDeleteOrganizationAddressParams {
  accessToken: string;
  addressId: number;
}

/**
 * fetchAllDispatchRoutes - parameters interface
 */
export interface IFetchAllDispatchRoutesParams {
  accessToken: string;
  groupId?: number;
  endTime?: number;
  duration?: number;
}

/**
 * fetchAllRouteJobUpdates - parameters interface
 */
export interface IFetchAllRouteJobUpdatesParams {
  accessToken: string;
  groupId?: number;
  sequenceId?: string;
  include?: string;
}

/**
 * getAllAssetCurrentLocations - parameters interface
 */
export interface IGetAllAssetCurrentLocationsParams {
  accessToken: string;
  groupId?: number;
}

/**
 * getAllAssets - parameters interface
 */
export interface IGetAllAssetsParams {
  accessToken: string;
  groupId?: number;
}

/**
 * getAllDeactivatedDrivers - parameters interface
 */
export interface IGetAllDeactivatedDriversParams {
  accessToken: string;
  groupId?: number;
}

/**
 * getAssetLocation - parameters interface
 */
export interface IGetAssetLocationParams {
  accessToken: string;
  assetId: number;
  startMs: number;
  endMs: number;
}

/**
 * getAssetReefer - parameters interface
 */
export interface IGetAssetReeferParams {
  accessToken: string;
  assetId: number;
  startMs: number;
  endMs: number;
}

/**
 * getDeactivatedDriverById - parameters interface
 */
export interface IGetDeactivatedDriverByIdParams {
  accessToken: string;
  driverIdOrExternalId: string;
}

/**
 * getDispatchRouteById - parameters interface
 */
export interface IGetDispatchRouteByIdParams {
  accessToken: string;
  routeId: number;
}

/**
 * getDispatchRouteHistory - parameters interface
 */
export interface IGetDispatchRouteHistoryParams {
  accessToken: string;
  routeId: number;
  startTime?: number;
  endTime?: number;
}

/**
 * getDispatchRoutesByDriverId - parameters interface
 */
export interface IGetDispatchRoutesByDriverIdParams {
  accessToken: string;
  driverId: number;
  endTime?: number;
  duration?: number;
}

/**
 * getDispatchRoutesByVehicleId - parameters interface
 */
export interface IGetDispatchRoutesByVehicleIdParams {
  accessToken: string;
  vehicleId: number;
  endTime?: number;
  duration?: number;
}

/**
 * getDriverById - parameters interface
 */
export interface IGetDriverByIdParams {
  accessToken: string;
  driverIdOrExternalId: string;
}

/**
 * getDriverDocumentTypesByOrgId - parameters interface
 */
export interface IGetDriverDocumentTypesByOrgIdParams {
}

/**
 * getDriverDocumentsByOrgId - parameters interface
 */
export interface IGetDriverDocumentsByOrgIdParams {
  accessToken: string;
  endMs?: number;
  durationMs?: number;
}

/**
 * getDriverSafetyScore - parameters interface
 */
export interface IGetDriverSafetyScoreParams {
  driverId: number;
  accessToken: string;
  startMs: number;
  endMs: number;
}

/**
 * getDvirs - parameters interface
 */
export interface IGetDvirsParams {
  accessToken: string;
  endMs: number;
  durationMs: number;
  groupId?: number;
}

/**
 * getFleetDrivers - parameters interface
 */
export interface IGetFleetDriversParams {
  accessToken: string;
  groupDriversParam: InlineObject3;
}

/**
 * getFleetDriversHosDailyLogs - parameters interface
 */
export interface IGetFleetDriversHosDailyLogsParams {
  accessToken: string;
  driverId: number;
  hosLogsParam: InlineObject6;
}

/**
 * getFleetDriversSummary - parameters interface
 */
export interface IGetFleetDriversSummaryParams {
  accessToken: string;
  driversSummaryParam: InlineObject5;
  snapToDayBounds?: boolean;
}

/**
 * getFleetHosAuthenticationLogs - parameters interface
 */
export interface IGetFleetHosAuthenticationLogsParams {
  accessToken: string;
  hosAuthenticationLogsParam: InlineObject7;
}

/**
 * getFleetHosLogs - parameters interface
 */
export interface IGetFleetHosLogsParams {
  accessToken: string;
  hosLogsParam: InlineObject8;
}

/**
 * getFleetHosLogsSummary - parameters interface
 */
export interface IGetFleetHosLogsSummaryParams {
  accessToken: string;
  hosLogsParam: InlineObject9;
}

/**
 * getFleetLocations - parameters interface
 */
export interface IGetFleetLocationsParams {
  accessToken: string;
  groupParam: InlineObject11;
}

/**
 * getFleetMaintenanceList - parameters interface
 */
export interface IGetFleetMaintenanceListParams {
  accessToken: string;
  groupParam: InlineObject13;
}

/**
 * getFleetTrips - parameters interface
 */
export interface IGetFleetTripsParams {
  accessToken: string;
  tripsParam: InlineObject15;
}

/**
 * getFleetVehicle - parameters interface
 */
export interface IGetFleetVehicleParams {
  accessToken: string;
  vehicleIdOrExternalId: string;
}

/**
 * getOrganizationAddress - parameters interface
 */
export interface IGetOrganizationAddressParams {
  accessToken: string;
  addressId: number;
}

/**
 * getOrganizationAddresses - parameters interface
 */
export interface IGetOrganizationAddressesParams {
  accessToken: string;
}

/**
 * getOrganizationContact - parameters interface
 */
export interface IGetOrganizationContactParams {
  accessToken: string;
  contactId: number;
}

/**
 * getVehicleHarshEvent - parameters interface
 */
export interface IGetVehicleHarshEventParams {
  vehicleId: number;
  accessToken: string;
  timestamp: number;
}

/**
 * getVehicleLocations - parameters interface
 */
export interface IGetVehicleLocationsParams {
  accessToken: string;
  vehicleId: number;
  startMs: number;
  endMs: number;
}

/**
 * getVehicleSafetyScore - parameters interface
 */
export interface IGetVehicleSafetyScoreParams {
  vehicleId: number;
  accessToken: string;
  startMs: number;
  endMs: number;
}

/**
 * getVehicleStats - parameters interface
 */
export interface IGetVehicleStatsParams {
  accessToken: string;
  startMs: number;
  endMs: number;
  series?: 'engineState' | 'auxInput1' | 'auxInput2';
  tagIds?: string;
  startingAfter?: string;
  endingBefore?: string;
  limit?: number;
}

/**
 * getVehiclesLocations - parameters interface
 */
export interface IGetVehiclesLocationsParams {
  accessToken: string;
  startMs: number;
  endMs: number;
}

/**
 * listContacts - parameters interface
 */
export interface IListContactsParams {
  accessToken: string;
}

/**
 * listFleet - parameters interface
 */
export interface IListFleetParams {
  accessToken: string;
  groupParam: InlineObject10;
  startingAfter?: string;
  endingBefore?: string;
  limit?: number;
}

/**
 * patchFleetVehicle - parameters interface
 */
export interface IPatchFleetVehicleParams {
  accessToken: string;
  vehicleIdOrExternalId: string;
  data: InlineObject16;
}

/**
 * reactivateDriverById - parameters interface
 */
export interface IReactivateDriverByIdParams {
  accessToken: string;
  driverIdOrExternalId: string;
  reactivateDriverParam: InlineObject4;
}

/**
 * updateDispatchRouteById - parameters interface
 */
export interface IUpdateDispatchRouteByIdParams {
  accessToken: string;
  routeId: number;
  updateDispatchRouteParams: DispatchRoute;
}

/**
 * updateOrganizationAddress - parameters interface
 */
export interface IUpdateOrganizationAddressParams {
  accessToken: string;
  addressId: number;
  address: InlineObject1;
}

/**
 * updateVehicles - parameters interface
 */
export interface IUpdateVehiclesParams {
  accessToken: string;
  vehicleUpdateParam: InlineObject14;
}

/**
 * FleetApi - API class
 */
@autoinject()
export class FleetApi extends Api {

  /**
   * Creates a new FleetApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * /fleet/add_address
   * This method adds an address book entry to the specified group.
   * @param params.accessToken Samsara API access token.
   * @param params.addressParam 
   */
  async addFleetAddress(params: IAddFleetAddressParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('addFleetAddress', params, 'accessToken');
    this.ensureParamIsSet('addFleetAddress', params, 'addressParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/add_address`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['addressParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /addresses
   * Add one or more addresses to the organization
   * @param params.accessToken Samsara API access token.
   * @param params.addresses 
   */
  async addOrganizationAddresses(params: IAddOrganizationAddressesParams): Promise<Array<Address>> {
    // Verify required parameters are set
    this.ensureParamIsSet('addOrganizationAddresses', params, 'accessToken');
    this.ensureParamIsSet('addOrganizationAddresses', params, 'addresses');

    // Create URL to call
    const url = `${this.basePath}/addresses`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['addresses'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes
   * Create a new dispatch route.
   * @param params.accessToken Samsara API access token.
   * @param params.createDispatchRouteParams 
   */
  async createDispatchRoute(params: ICreateDispatchRouteParams): Promise<DispatchRoute> {
    // Verify required parameters are set
    this.ensureParamIsSet('createDispatchRoute', params, 'accessToken');
    this.ensureParamIsSet('createDispatchRoute', params, 'createDispatchRouteParams');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createDispatchRouteParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/create
   * Create a new driver.
   * @param params.accessToken Samsara API access token.
   * @param params.createDriverParam Driver creation body
   */
  async createDriver(params: ICreateDriverParams): Promise<Driver> {
    // Verify required parameters are set
    this.ensureParamIsSet('createDriver', params, 'accessToken');
    this.ensureParamIsSet('createDriver', params, 'createDriverParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/create`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createDriverParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
   * Create a new dispatch route for the driver with driver_id.
   * @param params.accessToken Samsara API access token.
   * @param params.driverId ID of the driver with the associated routes.
   * @param params.createDispatchRouteParams 
   */
  async createDriverDispatchRoute(params: ICreateDriverDispatchRouteParams): Promise<DispatchRoute> {
    // Verify required parameters are set
    this.ensureParamIsSet('createDriverDispatchRoute', params, 'accessToken');
    this.ensureParamIsSet('createDriverDispatchRoute', params, 'driverId');
    this.ensureParamIsSet('createDriverDispatchRoute', params, 'createDispatchRouteParams');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/{driver_id}/dispatch/routes`
      .replace(`{${'driver_id'}}`, encodeURIComponent(`${params['driverId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createDispatchRouteParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/documents
   * Create a driver document for the given driver.
   * @param params.accessToken Samsara API access token.
   * @param params.driverId ID of the driver for whom the document is created.
   * @param params.createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
   */
  async createDriverDocument(params: ICreateDriverDocumentParams): Promise<Document> {
    // Verify required parameters are set
    this.ensureParamIsSet('createDriverDocument', params, 'accessToken');
    this.ensureParamIsSet('createDriverDocument', params, 'driverId');
    this.ensureParamIsSet('createDriverDocument', params, 'createDocumentParams');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/{driver_id}/documents`
      .replace(`{${'driver_id'}}`, encodeURIComponent(`${params['driverId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createDocumentParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/maintenance/dvirs
   * Create a new dvir, marking a vehicle or trailer safe or unsafe.
   * @param params.accessToken Samsara API access token.
   * @param params.createDvirParam 
   */
  async createDvir(params: ICreateDvirParams): Promise<DvirBase> {
    // Verify required parameters are set
    this.ensureParamIsSet('createDvir', params, 'accessToken');
    this.ensureParamIsSet('createDvir', params, 'createDvirParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/maintenance/dvirs`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createDvirParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
   * Create a new dispatch route for the vehicle with vehicle_id.
   * @param params.accessToken Samsara API access token.
   * @param params.vehicleId ID of the vehicle with the associated routes.
   * @param params.createDispatchRouteParams 
   */
  async createVehicleDispatchRoute(params: ICreateVehicleDispatchRouteParams): Promise<DispatchRoute> {
    // Verify required parameters are set
    this.ensureParamIsSet('createVehicleDispatchRoute', params, 'accessToken');
    this.ensureParamIsSet('createVehicleDispatchRoute', params, 'vehicleId');
    this.ensureParamIsSet('createVehicleDispatchRoute', params, 'createDispatchRouteParams');

    // Create URL to call
    const url = `${this.basePath}/fleet/vehicles/{vehicle_id}/dispatch/routes`
      .replace(`{${'vehicle_id'}}`, encodeURIComponent(`${params['vehicleId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createDispatchRouteParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Deactivate a driver with the given id.
   * @param params.accessToken Samsara API access token.
   * @param params.driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   */
  async deactivateDriver(params: IDeactivateDriverParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('deactivateDriver', params, 'accessToken');
    this.ensureParamIsSet('deactivateDriver', params, 'driverIdOrExternalId');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/{driver_id_or_external_id}`
      .replace(`{${'driver_id_or_external_id'}}`, encodeURIComponent(`${params['driverIdOrExternalId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asDelete()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/
   * Delete a dispatch route and its associated jobs.
   * @param params.accessToken Samsara API access token.
   * @param params.routeId ID of the dispatch route.
   */
  async deleteDispatchRouteById(params: IDeleteDispatchRouteByIdParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('deleteDispatchRouteById', params, 'accessToken');
    this.ensureParamIsSet('deleteDispatchRouteById', params, 'routeId');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes/{route_id}`
      .replace(`{${'route_id'}}`, encodeURIComponent(`${params['routeId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asDelete()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /addresses/{addressId}
   * Delete an address.
   * @param params.accessToken Samsara API access token.
   * @param params.addressId ID of the address/geofence
   */
  async deleteOrganizationAddress(params: IDeleteOrganizationAddressParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('deleteOrganizationAddress', params, 'accessToken');
    this.ensureParamIsSet('deleteOrganizationAddress', params, 'addressId');

    // Create URL to call
    const url = `${this.basePath}/addresses/{addressId}`
      .replace(`{${'addressId'}}`, encodeURIComponent(`${params['addressId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asDelete()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes
   * Fetch all of the dispatch routes for the group.
   * @param params.accessToken Samsara API access token.
   * @param params.groupId Optional group ID if the organization has multiple groups (uncommon).
   * @param params.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param params.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   */
  async fetchAllDispatchRoutes(params: IFetchAllDispatchRoutesParams): Promise<Array<DispatchRoute>> {
    // Verify required parameters are set
    this.ensureParamIsSet('fetchAllDispatchRoutes', params, 'accessToken');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'group_id': params['groupId'],
        'end_time': params['endTime'],
        'duration': params['duration'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes/job_updates
   * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
   * @param params.accessToken Samsara API access token.
   * @param params.groupId Optional group ID if the organization has multiple groups (uncommon).
   * @param params.sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
   * @param params.include Optionally set include&#x3D;route to include route object in response payload.
   */
  async fetchAllRouteJobUpdates(params: IFetchAllRouteJobUpdatesParams): Promise<AllRouteJobUpdates> {
    // Verify required parameters are set
    this.ensureParamIsSet('fetchAllRouteJobUpdates', params, 'accessToken');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes/job_updates`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'group_id': params['groupId'],
        'sequence_id': params['sequenceId'],
        'include': params['include'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/assets/locations
   * Fetch current locations of all assets for the group.
   * @param params.accessToken Samsara API access token.
   * @param params.groupId Optional group ID if the organization has multiple groups (uncommon).
   */
  async getAllAssetCurrentLocations(params: IGetAllAssetCurrentLocationsParams): Promise<InlineResponse2001> {
    // Verify required parameters are set
    this.ensureParamIsSet('getAllAssetCurrentLocations', params, 'accessToken');

    // Create URL to call
    const url = `${this.basePath}/fleet/assets/locations`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'group_id': params['groupId'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/assets
   * Fetch all of the assets for the group.
   * @param params.accessToken Samsara API access token.
   * @param params.groupId Optional group ID if the organization has multiple groups (uncommon).
   */
  async getAllAssets(params: IGetAllAssetsParams): Promise<InlineResponse200> {
    // Verify required parameters are set
    this.ensureParamIsSet('getAllAssets', params, 'accessToken');

    // Create URL to call
    const url = `${this.basePath}/fleet/assets`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'group_id': params['groupId'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/inactive
   * Fetch all deactivated drivers for the group.
   * @param params.accessToken Samsara API access token.
   * @param params.groupId Optional group ID if the organization has multiple groups (uncommon).
   */
  async getAllDeactivatedDrivers(params: IGetAllDeactivatedDriversParams): Promise<Array<Driver>> {
    // Verify required parameters are set
    this.ensureParamIsSet('getAllDeactivatedDrivers', params, 'accessToken');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/inactive`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'group_id': params['groupId'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/assets/{assetId:[0-9]+}/locations
   * Fetch the historical locations for the asset.
   * @param params.accessToken Samsara API access token.
   * @param params.assetId ID of the asset
   * @param params.startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param params.endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   */
  async getAssetLocation(params: IGetAssetLocationParams): Promise<Array<any>> {
    // Verify required parameters are set
    this.ensureParamIsSet('getAssetLocation', params, 'accessToken');
    this.ensureParamIsSet('getAssetLocation', params, 'assetId');
    this.ensureParamIsSet('getAssetLocation', params, 'startMs');
    this.ensureParamIsSet('getAssetLocation', params, 'endMs');

    // Create URL to call
    const url = `${this.basePath}/fleet/assets/{asset_id}/locations`
      .replace(`{${'asset_id'}}`, encodeURIComponent(`${params['assetId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'startMs': params['startMs'],
        'endMs': params['endMs'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/assets/{assetId:[0-9]+}/reefer
   * Fetch the reefer-specific stats of an asset.
   * @param params.accessToken Samsara API access token.
   * @param params.assetId ID of the asset
   * @param params.startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param params.endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   */
  async getAssetReefer(params: IGetAssetReeferParams): Promise<AssetReeferResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getAssetReefer', params, 'accessToken');
    this.ensureParamIsSet('getAssetReefer', params, 'assetId');
    this.ensureParamIsSet('getAssetReefer', params, 'startMs');
    this.ensureParamIsSet('getAssetReefer', params, 'endMs');

    // Create URL to call
    const url = `${this.basePath}/fleet/assets/{asset_id}/reefer`
      .replace(`{${'asset_id'}}`, encodeURIComponent(`${params['assetId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'startMs': params['startMs'],
        'endMs': params['endMs'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Fetch deactivated driver by id.
   * @param params.accessToken Samsara API access token.
   * @param params.driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   */
  async getDeactivatedDriverById(params: IGetDeactivatedDriverByIdParams): Promise<Driver> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDeactivatedDriverById', params, 'accessToken');
    this.ensureParamIsSet('getDeactivatedDriverById', params, 'driverIdOrExternalId');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/inactive/{driver_id_or_external_id}`
      .replace(`{${'driver_id_or_external_id'}}`, encodeURIComponent(`${params['driverIdOrExternalId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}
   * Fetch a dispatch route by id.
   * @param params.accessToken Samsara API access token.
   * @param params.routeId ID of the dispatch route.
   */
  async getDispatchRouteById(params: IGetDispatchRouteByIdParams): Promise<DispatchRoute> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDispatchRouteById', params, 'accessToken');
    this.ensureParamIsSet('getDispatchRouteById', params, 'routeId');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes/{route_id}`
      .replace(`{${'route_id'}}`, encodeURIComponent(`${params['routeId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/history
   * Fetch the history of a dispatch route.
   * @param params.accessToken Samsara API access token.
   * @param params.routeId ID of the route with history.
   * @param params.startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
   * @param params.endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
   */
  async getDispatchRouteHistory(params: IGetDispatchRouteHistoryParams): Promise<DispatchRouteHistory> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDispatchRouteHistory', params, 'accessToken');
    this.ensureParamIsSet('getDispatchRouteHistory', params, 'routeId');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes/{route_id}/history`
      .replace(`{${'route_id'}}`, encodeURIComponent(`${params['routeId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'start_time': params['startTime'],
        'end_time': params['endTime'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
   * Fetch all of the dispatch routes for a given driver.
   * @param params.accessToken Samsara API access token.
   * @param params.driverId ID of the driver with the associated routes.
   * @param params.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param params.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   */
  async getDispatchRoutesByDriverId(params: IGetDispatchRoutesByDriverIdParams): Promise<Array<DispatchRoute>> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDispatchRoutesByDriverId', params, 'accessToken');
    this.ensureParamIsSet('getDispatchRoutesByDriverId', params, 'driverId');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/{driver_id}/dispatch/routes`
      .replace(`{${'driver_id'}}`, encodeURIComponent(`${params['driverId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'end_time': params['endTime'],
        'duration': params['duration'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
   * Fetch all of the dispatch routes for a given vehicle.
   * @param params.accessToken Samsara API access token.
   * @param params.vehicleId ID of the vehicle with the associated routes.
   * @param params.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param params.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   */
  async getDispatchRoutesByVehicleId(params: IGetDispatchRoutesByVehicleIdParams): Promise<Array<DispatchRoute>> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDispatchRoutesByVehicleId', params, 'accessToken');
    this.ensureParamIsSet('getDispatchRoutesByVehicleId', params, 'vehicleId');

    // Create URL to call
    const url = `${this.basePath}/fleet/vehicles/{vehicle_id}/dispatch/routes`
      .replace(`{${'vehicle_id'}}`, encodeURIComponent(`${params['vehicleId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'end_time': params['endTime'],
        'duration': params['duration'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Fetch driver by id.
   * @param params.accessToken Samsara API access token.
   * @param params.driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   */
  async getDriverById(params: IGetDriverByIdParams): Promise<Driver> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDriverById', params, 'accessToken');
    this.ensureParamIsSet('getDriverById', params, 'driverIdOrExternalId');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/{driver_id_or_external_id}`
      .replace(`{${'driver_id_or_external_id'}}`, encodeURIComponent(`${params['driverIdOrExternalId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/document_types
   * Fetch all of the document types.
   */
  async getDriverDocumentTypesByOrgId(): Promise<Array<DocumentType>> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/document_types`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/documents
   * Fetch all of the documents.
   * @param params.accessToken Samsara API access token.
   * @param params.endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
   * @param params.durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
   */
  async getDriverDocumentsByOrgId(params: IGetDriverDocumentsByOrgIdParams): Promise<Array<Document>> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDriverDocumentsByOrgId', params, 'accessToken');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/documents`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'endMs': params['endMs'],
        'durationMs': params['durationMs'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/{driverId:[0-9]+}/safety/score
   * Fetch the safety score for the driver.
   * @param params.driverId ID of the driver
   * @param params.accessToken Samsara API access token.
   * @param params.startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param params.endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   */
  async getDriverSafetyScore(params: IGetDriverSafetyScoreParams): Promise<DriverSafetyScoreResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDriverSafetyScore', params, 'driverId');
    this.ensureParamIsSet('getDriverSafetyScore', params, 'accessToken');
    this.ensureParamIsSet('getDriverSafetyScore', params, 'startMs');
    this.ensureParamIsSet('getDriverSafetyScore', params, 'endMs');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/{driverId}/safety/score`
      .replace(`{${'driverId'}}`, encodeURIComponent(`${params['driverId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'startMs': params['startMs'],
        'endMs': params['endMs'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/maintenance/dvirs
   * Get DVIRs for the org within provided time constraints
   * @param params.accessToken Samsara API access token.
   * @param params.endMs time in millis until the last dvir log.
   * @param params.durationMs time in millis which corresponds to the duration before the end_ms.
   * @param params.groupId Group ID to query.
   */
  async getDvirs(params: IGetDvirsParams): Promise<DvirListResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDvirs', params, 'accessToken');
    this.ensureParamIsSet('getDvirs', params, 'endMs');
    this.ensureParamIsSet('getDvirs', params, 'durationMs');

    // Create URL to call
    const url = `${this.basePath}/fleet/maintenance/dvirs`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'end_ms': params['endMs'],
        'duration_ms': params['durationMs'],
        'group_id': params['groupId'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers
   * Get all the drivers for the specified group.
   * @param params.accessToken Samsara API access token.
   * @param params.groupDriversParam 
   */
  async getFleetDrivers(params: IGetFleetDriversParams): Promise<DriversResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getFleetDrivers', params, 'accessToken');
    this.ensureParamIsSet('getFleetDrivers', params, 'groupDriversParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['groupDriversParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
   * Get summarized daily HOS charts for a specified driver.
   * @param params.accessToken Samsara API access token.
   * @param params.driverId ID of the driver with HOS logs.
   * @param params.hosLogsParam 
   */
  async getFleetDriversHosDailyLogs(params: IGetFleetDriversHosDailyLogsParams): Promise<DriverDailyLogResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getFleetDriversHosDailyLogs', params, 'accessToken');
    this.ensureParamIsSet('getFleetDriversHosDailyLogs', params, 'driverId');
    this.ensureParamIsSet('getFleetDriversHosDailyLogs', params, 'hosLogsParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/{driver_id}/hos_daily_logs`
      .replace(`{${'driver_id'}}`, encodeURIComponent(`${params['driverId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['hosLogsParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/summary
   * Get the distance and time each driver in an organization has driven in a given time period.
   * @param params.accessToken Samsara API access token.
   * @param params.driversSummaryParam 
   * @param params.snapToDayBounds Snap query result to HOS day boundaries.
   */
  async getFleetDriversSummary(params: IGetFleetDriversSummaryParams): Promise<DriversSummaryResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getFleetDriversSummary', params, 'accessToken');
    this.ensureParamIsSet('getFleetDriversSummary', params, 'driversSummaryParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/summary`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'snap_to_day_bounds': params['snapToDayBounds'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['driversSummaryParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/hos_authentication_logs
   * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
   * @param params.accessToken Samsara API access token.
   * @param params.hosAuthenticationLogsParam 
   */
  async getFleetHosAuthenticationLogs(params: IGetFleetHosAuthenticationLogsParams): Promise<HosAuthenticationLogsResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getFleetHosAuthenticationLogs', params, 'accessToken');
    this.ensureParamIsSet('getFleetHosAuthenticationLogs', params, 'hosAuthenticationLogsParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/hos_authentication_logs`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['hosAuthenticationLogsParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/hos_logs
   * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
   * @param params.accessToken Samsara API access token.
   * @param params.hosLogsParam 
   */
  async getFleetHosLogs(params: IGetFleetHosLogsParams): Promise<HosLogsResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getFleetHosLogs', params, 'accessToken');
    this.ensureParamIsSet('getFleetHosLogs', params, 'hosLogsParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/hos_logs`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['hosLogsParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/hos_logs_summary
   * Get the current HOS status for all drivers in the group.
   * @param params.accessToken Samsara API access token.
   * @param params.hosLogsParam 
   */
  async getFleetHosLogsSummary(params: IGetFleetHosLogsSummaryParams): Promise<HosLogsSummaryResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getFleetHosLogsSummary', params, 'accessToken');
    this.ensureParamIsSet('getFleetHosLogsSummary', params, 'hosLogsParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/hos_logs_summary`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['hosLogsParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/locations
   * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
   * @param params.accessToken Samsara API access token.
   * @param params.groupParam 
   */
  async getFleetLocations(params: IGetFleetLocationsParams): Promise<InlineResponse2003> {
    // Verify required parameters are set
    this.ensureParamIsSet('getFleetLocations', params, 'accessToken');
    this.ensureParamIsSet('getFleetLocations', params, 'groupParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/locations`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['groupParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/maintenance/list
   * Get list of the vehicles with any engine faults or check light data.
   * @param params.accessToken Samsara API access token.
   * @param params.groupParam 
   */
  async getFleetMaintenanceList(params: IGetFleetMaintenanceListParams): Promise<InlineResponse2004> {
    // Verify required parameters are set
    this.ensureParamIsSet('getFleetMaintenanceList', params, 'accessToken');
    this.ensureParamIsSet('getFleetMaintenanceList', params, 'groupParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/maintenance/list`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['groupParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/trips
   * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
   * @param params.accessToken Samsara API access token.
   * @param params.tripsParam 
   */
  async getFleetTrips(params: IGetFleetTripsParams): Promise<TripResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getFleetTrips', params, 'accessToken');
    this.ensureParamIsSet('getFleetTrips', params, 'tripsParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/trips`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['tripsParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Gets a specific vehicle.
   * @param params.accessToken Samsara API access token.
   * @param params.vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
   */
  async getFleetVehicle(params: IGetFleetVehicleParams): Promise<FleetVehicleResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getFleetVehicle', params, 'accessToken');
    this.ensureParamIsSet('getFleetVehicle', params, 'vehicleIdOrExternalId');

    // Create URL to call
    const url = `${this.basePath}/fleet/vehicles/{vehicle_id_or_external_id}`
      .replace(`{${'vehicle_id_or_external_id'}}`, encodeURIComponent(`${params['vehicleIdOrExternalId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /addresses/{addressId}
   * Fetch an address by its id.
   * @param params.accessToken Samsara API access token.
   * @param params.addressId ID of the address/geofence
   */
  async getOrganizationAddress(params: IGetOrganizationAddressParams): Promise<Address> {
    // Verify required parameters are set
    this.ensureParamIsSet('getOrganizationAddress', params, 'accessToken');
    this.ensureParamIsSet('getOrganizationAddress', params, 'addressId');

    // Create URL to call
    const url = `${this.basePath}/addresses/{addressId}`
      .replace(`{${'addressId'}}`, encodeURIComponent(`${params['addressId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /addresses
   * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
   * @param params.accessToken Samsara API access token.
   */
  async getOrganizationAddresses(params: IGetOrganizationAddressesParams): Promise<Array<Address>> {
    // Verify required parameters are set
    this.ensureParamIsSet('getOrganizationAddresses', params, 'accessToken');

    // Create URL to call
    const url = `${this.basePath}/addresses`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /contacts/{contact_id}
   * Fetch a contact by its id.
   * @param params.accessToken Samsara API access token.
   * @param params.contactId ID of the contact
   */
  async getOrganizationContact(params: IGetOrganizationContactParams): Promise<Contact> {
    // Verify required parameters are set
    this.ensureParamIsSet('getOrganizationContact', params, 'accessToken');
    this.ensureParamIsSet('getOrganizationContact', params, 'contactId');

    // Create URL to call
    const url = `${this.basePath}/contacts/{contact_id}`
      .replace(`{${'contact_id'}}`, encodeURIComponent(`${params['contactId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
   * Fetch harsh event details for a vehicle.
   * @param params.vehicleId ID of the vehicle
   * @param params.accessToken Samsara API access token.
   * @param params.timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
   */
  async getVehicleHarshEvent(params: IGetVehicleHarshEventParams): Promise<VehicleHarshEventResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getVehicleHarshEvent', params, 'vehicleId');
    this.ensureParamIsSet('getVehicleHarshEvent', params, 'accessToken');
    this.ensureParamIsSet('getVehicleHarshEvent', params, 'timestamp');

    // Create URL to call
    const url = `${this.basePath}/fleet/vehicles/{vehicleId}/safety/harsh_event`
      .replace(`{${'vehicleId'}}`, encodeURIComponent(`${params['vehicleId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'timestamp': params['timestamp'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
   * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
   * @param params.accessToken Samsara API access token.
   * @param params.vehicleId ID of the vehicle with the associated routes.
   * @param params.startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
   * @param params.endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
   */
  async getVehicleLocations(params: IGetVehicleLocationsParams): Promise<Array<FleetVehicleLocation>> {
    // Verify required parameters are set
    this.ensureParamIsSet('getVehicleLocations', params, 'accessToken');
    this.ensureParamIsSet('getVehicleLocations', params, 'vehicleId');
    this.ensureParamIsSet('getVehicleLocations', params, 'startMs');
    this.ensureParamIsSet('getVehicleLocations', params, 'endMs');

    // Create URL to call
    const url = `${this.basePath}/fleet/vehicles/{vehicle_id}/locations`
      .replace(`{${'vehicle_id'}}`, encodeURIComponent(`${params['vehicleId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'startMs': params['startMs'],
        'endMs': params['endMs'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
   * Fetch the safety score for the vehicle.
   * @param params.vehicleId ID of the vehicle
   * @param params.accessToken Samsara API access token.
   * @param params.startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param params.endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   */
  async getVehicleSafetyScore(params: IGetVehicleSafetyScoreParams): Promise<VehicleSafetyScoreResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getVehicleSafetyScore', params, 'vehicleId');
    this.ensureParamIsSet('getVehicleSafetyScore', params, 'accessToken');
    this.ensureParamIsSet('getVehicleSafetyScore', params, 'startMs');
    this.ensureParamIsSet('getVehicleSafetyScore', params, 'endMs');

    // Create URL to call
    const url = `${this.basePath}/fleet/vehicles/{vehicleId}/safety/score`
      .replace(`{${'vehicleId'}}`, encodeURIComponent(`${params['vehicleId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'startMs': params['startMs'],
        'endMs': params['endMs'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/vehicles/stats
   * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
   * @param params.accessToken Samsara API access token.
   * @param params.startMs Time in Unix epoch milliseconds for the start of the query.
   * @param params.endMs Time in Unix epoch milliseconds for the end of the query.
   * @param params.series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
   * @param params.tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
   * @param params.startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
   * @param params.endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
   * @param params.limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
   */
  async getVehicleStats(params: IGetVehicleStatsParams): Promise<InlineResponse2005> {
    // Verify required parameters are set
    this.ensureParamIsSet('getVehicleStats', params, 'accessToken');
    this.ensureParamIsSet('getVehicleStats', params, 'startMs');
    this.ensureParamIsSet('getVehicleStats', params, 'endMs');

    // Create URL to call
    const url = `${this.basePath}/fleet/vehicles/stats`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'startMs': params['startMs'],
        'endMs': params['endMs'],
        'series': params['series'],
        'tagIds': params['tagIds'],
        'startingAfter': params['startingAfter'],
        'endingBefore': params['endingBefore'],
        'limit': params['limit'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/vehicles/locations
   * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
   * @param params.accessToken Samsara API access token.
   * @param params.startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
   * @param params.endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
   */
  async getVehiclesLocations(params: IGetVehiclesLocationsParams): Promise<Array<any>> {
    // Verify required parameters are set
    this.ensureParamIsSet('getVehiclesLocations', params, 'accessToken');
    this.ensureParamIsSet('getVehiclesLocations', params, 'startMs');
    this.ensureParamIsSet('getVehiclesLocations', params, 'endMs');

    // Create URL to call
    const url = `${this.basePath}/fleet/vehicles/locations`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'startMs': params['startMs'],
        'endMs': params['endMs'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /contacts
   * Fetch all contacts for the organization.
   * @param params.accessToken Samsara API access token.
   */
  async listContacts(params: IListContactsParams): Promise<Array<Contact>> {
    // Verify required parameters are set
    this.ensureParamIsSet('listContacts', params, 'accessToken');

    // Create URL to call
    const url = `${this.basePath}/contacts`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/list
   * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
   * @param params.accessToken Samsara API access token.
   * @param params.groupParam 
   * @param params.startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
   * @param params.endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
   * @param params.limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
   */
  async listFleet(params: IListFleetParams): Promise<InlineResponse2002> {
    // Verify required parameters are set
    this.ensureParamIsSet('listFleet', params, 'accessToken');
    this.ensureParamIsSet('listFleet', params, 'groupParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/list`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'startingAfter': params['startingAfter'],
        'endingBefore': params['endingBefore'],
        'limit': params['limit'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['groupParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
   * @param params.accessToken Samsara API access token.
   * @param params.vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
   * @param params.data 
   */
  async patchFleetVehicle(params: IPatchFleetVehicleParams): Promise<FleetVehicleResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('patchFleetVehicle', params, 'accessToken');
    this.ensureParamIsSet('patchFleetVehicle', params, 'vehicleIdOrExternalId');
    this.ensureParamIsSet('patchFleetVehicle', params, 'data');

    // Create URL to call
    const url = `${this.basePath}/fleet/vehicles/{vehicle_id_or_external_id}`
      .replace(`{${'vehicle_id_or_external_id'}}`, encodeURIComponent(`${params['vehicleIdOrExternalId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPatch()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['data'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Reactivate the inactive driver having id.
   * @param params.accessToken Samsara API access token.
   * @param params.driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   * @param params.reactivateDriverParam 
   */
  async reactivateDriverById(params: IReactivateDriverByIdParams): Promise<Driver> {
    // Verify required parameters are set
    this.ensureParamIsSet('reactivateDriverById', params, 'accessToken');
    this.ensureParamIsSet('reactivateDriverById', params, 'driverIdOrExternalId');
    this.ensureParamIsSet('reactivateDriverById', params, 'reactivateDriverParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/inactive/{driver_id_or_external_id}`
      .replace(`{${'driver_id_or_external_id'}}`, encodeURIComponent(`${params['driverIdOrExternalId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPut()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['reactivateDriverParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/
   * Update a dispatch route and its associated jobs.
   * @param params.accessToken Samsara API access token.
   * @param params.routeId ID of the dispatch route.
   * @param params.updateDispatchRouteParams 
   */
  async updateDispatchRouteById(params: IUpdateDispatchRouteByIdParams): Promise<DispatchRoute> {
    // Verify required parameters are set
    this.ensureParamIsSet('updateDispatchRouteById', params, 'accessToken');
    this.ensureParamIsSet('updateDispatchRouteById', params, 'routeId');
    this.ensureParamIsSet('updateDispatchRouteById', params, 'updateDispatchRouteParams');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes/{route_id}`
      .replace(`{${'route_id'}}`, encodeURIComponent(`${params['routeId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPut()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['updateDispatchRouteParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /addresses/{addressId}
   * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
   * @param params.accessToken Samsara API access token.
   * @param params.addressId ID of the address/geofence
   * @param params.address 
   */
  async updateOrganizationAddress(params: IUpdateOrganizationAddressParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('updateOrganizationAddress', params, 'accessToken');
    this.ensureParamIsSet('updateOrganizationAddress', params, 'addressId');
    this.ensureParamIsSet('updateOrganizationAddress', params, 'address');

    // Create URL to call
    const url = `${this.basePath}/addresses/{addressId}`
      .replace(`{${'addressId'}}`, encodeURIComponent(`${params['addressId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPatch()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['address'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/set_data
   * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
   * @param params.accessToken Samsara API access token.
   * @param params.vehicleUpdateParam 
   */
  async updateVehicles(params: IUpdateVehiclesParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('updateVehicles', params, 'accessToken');
    this.ensureParamIsSet('updateVehicles', params, 'vehicleUpdateParam');

    // Create URL to call
    const url = `${this.basePath}/fleet/set_data`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['vehicleUpdateParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

