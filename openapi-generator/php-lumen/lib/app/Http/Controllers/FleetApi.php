<?php

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


namespace App\Http\Controllers;

use Illuminate\Support\Facades\Request;

class FleetApi extends Controller
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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling addOrganizationAddresses');
        }
        $access_token = $input['access_token'];

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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getOrganizationAddresses');
        }
        $access_token = $input['access_token'];


        return response('How about implementing getOrganizationAddresses as a get method ?');
    }
    /**
     * Operation deleteOrganizationAddress
     *
     * /addresses/{addressId}.
     *
     * @param int $address_id ID of the address/geofence (required)
     *
     * @return Http response
     */
    public function deleteOrganizationAddress($address_id)
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
     * @param int $address_id ID of the address/geofence (required)
     *
     * @return Http response
     */
    public function getOrganizationAddress($address_id)
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
     * @param int $address_id ID of the address/geofence (required)
     *
     * @return Http response
     */
    public function updateOrganizationAddress($address_id)
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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling listContacts');
        }
        $access_token = $input['access_token'];


        return response('How about implementing listContacts as a get method ?');
    }
    /**
     * Operation getOrganizationContact
     *
     * /contacts/{contact_id}.
     *
     * @param int $contact_id ID of the contact (required)
     *
     * @return Http response
     */
    public function getOrganizationContact($contact_id)
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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling addFleetAddress');
        }
        $access_token = $input['access_token'];

        if (!isset($input['address_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $address_param when calling addFleetAddress');
        }
        $address_param = $input['address_param'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getAllAssets');
        }
        $access_token = $input['access_token'];

        $group_id = $input['group_id'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getAllAssetCurrentLocations');
        }
        $access_token = $input['access_token'];

        $group_id = $input['group_id'];


        return response('How about implementing getAllAssetCurrentLocations as a get method ?');
    }
    /**
     * Operation getAssetLocation
     *
     * /fleet/assets/{assetId:[0-9]+}/locations.
     *
     * @param int $asset_id ID of the asset (required)
     *
     * @return Http response
     */
    public function getAssetLocation($asset_id)
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
     * @param int $asset_id ID of the asset (required)
     *
     * @return Http response
     */
    public function getAssetReefer($asset_id)
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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling createDispatchRoute');
        }
        $access_token = $input['access_token'];

        if (!isset($input['create_dispatch_route_params'])) {
            throw new \InvalidArgumentException('Missing the required parameter $create_dispatch_route_params when calling createDispatchRoute');
        }
        $create_dispatch_route_params = $input['create_dispatch_route_params'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling fetchAllDispatchRoutes');
        }
        $access_token = $input['access_token'];

        $group_id = $input['group_id'];

        $end_time = $input['end_time'];

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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling fetchAllRouteJobUpdates');
        }
        $access_token = $input['access_token'];

        $group_id = $input['group_id'];

        $sequence_id = $input['sequence_id'];

        $include = $input['include'];


        return response('How about implementing fetchAllRouteJobUpdates as a get method ?');
    }
    /**
     * Operation deleteDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/.
     *
     * @param int $route_id ID of the dispatch route. (required)
     *
     * @return Http response
     */
    public function deleteDispatchRouteById($route_id)
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
     * @param int $route_id ID of the dispatch route. (required)
     *
     * @return Http response
     */
    public function getDispatchRouteById($route_id)
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
     * @param int $route_id ID of the dispatch route. (required)
     *
     * @return Http response
     */
    public function updateDispatchRouteById($route_id)
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
     * @param int $route_id ID of the route with history. (required)
     *
     * @return Http response
     */
    public function getDispatchRouteHistory($route_id)
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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getFleetDrivers');
        }
        $access_token = $input['access_token'];

        if (!isset($input['group_drivers_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $group_drivers_param when calling getFleetDrivers');
        }
        $group_drivers_param = $input['group_drivers_param'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling createDriver');
        }
        $access_token = $input['access_token'];

        if (!isset($input['create_driver_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $create_driver_param when calling createDriver');
        }
        $create_driver_param = $input['create_driver_param'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getDriverDocumentsByOrgId');
        }
        $access_token = $input['access_token'];

        $end_ms = $input['end_ms'];

        $duration_ms = $input['duration_ms'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getAllDeactivatedDrivers');
        }
        $access_token = $input['access_token'];

        $group_id = $input['group_id'];


        return response('How about implementing getAllDeactivatedDrivers as a get method ?');
    }
    /**
     * Operation getDeactivatedDriverById
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     * @param string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function getDeactivatedDriverById($driver_id_or_external_id)
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
     * @param string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function reactivateDriverById($driver_id_or_external_id)
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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getFleetDriversSummary');
        }
        $access_token = $input['access_token'];

        if (!isset($input['drivers_summary_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $drivers_summary_param when calling getFleetDriversSummary');
        }
        $drivers_summary_param = $input['drivers_summary_param'];

        $snap_to_day_bounds = $input['snap_to_day_bounds'];


        return response('How about implementing getFleetDriversSummary as a post method ?');
    }
    /**
     * Operation getDriverSafetyScore
     *
     * /fleet/drivers/{driverId:[0-9]+}/safety/score.
     *
     * @param int $driver_id ID of the driver (required)
     *
     * @return Http response
     */
    public function getDriverSafetyScore($driver_id)
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
     * @param string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function deactivateDriver($driver_id_or_external_id)
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
     * @param string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function getDriverById($driver_id_or_external_id)
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
     * @param int $driver_id ID of the driver with the associated routes. (required)
     *
     * @return Http response
     */
    public function createDriverDispatchRoute($driver_id)
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
     * @param int $driver_id ID of the driver with the associated routes. (required)
     *
     * @return Http response
     */
    public function getDispatchRoutesByDriverId($driver_id)
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
     * @param int $driver_id ID of the driver for whom the document is created. (required)
     *
     * @return Http response
     */
    public function createDriverDocument($driver_id)
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
     * @param int $driver_id ID of the driver with HOS logs. (required)
     *
     * @return Http response
     */
    public function getFleetDriversHosDailyLogs($driver_id)
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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getFleetHosAuthenticationLogs');
        }
        $access_token = $input['access_token'];

        if (!isset($input['hos_authentication_logs_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $hos_authentication_logs_param when calling getFleetHosAuthenticationLogs');
        }
        $hos_authentication_logs_param = $input['hos_authentication_logs_param'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getFleetHosLogs');
        }
        $access_token = $input['access_token'];

        if (!isset($input['hos_logs_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $hos_logs_param when calling getFleetHosLogs');
        }
        $hos_logs_param = $input['hos_logs_param'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getFleetHosLogsSummary');
        }
        $access_token = $input['access_token'];

        if (!isset($input['hos_logs_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $hos_logs_param when calling getFleetHosLogsSummary');
        }
        $hos_logs_param = $input['hos_logs_param'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling listFleet');
        }
        $access_token = $input['access_token'];

        if (!isset($input['group_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $group_param when calling listFleet');
        }
        $group_param = $input['group_param'];

        $starting_after = $input['starting_after'];

        $ending_before = $input['ending_before'];

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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getFleetLocations');
        }
        $access_token = $input['access_token'];

        if (!isset($input['group_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $group_param when calling getFleetLocations');
        }
        $group_param = $input['group_param'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling createDvir');
        }
        $access_token = $input['access_token'];

        if (!isset($input['create_dvir_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $create_dvir_param when calling createDvir');
        }
        $create_dvir_param = $input['create_dvir_param'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getDvirs');
        }
        $access_token = $input['access_token'];

        if (!isset($input['end_ms'])) {
            throw new \InvalidArgumentException('Missing the required parameter $end_ms when calling getDvirs');
        }
        $end_ms = $input['end_ms'];

        if (!isset($input['duration_ms'])) {
            throw new \InvalidArgumentException('Missing the required parameter $duration_ms when calling getDvirs');
        }
        $duration_ms = $input['duration_ms'];

        $group_id = $input['group_id'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getFleetMaintenanceList');
        }
        $access_token = $input['access_token'];

        if (!isset($input['group_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $group_param when calling getFleetMaintenanceList');
        }
        $group_param = $input['group_param'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling updateVehicles');
        }
        $access_token = $input['access_token'];

        if (!isset($input['vehicle_update_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $vehicle_update_param when calling updateVehicles');
        }
        $vehicle_update_param = $input['vehicle_update_param'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getFleetTrips');
        }
        $access_token = $input['access_token'];

        if (!isset($input['trips_param'])) {
            throw new \InvalidArgumentException('Missing the required parameter $trips_param when calling getFleetTrips');
        }
        $trips_param = $input['trips_param'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getVehiclesLocations');
        }
        $access_token = $input['access_token'];

        if (!isset($input['start_ms'])) {
            throw new \InvalidArgumentException('Missing the required parameter $start_ms when calling getVehiclesLocations');
        }
        $start_ms = $input['start_ms'];

        if (!isset($input['end_ms'])) {
            throw new \InvalidArgumentException('Missing the required parameter $end_ms when calling getVehiclesLocations');
        }
        $end_ms = $input['end_ms'];


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
        if (!isset($input['access_token'])) {
            throw new \InvalidArgumentException('Missing the required parameter $access_token when calling getVehicleStats');
        }
        $access_token = $input['access_token'];

        if (!isset($input['start_ms'])) {
            throw new \InvalidArgumentException('Missing the required parameter $start_ms when calling getVehicleStats');
        }
        $start_ms = $input['start_ms'];

        if (!isset($input['end_ms'])) {
            throw new \InvalidArgumentException('Missing the required parameter $end_ms when calling getVehicleStats');
        }
        $end_ms = $input['end_ms'];

        $series = $input['series'];

        $tag_ids = $input['tag_ids'];

        $starting_after = $input['starting_after'];

        $ending_before = $input['ending_before'];

        $limit = $input['limit'];


        return response('How about implementing getVehicleStats as a get method ?');
    }
    /**
     * Operation getVehicleHarshEvent
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event.
     *
     * @param int $vehicle_id ID of the vehicle (required)
     *
     * @return Http response
     */
    public function getVehicleHarshEvent($vehicle_id)
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
     * @param int $vehicle_id ID of the vehicle (required)
     *
     * @return Http response
     */
    public function getVehicleSafetyScore($vehicle_id)
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
     * @param string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function getFleetVehicle($vehicle_id_or_external_id)
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
     * @param string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     *
     * @return Http response
     */
    public function patchFleetVehicle($vehicle_id_or_external_id)
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
     * @param int $vehicle_id ID of the vehicle with the associated routes. (required)
     *
     * @return Http response
     */
    public function createVehicleDispatchRoute($vehicle_id)
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
     * @param int $vehicle_id ID of the vehicle with the associated routes. (required)
     *
     * @return Http response
     */
    public function getDispatchRoutesByVehicleId($vehicle_id)
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
     * @param int $vehicle_id ID of the vehicle with the associated routes. (required)
     *
     * @return Http response
     */
    public function getVehicleLocations($vehicle_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getVehicleLocations as a get method ?');
    }
}
