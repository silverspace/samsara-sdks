#import <Foundation/Foundation.h>
#import "OAIAddress.h"
#import "OAIAllRouteJobUpdates.h"
#import "OAIAssetReeferResponse.h"
#import "OAIContact.h"
#import "OAIDispatchRoute.h"
#import "OAIDispatchRouteCreate.h"
#import "OAIDispatchRouteHistory.h"
#import "OAIDocument.h"
#import "OAIDocumentCreate.h"
#import "OAIDocumentType.h"
#import "OAIDriver.h"
#import "OAIDriverDailyLogResponse.h"
#import "OAIDriverForCreate.h"
#import "OAIDriverSafetyScoreResponse.h"
#import "OAIDriversResponse.h"
#import "OAIDriversSummaryResponse.h"
#import "OAIDvirBase.h"
#import "OAIDvirListResponse.h"
#import "OAIFleetVehicleLocation.h"
#import "OAIFleetVehicleResponse.h"
#import "OAIHosAuthenticationLogsResponse.h"
#import "OAIHosLogsResponse.h"
#import "OAIHosLogsSummaryResponse.h"
#import "OAIInlineObject.h"
#import "OAIInlineObject1.h"
#import "OAIInlineObject10.h"
#import "OAIInlineObject11.h"
#import "OAIInlineObject12.h"
#import "OAIInlineObject13.h"
#import "OAIInlineObject14.h"
#import "OAIInlineObject15.h"
#import "OAIInlineObject16.h"
#import "OAIInlineObject2.h"
#import "OAIInlineObject3.h"
#import "OAIInlineObject4.h"
#import "OAIInlineObject5.h"
#import "OAIInlineObject6.h"
#import "OAIInlineObject7.h"
#import "OAIInlineObject8.h"
#import "OAIInlineObject9.h"
#import "OAIInlineResponse200.h"
#import "OAIInlineResponse2001.h"
#import "OAIInlineResponse2002.h"
#import "OAIInlineResponse2003.h"
#import "OAIInlineResponse2004.h"
#import "OAIInlineResponse2005.h"
#import "OAITripResponse.h"
#import "OAIVehicleHarshEventResponse.h"
#import "OAIVehicleSafetyScoreResponse.h"
#import "OAIApi.h"

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



@interface OAIFleetApi: NSObject <OAIApi>

extern NSString* kOAIFleetApiErrorDomain;
extern NSInteger kOAIFleetApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

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
    addressParam: (OAIInlineObject2*) addressParam
    completionHandler: (void (^)(NSError* error)) handler;


/// /addresses
/// Add one or more addresses to the organization
///
/// @param accessToken Samsara API access token.
/// @param addresses 
/// 
///  code:200 message:"List of added addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.",
///  code:0 message:"Unexpected error."
///
/// @return NSArray<OAIAddress>*
-(NSURLSessionTask*) addOrganizationAddressesWithAccessToken: (NSString*) accessToken
    addresses: (OAIInlineObject*) addresses
    completionHandler: (void (^)(NSArray<OAIAddress>* output, NSError* error)) handler;


/// /fleet/dispatch/routes
/// Create a new dispatch route.
///
/// @param accessToken Samsara API access token.
/// @param createDispatchRouteParams 
/// 
///  code:200 message:"Created route object including the new route ID.",
///  code:0 message:"Unexpected error."
///
/// @return OAIDispatchRoute*
-(NSURLSessionTask*) createDispatchRouteWithAccessToken: (NSString*) accessToken
    createDispatchRouteParams: (OAIDispatchRouteCreate*) createDispatchRouteParams
    completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler;


/// /fleet/drivers/create
/// Create a new driver.
///
/// @param accessToken Samsara API access token.
/// @param createDriverParam Driver creation body
/// 
///  code:200 message:"Returns the successfully created the driver.",
///  code:0 message:"Unexpected error."
///
/// @return OAIDriver*
-(NSURLSessionTask*) createDriverWithAccessToken: (NSString*) accessToken
    createDriverParam: (OAIDriverForCreate*) createDriverParam
    completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler;


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
/// @return OAIDispatchRoute*
-(NSURLSessionTask*) createDriverDispatchRouteWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    createDispatchRouteParams: (OAIDispatchRouteCreate*) createDispatchRouteParams
    completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler;


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
/// @return OAIDocument*
-(NSURLSessionTask*) createDriverDocumentWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    createDocumentParams: (OAIDocumentCreate*) createDocumentParams
    completionHandler: (void (^)(OAIDocument* output, NSError* error)) handler;


