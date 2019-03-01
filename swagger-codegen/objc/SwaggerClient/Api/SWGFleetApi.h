#import <Foundation/Foundation.h>
#import "SWGAddress.h"
#import "SWGAddressParam.h"
#import "SWGAddresses.h"
#import "SWGAllRouteJobUpdates.h"
#import "SWGAssetLocationResponse.h"
#import "SWGAssetReeferResponse.h"
#import "SWGContact.h"
#import "SWGCreateDvirParam.h"
#import "SWGCurrentDriver.h"
#import "SWGData.h"
#import "SWGDispatchRoute.h"
#import "SWGDispatchRouteCreate.h"
#import "SWGDispatchRouteHistory.h"
#import "SWGDispatchRoutes.h"
#import "SWGDocument.h"
#import "SWGDocumentCreate.h"
#import "SWGDocumentTypes.h"
#import "SWGDocuments.h"
#import "SWGDriver.h"
#import "SWGDriverDailyLogResponse.h"
#import "SWGDriverForCreate.h"
#import "SWGDriverSafetyScoreResponse.h"
#import "SWGDriversResponse.h"
#import "SWGDriversSummaryParam.h"
#import "SWGDriversSummaryResponse.h"
#import "SWGDvirBase.h"
#import "SWGDvirListResponse.h"
#import "SWGErrorResponse.h"
#import "SWGFleetVehicleLocations.h"
#import "SWGFleetVehicleResponse.h"
#import "SWGFleetVehiclesLocations.h"
#import "SWGGroupDriversParam.h"
#import "SWGGroupParam.h"
#import "SWGHosAuthenticationLogsParam.h"
#import "SWGHosAuthenticationLogsResponse.h"
#import "SWGHosLogsParam.h"
#import "SWGHosLogsParam1.h"
#import "SWGHosLogsParam2.h"
#import "SWGHosLogsResponse.h"
#import "SWGHosLogsSummaryResponse.h"
#import "SWGInlineResponse200.h"
#import "SWGInlineResponse2001.h"
#import "SWGInlineResponse2002.h"
#import "SWGInlineResponse2003.h"
#import "SWGInlineResponse2004.h"
#import "SWGInlineResponse2005.h"
#import "SWGReactivateDriverParam.h"
#import "SWGTripResponse.h"
#import "SWGTripsParam.h"
#import "SWGVehicleHarshEventResponse.h"
#import "SWGVehicleSafetyScoreResponse.h"
#import "SWGVehicleUpdateParam.h"
#import "SWGApi.h"

