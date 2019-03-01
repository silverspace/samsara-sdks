<?php

/**
 * FleetController
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
use OpenAPI\Server\Api\FleetApiInterface;
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
 * FleetController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class FleetController extends Controller
{

    /**
     * Operation addFleetAddress
     *
     * /fleet/add_address
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function addFleetAddressAction(Request $request)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        $inputFormat = $request->headers->has('Content-Type')?$request->headers->get('Content-Type'):$consumes[0];
        if (!in_array($inputFormat, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $addressParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $addressParam = $this->deserialize($addressParam, 'OpenAPI\Server\Model\InlineObject2', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject2");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($addressParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 204;
            $responseHeaders = [];
            $result = $handler->addFleetAddress($accessToken, $addressParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Address was successfully added. No response body is returned.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Address was successfully added. No response body is returned.';
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
     * Operation addOrganizationAddresses
     *
     * /addresses
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function addOrganizationAddressesAction(Request $request)
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
        $addresses = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $addresses = $this->deserialize($addresses, 'OpenAPI\Server\Model\InlineObject', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($addresses, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->addOrganizationAddresses($accessToken, $addresses, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'List of added addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'List of added addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.';
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
     * Operation createDriver
     *
     * /fleet/drivers/create
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function createDriverAction(Request $request)
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
        $createDriverParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $createDriverParam = $this->deserialize($createDriverParam, 'OpenAPI\Server\Model\DriverForCreate', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\DriverForCreate");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($createDriverParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->createDriver($accessToken, $createDriverParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns the successfully created the driver.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns the successfully created the driver.';
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
     * Operation createDriverDocument
     *
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function createDriverDocumentAction(Request $request, $driverId)
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
        $createDocumentParams = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $driverId = $this->deserialize($driverId, 'int', 'string');
            $createDocumentParams = $this->deserialize($createDocumentParams, 'OpenAPI\Server\Model\DocumentCreate', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\DocumentCreate");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($createDocumentParams, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->createDriverDocument($accessToken, $driverId, $createDocumentParams, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns the created document.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns the created document.';
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
     * Operation createDvir
     *
     * /fleet/maintenance/dvirs
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function createDvirAction(Request $request)
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
        $createDvirParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $createDvirParam = $this->deserialize($createDvirParam, 'OpenAPI\Server\Model\InlineObject12', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject12");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($createDvirParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->createDvir($accessToken, $createDvirParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Newly created DVIR.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Newly created DVIR.';
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
     * Operation deactivateDriver
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function deactivateDriverAction(Request $request, $driverIdOrExternalId)
    {
        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $driverIdOrExternalId = $this->deserialize($driverIdOrExternalId, 'string', 'string');
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
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($driverIdOrExternalId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 204;
            $responseHeaders = [];
            $result = $handler->deactivateDriver($accessToken, $driverIdOrExternalId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.';
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
     * Operation deleteOrganizationAddress
     *
     * /addresses/{addressId}
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function deleteOrganizationAddressAction(Request $request, $addressId)
    {
        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $addressId = $this->deserialize($addressId, 'int', 'string');
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
        $response = $this->validate($addressId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 204;
            $responseHeaders = [];
            $result = $handler->deleteOrganizationAddress($accessToken, $addressId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Address was successfully deleted. No response body is returned.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Address was successfully deleted. No response body is returned.';
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
     * Operation getAllAssetCurrentLocations
     *
     * /fleet/assets/locations
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getAllAssetCurrentLocationsAction(Request $request)
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

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $groupId = $this->deserialize($groupId, 'int', 'string');
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


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getAllAssetCurrentLocations($accessToken, $groupId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'List of assets and their current locations.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'List of assets and their current locations.';
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
     * Operation getAllAssets
     *
     * /fleet/assets
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getAllAssetsAction(Request $request)
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

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $groupId = $this->deserialize($groupId, 'int', 'string');
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


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getAllAssets($accessToken, $groupId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'List of assets.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'List of assets.';
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
     * Operation getAllDeactivatedDrivers
     *
     * /fleet/drivers/inactive
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getAllDeactivatedDriversAction(Request $request)
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

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $groupId = $this->deserialize($groupId, 'int', 'string');
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


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getAllDeactivatedDrivers($accessToken, $groupId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}';
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
     * Operation getAssetLocation
     *
     * /fleet/assets/{assetId:[0-9]+}/locations
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getAssetLocationAction(Request $request, $assetId)
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
        $startMs = $request->query->get('startMs');
        $endMs = $request->query->get('endMs');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $assetId = $this->deserialize($assetId, 'int', 'string');
            $startMs = $this->deserialize($startMs, 'int', 'string');
            $endMs = $this->deserialize($endMs, 'int', 'string');
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
        $response = $this->validate($assetId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($startMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($endMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getAssetLocation($accessToken, $assetId, $startMs, $endMs, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Asset location details.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Asset location details.';
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
     * Operation getAssetReefer
     *
     * /fleet/assets/{assetId:[0-9]+}/reefer
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getAssetReeferAction(Request $request, $assetId)
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
        $startMs = $request->query->get('startMs');
        $endMs = $request->query->get('endMs');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $assetId = $this->deserialize($assetId, 'int', 'string');
            $startMs = $this->deserialize($startMs, 'int', 'string');
            $endMs = $this->deserialize($endMs, 'int', 'string');
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
        $response = $this->validate($assetId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($startMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($endMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getAssetReefer($accessToken, $assetId, $startMs, $endMs, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Reefer-specific asset details.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Reefer-specific asset details.';
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
     * Operation getDeactivatedDriverById
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getDeactivatedDriverByIdAction(Request $request, $driverIdOrExternalId)
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
            $driverIdOrExternalId = $this->deserialize($driverIdOrExternalId, 'string', 'string');
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
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($driverIdOrExternalId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getDeactivatedDriverById($accessToken, $driverIdOrExternalId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns the deactivated driver with the given driver_id.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns the deactivated driver with the given driver_id.';
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
     * Operation getDriverById
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getDriverByIdAction(Request $request, $driverIdOrExternalId)
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
            $driverIdOrExternalId = $this->deserialize($driverIdOrExternalId, 'string', 'string');
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
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($driverIdOrExternalId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getDriverById($accessToken, $driverIdOrExternalId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns the driver for the given driver_id.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns the driver for the given driver_id.';
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
     * Operation getDriverDocumentTypesByOrgId
     *
     * /fleet/drivers/document_types
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getDriverDocumentTypesByOrgIdAction(Request $request)
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

        // Use the default value if no value was provided

        // Validate the input values


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getDriverDocumentTypesByOrgId($responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns all of the document types.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns all of the document types.';
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
     * Operation getDriverDocumentsByOrgId
     *
     * /fleet/drivers/documents
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getDriverDocumentsByOrgIdAction(Request $request)
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
        $endMs = $request->query->get('endMs');
        $durationMs = $request->query->get('durationMs');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $endMs = $this->deserialize($endMs, 'int', 'string');
            $durationMs = $this->deserialize($durationMs, 'int', 'string');
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
        $response = $this->validate($endMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($durationMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getDriverDocumentsByOrgId($accessToken, $endMs, $durationMs, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns all of the documents.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns all of the documents.';
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
     * Operation getDriverSafetyScore
     *
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getDriverSafetyScoreAction(Request $request, $driverId)
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
        $startMs = $request->query->get('startMs');
        $endMs = $request->query->get('endMs');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $driverId = $this->deserialize($driverId, 'int', 'string');
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $startMs = $this->deserialize($startMs, 'int', 'string');
            $endMs = $this->deserialize($endMs, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($driverId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
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
        $response = $this->validate($startMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($endMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getDriverSafetyScore($driverId, $accessToken, $startMs, $endMs, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Safety score details.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Safety score details.';
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
     * Operation getDvirs
     *
     * /fleet/maintenance/dvirs
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getDvirsAction(Request $request)
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
        $endMs = $request->query->get('endMs');
        $durationMs = $request->query->get('durationMs');
        $groupId = $request->query->get('groupId');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $endMs = $this->deserialize($endMs, 'int', 'string');
            $durationMs = $this->deserialize($durationMs, 'int', 'string');
            $groupId = $this->deserialize($groupId, 'int', 'string');
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
        $response = $this->validate($endMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($durationMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($groupId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getDvirs($accessToken, $endMs, $durationMs, $groupId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'DVIRs for the specified duration.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'DVIRs for the specified duration.';
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
     * Operation getFleetDrivers
     *
     * /fleet/drivers
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getFleetDriversAction(Request $request)
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
        $groupDriversParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $groupDriversParam = $this->deserialize($groupDriversParam, 'OpenAPI\Server\Model\InlineObject3', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject3");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($groupDriversParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getFleetDrivers($accessToken, $groupDriversParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'All drivers in the group.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'All drivers in the group.';
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
     * Operation getFleetDriversHosDailyLogs
     *
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getFleetDriversHosDailyLogsAction(Request $request, $driverId)
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
        $hosLogsParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $driverId = $this->deserialize($driverId, 'int', 'string');
            $hosLogsParam = $this->deserialize($hosLogsParam, 'OpenAPI\Server\Model\InlineObject6', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject6");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($hosLogsParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getFleetDriversHosDailyLogs($accessToken, $driverId, $hosLogsParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Distance traveled and time active for each driver in the organization over the specified time period.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Distance traveled and time active for each driver in the organization over the specified time period.';
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
     * Operation getFleetDriversSummary
     *
     * /fleet/drivers/summary
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getFleetDriversSummaryAction(Request $request)
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
        $snapToDayBounds = $request->query->get('snapToDayBounds');
        $driversSummaryParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $driversSummaryParam = $this->deserialize($driversSummaryParam, 'OpenAPI\Server\Model\InlineObject5', $inputFormat);
            $snapToDayBounds = $this->deserialize($snapToDayBounds, 'bool', 'string');
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject5");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($driversSummaryParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("bool");
        $response = $this->validate($snapToDayBounds, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getFleetDriversSummary($accessToken, $driversSummaryParam, $snapToDayBounds, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Distance traveled and time active for each driver in the organization over the specified time period.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Distance traveled and time active for each driver in the organization over the specified time period.';
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
     * Operation getFleetHosAuthenticationLogs
     *
     * /fleet/hos_authentication_logs
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getFleetHosAuthenticationLogsAction(Request $request)
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
        $hosAuthenticationLogsParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $hosAuthenticationLogsParam = $this->deserialize($hosAuthenticationLogsParam, 'OpenAPI\Server\Model\InlineObject7', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject7");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($hosAuthenticationLogsParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getFleetHosAuthenticationLogs($accessToken, $hosAuthenticationLogsParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'HOS authentication logs for the specified driver.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'HOS authentication logs for the specified driver.';
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
     * Operation getFleetHosLogs
     *
     * /fleet/hos_logs
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getFleetHosLogsAction(Request $request)
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
        $hosLogsParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $hosLogsParam = $this->deserialize($hosLogsParam, 'OpenAPI\Server\Model\InlineObject8', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject8");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($hosLogsParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getFleetHosLogs($accessToken, $hosLogsParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'HOS logs for the specified driver.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'HOS logs for the specified driver.';
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
     * Operation getFleetHosLogsSummary
     *
     * /fleet/hos_logs_summary
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getFleetHosLogsSummaryAction(Request $request)
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
        $hosLogsParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $hosLogsParam = $this->deserialize($hosLogsParam, 'OpenAPI\Server\Model\InlineObject9', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject9");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($hosLogsParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getFleetHosLogsSummary($accessToken, $hosLogsParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'HOS logs for the specified driver.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'HOS logs for the specified driver.';
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
     * Operation getFleetLocations
     *
     * /fleet/locations
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getFleetLocationsAction(Request $request)
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
        $groupParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $groupParam = $this->deserialize($groupParam, 'OpenAPI\Server\Model\InlineObject11', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject11");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($groupParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getFleetLocations($accessToken, $groupParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'List of vehicle objects containing their location and the time at which that location was logged.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'List of vehicle objects containing their location and the time at which that location was logged.';
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
     * Operation getFleetMaintenanceList
     *
     * /fleet/maintenance/list
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getFleetMaintenanceListAction(Request $request)
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
        $groupParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $groupParam = $this->deserialize($groupParam, 'OpenAPI\Server\Model\InlineObject13', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject13");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($groupParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getFleetMaintenanceList($accessToken, $groupParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'List of vehicles and maintenance information about each.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'List of vehicles and maintenance information about each.';
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
     * Operation getFleetTrips
     *
     * /fleet/trips
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getFleetTripsAction(Request $request)
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
        $tripsParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $tripsParam = $this->deserialize($tripsParam, 'OpenAPI\Server\Model\InlineObject15', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject15");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($tripsParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getFleetTrips($accessToken, $tripsParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'List of trips taken by the requested vehicle within the specified timeframe.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'List of trips taken by the requested vehicle within the specified timeframe.';
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
     * Operation getFleetVehicle
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getFleetVehicleAction(Request $request, $vehicleIdOrExternalId)
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
            $vehicleIdOrExternalId = $this->deserialize($vehicleIdOrExternalId, 'string', 'string');
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
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($vehicleIdOrExternalId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getFleetVehicle($accessToken, $vehicleIdOrExternalId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'The specified vehicle.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'The specified vehicle.';
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
     * Operation getOrganizationAddress
     *
     * /addresses/{addressId}
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getOrganizationAddressAction(Request $request, $addressId)
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
            $addressId = $this->deserialize($addressId, 'int', 'string');
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
        $response = $this->validate($addressId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getOrganizationAddress($accessToken, $addressId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'The address/geofence. The geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'The address/geofence. The geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.';
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
     * Operation getOrganizationAddresses
     *
     * /addresses
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getOrganizationAddressesAction(Request $request)
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


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getOrganizationAddresses($accessToken, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'List of addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'List of addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.';
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
     * Operation getOrganizationContact
     *
     * /contacts/{contact_id}
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getOrganizationContactAction(Request $request, $contactId)
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
            $contactId = $this->deserialize($contactId, 'int', 'string');
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
        $response = $this->validate($contactId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getOrganizationContact($accessToken, $contactId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'The contact.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'The contact.';
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
     * Operation getVehicleHarshEvent
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getVehicleHarshEventAction(Request $request, $vehicleId)
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
        $timestamp = $request->query->get('timestamp');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $vehicleId = $this->deserialize($vehicleId, 'int', 'string');
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $timestamp = $this->deserialize($timestamp, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($vehicleId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
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
        $response = $this->validate($timestamp, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getVehicleHarshEvent($vehicleId, $accessToken, $timestamp, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Harsh event details.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Harsh event details.';
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
     * Operation getVehicleLocations
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getVehicleLocationsAction(Request $request, $vehicleId)
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
        $startMs = $request->query->get('startMs');
        $endMs = $request->query->get('endMs');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $vehicleId = $this->deserialize($vehicleId, 'int', 'string');
            $startMs = $this->deserialize($startMs, 'int', 'string');
            $endMs = $this->deserialize($endMs, 'int', 'string');
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
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($startMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($endMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getVehicleLocations($accessToken, $vehicleId, $startMs, $endMs, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.';
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
     * Operation getVehicleSafetyScore
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getVehicleSafetyScoreAction(Request $request, $vehicleId)
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
        $startMs = $request->query->get('startMs');
        $endMs = $request->query->get('endMs');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $vehicleId = $this->deserialize($vehicleId, 'int', 'string');
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $startMs = $this->deserialize($startMs, 'int', 'string');
            $endMs = $this->deserialize($endMs, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($vehicleId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
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
        $response = $this->validate($startMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($endMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getVehicleSafetyScore($vehicleId, $accessToken, $startMs, $endMs, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Safety score details.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Safety score details.';
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
     * Operation getVehicleStats
     *
     * /fleet/vehicles/stats
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getVehicleStatsAction(Request $request)
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
        $startMs = $request->query->get('startMs');
        $endMs = $request->query->get('endMs');
        $series = $request->query->get('series');
        $tagIds = $request->query->get('tagIds');
        $startingAfter = $request->query->get('startingAfter');
        $endingBefore = $request->query->get('endingBefore');
        $limit = $request->query->get('limit');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $startMs = $this->deserialize($startMs, 'int', 'string');
            $endMs = $this->deserialize($endMs, 'int', 'string');
            $series = $this->deserialize($series, 'string', 'string');
            $tagIds = $this->deserialize($tagIds, 'string', 'string');
            $startingAfter = $this->deserialize($startingAfter, 'string', 'string');
            $endingBefore = $this->deserialize($endingBefore, 'string', 'string');
            $limit = $this->deserialize($limit, 'int', 'string');
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
        $response = $this->validate($startMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($endMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Choice([ "engineState", "auxInput1", "auxInput2" ]);
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($series, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($tagIds, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($startingAfter, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($endingBefore, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($limit, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getVehicleStats($accessToken, $startMs, $endMs, $series, $tagIds, $startingAfter, $endingBefore, $limit, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns engine state and/or aux input data for all vehicles in the group between a start/end time.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns engine state and/or aux input data for all vehicles in the group between a start/end time.';
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
     * Operation getVehiclesLocations
     *
     * /fleet/vehicles/locations
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getVehiclesLocationsAction(Request $request)
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
        $startMs = $request->query->get('startMs');
        $endMs = $request->query->get('endMs');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $startMs = $this->deserialize($startMs, 'int', 'string');
            $endMs = $this->deserialize($endMs, 'int', 'string');
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
        $response = $this->validate($startMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($endMs, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getVehiclesLocations($accessToken, $startMs, $endMs, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.';
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
     * Operation listContacts
     *
     * /contacts
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function listContactsAction(Request $request)
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


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->listContacts($accessToken, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'List of contacts.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'List of contacts.';
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
     * Operation listFleet
     *
     * /fleet/list
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function listFleetAction(Request $request)
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
        $startingAfter = $request->query->get('startingAfter');
        $endingBefore = $request->query->get('endingBefore');
        $limit = $request->query->get('limit');
        $groupParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $groupParam = $this->deserialize($groupParam, 'OpenAPI\Server\Model\InlineObject10', $inputFormat);
            $startingAfter = $this->deserialize($startingAfter, 'string', 'string');
            $endingBefore = $this->deserialize($endingBefore, 'string', 'string');
            $limit = $this->deserialize($limit, 'int', 'string');
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject10");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($groupParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($startingAfter, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($endingBefore, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($limit, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->listFleet($accessToken, $groupParam, $startingAfter, $endingBefore, $limit, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'List of vehicles and information about each.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'List of vehicles and information about each.';
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
     * Operation patchFleetVehicle
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function patchFleetVehicleAction(Request $request, $vehicleIdOrExternalId)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json', 'application/merge-patch+json'];
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
        $data = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $vehicleIdOrExternalId = $this->deserialize($vehicleIdOrExternalId, 'string', 'string');
            $data = $this->deserialize($data, 'OpenAPI\Server\Model\InlineObject16', $inputFormat);
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
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($vehicleIdOrExternalId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject16");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($data, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->patchFleetVehicle($accessToken, $vehicleIdOrExternalId, $data, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'The updated vehicle.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'The updated vehicle.';
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
     * Operation reactivateDriverById
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function reactivateDriverByIdAction(Request $request, $driverIdOrExternalId)
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
        $reactivateDriverParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $driverIdOrExternalId = $this->deserialize($driverIdOrExternalId, 'string', 'string');
            $reactivateDriverParam = $this->deserialize($reactivateDriverParam, 'OpenAPI\Server\Model\InlineObject4', $inputFormat);
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
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($driverIdOrExternalId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject4");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($reactivateDriverParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->reactivateDriverById($accessToken, $driverIdOrExternalId, $reactivateDriverParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.';
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
     * Operation updateOrganizationAddress
     *
     * /addresses/{addressId}
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function updateOrganizationAddressAction(Request $request, $addressId)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        $inputFormat = $request->headers->has('Content-Type')?$request->headers->get('Content-Type'):$consumes[0];
        if (!in_array($inputFormat, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $address = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $addressId = $this->deserialize($addressId, 'int', 'string');
            $address = $this->deserialize($address, 'OpenAPI\Server\Model\InlineObject1', $inputFormat);
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
        $response = $this->validate($addressId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject1");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($address, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 204;
            $responseHeaders = [];
            $result = $handler->updateOrganizationAddress($accessToken, $addressId, $address, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Address was successfully updated. No response body is returned.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Address was successfully updated. No response body is returned.';
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
     * Operation updateVehicles
     *
     * /fleet/set_data
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function updateVehiclesAction(Request $request)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        $inputFormat = $request->headers->has('Content-Type')?$request->headers->get('Content-Type'):$consumes[0];
        if (!in_array($inputFormat, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $accessToken = $request->query->get('accessToken');
        $vehicleUpdateParam = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $accessToken = $this->deserialize($accessToken, 'string', 'string');
            $vehicleUpdateParam = $this->deserialize($vehicleUpdateParam, 'OpenAPI\Server\Model\InlineObject14', $inputFormat);
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
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\InlineObject14");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($vehicleUpdateParam, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 204;
            $responseHeaders = [];
            $result = $handler->updateVehicles($accessToken, $vehicleUpdateParam, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Vehicles were successfully updated. No response body is returned.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Vehicles were successfully updated. No response body is returned.';
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
     * Returns the handler for this API controller.
     * @return FleetApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('fleet');
    }
}