/// /fleet/maintenance/dvirs
/// Create a new dvir, marking a vehicle or trailer safe or unsafe.
///
/// @param accessToken Samsara API access token.
/// @param createDvirParam 
/// 
///  code:200 message:"Newly created DVIR.",
///  code:0 message:"Unexpected error."
///
/// @return OAIDvirBase*
-(NSURLSessionTask*) createDvirWithAccessToken: (NSString*) accessToken
    createDvirParam: (OAIInlineObject12*) createDvirParam
    completionHandler: (void (^)(OAIDvirBase* output, NSError* error)) handler;


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
/// @return OAIDispatchRoute*
-(NSURLSessionTask*) createVehicleDispatchRouteWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    createDispatchRouteParams: (OAIDispatchRouteCreate*) createDispatchRouteParams
    completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler;


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
/// @return NSArray<OAIDispatchRoute>*
-(NSURLSessionTask*) fetchAllDispatchRoutesWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
    completionHandler: (void (^)(NSArray<OAIDispatchRoute>* output, NSError* error)) handler;


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
/// @return OAIAllRouteJobUpdates*
-(NSURLSessionTask*) fetchAllRouteJobUpdatesWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    sequenceId: (NSString*) sequenceId
    include: (NSString*) include
    completionHandler: (void (^)(OAIAllRouteJobUpdates* output, NSError* error)) handler;


/// /fleet/assets/locations
/// Fetch current locations of all assets for the group.
///
/// @param accessToken Samsara API access token.
/// @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
/// 
///  code:200 message:"List of assets and their current locations.",
///  code:0 message:"Unexpected error."
///
/// @return OAIInlineResponse2001*
-(NSURLSessionTask*) getAllAssetCurrentLocationsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(OAIInlineResponse2001* output, NSError* error)) handler;


/// /fleet/assets
/// Fetch all of the assets for the group.
///
/// @param accessToken Samsara API access token.
/// @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
/// 
///  code:200 message:"List of assets.",
///  code:0 message:"Unexpected error."
///
/// @return OAIInlineResponse200*
-(NSURLSessionTask*) getAllAssetsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(OAIInlineResponse200* output, NSError* error)) handler;


/// /fleet/drivers/inactive
/// Fetch all deactivated drivers for the group.
///
/// @param accessToken Samsara API access token.
/// @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
/// 
///  code:200 message:"Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}",
///  code:0 message:"Unexpected error."
///
/// @return NSArray<OAIDriver>*
-(NSURLSessionTask*) getAllDeactivatedDriversWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(NSArray<OAIDriver>* output, NSError* error)) handler;


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
/// @return NSArray<NSObject*>*
-(NSURLSessionTask*) getAssetLocationWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(NSArray<NSObject*>* output, NSError* error)) handler;


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
/// @return OAIAssetReeferResponse*
-(NSURLSessionTask*) getAssetReeferWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(OAIAssetReeferResponse* output, NSError* error)) handler;


/// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Fetch deactivated driver by id.
///
/// @param accessToken Samsara API access token.
/// @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
/// 
///  code:200 message:"Returns the deactivated driver with the given driver_id.",
///  code:0 message:"Unexpected error."
///
/// @return OAIDriver*
-(NSURLSessionTask*) getDeactivatedDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler;


/// /fleet/dispatch/routes/{route_id:[0-9]+}
/// Fetch a dispatch route by id.
///
/// @param accessToken Samsara API access token.
/// @param routeId ID of the dispatch route.
/// 
///  code:200 message:"The dispatch route corresponding to route_id.",
///  code:0 message:"Unexpected error."
///
/// @return OAIDispatchRoute*
-(NSURLSessionTask*) getDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler;


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
/// @return OAIDispatchRouteHistory*
-(NSURLSessionTask*) getDispatchRouteHistoryWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    startTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    completionHandler: (void (^)(OAIDispatchRouteHistory* output, NSError* error)) handler;


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
/// @return NSArray<OAIDispatchRoute>*
-(NSURLSessionTask*) getDispatchRoutesByDriverIdWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
    completionHandler: (void (^)(NSArray<OAIDispatchRoute>* output, NSError* error)) handler;


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
/// @return NSArray<OAIDispatchRoute>*
-(NSURLSessionTask*) getDispatchRoutesByVehicleIdWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
    completionHandler: (void (^)(NSArray<OAIDispatchRoute>* output, NSError* error)) handler;


/// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Fetch driver by id.
///
/// @param accessToken Samsara API access token.
/// @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
/// 
///  code:200 message:"Returns the driver for the given driver_id.",
///  code:0 message:"Unexpected error."
///
/// @return OAIDriver*
-(NSURLSessionTask*) getDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler;


/// /fleet/drivers/document_types
/// Fetch all of the document types.
///
/// 
///  code:200 message:"Returns all of the document types.",
///  code:0 message:"Unexpected error."
///
/// @return NSArray<OAIDocumentType>*
-(NSURLSessionTask*) getDriverDocumentTypesByOrgIdWithCompletionHandler: 
    (void (^)(NSArray<OAIDocumentType>* output, NSError* error)) handler;


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
/// @return NSArray<OAIDocument>*
-(NSURLSessionTask*) getDriverDocumentsByOrgIdWithAccessToken: (NSString*) accessToken
    endMs: (NSNumber*) endMs
    durationMs: (NSNumber*) durationMs
    completionHandler: (void (^)(NSArray<OAIDocument>* output, NSError* error)) handler;


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
/// @return OAIDriverSafetyScoreResponse*
-(NSURLSessionTask*) getDriverSafetyScoreWithDriverId: (NSNumber*) driverId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(OAIDriverSafetyScoreResponse* output, NSError* error)) handler;


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
/// @return OAIDvirListResponse*
-(NSURLSessionTask*) getDvirsWithAccessToken: (NSString*) accessToken
    endMs: (NSNumber*) endMs
    durationMs: (NSNumber*) durationMs
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(OAIDvirListResponse* output, NSError* error)) handler;


/// /fleet/drivers
/// Get all the drivers for the specified group.
///
/// @param accessToken Samsara API access token.
/// @param groupDriversParam 
/// 
///  code:200 message:"All drivers in the group.",
///  code:0 message:"Unexpected error."
///
/// @return OAIDriversResponse*
-(NSURLSessionTask*) getFleetDriversWithAccessToken: (NSString*) accessToken
    groupDriversParam: (OAIInlineObject3*) groupDriversParam
    completionHandler: (void (^)(OAIDriversResponse* output, NSError* error)) handler;


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
/// @return OAIDriverDailyLogResponse*
-(NSURLSessionTask*) getFleetDriversHosDailyLogsWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    hosLogsParam: (OAIInlineObject6*) hosLogsParam
    completionHandler: (void (^)(OAIDriverDailyLogResponse* output, NSError* error)) handler;


/// /fleet/drivers/summary
/// Get the distance and time each driver in an organization has driven in a given time period.
///
/// @param accessToken Samsara API access token.
/// @param driversSummaryParam 
/// @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
/// 
///  code:200 message:"Distance traveled and time active for each driver in the organization over the specified time period.",
///  code:0 message:"Unexpected error."
///
/// @return OAIDriversSummaryResponse*
-(NSURLSessionTask*) getFleetDriversSummaryWithAccessToken: (NSString*) accessToken
    driversSummaryParam: (OAIInlineObject5*) driversSummaryParam
    snapToDayBounds: (NSNumber*) snapToDayBounds
    completionHandler: (void (^)(OAIDriversSummaryResponse* output, NSError* error)) handler;


/// /fleet/hos_authentication_logs
/// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
///
/// @param accessToken Samsara API access token.
/// @param hosAuthenticationLogsParam 
/// 
///  code:200 message:"HOS authentication logs for the specified driver.",
///  code:0 message:"Unexpected error."
///
/// @return OAIHosAuthenticationLogsResponse*
-(NSURLSessionTask*) getFleetHosAuthenticationLogsWithAccessToken: (NSString*) accessToken
    hosAuthenticationLogsParam: (OAIInlineObject7*) hosAuthenticationLogsParam
    completionHandler: (void (^)(OAIHosAuthenticationLogsResponse* output, NSError* error)) handler;


