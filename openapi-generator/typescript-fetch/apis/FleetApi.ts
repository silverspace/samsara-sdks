// tslint:disable
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


import * as runtime from '../runtime';
import {
    Address,
    AddressFromJSON,
    AddressToJSON,
    AllRouteJobUpdates,
    AllRouteJobUpdatesFromJSON,
    AllRouteJobUpdatesToJSON,
    AssetReeferResponse,
    AssetReeferResponseFromJSON,
    AssetReeferResponseToJSON,
    Contact,
    ContactFromJSON,
    ContactToJSON,
    DispatchRoute,
    DispatchRouteFromJSON,
    DispatchRouteToJSON,
    DispatchRouteCreate,
    DispatchRouteCreateFromJSON,
    DispatchRouteCreateToJSON,
    DispatchRouteHistory,
    DispatchRouteHistoryFromJSON,
    DispatchRouteHistoryToJSON,
    Document,
    DocumentFromJSON,
    DocumentToJSON,
    DocumentCreate,
    DocumentCreateFromJSON,
    DocumentCreateToJSON,
    DocumentType,
    DocumentTypeFromJSON,
    DocumentTypeToJSON,
    Driver,
    DriverFromJSON,
    DriverToJSON,
    DriverDailyLogResponse,
    DriverDailyLogResponseFromJSON,
    DriverDailyLogResponseToJSON,
    DriverForCreate,
    DriverForCreateFromJSON,
    DriverForCreateToJSON,
    DriverSafetyScoreResponse,
    DriverSafetyScoreResponseFromJSON,
    DriverSafetyScoreResponseToJSON,
    DriversResponse,
    DriversResponseFromJSON,
    DriversResponseToJSON,
    DriversSummaryResponse,
    DriversSummaryResponseFromJSON,
    DriversSummaryResponseToJSON,
    DvirBase,
    DvirBaseFromJSON,
    DvirBaseToJSON,
    DvirListResponse,
    DvirListResponseFromJSON,
    DvirListResponseToJSON,
    FleetVehicleLocation,
    FleetVehicleLocationFromJSON,
    FleetVehicleLocationToJSON,
    FleetVehicleResponse,
    FleetVehicleResponseFromJSON,
    FleetVehicleResponseToJSON,
    HosAuthenticationLogsResponse,
    HosAuthenticationLogsResponseFromJSON,
    HosAuthenticationLogsResponseToJSON,
    HosLogsResponse,
    HosLogsResponseFromJSON,
    HosLogsResponseToJSON,
    HosLogsSummaryResponse,
    HosLogsSummaryResponseFromJSON,
    HosLogsSummaryResponseToJSON,
    InlineObject,
    InlineObjectFromJSON,
    InlineObjectToJSON,
    InlineObject1,
    InlineObject1FromJSON,
    InlineObject1ToJSON,
    InlineObject10,
    InlineObject10FromJSON,
    InlineObject10ToJSON,
    InlineObject11,
    InlineObject11FromJSON,
    InlineObject11ToJSON,
    InlineObject12,
    InlineObject12FromJSON,
    InlineObject12ToJSON,
    InlineObject13,
    InlineObject13FromJSON,
    InlineObject13ToJSON,
    InlineObject14,
    InlineObject14FromJSON,
    InlineObject14ToJSON,
    InlineObject15,
    InlineObject15FromJSON,
    InlineObject15ToJSON,
    InlineObject16,
    InlineObject16FromJSON,
    InlineObject16ToJSON,
    InlineObject2,
    InlineObject2FromJSON,
    InlineObject2ToJSON,
    InlineObject3,
    InlineObject3FromJSON,
    InlineObject3ToJSON,
    InlineObject4,
    InlineObject4FromJSON,
    InlineObject4ToJSON,
    InlineObject5,
    InlineObject5FromJSON,
    InlineObject5ToJSON,
    InlineObject6,
    InlineObject6FromJSON,
    InlineObject6ToJSON,
    InlineObject7,
    InlineObject7FromJSON,
    InlineObject7ToJSON,
    InlineObject8,
    InlineObject8FromJSON,
    InlineObject8ToJSON,
    InlineObject9,
    InlineObject9FromJSON,
    InlineObject9ToJSON,
    InlineResponse200,
    InlineResponse200FromJSON,
    InlineResponse200ToJSON,
    InlineResponse2001,
    InlineResponse2001FromJSON,
    InlineResponse2001ToJSON,
    InlineResponse2002,
    InlineResponse2002FromJSON,
    InlineResponse2002ToJSON,
    InlineResponse2003,
    InlineResponse2003FromJSON,
    InlineResponse2003ToJSON,
    InlineResponse2004,
    InlineResponse2004FromJSON,
    InlineResponse2004ToJSON,
    InlineResponse2005,
    InlineResponse2005FromJSON,
    InlineResponse2005ToJSON,
    TripResponse,
    TripResponseFromJSON,
    TripResponseToJSON,
    VehicleHarshEventResponse,
    VehicleHarshEventResponseFromJSON,
    VehicleHarshEventResponseToJSON,
    VehicleSafetyScoreResponse,
    VehicleSafetyScoreResponseFromJSON,
    VehicleSafetyScoreResponseToJSON,
} from '../models';

export interface AddFleetAddressRequest {
    accessToken: string;
    addressParam: InlineObject2;
}

export interface AddOrganizationAddressesRequest {
    accessToken: string;
    addresses: InlineObject;
}

export interface CreateDispatchRouteRequest {
    accessToken: string;
    createDispatchRouteParams: DispatchRouteCreate;
}

export interface CreateDriverRequest {
    accessToken: string;
    createDriverParam: DriverForCreate;
}

export interface CreateDriverDispatchRouteRequest {
    accessToken: string;
    driverId: number;
    createDispatchRouteParams: DispatchRouteCreate;
}

export interface CreateDriverDocumentRequest {
    accessToken: string;
    driverId: number;
    createDocumentParams: DocumentCreate;
}

export interface CreateDvirRequest {
    accessToken: string;
    createDvirParam: InlineObject12;
}

export interface CreateVehicleDispatchRouteRequest {
    accessToken: string;
    vehicleId: number;
    createDispatchRouteParams: DispatchRouteCreate;
}

export interface DeactivateDriverRequest {
    accessToken: string;
    driverIdOrExternalId: string;
}

export interface DeleteDispatchRouteByIdRequest {
    accessToken: string;
    routeId: number;
}

export interface DeleteOrganizationAddressRequest {
    accessToken: string;
    addressId: number;
}

export interface FetchAllDispatchRoutesRequest {
    accessToken: string;
    groupId?: number;
    endTime?: number;
    duration?: number;
}

export interface FetchAllRouteJobUpdatesRequest {
    accessToken: string;
    groupId?: number;
    sequenceId?: string;
    include?: string;
}

