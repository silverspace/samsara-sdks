<?php

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
 *
 * Source files are located at:
 *
 * > swagger-codegen/modules/swagger-codegen/src/main/resources/php-laravel/
 */


namespace App\Http\Controllers;

use Illuminate\Support\Facades\Request;

class FleetController extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation addOrganizationAddresses
     *
     * /addresses.
     *
     *
     * @return Http response
     */
    public function addOrganizationAddresses()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling addOrganizationAddresses');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['addresses'])) {
            throw new \InvalidArgumentException('Missing the required parameter $addresses when calling addOrganizationAddresses');
        }
        $addresses = $input['addresses'];


        return response('How about implementing addOrganizationAddresses as a post method ?');
    }
    /**
     * Operation getOrganizationAddresses
     *
     * /addresses.
     *
     *
     * @return Http response
     */
    public function getOrganizationAddresses()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getOrganizationAddresses');
        }
        $accessToken = $input['accessToken'];


        return response('How about implementing getOrganizationAddresses as a get method ?');
    }
    /**
     * Operation deleteOrganizationAddress
     *
     * /addresses/{addressId}.
     *
     * @param int $addressId ID of the address/geofence (required)
     *
     * @return Http response
     */
    public function deleteOrganizationAddress($addressId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing deleteOrganizationAddress as a delete method ?');
    }
    /**
     * Operation getOrganizationAddress
     *
     * /addresses/{addressId}.
     *
     * @param int $addressId ID of the address/geofence (required)
     *
     * @return Http response
     */
    public function getOrganizationAddress($addressId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getOrganizationAddress as a get method ?');
    }
    /**
     * Operation updateOrganizationAddress
     *
     * /addresses/{addressId}.
     *
     * @param int $addressId ID of the address/geofence (required)
     *
     * @return Http response
     */
    public function updateOrganizationAddress($addressId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateOrganizationAddress as a patch method ?');
    }
    /**
     * Operation listContacts
     *
     * /contacts.
     *
     *
     * @return Http response
     */
    public function listContacts()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling listContacts');
        }
        $accessToken = $input['accessToken'];


        return response('How about implementing listContacts as a get method ?');
    }
    /**
     * Operation getOrganizationContact
     *
     * /contacts/{contact_id}.
     *
     * @param int $contactId ID of the contact (required)
     *
     * @return Http response
     */
    public function getOrganizationContact($contactId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getOrganizationContact as a get method ?');
    }
    /**
     * Operation addFleetAddress
     *
     * /fleet/add_address.
     *
     *
     * @return Http response
     */
    public function addFleetAddress()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling addFleetAddress');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['addressParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $addressParam when calling addFleetAddress');
        }
        $addressParam = $input['addressParam'];


        return response('How about implementing addFleetAddress as a post method ?');
    }
    /**
     * Operation getAllAssets
     *
     * /fleet/assets.
     *
     *
     * @return Http response
     */
    public function getAllAssets()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getAllAssets');
        }
        $accessToken = $input['accessToken'];

        $groupId = $input['groupId'];


        return response('How about implementing getAllAssets as a get method ?');
    }
    /**
     * Operation getAllAssetCurrentLocations
     *
     * /fleet/assets/locations.
     *
     *
     * @return Http response
     */
    public function getAllAssetCurrentLocations()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getAllAssetCurrentLocations');
        }
        $accessToken = $input['accessToken'];

        $groupId = $input['groupId'];


        return response('How about implementing getAllAssetCurrentLocations as a get method ?');
    }
    /**
     * Operation getAssetLocation
     *
     * /fleet/assets/{assetId:[0-9]+}/locations.
     *
     * @param int $assetId ID of the asset (required)
     *
     * @return Http response
     */
    public function getAssetLocation($assetId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getAssetLocation as a get method ?');
    }
    /**
     * Operation getAssetReefer
     *
     * /fleet/assets/{assetId:[0-9]+}/reefer.
     *
     * @param int $assetId ID of the asset (required)
     *
     * @return Http response
     */
    public function getAssetReefer($assetId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getAssetReefer as a get method ?');
    }
    /**
     * Operation createDispatchRoute
     *
     * /fleet/dispatch/routes.
     *
     *
     * @return Http response
     */
    public function createDispatchRoute()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling createDispatchRoute');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['createDispatchRouteParams'])) {
            throw new \InvalidArgumentException('Missing the required parameter $createDispatchRouteParams when calling createDispatchRoute');
        }
        $createDispatchRouteParams = $input['createDispatchRouteParams'];


        return response('How about implementing createDispatchRoute as a post method ?');
    }
    /**
     * Operation fetchAllDispatchRoutes
     *
     * /fleet/dispatch/routes.
     *
     *
     * @return Http response
     */
    public function fetchAllDispatchRoutes()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling fetchAllDispatchRoutes');
        }
        $accessToken = $input['accessToken'];

        $groupId = $input['groupId'];

        $endTime = $input['endTime'];

        $duration = $input['duration'];


        return response('How about implementing fetchAllDispatchRoutes as a get method ?');
    }
    /**
     * Operation fetchAllRouteJobUpdates
     *
     * /fleet/dispatch/routes/job_updates.
     *
     *
     * @return Http response
     */
    public function fetchAllRouteJobUpdates()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling fetchAllRouteJobUpdates');
        }
        $accessToken = $input['accessToken'];

        $groupId = $input['groupId'];

        $sequenceId = $input['sequenceId'];

        $include = $input['include'];


        return response('How about implementing fetchAllRouteJobUpdates as a get method ?');
    }
    /**
     * Operation deleteDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/.
     *
     * @param int $routeId ID of the dispatch route. (required)
     *
     * @return Http response
     */
    public function deleteDispatchRouteById($routeId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing deleteDispatchRouteById as a delete method ?');
    }
    /**
     * Operation getDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}.
     *
     * @param int $routeId ID of the dispatch route. (required)
     *
     * @return Http response
     */
    public function getDispatchRouteById($routeId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getDispatchRouteById as a get method ?');
    }
    /**
     * Operation updateDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/.
     *
     * @param int $routeId ID of the dispatch route. (required)
     *
     * @return Http response
     */
    public function updateDispatchRouteById($routeId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateDispatchRouteById as a put method ?');
    }
    /**
     * Operation getDispatchRouteHistory
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history.
     *
     * @param int $routeId ID of the route with history. (required)
     *
     * @return Http response
     */
    public function getDispatchRouteHistory($routeId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getDispatchRouteHistory as a get method ?');
    }
    /**
     * Operation getFleetDrivers
     *
     * /fleet/drivers.
     *
     *
     * @return Http response
     */
    public function getFleetDrivers()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getFleetDrivers');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['groupDriversParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $groupDriversParam when calling getFleetDrivers');
        }
        $groupDriversParam = $input['groupDriversParam'];


        return response('How about implementing getFleetDrivers as a post method ?');
    }
    /**
     * Operation createDriver
     *
     * /fleet/drivers/create.
     *
     *
     * @return Http response
     */
    public function createDriver()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling createDriver');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['createDriverParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $createDriverParam when calling createDriver');
        }
        $createDriverParam = $input['createDriverParam'];


        return response('How about implementing createDriver as a post method ?');
    }
    /**
     * Operation getDriverDocumentTypesByOrgId
     *
     * /fleet/drivers/document_types.
     *
     *
     * @return Http response
     */
    public function getDriverDocumentTypesByOrgId()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getDriverDocumentTypesByOrgId as a get method ?');
    }
    /**
     * Operation getDriverDocumentsByOrgId
     *
     * /fleet/drivers/documents.
     *
     *
     * @return Http response
     */
    public function getDriverDocumentsByOrgId()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getDriverDocumentsByOrgId');
        }
        $accessToken = $input['accessToken'];

        $endMs = $input['endMs'];

        $durationMs = $input['durationMs'];


        return response('How about implementing getDriverDocumentsByOrgId as a get method ?');
    }
    /**
     * Operation getAllDeactivatedDrivers
     *
     * /fleet/drivers/inactive.
     *
     *
     * @return Http response
     */
    public function getAllDeactivatedDrivers()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getAllDeactivatedDrivers');
        }
        $accessToken = $input['accessToken'];

        $groupId = $input['groupId'];


        return response('How about implementing getAllDeactivatedDrivers as a get method ?');
    }
    /**
     * Operation getDeactivatedDriverById
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     * @param string $driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function getDeactivatedDriverById($driverIdOrExternalId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getDeactivatedDriverById as a get method ?');
    }
    /**
     * Operation reactivateDriverById
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     * @param string $driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function reactivateDriverById($driverIdOrExternalId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing reactivateDriverById as a put method ?');
    }
    /**
     * Operation getFleetDriversSummary
     *
     * /fleet/drivers/summary.
     *
     *
     * @return Http response
     */
    public function getFleetDriversSummary()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getFleetDriversSummary');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['driversSummaryParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $driversSummaryParam when calling getFleetDriversSummary');
        }
        $driversSummaryParam = $input['driversSummaryParam'];

        $snapToDayBounds = $input['snapToDayBounds'];


        return response('How about implementing getFleetDriversSummary as a post method ?');
    }
    /**
     * Operation getDriverSafetyScore
     *
     * /fleet/drivers/{driverId:[0-9]+}/safety/score.
     *
     * @param int $driverId ID of the driver (required)
     *
     * @return Http response
     */
    public function getDriverSafetyScore($driverId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getDriverSafetyScore as a get method ?');
    }
    /**
     * Operation deactivateDriver
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     * @param string $driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function deactivateDriver($driverIdOrExternalId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing deactivateDriver as a delete method ?');
    }
    /**
     * Operation getDriverById
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     * @param string $driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function getDriverById($driverIdOrExternalId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getDriverById as a get method ?');
    }
    /**
     * Operation createDriverDispatchRoute
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
     *
     * @param int $driverId ID of the driver with the associated routes. (required)
     *
     * @return Http response
     */
    public function createDriverDispatchRoute($driverId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing createDriverDispatchRoute as a post method ?');
    }
    /**
     * Operation getDispatchRoutesByDriverId
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
     *
     * @param int $driverId ID of the driver with the associated routes. (required)
     *
     * @return Http response
     */
    public function getDispatchRoutesByDriverId($driverId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getDispatchRoutesByDriverId as a get method ?');
    }
    /**
     * Operation createDriverDocument
     *
     * /fleet/drivers/{driver_id:[0-9]+}/documents.
     *
     * @param int $driverId ID of the driver for whom the document is created. (required)
     *
     * @return Http response
     */
    public function createDriverDocument($driverId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing createDriverDocument as a post method ?');
    }
    /**
     * Operation getFleetDriversHosDailyLogs
     *
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs.
     *
     * @param int $driverId ID of the driver with HOS logs. (required)
     *
     * @return Http response
     */
    public function getFleetDriversHosDailyLogs($driverId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getFleetDriversHosDailyLogs as a post method ?');
    }
    /**
     * Operation getFleetHosAuthenticationLogs
     *
     * /fleet/hos_authentication_logs.
     *
     *
     * @return Http response
     */
    public function getFleetHosAuthenticationLogs()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getFleetHosAuthenticationLogs');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['hosAuthenticationLogsParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $hosAuthenticationLogsParam when calling getFleetHosAuthenticationLogs');
        }
        $hosAuthenticationLogsParam = $input['hosAuthenticationLogsParam'];


        return response('How about implementing getFleetHosAuthenticationLogs as a post method ?');
    }
    /**
     * Operation getFleetHosLogs
     *
     * /fleet/hos_logs.
     *
     *
     * @return Http response
     */
    public function getFleetHosLogs()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getFleetHosLogs');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['hosLogsParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $hosLogsParam when calling getFleetHosLogs');
        }
        $hosLogsParam = $input['hosLogsParam'];


        return response('How about implementing getFleetHosLogs as a post method ?');
    }
    /**
     * Operation getFleetHosLogsSummary
     *
     * /fleet/hos_logs_summary.
     *
     *
     * @return Http response
     */
    public function getFleetHosLogsSummary()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getFleetHosLogsSummary');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['hosLogsParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $hosLogsParam when calling getFleetHosLogsSummary');
        }
        $hosLogsParam = $input['hosLogsParam'];


        return response('How about implementing getFleetHosLogsSummary as a post method ?');
    }
    /**
     * Operation listFleet
     *
     * /fleet/list.
     *
     *
     * @return Http response
     */
    public function listFleet()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling listFleet');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['groupParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $groupParam when calling listFleet');
        }
        $groupParam = $input['groupParam'];

        $startingAfter = $input['startingAfter'];

        $endingBefore = $input['endingBefore'];

        $limit = $input['limit'];


        return response('How about implementing listFleet as a post method ?');
    }
    /**
     * Operation getFleetLocations
     *
     * /fleet/locations.
     *
     *
     * @return Http response
     */
    public function getFleetLocations()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getFleetLocations');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['groupParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $groupParam when calling getFleetLocations');
        }
        $groupParam = $input['groupParam'];


        return response('How about implementing getFleetLocations as a post method ?');
    }
    /**
     * Operation createDvir
     *
     * /fleet/maintenance/dvirs.
     *
     *
     * @return Http response
     */
    public function createDvir()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling createDvir');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['createDvirParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $createDvirParam when calling createDvir');
        }
        $createDvirParam = $input['createDvirParam'];


        return response('How about implementing createDvir as a post method ?');
    }
    /**
     * Operation getDvirs
     *
     * /fleet/maintenance/dvirs.
     *
     *
     * @return Http response
     */
    public function getDvirs()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getDvirs');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['endMs'])) {
            throw new \InvalidArgumentException('Missing the required parameter $endMs when calling getDvirs');
        }
        $endMs = $input['endMs'];

        if (!isset($input['durationMs'])) {
            throw new \InvalidArgumentException('Missing the required parameter $durationMs when calling getDvirs');
        }
        $durationMs = $input['durationMs'];

        $groupId = $input['groupId'];


        return response('How about implementing getDvirs as a get method ?');
    }
    /**
     * Operation getFleetMaintenanceList
     *
     * /fleet/maintenance/list.
     *
     *
     * @return Http response
     */
    public function getFleetMaintenanceList()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getFleetMaintenanceList');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['groupParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $groupParam when calling getFleetMaintenanceList');
        }
        $groupParam = $input['groupParam'];


        return response('How about implementing getFleetMaintenanceList as a post method ?');
    }
    /**
     * Operation updateVehicles
     *
     * /fleet/set_data.
     *
     *
     * @return Http response
     */
    public function updateVehicles()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling updateVehicles');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['vehicleUpdateParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $vehicleUpdateParam when calling updateVehicles');
        }
        $vehicleUpdateParam = $input['vehicleUpdateParam'];


        return response('How about implementing updateVehicles as a post method ?');
    }
    /**
     * Operation getFleetTrips
     *
     * /fleet/trips.
     *
     *
     * @return Http response
     */
    public function getFleetTrips()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getFleetTrips');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['tripsParam'])) {
            throw new \InvalidArgumentException('Missing the required parameter $tripsParam when calling getFleetTrips');
        }
        $tripsParam = $input['tripsParam'];


        return response('How about implementing getFleetTrips as a post method ?');
    }
    /**
     * Operation getVehiclesLocations
     *
     * /fleet/vehicles/locations.
     *
     *
     * @return Http response
     */
    public function getVehiclesLocations()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getVehiclesLocations');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['startMs'])) {
            throw new \InvalidArgumentException('Missing the required parameter $startMs when calling getVehiclesLocations');
        }
        $startMs = $input['startMs'];

        if (!isset($input['endMs'])) {
            throw new \InvalidArgumentException('Missing the required parameter $endMs when calling getVehiclesLocations');
        }
        $endMs = $input['endMs'];


        return response('How about implementing getVehiclesLocations as a get method ?');
    }
    /**
     * Operation getVehicleStats
     *
     * /fleet/vehicles/stats.
     *
     *
     * @return Http response
     */
    public function getVehicleStats()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['accessToken'])) {
            throw new \InvalidArgumentException('Missing the required parameter $accessToken when calling getVehicleStats');
        }
        $accessToken = $input['accessToken'];

        if (!isset($input['startMs'])) {
            throw new \InvalidArgumentException('Missing the required parameter $startMs when calling getVehicleStats');
        }
        $startMs = $input['startMs'];

        if (!isset($input['endMs'])) {
            throw new \InvalidArgumentException('Missing the required parameter $endMs when calling getVehicleStats');
        }
        $endMs = $input['endMs'];

        $series = $input['series'];

        $tagIds = $input['tagIds'];

        $startingAfter = $input['startingAfter'];

        $endingBefore = $input['endingBefore'];

        $limit = $input['limit'];


        return response('How about implementing getVehicleStats as a get method ?');
    }
    /**
     * Operation getVehicleHarshEvent
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event.
     *
     * @param int $vehicleId ID of the vehicle (required)
     *
     * @return Http response
     */
    public function getVehicleHarshEvent($vehicleId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getVehicleHarshEvent as a get method ?');
    }
    /**
     * Operation getVehicleSafetyScore
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score.
     *
     * @param int $vehicleId ID of the vehicle (required)
     *
     * @return Http response
     */
    public function getVehicleSafetyScore($vehicleId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getVehicleSafetyScore as a get method ?');
    }
    /**
     * Operation getFleetVehicle
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     * @param string $vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function getFleetVehicle($vehicleIdOrExternalId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getFleetVehicle as a get method ?');
    }
    /**
     * Operation patchFleetVehicle
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     * @param string $vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function patchFleetVehicle($vehicleIdOrExternalId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing patchFleetVehicle as a patch method ?');
    }
    /**
     * Operation createVehicleDispatchRoute
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
     *
     * @param int $vehicleId ID of the vehicle with the associated routes. (required)
     *
     * @return Http response
     */
    public function createVehicleDispatchRoute($vehicleId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing createVehicleDispatchRoute as a post method ?');
    }
    /**
     * Operation getDispatchRoutesByVehicleId
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
     *
     * @param int $vehicleId ID of the vehicle with the associated routes. (required)
     *
     * @return Http response
     */
    public function getDispatchRoutesByVehicleId($vehicleId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getDispatchRoutesByVehicleId as a get method ?');
    }
    /**
     * Operation getVehicleLocations
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations.
     *
     * @param int $vehicleId ID of the vehicle with the associated routes. (required)
     *
     * @return Http response
     */
    public function getVehicleLocations($vehicleId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getVehicleLocations as a get method ?');
    }
}
