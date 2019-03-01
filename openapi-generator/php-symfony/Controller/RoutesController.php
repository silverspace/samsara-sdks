<?php

/**
 * RoutesController
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
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

namespace OpenAPI\Server\Controller;

use \Exception;
use JMS\Serializer\Exception\RuntimeException as SerializerRuntimeException;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpKernel\Exception\HttpException;
use Symfony\Component\Validator\Constraints as Assert;
use OpenAPI\Server\Api\RoutesApiInterface;
use OpenAPI\Server\Model\AllRouteJobUpdates;
use OpenAPI\Server\Model\DispatchRoute;
use OpenAPI\Server\Model\DispatchRouteCreate;
use OpenAPI\Server\Model\DispatchRouteHistory;

/**
 * RoutesController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class RoutesController extends Controller
{

    /**
     * Operation createDispatchRoute
     *
     * /fleet/dispatch/routes
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function createDispatchRouteAction(Request $request)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        $inputFormat = $request->headers->has('Content-Type')?$request->headers->get('Content-Type'):$consumes[0];
        if (!in_array($inputFormat, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $createDispatchRouteParams = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $createDispatchRouteParams = $this->deserialize($createDispatchRouteParams, 'OpenAPI\Server\Model\DispatchRouteCreate', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accessToken, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\DispatchRouteCreate");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($createDispatchRouteParams, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->createDispatchRoute($accessToken, $createDispatchRouteParams, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Created route object including the new route ID.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Created route object including the new route ID.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation createDriverDispatchRoute
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function createDriverDispatchRouteAction(Request $request, $driverId)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        $inputFormat = $request->headers->has('Content-Type')?$request->headers->get('Content-Type'):$consumes[0];
        if (!in_array($inputFormat, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $createDispatchRouteParams = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $driverId = $this->deserialize($driverId, 'int', 'string');
            $createDispatchRouteParams = $this->deserialize($createDispatchRouteParams, 'OpenAPI\Server\Model\DispatchRouteCreate', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accessToken, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($driverId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\DispatchRouteCreate");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($createDispatchRouteParams, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->createDriverDispatchRoute($accessToken, $driverId, $createDispatchRouteParams, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Created route object including the new route ID.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Created route object including the new route ID.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation createVehicleDispatchRoute
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function createVehicleDispatchRouteAction(Request $request, $vehicleId)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        $inputFormat = $request->headers->has('Content-Type')?$request->headers->get('Content-Type'):$consumes[0];
        if (!in_array($inputFormat, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $createDispatchRouteParams = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $vehicleId = $this->deserialize($vehicleId, 'int', 'string');
            $createDispatchRouteParams = $this->deserialize($createDispatchRouteParams, 'OpenAPI\Server\Model\DispatchRouteCreate', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accessToken, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($vehicleId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\DispatchRouteCreate");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($createDispatchRouteParams, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->createVehicleDispatchRoute($accessToken, $vehicleId, $createDispatchRouteParams, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Created route object including the new route ID.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Created route object including the new route ID.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation deleteDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function deleteDispatchRouteByIdAction(Request $request, $routeId)
    {
        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $routeId = $this->deserialize($routeId, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accessToken, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($routeId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 204;
            $responseHeaders = [];
            $result = $handler->deleteDispatchRouteById($accessToken, $routeId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Successfully deleted the dispatch route. No response body is returned.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Successfully deleted the dispatch route. No response body is returned.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                '',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation fetchAllDispatchRoutes
     *
     * /fleet/dispatch/routes
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function fetchAllDispatchRoutesAction(Request $request)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $groupId = $request->query->get('groupId');
        $endTime = $request->query->get('endTime');
        $duration = $request->query->get('duration');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $groupId = $this->deserialize($groupId, 'int', 'string');
            $endTime = $this->deserialize($endTime, 'int', 'string');
            $duration = $this->deserialize($duration, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accessToken, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($groupId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($endTime, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($duration, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->fetchAllDispatchRoutes($accessToken, $groupId, $endTime, $duration, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'All dispatch route objects for the group.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'All dispatch route objects for the group.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation fetchAllRouteJobUpdates
     *
     * /fleet/dispatch/routes/job_updates
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function fetchAllRouteJobUpdatesAction(Request $request)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $groupId = $request->query->get('groupId');
        $sequenceId = $request->query->get('sequenceId');
        $include = $request->query->get('include');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $groupId = $this->deserialize($groupId, 'int', 'string');
            $sequenceId = $this->deserialize($sequenceId, 'string', 'string');
            $include = $this->deserialize($include, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accessToken, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($groupId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($sequenceId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($include, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->fetchAllRouteJobUpdates($accessToken, $groupId, $sequenceId, $include, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'All job updates on routes.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'All job updates on routes.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation getDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getDispatchRouteByIdAction(Request $request, $routeId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $routeId = $this->deserialize($routeId, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accessToken, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($routeId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getDispatchRouteById($accessToken, $routeId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'The dispatch route corresponding to route_id.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'The dispatch route corresponding to route_id.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation getDispatchRouteHistory
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getDispatchRouteHistoryAction(Request $request, $routeId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $startTime = $request->query->get('startTime');
        $endTime = $request->query->get('endTime');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $routeId = $this->deserialize($routeId, 'int', 'string');
            $startTime = $this->deserialize($startTime, 'int', 'string');
            $endTime = $this->deserialize($endTime, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accessToken, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($routeId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($startTime, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($endTime, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getDispatchRouteHistory($accessToken, $routeId, $startTime, $endTime, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'The historical route state changes between start_time and end_time.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'The historical route state changes between start_time and end_time.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation getDispatchRoutesByDriverId
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getDispatchRoutesByDriverIdAction(Request $request, $driverId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $endTime = $request->query->get('endTime');
        $duration = $request->query->get('duration');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $driverId = $this->deserialize($driverId, 'int', 'string');
            $endTime = $this->deserialize($endTime, 'int', 'string');
            $duration = $this->deserialize($duration, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accessToken, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($driverId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($endTime, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($duration, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getDispatchRoutesByDriverId($accessToken, $driverId, $endTime, $duration, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns the dispatch routes for the given driver_id.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns the dispatch routes for the given driver_id.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation getDispatchRoutesByVehicleId
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getDispatchRoutesByVehicleIdAction(Request $request, $vehicleId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $endTime = $request->query->get('endTime');
        $duration = $request->query->get('duration');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $vehicleId = $this->deserialize($vehicleId, 'int', 'string');
            $endTime = $this->deserialize($endTime, 'int', 'string');
            $duration = $this->deserialize($duration, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accessToken, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($vehicleId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($endTime, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($duration, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getDispatchRoutesByVehicleId($accessToken, $vehicleId, $endTime, $duration, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns all of the dispatch routes for the given vehicle_id.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns all of the dispatch routes for the given vehicle_id.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation updateDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function updateDispatchRouteByIdAction(Request $request, $routeId)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        $inputFormat = $request->headers->has('Content-Type')?$request->headers->get('Content-Type'):$consumes[0];
        if (!in_array($inputFormat, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $updateDispatchRouteParams = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $routeId = $this->deserialize($routeId, 'int', 'string');
            $updateDispatchRouteParams = $this->deserialize($updateDispatchRouteParams, 'OpenAPI\Server\Model\DispatchRoute', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accessToken, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($routeId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\DispatchRoute");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($updateDispatchRouteParams, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->updateDispatchRouteById($accessToken, $routeId, $updateDispatchRouteParams, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Returns the handler for this API controller.
     * @return RoutesApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('routes');
    }
}