/// /fleet/hos_logs
/// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
///
/// @param accessToken Samsara API access token.
/// @param hosLogsParam 
/// 
///  code:200 message:"HOS logs for the specified driver.",
///  code:0 message:"Unexpected error."
///
/// @return OAIHosLogsResponse*
-(NSURLSessionTask*) getFleetHosLogsWithAccessToken: (NSString*) accessToken
    hosLogsParam: (OAIInlineObject8*) hosLogsParam
    completionHandler: (void (^)(OAIHosLogsResponse* output, NSError* error)) handler;


/// /fleet/hos_logs_summary
/// Get the current HOS status for all drivers in the group.
///
/// @param accessToken Samsara API access token.
/// @param hosLogsParam 
/// 
///  code:200 message:"HOS logs for the specified driver.",
///  code:0 message:"Unexpected error."
///
/// @return OAIHosLogsSummaryResponse*
-(NSURLSessionTask*) getFleetHosLogsSummaryWithAccessToken: (NSString*) accessToken
    hosLogsParam: (OAIInlineObject9*) hosLogsParam
    completionHandler: (void (^)(OAIHosLogsSummaryResponse* output, NSError* error)) handler;


/// /fleet/locations
/// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
///
/// @param accessToken Samsara API access token.
/// @param groupParam 
/// 
///  code:200 message:"List of vehicle objects containing their location and the time at which that location was logged.",
///  code:0 message:"Unexpected error."
///
/// @return OAIInlineResponse2003*
-(NSURLSessionTask*) getFleetLocationsWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject11*) groupParam
    completionHandler: (void (^)(OAIInlineResponse2003* output, NSError* error)) handler;


/// /fleet/maintenance/list
/// Get list of the vehicles with any engine faults or check light data.
///
/// @param accessToken Samsara API access token.
/// @param groupParam 
/// 
///  code:200 message:"List of vehicles and maintenance information about each.",
///  code:0 message:"Unexpected error."
///
/// @return OAIInlineResponse2004*
-(NSURLSessionTask*) getFleetMaintenanceListWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject13*) groupParam
    completionHandler: (void (^)(OAIInlineResponse2004* output, NSError* error)) handler;


/// /fleet/trips
/// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
///
/// @param accessToken Samsara API access token.
/// @param tripsParam 
/// 
///  code:200 message:"List of trips taken by the requested vehicle within the specified timeframe.",
///  code:0 message:"Unexpected error."
///
/// @return OAITripResponse*
-(NSURLSessionTask*) getFleetTripsWithAccessToken: (NSString*) accessToken
    tripsParam: (OAIInlineObject15*) tripsParam
    completionHandler: (void (^)(OAITripResponse* output, NSError* error)) handler;


/// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Gets a specific vehicle.
///
/// @param accessToken Samsara API access token.
/// @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
/// 
///  code:200 message:"The specified vehicle.",
///  code:0 message:"Unexpected error."
///
/// @return OAIFleetVehicleResponse*
-(NSURLSessionTask*) getFleetVehicleWithAccessToken: (NSString*) accessToken
    vehicleIdOrExternalId: (NSString*) vehicleIdOrExternalId
    completionHandler: (void (^)(OAIFleetVehicleResponse* output, NSError* error)) handler;


/// /addresses/{addressId}
/// Fetch an address by its id.
///
/// @param accessToken Samsara API access token.
/// @param addressId ID of the address/geofence
/// 
///  code:200 message:"The address/geofence. The geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.",
///  code:0 message:"Unexpected error."
///
/// @return OAIAddress*
-(NSURLSessionTask*) getOrganizationAddressWithAccessToken: (NSString*) accessToken
    addressId: (NSNumber*) addressId
    completionHandler: (void (^)(OAIAddress* output, NSError* error)) handler;


/// /addresses
/// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
///
/// @param accessToken Samsara API access token.
/// 
///  code:200 message:"List of addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.",
///  code:0 message:"Unexpected error."
///
/// @return NSArray<OAIAddress>*
-(NSURLSessionTask*) getOrganizationAddressesWithAccessToken: (NSString*) accessToken
    completionHandler: (void (^)(NSArray<OAIAddress>* output, NSError* error)) handler;


