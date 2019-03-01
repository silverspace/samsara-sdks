<?php
/**
 * FleetApiTest
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.3-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Please update the test case below to test the endpoint.
 */

namespace Swagger\Client;

use \Swagger\Client\Configuration;
use \Swagger\Client\ApiException;
use \Swagger\Client\ObjectSerializer;

/**
 * FleetApiTest Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class FleetApiTest extends \PHPUnit_Framework_TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test case for addFleetAddress
     *
     * /fleet/add_address.
     *
     */
    public function testAddFleetAddress()
    {
    }

    /**
     * Test case for addOrganizationAddresses
     *
     * /addresses.
     *
     */
    public function testAddOrganizationAddresses()
    {
    }

    /**
     * Test case for createDispatchRoute
     *
     * /fleet/dispatch/routes.
     *
     */
    public function testCreateDispatchRoute()
    {
    }

    /**
     * Test case for createDriver
     *
     * /fleet/drivers/create.
     *
     */
    public function testCreateDriver()
    {
    }

    /**
     * Test case for createDriverDispatchRoute
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
     *
     */
    public function testCreateDriverDispatchRoute()
    {
    }

    /**
     * Test case for createDriverDocument
     *
     * /fleet/drivers/{driver_id:[0-9]+}/documents.
     *
     */
    public function testCreateDriverDocument()
    {
    }

    /**
     * Test case for createDvir
     *
     * /fleet/maintenance/dvirs.
     *
     */
    public function testCreateDvir()
    {
    }

    /**
     * Test case for createVehicleDispatchRoute
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
     *
     */
    public function testCreateVehicleDispatchRoute()
    {
    }

    /**
     * Test case for deactivateDriver
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     */
    public function testDeactivateDriver()
    {
    }

    /**
     * Test case for deleteDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/.
     *
     */
    public function testDeleteDispatchRouteById()
    {
    }

    /**
     * Test case for deleteOrganizationAddress
     *
     * /addresses/{addressId}.
     *
     */
    public function testDeleteOrganizationAddress()
    {
    }

    /**
     * Test case for fetchAllDispatchRoutes
     *
     * /fleet/dispatch/routes.
     *
     */
    public function testFetchAllDispatchRoutes()
    {
    }

    /**
     * Test case for fetchAllRouteJobUpdates
     *
     * /fleet/dispatch/routes/job_updates.
     *
     */
    public function testFetchAllRouteJobUpdates()
    {
    }

    /**
     * Test case for getAllAssetCurrentLocations
     *
     * /fleet/assets/locations.
     *
     */
    public function testGetAllAssetCurrentLocations()
    {
    }

    /**
     * Test case for getAllAssets
     *
     * /fleet/assets.
     *
     */
    public function testGetAllAssets()
    {
    }

    /**
     * Test case for getAllDeactivatedDrivers
     *
     * /fleet/drivers/inactive.
     *
     */
    public function testGetAllDeactivatedDrivers()
    {
    }

    /**
     * Test case for getAssetLocation
     *
     * /fleet/assets/{assetId:[0-9]+}/locations.
     *
     */
    public function testGetAssetLocation()
    {
    }

    /**
     * Test case for getAssetReefer
     *
     * /fleet/assets/{assetId:[0-9]+}/reefer.
     *
     */
    public function testGetAssetReefer()
    {
    }

    /**
     * Test case for getDeactivatedDriverById
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     */
    public function testGetDeactivatedDriverById()
    {
    }

    /**
     * Test case for getDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}.
     *
     */
    public function testGetDispatchRouteById()
    {
    }

    /**
     * Test case for getDispatchRouteHistory
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history.
     *
     */
    public function testGetDispatchRouteHistory()
    {
    }

    /**
     * Test case for getDispatchRoutesByDriverId
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes.
     *
     */
    public function testGetDispatchRoutesByDriverId()
    {
    }

    /**
     * Test case for getDispatchRoutesByVehicleId
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes.
     *
     */
    public function testGetDispatchRoutesByVehicleId()
    {
    }

    /**
     * Test case for getDriverById
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     */
    public function testGetDriverById()
    {
    }

    /**
     * Test case for getDriverDocumentTypesByOrgId
     *
     * /fleet/drivers/document_types.
     *
     */
    public function testGetDriverDocumentTypesByOrgId()
    {
    }

    /**
     * Test case for getDriverDocumentsByOrgId
     *
     * /fleet/drivers/documents.
     *
     */
    public function testGetDriverDocumentsByOrgId()
    {
    }

    /**
     * Test case for getDriverSafetyScore
     *
     * /fleet/drivers/{driverId:[0-9]+}/safety/score.
     *
     */
    public function testGetDriverSafetyScore()
    {
    }

    /**
     * Test case for getDvirs
     *
     * /fleet/maintenance/dvirs.
     *
     */
    public function testGetDvirs()
    {
    }

    /**
     * Test case for getFleetDrivers
     *
     * /fleet/drivers.
     *
     */
    public function testGetFleetDrivers()
    {
    }

    /**
     * Test case for getFleetDriversHosDailyLogs
     *
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs.
     *
     */
    public function testGetFleetDriversHosDailyLogs()
    {
    }

    /**
     * Test case for getFleetDriversSummary
     *
     * /fleet/drivers/summary.
     *
     */
    public function testGetFleetDriversSummary()
    {
    }

    /**
     * Test case for getFleetHosAuthenticationLogs
     *
     * /fleet/hos_authentication_logs.
     *
     */
    public function testGetFleetHosAuthenticationLogs()
    {
    }

    /**
     * Test case for getFleetHosLogs
     *
     * /fleet/hos_logs.
     *
     */
    public function testGetFleetHosLogs()
    {
    }

    /**
     * Test case for getFleetHosLogsSummary
     *
     * /fleet/hos_logs_summary.
     *
     */
    public function testGetFleetHosLogsSummary()
    {
    }

    /**
     * Test case for getFleetLocations
     *
     * /fleet/locations.
     *
     */
    public function testGetFleetLocations()
    {
    }

    /**
     * Test case for getFleetMaintenanceList
     *
     * /fleet/maintenance/list.
     *
     */
    public function testGetFleetMaintenanceList()
    {
    }

    /**
     * Test case for getFleetTrips
     *
     * /fleet/trips.
     *
     */
    public function testGetFleetTrips()
    {
    }

    /**
     * Test case for getFleetVehicle
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     */
    public function testGetFleetVehicle()
    {
    }

    /**
     * Test case for getOrganizationAddress
     *
     * /addresses/{addressId}.
     *
     */
    public function testGetOrganizationAddress()
    {
    }

    /**
     * Test case for getOrganizationAddresses
     *
     * /addresses.
     *
     */
    public function testGetOrganizationAddresses()
    {
    }

    /**
     * Test case for getOrganizationContact
     *
     * /contacts/{contact_id}.
     *
     */
    public function testGetOrganizationContact()
    {
    }

    /**
     * Test case for getVehicleHarshEvent
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event.
     *
     */
    public function testGetVehicleHarshEvent()
    {
    }

    /**
     * Test case for getVehicleLocations
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations.
     *
     */
    public function testGetVehicleLocations()
    {
    }

    /**
     * Test case for getVehicleSafetyScore
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score.
     *
     */
    public function testGetVehicleSafetyScore()
    {
    }

    /**
     * Test case for getVehicleStats
     *
     * /fleet/vehicles/stats.
     *
     */
    public function testGetVehicleStats()
    {
    }

    /**
     * Test case for getVehiclesLocations
     *
     * /fleet/vehicles/locations.
     *
     */
    public function testGetVehiclesLocations()
    {
    }

    /**
     * Test case for listContacts
     *
     * /contacts.
     *
     */
    public function testListContacts()
    {
    }

    /**
     * Test case for listFleet
     *
     * /fleet/list.
     *
     */
    public function testListFleet()
    {
    }

    /**
     * Test case for patchFleetVehicle
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     */
    public function testPatchFleetVehicle()
    {
    }

    /**
     * Test case for reactivateDriverById
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}.
     *
     */
    public function testReactivateDriverById()
    {
    }

    /**
     * Test case for updateDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/.
     *
     */
    public function testUpdateDispatchRouteById()
    {
    }

    /**
     * Test case for updateOrganizationAddress
     *
     * /addresses/{addressId}.
     *
     */
    public function testUpdateOrganizationAddress()
    {
    }

    /**
     * Test case for updateVehicles
     *
     * /fleet/set_data.
     *
     */
    public function testUpdateVehicles()
    {
    }
}