export interface GetAllAssetCurrentLocationsRequest {
    accessToken: string;
    groupId?: number;
}

export interface GetAllAssetsRequest {
    accessToken: string;
    groupId?: number;
}

export interface GetAllDeactivatedDriversRequest {
    accessToken: string;
    groupId?: number;
}

export interface GetAssetLocationRequest {
    accessToken: string;
    assetId: number;
    startMs: number;
    endMs: number;
}

export interface GetAssetReeferRequest {
    accessToken: string;
    assetId: number;
    startMs: number;
    endMs: number;
}

export interface GetDeactivatedDriverByIdRequest {
    accessToken: string;
    driverIdOrExternalId: string;
}

export interface GetDispatchRouteByIdRequest {
    accessToken: string;
    routeId: number;
}

export interface GetDispatchRouteHistoryRequest {
    accessToken: string;
    routeId: number;
    startTime?: number;
    endTime?: number;
}

export interface GetDispatchRoutesByDriverIdRequest {
    accessToken: string;
    driverId: number;
    endTime?: number;
    duration?: number;
}

export interface GetDispatchRoutesByVehicleIdRequest {
    accessToken: string;
    vehicleId: number;
    endTime?: number;
    duration?: number;
}

export interface GetDriverByIdRequest {
    accessToken: string;
    driverIdOrExternalId: string;
}

export interface GetDriverDocumentsByOrgIdRequest {
    accessToken: string;
    endMs?: number;
    durationMs?: number;
}

export interface GetDriverSafetyScoreRequest {
    driverId: number;
    accessToken: string;
    startMs: number;
    endMs: number;
}

export interface GetDvirsRequest {
    accessToken: string;
    endMs: number;
    durationMs: number;
    groupId?: number;
}

export interface GetFleetDriversRequest {
    accessToken: string;
    groupDriversParam: InlineObject3;
}

export interface GetFleetDriversHosDailyLogsRequest {
    accessToken: string;
    driverId: number;
    hosLogsParam: InlineObject6;
}

export interface GetFleetDriversSummaryRequest {
    accessToken: string;
    driversSummaryParam: InlineObject5;
    snapToDayBounds?: boolean;
}

export interface GetFleetHosAuthenticationLogsRequest {
    accessToken: string;
    hosAuthenticationLogsParam: InlineObject7;
}

export interface GetFleetHosLogsRequest {
    accessToken: string;
    hosLogsParam: InlineObject8;
}

export interface GetFleetHosLogsSummaryRequest {
    accessToken: string;
    hosLogsParam: InlineObject9;
}

export interface GetFleetLocationsRequest {
    accessToken: string;
    groupParam: InlineObject11;
}

export interface GetFleetMaintenanceListRequest {
    accessToken: string;
    groupParam: InlineObject13;
}

export interface GetFleetTripsRequest {
    accessToken: string;
    tripsParam: InlineObject15;
}

export interface GetFleetVehicleRequest {
    accessToken: string;
    vehicleIdOrExternalId: string;
}

export interface GetOrganizationAddressRequest {
    accessToken: string;
    addressId: number;
}

export interface GetOrganizationAddressesRequest {
    accessToken: string;
}

export interface GetOrganizationContactRequest {
    accessToken: string;
    contactId: number;
}

export interface GetVehicleHarshEventRequest {
    vehicleId: number;
    accessToken: string;
    timestamp: number;
}

export interface GetVehicleLocationsRequest {
    accessToken: string;
    vehicleId: number;
    startMs: number;
    endMs: number;
}

export interface GetVehicleSafetyScoreRequest {
    vehicleId: number;
    accessToken: string;
    startMs: number;
    endMs: number;
}

export interface GetVehicleStatsRequest {
    accessToken: string;
    startMs: number;
    endMs: number;
    series?: GetVehicleStatsSeriesEnum;
    tagIds?: string;
    startingAfter?: string;
    endingBefore?: string;
    limit?: number;
}

export interface GetVehiclesLocationsRequest {
    accessToken: string;
    startMs: number;
    endMs: number;
}

export interface ListContactsRequest {
    accessToken: string;
}

export interface ListFleetRequest {
    accessToken: string;
    groupParam: InlineObject10;
    startingAfter?: string;
    endingBefore?: string;
    limit?: number;
}

export interface PatchFleetVehicleRequest {
    accessToken: string;
    vehicleIdOrExternalId: string;
    data: InlineObject16;
}

export interface ReactivateDriverByIdRequest {
    accessToken: string;
    driverIdOrExternalId: string;
    reactivateDriverParam: InlineObject4;
}

export interface UpdateDispatchRouteByIdRequest {
    accessToken: string;
    routeId: number;
    updateDispatchRouteParams: DispatchRoute;
}

export interface UpdateOrganizationAddressRequest {
    accessToken: string;
    addressId: number;
    address: InlineObject1;
}

export interface UpdateVehiclesRequest {
    accessToken: string;
    vehicleUpdateParam: InlineObject14;
}

/**
 * no description
 */
export class FleetApi extends runtime.BaseAPI {