/**
* Samsara API
* # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/



@interface SWGFleetApi: NSObject <SWGApi>

extern NSString* kSWGFleetApiErrorDomain;
extern NSInteger kSWGFleetApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// /fleet/add_address
/// This method adds an address book entry to the specified group.
///
/// @param accessToken Samsara API access token.
/// @param addressParam 
/// 
///  code:200 message:"Address was successfully added. No response body is returned.",
///  code:0 message:"Unexpected error."
///
/// @return void
-(NSURLSessionTask*) addFleetAddressWithAccessToken: (NSString*) accessToken
    addressParam: (SWGAddressParam*) addressParam
    completionHandler: (void (^)(NSError* error)) handler;


/// /addresses
/// Add one or more addresses to the organization
///
/// @param accessToken Samsara API access token.
/// @param addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon.
/// 
///  code:200 message:"List of added addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.",
///  code:0 message:"Unexpected error."
///
/// @return NSArray<SWGAddress>*
-(NSURLSessionTask*) addOrganizationAddressesWithAccessToken: (NSString*) accessToken
    addresses: (SWGAddresses*) addresses
    completionHandler: (void (^)(NSArray<SWGAddress>* output, NSError* error)) handler;


/// /fleet/dispatch/routes
/// Create a new dispatch route.
///
/// @param accessToken Samsara API access token.
/// @param createDispatchRouteParams 
/// 
///  code:200 message:"Created route object including the new route ID.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDispatchRoute*
-(NSURLSessionTask*) createDispatchRouteWithAccessToken: (NSString*) accessToken
    createDispatchRouteParams: (SWGDispatchRouteCreate*) createDispatchRouteParams
    completionHandler: (void (^)(SWGDispatchRoute* output, NSError* error)) handler;


/// /fleet/drivers/create
/// Create a new driver.
///
/// @param accessToken Samsara API access token.
/// @param createDriverParam Driver creation body
/// 
///  code:200 message:"Returns the successfully created the driver.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDriver*
-(NSURLSessionTask*) createDriverWithAccessToken: (NSString*) accessToken
    createDriverParam: (SWGDriverForCreate*) createDriverParam
    completionHandler: (void (^)(SWGDriver* output, NSError* error)) handler;


/// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
/// Create a new dispatch route for the driver with driver_id.
///
/// @param accessToken Samsara API access token.
/// @param driverId ID of the driver with the associated routes.
/// @param createDispatchRouteParams 
/// 
///  code:200 message:"Created route object including the new route ID.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDispatchRoute*
-(NSURLSessionTask*) createDriverDispatchRouteWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    createDispatchRouteParams: (SWGDispatchRouteCreate*) createDispatchRouteParams
    completionHandler: (void (^)(SWGDispatchRoute* output, NSError* error)) handler;


/// /fleet/drivers/{driver_id:[0-9]+}/documents
/// Create a driver document for the given driver.
///
/// @param accessToken Samsara API access token.
/// @param driverId ID of the driver for whom the document is created.
/// @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
/// 
///  code:200 message:"Returns the created document.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDocument*
-(NSURLSessionTask*) createDriverDocumentWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    createDocumentParams: (SWGDocumentCreate*) createDocumentParams
    completionHandler: (void (^)(SWGDocument* output, NSError* error)) handler;


/// /fleet/maintenance/dvirs
/// Create a new dvir, marking a vehicle or trailer safe or unsafe.
///
/// @param accessToken Samsara API access token.
/// @param createDvirParam DVIR creation body
/// 
///  code:200 message:"Newly created DVIR.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDvirBase*
-(NSURLSessionTask*) createDvirWithAccessToken: (NSString*) accessToken
    createDvirParam: (SWGCreateDvirParam*) createDvirParam
    completionHandler: (void (^)(SWGDvirBase* output, NSError* error)) handler;


/// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
/// Create a new dispatch route for the vehicle with vehicle_id.
///
/// @param accessToken Samsara API access token.
/// @param vehicleId ID of the vehicle with the associated routes.
/// @param createDispatchRouteParams 
/// 
///  code:200 message:"Created route object including the new route ID.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDispatchRoute*
-(NSURLSessionTask*) createVehicleDispatchRouteWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    createDispatchRouteParams: (SWGDispatchRouteCreate*) createDispatchRouteParams
    completionHandler: (void (^)(SWGDispatchRoute* output, NSError* error)) handler;


/// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Deactivate a driver with the given id.
///
/// @param accessToken Samsara API access token.
/// @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
/// 
///  code:200 message:"Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.",
///  code:0 message:"Unexpected error."
///
/// @return void
-(NSURLSessionTask*) deactivateDriverWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    completionHandler: (void (^)(NSError* error)) handler;


/// /fleet/dispatch/routes/{route_id:[0-9]+}/
/// Delete a dispatch route and its associated jobs.
///
/// @param accessToken Samsara API access token.
/// @param routeId ID of the dispatch route.
/// 
///  code:200 message:"Successfully deleted the dispatch route. No response body is returned.",
///  code:0 message:"Unexpected error."
///
/// @return void
-(NSURLSessionTask*) deleteDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    completionHandler: (void (^)(NSError* error)) handler;


/// /addresses/{addressId}
/// Delete an address.
///
/// @param accessToken Samsara API access token.
/// @param addressId ID of the address/geofence
/// 
///  code:200 message:"Address was successfully deleted. No response body is returned.",
///  code:0 message:"Unexpected error."
///
/// @return void
-(NSURLSessionTask*) deleteOrganizationAddressWithAccessToken: (NSString*) accessToken
    addressId: (NSNumber*) addressId
    completionHandler: (void (^)(NSError* error)) handler;


/// /fleet/dispatch/routes
/// Fetch all of the dispatch routes for the group.
///
/// @param accessToken Samsara API access token.
/// @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
/// @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
/// @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
/// 
///  code:200 message:"All dispatch route objects for the group.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDispatchRoutes*
-(NSURLSessionTask*) fetchAllDispatchRoutesWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
    completionHandler: (void (^)(SWGDispatchRoutes* output, NSError* error)) handler;


/// /fleet/dispatch/routes/job_updates
/// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
///
/// @param accessToken Samsara API access token.
/// @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
/// @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
/// @param include Optionally set include&#x3D;route to include route object in response payload. (optional)
/// 
///  code:200 message:"All job updates on routes.",
///  code:0 message:"Unexpected error."
///
/// @return SWGAllRouteJobUpdates*
-(NSURLSessionTask*) fetchAllRouteJobUpdatesWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    sequenceId: (NSString*) sequenceId
    include: (NSString*) include
    completionHandler: (void (^)(SWGAllRouteJobUpdates* output, NSError* error)) handler;


/// /fleet/assets/locations
/// Fetch current locations of all assets for the group.
///
/// @param accessToken Samsara API access token.
/// @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
/// 
///  code:200 message:"List of assets and their current locations.",
///  code:0 message:"Unexpected error."
///
/// @return SWGInlineResponse2001*
-(NSURLSessionTask*) getAllAssetCurrentLocationsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(SWGInlineResponse2001* output, NSError* error)) handler;


/// /fleet/assets
/// Fetch all of the assets for the group.
///
/// @param accessToken Samsara API access token.
/// @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
/// 
///  code:200 message:"List of assets.",
///  code:0 message:"Unexpected error."
///
/// @return SWGInlineResponse200*
-(NSURLSessionTask*) getAllAssetsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error)) handler;


/// /fleet/drivers/inactive
/// Fetch all deactivated drivers for the group.
///
/// @param accessToken Samsara API access token.
/// @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
/// 
///  code:200 message:"Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}",
///  code:0 message:"Unexpected error."
///
/// @return NSArray<SWGDriver>*
-(NSURLSessionTask*) getAllDeactivatedDriversWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(NSArray<SWGDriver>* output, NSError* error)) handler;


/// /fleet/assets/{assetId:[0-9]+}/locations
/// Fetch the historical locations for the asset.
///
/// @param accessToken Samsara API access token.
/// @param assetId ID of the asset
/// @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
/// @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
/// 
///  code:200 message:"Asset location details.",
///  code:0 message:"Unexpected error."
///
/// @return SWGAssetLocationResponse*
-(NSURLSessionTask*) getAssetLocationWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(SWGAssetLocationResponse* output, NSError* error)) handler;


/// /fleet/assets/{assetId:[0-9]+}/reefer
/// Fetch the reefer-specific stats of an asset.
///
/// @param accessToken Samsara API access token.
/// @param assetId ID of the asset
/// @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
/// @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
/// 
///  code:200 message:"Reefer-specific asset details.",
///  code:0 message:"Unexpected error."
///
/// @return SWGAssetReeferResponse*
-(NSURLSessionTask*) getAssetReeferWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(SWGAssetReeferResponse* output, NSError* error)) handler;


/// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Fetch deactivated driver by id.
///
/// @param accessToken Samsara API access token.
/// @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
/// 
///  code:200 message:"Returns the deactivated driver with the given driver_id.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDriver*
-(NSURLSessionTask*) getDeactivatedDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    completionHandler: (void (^)(SWGDriver* output, NSError* error)) handler;


/// /fleet/dispatch/routes/{route_id:[0-9]+}
/// Fetch a dispatch route by id.
///
/// @param accessToken Samsara API access token.
/// @param routeId ID of the dispatch route.
/// 
///  code:200 message:"The dispatch route corresponding to route_id.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDispatchRoute*
-(NSURLSessionTask*) getDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    completionHandler: (void (^)(SWGDispatchRoute* output, NSError* error)) handler;


/// /fleet/dispatch/routes/{route_id:[0-9]+}/history
/// Fetch the history of a dispatch route.
///
/// @param accessToken Samsara API access token.
/// @param routeId ID of the route with history.
/// @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
/// @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
/// 
///  code:200 message:"The historical route state changes between start_time and end_time.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDispatchRouteHistory*
-(NSURLSessionTask*) getDispatchRouteHistoryWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    startTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    completionHandler: (void (^)(SWGDispatchRouteHistory* output, NSError* error)) handler;


/// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
/// Fetch all of the dispatch routes for a given driver.
///
/// @param accessToken Samsara API access token.
/// @param driverId ID of the driver with the associated routes.
/// @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
/// @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
/// 
///  code:200 message:"Returns the dispatch routes for the given driver_id.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDispatchRoutes*
-(NSURLSessionTask*) getDispatchRoutesByDriverIdWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
    completionHandler: (void (^)(SWGDispatchRoutes* output, NSError* error)) handler;


/// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
/// Fetch all of the dispatch routes for a given vehicle.
///
/// @param accessToken Samsara API access token.
/// @param vehicleId ID of the vehicle with the associated routes.
/// @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
/// @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
/// 
///  code:200 message:"Returns all of the dispatch routes for the given vehicle_id.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDispatchRoutes*
-(NSURLSessionTask*) getDispatchRoutesByVehicleIdWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
    completionHandler: (void (^)(SWGDispatchRoutes* output, NSError* error)) handler;


/// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Fetch driver by id.
///
/// @param accessToken Samsara API access token.
/// @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
/// 
///  code:200 message:"Returns the driver for the given driver_id.",
///  code:0 message:"Unexpected error."
///
/// @return SWGCurrentDriver*
-(NSURLSessionTask*) getDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    completionHandler: (void (^)(SWGCurrentDriver* output, NSError* error)) handler;


/// /fleet/drivers/document_types
/// Fetch all of the document types.
///
/// 
///  code:200 message:"Returns all of the document types.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDocumentTypes*
-(NSURLSessionTask*) getDriverDocumentTypesByOrgIdWithCompletionHandler: 
    (void (^)(SWGDocumentTypes* output, NSError* error)) handler;


/// /fleet/drivers/documents
/// Fetch all of the documents.
///
/// @param accessToken Samsara API access token.
/// @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
/// @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
/// 
///  code:200 message:"Returns all of the documents.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDocuments*
-(NSURLSessionTask*) getDriverDocumentsByOrgIdWithAccessToken: (NSString*) accessToken
    endMs: (NSNumber*) endMs
    durationMs: (NSNumber*) durationMs
    completionHandler: (void (^)(SWGDocuments* output, NSError* error)) handler;


/// /fleet/drivers/{driverId:[0-9]+}/safety/score
/// Fetch the safety score for the driver.
///
/// @param driverId ID of the driver
/// @param accessToken Samsara API access token.
/// @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
/// @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
/// 
///  code:200 message:"Safety score details.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDriverSafetyScoreResponse*
-(NSURLSessionTask*) getDriverSafetyScoreWithDriverId: (NSNumber*) driverId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(SWGDriverSafetyScoreResponse* output, NSError* error)) handler;


/// /fleet/maintenance/dvirs
/// Get DVIRs for the org within provided time constraints
///
/// @param accessToken Samsara API access token.
/// @param endMs time in millis until the last dvir log.
/// @param durationMs time in millis which corresponds to the duration before the end_ms.
/// @param groupId Group ID to query. (optional)
/// 
///  code:200 message:"DVIRs for the specified duration.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDvirListResponse*
-(NSURLSessionTask*) getDvirsWithAccessToken: (NSString*) accessToken
    endMs: (NSNumber*) endMs
    durationMs: (NSNumber*) durationMs
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(SWGDvirListResponse* output, NSError* error)) handler;


/// /fleet/drivers
/// Get all the drivers for the specified group.
///
/// @param accessToken Samsara API access token.
/// @param groupDriversParam 
/// 
///  code:200 message:"All drivers in the group.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDriversResponse*
-(NSURLSessionTask*) getFleetDriversWithAccessToken: (NSString*) accessToken
    groupDriversParam: (SWGGroupDriversParam*) groupDriversParam
    completionHandler: (void (^)(SWGDriversResponse* output, NSError* error)) handler;


/// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
/// Get summarized daily HOS charts for a specified driver.
///
/// @param accessToken Samsara API access token.
/// @param driverId ID of the driver with HOS logs.
/// @param hosLogsParam 
/// 
///  code:200 message:"Distance traveled and time active for each driver in the organization over the specified time period.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDriverDailyLogResponse*
-(NSURLSessionTask*) getFleetDriversHosDailyLogsWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    hosLogsParam: (SWGHosLogsParam*) hosLogsParam
    completionHandler: (void (^)(SWGDriverDailyLogResponse* output, NSError* error)) handler;


/// /fleet/drivers/summary
/// Get the distance and time each driver in an organization has driven in a given time period.
///
/// @param accessToken Samsara API access token.
/// @param driversSummaryParam Org ID and time range to query.
/// @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
/// 
///  code:200 message:"Distance traveled and time active for each driver in the organization over the specified time period.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDriversSummaryResponse*
-(NSURLSessionTask*) getFleetDriversSummaryWithAccessToken: (NSString*) accessToken
    driversSummaryParam: (SWGDriversSummaryParam*) driversSummaryParam
    snapToDayBounds: (NSNumber*) snapToDayBounds
    completionHandler: (void (^)(SWGDriversSummaryResponse* output, NSError* error)) handler;


/// /fleet/hos_authentication_logs
/// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
///
/// @param accessToken Samsara API access token.
/// @param hosAuthenticationLogsParam 
/// 
///  code:200 message:"HOS authentication logs for the specified driver.",
///  code:0 message:"Unexpected error."
///
/// @return SWGHosAuthenticationLogsResponse*
-(NSURLSessionTask*) getFleetHosAuthenticationLogsWithAccessToken: (NSString*) accessToken
    hosAuthenticationLogsParam: (SWGHosAuthenticationLogsParam*) hosAuthenticationLogsParam
    completionHandler: (void (^)(SWGHosAuthenticationLogsResponse* output, NSError* error)) handler;


/// /fleet/hos_logs
/// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
///
/// @param accessToken Samsara API access token.
/// @param hosLogsParam 
/// 
///  code:200 message:"HOS logs for the specified driver.",
///  code:0 message:"Unexpected error."
///
/// @return SWGHosLogsResponse*
-(NSURLSessionTask*) getFleetHosLogsWithAccessToken: (NSString*) accessToken
    hosLogsParam: (SWGHosLogsParam1*) hosLogsParam
    completionHandler: (void (^)(SWGHosLogsResponse* output, NSError* error)) handler;


/// /fleet/hos_logs_summary
/// Get the current HOS status for all drivers in the group.
///
/// @param accessToken Samsara API access token.
/// @param hosLogsParam 
/// 
///  code:200 message:"HOS logs for the specified driver.",
///  code:0 message:"Unexpected error."
///
/// @return SWGHosLogsSummaryResponse*
-(NSURLSessionTask*) getFleetHosLogsSummaryWithAccessToken: (NSString*) accessToken
    hosLogsParam: (SWGHosLogsParam2*) hosLogsParam
    completionHandler: (void (^)(SWGHosLogsSummaryResponse* output, NSError* error)) handler;


/// /fleet/locations
/// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
///
/// @param accessToken Samsara API access token.
/// @param groupParam Group ID to query.
/// 
///  code:200 message:"List of vehicle objects containing their location and the time at which that location was logged.",
///  code:0 message:"Unexpected error."
///
/// @return SWGInlineResponse2003*
-(NSURLSessionTask*) getFleetLocationsWithAccessToken: (NSString*) accessToken
    groupParam: (SWGGroupParam*) groupParam
    completionHandler: (void (^)(SWGInlineResponse2003* output, NSError* error)) handler;


/// /fleet/maintenance/list
/// Get list of the vehicles with any engine faults or check light data.
///
/// @param accessToken Samsara API access token.
/// @param groupParam Group ID to query.
/// 
///  code:200 message:"List of vehicles and maintenance information about each.",
///  code:0 message:"Unexpected error."
///
/// @return SWGInlineResponse2004*
-(NSURLSessionTask*) getFleetMaintenanceListWithAccessToken: (NSString*) accessToken
    groupParam: (SWGGroupParam*) groupParam
    completionHandler: (void (^)(SWGInlineResponse2004* output, NSError* error)) handler;


/// /fleet/trips
/// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
///
/// @param accessToken Samsara API access token.
/// @param tripsParam Group ID, vehicle ID and time range to query.
/// 
///  code:200 message:"List of trips taken by the requested vehicle within the specified timeframe.",
///  code:0 message:"Unexpected error."
///
/// @return SWGTripResponse*
-(NSURLSessionTask*) getFleetTripsWithAccessToken: (NSString*) accessToken
    tripsParam: (SWGTripsParam*) tripsParam
    completionHandler: (void (^)(SWGTripResponse* output, NSError* error)) handler;


/// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Gets a specific vehicle.
///
/// @param accessToken Samsara API access token.
/// @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
/// 
///  code:200 message:"The specified vehicle.",
///  code:0 message:"Unexpected error."
///
/// @return SWGFleetVehicleResponse*
-(NSURLSessionTask*) getFleetVehicleWithAccessToken: (NSString*) accessToken
    vehicleIdOrExternalId: (NSString*) vehicleIdOrExternalId
    completionHandler: (void (^)(SWGFleetVehicleResponse* output, NSError* error)) handler;


/// /addresses/{addressId}
/// Fetch an address by its id.
///
/// @param accessToken Samsara API access token.
/// @param addressId ID of the address/geofence
/// 
///  code:200 message:"The address/geofence. The geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.",
///  code:0 message:"Unexpected error."
///
/// @return SWGAddress*
-(NSURLSessionTask*) getOrganizationAddressWithAccessToken: (NSString*) accessToken
    addressId: (NSNumber*) addressId
    completionHandler: (void (^)(SWGAddress* output, NSError* error)) handler;


/// /addresses
/// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
///
/// @param accessToken Samsara API access token.
/// 
///  code:200 message:"List of addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.",
///  code:0 message:"Unexpected error."
///
/// @return NSArray<SWGAddress>*
-(NSURLSessionTask*) getOrganizationAddressesWithAccessToken: (NSString*) accessToken
    completionHandler: (void (^)(NSArray<SWGAddress>* output, NSError* error)) handler;


/// /contacts/{contact_id}
/// Fetch a contact by its id.
///
/// @param accessToken Samsara API access token.
/// @param contactId ID of the contact
/// 
///  code:200 message:"The contact.",
///  code:0 message:"Unexpected error."
///
/// @return SWGContact*
-(NSURLSessionTask*) getOrganizationContactWithAccessToken: (NSString*) accessToken
    contactId: (NSNumber*) contactId
    completionHandler: (void (^)(SWGContact* output, NSError* error)) handler;


/// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
/// Fetch harsh event details for a vehicle.
///
/// @param vehicleId ID of the vehicle
/// @param accessToken Samsara API access token.
/// @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
/// 
///  code:200 message:"Harsh event details.",
///  code:0 message:"Unexpected error."
///
/// @return SWGVehicleHarshEventResponse*
-(NSURLSessionTask*) getVehicleHarshEventWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    timestamp: (NSNumber*) timestamp
    completionHandler: (void (^)(SWGVehicleHarshEventResponse* output, NSError* error)) handler;


/// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
/// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
///
/// @param accessToken Samsara API access token.
/// @param vehicleId ID of the vehicle with the associated routes.
/// @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
/// @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
/// 
///  code:200 message:"Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.",
///  code:0 message:"Unexpected error."
///
/// @return SWGFleetVehicleLocations*
-(NSURLSessionTask*) getVehicleLocationsWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(SWGFleetVehicleLocations* output, NSError* error)) handler;


/// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
/// Fetch the safety score for the vehicle.
///
/// @param vehicleId ID of the vehicle
/// @param accessToken Samsara API access token.
/// @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
/// @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
/// 
///  code:200 message:"Safety score details.",
///  code:0 message:"Unexpected error."
///
/// @return SWGVehicleSafetyScoreResponse*
-(NSURLSessionTask*) getVehicleSafetyScoreWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(SWGVehicleSafetyScoreResponse* output, NSError* error)) handler;


/// /fleet/vehicles/stats
/// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
///
/// @param accessToken Samsara API access token.
/// @param startMs Time in Unix epoch milliseconds for the start of the query.
/// @param endMs Time in Unix epoch milliseconds for the end of the query.
/// @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
/// @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
/// @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
/// @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
/// @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
/// 
///  code:200 message:"Returns engine state and/or aux input data for all vehicles in the group between a start/end time.",
///  code:0 message:"Unexpected error."
///
/// @return SWGInlineResponse2005*
-(NSURLSessionTask*) getVehicleStatsWithAccessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    series: (NSString*) series
    tagIds: (NSString*) tagIds
    startingAfter: (NSString*) startingAfter
    endingBefore: (NSString*) endingBefore
    limit: (NSNumber*) limit
    completionHandler: (void (^)(SWGInlineResponse2005* output, NSError* error)) handler;


/// /fleet/vehicles/locations
/// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
///
/// @param accessToken Samsara API access token.
/// @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
/// @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
/// 
///  code:200 message:"Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.",
///  code:0 message:"Unexpected error."
///
/// @return SWGFleetVehiclesLocations*
-(NSURLSessionTask*) getVehiclesLocationsWithAccessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(SWGFleetVehiclesLocations* output, NSError* error)) handler;


/// /contacts
/// Fetch all contacts for the organization.
///
/// @param accessToken Samsara API access token.
/// 
///  code:200 message:"List of contacts.",
///  code:0 message:"Unexpected error."
///
/// @return NSArray<SWGContact>*
-(NSURLSessionTask*) listContactsWithAccessToken: (NSString*) accessToken
    completionHandler: (void (^)(NSArray<SWGContact>* output, NSError* error)) handler;


/// /fleet/list
/// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
///
/// @param accessToken Samsara API access token.
/// @param groupParam Group ID to query.
/// @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
/// @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
/// @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
/// 
///  code:200 message:"List of vehicles and information about each.",
///  code:0 message:"Unexpected error."
///
/// @return SWGInlineResponse2002*
-(NSURLSessionTask*) listFleetWithAccessToken: (NSString*) accessToken
    groupParam: (SWGGroupParam*) groupParam
    startingAfter: (NSString*) startingAfter
    endingBefore: (NSString*) endingBefore
    limit: (NSNumber*) limit
    completionHandler: (void (^)(SWGInlineResponse2002* output, NSError* error)) handler;


/// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
///
/// @param accessToken Samsara API access token.
/// @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
/// @param data 
/// 
///  code:200 message:"The updated vehicle.",
///  code:0 message:"Unexpected error."
///
/// @return SWGFleetVehicleResponse*
-(NSURLSessionTask*) patchFleetVehicleWithAccessToken: (NSString*) accessToken
    vehicleIdOrExternalId: (NSString*) vehicleIdOrExternalId
    data: (SWGData*) data
    completionHandler: (void (^)(SWGFleetVehicleResponse* output, NSError* error)) handler;


/// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Reactivate the inactive driver having id.
///
/// @param accessToken Samsara API access token.
/// @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
/// @param reactivateDriverParam Driver reactivation body
/// 
///  code:200 message:"Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.",
///  code:0 message:"Unexpected error."
///
/// @return SWGCurrentDriver*
-(NSURLSessionTask*) reactivateDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    reactivateDriverParam: (SWGReactivateDriverParam*) reactivateDriverParam
    completionHandler: (void (^)(SWGCurrentDriver* output, NSError* error)) handler;


/// /fleet/dispatch/routes/{route_id:[0-9]+}/
/// Update a dispatch route and its associated jobs.
///
/// @param accessToken Samsara API access token.
/// @param routeId ID of the dispatch route.
/// @param updateDispatchRouteParams 
/// 
///  code:200 message:"Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.",
///  code:0 message:"Unexpected error."
///
/// @return SWGDispatchRoute*
-(NSURLSessionTask*) updateDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    updateDispatchRouteParams: (SWGDispatchRoute*) updateDispatchRouteParams
    completionHandler: (void (^)(SWGDispatchRoute* output, NSError* error)) handler;


/// /addresses/{addressId}
/// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
///
/// @param accessToken Samsara API access token.
/// @param address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly.
/// @param addressId ID of the address/geofence
/// 
///  code:200 message:"Address was successfully updated. No response body is returned.",
///  code:0 message:"Unexpected error."
///
/// @return void
-(NSURLSessionTask*) updateOrganizationAddressWithAccessToken: (NSString*) accessToken
    address: (SWGAddress*) address
    addressId: (NSNumber*) addressId
    completionHandler: (void (^)(NSError* error)) handler;


/// /fleet/set_data
/// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
///
/// @param accessToken Samsara API access token.
/// @param vehicleUpdateParam 
/// 
///  code:200 message:"Vehicles were successfully updated. No response body is returned.",
///  code:0 message:"Unexpected error."
///
/// @return void
-(NSURLSessionTask*) updateVehiclesWithAccessToken: (NSString*) accessToken
    vehicleUpdateParam: (SWGVehicleUpdateParam*) vehicleUpdateParam
    completionHandler: (void (^)(NSError* error)) handler;



@end