/// /contacts/{contact_id}
/// Fetch a contact by its id.
///
/// @param accessToken Samsara API access token.
/// @param contactId ID of the contact
/// 
///  code:200 message:"The contact.",
///  code:0 message:"Unexpected error."
///
/// @return OAIContact*
-(NSURLSessionTask*) getOrganizationContactWithAccessToken: (NSString*) accessToken
    contactId: (NSNumber*) contactId
    completionHandler: (void (^)(OAIContact* output, NSError* error)) handler;


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
/// @return OAIVehicleHarshEventResponse*
-(NSURLSessionTask*) getVehicleHarshEventWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    timestamp: (NSNumber*) timestamp
    completionHandler: (void (^)(OAIVehicleHarshEventResponse* output, NSError* error)) handler;


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
/// @return NSArray<OAIFleetVehicleLocation>*
-(NSURLSessionTask*) getVehicleLocationsWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(NSArray<OAIFleetVehicleLocation>* output, NSError* error)) handler;


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
/// @return OAIVehicleSafetyScoreResponse*
-(NSURLSessionTask*) getVehicleSafetyScoreWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(OAIVehicleSafetyScoreResponse* output, NSError* error)) handler;


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
/// @return OAIInlineResponse2005*
-(NSURLSessionTask*) getVehicleStatsWithAccessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    series: (NSString*) series
    tagIds: (NSString*) tagIds
    startingAfter: (NSString*) startingAfter
    endingBefore: (NSString*) endingBefore
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAIInlineResponse2005* output, NSError* error)) handler;


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
/// @return NSArray<NSObject*>*
-(NSURLSessionTask*) getVehiclesLocationsWithAccessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(NSArray<NSObject*>* output, NSError* error)) handler;


/// /contacts
/// Fetch all contacts for the organization.
///
/// @param accessToken Samsara API access token.
/// 
///  code:200 message:"List of contacts.",
///  code:0 message:"Unexpected error."
///
/// @return NSArray<OAIContact>*
-(NSURLSessionTask*) listContactsWithAccessToken: (NSString*) accessToken
    completionHandler: (void (^)(NSArray<OAIContact>* output, NSError* error)) handler;


/// /fleet/list
/// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
///
/// @param accessToken Samsara API access token.
/// @param groupParam 
/// @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
/// @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
/// @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
/// 
///  code:200 message:"List of vehicles and information about each.",
///  code:0 message:"Unexpected error."
///
/// @return OAIInlineResponse2002*
-(NSURLSessionTask*) listFleetWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject10*) groupParam
    startingAfter: (NSString*) startingAfter
    endingBefore: (NSString*) endingBefore
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAIInlineResponse2002* output, NSError* error)) handler;


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
/// @return OAIFleetVehicleResponse*
-(NSURLSessionTask*) patchFleetVehicleWithAccessToken: (NSString*) accessToken
    vehicleIdOrExternalId: (NSString*) vehicleIdOrExternalId
    data: (OAIInlineObject16*) data
    completionHandler: (void (^)(OAIFleetVehicleResponse* output, NSError* error)) handler;


/// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Reactivate the inactive driver having id.
///
/// @param accessToken Samsara API access token.
/// @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
/// @param reactivateDriverParam 
/// 
///  code:200 message:"Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.",
///  code:0 message:"Unexpected error."
///
/// @return OAIDriver*
-(NSURLSessionTask*) reactivateDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    reactivateDriverParam: (OAIInlineObject4*) reactivateDriverParam
    completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler;


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
/// @return OAIDispatchRoute*
-(NSURLSessionTask*) updateDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    updateDispatchRouteParams: (OAIDispatchRoute*) updateDispatchRouteParams
    completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler;


/// /addresses/{addressId}
/// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
///
/// @param accessToken Samsara API access token.
/// @param addressId ID of the address/geofence
/// @param address 
/// 
///  code:200 message:"Address was successfully updated. No response body is returned.",
///  code:0 message:"Unexpected error."
///
/// @return void
-(NSURLSessionTask*) updateOrganizationAddressWithAccessToken: (NSString*) accessToken
    addressId: (NSNumber*) addressId
    address: (OAIInlineObject1*) address
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
    vehicleUpdateParam: (OAIInlineObject14*) vehicleUpdateParam
    completionHandler: (void (^)(NSError* error)) handler;



@end
