<?php
/**
 * FleetApiInterface
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use OpenAPI\Server\Model\Address;
use OpenAPI\Server\Model\AllRouteJobUpdates;
use OpenAPI\Server\Model\AssetReeferResponse;
use OpenAPI\Server\Model\Contact;
use OpenAPI\Server\Model\DispatchRoute;
use OpenAPI\Server\Model\DispatchRouteCreate;
use OpenAPI\Server\Model\DispatchRouteHistory;
use OpenAPI\Server\Model\Document;
use OpenAPI\Server\Model\DocumentCreate;
use OpenAPI\Server\Model\DocumentType;
use OpenAPI\Server\Model\Driver;
use OpenAPI\Server\Model\DriverDailyLogResponse;
use OpenAPI\Server\Model\DriverForCreate;
use OpenAPI\Server\Model\DriverSafetyScoreResponse;
use OpenAPI\Server\Model\DriversResponse;
use OpenAPI\Server\Model\DriversSummaryResponse;
use OpenAPI\Server\Model\DvirBase;
use OpenAPI\Server\Model\DvirListResponse;
use OpenAPI\Server\Model\FleetVehicleLocation;
use OpenAPI\Server\Model\FleetVehicleResponse;
use OpenAPI\Server\Model\HosAuthenticationLogsResponse;
use OpenAPI\Server\Model\HosLogsResponse;
use OpenAPI\Server\Model\HosLogsSummaryResponse;
use OpenAPI\Server\Model\InlineObject;
use OpenAPI\Server\Model\InlineObject1;
use OpenAPI\Server\Model\InlineObject10;
use OpenAPI\Server\Model\InlineObject11;
use OpenAPI\Server\Model\InlineObject12;
use OpenAPI\Server\Model\InlineObject13;
use OpenAPI\Server\Model\InlineObject14;
use OpenAPI\Server\Model\InlineObject15;
use OpenAPI\Server\Model\InlineObject16;
use OpenAPI\Server\Model\InlineObject2;
use OpenAPI\Server\Model\InlineObject3;
use OpenAPI\Server\Model\InlineObject4;
use OpenAPI\Server\Model\InlineObject5;
use OpenAPI\Server\Model\InlineObject6;
use OpenAPI\Server\Model\InlineObject7;
use OpenAPI\Server\Model\InlineObject8;
use OpenAPI\Server\Model\InlineObject9;
use OpenAPI\Server\Model\InlineResponse200;
use OpenAPI\Server\Model\InlineResponse2001;
use OpenAPI\Server\Model\InlineResponse2002;
use OpenAPI\Server\Model\InlineResponse2003;
use OpenAPI\Server\Model\InlineResponse2004;
use OpenAPI\Server\Model\InlineResponse2005;
use OpenAPI\Server\Model\TripResponse;
use OpenAPI\Server\Model\VehicleHarshEventResponse;
use OpenAPI\Server\Model\VehicleSafetyScoreResponse;

/**
 * FleetApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface FleetApiInterface
{

    /**
     * Operation addFleetAddress
     *
     * /fleet/add_address
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject2 $addressParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function addFleetAddress($accessToken, InlineObject2 $addressParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation addOrganizationAddresses
     *
     * /addresses
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject $addresses   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Address[]
     *
     */
    public function addOrganizationAddresses($accessToken, InlineObject $addresses, &$responseCode, array &$responseHeaders);

    /**
     * Operation createDispatchRoute
     *
     * /fleet/dispatch/routes
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\DispatchRouteCreate $createDispatchRouteParams   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DispatchRoute[]
     *
     */
    public function createDispatchRoute($accessToken, DispatchRouteCreate $createDispatchRouteParams, &$responseCode, array &$responseHeaders);

    /**
     * Operation createDriver
     *
     * /fleet/drivers/create
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\DriverForCreate $createDriverParam  Driver creation body (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Driver[]
     *
     */
    public function createDriver($accessToken, DriverForCreate $createDriverParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation createDriverDispatchRoute
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $driverId  ID of the driver with the associated routes. (required)
     * @param  OpenAPI\Server\Model\DispatchRouteCreate $createDispatchRouteParams   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DispatchRoute[]
     *
     */
    public function createDriverDispatchRoute($accessToken, $driverId, DispatchRouteCreate $createDispatchRouteParams, &$responseCode, array &$responseHeaders);

    /**
     * Operation createDriverDocument
     *
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $driverId  ID of the driver for whom the document is created. (required)
     * @param  OpenAPI\Server\Model\DocumentCreate $createDocumentParams  To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Document[]
     *
     */
    public function createDriverDocument($accessToken, $driverId, DocumentCreate $createDocumentParams, &$responseCode, array &$responseHeaders);

    /**
     * Operation createDvir
     *
     * /fleet/maintenance/dvirs
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject12 $createDvirParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DvirBase[]
     *
     */
    public function createDvir($accessToken, InlineObject12 $createDvirParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation createVehicleDispatchRoute
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $vehicleId  ID of the vehicle with the associated routes. (required)
     * @param  OpenAPI\Server\Model\DispatchRouteCreate $createDispatchRouteParams   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DispatchRoute[]
     *
     */
    public function createVehicleDispatchRoute($accessToken, $vehicleId, DispatchRouteCreate $createDispatchRouteParams, &$responseCode, array &$responseHeaders);

    /**
     * Operation deactivateDriver
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  string $driverIdOrExternalId  ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function deactivateDriver($accessToken, $driverIdOrExternalId, &$responseCode, array &$responseHeaders);

    /**
     * Operation deleteDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $routeId  ID of the dispatch route. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function deleteDispatchRouteById($accessToken, $routeId, &$responseCode, array &$responseHeaders);

    /**
     * Operation deleteOrganizationAddress
     *
     * /addresses/{addressId}
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $addressId  ID of the address/geofence (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function deleteOrganizationAddress($accessToken, $addressId, &$responseCode, array &$responseHeaders);

    /**
     * Operation fetchAllDispatchRoutes
     *
     * /fleet/dispatch/routes
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $groupId  Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  int $endTime  Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration  Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DispatchRoute[]
     *
     */
    public function fetchAllDispatchRoutes($accessToken, $groupId = null, $endTime = null, $duration = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation fetchAllRouteJobUpdates
     *
     * /fleet/dispatch/routes/job_updates
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $groupId  Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  string $sequenceId  Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param  string $include  Optionally set include&#x3D;route to include route object in response payload. (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\AllRouteJobUpdates[]
     *
     */
    public function fetchAllRouteJobUpdates($accessToken, $groupId = null, $sequenceId = null, $include = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation getAllAssetCurrentLocations
     *
     * /fleet/assets/locations
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $groupId  Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\InlineResponse2001[]
     *
     */
    public function getAllAssetCurrentLocations($accessToken, $groupId = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation getAllAssets
     *
     * /fleet/assets
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $groupId  Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\InlineResponse200[]
     *
     */
    public function getAllAssets($accessToken, $groupId = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation getAllDeactivatedDrivers
     *
     * /fleet/drivers/inactive
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $groupId  Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Driver[]
     *
     */
    public function getAllDeactivatedDrivers($accessToken, $groupId = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation getAssetLocation
     *
     * /fleet/assets/{assetId:[0-9]+}/locations
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $assetId  ID of the asset (required)
     * @param  int $startMs  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $endMs  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array
     *
     */
    public function getAssetLocation($accessToken, $assetId, $startMs, $endMs, &$responseCode, array &$responseHeaders);

    /**
     * Operation getAssetReefer
     *
     * /fleet/assets/{assetId:[0-9]+}/reefer
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $assetId  ID of the asset (required)
     * @param  int $startMs  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $endMs  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\AssetReeferResponse[]
     *
     */
    public function getAssetReefer($accessToken, $assetId, $startMs, $endMs, &$responseCode, array &$responseHeaders);

    /**
     * Operation getDeactivatedDriverById
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  string $driverIdOrExternalId  ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Driver[]
     *
     */
    public function getDeactivatedDriverById($accessToken, $driverIdOrExternalId, &$responseCode, array &$responseHeaders);

    /**
     * Operation getDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $routeId  ID of the dispatch route. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DispatchRoute[]
     *
     */
    public function getDispatchRouteById($accessToken, $routeId, &$responseCode, array &$responseHeaders);

    /**
     * Operation getDispatchRouteHistory
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $routeId  ID of the route with history. (required)
     * @param  int $startTime  Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param  int $endTime  Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DispatchRouteHistory[]
     *
     */
    public function getDispatchRouteHistory($accessToken, $routeId, $startTime = null, $endTime = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation getDispatchRoutesByDriverId
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $driverId  ID of the driver with the associated routes. (required)
     * @param  int $endTime  Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration  Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DispatchRoute[]
     *
     */
    public function getDispatchRoutesByDriverId($accessToken, $driverId, $endTime = null, $duration = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation getDispatchRoutesByVehicleId
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $vehicleId  ID of the vehicle with the associated routes. (required)
     * @param  int $endTime  Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration  Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DispatchRoute[]
     *
     */
    public function getDispatchRoutesByVehicleId($accessToken, $vehicleId, $endTime = null, $duration = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation getDriverById
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  string $driverIdOrExternalId  ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Driver[]
     *
     */
    public function getDriverById($accessToken, $driverIdOrExternalId, &$responseCode, array &$responseHeaders);

    /**
     * Operation getDriverDocumentTypesByOrgId
     *
     * /fleet/drivers/document_types
     *
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DocumentType[]
     *
     */
    public function getDriverDocumentTypesByOrgId(&$responseCode, array &$responseHeaders);

    /**
     * Operation getDriverDocumentsByOrgId
     *
     * /fleet/drivers/documents
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $endMs  Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param  int $durationMs  Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Document[]
     *
     */
    public function getDriverDocumentsByOrgId($accessToken, $endMs = null, $durationMs = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation getDriverSafetyScore
     *
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * @param  int $driverId  ID of the driver (required)
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $startMs  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $endMs  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DriverSafetyScoreResponse[]
     *
     */
    public function getDriverSafetyScore($driverId, $accessToken, $startMs, $endMs, &$responseCode, array &$responseHeaders);

    /**
     * Operation getDvirs
     *
     * /fleet/maintenance/dvirs
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $endMs  time in millis until the last dvir log. (required)
     * @param  int $durationMs  time in millis which corresponds to the duration before the end_ms. (required)
     * @param  int $groupId  Group ID to query. (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DvirListResponse[]
     *
     */
    public function getDvirs($accessToken, $endMs, $durationMs, $groupId = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation getFleetDrivers
     *
     * /fleet/drivers
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject3 $groupDriversParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DriversResponse[]
     *
     */
    public function getFleetDrivers($accessToken, InlineObject3 $groupDriversParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation getFleetDriversHosDailyLogs
     *
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $driverId  ID of the driver with HOS logs. (required)
     * @param  OpenAPI\Server\Model\InlineObject6 $hosLogsParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DriverDailyLogResponse[]
     *
     */
    public function getFleetDriversHosDailyLogs($accessToken, $driverId, InlineObject6 $hosLogsParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation getFleetDriversSummary
     *
     * /fleet/drivers/summary
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject5 $driversSummaryParam   (required)
     * @param  bool $snapToDayBounds  Snap query result to HOS day boundaries. (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DriversSummaryResponse[]
     *
     */
    public function getFleetDriversSummary($accessToken, InlineObject5 $driversSummaryParam, $snapToDayBounds = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation getFleetHosAuthenticationLogs
     *
     * /fleet/hos_authentication_logs
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject7 $hosAuthenticationLogsParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\HosAuthenticationLogsResponse[]
     *
     */
    public function getFleetHosAuthenticationLogs($accessToken, InlineObject7 $hosAuthenticationLogsParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation getFleetHosLogs
     *
     * /fleet/hos_logs
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject8 $hosLogsParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\HosLogsResponse[]
     *
     */
    public function getFleetHosLogs($accessToken, InlineObject8 $hosLogsParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation getFleetHosLogsSummary
     *
     * /fleet/hos_logs_summary
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject9 $hosLogsParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\HosLogsSummaryResponse[]
     *
     */
    public function getFleetHosLogsSummary($accessToken, InlineObject9 $hosLogsParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation getFleetLocations
     *
     * /fleet/locations
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject11 $groupParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\InlineResponse2003[]
     *
     */
    public function getFleetLocations($accessToken, InlineObject11 $groupParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation getFleetMaintenanceList
     *
     * /fleet/maintenance/list
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject13 $groupParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\InlineResponse2004[]
     *
     */
    public function getFleetMaintenanceList($accessToken, InlineObject13 $groupParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation getFleetTrips
     *
     * /fleet/trips
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject15 $tripsParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\TripResponse[]
     *
     */
    public function getFleetTrips($accessToken, InlineObject15 $tripsParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation getFleetVehicle
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  string $vehicleIdOrExternalId  ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\FleetVehicleResponse[]
     *
     */
    public function getFleetVehicle($accessToken, $vehicleIdOrExternalId, &$responseCode, array &$responseHeaders);

    /**
     * Operation getOrganizationAddress
     *
     * /addresses/{addressId}
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $addressId  ID of the address/geofence (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Address[]
     *
     */
    public function getOrganizationAddress($accessToken, $addressId, &$responseCode, array &$responseHeaders);

    /**
     * Operation getOrganizationAddresses
     *
     * /addresses
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Address[]
     *
     */
    public function getOrganizationAddresses($accessToken, &$responseCode, array &$responseHeaders);

    /**
     * Operation getOrganizationContact
     *
     * /contacts/{contact_id}
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $contactId  ID of the contact (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Contact[]
     *
     */
    public function getOrganizationContact($accessToken, $contactId, &$responseCode, array &$responseHeaders);

    /**
     * Operation getVehicleHarshEvent
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * @param  int $vehicleId  ID of the vehicle (required)
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $timestamp  Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\VehicleHarshEventResponse[]
     *
     */
    public function getVehicleHarshEvent($vehicleId, $accessToken, $timestamp, &$responseCode, array &$responseHeaders);

    /**
     * Operation getVehicleLocations
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $vehicleId  ID of the vehicle with the associated routes. (required)
     * @param  int $startMs  Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param  int $endMs  Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\FleetVehicleLocation[]
     *
     */
    public function getVehicleLocations($accessToken, $vehicleId, $startMs, $endMs, &$responseCode, array &$responseHeaders);

    /**
     * Operation getVehicleSafetyScore
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * @param  int $vehicleId  ID of the vehicle (required)
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $startMs  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $endMs  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\VehicleSafetyScoreResponse[]
     *
     */
    public function getVehicleSafetyScore($vehicleId, $accessToken, $startMs, $endMs, &$responseCode, array &$responseHeaders);

    /**
     * Operation getVehicleStats
     *
     * /fleet/vehicles/stats
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $startMs  Time in Unix epoch milliseconds for the start of the query. (required)
     * @param  int $endMs  Time in Unix epoch milliseconds for the end of the query. (required)
     * @param  string $series  Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
     * @param  string $tagIds  Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
     * @param  string $startingAfter  Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $endingBefore  Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit  Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\InlineResponse2005[]
     *
     */
    public function getVehicleStats($accessToken, $startMs, $endMs, $series = null, $tagIds = null, $startingAfter = null, $endingBefore = null, $limit = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation getVehiclesLocations
     *
     * /fleet/vehicles/locations
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $startMs  Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param  int $endMs  Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array
     *
     */
    public function getVehiclesLocations($accessToken, $startMs, $endMs, &$responseCode, array &$responseHeaders);

    /**
     * Operation listContacts
     *
     * /contacts
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Contact[]
     *
     */
    public function listContacts($accessToken, &$responseCode, array &$responseHeaders);

    /**
     * Operation listFleet
     *
     * /fleet/list
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject10 $groupParam   (required)
     * @param  string $startingAfter  Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $endingBefore  Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit  Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\InlineResponse2002[]
     *
     */
    public function listFleet($accessToken, InlineObject10 $groupParam, $startingAfter = null, $endingBefore = null, $limit = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation patchFleetVehicle
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  string $vehicleIdOrExternalId  ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param  OpenAPI\Server\Model\InlineObject16 $data   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\FleetVehicleResponse[]
     *
     */
    public function patchFleetVehicle($accessToken, $vehicleIdOrExternalId, InlineObject16 $data, &$responseCode, array &$responseHeaders);

    /**
     * Operation reactivateDriverById
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  string $driverIdOrExternalId  ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param  OpenAPI\Server\Model\InlineObject4 $reactivateDriverParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Driver[]
     *
     */
    public function reactivateDriverById($accessToken, $driverIdOrExternalId, InlineObject4 $reactivateDriverParam, &$responseCode, array &$responseHeaders);

    /**
     * Operation updateDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $routeId  ID of the dispatch route. (required)
     * @param  OpenAPI\Server\Model\DispatchRoute $updateDispatchRouteParams   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\DispatchRoute[]
     *
     */
    public function updateDispatchRouteById($accessToken, $routeId, DispatchRoute $updateDispatchRouteParams, &$responseCode, array &$responseHeaders);

    /**
     * Operation updateOrganizationAddress
     *
     * /addresses/{addressId}
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  int $addressId  ID of the address/geofence (required)
     * @param  OpenAPI\Server\Model\InlineObject1 $address   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function updateOrganizationAddress($accessToken, $addressId, InlineObject1 $address, &$responseCode, array &$responseHeaders);

    /**
     * Operation updateVehicles
     *
     * /fleet/set_data
     *
     * @param  string $accessToken  Samsara API access token. (required)
     * @param  OpenAPI\Server\Model\InlineObject14 $vehicleUpdateParam   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function updateVehicles($accessToken, InlineObject14 $vehicleUpdateParam, &$responseCode, array &$responseHeaders);
}
