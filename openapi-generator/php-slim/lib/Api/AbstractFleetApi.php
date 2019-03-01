<?php
/**
 * AbstractFleetApi
 *
 * PHP version 7
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 * OpenAPI spec version: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */
namespace OpenAPIServer\Api;

use Psr\Container\ContainerInterface;
use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;
use Exception;

/**
 * AbstractFleetApi Class Doc Comment
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
abstract class AbstractFleetApi
{

    /**
     * @var ContainerInterface Slim app container instance
     */
    protected $container;

    /**
     * Route Controller constructor receives container
     *
     * @param ContainerInterface $container Slim app container instance
     */
    public function __construct(ContainerInterface $container)
    {
        $this->container = $container;
    }


    /**
     * POST addFleetAddress
     * Summary: /fleet/add_address
     * Notes: This method adds an address book entry to the specified group.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function addFleetAddress(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing addFleetAddress as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST addOrganizationAddresses
     * Summary: /addresses
     * Notes: Add one or more addresses to the organization
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function addOrganizationAddresses(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing addOrganizationAddresses as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST createDispatchRoute
     * Summary: /fleet/dispatch/routes
     * Notes: Create a new dispatch route.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function createDispatchRoute(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing createDispatchRoute as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST createDriver
     * Summary: /fleet/drivers/create
     * Notes: Create a new driver.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function createDriver(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing createDriver as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST createDriverDispatchRoute
     * Summary: /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Notes: Create a new dispatch route for the driver with driver_id.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function createDriverDispatchRoute(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $driverId = $args['driver_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing createDriverDispatchRoute as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST createDriverDocument
     * Summary: /fleet/drivers/{driver_id:[0-9]+}/documents
     * Notes: Create a driver document for the given driver.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function createDriverDocument(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $driverId = $args['driver_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing createDriverDocument as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST createDvir
     * Summary: /fleet/maintenance/dvirs
     * Notes: Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function createDvir(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing createDvir as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST createVehicleDispatchRoute
     * Summary: /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Notes: Create a new dispatch route for the vehicle with vehicle_id.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function createVehicleDispatchRoute(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $vehicleId = $args['vehicle_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing createVehicleDispatchRoute as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * DELETE deactivateDriver
     * Summary: /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Notes: Deactivate a driver with the given id.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function deactivateDriver(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $driverIdOrExternalId = $args['driver_id_or_external_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $message = "How about implementing deactivateDriver as a DELETE method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * DELETE deleteDispatchRouteById
     * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Notes: Delete a dispatch route and its associated jobs.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function deleteDispatchRouteById(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $routeId = $args['route_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $message = "How about implementing deleteDispatchRouteById as a DELETE method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * DELETE deleteOrganizationAddress
     * Summary: /addresses/{addressId}
     * Notes: Delete an address.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function deleteOrganizationAddress(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $addressId = $args['addressId'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $message = "How about implementing deleteOrganizationAddress as a DELETE method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET fetchAllDispatchRoutes
     * Summary: /fleet/dispatch/routes
     * Notes: Fetch all of the dispatch routes for the group.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function fetchAllDispatchRoutes(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $groupId = $request->getQueryParam('group_id');
        $endTime = $request->getQueryParam('end_time');
        $duration = $request->getQueryParam('duration');
        $message = "How about implementing fetchAllDispatchRoutes as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET fetchAllRouteJobUpdates
     * Summary: /fleet/dispatch/routes/job_updates
     * Notes: Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function fetchAllRouteJobUpdates(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $groupId = $request->getQueryParam('group_id');
        $sequenceId = $request->getQueryParam('sequence_id');
        $include = $request->getQueryParam('include');
        $message = "How about implementing fetchAllRouteJobUpdates as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getAllAssetCurrentLocations
     * Summary: /fleet/assets/locations
     * Notes: Fetch current locations of all assets for the group.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getAllAssetCurrentLocations(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $groupId = $request->getQueryParam('group_id');
        $message = "How about implementing getAllAssetCurrentLocations as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getAllAssets
     * Summary: /fleet/assets
     * Notes: Fetch all of the assets for the group.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getAllAssets(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $groupId = $request->getQueryParam('group_id');
        $message = "How about implementing getAllAssets as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getAllDeactivatedDrivers
     * Summary: /fleet/drivers/inactive
     * Notes: Fetch all deactivated drivers for the group.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getAllDeactivatedDrivers(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $groupId = $request->getQueryParam('group_id');
        $message = "How about implementing getAllDeactivatedDrivers as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getAssetLocation
     * Summary: /fleet/assets/{assetId:[0-9]+}/locations
     * Notes: Fetch the historical locations for the asset.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getAssetLocation(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $assetId = $args['asset_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $startMs = $request->getQueryParam('startMs');
        $endMs = $request->getQueryParam('endMs');
        $message = "How about implementing getAssetLocation as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getAssetReefer
     * Summary: /fleet/assets/{assetId:[0-9]+}/reefer
     * Notes: Fetch the reefer-specific stats of an asset.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getAssetReefer(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $assetId = $args['asset_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $startMs = $request->getQueryParam('startMs');
        $endMs = $request->getQueryParam('endMs');
        $message = "How about implementing getAssetReefer as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getDeactivatedDriverById
     * Summary: /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Notes: Fetch deactivated driver by id.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getDeactivatedDriverById(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $driverIdOrExternalId = $args['driver_id_or_external_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $message = "How about implementing getDeactivatedDriverById as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getDispatchRouteById
     * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}
     * Notes: Fetch a dispatch route by id.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getDispatchRouteById(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $routeId = $args['route_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $message = "How about implementing getDispatchRouteById as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getDispatchRouteHistory
     * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * Notes: Fetch the history of a dispatch route.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getDispatchRouteHistory(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $routeId = $args['route_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $startTime = $request->getQueryParam('start_time');
        $endTime = $request->getQueryParam('end_time');
        $message = "How about implementing getDispatchRouteHistory as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getDispatchRoutesByDriverId
     * Summary: /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Notes: Fetch all of the dispatch routes for a given driver.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getDispatchRoutesByDriverId(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $driverId = $args['driver_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $endTime = $request->getQueryParam('end_time');
        $duration = $request->getQueryParam('duration');
        $message = "How about implementing getDispatchRoutesByDriverId as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getDispatchRoutesByVehicleId
     * Summary: /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Notes: Fetch all of the dispatch routes for a given vehicle.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getDispatchRoutesByVehicleId(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $vehicleId = $args['vehicle_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $endTime = $request->getQueryParam('end_time');
        $duration = $request->getQueryParam('duration');
        $message = "How about implementing getDispatchRoutesByVehicleId as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getDriverById
     * Summary: /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Notes: Fetch driver by id.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getDriverById(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $driverIdOrExternalId = $args['driver_id_or_external_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $message = "How about implementing getDriverById as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getDriverDocumentTypesByOrgId
     * Summary: /fleet/drivers/document_types
     * Notes: Fetch all of the document types.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getDriverDocumentTypesByOrgId(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $message = "How about implementing getDriverDocumentTypesByOrgId as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getDriverDocumentsByOrgId
     * Summary: /fleet/drivers/documents
     * Notes: Fetch all of the documents.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getDriverDocumentsByOrgId(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $endMs = $request->getQueryParam('endMs');
        $durationMs = $request->getQueryParam('durationMs');
        $message = "How about implementing getDriverDocumentsByOrgId as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getDriverSafetyScore
     * Summary: /fleet/drivers/{driverId:[0-9]+}/safety/score
     * Notes: Fetch the safety score for the driver.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getDriverSafetyScore(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $driverId = $args['driverId'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $startMs = $request->getQueryParam('startMs');
        $endMs = $request->getQueryParam('endMs');
        $message = "How about implementing getDriverSafetyScore as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getDvirs
     * Summary: /fleet/maintenance/dvirs
     * Notes: Get DVIRs for the org within provided time constraints
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getDvirs(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $endMs = $request->getQueryParam('end_ms');
        $durationMs = $request->getQueryParam('duration_ms');
        $groupId = $request->getQueryParam('group_id');
        $message = "How about implementing getDvirs as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST getFleetDrivers
     * Summary: /fleet/drivers
     * Notes: Get all the drivers for the specified group.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getFleetDrivers(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing getFleetDrivers as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST getFleetDriversHosDailyLogs
     * Summary: /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     * Notes: Get summarized daily HOS charts for a specified driver.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getFleetDriversHosDailyLogs(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $driverId = $args['driver_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing getFleetDriversHosDailyLogs as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST getFleetDriversSummary
     * Summary: /fleet/drivers/summary
     * Notes: Get the distance and time each driver in an organization has driven in a given time period.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getFleetDriversSummary(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $snapToDayBounds = $request->getQueryParam('snap_to_day_bounds');
        $body = $request->getParsedBody();
        $message = "How about implementing getFleetDriversSummary as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST getFleetHosAuthenticationLogs
     * Summary: /fleet/hos_authentication_logs
     * Notes: Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getFleetHosAuthenticationLogs(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing getFleetHosAuthenticationLogs as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST getFleetHosLogs
     * Summary: /fleet/hos_logs
     * Notes: Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getFleetHosLogs(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing getFleetHosLogs as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST getFleetHosLogsSummary
     * Summary: /fleet/hos_logs_summary
     * Notes: Get the current HOS status for all drivers in the group.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getFleetHosLogsSummary(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing getFleetHosLogsSummary as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST getFleetLocations
     * Summary: /fleet/locations
     * Notes: Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getFleetLocations(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing getFleetLocations as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST getFleetMaintenanceList
     * Summary: /fleet/maintenance/list
     * Notes: Get list of the vehicles with any engine faults or check light data.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getFleetMaintenanceList(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing getFleetMaintenanceList as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST getFleetTrips
     * Summary: /fleet/trips
     * Notes: Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getFleetTrips(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing getFleetTrips as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getFleetVehicle
     * Summary: /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Notes: Gets a specific vehicle.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getFleetVehicle(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $vehicleIdOrExternalId = $args['vehicle_id_or_external_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $message = "How about implementing getFleetVehicle as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getOrganizationAddress
     * Summary: /addresses/{addressId}
     * Notes: Fetch an address by its id.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getOrganizationAddress(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $addressId = $args['addressId'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $message = "How about implementing getOrganizationAddress as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getOrganizationAddresses
     * Summary: /addresses
     * Notes: Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getOrganizationAddresses(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $message = "How about implementing getOrganizationAddresses as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getOrganizationContact
     * Summary: /contacts/{contact_id}
     * Notes: Fetch a contact by its id.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getOrganizationContact(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $contactId = $args['contact_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $message = "How about implementing getOrganizationContact as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getVehicleHarshEvent
     * Summary: /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * Notes: Fetch harsh event details for a vehicle.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getVehicleHarshEvent(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $vehicleId = $args['vehicleId'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $timestamp = $request->getQueryParam('timestamp');
        $message = "How about implementing getVehicleHarshEvent as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getVehicleLocations
     * Summary: /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * Notes: Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getVehicleLocations(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $vehicleId = $args['vehicle_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $startMs = $request->getQueryParam('startMs');
        $endMs = $request->getQueryParam('endMs');
        $message = "How about implementing getVehicleLocations as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getVehicleSafetyScore
     * Summary: /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * Notes: Fetch the safety score for the vehicle.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getVehicleSafetyScore(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $vehicleId = $args['vehicleId'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $startMs = $request->getQueryParam('startMs');
        $endMs = $request->getQueryParam('endMs');
        $message = "How about implementing getVehicleSafetyScore as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getVehicleStats
     * Summary: /fleet/vehicles/stats
     * Notes: Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getVehicleStats(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $startMs = $request->getQueryParam('startMs');
        $endMs = $request->getQueryParam('endMs');
        $series = $request->getQueryParam('series');
        $tagIds = $request->getQueryParam('tagIds');
        $startingAfter = $request->getQueryParam('startingAfter');
        $endingBefore = $request->getQueryParam('endingBefore');
        $limit = $request->getQueryParam('limit');
        $message = "How about implementing getVehicleStats as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET getVehiclesLocations
     * Summary: /fleet/vehicles/locations
     * Notes: Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function getVehiclesLocations(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $startMs = $request->getQueryParam('startMs');
        $endMs = $request->getQueryParam('endMs');
        $message = "How about implementing getVehiclesLocations as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * GET listContacts
     * Summary: /contacts
     * Notes: Fetch all contacts for the organization.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function listContacts(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $message = "How about implementing listContacts as a GET method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST listFleet
     * Summary: /fleet/list
     * Notes: Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function listFleet(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $startingAfter = $request->getQueryParam('startingAfter');
        $endingBefore = $request->getQueryParam('endingBefore');
        $limit = $request->getQueryParam('limit');
        $body = $request->getParsedBody();
        $message = "How about implementing listFleet as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * PATCH patchFleetVehicle
     * Summary: /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Notes: Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function patchFleetVehicle(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $vehicleIdOrExternalId = $args['vehicle_id_or_external_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing patchFleetVehicle as a PATCH method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * PUT reactivateDriverById
     * Summary: /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Notes: Reactivate the inactive driver having id.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function reactivateDriverById(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $driverIdOrExternalId = $args['driver_id_or_external_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing reactivateDriverById as a PUT method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * PUT updateDispatchRouteById
     * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Notes: Update a dispatch route and its associated jobs.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function updateDispatchRouteById(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $routeId = $args['route_id'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing updateDispatchRouteById as a PUT method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * PATCH updateOrganizationAddress
     * Summary: /addresses/{addressId}
     * Notes: Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function updateOrganizationAddress(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $addressId = $args['addressId'];
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing updateOrganizationAddress as a PATCH method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }

    /**
     * POST updateVehicles
     * Summary: /fleet/set_data
     * Notes: This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param array|null             $args     Path arguments
     *
     * @return ResponseInterface
     * @throws Exception to force implementation class to override this method
     */
    public function updateVehicles(ServerRequestInterface $request, ResponseInterface $response, array $args)
    {
        $queryParams = $request->getQueryParams();
        $accessToken = $request->getQueryParam('access_token');
        $body = $request->getParsedBody();
        $message = "How about implementing updateVehicles as a POST method in OpenAPIServer\Api\FleetApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }
}
