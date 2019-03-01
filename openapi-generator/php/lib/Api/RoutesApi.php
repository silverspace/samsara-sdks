<?php
/**
 * RoutesApi
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.0.0-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Api;

use GuzzleHttp\Client;
use GuzzleHttp\ClientInterface;
use GuzzleHttp\Exception\RequestException;
use GuzzleHttp\Psr7\MultipartStream;
use GuzzleHttp\Psr7\Request;
use GuzzleHttp\RequestOptions;
use OpenAPI\Client\ApiException;
use OpenAPI\Client\Configuration;
use OpenAPI\Client\HeaderSelector;
use OpenAPI\Client\ObjectSerializer;

/**
 * RoutesApi Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class RoutesApi
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
     * @var int Host index
     */
    protected $hostIndex;

    /**
     * @param ClientInterface $client
     * @param Configuration   $config
     * @param HeaderSelector  $selector
     * @param int             $host_index (Optional) host index to select the list of hosts if defined in the OpenAPI spec
     */
    public function __construct(
        ClientInterface $client = null,
        Configuration $config = null,
        HeaderSelector $selector = null,
        $host_index = 0
    ) {
        $this->client = $client ?: new Client();
        $this->config = $config ?: new Configuration();
        $this->headerSelector = $selector ?: new HeaderSelector();
        $this->hostIndex = $host_index;
    }

    /**
     * Set the host index
     *
     * @param  int Host index (required)
     */
    public function setHostIndex($host_index)
    {
        $this->hostIndex = $host_index;
    }

    /**
     * Get the host index
     *
     * @return Host index
     */
    public function getHostIndex()
    {
        return $this->hostIndex;
    }

    /**
     * @return Configuration
     */
    public function getConfig()
    {
        return $this->config;
    }

    /**
     * Operation createDispatchRoute
     *
     * /fleet/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params create_dispatch_route_params (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DispatchRoute|string
     */
    public function createDispatchRoute($access_token, $create_dispatch_route_params)
    {
        list($response) = $this->createDispatchRouteWithHttpInfo($access_token, $create_dispatch_route_params);
        return $response;
    }

    /**
     * Operation createDispatchRouteWithHttpInfo
     *
     * /fleet/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DispatchRoute|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function createDispatchRouteWithHttpInfo($access_token, $create_dispatch_route_params)
    {
        $request = $this->createDispatchRouteRequest($access_token, $create_dispatch_route_params);

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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DispatchRoute' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DispatchRoute', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('string' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'string', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\DispatchRoute';
            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
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
                        '\OpenAPI\Client\Model\DispatchRoute',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'string',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation createDispatchRouteAsync
     *
     * /fleet/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createDispatchRouteAsync($access_token, $create_dispatch_route_params)
    {
        return $this->createDispatchRouteAsyncWithHttpInfo($access_token, $create_dispatch_route_params)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation createDispatchRouteAsyncWithHttpInfo
     *
     * /fleet/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createDispatchRouteAsyncWithHttpInfo($access_token, $create_dispatch_route_params)
    {
        $returnType = '\OpenAPI\Client\Model\DispatchRoute';
        $request = $this->createDispatchRouteRequest($access_token, $create_dispatch_route_params);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
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
     * Create request for operation 'createDispatchRoute'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function createDispatchRouteRequest($access_token, $create_dispatch_route_params)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling createDispatchRoute'
            );
        }
        // verify the required parameter 'create_dispatch_route_params' is set
        if ($create_dispatch_route_params === null || (is_array($create_dispatch_route_params) && count($create_dispatch_route_params) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $create_dispatch_route_params when calling createDispatchRoute'
            );
        }

        $resourcePath = '/fleet/dispatch/routes';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($access_token !== null) {
            $queryParams['access_token'] = ObjectSerializer::toQueryValue($access_token);
        }


        // body params
        $_tempBody = null;
        if (isset($create_dispatch_route_params)) {
            $_tempBody = $create_dispatch_route_params;
        }

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
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
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
            'POST',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation createDriverDispatchRoute
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with the associated routes. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params create_dispatch_route_params (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DispatchRoute|string
     */
    public function createDriverDispatchRoute($access_token, $driver_id, $create_dispatch_route_params)
    {
        list($response) = $this->createDriverDispatchRouteWithHttpInfo($access_token, $driver_id, $create_dispatch_route_params);
        return $response;
    }

    /**
     * Operation createDriverDispatchRouteWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with the associated routes. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DispatchRoute|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function createDriverDispatchRouteWithHttpInfo($access_token, $driver_id, $create_dispatch_route_params)
    {
        $request = $this->createDriverDispatchRouteRequest($access_token, $driver_id, $create_dispatch_route_params);

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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DispatchRoute' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DispatchRoute', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('string' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'string', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\DispatchRoute';
            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
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
                        '\OpenAPI\Client\Model\DispatchRoute',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'string',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation createDriverDispatchRouteAsync
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with the associated routes. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createDriverDispatchRouteAsync($access_token, $driver_id, $create_dispatch_route_params)
    {
        return $this->createDriverDispatchRouteAsyncWithHttpInfo($access_token, $driver_id, $create_dispatch_route_params)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation createDriverDispatchRouteAsyncWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with the associated routes. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createDriverDispatchRouteAsyncWithHttpInfo($access_token, $driver_id, $create_dispatch_route_params)
    {
        $returnType = '\OpenAPI\Client\Model\DispatchRoute';
        $request = $this->createDriverDispatchRouteRequest($access_token, $driver_id, $create_dispatch_route_params);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
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
     * Create request for operation 'createDriverDispatchRoute'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with the associated routes. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function createDriverDispatchRouteRequest($access_token, $driver_id, $create_dispatch_route_params)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling createDriverDispatchRoute'
            );
        }
        // verify the required parameter 'driver_id' is set
        if ($driver_id === null || (is_array($driver_id) && count($driver_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $driver_id when calling createDriverDispatchRoute'
            );
        }
        // verify the required parameter 'create_dispatch_route_params' is set
        if ($create_dispatch_route_params === null || (is_array($create_dispatch_route_params) && count($create_dispatch_route_params) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $create_dispatch_route_params when calling createDriverDispatchRoute'
            );
        }

        $resourcePath = '/fleet/drivers/{driver_id}/dispatch/routes';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($access_token !== null) {
            $queryParams['access_token'] = ObjectSerializer::toQueryValue($access_token);
        }

        // path params
        if ($driver_id !== null) {
            $resourcePath = str_replace(
                '{' . 'driver_id' . '}',
                ObjectSerializer::toPathValue($driver_id),
                $resourcePath
            );
        }

        // body params
        $_tempBody = null;
        if (isset($create_dispatch_route_params)) {
            $_tempBody = $create_dispatch_route_params;
        }

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
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
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
            'POST',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation createVehicleDispatchRoute
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params create_dispatch_route_params (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DispatchRoute|string
     */
    public function createVehicleDispatchRoute($access_token, $vehicle_id, $create_dispatch_route_params)
    {
        list($response) = $this->createVehicleDispatchRouteWithHttpInfo($access_token, $vehicle_id, $create_dispatch_route_params);
        return $response;
    }

    /**
     * Operation createVehicleDispatchRouteWithHttpInfo
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DispatchRoute|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function createVehicleDispatchRouteWithHttpInfo($access_token, $vehicle_id, $create_dispatch_route_params)
    {
        $request = $this->createVehicleDispatchRouteRequest($access_token, $vehicle_id, $create_dispatch_route_params);

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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DispatchRoute' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DispatchRoute', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('string' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'string', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\DispatchRoute';
            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
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
                        '\OpenAPI\Client\Model\DispatchRoute',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'string',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation createVehicleDispatchRouteAsync
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createVehicleDispatchRouteAsync($access_token, $vehicle_id, $create_dispatch_route_params)
    {
        return $this->createVehicleDispatchRouteAsyncWithHttpInfo($access_token, $vehicle_id, $create_dispatch_route_params)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation createVehicleDispatchRouteAsyncWithHttpInfo
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createVehicleDispatchRouteAsyncWithHttpInfo($access_token, $vehicle_id, $create_dispatch_route_params)
    {
        $returnType = '\OpenAPI\Client\Model\DispatchRoute';
        $request = $this->createVehicleDispatchRouteRequest($access_token, $vehicle_id, $create_dispatch_route_params);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
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
     * Create request for operation 'createVehicleDispatchRoute'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  \OpenAPI\Client\Model\DispatchRouteCreate $create_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function createVehicleDispatchRouteRequest($access_token, $vehicle_id, $create_dispatch_route_params)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling createVehicleDispatchRoute'
            );
        }
        // verify the required parameter 'vehicle_id' is set
        if ($vehicle_id === null || (is_array($vehicle_id) && count($vehicle_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $vehicle_id when calling createVehicleDispatchRoute'
            );
        }
        // verify the required parameter 'create_dispatch_route_params' is set
        if ($create_dispatch_route_params === null || (is_array($create_dispatch_route_params) && count($create_dispatch_route_params) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $create_dispatch_route_params when calling createVehicleDispatchRoute'
            );
        }

        $resourcePath = '/fleet/vehicles/{vehicle_id}/dispatch/routes';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($access_token !== null) {
            $queryParams['access_token'] = ObjectSerializer::toQueryValue($access_token);
        }

        // path params
        if ($vehicle_id !== null) {
            $resourcePath = str_replace(
                '{' . 'vehicle_id' . '}',
                ObjectSerializer::toPathValue($vehicle_id),
                $resourcePath
            );
        }

        // body params
        $_tempBody = null;
        if (isset($create_dispatch_route_params)) {
            $_tempBody = $create_dispatch_route_params;
        }

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
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
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
            'POST',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation deleteDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function deleteDispatchRouteById($access_token, $route_id)
    {
        $this->deleteDispatchRouteByIdWithHttpInfo($access_token, $route_id);
    }

    /**
     * Operation deleteDispatchRouteByIdWithHttpInfo
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function deleteDispatchRouteByIdWithHttpInfo($access_token, $route_id)
    {
        $request = $this->deleteDispatchRouteByIdRequest($access_token, $route_id);

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

            return [null, $statusCode, $response->getHeaders()];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'string',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation deleteDispatchRouteByIdAsync
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function deleteDispatchRouteByIdAsync($access_token, $route_id)
    {
        return $this->deleteDispatchRouteByIdAsyncWithHttpInfo($access_token, $route_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation deleteDispatchRouteByIdAsyncWithHttpInfo
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function deleteDispatchRouteByIdAsyncWithHttpInfo($access_token, $route_id)
    {
        $returnType = '';
        $request = $this->deleteDispatchRouteByIdRequest($access_token, $route_id);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    return [null, $response->getStatusCode(), $response->getHeaders()];
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
     * Create request for operation 'deleteDispatchRouteById'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function deleteDispatchRouteByIdRequest($access_token, $route_id)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling deleteDispatchRouteById'
            );
        }
        // verify the required parameter 'route_id' is set
        if ($route_id === null || (is_array($route_id) && count($route_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $route_id when calling deleteDispatchRouteById'
            );
        }

        $resourcePath = '/fleet/dispatch/routes/{route_id}';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($access_token !== null) {
            $queryParams['access_token'] = ObjectSerializer::toQueryValue($access_token);
        }

        // path params
        if ($route_id !== null) {
            $resourcePath = str_replace(
                '{' . 'route_id' . '}',
                ObjectSerializer::toPathValue($route_id),
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
                []
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
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
            'DELETE',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation fetchAllDispatchRoutes
     *
     * /fleet/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DispatchRoute[]|string
     */
    public function fetchAllDispatchRoutes($access_token, $group_id = null, $end_time = null, $duration = null)
    {
        list($response) = $this->fetchAllDispatchRoutesWithHttpInfo($access_token, $group_id, $end_time, $duration);
        return $response;
    }

    /**
     * Operation fetchAllDispatchRoutesWithHttpInfo
     *
     * /fleet/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DispatchRoute[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function fetchAllDispatchRoutesWithHttpInfo($access_token, $group_id = null, $end_time = null, $duration = null)
    {
        $request = $this->fetchAllDispatchRoutesRequest($access_token, $group_id, $end_time, $duration);

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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DispatchRoute[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DispatchRoute[]', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('string' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'string', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\DispatchRoute[]';
            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
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
                        '\OpenAPI\Client\Model\DispatchRoute[]',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'string',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation fetchAllDispatchRoutesAsync
     *
     * /fleet/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function fetchAllDispatchRoutesAsync($access_token, $group_id = null, $end_time = null, $duration = null)
    {
        return $this->fetchAllDispatchRoutesAsyncWithHttpInfo($access_token, $group_id, $end_time, $duration)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation fetchAllDispatchRoutesAsyncWithHttpInfo
     *
     * /fleet/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function fetchAllDispatchRoutesAsyncWithHttpInfo($access_token, $group_id = null, $end_time = null, $duration = null)
    {
        $returnType = '\OpenAPI\Client\Model\DispatchRoute[]';
        $request = $this->fetchAllDispatchRoutesRequest($access_token, $group_id, $end_time, $duration);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
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
     * Create request for operation 'fetchAllDispatchRoutes'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function fetchAllDispatchRoutesRequest($access_token, $group_id = null, $end_time = null, $duration = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling fetchAllDispatchRoutes'
            );
        }

        $resourcePath = '/fleet/dispatch/routes';
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
        if ($group_id !== null) {
            $queryParams['group_id'] = ObjectSerializer::toQueryValue($group_id);
        }
        // query params
        if ($end_time !== null) {
            $queryParams['end_time'] = ObjectSerializer::toQueryValue($end_time);
        }
        // query params
        if ($duration !== null) {
            $queryParams['duration'] = ObjectSerializer::toQueryValue($duration);
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
                []
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
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
     * Operation fetchAllRouteJobUpdates
     *
     * /fleet/dispatch/routes/job_updates
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  string $sequence_id Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param  string $include Optionally set include&#x3D;route to include route object in response payload. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\AllRouteJobUpdates|string
     */
    public function fetchAllRouteJobUpdates($access_token, $group_id = null, $sequence_id = null, $include = null)
    {
        list($response) = $this->fetchAllRouteJobUpdatesWithHttpInfo($access_token, $group_id, $sequence_id, $include);
        return $response;
    }

    /**
     * Operation fetchAllRouteJobUpdatesWithHttpInfo
     *
     * /fleet/dispatch/routes/job_updates
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  string $sequence_id Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param  string $include Optionally set include&#x3D;route to include route object in response payload. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\AllRouteJobUpdates|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function fetchAllRouteJobUpdatesWithHttpInfo($access_token, $group_id = null, $sequence_id = null, $include = null)
    {
        $request = $this->fetchAllRouteJobUpdatesRequest($access_token, $group_id, $sequence_id, $include);

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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\AllRouteJobUpdates' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\AllRouteJobUpdates', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('string' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'string', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\AllRouteJobUpdates';
            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
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
                        '\OpenAPI\Client\Model\AllRouteJobUpdates',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'string',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation fetchAllRouteJobUpdatesAsync
     *
     * /fleet/dispatch/routes/job_updates
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  string $sequence_id Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param  string $include Optionally set include&#x3D;route to include route object in response payload. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function fetchAllRouteJobUpdatesAsync($access_token, $group_id = null, $sequence_id = null, $include = null)
    {
        return $this->fetchAllRouteJobUpdatesAsyncWithHttpInfo($access_token, $group_id, $sequence_id, $include)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation fetchAllRouteJobUpdatesAsyncWithHttpInfo
     *
     * /fleet/dispatch/routes/job_updates
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  string $sequence_id Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param  string $include Optionally set include&#x3D;route to include route object in response payload. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function fetchAllRouteJobUpdatesAsyncWithHttpInfo($access_token, $group_id = null, $sequence_id = null, $include = null)
    {
        $returnType = '\OpenAPI\Client\Model\AllRouteJobUpdates';
        $request = $this->fetchAllRouteJobUpdatesRequest($access_token, $group_id, $sequence_id, $include);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
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
     * Create request for operation 'fetchAllRouteJobUpdates'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param  string $sequence_id Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param  string $include Optionally set include&#x3D;route to include route object in response payload. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function fetchAllRouteJobUpdatesRequest($access_token, $group_id = null, $sequence_id = null, $include = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling fetchAllRouteJobUpdates'
            );
        }

        $resourcePath = '/fleet/dispatch/routes/job_updates';
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
        if ($group_id !== null) {
            $queryParams['group_id'] = ObjectSerializer::toQueryValue($group_id);
        }
        // query params
        if ($sequence_id !== null) {
            $queryParams['sequence_id'] = ObjectSerializer::toQueryValue($sequence_id);
        }
        // query params
        if ($include !== null) {
            $queryParams['include'] = ObjectSerializer::toQueryValue($include);
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
                []
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
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
     * Operation getDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DispatchRoute|string
     */
    public function getDispatchRouteById($access_token, $route_id)
    {
        list($response) = $this->getDispatchRouteByIdWithHttpInfo($access_token, $route_id);
        return $response;
    }

    /**
     * Operation getDispatchRouteByIdWithHttpInfo
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DispatchRoute|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getDispatchRouteByIdWithHttpInfo($access_token, $route_id)
    {
        $request = $this->getDispatchRouteByIdRequest($access_token, $route_id);

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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DispatchRoute' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DispatchRoute', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('string' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'string', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\DispatchRoute';
            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
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
                        '\OpenAPI\Client\Model\DispatchRoute',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'string',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getDispatchRouteByIdAsync
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDispatchRouteByIdAsync($access_token, $route_id)
    {
        return $this->getDispatchRouteByIdAsyncWithHttpInfo($access_token, $route_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getDispatchRouteByIdAsyncWithHttpInfo
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDispatchRouteByIdAsyncWithHttpInfo($access_token, $route_id)
    {
        $returnType = '\OpenAPI\Client\Model\DispatchRoute';
        $request = $this->getDispatchRouteByIdRequest($access_token, $route_id);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
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
     * Create request for operation 'getDispatchRouteById'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getDispatchRouteByIdRequest($access_token, $route_id)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getDispatchRouteById'
            );
        }
        // verify the required parameter 'route_id' is set
        if ($route_id === null || (is_array($route_id) && count($route_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $route_id when calling getDispatchRouteById'
            );
        }

        $resourcePath = '/fleet/dispatch/routes/{route_id}';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($access_token !== null) {
            $queryParams['access_token'] = ObjectSerializer::toQueryValue($access_token);
        }

        // path params
        if ($route_id !== null) {
            $resourcePath = str_replace(
                '{' . 'route_id' . '}',
                ObjectSerializer::toPathValue($route_id),
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
                []
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
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
     * Operation getDispatchRouteHistory
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the route with history. (required)
     * @param  int $start_time Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param  int $end_time Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DispatchRouteHistory|string
     */
    public function getDispatchRouteHistory($access_token, $route_id, $start_time = null, $end_time = null)
    {
        list($response) = $this->getDispatchRouteHistoryWithHttpInfo($access_token, $route_id, $start_time, $end_time);
        return $response;
    }

    /**
     * Operation getDispatchRouteHistoryWithHttpInfo
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the route with history. (required)
     * @param  int $start_time Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param  int $end_time Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DispatchRouteHistory|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getDispatchRouteHistoryWithHttpInfo($access_token, $route_id, $start_time = null, $end_time = null)
    {
        $request = $this->getDispatchRouteHistoryRequest($access_token, $route_id, $start_time, $end_time);

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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DispatchRouteHistory' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DispatchRouteHistory', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('string' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'string', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\DispatchRouteHistory';
            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
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
                        '\OpenAPI\Client\Model\DispatchRouteHistory',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'string',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getDispatchRouteHistoryAsync
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the route with history. (required)
     * @param  int $start_time Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param  int $end_time Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDispatchRouteHistoryAsync($access_token, $route_id, $start_time = null, $end_time = null)
    {
        return $this->getDispatchRouteHistoryAsyncWithHttpInfo($access_token, $route_id, $start_time, $end_time)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getDispatchRouteHistoryAsyncWithHttpInfo
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the route with history. (required)
     * @param  int $start_time Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param  int $end_time Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDispatchRouteHistoryAsyncWithHttpInfo($access_token, $route_id, $start_time = null, $end_time = null)
    {
        $returnType = '\OpenAPI\Client\Model\DispatchRouteHistory';
        $request = $this->getDispatchRouteHistoryRequest($access_token, $route_id, $start_time, $end_time);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
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
     * Create request for operation 'getDispatchRouteHistory'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the route with history. (required)
     * @param  int $start_time Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param  int $end_time Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getDispatchRouteHistoryRequest($access_token, $route_id, $start_time = null, $end_time = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getDispatchRouteHistory'
            );
        }
        // verify the required parameter 'route_id' is set
        if ($route_id === null || (is_array($route_id) && count($route_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $route_id when calling getDispatchRouteHistory'
            );
        }

        $resourcePath = '/fleet/dispatch/routes/{route_id}/history';
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
        if ($start_time !== null) {
            $queryParams['start_time'] = ObjectSerializer::toQueryValue($start_time);
        }
        // query params
        if ($end_time !== null) {
            $queryParams['end_time'] = ObjectSerializer::toQueryValue($end_time);
        }

        // path params
        if ($route_id !== null) {
            $resourcePath = str_replace(
                '{' . 'route_id' . '}',
                ObjectSerializer::toPathValue($route_id),
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
                []
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
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
     * Operation getDispatchRoutesByDriverId
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with the associated routes. (required)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DispatchRoute[]|string
     */
    public function getDispatchRoutesByDriverId($access_token, $driver_id, $end_time = null, $duration = null)
    {
        list($response) = $this->getDispatchRoutesByDriverIdWithHttpInfo($access_token, $driver_id, $end_time, $duration);
        return $response;
    }

    /**
     * Operation getDispatchRoutesByDriverIdWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with the associated routes. (required)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DispatchRoute[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getDispatchRoutesByDriverIdWithHttpInfo($access_token, $driver_id, $end_time = null, $duration = null)
    {
        $request = $this->getDispatchRoutesByDriverIdRequest($access_token, $driver_id, $end_time, $duration);

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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DispatchRoute[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DispatchRoute[]', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('string' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'string', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\DispatchRoute[]';
            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
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
                        '\OpenAPI\Client\Model\DispatchRoute[]',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'string',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getDispatchRoutesByDriverIdAsync
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with the associated routes. (required)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDispatchRoutesByDriverIdAsync($access_token, $driver_id, $end_time = null, $duration = null)
    {
        return $this->getDispatchRoutesByDriverIdAsyncWithHttpInfo($access_token, $driver_id, $end_time, $duration)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getDispatchRoutesByDriverIdAsyncWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with the associated routes. (required)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDispatchRoutesByDriverIdAsyncWithHttpInfo($access_token, $driver_id, $end_time = null, $duration = null)
    {
        $returnType = '\OpenAPI\Client\Model\DispatchRoute[]';
        $request = $this->getDispatchRoutesByDriverIdRequest($access_token, $driver_id, $end_time, $duration);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
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
     * Create request for operation 'getDispatchRoutesByDriverId'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with the associated routes. (required)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getDispatchRoutesByDriverIdRequest($access_token, $driver_id, $end_time = null, $duration = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getDispatchRoutesByDriverId'
            );
        }
        // verify the required parameter 'driver_id' is set
        if ($driver_id === null || (is_array($driver_id) && count($driver_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $driver_id when calling getDispatchRoutesByDriverId'
            );
        }

        $resourcePath = '/fleet/drivers/{driver_id}/dispatch/routes';
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
        if ($end_time !== null) {
            $queryParams['end_time'] = ObjectSerializer::toQueryValue($end_time);
        }
        // query params
        if ($duration !== null) {
            $queryParams['duration'] = ObjectSerializer::toQueryValue($duration);
        }

        // path params
        if ($driver_id !== null) {
            $resourcePath = str_replace(
                '{' . 'driver_id' . '}',
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
                []
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
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
     * Operation getDispatchRoutesByVehicleId
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DispatchRoute[]|string
     */
    public function getDispatchRoutesByVehicleId($access_token, $vehicle_id, $end_time = null, $duration = null)
    {
        list($response) = $this->getDispatchRoutesByVehicleIdWithHttpInfo($access_token, $vehicle_id, $end_time, $duration);
        return $response;
    }

    /**
     * Operation getDispatchRoutesByVehicleIdWithHttpInfo
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DispatchRoute[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getDispatchRoutesByVehicleIdWithHttpInfo($access_token, $vehicle_id, $end_time = null, $duration = null)
    {
        $request = $this->getDispatchRoutesByVehicleIdRequest($access_token, $vehicle_id, $end_time, $duration);

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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DispatchRoute[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DispatchRoute[]', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('string' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'string', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\DispatchRoute[]';
            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
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
                        '\OpenAPI\Client\Model\DispatchRoute[]',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'string',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getDispatchRoutesByVehicleIdAsync
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDispatchRoutesByVehicleIdAsync($access_token, $vehicle_id, $end_time = null, $duration = null)
    {
        return $this->getDispatchRoutesByVehicleIdAsyncWithHttpInfo($access_token, $vehicle_id, $end_time, $duration)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getDispatchRoutesByVehicleIdAsyncWithHttpInfo
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDispatchRoutesByVehicleIdAsyncWithHttpInfo($access_token, $vehicle_id, $end_time = null, $duration = null)
    {
        $returnType = '\OpenAPI\Client\Model\DispatchRoute[]';
        $request = $this->getDispatchRoutesByVehicleIdRequest($access_token, $vehicle_id, $end_time, $duration);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
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
     * Create request for operation 'getDispatchRoutesByVehicleId'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param  int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getDispatchRoutesByVehicleIdRequest($access_token, $vehicle_id, $end_time = null, $duration = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getDispatchRoutesByVehicleId'
            );
        }
        // verify the required parameter 'vehicle_id' is set
        if ($vehicle_id === null || (is_array($vehicle_id) && count($vehicle_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $vehicle_id when calling getDispatchRoutesByVehicleId'
            );
        }

        $resourcePath = '/fleet/vehicles/{vehicle_id}/dispatch/routes';
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
        if ($end_time !== null) {
            $queryParams['end_time'] = ObjectSerializer::toQueryValue($end_time);
        }
        // query params
        if ($duration !== null) {
            $queryParams['duration'] = ObjectSerializer::toQueryValue($duration);
        }

        // path params
        if ($vehicle_id !== null) {
            $resourcePath = str_replace(
                '{' . 'vehicle_id' . '}',
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
                []
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
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
     * Operation updateDispatchRouteById
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     * @param  \OpenAPI\Client\Model\DispatchRoute $update_dispatch_route_params update_dispatch_route_params (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DispatchRoute|string
     */
    public function updateDispatchRouteById($access_token, $route_id, $update_dispatch_route_params)
    {
        list($response) = $this->updateDispatchRouteByIdWithHttpInfo($access_token, $route_id, $update_dispatch_route_params);
        return $response;
    }

    /**
     * Operation updateDispatchRouteByIdWithHttpInfo
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     * @param  \OpenAPI\Client\Model\DispatchRoute $update_dispatch_route_params (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DispatchRoute|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function updateDispatchRouteByIdWithHttpInfo($access_token, $route_id, $update_dispatch_route_params)
    {
        $request = $this->updateDispatchRouteByIdRequest($access_token, $route_id, $update_dispatch_route_params);

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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DispatchRoute' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DispatchRoute', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                default:
                    if ('string' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'string', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\OpenAPI\Client\Model\DispatchRoute';
            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
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
                        '\OpenAPI\Client\Model\DispatchRoute',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                default:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        'string',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation updateDispatchRouteByIdAsync
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     * @param  \OpenAPI\Client\Model\DispatchRoute $update_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function updateDispatchRouteByIdAsync($access_token, $route_id, $update_dispatch_route_params)
    {
        return $this->updateDispatchRouteByIdAsyncWithHttpInfo($access_token, $route_id, $update_dispatch_route_params)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation updateDispatchRouteByIdAsyncWithHttpInfo
     *
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     * @param  \OpenAPI\Client\Model\DispatchRoute $update_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function updateDispatchRouteByIdAsyncWithHttpInfo($access_token, $route_id, $update_dispatch_route_params)
    {
        $returnType = '\OpenAPI\Client\Model\DispatchRoute';
        $request = $this->updateDispatchRouteByIdRequest($access_token, $route_id, $update_dispatch_route_params);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
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
     * Create request for operation 'updateDispatchRouteById'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $route_id ID of the dispatch route. (required)
     * @param  \OpenAPI\Client\Model\DispatchRoute $update_dispatch_route_params (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function updateDispatchRouteByIdRequest($access_token, $route_id, $update_dispatch_route_params)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling updateDispatchRouteById'
            );
        }
        // verify the required parameter 'route_id' is set
        if ($route_id === null || (is_array($route_id) && count($route_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $route_id when calling updateDispatchRouteById'
            );
        }
        // verify the required parameter 'update_dispatch_route_params' is set
        if ($update_dispatch_route_params === null || (is_array($update_dispatch_route_params) && count($update_dispatch_route_params) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $update_dispatch_route_params when calling updateDispatchRouteById'
            );
        }

        $resourcePath = '/fleet/dispatch/routes/{route_id}';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($access_token !== null) {
            $queryParams['access_token'] = ObjectSerializer::toQueryValue($access_token);
        }

        // path params
        if ($route_id !== null) {
            $resourcePath = str_replace(
                '{' . 'route_id' . '}',
                ObjectSerializer::toPathValue($route_id),
                $resourcePath
            );
        }

        // body params
        $_tempBody = null;
        if (isset($update_dispatch_route_params)) {
            $_tempBody = $update_dispatch_route_params;
        }

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
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
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
            'PUT',
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