    /**
     * This method adds an address book entry to the specified group.
     * /fleet/add_address
     */
    async addFleetAddressRaw(requestParameters: AddFleetAddressRequest): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling addFleetAddress.');
        }

        if (requestParameters.addressParam === null || requestParameters.addressParam === undefined) {
            throw new runtime.RequiredError('addressParam','Required parameter requestParameters.addressParam was null or undefined when calling addFleetAddress.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/add_address`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject2ToJSON(requestParameters.addressParam),
        });

        return new runtime.VoidApiResponse(response);
    }

    /**
     * This method adds an address book entry to the specified group.
     * /fleet/add_address
     */
    async addFleetAddress(requestParameters: AddFleetAddressRequest): Promise<void> {
        await this.addFleetAddressRaw(requestParameters);
    }

    /**
     * Add one or more addresses to the organization
     * /addresses
     */
    async addOrganizationAddressesRaw(requestParameters: AddOrganizationAddressesRequest): Promise<runtime.ApiResponse<Array<Address>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling addOrganizationAddresses.');
        }

        if (requestParameters.addresses === null || requestParameters.addresses === undefined) {
            throw new runtime.RequiredError('addresses','Required parameter requestParameters.addresses was null or undefined when calling addOrganizationAddresses.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/addresses`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObjectToJSON(requestParameters.addresses),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(AddressFromJSON));
    }

    /**
     * Add one or more addresses to the organization
     * /addresses
     */
    async addOrganizationAddresses(requestParameters: AddOrganizationAddressesRequest): Promise<Array<Address>> {
        const response = await this.addOrganizationAddressesRaw(requestParameters);
        return await response.value();
    }

    /**
     * Create a new dispatch route.
     * /fleet/dispatch/routes
     */
    async createDispatchRouteRaw(requestParameters: CreateDispatchRouteRequest): Promise<runtime.ApiResponse<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new runtime.RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/dispatch/routes`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: DispatchRouteCreateToJSON(requestParameters.createDispatchRouteParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteFromJSON(jsonValue));
    }

    /**
     * Create a new dispatch route.
     * /fleet/dispatch/routes
     */
    async createDispatchRoute(requestParameters: CreateDispatchRouteRequest): Promise<DispatchRoute> {
        const response = await this.createDispatchRouteRaw(requestParameters);
        return await response.value();
    }

    /**
     * Create a new driver.
     * /fleet/drivers/create
     */
    async createDriverRaw(requestParameters: CreateDriverRequest): Promise<runtime.ApiResponse<Driver>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDriver.');
        }

        if (requestParameters.createDriverParam === null || requestParameters.createDriverParam === undefined) {
            throw new runtime.RequiredError('createDriverParam','Required parameter requestParameters.createDriverParam was null or undefined when calling createDriver.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/drivers/create`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: DriverForCreateToJSON(requestParameters.createDriverParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DriverFromJSON(jsonValue));
    }

    /**
     * Create a new driver.
     * /fleet/drivers/create
     */
    async createDriver(requestParameters: CreateDriverRequest): Promise<Driver> {
        const response = await this.createDriverRaw(requestParameters);
        return await response.value();
    }

    /**
     * Create a new dispatch route for the driver with driver_id.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    async createDriverDispatchRouteRaw(requestParameters: CreateDriverDispatchRouteRequest): Promise<runtime.ApiResponse<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDriverDispatchRoute.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new runtime.RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling createDriverDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new runtime.RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createDriverDispatchRoute.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/drivers/{driver_id}/dispatch/routes`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: DispatchRouteCreateToJSON(requestParameters.createDispatchRouteParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteFromJSON(jsonValue));
    }

    /**
     * Create a new dispatch route for the driver with driver_id.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    async createDriverDispatchRoute(requestParameters: CreateDriverDispatchRouteRequest): Promise<DispatchRoute> {
        const response = await this.createDriverDispatchRouteRaw(requestParameters);
        return await response.value();
    }

    /**
     * Create a driver document for the given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     */
    async createDriverDocumentRaw(requestParameters: CreateDriverDocumentRequest): Promise<runtime.ApiResponse<Document>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDriverDocument.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new runtime.RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling createDriverDocument.');
        }

        if (requestParameters.createDocumentParams === null || requestParameters.createDocumentParams === undefined) {
            throw new runtime.RequiredError('createDocumentParams','Required parameter requestParameters.createDocumentParams was null or undefined when calling createDriverDocument.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/drivers/{driver_id}/documents`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: DocumentCreateToJSON(requestParameters.createDocumentParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DocumentFromJSON(jsonValue));
    }

    /**
     * Create a driver document for the given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     */
    async createDriverDocument(requestParameters: CreateDriverDocumentRequest): Promise<Document> {
        const response = await this.createDriverDocumentRaw(requestParameters);
        return await response.value();
    }

    /**
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * /fleet/maintenance/dvirs
     */
    async createDvirRaw(requestParameters: CreateDvirRequest): Promise<runtime.ApiResponse<DvirBase>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDvir.');
        }

        if (requestParameters.createDvirParam === null || requestParameters.createDvirParam === undefined) {
            throw new runtime.RequiredError('createDvirParam','Required parameter requestParameters.createDvirParam was null or undefined when calling createDvir.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/maintenance/dvirs`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject12ToJSON(requestParameters.createDvirParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DvirBaseFromJSON(jsonValue));
    }

    /**
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * /fleet/maintenance/dvirs
     */
    async createDvir(requestParameters: CreateDvirRequest): Promise<DvirBase> {
        const response = await this.createDvirRaw(requestParameters);
        return await response.value();
    }

    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    async createVehicleDispatchRouteRaw(requestParameters: CreateVehicleDispatchRouteRequest): Promise<runtime.ApiResponse<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new runtime.RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new runtime.RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createVehicleDispatchRoute.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/vehicles/{vehicle_id}/dispatch/routes`.replace(`{${"vehicle_id"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: DispatchRouteCreateToJSON(requestParameters.createDispatchRouteParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteFromJSON(jsonValue));
    }

    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    async createVehicleDispatchRoute(requestParameters: CreateVehicleDispatchRouteRequest): Promise<DispatchRoute> {
        const response = await this.createVehicleDispatchRouteRaw(requestParameters);
        return await response.value();
    }

    /**
     * Deactivate a driver with the given id.
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async deactivateDriverRaw(requestParameters: DeactivateDriverRequest): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling deactivateDriver.');
        }

        if (requestParameters.driverIdOrExternalId === null || requestParameters.driverIdOrExternalId === undefined) {
            throw new runtime.RequiredError('driverIdOrExternalId','Required parameter requestParameters.driverIdOrExternalId was null or undefined when calling deactivateDriver.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/drivers/{driver_id_or_external_id}`.replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.driverIdOrExternalId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Deactivate a driver with the given id.
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async deactivateDriver(requestParameters: DeactivateDriverRequest): Promise<void> {
        await this.deactivateDriverRaw(requestParameters);
    }

    /**
     * Delete a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    async deleteDispatchRouteByIdRaw(requestParameters: DeleteDispatchRouteByIdRequest): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling deleteDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new runtime.RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling deleteDispatchRouteById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Delete a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    async deleteDispatchRouteById(requestParameters: DeleteDispatchRouteByIdRequest): Promise<void> {
        await this.deleteDispatchRouteByIdRaw(requestParameters);
    }

    /**
     * Delete an address.
     * /addresses/{addressId}
     */
    async deleteOrganizationAddressRaw(requestParameters: DeleteOrganizationAddressRequest): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling deleteOrganizationAddress.');
        }

        if (requestParameters.addressId === null || requestParameters.addressId === undefined) {
            throw new runtime.RequiredError('addressId','Required parameter requestParameters.addressId was null or undefined when calling deleteOrganizationAddress.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/addresses/{addressId}`.replace(`{${"addressId"}}`, encodeURIComponent(String(requestParameters.addressId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Delete an address.
     * /addresses/{addressId}
     */
    async deleteOrganizationAddress(requestParameters: DeleteOrganizationAddressRequest): Promise<void> {
        await this.deleteOrganizationAddressRaw(requestParameters);
    }

    /**
     * Fetch all of the dispatch routes for the group.
     * /fleet/dispatch/routes
     */
    async fetchAllDispatchRoutesRaw(requestParameters: FetchAllDispatchRoutesRequest): Promise<runtime.ApiResponse<Array<DispatchRoute>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling fetchAllDispatchRoutes.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        if (requestParameters.endTime !== undefined) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/dispatch/routes`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(DispatchRouteFromJSON));
    }

    /**
     * Fetch all of the dispatch routes for the group.
     * /fleet/dispatch/routes
     */
    async fetchAllDispatchRoutes(requestParameters: FetchAllDispatchRoutesRequest): Promise<Array<DispatchRoute>> {
        const response = await this.fetchAllDispatchRoutesRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * /fleet/dispatch/routes/job_updates
     */
    async fetchAllRouteJobUpdatesRaw(requestParameters: FetchAllRouteJobUpdatesRequest): Promise<runtime.ApiResponse<AllRouteJobUpdates>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        if (requestParameters.sequenceId !== undefined) {
            queryParameters['sequence_id'] = requestParameters.sequenceId;
        }

        if (requestParameters.include !== undefined) {
            queryParameters['include'] = requestParameters.include;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/dispatch/routes/job_updates`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => AllRouteJobUpdatesFromJSON(jsonValue));
    }

    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * /fleet/dispatch/routes/job_updates
     */
    async fetchAllRouteJobUpdates(requestParameters: FetchAllRouteJobUpdatesRequest): Promise<AllRouteJobUpdates> {
        const response = await this.fetchAllRouteJobUpdatesRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch current locations of all assets for the group.
     * /fleet/assets/locations
     */
    async getAllAssetCurrentLocationsRaw(requestParameters: GetAllAssetCurrentLocationsRequest): Promise<runtime.ApiResponse<InlineResponse2001>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAllAssetCurrentLocations.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/assets/locations`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => InlineResponse2001FromJSON(jsonValue));
    }

    /**
     * Fetch current locations of all assets for the group.
     * /fleet/assets/locations
     */
    async getAllAssetCurrentLocations(requestParameters: GetAllAssetCurrentLocationsRequest): Promise<InlineResponse2001> {
        const response = await this.getAllAssetCurrentLocationsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all of the assets for the group.
     * /fleet/assets
     */
    async getAllAssetsRaw(requestParameters: GetAllAssetsRequest): Promise<runtime.ApiResponse<InlineResponse200>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAllAssets.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/assets`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => InlineResponse200FromJSON(jsonValue));
    }

    /**
     * Fetch all of the assets for the group.
     * /fleet/assets
     */
    async getAllAssets(requestParameters: GetAllAssetsRequest): Promise<InlineResponse200> {
        const response = await this.getAllAssetsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all deactivated drivers for the group.
     * /fleet/drivers/inactive
     */
    async getAllDeactivatedDriversRaw(requestParameters: GetAllDeactivatedDriversRequest): Promise<runtime.ApiResponse<Array<Driver>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAllDeactivatedDrivers.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/drivers/inactive`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(DriverFromJSON));
    }

    /**
     * Fetch all deactivated drivers for the group.
     * /fleet/drivers/inactive
     */
    async getAllDeactivatedDrivers(requestParameters: GetAllDeactivatedDriversRequest): Promise<Array<Driver>> {
        const response = await this.getAllDeactivatedDriversRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch the historical locations for the asset.
     * /fleet/assets/{assetId:[0-9]+}/locations
     */
    async getAssetLocationRaw(requestParameters: GetAssetLocationRequest): Promise<runtime.ApiResponse<Array<any>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAssetLocation.');
        }

        if (requestParameters.assetId === null || requestParameters.assetId === undefined) {
            throw new runtime.RequiredError('assetId','Required parameter requestParameters.assetId was null or undefined when calling getAssetLocation.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new runtime.RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getAssetLocation.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new runtime.RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getAssetLocation.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/assets/{asset_id}/locations`.replace(`{${"asset_id"}}`, encodeURIComponent(String(requestParameters.assetId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse<any>(response);
    }

    /**
     * Fetch the historical locations for the asset.
     * /fleet/assets/{assetId:[0-9]+}/locations
     */
    async getAssetLocation(requestParameters: GetAssetLocationRequest): Promise<Array<any>> {
        const response = await this.getAssetLocationRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch the reefer-specific stats of an asset.
     * /fleet/assets/{assetId:[0-9]+}/reefer
     */
    async getAssetReeferRaw(requestParameters: GetAssetReeferRequest): Promise<runtime.ApiResponse<AssetReeferResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAssetReefer.');
        }

        if (requestParameters.assetId === null || requestParameters.assetId === undefined) {
            throw new runtime.RequiredError('assetId','Required parameter requestParameters.assetId was null or undefined when calling getAssetReefer.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new runtime.RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getAssetReefer.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new runtime.RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getAssetReefer.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/assets/{asset_id}/reefer`.replace(`{${"asset_id"}}`, encodeURIComponent(String(requestParameters.assetId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => AssetReeferResponseFromJSON(jsonValue));
    }

    /**
     * Fetch the reefer-specific stats of an asset.
     * /fleet/assets/{assetId:[0-9]+}/reefer
     */
    async getAssetReefer(requestParameters: GetAssetReeferRequest): Promise<AssetReeferResponse> {
        const response = await this.getAssetReeferRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch deactivated driver by id.
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async getDeactivatedDriverByIdRaw(requestParameters: GetDeactivatedDriverByIdRequest): Promise<runtime.ApiResponse<Driver>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDeactivatedDriverById.');
        }

        if (requestParameters.driverIdOrExternalId === null || requestParameters.driverIdOrExternalId === undefined) {
            throw new runtime.RequiredError('driverIdOrExternalId','Required parameter requestParameters.driverIdOrExternalId was null or undefined when calling getDeactivatedDriverById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/drivers/inactive/{driver_id_or_external_id}`.replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.driverIdOrExternalId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DriverFromJSON(jsonValue));
    }

    /**
     * Fetch deactivated driver by id.
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async getDeactivatedDriverById(requestParameters: GetDeactivatedDriverByIdRequest): Promise<Driver> {
        const response = await this.getDeactivatedDriverByIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch a dispatch route by id.
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     */
    async getDispatchRouteByIdRaw(requestParameters: GetDispatchRouteByIdRequest): Promise<runtime.ApiResponse<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new runtime.RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling getDispatchRouteById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteFromJSON(jsonValue));
    }

    /**
     * Fetch a dispatch route by id.
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     */
    async getDispatchRouteById(requestParameters: GetDispatchRouteByIdRequest): Promise<DispatchRoute> {
        const response = await this.getDispatchRouteByIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch the history of a dispatch route.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     */
    async getDispatchRouteHistoryRaw(requestParameters: GetDispatchRouteHistoryRequest): Promise<runtime.ApiResponse<DispatchRouteHistory>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRouteHistory.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new runtime.RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling getDispatchRouteHistory.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startTime !== undefined) {
            queryParameters['start_time'] = requestParameters.startTime;
        }

        if (requestParameters.endTime !== undefined) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/dispatch/routes/{route_id}/history`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteHistoryFromJSON(jsonValue));
    }

    /**
     * Fetch the history of a dispatch route.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     */
    async getDispatchRouteHistory(requestParameters: GetDispatchRouteHistoryRequest): Promise<DispatchRouteHistory> {
        const response = await this.getDispatchRouteHistoryRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all of the dispatch routes for a given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    async getDispatchRoutesByDriverIdRaw(requestParameters: GetDispatchRoutesByDriverIdRequest): Promise<runtime.ApiResponse<Array<DispatchRoute>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new runtime.RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endTime !== undefined) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/drivers/{driver_id}/dispatch/routes`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(DispatchRouteFromJSON));
    }

    /**
     * Fetch all of the dispatch routes for a given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    async getDispatchRoutesByDriverId(requestParameters: GetDispatchRoutesByDriverIdRequest): Promise<Array<DispatchRoute>> {
        const response = await this.getDispatchRoutesByDriverIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    async getDispatchRoutesByVehicleIdRaw(requestParameters: GetDispatchRoutesByVehicleIdRequest): Promise<runtime.ApiResponse<Array<DispatchRoute>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new runtime.RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endTime !== undefined) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/vehicles/{vehicle_id}/dispatch/routes`.replace(`{${"vehicle_id"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(DispatchRouteFromJSON));
    }

    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    async getDispatchRoutesByVehicleId(requestParameters: GetDispatchRoutesByVehicleIdRequest): Promise<Array<DispatchRoute>> {
        const response = await this.getDispatchRoutesByVehicleIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch driver by id.
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async getDriverByIdRaw(requestParameters: GetDriverByIdRequest): Promise<runtime.ApiResponse<Driver>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDriverById.');
        }

        if (requestParameters.driverIdOrExternalId === null || requestParameters.driverIdOrExternalId === undefined) {
            throw new runtime.RequiredError('driverIdOrExternalId','Required parameter requestParameters.driverIdOrExternalId was null or undefined when calling getDriverById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/drivers/{driver_id_or_external_id}`.replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.driverIdOrExternalId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DriverFromJSON(jsonValue));
    }

    /**
     * Fetch driver by id.
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async getDriverById(requestParameters: GetDriverByIdRequest): Promise<Driver> {
        const response = await this.getDriverByIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all of the document types.
     * /fleet/drivers/document_types
     */
    async getDriverDocumentTypesByOrgIdRaw(): Promise<runtime.ApiResponse<Array<DocumentType>>> {
        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/drivers/document_types`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(DocumentTypeFromJSON));
    }

    /**
     * Fetch all of the document types.
     * /fleet/drivers/document_types
     */
    async getDriverDocumentTypesByOrgId(): Promise<Array<DocumentType>> {
        const response = await this.getDriverDocumentTypesByOrgIdRaw();
        return await response.value();
    }

    /**
     * Fetch all of the documents.
     * /fleet/drivers/documents
     */
    async getDriverDocumentsByOrgIdRaw(requestParameters: GetDriverDocumentsByOrgIdRequest): Promise<runtime.ApiResponse<Array<Document>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDriverDocumentsByOrgId.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endMs !== undefined) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        if (requestParameters.durationMs !== undefined) {
            queryParameters['durationMs'] = requestParameters.durationMs;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/drivers/documents`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(DocumentFromJSON));
    }

    /**
     * Fetch all of the documents.
     * /fleet/drivers/documents
     */
    async getDriverDocumentsByOrgId(requestParameters: GetDriverDocumentsByOrgIdRequest): Promise<Array<Document>> {
        const response = await this.getDriverDocumentsByOrgIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch the safety score for the driver.
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     */
    async getDriverSafetyScoreRaw(requestParameters: GetDriverSafetyScoreRequest): Promise<runtime.ApiResponse<DriverSafetyScoreResponse>> {
        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new runtime.RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling getDriverSafetyScore.');
        }

        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDriverSafetyScore.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new runtime.RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getDriverSafetyScore.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new runtime.RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getDriverSafetyScore.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/drivers/{driverId}/safety/score`.replace(`{${"driverId"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DriverSafetyScoreResponseFromJSON(jsonValue));
    }

    /**
     * Fetch the safety score for the driver.
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     */
    async getDriverSafetyScore(requestParameters: GetDriverSafetyScoreRequest): Promise<DriverSafetyScoreResponse> {
        const response = await this.getDriverSafetyScoreRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get DVIRs for the org within provided time constraints
     * /fleet/maintenance/dvirs
     */
    async getDvirsRaw(requestParameters: GetDvirsRequest): Promise<runtime.ApiResponse<DvirListResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDvirs.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new runtime.RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getDvirs.');
        }

        if (requestParameters.durationMs === null || requestParameters.durationMs === undefined) {
            throw new runtime.RequiredError('durationMs','Required parameter requestParameters.durationMs was null or undefined when calling getDvirs.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endMs !== undefined) {
            queryParameters['end_ms'] = requestParameters.endMs;
        }

        if (requestParameters.durationMs !== undefined) {
            queryParameters['duration_ms'] = requestParameters.durationMs;
        }

        if (requestParameters.groupId !== undefined) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/maintenance/dvirs`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DvirListResponseFromJSON(jsonValue));
    }

    /**
     * Get DVIRs for the org within provided time constraints
     * /fleet/maintenance/dvirs
     */
    async getDvirs(requestParameters: GetDvirsRequest): Promise<DvirListResponse> {
        const response = await this.getDvirsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get all the drivers for the specified group.
     * /fleet/drivers
     */
    async getFleetDriversRaw(requestParameters: GetFleetDriversRequest): Promise<runtime.ApiResponse<DriversResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetDrivers.');
        }

        if (requestParameters.groupDriversParam === null || requestParameters.groupDriversParam === undefined) {
            throw new runtime.RequiredError('groupDriversParam','Required parameter requestParameters.groupDriversParam was null or undefined when calling getFleetDrivers.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/drivers`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject3ToJSON(requestParameters.groupDriversParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DriversResponseFromJSON(jsonValue));
    }

    /**
     * Get all the drivers for the specified group.
     * /fleet/drivers
     */
    async getFleetDrivers(requestParameters: GetFleetDriversRequest): Promise<DriversResponse> {
        const response = await this.getFleetDriversRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get summarized daily HOS charts for a specified driver.
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     */
    async getFleetDriversHosDailyLogsRaw(requestParameters: GetFleetDriversHosDailyLogsRequest): Promise<runtime.ApiResponse<DriverDailyLogResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new runtime.RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        if (requestParameters.hosLogsParam === null || requestParameters.hosLogsParam === undefined) {
            throw new runtime.RequiredError('hosLogsParam','Required parameter requestParameters.hosLogsParam was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/drivers/{driver_id}/hos_daily_logs`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject6ToJSON(requestParameters.hosLogsParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DriverDailyLogResponseFromJSON(jsonValue));
    }

    /**
     * Get summarized daily HOS charts for a specified driver.
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     */
    async getFleetDriversHosDailyLogs(requestParameters: GetFleetDriversHosDailyLogsRequest): Promise<DriverDailyLogResponse> {
        const response = await this.getFleetDriversHosDailyLogsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get the distance and time each driver in an organization has driven in a given time period.
     * /fleet/drivers/summary
     */
    async getFleetDriversSummaryRaw(requestParameters: GetFleetDriversSummaryRequest): Promise<runtime.ApiResponse<DriversSummaryResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetDriversSummary.');
        }

        if (requestParameters.driversSummaryParam === null || requestParameters.driversSummaryParam === undefined) {
            throw new runtime.RequiredError('driversSummaryParam','Required parameter requestParameters.driversSummaryParam was null or undefined when calling getFleetDriversSummary.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.snapToDayBounds !== undefined) {
            queryParameters['snap_to_day_bounds'] = requestParameters.snapToDayBounds;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/drivers/summary`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject5ToJSON(requestParameters.driversSummaryParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DriversSummaryResponseFromJSON(jsonValue));
    }

    /**
     * Get the distance and time each driver in an organization has driven in a given time period.
     * /fleet/drivers/summary
     */
    async getFleetDriversSummary(requestParameters: GetFleetDriversSummaryRequest): Promise<DriversSummaryResponse> {
        const response = await this.getFleetDriversSummaryRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * /fleet/hos_authentication_logs
     */
    async getFleetHosAuthenticationLogsRaw(requestParameters: GetFleetHosAuthenticationLogsRequest): Promise<runtime.ApiResponse<HosAuthenticationLogsResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetHosAuthenticationLogs.');
        }

        if (requestParameters.hosAuthenticationLogsParam === null || requestParameters.hosAuthenticationLogsParam === undefined) {
            throw new runtime.RequiredError('hosAuthenticationLogsParam','Required parameter requestParameters.hosAuthenticationLogsParam was null or undefined when calling getFleetHosAuthenticationLogs.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/hos_authentication_logs`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject7ToJSON(requestParameters.hosAuthenticationLogsParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => HosAuthenticationLogsResponseFromJSON(jsonValue));
    }

    /**
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * /fleet/hos_authentication_logs
     */
    async getFleetHosAuthenticationLogs(requestParameters: GetFleetHosAuthenticationLogsRequest): Promise<HosAuthenticationLogsResponse> {
        const response = await this.getFleetHosAuthenticationLogsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * /fleet/hos_logs
     */
    async getFleetHosLogsRaw(requestParameters: GetFleetHosLogsRequest): Promise<runtime.ApiResponse<HosLogsResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetHosLogs.');
        }

        if (requestParameters.hosLogsParam === null || requestParameters.hosLogsParam === undefined) {
            throw new runtime.RequiredError('hosLogsParam','Required parameter requestParameters.hosLogsParam was null or undefined when calling getFleetHosLogs.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/hos_logs`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject8ToJSON(requestParameters.hosLogsParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => HosLogsResponseFromJSON(jsonValue));
    }

    /**
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * /fleet/hos_logs
     */
    async getFleetHosLogs(requestParameters: GetFleetHosLogsRequest): Promise<HosLogsResponse> {
        const response = await this.getFleetHosLogsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get the current HOS status for all drivers in the group.
     * /fleet/hos_logs_summary
     */
    async getFleetHosLogsSummaryRaw(requestParameters: GetFleetHosLogsSummaryRequest): Promise<runtime.ApiResponse<HosLogsSummaryResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetHosLogsSummary.');
        }

        if (requestParameters.hosLogsParam === null || requestParameters.hosLogsParam === undefined) {
            throw new runtime.RequiredError('hosLogsParam','Required parameter requestParameters.hosLogsParam was null or undefined when calling getFleetHosLogsSummary.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/hos_logs_summary`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject9ToJSON(requestParameters.hosLogsParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => HosLogsSummaryResponseFromJSON(jsonValue));
    }

    /**
     * Get the current HOS status for all drivers in the group.
     * /fleet/hos_logs_summary
     */
    async getFleetHosLogsSummary(requestParameters: GetFleetHosLogsSummaryRequest): Promise<HosLogsSummaryResponse> {
        const response = await this.getFleetHosLogsSummaryRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * /fleet/locations
     */
    async getFleetLocationsRaw(requestParameters: GetFleetLocationsRequest): Promise<runtime.ApiResponse<InlineResponse2003>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetLocations.');
        }

        if (requestParameters.groupParam === null || requestParameters.groupParam === undefined) {
            throw new runtime.RequiredError('groupParam','Required parameter requestParameters.groupParam was null or undefined when calling getFleetLocations.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/locations`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject11ToJSON(requestParameters.groupParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => InlineResponse2003FromJSON(jsonValue));
    }

    /**
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * /fleet/locations
     */
    async getFleetLocations(requestParameters: GetFleetLocationsRequest): Promise<InlineResponse2003> {
        const response = await this.getFleetLocationsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get list of the vehicles with any engine faults or check light data.
     * /fleet/maintenance/list
     */
    async getFleetMaintenanceListRaw(requestParameters: GetFleetMaintenanceListRequest): Promise<runtime.ApiResponse<InlineResponse2004>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetMaintenanceList.');
        }

        if (requestParameters.groupParam === null || requestParameters.groupParam === undefined) {
            throw new runtime.RequiredError('groupParam','Required parameter requestParameters.groupParam was null or undefined when calling getFleetMaintenanceList.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/maintenance/list`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject13ToJSON(requestParameters.groupParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => InlineResponse2004FromJSON(jsonValue));
    }

    /**
     * Get list of the vehicles with any engine faults or check light data.
     * /fleet/maintenance/list
     */
    async getFleetMaintenanceList(requestParameters: GetFleetMaintenanceListRequest): Promise<InlineResponse2004> {
        const response = await this.getFleetMaintenanceListRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * /fleet/trips
     */
    async getFleetTripsRaw(requestParameters: GetFleetTripsRequest): Promise<runtime.ApiResponse<TripResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetTrips.');
        }

        if (requestParameters.tripsParam === null || requestParameters.tripsParam === undefined) {
            throw new runtime.RequiredError('tripsParam','Required parameter requestParameters.tripsParam was null or undefined when calling getFleetTrips.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/trips`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject15ToJSON(requestParameters.tripsParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => TripResponseFromJSON(jsonValue));
    }

    /**
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * /fleet/trips
     */
    async getFleetTrips(requestParameters: GetFleetTripsRequest): Promise<TripResponse> {
        const response = await this.getFleetTripsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Gets a specific vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async getFleetVehicleRaw(requestParameters: GetFleetVehicleRequest): Promise<runtime.ApiResponse<FleetVehicleResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetVehicle.');
        }

        if (requestParameters.vehicleIdOrExternalId === null || requestParameters.vehicleIdOrExternalId === undefined) {
            throw new runtime.RequiredError('vehicleIdOrExternalId','Required parameter requestParameters.vehicleIdOrExternalId was null or undefined when calling getFleetVehicle.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/vehicles/{vehicle_id_or_external_id}`.replace(`{${"vehicle_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.vehicleIdOrExternalId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => FleetVehicleResponseFromJSON(jsonValue));
    }

    /**
     * Gets a specific vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async getFleetVehicle(requestParameters: GetFleetVehicleRequest): Promise<FleetVehicleResponse> {
        const response = await this.getFleetVehicleRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch an address by its id.
     * /addresses/{addressId}
     */
    async getOrganizationAddressRaw(requestParameters: GetOrganizationAddressRequest): Promise<runtime.ApiResponse<Address>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getOrganizationAddress.');
        }

        if (requestParameters.addressId === null || requestParameters.addressId === undefined) {
            throw new runtime.RequiredError('addressId','Required parameter requestParameters.addressId was null or undefined when calling getOrganizationAddress.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/addresses/{addressId}`.replace(`{${"addressId"}}`, encodeURIComponent(String(requestParameters.addressId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => AddressFromJSON(jsonValue));
    }

    /**
     * Fetch an address by its id.
     * /addresses/{addressId}
     */
    async getOrganizationAddress(requestParameters: GetOrganizationAddressRequest): Promise<Address> {
        const response = await this.getOrganizationAddressRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * /addresses
     */
    async getOrganizationAddressesRaw(requestParameters: GetOrganizationAddressesRequest): Promise<runtime.ApiResponse<Array<Address>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getOrganizationAddresses.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/addresses`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(AddressFromJSON));
    }

    /**
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * /addresses
     */
    async getOrganizationAddresses(requestParameters: GetOrganizationAddressesRequest): Promise<Array<Address>> {
        const response = await this.getOrganizationAddressesRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch a contact by its id.
     * /contacts/{contact_id}
     */
    async getOrganizationContactRaw(requestParameters: GetOrganizationContactRequest): Promise<runtime.ApiResponse<Contact>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getOrganizationContact.');
        }

        if (requestParameters.contactId === null || requestParameters.contactId === undefined) {
            throw new runtime.RequiredError('contactId','Required parameter requestParameters.contactId was null or undefined when calling getOrganizationContact.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/contacts/{contact_id}`.replace(`{${"contact_id"}}`, encodeURIComponent(String(requestParameters.contactId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => ContactFromJSON(jsonValue));
    }

    /**
     * Fetch a contact by its id.
     * /contacts/{contact_id}
     */
    async getOrganizationContact(requestParameters: GetOrganizationContactRequest): Promise<Contact> {
        const response = await this.getOrganizationContactRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch harsh event details for a vehicle.
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     */
    async getVehicleHarshEventRaw(requestParameters: GetVehicleHarshEventRequest): Promise<runtime.ApiResponse<VehicleHarshEventResponse>> {
        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new runtime.RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling getVehicleHarshEvent.');
        }

        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getVehicleHarshEvent.');
        }

        if (requestParameters.timestamp === null || requestParameters.timestamp === undefined) {
            throw new runtime.RequiredError('timestamp','Required parameter requestParameters.timestamp was null or undefined when calling getVehicleHarshEvent.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.timestamp !== undefined) {
            queryParameters['timestamp'] = requestParameters.timestamp;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/vehicles/{vehicleId}/safety/harsh_event`.replace(`{${"vehicleId"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => VehicleHarshEventResponseFromJSON(jsonValue));
    }

    /**
     * Fetch harsh event details for a vehicle.
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     */
    async getVehicleHarshEvent(requestParameters: GetVehicleHarshEventRequest): Promise<VehicleHarshEventResponse> {
        const response = await this.getVehicleHarshEventRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     */
    async getVehicleLocationsRaw(requestParameters: GetVehicleLocationsRequest): Promise<runtime.ApiResponse<Array<FleetVehicleLocation>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getVehicleLocations.');
        }

        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new runtime.RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling getVehicleLocations.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new runtime.RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getVehicleLocations.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new runtime.RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getVehicleLocations.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/vehicles/{vehicle_id}/locations`.replace(`{${"vehicle_id"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(FleetVehicleLocationFromJSON));
    }

    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     */
    async getVehicleLocations(requestParameters: GetVehicleLocationsRequest): Promise<Array<FleetVehicleLocation>> {
        const response = await this.getVehicleLocationsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch the safety score for the vehicle.
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     */
    async getVehicleSafetyScoreRaw(requestParameters: GetVehicleSafetyScoreRequest): Promise<runtime.ApiResponse<VehicleSafetyScoreResponse>> {
        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new runtime.RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling getVehicleSafetyScore.');
        }

        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getVehicleSafetyScore.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new runtime.RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getVehicleSafetyScore.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new runtime.RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getVehicleSafetyScore.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/vehicles/{vehicleId}/safety/score`.replace(`{${"vehicleId"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => VehicleSafetyScoreResponseFromJSON(jsonValue));
    }

    /**
     * Fetch the safety score for the vehicle.
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     */
    async getVehicleSafetyScore(requestParameters: GetVehicleSafetyScoreRequest): Promise<VehicleSafetyScoreResponse> {
        const response = await this.getVehicleSafetyScoreRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * /fleet/vehicles/stats
     */
    async getVehicleStatsRaw(requestParameters: GetVehicleStatsRequest): Promise<runtime.ApiResponse<InlineResponse2005>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getVehicleStats.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new runtime.RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getVehicleStats.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new runtime.RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getVehicleStats.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        if (requestParameters.series !== undefined) {
            queryParameters['series'] = requestParameters.series;
        }

        if (requestParameters.tagIds !== undefined) {
            queryParameters['tagIds'] = requestParameters.tagIds;
        }

        if (requestParameters.startingAfter !== undefined) {
            queryParameters['startingAfter'] = requestParameters.startingAfter;
        }

        if (requestParameters.endingBefore !== undefined) {
            queryParameters['endingBefore'] = requestParameters.endingBefore;
        }

        if (requestParameters.limit !== undefined) {
            queryParameters['limit'] = requestParameters.limit;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/vehicles/stats`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => InlineResponse2005FromJSON(jsonValue));
    }

    /**
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * /fleet/vehicles/stats
     */
    async getVehicleStats(requestParameters: GetVehicleStatsRequest): Promise<InlineResponse2005> {
        const response = await this.getVehicleStatsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * /fleet/vehicles/locations
     */
    async getVehiclesLocationsRaw(requestParameters: GetVehiclesLocationsRequest): Promise<runtime.ApiResponse<Array<any>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getVehiclesLocations.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new runtime.RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getVehiclesLocations.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new runtime.RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getVehiclesLocations.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/vehicles/locations`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse<any>(response);
    }

    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * /fleet/vehicles/locations
     */
    async getVehiclesLocations(requestParameters: GetVehiclesLocationsRequest): Promise<Array<any>> {
        const response = await this.getVehiclesLocationsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all contacts for the organization.
     * /contacts
     */
    async listContactsRaw(requestParameters: ListContactsRequest): Promise<runtime.ApiResponse<Array<Contact>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling listContacts.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/contacts`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(ContactFromJSON));
    }

    /**
     * Fetch all contacts for the organization.
     * /contacts
     */
    async listContacts(requestParameters: ListContactsRequest): Promise<Array<Contact>> {
        const response = await this.listContactsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * /fleet/list
     */
    async listFleetRaw(requestParameters: ListFleetRequest): Promise<runtime.ApiResponse<InlineResponse2002>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling listFleet.');
        }

        if (requestParameters.groupParam === null || requestParameters.groupParam === undefined) {
            throw new runtime.RequiredError('groupParam','Required parameter requestParameters.groupParam was null or undefined when calling listFleet.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startingAfter !== undefined) {
            queryParameters['startingAfter'] = requestParameters.startingAfter;
        }

        if (requestParameters.endingBefore !== undefined) {
            queryParameters['endingBefore'] = requestParameters.endingBefore;
        }

        if (requestParameters.limit !== undefined) {
            queryParameters['limit'] = requestParameters.limit;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/list`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject10ToJSON(requestParameters.groupParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => InlineResponse2002FromJSON(jsonValue));
    }

    /**
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * /fleet/list
     */
    async listFleet(requestParameters: ListFleetRequest): Promise<InlineResponse2002> {
        const response = await this.listFleetRaw(requestParameters);
        return await response.value();
    }

    /**
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async patchFleetVehicleRaw(requestParameters: PatchFleetVehicleRequest): Promise<runtime.ApiResponse<FleetVehicleResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling patchFleetVehicle.');
        }

        if (requestParameters.vehicleIdOrExternalId === null || requestParameters.vehicleIdOrExternalId === undefined) {
            throw new runtime.RequiredError('vehicleIdOrExternalId','Required parameter requestParameters.vehicleIdOrExternalId was null or undefined when calling patchFleetVehicle.');
        }

        if (requestParameters.data === null || requestParameters.data === undefined) {
            throw new runtime.RequiredError('data','Required parameter requestParameters.data was null or undefined when calling patchFleetVehicle.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/vehicles/{vehicle_id_or_external_id}`.replace(`{${"vehicle_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.vehicleIdOrExternalId))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject16ToJSON(requestParameters.data),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => FleetVehicleResponseFromJSON(jsonValue));
    }

    /**
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async patchFleetVehicle(requestParameters: PatchFleetVehicleRequest): Promise<FleetVehicleResponse> {
        const response = await this.patchFleetVehicleRaw(requestParameters);
        return await response.value();
    }

    /**
     * Reactivate the inactive driver having id.
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async reactivateDriverByIdRaw(requestParameters: ReactivateDriverByIdRequest): Promise<runtime.ApiResponse<Driver>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling reactivateDriverById.');
        }

        if (requestParameters.driverIdOrExternalId === null || requestParameters.driverIdOrExternalId === undefined) {
            throw new runtime.RequiredError('driverIdOrExternalId','Required parameter requestParameters.driverIdOrExternalId was null or undefined when calling reactivateDriverById.');
        }

        if (requestParameters.reactivateDriverParam === null || requestParameters.reactivateDriverParam === undefined) {
            throw new runtime.RequiredError('reactivateDriverParam','Required parameter requestParameters.reactivateDriverParam was null or undefined when calling reactivateDriverById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/drivers/inactive/{driver_id_or_external_id}`.replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.driverIdOrExternalId))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject4ToJSON(requestParameters.reactivateDriverParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DriverFromJSON(jsonValue));
    }

    /**
     * Reactivate the inactive driver having id.
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    async reactivateDriverById(requestParameters: ReactivateDriverByIdRequest): Promise<Driver> {
        const response = await this.reactivateDriverByIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Update a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    async updateDispatchRouteByIdRaw(requestParameters: UpdateDispatchRouteByIdRequest): Promise<runtime.ApiResponse<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling updateDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new runtime.RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling updateDispatchRouteById.');
        }

        if (requestParameters.updateDispatchRouteParams === null || requestParameters.updateDispatchRouteParams === undefined) {
            throw new runtime.RequiredError('updateDispatchRouteParams','Required parameter requestParameters.updateDispatchRouteParams was null or undefined when calling updateDispatchRouteById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: DispatchRouteToJSON(requestParameters.updateDispatchRouteParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteFromJSON(jsonValue));
    }

    /**
     * Update a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    async updateDispatchRouteById(requestParameters: UpdateDispatchRouteByIdRequest): Promise<DispatchRoute> {
        const response = await this.updateDispatchRouteByIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * /addresses/{addressId}
     */
    async updateOrganizationAddressRaw(requestParameters: UpdateOrganizationAddressRequest): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling updateOrganizationAddress.');
        }

        if (requestParameters.addressId === null || requestParameters.addressId === undefined) {
            throw new runtime.RequiredError('addressId','Required parameter requestParameters.addressId was null or undefined when calling updateOrganizationAddress.');
        }

        if (requestParameters.address === null || requestParameters.address === undefined) {
            throw new runtime.RequiredError('address','Required parameter requestParameters.address was null or undefined when calling updateOrganizationAddress.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/addresses/{addressId}`.replace(`{${"addressId"}}`, encodeURIComponent(String(requestParameters.addressId))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject1ToJSON(requestParameters.address),
        });

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * /addresses/{addressId}
     */
    async updateOrganizationAddress(requestParameters: UpdateOrganizationAddressRequest): Promise<void> {
        await this.updateOrganizationAddressRaw(requestParameters);
    }

    /**
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * /fleet/set_data
     */
    async updateVehiclesRaw(requestParameters: UpdateVehiclesRequest): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling updateVehicles.');
        }

        if (requestParameters.vehicleUpdateParam === null || requestParameters.vehicleUpdateParam === undefined) {
            throw new runtime.RequiredError('vehicleUpdateParam','Required parameter requestParameters.vehicleUpdateParam was null or undefined when calling updateVehicles.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/set_data`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject14ToJSON(requestParameters.vehicleUpdateParam),
        });

        return new runtime.VoidApiResponse(response);
    }

    /**
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * /fleet/set_data
     */
    async updateVehicles(requestParameters: UpdateVehiclesRequest): Promise<void> {
        await this.updateVehiclesRaw(requestParameters);
    }

}

/**
    * @export
    * @enum {string}
    */
export enum GetVehicleStatsSeriesEnum {
    EngineState = 'engineState',
    AuxInput1 = 'auxInput1',
    AuxInput2 = 'auxInput2'
}
