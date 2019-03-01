<?php
/**
 * SafetyApi
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
 * Do not edit the class manually.
 */

namespace Swagger\Client\Api;

use GuzzleHttp\Client;
use GuzzleHttp\ClientInterface;
use GuzzleHttp\Exception\RequestException;
use GuzzleHttp\Psr7\MultipartStream;
use GuzzleHttp\Psr7\Request;
use GuzzleHttp\RequestOptions;
use Swagger\Client\ApiException;
use Swagger\Client\Configuration;
use Swagger\Client\HeaderSelector;
use Swagger\Client\ObjectSerializer;

/**
 * SafetyApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class SafetyApi
{
    /**
     * @var ClientInterface
     */
    protected $client;

    /**
     * @var Configuration
     */
    protected $config;

    /**
     * @var HeaderSelector
     */
    protected $headerSelector;

    /**
     * @param ClientInterface $client
     * @param Configuration   $config
     * @param HeaderSelector  $selector
     */
    public function __construct(
        ClientInterface $client = null,
        Configuration $config = null,
        HeaderSelector $selector = null
    ) {
        $this->client = $client ?: new Client();
        $this->config = $config ?: new Configuration();
        $this->headerSelector = $selector ?: new HeaderSelector();
    }

    /**
     * @return Configuration
     */
    public function getConfig()
    {
        return $this->config;
    }

    /**
     * Operation getDriverSafetyScore
     *
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * @param  int $driver_id ID of the driver (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \Swagger\Client\Model\DriverSafetyScoreResponse
     */
    public function getDriverSafetyScore($driver_id, $access_token, $start_ms, $end_ms)
    {
        list($response) = $this->getDriverSafetyScoreWithHttpInfo($driver_id, $access_token, $start_ms, $end_ms);
        return $response;
    }

    /**
     * Operation getDriverSafetyScoreWithHttpInfo
     *
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * @param  int $driver_id ID of the driver (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \Swagger\Client\Model\DriverSafetyScoreResponse, HTTP status code, HTTP response headers (array of strings)
     */
    public function getDriverSafetyScoreWithHttpInfo($driver_id, $access_token, $start_ms, $end_ms)
    {
        $returnType = '\Swagger\Client\Model\DriverSafetyScoreResponse';
        $request = $this->getDriverSafetyScoreRequest($driver_id, $access_token, $start_ms, $end_ms);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? $e->getResponse()->getBody()->getContents() : null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    $response->getBody()
                );
            }

            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
                if ($returnType !== 'string') {
                    $content = json_decode($content);
                }
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\Swagger\Client\Model\DriverSafetyScoreResponse',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\Swagger\Client\Model\ErrorResponse',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getDriverSafetyScoreAsync
     *
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * @param  int $driver_id ID of the driver (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDriverSafetyScoreAsync($driver_id, $access_token, $start_ms, $end_ms)
    {
        return $this->getDriverSafetyScoreAsyncWithHttpInfo($driver_id, $access_token, $start_ms, $end_ms)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getDriverSafetyScoreAsyncWithHttpInfo
     *
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * @param  int $driver_id ID of the driver (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDriverSafetyScoreAsyncWithHttpInfo($driver_id, $access_token, $start_ms, $end_ms)
    {
        $returnType = '\Swagger\Client\Model\DriverSafetyScoreResponse';
        $request = $this->getDriverSafetyScoreRequest($driver_id, $access_token, $start_ms, $end_ms);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                        if ($returnType !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, $returnType, []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'getDriverSafetyScore'
     *
     * @param  int $driver_id ID of the driver (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getDriverSafetyScoreRequest($driver_id, $access_token, $start_ms, $end_ms)
    {
        // verify the required parameter 'driver_id' is set
        if ($driver_id === null || (is_array($driver_id) && count($driver_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $driver_id when calling getDriverSafetyScore'
            );
        }
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getDriverSafetyScore'
            );
        }
        // verify the required parameter 'start_ms' is set
        if ($start_ms === null || (is_array($start_ms) && count($start_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $start_ms when calling getDriverSafetyScore'
            );
        }
        // verify the required parameter 'end_ms' is set
        if ($end_ms === null || (is_array($end_ms) && count($end_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $end_ms when calling getDriverSafetyScore'
            );
        }

        $resourcePath = '/fleet/drivers/{driverId}/safety/score';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($access_token !== null) {
            $queryParams['access_token'] = ObjectSerializer::toQueryValue($access_token);
        }
        // query params
        if ($start_ms !== null) {
            $queryParams['startMs'] = ObjectSerializer::toQueryValue($start_ms);
        }
        // query params
        if ($end_ms !== null) {
            $queryParams['endMs'] = ObjectSerializer::toQueryValue($end_ms);
        }

        // path params
        if ($driver_id !== null) {
            $resourcePath = str_replace(
                '{' . 'driverId' . '}',
                ObjectSerializer::toPathValue($driver_id),
                $resourcePath
            );
        }

        // body params
        $_tempBody = null;

        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                ['application/json']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['application/json'],
                ['application/json']
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            $httpBody = $_tempBody;
            // \stdClass has no __toString(), so we should encode it manually
            if ($httpBody instanceof \stdClass && $headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($httpBody);
            }
        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $multipartContents[] = [
                        'name' => $formParamName,
                        'contents' => $formParamValue
                    ];
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($formParams);

            } else {
                // for HTTP post (form)
                $httpBody = \GuzzleHttp\Psr7\build_query($formParams);
            }
        }


        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $query = \GuzzleHttp\Psr7\build_query($queryParams);
        return new Request(
            'GET',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation getVehicleHarshEvent
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     *
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \Swagger\Client\Model\VehicleHarshEventResponse
     */
    public function getVehicleHarshEvent($vehicle_id, $access_token, $timestamp)
    {
        list($response) = $this->getVehicleHarshEventWithHttpInfo($vehicle_id, $access_token, $timestamp);
        return $response;
    }

    /**
     * Operation getVehicleHarshEventWithHttpInfo
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     *
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \Swagger\Client\Model\VehicleHarshEventResponse, HTTP status code, HTTP response headers (array of strings)
     */
    public function getVehicleHarshEventWithHttpInfo($vehicle_id, $access_token, $timestamp)
    {
        $returnType = '\Swagger\Client\Model\VehicleHarshEventResponse';
        $request = $this->getVehicleHarshEventRequest($vehicle_id, $access_token, $timestamp);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? $e->getResponse()->getBody()->getContents() : null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    $response->getBody()
                );
            }

            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
                if ($returnType !== 'string') {
                    $content = json_decode($content);
                }
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\Swagger\Client\Model\VehicleHarshEventResponse',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\Swagger\Client\Model\ErrorResponse',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getVehicleHarshEventAsync
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getVehicleHarshEventAsync($vehicle_id, $access_token, $timestamp)
    {
        return $this->getVehicleHarshEventAsyncWithHttpInfo($vehicle_id, $access_token, $timestamp)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getVehicleHarshEventAsyncWithHttpInfo
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getVehicleHarshEventAsyncWithHttpInfo($vehicle_id, $access_token, $timestamp)
    {
        $returnType = '\Swagger\Client\Model\VehicleHarshEventResponse';
        $request = $this->getVehicleHarshEventRequest($vehicle_id, $access_token, $timestamp);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                        if ($returnType !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, $returnType, []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'getVehicleHarshEvent'
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getVehicleHarshEventRequest($vehicle_id, $access_token, $timestamp)
    {
        // verify the required parameter 'vehicle_id' is set
        if ($vehicle_id === null || (is_array($vehicle_id) && count($vehicle_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $vehicle_id when calling getVehicleHarshEvent'
            );
        }
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getVehicleHarshEvent'
            );
        }
        // verify the required parameter 'timestamp' is set
        if ($timestamp === null || (is_array($timestamp) && count($timestamp) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $timestamp when calling getVehicleHarshEvent'
            );
        }

        $resourcePath = '/fleet/vehicles/{vehicleId}/safety/harsh_event';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($access_token !== null) {
            $queryParams['access_token'] = ObjectSerializer::toQueryValue($access_token);
        }
        // query params
        if ($timestamp !== null) {
            $queryParams['timestamp'] = ObjectSerializer::toQueryValue($timestamp);
        }

        // path params
        if ($vehicle_id !== null) {
            $resourcePath = str_replace(
                '{' . 'vehicleId' . '}',
                ObjectSerializer::toPathValue($vehicle_id),
                $resourcePath
            );
        }

        // body params
        $_tempBody = null;

        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                ['application/json']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['application/json'],
                ['application/json']
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            $httpBody = $_tempBody;
            // \stdClass has no __toString(), so we should encode it manually
            if ($httpBody instanceof \stdClass && $headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($httpBody);
            }
        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $multipartContents[] = [
                        'name' => $formParamName,
                        'contents' => $formParamValue
                    ];
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($formParams);

            } else {
                // for HTTP post (form)
                $httpBody = \GuzzleHttp\Psr7\build_query($formParams);
            }
        }


        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $query = \GuzzleHttp\Psr7\build_query($queryParams);
        return new Request(
            'GET',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation getVehicleSafetyScore
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \Swagger\Client\Model\VehicleSafetyScoreResponse
     */
    public function getVehicleSafetyScore($vehicle_id, $access_token, $start_ms, $end_ms)
    {
        list($response) = $this->getVehicleSafetyScoreWithHttpInfo($vehicle_id, $access_token, $start_ms, $end_ms);
        return $response;
    }

    /**
     * Operation getVehicleSafetyScoreWithHttpInfo
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \Swagger\Client\Model\VehicleSafetyScoreResponse, HTTP status code, HTTP response headers (array of strings)
     */
    public function getVehicleSafetyScoreWithHttpInfo($vehicle_id, $access_token, $start_ms, $end_ms)
    {
        $returnType = '\Swagger\Client\Model\VehicleSafetyScoreResponse';
        $request = $this->getVehicleSafetyScoreRequest($vehicle_id, $access_token, $start_ms, $end_ms);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? $e->getResponse()->getBody()->getContents() : null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    $response->getBody()
                );
            }

            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
                if ($returnType !== 'string') {
                    $content = json_decode($content);
                }
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\Swagger\Client\Model\VehicleSafetyScoreResponse',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\Swagger\Client\Model\ErrorResponse',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getVehicleSafetyScoreAsync
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getVehicleSafetyScoreAsync($vehicle_id, $access_token, $start_ms, $end_ms)
    {
        return $this->getVehicleSafetyScoreAsyncWithHttpInfo($vehicle_id, $access_token, $start_ms, $end_ms)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getVehicleSafetyScoreAsyncWithHttpInfo
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getVehicleSafetyScoreAsyncWithHttpInfo($vehicle_id, $access_token, $start_ms, $end_ms)
    {
        $returnType = '\Swagger\Client\Model\VehicleSafetyScoreResponse';
        $request = $this->getVehicleSafetyScoreRequest($vehicle_id, $access_token, $start_ms, $end_ms);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                        if ($returnType !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, $returnType, []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'getVehicleSafetyScore'
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getVehicleSafetyScoreRequest($vehicle_id, $access_token, $start_ms, $end_ms)
    {
        // verify the required parameter 'vehicle_id' is set
        if ($vehicle_id === null || (is_array($vehicle_id) && count($vehicle_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $vehicle_id when calling getVehicleSafetyScore'
            );
        }
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getVehicleSafetyScore'
            );
        }
        // verify the required parameter 'start_ms' is set
        if ($start_ms === null || (is_array($start_ms) && count($start_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $start_ms when calling getVehicleSafetyScore'
            );
        }
        // verify the required parameter 'end_ms' is set
        if ($end_ms === null || (is_array($end_ms) && count($end_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $end_ms when calling getVehicleSafetyScore'
            );
        }

        $resourcePath = '/fleet/vehicles/{vehicleId}/safety/score';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($access_token !== null) {
            $queryParams['access_token'] = ObjectSerializer::toQueryValue($access_token);
        }
        // query params
        if ($start_ms !== null) {
            $queryParams['startMs'] = ObjectSerializer::toQueryValue($start_ms);
        }
        // query params
        if ($end_ms !== null) {
            $queryParams['endMs'] = ObjectSerializer::toQueryValue($end_ms);
        }

        // path params
        if ($vehicle_id !== null) {
            $resourcePath = str_replace(
                '{' . 'vehicleId' . '}',
                ObjectSerializer::toPathValue($vehicle_id),
                $resourcePath
            );
        }

        // body params
        $_tempBody = null;

        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                ['application/json']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['application/json'],
                ['application/json']
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            $httpBody = $_tempBody;
            // \stdClass has no __toString(), so we should encode it manually
            if ($httpBody instanceof \stdClass && $headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($httpBody);
            }
        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $multipartContents[] = [
                        'name' => $formParamName,
                        'contents' => $formParamValue
                    ];
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($formParams);

            } else {
                // for HTTP post (form)
                $httpBody = \GuzzleHttp\Psr7\build_query($formParams);
            }
        }


        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $query = \GuzzleHttp\Psr7\build_query($queryParams);
        return new Request(
            'GET',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Create http client option
     *
     * @throws \RuntimeException on file opening failure
     * @return array of http client options
     */
    protected function createHttpClientOption()
    {
        $options = [];
        if ($this->config->getDebug()) {
            $options[RequestOptions::DEBUG] = fopen($this->config->getDebugFile(), 'a');
            if (!$options[RequestOptions::DEBUG]) {
                throw new \RuntimeException('Failed to open the debug file: ' . $this->config->getDebugFile());
            }
        }

        return $options;
    }
}
