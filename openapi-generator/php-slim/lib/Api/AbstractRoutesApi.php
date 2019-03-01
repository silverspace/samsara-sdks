<?php
/**
 * AbstractRoutesApi
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
 * AbstractRoutesApi Class Doc Comment
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
abstract class AbstractRoutesApi
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
        $message = "How about implementing createDispatchRoute as a POST method in OpenAPIServer\Api\RoutesApi class?";
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
        $message = "How about implementing createDriverDispatchRoute as a POST method in OpenAPIServer\Api\RoutesApi class?";
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
        $message = "How about implementing createVehicleDispatchRoute as a POST method in OpenAPIServer\Api\RoutesApi class?";
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
        $message = "How about implementing deleteDispatchRouteById as a DELETE method in OpenAPIServer\Api\RoutesApi class?";
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
        $message = "How about implementing fetchAllDispatchRoutes as a GET method in OpenAPIServer\Api\RoutesApi class?";
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
        $message = "How about implementing fetchAllRouteJobUpdates as a GET method in OpenAPIServer\Api\RoutesApi class?";
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
        $message = "How about implementing getDispatchRouteById as a GET method in OpenAPIServer\Api\RoutesApi class?";
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
        $message = "How about implementing getDispatchRouteHistory as a GET method in OpenAPIServer\Api\RoutesApi class?";
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
        $message = "How about implementing getDispatchRoutesByDriverId as a GET method in OpenAPIServer\Api\RoutesApi class?";
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
        $message = "How about implementing getDispatchRoutesByVehicleId as a GET method in OpenAPIServer\Api\RoutesApi class?";
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
        $message = "How about implementing updateDispatchRouteById as a PUT method in OpenAPIServer\Api\RoutesApi class?";
        throw new Exception($message);

        return $response->write($message)->withStatus(501);
    }
}
