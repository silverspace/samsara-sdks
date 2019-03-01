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

import { Observable } from 'rxjs';
import { BaseAPI, RequiredError, HttpHeaders, HttpQuery, COLLECTION_FORMATS } from '../runtime';
import {
    Address,
    AllRouteJobUpdates,
    AssetReeferResponse,
    Contact,
    DispatchRoute,
    DispatchRouteCreate,
    DispatchRouteHistory,
    Document,
    DocumentCreate,
    DocumentType,
    Driver,
    DriverDailyLogResponse,
    DriverForCreate,
    DriverSafetyScoreResponse,
    DriversResponse,
    DriversSummaryResponse,
    DvirBase,
    DvirListResponse,
    FleetVehicleLocation,
    FleetVehicleResponse,
    HosAuthenticationLogsResponse,
    HosLogsResponse,
    HosLogsSummaryResponse,
    InlineObject,
    InlineObject1,
    InlineObject10,
    InlineObject11,
    InlineObject12,
    InlineObject13,
    InlineObject14,
    InlineObject15,
    InlineObject16,
    InlineObject2,
    InlineObject3,
    InlineObject4,
    InlineObject5,
    InlineObject6,
    InlineObject7,
    InlineObject8,
    InlineObject9,
    InlineResponse200,
    InlineResponse2001,
    InlineResponse2002,
    InlineResponse2003,
    InlineResponse2004,
    InlineResponse2005,
    TripResponse,
    VehicleHarshEventResponse,
    VehicleSafetyScoreResponse,
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
export class FleetApi extends BaseAPI {

    /**
     * This method adds an address book entry to the specified group.
     * /fleet/add_address
     */
    addFleetAddressRaw(requestParameters: AddFleetAddressRequest): Observable<void> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling addFleetAddress.');
        }

        if (requestParameters.addressParam === null || requestParameters.addressParam === undefined) {
            throw new RequiredError('addressParam','Required parameter requestParameters.addressParam was null or undefined when calling addFleetAddress.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<void>({
            path: `/fleet/add_address`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.addressParam,
        });
    }

    /**
     * This method adds an address book entry to the specified group.
     * /fleet/add_address
     */
    addFleetAddress(requestParameters: AddFleetAddressRequest): Observable<void> {
        return this.addFleetAddressRaw(requestParameters);
    }

    /**
     * Add one or more addresses to the organization
     * /addresses
     */
    addOrganizationAddressesRaw(requestParameters: AddOrganizationAddressesRequest): Observable<Array<Address>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling addOrganizationAddresses.');
        }

        if (requestParameters.addresses === null || requestParameters.addresses === undefined) {
            throw new RequiredError('addresses','Required parameter requestParameters.addresses was null or undefined when calling addOrganizationAddresses.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<Array<Address>>({
            path: `/addresses`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.addresses,
        });
    }

    /**
     * Add one or more addresses to the organization
     * /addresses
     */
    addOrganizationAddresses(requestParameters: AddOrganizationAddressesRequest): Observable<Array<Address>> {
        return this.addOrganizationAddressesRaw(requestParameters);
    }

    /**
     * Create a new dispatch route.
     * /fleet/dispatch/routes
     */
    createDispatchRouteRaw(requestParameters: CreateDispatchRouteRequest): Observable<DispatchRoute> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DispatchRoute>({
            path: `/fleet/dispatch/routes`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.createDispatchRouteParams,
        });
    }

    /**
     * Create a new dispatch route.
     * /fleet/dispatch/routes
     */
    createDispatchRoute(requestParameters: CreateDispatchRouteRequest): Observable<DispatchRoute> {
        return this.createDispatchRouteRaw(requestParameters);
    }

    /**
     * Create a new driver.
     * /fleet/drivers/create
     */
    createDriverRaw(requestParameters: CreateDriverRequest): Observable<Driver> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDriver.');
        }

        if (requestParameters.createDriverParam === null || requestParameters.createDriverParam === undefined) {
            throw new RequiredError('createDriverParam','Required parameter requestParameters.createDriverParam was null or undefined when calling createDriver.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<Driver>({
            path: `/fleet/drivers/create`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.createDriverParam,
        });
    }

    /**
     * Create a new driver.
     * /fleet/drivers/create
     */
    createDriver(requestParameters: CreateDriverRequest): Observable<Driver> {
        return this.createDriverRaw(requestParameters);
    }

    /**
     * Create a new dispatch route for the driver with driver_id.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    createDriverDispatchRouteRaw(requestParameters: CreateDriverDispatchRouteRequest): Observable<DispatchRoute> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDriverDispatchRoute.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling createDriverDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createDriverDispatchRoute.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DispatchRoute>({
            path: `/fleet/drivers/{driver_id}/dispatch/routes`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.createDispatchRouteParams,
        });
    }

    /**
     * Create a new dispatch route for the driver with driver_id.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    createDriverDispatchRoute(requestParameters: CreateDriverDispatchRouteRequest): Observable<DispatchRoute> {
        return this.createDriverDispatchRouteRaw(requestParameters);
    }

    /**
     * Create a driver document for the given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     */
    createDriverDocumentRaw(requestParameters: CreateDriverDocumentRequest): Observable<Document> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDriverDocument.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling createDriverDocument.');
        }

        if (requestParameters.createDocumentParams === null || requestParameters.createDocumentParams === undefined) {
            throw new RequiredError('createDocumentParams','Required parameter requestParameters.createDocumentParams was null or undefined when calling createDriverDocument.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<Document>({
            path: `/fleet/drivers/{driver_id}/documents`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.createDocumentParams,
        });
    }

    /**
     * Create a driver document for the given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     */
    createDriverDocument(requestParameters: CreateDriverDocumentRequest): Observable<Document> {
        return this.createDriverDocumentRaw(requestParameters);
    }

    /**
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * /fleet/maintenance/dvirs
     */
    createDvirRaw(requestParameters: CreateDvirRequest): Observable<DvirBase> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDvir.');
        }

        if (requestParameters.createDvirParam === null || requestParameters.createDvirParam === undefined) {
            throw new RequiredError('createDvirParam','Required parameter requestParameters.createDvirParam was null or undefined when calling createDvir.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DvirBase>({
            path: `/fleet/maintenance/dvirs`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.createDvirParam,
        });
    }

    /**
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * /fleet/maintenance/dvirs
     */
    createDvir(requestParameters: CreateDvirRequest): Observable<DvirBase> {
        return this.createDvirRaw(requestParameters);
    }

    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    createVehicleDispatchRouteRaw(requestParameters: CreateVehicleDispatchRouteRequest): Observable<DispatchRoute> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createVehicleDispatchRoute.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DispatchRoute>({
            path: `/fleet/vehicles/{vehicle_id}/dispatch/routes`.replace(`{${"vehicle_id"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.createDispatchRouteParams,
        });
    }

    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    createVehicleDispatchRoute(requestParameters: CreateVehicleDispatchRouteRequest): Observable<DispatchRoute> {
        return this.createVehicleDispatchRouteRaw(requestParameters);
    }

    /**
     * Deactivate a driver with the given id.
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    deactivateDriverRaw(requestParameters: DeactivateDriverRequest): Observable<void> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling deactivateDriver.');
        }

        if (requestParameters.driverIdOrExternalId === null || requestParameters.driverIdOrExternalId === undefined) {
            throw new RequiredError('driverIdOrExternalId','Required parameter requestParameters.driverIdOrExternalId was null or undefined when calling deactivateDriver.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<void>({
            path: `/fleet/drivers/{driver_id_or_external_id}`.replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.driverIdOrExternalId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Deactivate a driver with the given id.
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    deactivateDriver(requestParameters: DeactivateDriverRequest): Observable<void> {
        return this.deactivateDriverRaw(requestParameters);
    }

    /**
     * Delete a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    deleteDispatchRouteByIdRaw(requestParameters: DeleteDispatchRouteByIdRequest): Observable<void> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling deleteDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling deleteDispatchRouteById.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<void>({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Delete a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    deleteDispatchRouteById(requestParameters: DeleteDispatchRouteByIdRequest): Observable<void> {
        return this.deleteDispatchRouteByIdRaw(requestParameters);
    }

    /**
     * Delete an address.
     * /addresses/{addressId}
     */
    deleteOrganizationAddressRaw(requestParameters: DeleteOrganizationAddressRequest): Observable<void> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling deleteOrganizationAddress.');
        }

        if (requestParameters.addressId === null || requestParameters.addressId === undefined) {
            throw new RequiredError('addressId','Required parameter requestParameters.addressId was null or undefined when calling deleteOrganizationAddress.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<void>({
            path: `/addresses/{addressId}`.replace(`{${"addressId"}}`, encodeURIComponent(String(requestParameters.addressId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Delete an address.
     * /addresses/{addressId}
     */
    deleteOrganizationAddress(requestParameters: DeleteOrganizationAddressRequest): Observable<void> {
        return this.deleteOrganizationAddressRaw(requestParameters);
    }

    /**
     * Fetch all of the dispatch routes for the group.
     * /fleet/dispatch/routes
     */
    fetchAllDispatchRoutesRaw(requestParameters: FetchAllDispatchRoutesRequest): Observable<Array<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling fetchAllDispatchRoutes.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined && requestParameters.groupId !== null) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        if (requestParameters.endTime !== undefined && requestParameters.endTime !== null) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined && requestParameters.duration !== null) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<DispatchRoute>>({
            path: `/fleet/dispatch/routes`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all of the dispatch routes for the group.
     * /fleet/dispatch/routes
     */
    fetchAllDispatchRoutes(requestParameters: FetchAllDispatchRoutesRequest): Observable<Array<DispatchRoute>> {
        return this.fetchAllDispatchRoutesRaw(requestParameters);
    }

    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * /fleet/dispatch/routes/job_updates
     */
    fetchAllRouteJobUpdatesRaw(requestParameters: FetchAllRouteJobUpdatesRequest): Observable<AllRouteJobUpdates> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined && requestParameters.groupId !== null) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        if (requestParameters.sequenceId !== undefined && requestParameters.sequenceId !== null) {
            queryParameters['sequence_id'] = requestParameters.sequenceId;
        }

        if (requestParameters.include !== undefined && requestParameters.include !== null) {
            queryParameters['include'] = requestParameters.include;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<AllRouteJobUpdates>({
            path: `/fleet/dispatch/routes/job_updates`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * /fleet/dispatch/routes/job_updates
     */
    fetchAllRouteJobUpdates(requestParameters: FetchAllRouteJobUpdatesRequest): Observable<AllRouteJobUpdates> {
        return this.fetchAllRouteJobUpdatesRaw(requestParameters);
    }

    /**
     * Fetch current locations of all assets for the group.
     * /fleet/assets/locations
     */
    getAllAssetCurrentLocationsRaw(requestParameters: GetAllAssetCurrentLocationsRequest): Observable<InlineResponse2001> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAllAssetCurrentLocations.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined && requestParameters.groupId !== null) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<InlineResponse2001>({
            path: `/fleet/assets/locations`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch current locations of all assets for the group.
     * /fleet/assets/locations
     */
    getAllAssetCurrentLocations(requestParameters: GetAllAssetCurrentLocationsRequest): Observable<InlineResponse2001> {
        return this.getAllAssetCurrentLocationsRaw(requestParameters);
    }

    /**
     * Fetch all of the assets for the group.
     * /fleet/assets
     */
    getAllAssetsRaw(requestParameters: GetAllAssetsRequest): Observable<InlineResponse200> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAllAssets.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined && requestParameters.groupId !== null) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<InlineResponse200>({
            path: `/fleet/assets`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all of the assets for the group.
     * /fleet/assets
     */
    getAllAssets(requestParameters: GetAllAssetsRequest): Observable<InlineResponse200> {
        return this.getAllAssetsRaw(requestParameters);
    }

    /**
     * Fetch all deactivated drivers for the group.
     * /fleet/drivers/inactive
     */
    getAllDeactivatedDriversRaw(requestParameters: GetAllDeactivatedDriversRequest): Observable<Array<Driver>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAllDeactivatedDrivers.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined && requestParameters.groupId !== null) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<Driver>>({
            path: `/fleet/drivers/inactive`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all deactivated drivers for the group.
     * /fleet/drivers/inactive
     */
    getAllDeactivatedDrivers(requestParameters: GetAllDeactivatedDriversRequest): Observable<Array<Driver>> {
        return this.getAllDeactivatedDriversRaw(requestParameters);
    }

    /**
     * Fetch the historical locations for the asset.
     * /fleet/assets/{assetId:[0-9]+}/locations
     */
    getAssetLocationRaw(requestParameters: GetAssetLocationRequest): Observable<Array<any>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAssetLocation.');
        }

        if (requestParameters.assetId === null || requestParameters.assetId === undefined) {
            throw new RequiredError('assetId','Required parameter requestParameters.assetId was null or undefined when calling getAssetLocation.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getAssetLocation.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getAssetLocation.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined && requestParameters.startMs !== null) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined && requestParameters.endMs !== null) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<any>>({
            path: `/fleet/assets/{asset_id}/locations`.replace(`{${"asset_id"}}`, encodeURIComponent(String(requestParameters.assetId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch the historical locations for the asset.
     * /fleet/assets/{assetId:[0-9]+}/locations
     */
    getAssetLocation(requestParameters: GetAssetLocationRequest): Observable<Array<any>> {
        return this.getAssetLocationRaw(requestParameters);
    }

    /**
     * Fetch the reefer-specific stats of an asset.
     * /fleet/assets/{assetId:[0-9]+}/reefer
     */
    getAssetReeferRaw(requestParameters: GetAssetReeferRequest): Observable<AssetReeferResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAssetReefer.');
        }

        if (requestParameters.assetId === null || requestParameters.assetId === undefined) {
            throw new RequiredError('assetId','Required parameter requestParameters.assetId was null or undefined when calling getAssetReefer.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getAssetReefer.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getAssetReefer.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined && requestParameters.startMs !== null) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined && requestParameters.endMs !== null) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<AssetReeferResponse>({
            path: `/fleet/assets/{asset_id}/reefer`.replace(`{${"asset_id"}}`, encodeURIComponent(String(requestParameters.assetId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch the reefer-specific stats of an asset.
     * /fleet/assets/{assetId:[0-9]+}/reefer
     */
    getAssetReefer(requestParameters: GetAssetReeferRequest): Observable<AssetReeferResponse> {
        return this.getAssetReeferRaw(requestParameters);
    }

    /**
     * Fetch deactivated driver by id.
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    getDeactivatedDriverByIdRaw(requestParameters: GetDeactivatedDriverByIdRequest): Observable<Driver> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDeactivatedDriverById.');
        }

        if (requestParameters.driverIdOrExternalId === null || requestParameters.driverIdOrExternalId === undefined) {
            throw new RequiredError('driverIdOrExternalId','Required parameter requestParameters.driverIdOrExternalId was null or undefined when calling getDeactivatedDriverById.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Driver>({
            path: `/fleet/drivers/inactive/{driver_id_or_external_id}`.replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.driverIdOrExternalId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch deactivated driver by id.
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    getDeactivatedDriverById(requestParameters: GetDeactivatedDriverByIdRequest): Observable<Driver> {
        return this.getDeactivatedDriverByIdRaw(requestParameters);
    }

    /**
     * Fetch a dispatch route by id.
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     */
    getDispatchRouteByIdRaw(requestParameters: GetDispatchRouteByIdRequest): Observable<DispatchRoute> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling getDispatchRouteById.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<DispatchRoute>({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch a dispatch route by id.
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     */
    getDispatchRouteById(requestParameters: GetDispatchRouteByIdRequest): Observable<DispatchRoute> {
        return this.getDispatchRouteByIdRaw(requestParameters);
    }

    /**
     * Fetch the history of a dispatch route.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     */
    getDispatchRouteHistoryRaw(requestParameters: GetDispatchRouteHistoryRequest): Observable<DispatchRouteHistory> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRouteHistory.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling getDispatchRouteHistory.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startTime !== undefined && requestParameters.startTime !== null) {
            queryParameters['start_time'] = requestParameters.startTime;
        }

        if (requestParameters.endTime !== undefined && requestParameters.endTime !== null) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<DispatchRouteHistory>({
            path: `/fleet/dispatch/routes/{route_id}/history`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch the history of a dispatch route.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     */
    getDispatchRouteHistory(requestParameters: GetDispatchRouteHistoryRequest): Observable<DispatchRouteHistory> {
        return this.getDispatchRouteHistoryRaw(requestParameters);
    }

    /**
     * Fetch all of the dispatch routes for a given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    getDispatchRoutesByDriverIdRaw(requestParameters: GetDispatchRoutesByDriverIdRequest): Observable<Array<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endTime !== undefined && requestParameters.endTime !== null) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined && requestParameters.duration !== null) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<DispatchRoute>>({
            path: `/fleet/drivers/{driver_id}/dispatch/routes`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all of the dispatch routes for a given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    getDispatchRoutesByDriverId(requestParameters: GetDispatchRoutesByDriverIdRequest): Observable<Array<DispatchRoute>> {
        return this.getDispatchRoutesByDriverIdRaw(requestParameters);
    }

    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    getDispatchRoutesByVehicleIdRaw(requestParameters: GetDispatchRoutesByVehicleIdRequest): Observable<Array<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endTime !== undefined && requestParameters.endTime !== null) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined && requestParameters.duration !== null) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<DispatchRoute>>({
            path: `/fleet/vehicles/{vehicle_id}/dispatch/routes`.replace(`{${"vehicle_id"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    getDispatchRoutesByVehicleId(requestParameters: GetDispatchRoutesByVehicleIdRequest): Observable<Array<DispatchRoute>> {
        return this.getDispatchRoutesByVehicleIdRaw(requestParameters);
    }

    /**
     * Fetch driver by id.
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    getDriverByIdRaw(requestParameters: GetDriverByIdRequest): Observable<Driver> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDriverById.');
        }

        if (requestParameters.driverIdOrExternalId === null || requestParameters.driverIdOrExternalId === undefined) {
            throw new RequiredError('driverIdOrExternalId','Required parameter requestParameters.driverIdOrExternalId was null or undefined when calling getDriverById.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Driver>({
            path: `/fleet/drivers/{driver_id_or_external_id}`.replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.driverIdOrExternalId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch driver by id.
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    getDriverById(requestParameters: GetDriverByIdRequest): Observable<Driver> {
        return this.getDriverByIdRaw(requestParameters);
    }

    /**
     * Fetch all of the document types.
     * /fleet/drivers/document_types
     */
    getDriverDocumentTypesByOrgIdRaw(): Observable<Array<DocumentType>> {
        const queryParameters: HttpQuery = {};

        const headerParameters: HttpHeaders = {};

        return this.request<Array<DocumentType>>({
            path: `/fleet/drivers/document_types`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all of the document types.
     * /fleet/drivers/document_types
     */
    getDriverDocumentTypesByOrgId(): Observable<Array<DocumentType>> {
        return this.getDriverDocumentTypesByOrgIdRaw();
    }

    /**
     * Fetch all of the documents.
     * /fleet/drivers/documents
     */
    getDriverDocumentsByOrgIdRaw(requestParameters: GetDriverDocumentsByOrgIdRequest): Observable<Array<Document>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDriverDocumentsByOrgId.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endMs !== undefined && requestParameters.endMs !== null) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        if (requestParameters.durationMs !== undefined && requestParameters.durationMs !== null) {
            queryParameters['durationMs'] = requestParameters.durationMs;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<Document>>({
            path: `/fleet/drivers/documents`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all of the documents.
     * /fleet/drivers/documents
     */
    getDriverDocumentsByOrgId(requestParameters: GetDriverDocumentsByOrgIdRequest): Observable<Array<Document>> {
        return this.getDriverDocumentsByOrgIdRaw(requestParameters);
    }

    /**
     * Fetch the safety score for the driver.
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     */
    getDriverSafetyScoreRaw(requestParameters: GetDriverSafetyScoreRequest): Observable<DriverSafetyScoreResponse> {
        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling getDriverSafetyScore.');
        }

        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDriverSafetyScore.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getDriverSafetyScore.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getDriverSafetyScore.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined && requestParameters.startMs !== null) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined && requestParameters.endMs !== null) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<DriverSafetyScoreResponse>({
            path: `/fleet/drivers/{driverId}/safety/score`.replace(`{${"driverId"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch the safety score for the driver.
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     */
    getDriverSafetyScore(requestParameters: GetDriverSafetyScoreRequest): Observable<DriverSafetyScoreResponse> {
        return this.getDriverSafetyScoreRaw(requestParameters);
    }

    /**
     * Get DVIRs for the org within provided time constraints
     * /fleet/maintenance/dvirs
     */
    getDvirsRaw(requestParameters: GetDvirsRequest): Observable<DvirListResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDvirs.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getDvirs.');
        }

        if (requestParameters.durationMs === null || requestParameters.durationMs === undefined) {
            throw new RequiredError('durationMs','Required parameter requestParameters.durationMs was null or undefined when calling getDvirs.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endMs !== undefined && requestParameters.endMs !== null) {
            queryParameters['end_ms'] = requestParameters.endMs;
        }

        if (requestParameters.durationMs !== undefined && requestParameters.durationMs !== null) {
            queryParameters['duration_ms'] = requestParameters.durationMs;
        }

        if (requestParameters.groupId !== undefined && requestParameters.groupId !== null) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<DvirListResponse>({
            path: `/fleet/maintenance/dvirs`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Get DVIRs for the org within provided time constraints
     * /fleet/maintenance/dvirs
     */
    getDvirs(requestParameters: GetDvirsRequest): Observable<DvirListResponse> {
        return this.getDvirsRaw(requestParameters);
    }

    /**
     * Get all the drivers for the specified group.
     * /fleet/drivers
     */
    getFleetDriversRaw(requestParameters: GetFleetDriversRequest): Observable<DriversResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetDrivers.');
        }

        if (requestParameters.groupDriversParam === null || requestParameters.groupDriversParam === undefined) {
            throw new RequiredError('groupDriversParam','Required parameter requestParameters.groupDriversParam was null or undefined when calling getFleetDrivers.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DriversResponse>({
            path: `/fleet/drivers`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.groupDriversParam,
        });
    }

    /**
     * Get all the drivers for the specified group.
     * /fleet/drivers
     */
    getFleetDrivers(requestParameters: GetFleetDriversRequest): Observable<DriversResponse> {
        return this.getFleetDriversRaw(requestParameters);
    }

    /**
     * Get summarized daily HOS charts for a specified driver.
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     */
    getFleetDriversHosDailyLogsRaw(requestParameters: GetFleetDriversHosDailyLogsRequest): Observable<DriverDailyLogResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        if (requestParameters.hosLogsParam === null || requestParameters.hosLogsParam === undefined) {
            throw new RequiredError('hosLogsParam','Required parameter requestParameters.hosLogsParam was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DriverDailyLogResponse>({
            path: `/fleet/drivers/{driver_id}/hos_daily_logs`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.hosLogsParam,
        });
    }

    /**
     * Get summarized daily HOS charts for a specified driver.
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     */
    getFleetDriversHosDailyLogs(requestParameters: GetFleetDriversHosDailyLogsRequest): Observable<DriverDailyLogResponse> {
        return this.getFleetDriversHosDailyLogsRaw(requestParameters);
    }

    /**
     * Get the distance and time each driver in an organization has driven in a given time period.
     * /fleet/drivers/summary
     */
    getFleetDriversSummaryRaw(requestParameters: GetFleetDriversSummaryRequest): Observable<DriversSummaryResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetDriversSummary.');
        }

        if (requestParameters.driversSummaryParam === null || requestParameters.driversSummaryParam === undefined) {
            throw new RequiredError('driversSummaryParam','Required parameter requestParameters.driversSummaryParam was null or undefined when calling getFleetDriversSummary.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.snapToDayBounds !== undefined && requestParameters.snapToDayBounds !== null) {
            queryParameters['snap_to_day_bounds'] = requestParameters.snapToDayBounds;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DriversSummaryResponse>({
            path: `/fleet/drivers/summary`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.driversSummaryParam,
        });
    }

    /**
     * Get the distance and time each driver in an organization has driven in a given time period.
     * /fleet/drivers/summary
     */
    getFleetDriversSummary(requestParameters: GetFleetDriversSummaryRequest): Observable<DriversSummaryResponse> {
        return this.getFleetDriversSummaryRaw(requestParameters);
    }

    /**
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * /fleet/hos_authentication_logs
     */
    getFleetHosAuthenticationLogsRaw(requestParameters: GetFleetHosAuthenticationLogsRequest): Observable<HosAuthenticationLogsResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetHosAuthenticationLogs.');
        }

        if (requestParameters.hosAuthenticationLogsParam === null || requestParameters.hosAuthenticationLogsParam === undefined) {
            throw new RequiredError('hosAuthenticationLogsParam','Required parameter requestParameters.hosAuthenticationLogsParam was null or undefined when calling getFleetHosAuthenticationLogs.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<HosAuthenticationLogsResponse>({
            path: `/fleet/hos_authentication_logs`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.hosAuthenticationLogsParam,
        });
    }

    /**
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * /fleet/hos_authentication_logs
     */
    getFleetHosAuthenticationLogs(requestParameters: GetFleetHosAuthenticationLogsRequest): Observable<HosAuthenticationLogsResponse> {
        return this.getFleetHosAuthenticationLogsRaw(requestParameters);
    }

    /**
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * /fleet/hos_logs
     */
    getFleetHosLogsRaw(requestParameters: GetFleetHosLogsRequest): Observable<HosLogsResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetHosLogs.');
        }

        if (requestParameters.hosLogsParam === null || requestParameters.hosLogsParam === undefined) {
            throw new RequiredError('hosLogsParam','Required parameter requestParameters.hosLogsParam was null or undefined when calling getFleetHosLogs.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<HosLogsResponse>({
            path: `/fleet/hos_logs`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.hosLogsParam,
        });
    }

    /**
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * /fleet/hos_logs
     */
    getFleetHosLogs(requestParameters: GetFleetHosLogsRequest): Observable<HosLogsResponse> {
        return this.getFleetHosLogsRaw(requestParameters);
    }

    /**
     * Get the current HOS status for all drivers in the group.
     * /fleet/hos_logs_summary
     */
    getFleetHosLogsSummaryRaw(requestParameters: GetFleetHosLogsSummaryRequest): Observable<HosLogsSummaryResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetHosLogsSummary.');
        }

        if (requestParameters.hosLogsParam === null || requestParameters.hosLogsParam === undefined) {
            throw new RequiredError('hosLogsParam','Required parameter requestParameters.hosLogsParam was null or undefined when calling getFleetHosLogsSummary.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<HosLogsSummaryResponse>({
            path: `/fleet/hos_logs_summary`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.hosLogsParam,
        });
    }

    /**
     * Get the current HOS status for all drivers in the group.
     * /fleet/hos_logs_summary
     */
    getFleetHosLogsSummary(requestParameters: GetFleetHosLogsSummaryRequest): Observable<HosLogsSummaryResponse> {
        return this.getFleetHosLogsSummaryRaw(requestParameters);
    }

    /**
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * /fleet/locations
     */
    getFleetLocationsRaw(requestParameters: GetFleetLocationsRequest): Observable<InlineResponse2003> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetLocations.');
        }

        if (requestParameters.groupParam === null || requestParameters.groupParam === undefined) {
            throw new RequiredError('groupParam','Required parameter requestParameters.groupParam was null or undefined when calling getFleetLocations.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<InlineResponse2003>({
            path: `/fleet/locations`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.groupParam,
        });
    }

    /**
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * /fleet/locations
     */
    getFleetLocations(requestParameters: GetFleetLocationsRequest): Observable<InlineResponse2003> {
        return this.getFleetLocationsRaw(requestParameters);
    }

    /**
     * Get list of the vehicles with any engine faults or check light data.
     * /fleet/maintenance/list
     */
    getFleetMaintenanceListRaw(requestParameters: GetFleetMaintenanceListRequest): Observable<InlineResponse2004> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetMaintenanceList.');
        }

        if (requestParameters.groupParam === null || requestParameters.groupParam === undefined) {
            throw new RequiredError('groupParam','Required parameter requestParameters.groupParam was null or undefined when calling getFleetMaintenanceList.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<InlineResponse2004>({
            path: `/fleet/maintenance/list`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.groupParam,
        });
    }

    /**
     * Get list of the vehicles with any engine faults or check light data.
     * /fleet/maintenance/list
     */
    getFleetMaintenanceList(requestParameters: GetFleetMaintenanceListRequest): Observable<InlineResponse2004> {
        return this.getFleetMaintenanceListRaw(requestParameters);
    }

    /**
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * /fleet/trips
     */
    getFleetTripsRaw(requestParameters: GetFleetTripsRequest): Observable<TripResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetTrips.');
        }

        if (requestParameters.tripsParam === null || requestParameters.tripsParam === undefined) {
            throw new RequiredError('tripsParam','Required parameter requestParameters.tripsParam was null or undefined when calling getFleetTrips.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<TripResponse>({
            path: `/fleet/trips`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.tripsParam,
        });
    }

    /**
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * /fleet/trips
     */
    getFleetTrips(requestParameters: GetFleetTripsRequest): Observable<TripResponse> {
        return this.getFleetTripsRaw(requestParameters);
    }

    /**
     * Gets a specific vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    getFleetVehicleRaw(requestParameters: GetFleetVehicleRequest): Observable<FleetVehicleResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getFleetVehicle.');
        }

        if (requestParameters.vehicleIdOrExternalId === null || requestParameters.vehicleIdOrExternalId === undefined) {
            throw new RequiredError('vehicleIdOrExternalId','Required parameter requestParameters.vehicleIdOrExternalId was null or undefined when calling getFleetVehicle.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<FleetVehicleResponse>({
            path: `/fleet/vehicles/{vehicle_id_or_external_id}`.replace(`{${"vehicle_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.vehicleIdOrExternalId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Gets a specific vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    getFleetVehicle(requestParameters: GetFleetVehicleRequest): Observable<FleetVehicleResponse> {
        return this.getFleetVehicleRaw(requestParameters);
    }

    /**
     * Fetch an address by its id.
     * /addresses/{addressId}
     */
    getOrganizationAddressRaw(requestParameters: GetOrganizationAddressRequest): Observable<Address> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getOrganizationAddress.');
        }

        if (requestParameters.addressId === null || requestParameters.addressId === undefined) {
            throw new RequiredError('addressId','Required parameter requestParameters.addressId was null or undefined when calling getOrganizationAddress.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Address>({
            path: `/addresses/{addressId}`.replace(`{${"addressId"}}`, encodeURIComponent(String(requestParameters.addressId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch an address by its id.
     * /addresses/{addressId}
     */
    getOrganizationAddress(requestParameters: GetOrganizationAddressRequest): Observable<Address> {
        return this.getOrganizationAddressRaw(requestParameters);
    }

    /**
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * /addresses
     */
    getOrganizationAddressesRaw(requestParameters: GetOrganizationAddressesRequest): Observable<Array<Address>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getOrganizationAddresses.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<Address>>({
            path: `/addresses`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * /addresses
     */
    getOrganizationAddresses(requestParameters: GetOrganizationAddressesRequest): Observable<Array<Address>> {
        return this.getOrganizationAddressesRaw(requestParameters);
    }

    /**
     * Fetch a contact by its id.
     * /contacts/{contact_id}
     */
    getOrganizationContactRaw(requestParameters: GetOrganizationContactRequest): Observable<Contact> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getOrganizationContact.');
        }

        if (requestParameters.contactId === null || requestParameters.contactId === undefined) {
            throw new RequiredError('contactId','Required parameter requestParameters.contactId was null or undefined when calling getOrganizationContact.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Contact>({
            path: `/contacts/{contact_id}`.replace(`{${"contact_id"}}`, encodeURIComponent(String(requestParameters.contactId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch a contact by its id.
     * /contacts/{contact_id}
     */
    getOrganizationContact(requestParameters: GetOrganizationContactRequest): Observable<Contact> {
        return this.getOrganizationContactRaw(requestParameters);
    }

    /**
     * Fetch harsh event details for a vehicle.
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     */
    getVehicleHarshEventRaw(requestParameters: GetVehicleHarshEventRequest): Observable<VehicleHarshEventResponse> {
        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling getVehicleHarshEvent.');
        }

        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getVehicleHarshEvent.');
        }

        if (requestParameters.timestamp === null || requestParameters.timestamp === undefined) {
            throw new RequiredError('timestamp','Required parameter requestParameters.timestamp was null or undefined when calling getVehicleHarshEvent.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.timestamp !== undefined && requestParameters.timestamp !== null) {
            queryParameters['timestamp'] = requestParameters.timestamp;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<VehicleHarshEventResponse>({
            path: `/fleet/vehicles/{vehicleId}/safety/harsh_event`.replace(`{${"vehicleId"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch harsh event details for a vehicle.
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     */
    getVehicleHarshEvent(requestParameters: GetVehicleHarshEventRequest): Observable<VehicleHarshEventResponse> {
        return this.getVehicleHarshEventRaw(requestParameters);
    }

    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     */
    getVehicleLocationsRaw(requestParameters: GetVehicleLocationsRequest): Observable<Array<FleetVehicleLocation>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getVehicleLocations.');
        }

        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling getVehicleLocations.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getVehicleLocations.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getVehicleLocations.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined && requestParameters.startMs !== null) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined && requestParameters.endMs !== null) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<FleetVehicleLocation>>({
            path: `/fleet/vehicles/{vehicle_id}/locations`.replace(`{${"vehicle_id"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     */
    getVehicleLocations(requestParameters: GetVehicleLocationsRequest): Observable<Array<FleetVehicleLocation>> {
        return this.getVehicleLocationsRaw(requestParameters);
    }

    /**
     * Fetch the safety score for the vehicle.
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     */
    getVehicleSafetyScoreRaw(requestParameters: GetVehicleSafetyScoreRequest): Observable<VehicleSafetyScoreResponse> {
        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling getVehicleSafetyScore.');
        }

        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getVehicleSafetyScore.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getVehicleSafetyScore.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getVehicleSafetyScore.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined && requestParameters.startMs !== null) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined && requestParameters.endMs !== null) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<VehicleSafetyScoreResponse>({
            path: `/fleet/vehicles/{vehicleId}/safety/score`.replace(`{${"vehicleId"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch the safety score for the vehicle.
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     */
    getVehicleSafetyScore(requestParameters: GetVehicleSafetyScoreRequest): Observable<VehicleSafetyScoreResponse> {
        return this.getVehicleSafetyScoreRaw(requestParameters);
    }

    /**
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * /fleet/vehicles/stats
     */
    getVehicleStatsRaw(requestParameters: GetVehicleStatsRequest): Observable<InlineResponse2005> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getVehicleStats.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getVehicleStats.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getVehicleStats.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined && requestParameters.startMs !== null) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined && requestParameters.endMs !== null) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        if (requestParameters.series !== undefined && requestParameters.series !== null) {
            queryParameters['series'] = requestParameters.series;
        }

        if (requestParameters.tagIds !== undefined && requestParameters.tagIds !== null) {
            queryParameters['tagIds'] = requestParameters.tagIds;
        }

        if (requestParameters.startingAfter !== undefined && requestParameters.startingAfter !== null) {
            queryParameters['startingAfter'] = requestParameters.startingAfter;
        }

        if (requestParameters.endingBefore !== undefined && requestParameters.endingBefore !== null) {
            queryParameters['endingBefore'] = requestParameters.endingBefore;
        }

        if (requestParameters.limit !== undefined && requestParameters.limit !== null) {
            queryParameters['limit'] = requestParameters.limit;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<InlineResponse2005>({
            path: `/fleet/vehicles/stats`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * /fleet/vehicles/stats
     */
    getVehicleStats(requestParameters: GetVehicleStatsRequest): Observable<InlineResponse2005> {
        return this.getVehicleStatsRaw(requestParameters);
    }

    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * /fleet/vehicles/locations
     */
    getVehiclesLocationsRaw(requestParameters: GetVehiclesLocationsRequest): Observable<Array<any>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getVehiclesLocations.');
        }

        if (requestParameters.startMs === null || requestParameters.startMs === undefined) {
            throw new RequiredError('startMs','Required parameter requestParameters.startMs was null or undefined when calling getVehiclesLocations.');
        }

        if (requestParameters.endMs === null || requestParameters.endMs === undefined) {
            throw new RequiredError('endMs','Required parameter requestParameters.endMs was null or undefined when calling getVehiclesLocations.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined && requestParameters.startMs !== null) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined && requestParameters.endMs !== null) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<any>>({
            path: `/fleet/vehicles/locations`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * /fleet/vehicles/locations
     */
    getVehiclesLocations(requestParameters: GetVehiclesLocationsRequest): Observable<Array<any>> {
        return this.getVehiclesLocationsRaw(requestParameters);
    }

    /**
     * Fetch all contacts for the organization.
     * /contacts
     */
    listContactsRaw(requestParameters: ListContactsRequest): Observable<Array<Contact>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling listContacts.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<Contact>>({
            path: `/contacts`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all contacts for the organization.
     * /contacts
     */
    listContacts(requestParameters: ListContactsRequest): Observable<Array<Contact>> {
        return this.listContactsRaw(requestParameters);
    }

    /**
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * /fleet/list
     */
    listFleetRaw(requestParameters: ListFleetRequest): Observable<InlineResponse2002> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling listFleet.');
        }

        if (requestParameters.groupParam === null || requestParameters.groupParam === undefined) {
            throw new RequiredError('groupParam','Required parameter requestParameters.groupParam was null or undefined when calling listFleet.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startingAfter !== undefined && requestParameters.startingAfter !== null) {
            queryParameters['startingAfter'] = requestParameters.startingAfter;
        }

        if (requestParameters.endingBefore !== undefined && requestParameters.endingBefore !== null) {
            queryParameters['endingBefore'] = requestParameters.endingBefore;
        }

        if (requestParameters.limit !== undefined && requestParameters.limit !== null) {
            queryParameters['limit'] = requestParameters.limit;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<InlineResponse2002>({
            path: `/fleet/list`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.groupParam,
        });
    }

    /**
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * /fleet/list
     */
    listFleet(requestParameters: ListFleetRequest): Observable<InlineResponse2002> {
        return this.listFleetRaw(requestParameters);
    }

    /**
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    patchFleetVehicleRaw(requestParameters: PatchFleetVehicleRequest): Observable<FleetVehicleResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling patchFleetVehicle.');
        }

        if (requestParameters.vehicleIdOrExternalId === null || requestParameters.vehicleIdOrExternalId === undefined) {
            throw new RequiredError('vehicleIdOrExternalId','Required parameter requestParameters.vehicleIdOrExternalId was null or undefined when calling patchFleetVehicle.');
        }

        if (requestParameters.data === null || requestParameters.data === undefined) {
            throw new RequiredError('data','Required parameter requestParameters.data was null or undefined when calling patchFleetVehicle.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<FleetVehicleResponse>({
            path: `/fleet/vehicles/{vehicle_id_or_external_id}`.replace(`{${"vehicle_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.vehicleIdOrExternalId))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.data,
        });
    }

    /**
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    patchFleetVehicle(requestParameters: PatchFleetVehicleRequest): Observable<FleetVehicleResponse> {
        return this.patchFleetVehicleRaw(requestParameters);
    }

    /**
     * Reactivate the inactive driver having id.
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    reactivateDriverByIdRaw(requestParameters: ReactivateDriverByIdRequest): Observable<Driver> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling reactivateDriverById.');
        }

        if (requestParameters.driverIdOrExternalId === null || requestParameters.driverIdOrExternalId === undefined) {
            throw new RequiredError('driverIdOrExternalId','Required parameter requestParameters.driverIdOrExternalId was null or undefined when calling reactivateDriverById.');
        }

        if (requestParameters.reactivateDriverParam === null || requestParameters.reactivateDriverParam === undefined) {
            throw new RequiredError('reactivateDriverParam','Required parameter requestParameters.reactivateDriverParam was null or undefined when calling reactivateDriverById.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<Driver>({
            path: `/fleet/drivers/inactive/{driver_id_or_external_id}`.replace(`{${"driver_id_or_external_id"}}`, encodeURIComponent(String(requestParameters.driverIdOrExternalId))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.reactivateDriverParam,
        });
    }

    /**
     * Reactivate the inactive driver having id.
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     */
    reactivateDriverById(requestParameters: ReactivateDriverByIdRequest): Observable<Driver> {
        return this.reactivateDriverByIdRaw(requestParameters);
    }

    /**
     * Update a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    updateDispatchRouteByIdRaw(requestParameters: UpdateDispatchRouteByIdRequest): Observable<DispatchRoute> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling updateDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling updateDispatchRouteById.');
        }

        if (requestParameters.updateDispatchRouteParams === null || requestParameters.updateDispatchRouteParams === undefined) {
            throw new RequiredError('updateDispatchRouteParams','Required parameter requestParameters.updateDispatchRouteParams was null or undefined when calling updateDispatchRouteById.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DispatchRoute>({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.updateDispatchRouteParams,
        });
    }

    /**
     * Update a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    updateDispatchRouteById(requestParameters: UpdateDispatchRouteByIdRequest): Observable<DispatchRoute> {
        return this.updateDispatchRouteByIdRaw(requestParameters);
    }

    /**
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * /addresses/{addressId}
     */
    updateOrganizationAddressRaw(requestParameters: UpdateOrganizationAddressRequest): Observable<void> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling updateOrganizationAddress.');
        }

        if (requestParameters.addressId === null || requestParameters.addressId === undefined) {
            throw new RequiredError('addressId','Required parameter requestParameters.addressId was null or undefined when calling updateOrganizationAddress.');
        }

        if (requestParameters.address === null || requestParameters.address === undefined) {
            throw new RequiredError('address','Required parameter requestParameters.address was null or undefined when calling updateOrganizationAddress.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<void>({
            path: `/addresses/{addressId}`.replace(`{${"addressId"}}`, encodeURIComponent(String(requestParameters.addressId))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.address,
        });
    }

    /**
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * /addresses/{addressId}
     */
    updateOrganizationAddress(requestParameters: UpdateOrganizationAddressRequest): Observable<void> {
        return this.updateOrganizationAddressRaw(requestParameters);
    }

    /**
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * /fleet/set_data
     */
    updateVehiclesRaw(requestParameters: UpdateVehiclesRequest): Observable<void> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling updateVehicles.');
        }

        if (requestParameters.vehicleUpdateParam === null || requestParameters.vehicleUpdateParam === undefined) {
            throw new RequiredError('vehicleUpdateParam','Required parameter requestParameters.vehicleUpdateParam was null or undefined when calling updateVehicles.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<void>({
            path: `/fleet/set_data`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.vehicleUpdateParam,
        });
    }

    /**
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * /fleet/set_data
     */
    updateVehicles(requestParameters: UpdateVehiclesRequest): Observable<void> {
        return this.updateVehiclesRaw(requestParameters);
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
