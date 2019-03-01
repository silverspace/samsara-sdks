<?php
/**
 * FleetApi
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
 * FleetApi Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class FleetApi
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
     * Operation addFleetAddress
     *
     * /fleet/add_address
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject2 $address_param address_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function addFleetAddress($access_token, $address_param)
    {
        $this->addFleetAddressWithHttpInfo($access_token, $address_param);
    }

    /**
     * Operation addFleetAddressWithHttpInfo
     *
     * /fleet/add_address
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject2 $address_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function addFleetAddressWithHttpInfo($access_token, $address_param)
    {
        $request = $this->addFleetAddressRequest($access_token, $address_param);

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
     * Operation addFleetAddressAsync
     *
     * /fleet/add_address
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject2 $address_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function addFleetAddressAsync($access_token, $address_param)
    {
        return $this->addFleetAddressAsyncWithHttpInfo($access_token, $address_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation addFleetAddressAsyncWithHttpInfo
     *
     * /fleet/add_address
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject2 $address_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function addFleetAddressAsyncWithHttpInfo($access_token, $address_param)
    {
        $returnType = '';
        $request = $this->addFleetAddressRequest($access_token, $address_param);

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
     * Create request for operation 'addFleetAddress'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject2 $address_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function addFleetAddressRequest($access_token, $address_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling addFleetAddress'
            );
        }
        // verify the required parameter 'address_param' is set
        if ($address_param === null || (is_array($address_param) && count($address_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $address_param when calling addFleetAddress'
            );
        }

        $resourcePath = '/fleet/add_address';
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
        if (isset($address_param)) {
            $_tempBody = $address_param;
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
     * Operation addOrganizationAddresses
     *
     * /addresses
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject $addresses addresses (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Address[]|string
     */
    public function addOrganizationAddresses($access_token, $addresses)
    {
        list($response) = $this->addOrganizationAddressesWithHttpInfo($access_token, $addresses);
        return $response;
    }

    /**
     * Operation addOrganizationAddressesWithHttpInfo
     *
     * /addresses
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject $addresses (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Address[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function addOrganizationAddressesWithHttpInfo($access_token, $addresses)
    {
        $request = $this->addOrganizationAddressesRequest($access_token, $addresses);

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
                    if ('\OpenAPI\Client\Model\Address[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Address[]', []),
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

            $returnType = '\OpenAPI\Client\Model\Address[]';
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
                        '\OpenAPI\Client\Model\Address[]',
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
     * Operation addOrganizationAddressesAsync
     *
     * /addresses
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject $addresses (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function addOrganizationAddressesAsync($access_token, $addresses)
    {
        return $this->addOrganizationAddressesAsyncWithHttpInfo($access_token, $addresses)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation addOrganizationAddressesAsyncWithHttpInfo
     *
     * /addresses
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject $addresses (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function addOrganizationAddressesAsyncWithHttpInfo($access_token, $addresses)
    {
        $returnType = '\OpenAPI\Client\Model\Address[]';
        $request = $this->addOrganizationAddressesRequest($access_token, $addresses);

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
     * Create request for operation 'addOrganizationAddresses'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject $addresses (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function addOrganizationAddressesRequest($access_token, $addresses)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling addOrganizationAddresses'
            );
        }
        // verify the required parameter 'addresses' is set
        if ($addresses === null || (is_array($addresses) && count($addresses) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $addresses when calling addOrganizationAddresses'
            );
        }

        $resourcePath = '/addresses';
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
        if (isset($addresses)) {
            $_tempBody = $addresses;
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
     * Operation createDriver
     *
     * /fleet/drivers/create
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\DriverForCreate $create_driver_param Driver creation body (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Driver|string
     */
    public function createDriver($access_token, $create_driver_param)
    {
        list($response) = $this->createDriverWithHttpInfo($access_token, $create_driver_param);
        return $response;
    }

    /**
     * Operation createDriverWithHttpInfo
     *
     * /fleet/drivers/create
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\DriverForCreate $create_driver_param Driver creation body (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Driver|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function createDriverWithHttpInfo($access_token, $create_driver_param)
    {
        $request = $this->createDriverRequest($access_token, $create_driver_param);

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
                    if ('\OpenAPI\Client\Model\Driver' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Driver', []),
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

            $returnType = '\OpenAPI\Client\Model\Driver';
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
                        '\OpenAPI\Client\Model\Driver',
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
     * Operation createDriverAsync
     *
     * /fleet/drivers/create
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\DriverForCreate $create_driver_param Driver creation body (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createDriverAsync($access_token, $create_driver_param)
    {
        return $this->createDriverAsyncWithHttpInfo($access_token, $create_driver_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation createDriverAsyncWithHttpInfo
     *
     * /fleet/drivers/create
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\DriverForCreate $create_driver_param Driver creation body (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createDriverAsyncWithHttpInfo($access_token, $create_driver_param)
    {
        $returnType = '\OpenAPI\Client\Model\Driver';
        $request = $this->createDriverRequest($access_token, $create_driver_param);

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
     * Create request for operation 'createDriver'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\DriverForCreate $create_driver_param Driver creation body (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function createDriverRequest($access_token, $create_driver_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling createDriver'
            );
        }
        // verify the required parameter 'create_driver_param' is set
        if ($create_driver_param === null || (is_array($create_driver_param) && count($create_driver_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $create_driver_param when calling createDriver'
            );
        }

        $resourcePath = '/fleet/drivers/create';
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
        if (isset($create_driver_param)) {
            $_tempBody = $create_driver_param;
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
     * Operation createDriverDocument
     *
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver for whom the document is created. (required)
     * @param  \OpenAPI\Client\Model\DocumentCreate $create_document_params To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Document|string
     */
    public function createDriverDocument($access_token, $driver_id, $create_document_params)
    {
        list($response) = $this->createDriverDocumentWithHttpInfo($access_token, $driver_id, $create_document_params);
        return $response;
    }

    /**
     * Operation createDriverDocumentWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver for whom the document is created. (required)
     * @param  \OpenAPI\Client\Model\DocumentCreate $create_document_params To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Document|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function createDriverDocumentWithHttpInfo($access_token, $driver_id, $create_document_params)
    {
        $request = $this->createDriverDocumentRequest($access_token, $driver_id, $create_document_params);

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
                    if ('\OpenAPI\Client\Model\Document' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Document', []),
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

            $returnType = '\OpenAPI\Client\Model\Document';
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
                        '\OpenAPI\Client\Model\Document',
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
     * Operation createDriverDocumentAsync
     *
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver for whom the document is created. (required)
     * @param  \OpenAPI\Client\Model\DocumentCreate $create_document_params To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createDriverDocumentAsync($access_token, $driver_id, $create_document_params)
    {
        return $this->createDriverDocumentAsyncWithHttpInfo($access_token, $driver_id, $create_document_params)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation createDriverDocumentAsyncWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver for whom the document is created. (required)
     * @param  \OpenAPI\Client\Model\DocumentCreate $create_document_params To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createDriverDocumentAsyncWithHttpInfo($access_token, $driver_id, $create_document_params)
    {
        $returnType = '\OpenAPI\Client\Model\Document';
        $request = $this->createDriverDocumentRequest($access_token, $driver_id, $create_document_params);

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
     * Create request for operation 'createDriverDocument'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver for whom the document is created. (required)
     * @param  \OpenAPI\Client\Model\DocumentCreate $create_document_params To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function createDriverDocumentRequest($access_token, $driver_id, $create_document_params)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling createDriverDocument'
            );
        }
        // verify the required parameter 'driver_id' is set
        if ($driver_id === null || (is_array($driver_id) && count($driver_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $driver_id when calling createDriverDocument'
            );
        }
        // verify the required parameter 'create_document_params' is set
        if ($create_document_params === null || (is_array($create_document_params) && count($create_document_params) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $create_document_params when calling createDriverDocument'
            );
        }

        $resourcePath = '/fleet/drivers/{driver_id}/documents';
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
        if (isset($create_document_params)) {
            $_tempBody = $create_document_params;
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
     * Operation createDvir
     *
     * /fleet/maintenance/dvirs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject12 $create_dvir_param create_dvir_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DvirBase|string
     */
    public function createDvir($access_token, $create_dvir_param)
    {
        list($response) = $this->createDvirWithHttpInfo($access_token, $create_dvir_param);
        return $response;
    }

    /**
     * Operation createDvirWithHttpInfo
     *
     * /fleet/maintenance/dvirs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject12 $create_dvir_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DvirBase|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function createDvirWithHttpInfo($access_token, $create_dvir_param)
    {
        $request = $this->createDvirRequest($access_token, $create_dvir_param);

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
                    if ('\OpenAPI\Client\Model\DvirBase' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DvirBase', []),
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

            $returnType = '\OpenAPI\Client\Model\DvirBase';
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
                        '\OpenAPI\Client\Model\DvirBase',
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
     * Operation createDvirAsync
     *
     * /fleet/maintenance/dvirs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject12 $create_dvir_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createDvirAsync($access_token, $create_dvir_param)
    {
        return $this->createDvirAsyncWithHttpInfo($access_token, $create_dvir_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation createDvirAsyncWithHttpInfo
     *
     * /fleet/maintenance/dvirs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject12 $create_dvir_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createDvirAsyncWithHttpInfo($access_token, $create_dvir_param)
    {
        $returnType = '\OpenAPI\Client\Model\DvirBase';
        $request = $this->createDvirRequest($access_token, $create_dvir_param);

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
     * Create request for operation 'createDvir'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject12 $create_dvir_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function createDvirRequest($access_token, $create_dvir_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling createDvir'
            );
        }
        // verify the required parameter 'create_dvir_param' is set
        if ($create_dvir_param === null || (is_array($create_dvir_param) && count($create_dvir_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $create_dvir_param when calling createDvir'
            );
        }

        $resourcePath = '/fleet/maintenance/dvirs';
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
        if (isset($create_dvir_param)) {
            $_tempBody = $create_dvir_param;
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
     * Operation deactivateDriver
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function deactivateDriver($access_token, $driver_id_or_external_id)
    {
        $this->deactivateDriverWithHttpInfo($access_token, $driver_id_or_external_id);
    }

    /**
     * Operation deactivateDriverWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function deactivateDriverWithHttpInfo($access_token, $driver_id_or_external_id)
    {
        $request = $this->deactivateDriverRequest($access_token, $driver_id_or_external_id);

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
     * Operation deactivateDriverAsync
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function deactivateDriverAsync($access_token, $driver_id_or_external_id)
    {
        return $this->deactivateDriverAsyncWithHttpInfo($access_token, $driver_id_or_external_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation deactivateDriverAsyncWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function deactivateDriverAsyncWithHttpInfo($access_token, $driver_id_or_external_id)
    {
        $returnType = '';
        $request = $this->deactivateDriverRequest($access_token, $driver_id_or_external_id);

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
     * Create request for operation 'deactivateDriver'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function deactivateDriverRequest($access_token, $driver_id_or_external_id)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling deactivateDriver'
            );
        }
        // verify the required parameter 'driver_id_or_external_id' is set
        if ($driver_id_or_external_id === null || (is_array($driver_id_or_external_id) && count($driver_id_or_external_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $driver_id_or_external_id when calling deactivateDriver'
            );
        }

        $resourcePath = '/fleet/drivers/{driver_id_or_external_id}';
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
        if ($driver_id_or_external_id !== null) {
            $resourcePath = str_replace(
                '{' . 'driver_id_or_external_id' . '}',
                ObjectSerializer::toPathValue($driver_id_or_external_id),
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
     * Operation deleteOrganizationAddress
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function deleteOrganizationAddress($access_token, $address_id)
    {
        $this->deleteOrganizationAddressWithHttpInfo($access_token, $address_id);
    }

    /**
     * Operation deleteOrganizationAddressWithHttpInfo
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function deleteOrganizationAddressWithHttpInfo($access_token, $address_id)
    {
        $request = $this->deleteOrganizationAddressRequest($access_token, $address_id);

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
     * Operation deleteOrganizationAddressAsync
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function deleteOrganizationAddressAsync($access_token, $address_id)
    {
        return $this->deleteOrganizationAddressAsyncWithHttpInfo($access_token, $address_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation deleteOrganizationAddressAsyncWithHttpInfo
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function deleteOrganizationAddressAsyncWithHttpInfo($access_token, $address_id)
    {
        $returnType = '';
        $request = $this->deleteOrganizationAddressRequest($access_token, $address_id);

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
     * Create request for operation 'deleteOrganizationAddress'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function deleteOrganizationAddressRequest($access_token, $address_id)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling deleteOrganizationAddress'
            );
        }
        // verify the required parameter 'address_id' is set
        if ($address_id === null || (is_array($address_id) && count($address_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $address_id when calling deleteOrganizationAddress'
            );
        }

        $resourcePath = '/addresses/{addressId}';
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
        if ($address_id !== null) {
            $resourcePath = str_replace(
                '{' . 'addressId' . '}',
                ObjectSerializer::toPathValue($address_id),
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
     * Operation getAllAssetCurrentLocations
     *
     * /fleet/assets/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\InlineResponse2001|string
     */
    public function getAllAssetCurrentLocations($access_token, $group_id = null)
    {
        list($response) = $this->getAllAssetCurrentLocationsWithHttpInfo($access_token, $group_id);
        return $response;
    }

    /**
     * Operation getAllAssetCurrentLocationsWithHttpInfo
     *
     * /fleet/assets/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\InlineResponse2001|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getAllAssetCurrentLocationsWithHttpInfo($access_token, $group_id = null)
    {
        $request = $this->getAllAssetCurrentLocationsRequest($access_token, $group_id);

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
                    if ('\OpenAPI\Client\Model\InlineResponse2001' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\InlineResponse2001', []),
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

            $returnType = '\OpenAPI\Client\Model\InlineResponse2001';
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
                        '\OpenAPI\Client\Model\InlineResponse2001',
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
     * Operation getAllAssetCurrentLocationsAsync
     *
     * /fleet/assets/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAllAssetCurrentLocationsAsync($access_token, $group_id = null)
    {
        return $this->getAllAssetCurrentLocationsAsyncWithHttpInfo($access_token, $group_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getAllAssetCurrentLocationsAsyncWithHttpInfo
     *
     * /fleet/assets/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAllAssetCurrentLocationsAsyncWithHttpInfo($access_token, $group_id = null)
    {
        $returnType = '\OpenAPI\Client\Model\InlineResponse2001';
        $request = $this->getAllAssetCurrentLocationsRequest($access_token, $group_id);

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
     * Create request for operation 'getAllAssetCurrentLocations'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getAllAssetCurrentLocationsRequest($access_token, $group_id = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getAllAssetCurrentLocations'
            );
        }

        $resourcePath = '/fleet/assets/locations';
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
     * Operation getAllAssets
     *
     * /fleet/assets
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\InlineResponse200|string
     */
    public function getAllAssets($access_token, $group_id = null)
    {
        list($response) = $this->getAllAssetsWithHttpInfo($access_token, $group_id);
        return $response;
    }

    /**
     * Operation getAllAssetsWithHttpInfo
     *
     * /fleet/assets
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\InlineResponse200|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getAllAssetsWithHttpInfo($access_token, $group_id = null)
    {
        $request = $this->getAllAssetsRequest($access_token, $group_id);

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
                    if ('\OpenAPI\Client\Model\InlineResponse200' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\InlineResponse200', []),
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

            $returnType = '\OpenAPI\Client\Model\InlineResponse200';
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
                        '\OpenAPI\Client\Model\InlineResponse200',
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
     * Operation getAllAssetsAsync
     *
     * /fleet/assets
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAllAssetsAsync($access_token, $group_id = null)
    {
        return $this->getAllAssetsAsyncWithHttpInfo($access_token, $group_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getAllAssetsAsyncWithHttpInfo
     *
     * /fleet/assets
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAllAssetsAsyncWithHttpInfo($access_token, $group_id = null)
    {
        $returnType = '\OpenAPI\Client\Model\InlineResponse200';
        $request = $this->getAllAssetsRequest($access_token, $group_id);

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
     * Create request for operation 'getAllAssets'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getAllAssetsRequest($access_token, $group_id = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getAllAssets'
            );
        }

        $resourcePath = '/fleet/assets';
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
     * Operation getAllDeactivatedDrivers
     *
     * /fleet/drivers/inactive
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Driver[]|string
     */
    public function getAllDeactivatedDrivers($access_token, $group_id = null)
    {
        list($response) = $this->getAllDeactivatedDriversWithHttpInfo($access_token, $group_id);
        return $response;
    }

    /**
     * Operation getAllDeactivatedDriversWithHttpInfo
     *
     * /fleet/drivers/inactive
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Driver[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getAllDeactivatedDriversWithHttpInfo($access_token, $group_id = null)
    {
        $request = $this->getAllDeactivatedDriversRequest($access_token, $group_id);

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
                    if ('\OpenAPI\Client\Model\Driver[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Driver[]', []),
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

            $returnType = '\OpenAPI\Client\Model\Driver[]';
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
                        '\OpenAPI\Client\Model\Driver[]',
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
     * Operation getAllDeactivatedDriversAsync
     *
     * /fleet/drivers/inactive
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAllDeactivatedDriversAsync($access_token, $group_id = null)
    {
        return $this->getAllDeactivatedDriversAsyncWithHttpInfo($access_token, $group_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getAllDeactivatedDriversAsyncWithHttpInfo
     *
     * /fleet/drivers/inactive
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAllDeactivatedDriversAsyncWithHttpInfo($access_token, $group_id = null)
    {
        $returnType = '\OpenAPI\Client\Model\Driver[]';
        $request = $this->getAllDeactivatedDriversRequest($access_token, $group_id);

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
     * Create request for operation 'getAllDeactivatedDrivers'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getAllDeactivatedDriversRequest($access_token, $group_id = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getAllDeactivatedDrivers'
            );
        }

        $resourcePath = '/fleet/drivers/inactive';
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
     * Operation getAssetLocation
     *
     * /fleet/assets/{assetId:[0-9]+}/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $asset_id ID of the asset (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return object[]|string
     */
    public function getAssetLocation($access_token, $asset_id, $start_ms, $end_ms)
    {
        list($response) = $this->getAssetLocationWithHttpInfo($access_token, $asset_id, $start_ms, $end_ms);
        return $response;
    }

    /**
     * Operation getAssetLocationWithHttpInfo
     *
     * /fleet/assets/{assetId:[0-9]+}/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $asset_id ID of the asset (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of object[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getAssetLocationWithHttpInfo($access_token, $asset_id, $start_ms, $end_ms)
    {
        $request = $this->getAssetLocationRequest($access_token, $asset_id, $start_ms, $end_ms);

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
                    if ('object[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'object[]', []),
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

            $returnType = 'object[]';
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
                        'object[]',
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
     * Operation getAssetLocationAsync
     *
     * /fleet/assets/{assetId:[0-9]+}/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $asset_id ID of the asset (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAssetLocationAsync($access_token, $asset_id, $start_ms, $end_ms)
    {
        return $this->getAssetLocationAsyncWithHttpInfo($access_token, $asset_id, $start_ms, $end_ms)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getAssetLocationAsyncWithHttpInfo
     *
     * /fleet/assets/{assetId:[0-9]+}/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $asset_id ID of the asset (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAssetLocationAsyncWithHttpInfo($access_token, $asset_id, $start_ms, $end_ms)
    {
        $returnType = 'object[]';
        $request = $this->getAssetLocationRequest($access_token, $asset_id, $start_ms, $end_ms);

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
     * Create request for operation 'getAssetLocation'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $asset_id ID of the asset (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getAssetLocationRequest($access_token, $asset_id, $start_ms, $end_ms)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getAssetLocation'
            );
        }
        // verify the required parameter 'asset_id' is set
        if ($asset_id === null || (is_array($asset_id) && count($asset_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $asset_id when calling getAssetLocation'
            );
        }
        // verify the required parameter 'start_ms' is set
        if ($start_ms === null || (is_array($start_ms) && count($start_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $start_ms when calling getAssetLocation'
            );
        }
        // verify the required parameter 'end_ms' is set
        if ($end_ms === null || (is_array($end_ms) && count($end_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $end_ms when calling getAssetLocation'
            );
        }

        $resourcePath = '/fleet/assets/{asset_id}/locations';
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
        if ($asset_id !== null) {
            $resourcePath = str_replace(
                '{' . 'asset_id' . '}',
                ObjectSerializer::toPathValue($asset_id),
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
     * Operation getAssetReefer
     *
     * /fleet/assets/{assetId:[0-9]+}/reefer
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $asset_id ID of the asset (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\AssetReeferResponse|string
     */
    public function getAssetReefer($access_token, $asset_id, $start_ms, $end_ms)
    {
        list($response) = $this->getAssetReeferWithHttpInfo($access_token, $asset_id, $start_ms, $end_ms);
        return $response;
    }

    /**
     * Operation getAssetReeferWithHttpInfo
     *
     * /fleet/assets/{assetId:[0-9]+}/reefer
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $asset_id ID of the asset (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\AssetReeferResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getAssetReeferWithHttpInfo($access_token, $asset_id, $start_ms, $end_ms)
    {
        $request = $this->getAssetReeferRequest($access_token, $asset_id, $start_ms, $end_ms);

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
                    if ('\OpenAPI\Client\Model\AssetReeferResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\AssetReeferResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\AssetReeferResponse';
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
                        '\OpenAPI\Client\Model\AssetReeferResponse',
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
     * Operation getAssetReeferAsync
     *
     * /fleet/assets/{assetId:[0-9]+}/reefer
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $asset_id ID of the asset (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAssetReeferAsync($access_token, $asset_id, $start_ms, $end_ms)
    {
        return $this->getAssetReeferAsyncWithHttpInfo($access_token, $asset_id, $start_ms, $end_ms)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getAssetReeferAsyncWithHttpInfo
     *
     * /fleet/assets/{assetId:[0-9]+}/reefer
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $asset_id ID of the asset (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAssetReeferAsyncWithHttpInfo($access_token, $asset_id, $start_ms, $end_ms)
    {
        $returnType = '\OpenAPI\Client\Model\AssetReeferResponse';
        $request = $this->getAssetReeferRequest($access_token, $asset_id, $start_ms, $end_ms);

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
     * Create request for operation 'getAssetReefer'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $asset_id ID of the asset (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getAssetReeferRequest($access_token, $asset_id, $start_ms, $end_ms)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getAssetReefer'
            );
        }
        // verify the required parameter 'asset_id' is set
        if ($asset_id === null || (is_array($asset_id) && count($asset_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $asset_id when calling getAssetReefer'
            );
        }
        // verify the required parameter 'start_ms' is set
        if ($start_ms === null || (is_array($start_ms) && count($start_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $start_ms when calling getAssetReefer'
            );
        }
        // verify the required parameter 'end_ms' is set
        if ($end_ms === null || (is_array($end_ms) && count($end_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $end_ms when calling getAssetReefer'
            );
        }

        $resourcePath = '/fleet/assets/{asset_id}/reefer';
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
        if ($asset_id !== null) {
            $resourcePath = str_replace(
                '{' . 'asset_id' . '}',
                ObjectSerializer::toPathValue($asset_id),
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
     * Operation getDeactivatedDriverById
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Driver|string
     */
    public function getDeactivatedDriverById($access_token, $driver_id_or_external_id)
    {
        list($response) = $this->getDeactivatedDriverByIdWithHttpInfo($access_token, $driver_id_or_external_id);
        return $response;
    }

    /**
     * Operation getDeactivatedDriverByIdWithHttpInfo
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Driver|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getDeactivatedDriverByIdWithHttpInfo($access_token, $driver_id_or_external_id)
    {
        $request = $this->getDeactivatedDriverByIdRequest($access_token, $driver_id_or_external_id);

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
                    if ('\OpenAPI\Client\Model\Driver' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Driver', []),
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

            $returnType = '\OpenAPI\Client\Model\Driver';
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
                        '\OpenAPI\Client\Model\Driver',
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
     * Operation getDeactivatedDriverByIdAsync
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDeactivatedDriverByIdAsync($access_token, $driver_id_or_external_id)
    {
        return $this->getDeactivatedDriverByIdAsyncWithHttpInfo($access_token, $driver_id_or_external_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getDeactivatedDriverByIdAsyncWithHttpInfo
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDeactivatedDriverByIdAsyncWithHttpInfo($access_token, $driver_id_or_external_id)
    {
        $returnType = '\OpenAPI\Client\Model\Driver';
        $request = $this->getDeactivatedDriverByIdRequest($access_token, $driver_id_or_external_id);

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
     * Create request for operation 'getDeactivatedDriverById'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getDeactivatedDriverByIdRequest($access_token, $driver_id_or_external_id)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getDeactivatedDriverById'
            );
        }
        // verify the required parameter 'driver_id_or_external_id' is set
        if ($driver_id_or_external_id === null || (is_array($driver_id_or_external_id) && count($driver_id_or_external_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $driver_id_or_external_id when calling getDeactivatedDriverById'
            );
        }

        $resourcePath = '/fleet/drivers/inactive/{driver_id_or_external_id}';
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
        if ($driver_id_or_external_id !== null) {
            $resourcePath = str_replace(
                '{' . 'driver_id_or_external_id' . '}',
                ObjectSerializer::toPathValue($driver_id_or_external_id),
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
     * Operation getDriverById
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Driver|string
     */
    public function getDriverById($access_token, $driver_id_or_external_id)
    {
        list($response) = $this->getDriverByIdWithHttpInfo($access_token, $driver_id_or_external_id);
        return $response;
    }

    /**
     * Operation getDriverByIdWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Driver|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getDriverByIdWithHttpInfo($access_token, $driver_id_or_external_id)
    {
        $request = $this->getDriverByIdRequest($access_token, $driver_id_or_external_id);

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
                    if ('\OpenAPI\Client\Model\Driver' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Driver', []),
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

            $returnType = '\OpenAPI\Client\Model\Driver';
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
                        '\OpenAPI\Client\Model\Driver',
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
     * Operation getDriverByIdAsync
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDriverByIdAsync($access_token, $driver_id_or_external_id)
    {
        return $this->getDriverByIdAsyncWithHttpInfo($access_token, $driver_id_or_external_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getDriverByIdAsyncWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDriverByIdAsyncWithHttpInfo($access_token, $driver_id_or_external_id)
    {
        $returnType = '\OpenAPI\Client\Model\Driver';
        $request = $this->getDriverByIdRequest($access_token, $driver_id_or_external_id);

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
     * Create request for operation 'getDriverById'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getDriverByIdRequest($access_token, $driver_id_or_external_id)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getDriverById'
            );
        }
        // verify the required parameter 'driver_id_or_external_id' is set
        if ($driver_id_or_external_id === null || (is_array($driver_id_or_external_id) && count($driver_id_or_external_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $driver_id_or_external_id when calling getDriverById'
            );
        }

        $resourcePath = '/fleet/drivers/{driver_id_or_external_id}';
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
        if ($driver_id_or_external_id !== null) {
            $resourcePath = str_replace(
                '{' . 'driver_id_or_external_id' . '}',
                ObjectSerializer::toPathValue($driver_id_or_external_id),
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
     * Operation getDriverDocumentTypesByOrgId
     *
     * /fleet/drivers/document_types
     *
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DocumentType[]|string
     */
    public function getDriverDocumentTypesByOrgId()
    {
        list($response) = $this->getDriverDocumentTypesByOrgIdWithHttpInfo();
        return $response;
    }

    /**
     * Operation getDriverDocumentTypesByOrgIdWithHttpInfo
     *
     * /fleet/drivers/document_types
     *
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DocumentType[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getDriverDocumentTypesByOrgIdWithHttpInfo()
    {
        $request = $this->getDriverDocumentTypesByOrgIdRequest();

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
                    if ('\OpenAPI\Client\Model\DocumentType[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DocumentType[]', []),
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

            $returnType = '\OpenAPI\Client\Model\DocumentType[]';
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
                        '\OpenAPI\Client\Model\DocumentType[]',
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
     * Operation getDriverDocumentTypesByOrgIdAsync
     *
     * /fleet/drivers/document_types
     *
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDriverDocumentTypesByOrgIdAsync()
    {
        return $this->getDriverDocumentTypesByOrgIdAsyncWithHttpInfo()
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getDriverDocumentTypesByOrgIdAsyncWithHttpInfo
     *
     * /fleet/drivers/document_types
     *
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDriverDocumentTypesByOrgIdAsyncWithHttpInfo()
    {
        $returnType = '\OpenAPI\Client\Model\DocumentType[]';
        $request = $this->getDriverDocumentTypesByOrgIdRequest();

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
     * Create request for operation 'getDriverDocumentTypesByOrgId'
     *
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getDriverDocumentTypesByOrgIdRequest()
    {

        $resourcePath = '/fleet/drivers/document_types';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;



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
     * Operation getDriverDocumentsByOrgId
     *
     * /fleet/drivers/documents
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $end_ms Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param  int $duration_ms Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Document[]|string
     */
    public function getDriverDocumentsByOrgId($access_token, $end_ms = null, $duration_ms = null)
    {
        list($response) = $this->getDriverDocumentsByOrgIdWithHttpInfo($access_token, $end_ms, $duration_ms);
        return $response;
    }

    /**
     * Operation getDriverDocumentsByOrgIdWithHttpInfo
     *
     * /fleet/drivers/documents
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $end_ms Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param  int $duration_ms Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Document[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getDriverDocumentsByOrgIdWithHttpInfo($access_token, $end_ms = null, $duration_ms = null)
    {
        $request = $this->getDriverDocumentsByOrgIdRequest($access_token, $end_ms, $duration_ms);

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
                    if ('\OpenAPI\Client\Model\Document[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Document[]', []),
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

            $returnType = '\OpenAPI\Client\Model\Document[]';
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
                        '\OpenAPI\Client\Model\Document[]',
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
     * Operation getDriverDocumentsByOrgIdAsync
     *
     * /fleet/drivers/documents
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $end_ms Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param  int $duration_ms Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDriverDocumentsByOrgIdAsync($access_token, $end_ms = null, $duration_ms = null)
    {
        return $this->getDriverDocumentsByOrgIdAsyncWithHttpInfo($access_token, $end_ms, $duration_ms)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getDriverDocumentsByOrgIdAsyncWithHttpInfo
     *
     * /fleet/drivers/documents
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $end_ms Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param  int $duration_ms Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDriverDocumentsByOrgIdAsyncWithHttpInfo($access_token, $end_ms = null, $duration_ms = null)
    {
        $returnType = '\OpenAPI\Client\Model\Document[]';
        $request = $this->getDriverDocumentsByOrgIdRequest($access_token, $end_ms, $duration_ms);

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
     * Create request for operation 'getDriverDocumentsByOrgId'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $end_ms Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param  int $duration_ms Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getDriverDocumentsByOrgIdRequest($access_token, $end_ms = null, $duration_ms = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getDriverDocumentsByOrgId'
            );
        }

        $resourcePath = '/fleet/drivers/documents';
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
        if ($end_ms !== null) {
            $queryParams['endMs'] = ObjectSerializer::toQueryValue($end_ms);
        }
        // query params
        if ($duration_ms !== null) {
            $queryParams['durationMs'] = ObjectSerializer::toQueryValue($duration_ms);
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
     * Operation getDriverSafetyScore
     *
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * @param  int $driver_id ID of the driver (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DriverSafetyScoreResponse|string
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
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DriverSafetyScoreResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getDriverSafetyScoreWithHttpInfo($driver_id, $access_token, $start_ms, $end_ms)
    {
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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\DriverSafetyScoreResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DriverSafetyScoreResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\DriverSafetyScoreResponse';
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
                        '\OpenAPI\Client\Model\DriverSafetyScoreResponse',
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
        $returnType = '\OpenAPI\Client\Model\DriverSafetyScoreResponse';
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
     * Operation getDvirs
     *
     * /fleet/maintenance/dvirs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $end_ms time in millis until the last dvir log. (required)
     * @param  int $duration_ms time in millis which corresponds to the duration before the end_ms. (required)
     * @param  int $group_id Group ID to query. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DvirListResponse|string
     */
    public function getDvirs($access_token, $end_ms, $duration_ms, $group_id = null)
    {
        list($response) = $this->getDvirsWithHttpInfo($access_token, $end_ms, $duration_ms, $group_id);
        return $response;
    }

    /**
     * Operation getDvirsWithHttpInfo
     *
     * /fleet/maintenance/dvirs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $end_ms time in millis until the last dvir log. (required)
     * @param  int $duration_ms time in millis which corresponds to the duration before the end_ms. (required)
     * @param  int $group_id Group ID to query. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DvirListResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getDvirsWithHttpInfo($access_token, $end_ms, $duration_ms, $group_id = null)
    {
        $request = $this->getDvirsRequest($access_token, $end_ms, $duration_ms, $group_id);

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
                    if ('\OpenAPI\Client\Model\DvirListResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DvirListResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\DvirListResponse';
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
                        '\OpenAPI\Client\Model\DvirListResponse',
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
     * Operation getDvirsAsync
     *
     * /fleet/maintenance/dvirs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $end_ms time in millis until the last dvir log. (required)
     * @param  int $duration_ms time in millis which corresponds to the duration before the end_ms. (required)
     * @param  int $group_id Group ID to query. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDvirsAsync($access_token, $end_ms, $duration_ms, $group_id = null)
    {
        return $this->getDvirsAsyncWithHttpInfo($access_token, $end_ms, $duration_ms, $group_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getDvirsAsyncWithHttpInfo
     *
     * /fleet/maintenance/dvirs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $end_ms time in millis until the last dvir log. (required)
     * @param  int $duration_ms time in millis which corresponds to the duration before the end_ms. (required)
     * @param  int $group_id Group ID to query. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getDvirsAsyncWithHttpInfo($access_token, $end_ms, $duration_ms, $group_id = null)
    {
        $returnType = '\OpenAPI\Client\Model\DvirListResponse';
        $request = $this->getDvirsRequest($access_token, $end_ms, $duration_ms, $group_id);

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
     * Create request for operation 'getDvirs'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $end_ms time in millis until the last dvir log. (required)
     * @param  int $duration_ms time in millis which corresponds to the duration before the end_ms. (required)
     * @param  int $group_id Group ID to query. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getDvirsRequest($access_token, $end_ms, $duration_ms, $group_id = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getDvirs'
            );
        }
        // verify the required parameter 'end_ms' is set
        if ($end_ms === null || (is_array($end_ms) && count($end_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $end_ms when calling getDvirs'
            );
        }
        // verify the required parameter 'duration_ms' is set
        if ($duration_ms === null || (is_array($duration_ms) && count($duration_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $duration_ms when calling getDvirs'
            );
        }

        $resourcePath = '/fleet/maintenance/dvirs';
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
        if ($end_ms !== null) {
            $queryParams['end_ms'] = ObjectSerializer::toQueryValue($end_ms);
        }
        // query params
        if ($duration_ms !== null) {
            $queryParams['duration_ms'] = ObjectSerializer::toQueryValue($duration_ms);
        }
        // query params
        if ($group_id !== null) {
            $queryParams['group_id'] = ObjectSerializer::toQueryValue($group_id);
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
     * Operation getFleetDrivers
     *
     * /fleet/drivers
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject3 $group_drivers_param group_drivers_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DriversResponse|string
     */
    public function getFleetDrivers($access_token, $group_drivers_param)
    {
        list($response) = $this->getFleetDriversWithHttpInfo($access_token, $group_drivers_param);
        return $response;
    }

    /**
     * Operation getFleetDriversWithHttpInfo
     *
     * /fleet/drivers
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject3 $group_drivers_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DriversResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getFleetDriversWithHttpInfo($access_token, $group_drivers_param)
    {
        $request = $this->getFleetDriversRequest($access_token, $group_drivers_param);

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
                    if ('\OpenAPI\Client\Model\DriversResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DriversResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\DriversResponse';
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
                        '\OpenAPI\Client\Model\DriversResponse',
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
     * Operation getFleetDriversAsync
     *
     * /fleet/drivers
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject3 $group_drivers_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetDriversAsync($access_token, $group_drivers_param)
    {
        return $this->getFleetDriversAsyncWithHttpInfo($access_token, $group_drivers_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getFleetDriversAsyncWithHttpInfo
     *
     * /fleet/drivers
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject3 $group_drivers_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetDriversAsyncWithHttpInfo($access_token, $group_drivers_param)
    {
        $returnType = '\OpenAPI\Client\Model\DriversResponse';
        $request = $this->getFleetDriversRequest($access_token, $group_drivers_param);

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
     * Create request for operation 'getFleetDrivers'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject3 $group_drivers_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getFleetDriversRequest($access_token, $group_drivers_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getFleetDrivers'
            );
        }
        // verify the required parameter 'group_drivers_param' is set
        if ($group_drivers_param === null || (is_array($group_drivers_param) && count($group_drivers_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $group_drivers_param when calling getFleetDrivers'
            );
        }

        $resourcePath = '/fleet/drivers';
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
        if (isset($group_drivers_param)) {
            $_tempBody = $group_drivers_param;
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
     * Operation getFleetDriversHosDailyLogs
     *
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with HOS logs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject6 $hos_logs_param hos_logs_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DriverDailyLogResponse|string
     */
    public function getFleetDriversHosDailyLogs($access_token, $driver_id, $hos_logs_param)
    {
        list($response) = $this->getFleetDriversHosDailyLogsWithHttpInfo($access_token, $driver_id, $hos_logs_param);
        return $response;
    }

    /**
     * Operation getFleetDriversHosDailyLogsWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with HOS logs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject6 $hos_logs_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DriverDailyLogResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getFleetDriversHosDailyLogsWithHttpInfo($access_token, $driver_id, $hos_logs_param)
    {
        $request = $this->getFleetDriversHosDailyLogsRequest($access_token, $driver_id, $hos_logs_param);

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
                    if ('\OpenAPI\Client\Model\DriverDailyLogResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DriverDailyLogResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\DriverDailyLogResponse';
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
                        '\OpenAPI\Client\Model\DriverDailyLogResponse',
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
     * Operation getFleetDriversHosDailyLogsAsync
     *
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with HOS logs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject6 $hos_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetDriversHosDailyLogsAsync($access_token, $driver_id, $hos_logs_param)
    {
        return $this->getFleetDriversHosDailyLogsAsyncWithHttpInfo($access_token, $driver_id, $hos_logs_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getFleetDriversHosDailyLogsAsyncWithHttpInfo
     *
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with HOS logs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject6 $hos_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetDriversHosDailyLogsAsyncWithHttpInfo($access_token, $driver_id, $hos_logs_param)
    {
        $returnType = '\OpenAPI\Client\Model\DriverDailyLogResponse';
        $request = $this->getFleetDriversHosDailyLogsRequest($access_token, $driver_id, $hos_logs_param);

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
     * Create request for operation 'getFleetDriversHosDailyLogs'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $driver_id ID of the driver with HOS logs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject6 $hos_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getFleetDriversHosDailyLogsRequest($access_token, $driver_id, $hos_logs_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getFleetDriversHosDailyLogs'
            );
        }
        // verify the required parameter 'driver_id' is set
        if ($driver_id === null || (is_array($driver_id) && count($driver_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $driver_id when calling getFleetDriversHosDailyLogs'
            );
        }
        // verify the required parameter 'hos_logs_param' is set
        if ($hos_logs_param === null || (is_array($hos_logs_param) && count($hos_logs_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $hos_logs_param when calling getFleetDriversHosDailyLogs'
            );
        }

        $resourcePath = '/fleet/drivers/{driver_id}/hos_daily_logs';
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
        if (isset($hos_logs_param)) {
            $_tempBody = $hos_logs_param;
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
     * Operation getFleetDriversSummary
     *
     * /fleet/drivers/summary
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject5 $drivers_summary_param drivers_summary_param (required)
     * @param  bool $snap_to_day_bounds Snap query result to HOS day boundaries. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\DriversSummaryResponse|string
     */
    public function getFleetDriversSummary($access_token, $drivers_summary_param, $snap_to_day_bounds = null)
    {
        list($response) = $this->getFleetDriversSummaryWithHttpInfo($access_token, $drivers_summary_param, $snap_to_day_bounds);
        return $response;
    }

    /**
     * Operation getFleetDriversSummaryWithHttpInfo
     *
     * /fleet/drivers/summary
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject5 $drivers_summary_param (required)
     * @param  bool $snap_to_day_bounds Snap query result to HOS day boundaries. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\DriversSummaryResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getFleetDriversSummaryWithHttpInfo($access_token, $drivers_summary_param, $snap_to_day_bounds = null)
    {
        $request = $this->getFleetDriversSummaryRequest($access_token, $drivers_summary_param, $snap_to_day_bounds);

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
                    if ('\OpenAPI\Client\Model\DriversSummaryResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\DriversSummaryResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\DriversSummaryResponse';
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
                        '\OpenAPI\Client\Model\DriversSummaryResponse',
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
     * Operation getFleetDriversSummaryAsync
     *
     * /fleet/drivers/summary
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject5 $drivers_summary_param (required)
     * @param  bool $snap_to_day_bounds Snap query result to HOS day boundaries. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetDriversSummaryAsync($access_token, $drivers_summary_param, $snap_to_day_bounds = null)
    {
        return $this->getFleetDriversSummaryAsyncWithHttpInfo($access_token, $drivers_summary_param, $snap_to_day_bounds)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getFleetDriversSummaryAsyncWithHttpInfo
     *
     * /fleet/drivers/summary
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject5 $drivers_summary_param (required)
     * @param  bool $snap_to_day_bounds Snap query result to HOS day boundaries. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetDriversSummaryAsyncWithHttpInfo($access_token, $drivers_summary_param, $snap_to_day_bounds = null)
    {
        $returnType = '\OpenAPI\Client\Model\DriversSummaryResponse';
        $request = $this->getFleetDriversSummaryRequest($access_token, $drivers_summary_param, $snap_to_day_bounds);

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
     * Create request for operation 'getFleetDriversSummary'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject5 $drivers_summary_param (required)
     * @param  bool $snap_to_day_bounds Snap query result to HOS day boundaries. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getFleetDriversSummaryRequest($access_token, $drivers_summary_param, $snap_to_day_bounds = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getFleetDriversSummary'
            );
        }
        // verify the required parameter 'drivers_summary_param' is set
        if ($drivers_summary_param === null || (is_array($drivers_summary_param) && count($drivers_summary_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $drivers_summary_param when calling getFleetDriversSummary'
            );
        }

        $resourcePath = '/fleet/drivers/summary';
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
        if ($snap_to_day_bounds !== null) {
            $queryParams['snap_to_day_bounds'] = ObjectSerializer::toQueryValue($snap_to_day_bounds);
        }


        // body params
        $_tempBody = null;
        if (isset($drivers_summary_param)) {
            $_tempBody = $drivers_summary_param;
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
     * Operation getFleetHosAuthenticationLogs
     *
     * /fleet/hos_authentication_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject7 $hos_authentication_logs_param hos_authentication_logs_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\HosAuthenticationLogsResponse|string
     */
    public function getFleetHosAuthenticationLogs($access_token, $hos_authentication_logs_param)
    {
        list($response) = $this->getFleetHosAuthenticationLogsWithHttpInfo($access_token, $hos_authentication_logs_param);
        return $response;
    }

    /**
     * Operation getFleetHosAuthenticationLogsWithHttpInfo
     *
     * /fleet/hos_authentication_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject7 $hos_authentication_logs_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\HosAuthenticationLogsResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getFleetHosAuthenticationLogsWithHttpInfo($access_token, $hos_authentication_logs_param)
    {
        $request = $this->getFleetHosAuthenticationLogsRequest($access_token, $hos_authentication_logs_param);

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
                    if ('\OpenAPI\Client\Model\HosAuthenticationLogsResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\HosAuthenticationLogsResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\HosAuthenticationLogsResponse';
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
                        '\OpenAPI\Client\Model\HosAuthenticationLogsResponse',
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
     * Operation getFleetHosAuthenticationLogsAsync
     *
     * /fleet/hos_authentication_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject7 $hos_authentication_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetHosAuthenticationLogsAsync($access_token, $hos_authentication_logs_param)
    {
        return $this->getFleetHosAuthenticationLogsAsyncWithHttpInfo($access_token, $hos_authentication_logs_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getFleetHosAuthenticationLogsAsyncWithHttpInfo
     *
     * /fleet/hos_authentication_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject7 $hos_authentication_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetHosAuthenticationLogsAsyncWithHttpInfo($access_token, $hos_authentication_logs_param)
    {
        $returnType = '\OpenAPI\Client\Model\HosAuthenticationLogsResponse';
        $request = $this->getFleetHosAuthenticationLogsRequest($access_token, $hos_authentication_logs_param);

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
     * Create request for operation 'getFleetHosAuthenticationLogs'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject7 $hos_authentication_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getFleetHosAuthenticationLogsRequest($access_token, $hos_authentication_logs_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getFleetHosAuthenticationLogs'
            );
        }
        // verify the required parameter 'hos_authentication_logs_param' is set
        if ($hos_authentication_logs_param === null || (is_array($hos_authentication_logs_param) && count($hos_authentication_logs_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $hos_authentication_logs_param when calling getFleetHosAuthenticationLogs'
            );
        }

        $resourcePath = '/fleet/hos_authentication_logs';
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
        if (isset($hos_authentication_logs_param)) {
            $_tempBody = $hos_authentication_logs_param;
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
     * Operation getFleetHosLogs
     *
     * /fleet/hos_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject8 $hos_logs_param hos_logs_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\HosLogsResponse|string
     */
    public function getFleetHosLogs($access_token, $hos_logs_param)
    {
        list($response) = $this->getFleetHosLogsWithHttpInfo($access_token, $hos_logs_param);
        return $response;
    }

    /**
     * Operation getFleetHosLogsWithHttpInfo
     *
     * /fleet/hos_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject8 $hos_logs_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\HosLogsResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getFleetHosLogsWithHttpInfo($access_token, $hos_logs_param)
    {
        $request = $this->getFleetHosLogsRequest($access_token, $hos_logs_param);

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
                    if ('\OpenAPI\Client\Model\HosLogsResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\HosLogsResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\HosLogsResponse';
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
                        '\OpenAPI\Client\Model\HosLogsResponse',
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
     * Operation getFleetHosLogsAsync
     *
     * /fleet/hos_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject8 $hos_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetHosLogsAsync($access_token, $hos_logs_param)
    {
        return $this->getFleetHosLogsAsyncWithHttpInfo($access_token, $hos_logs_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getFleetHosLogsAsyncWithHttpInfo
     *
     * /fleet/hos_logs
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject8 $hos_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetHosLogsAsyncWithHttpInfo($access_token, $hos_logs_param)
    {
        $returnType = '\OpenAPI\Client\Model\HosLogsResponse';
        $request = $this->getFleetHosLogsRequest($access_token, $hos_logs_param);

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
     * Create request for operation 'getFleetHosLogs'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject8 $hos_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getFleetHosLogsRequest($access_token, $hos_logs_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getFleetHosLogs'
            );
        }
        // verify the required parameter 'hos_logs_param' is set
        if ($hos_logs_param === null || (is_array($hos_logs_param) && count($hos_logs_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $hos_logs_param when calling getFleetHosLogs'
            );
        }

        $resourcePath = '/fleet/hos_logs';
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
        if (isset($hos_logs_param)) {
            $_tempBody = $hos_logs_param;
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
     * Operation getFleetHosLogsSummary
     *
     * /fleet/hos_logs_summary
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject9 $hos_logs_param hos_logs_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\HosLogsSummaryResponse|string
     */
    public function getFleetHosLogsSummary($access_token, $hos_logs_param)
    {
        list($response) = $this->getFleetHosLogsSummaryWithHttpInfo($access_token, $hos_logs_param);
        return $response;
    }

    /**
     * Operation getFleetHosLogsSummaryWithHttpInfo
     *
     * /fleet/hos_logs_summary
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject9 $hos_logs_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\HosLogsSummaryResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getFleetHosLogsSummaryWithHttpInfo($access_token, $hos_logs_param)
    {
        $request = $this->getFleetHosLogsSummaryRequest($access_token, $hos_logs_param);

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
                    if ('\OpenAPI\Client\Model\HosLogsSummaryResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\HosLogsSummaryResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\HosLogsSummaryResponse';
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
                        '\OpenAPI\Client\Model\HosLogsSummaryResponse',
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
     * Operation getFleetHosLogsSummaryAsync
     *
     * /fleet/hos_logs_summary
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject9 $hos_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetHosLogsSummaryAsync($access_token, $hos_logs_param)
    {
        return $this->getFleetHosLogsSummaryAsyncWithHttpInfo($access_token, $hos_logs_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getFleetHosLogsSummaryAsyncWithHttpInfo
     *
     * /fleet/hos_logs_summary
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject9 $hos_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetHosLogsSummaryAsyncWithHttpInfo($access_token, $hos_logs_param)
    {
        $returnType = '\OpenAPI\Client\Model\HosLogsSummaryResponse';
        $request = $this->getFleetHosLogsSummaryRequest($access_token, $hos_logs_param);

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
     * Create request for operation 'getFleetHosLogsSummary'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject9 $hos_logs_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getFleetHosLogsSummaryRequest($access_token, $hos_logs_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getFleetHosLogsSummary'
            );
        }
        // verify the required parameter 'hos_logs_param' is set
        if ($hos_logs_param === null || (is_array($hos_logs_param) && count($hos_logs_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $hos_logs_param when calling getFleetHosLogsSummary'
            );
        }

        $resourcePath = '/fleet/hos_logs_summary';
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
        if (isset($hos_logs_param)) {
            $_tempBody = $hos_logs_param;
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
     * Operation getFleetLocations
     *
     * /fleet/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject11 $group_param group_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\InlineResponse2003|string
     */
    public function getFleetLocations($access_token, $group_param)
    {
        list($response) = $this->getFleetLocationsWithHttpInfo($access_token, $group_param);
        return $response;
    }

    /**
     * Operation getFleetLocationsWithHttpInfo
     *
     * /fleet/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject11 $group_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\InlineResponse2003|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getFleetLocationsWithHttpInfo($access_token, $group_param)
    {
        $request = $this->getFleetLocationsRequest($access_token, $group_param);

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
                    if ('\OpenAPI\Client\Model\InlineResponse2003' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\InlineResponse2003', []),
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

            $returnType = '\OpenAPI\Client\Model\InlineResponse2003';
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
                        '\OpenAPI\Client\Model\InlineResponse2003',
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
     * Operation getFleetLocationsAsync
     *
     * /fleet/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject11 $group_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetLocationsAsync($access_token, $group_param)
    {
        return $this->getFleetLocationsAsyncWithHttpInfo($access_token, $group_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getFleetLocationsAsyncWithHttpInfo
     *
     * /fleet/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject11 $group_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetLocationsAsyncWithHttpInfo($access_token, $group_param)
    {
        $returnType = '\OpenAPI\Client\Model\InlineResponse2003';
        $request = $this->getFleetLocationsRequest($access_token, $group_param);

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
     * Create request for operation 'getFleetLocations'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject11 $group_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getFleetLocationsRequest($access_token, $group_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getFleetLocations'
            );
        }
        // verify the required parameter 'group_param' is set
        if ($group_param === null || (is_array($group_param) && count($group_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $group_param when calling getFleetLocations'
            );
        }

        $resourcePath = '/fleet/locations';
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
        if (isset($group_param)) {
            $_tempBody = $group_param;
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
     * Operation getFleetMaintenanceList
     *
     * /fleet/maintenance/list
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject13 $group_param group_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\InlineResponse2004|string
     */
    public function getFleetMaintenanceList($access_token, $group_param)
    {
        list($response) = $this->getFleetMaintenanceListWithHttpInfo($access_token, $group_param);
        return $response;
    }

    /**
     * Operation getFleetMaintenanceListWithHttpInfo
     *
     * /fleet/maintenance/list
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject13 $group_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\InlineResponse2004|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getFleetMaintenanceListWithHttpInfo($access_token, $group_param)
    {
        $request = $this->getFleetMaintenanceListRequest($access_token, $group_param);

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
                    if ('\OpenAPI\Client\Model\InlineResponse2004' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\InlineResponse2004', []),
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

            $returnType = '\OpenAPI\Client\Model\InlineResponse2004';
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
                        '\OpenAPI\Client\Model\InlineResponse2004',
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
     * Operation getFleetMaintenanceListAsync
     *
     * /fleet/maintenance/list
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject13 $group_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetMaintenanceListAsync($access_token, $group_param)
    {
        return $this->getFleetMaintenanceListAsyncWithHttpInfo($access_token, $group_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getFleetMaintenanceListAsyncWithHttpInfo
     *
     * /fleet/maintenance/list
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject13 $group_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetMaintenanceListAsyncWithHttpInfo($access_token, $group_param)
    {
        $returnType = '\OpenAPI\Client\Model\InlineResponse2004';
        $request = $this->getFleetMaintenanceListRequest($access_token, $group_param);

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
     * Create request for operation 'getFleetMaintenanceList'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject13 $group_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getFleetMaintenanceListRequest($access_token, $group_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getFleetMaintenanceList'
            );
        }
        // verify the required parameter 'group_param' is set
        if ($group_param === null || (is_array($group_param) && count($group_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $group_param when calling getFleetMaintenanceList'
            );
        }

        $resourcePath = '/fleet/maintenance/list';
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
        if (isset($group_param)) {
            $_tempBody = $group_param;
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
     * Operation getFleetTrips
     *
     * /fleet/trips
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject15 $trips_param trips_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\TripResponse|string
     */
    public function getFleetTrips($access_token, $trips_param)
    {
        list($response) = $this->getFleetTripsWithHttpInfo($access_token, $trips_param);
        return $response;
    }

    /**
     * Operation getFleetTripsWithHttpInfo
     *
     * /fleet/trips
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject15 $trips_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\TripResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getFleetTripsWithHttpInfo($access_token, $trips_param)
    {
        $request = $this->getFleetTripsRequest($access_token, $trips_param);

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
                    if ('\OpenAPI\Client\Model\TripResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\TripResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\TripResponse';
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
                        '\OpenAPI\Client\Model\TripResponse',
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
     * Operation getFleetTripsAsync
     *
     * /fleet/trips
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject15 $trips_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetTripsAsync($access_token, $trips_param)
    {
        return $this->getFleetTripsAsyncWithHttpInfo($access_token, $trips_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getFleetTripsAsyncWithHttpInfo
     *
     * /fleet/trips
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject15 $trips_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetTripsAsyncWithHttpInfo($access_token, $trips_param)
    {
        $returnType = '\OpenAPI\Client\Model\TripResponse';
        $request = $this->getFleetTripsRequest($access_token, $trips_param);

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
     * Create request for operation 'getFleetTrips'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject15 $trips_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getFleetTripsRequest($access_token, $trips_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getFleetTrips'
            );
        }
        // verify the required parameter 'trips_param' is set
        if ($trips_param === null || (is_array($trips_param) && count($trips_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $trips_param when calling getFleetTrips'
            );
        }

        $resourcePath = '/fleet/trips';
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
        if (isset($trips_param)) {
            $_tempBody = $trips_param;
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
     * Operation getFleetVehicle
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\FleetVehicleResponse|string
     */
    public function getFleetVehicle($access_token, $vehicle_id_or_external_id)
    {
        list($response) = $this->getFleetVehicleWithHttpInfo($access_token, $vehicle_id_or_external_id);
        return $response;
    }

    /**
     * Operation getFleetVehicleWithHttpInfo
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\FleetVehicleResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getFleetVehicleWithHttpInfo($access_token, $vehicle_id_or_external_id)
    {
        $request = $this->getFleetVehicleRequest($access_token, $vehicle_id_or_external_id);

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
                    if ('\OpenAPI\Client\Model\FleetVehicleResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\FleetVehicleResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\FleetVehicleResponse';
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
                        '\OpenAPI\Client\Model\FleetVehicleResponse',
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
     * Operation getFleetVehicleAsync
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetVehicleAsync($access_token, $vehicle_id_or_external_id)
    {
        return $this->getFleetVehicleAsyncWithHttpInfo($access_token, $vehicle_id_or_external_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getFleetVehicleAsyncWithHttpInfo
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getFleetVehicleAsyncWithHttpInfo($access_token, $vehicle_id_or_external_id)
    {
        $returnType = '\OpenAPI\Client\Model\FleetVehicleResponse';
        $request = $this->getFleetVehicleRequest($access_token, $vehicle_id_or_external_id);

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
     * Create request for operation 'getFleetVehicle'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getFleetVehicleRequest($access_token, $vehicle_id_or_external_id)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getFleetVehicle'
            );
        }
        // verify the required parameter 'vehicle_id_or_external_id' is set
        if ($vehicle_id_or_external_id === null || (is_array($vehicle_id_or_external_id) && count($vehicle_id_or_external_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $vehicle_id_or_external_id when calling getFleetVehicle'
            );
        }

        $resourcePath = '/fleet/vehicles/{vehicle_id_or_external_id}';
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
        if ($vehicle_id_or_external_id !== null) {
            $resourcePath = str_replace(
                '{' . 'vehicle_id_or_external_id' . '}',
                ObjectSerializer::toPathValue($vehicle_id_or_external_id),
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
     * Operation getOrganizationAddress
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Address|string
     */
    public function getOrganizationAddress($access_token, $address_id)
    {
        list($response) = $this->getOrganizationAddressWithHttpInfo($access_token, $address_id);
        return $response;
    }

    /**
     * Operation getOrganizationAddressWithHttpInfo
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Address|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getOrganizationAddressWithHttpInfo($access_token, $address_id)
    {
        $request = $this->getOrganizationAddressRequest($access_token, $address_id);

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
                    if ('\OpenAPI\Client\Model\Address' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Address', []),
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

            $returnType = '\OpenAPI\Client\Model\Address';
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
                        '\OpenAPI\Client\Model\Address',
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
     * Operation getOrganizationAddressAsync
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getOrganizationAddressAsync($access_token, $address_id)
    {
        return $this->getOrganizationAddressAsyncWithHttpInfo($access_token, $address_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getOrganizationAddressAsyncWithHttpInfo
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getOrganizationAddressAsyncWithHttpInfo($access_token, $address_id)
    {
        $returnType = '\OpenAPI\Client\Model\Address';
        $request = $this->getOrganizationAddressRequest($access_token, $address_id);

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
     * Create request for operation 'getOrganizationAddress'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getOrganizationAddressRequest($access_token, $address_id)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getOrganizationAddress'
            );
        }
        // verify the required parameter 'address_id' is set
        if ($address_id === null || (is_array($address_id) && count($address_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $address_id when calling getOrganizationAddress'
            );
        }

        $resourcePath = '/addresses/{addressId}';
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
        if ($address_id !== null) {
            $resourcePath = str_replace(
                '{' . 'addressId' . '}',
                ObjectSerializer::toPathValue($address_id),
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
     * Operation getOrganizationAddresses
     *
     * /addresses
     *
     * @param  string $access_token Samsara API access token. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Address[]|string
     */
    public function getOrganizationAddresses($access_token)
    {
        list($response) = $this->getOrganizationAddressesWithHttpInfo($access_token);
        return $response;
    }

    /**
     * Operation getOrganizationAddressesWithHttpInfo
     *
     * /addresses
     *
     * @param  string $access_token Samsara API access token. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Address[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getOrganizationAddressesWithHttpInfo($access_token)
    {
        $request = $this->getOrganizationAddressesRequest($access_token);

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
                    if ('\OpenAPI\Client\Model\Address[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Address[]', []),
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

            $returnType = '\OpenAPI\Client\Model\Address[]';
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
                        '\OpenAPI\Client\Model\Address[]',
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
     * Operation getOrganizationAddressesAsync
     *
     * /addresses
     *
     * @param  string $access_token Samsara API access token. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getOrganizationAddressesAsync($access_token)
    {
        return $this->getOrganizationAddressesAsyncWithHttpInfo($access_token)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getOrganizationAddressesAsyncWithHttpInfo
     *
     * /addresses
     *
     * @param  string $access_token Samsara API access token. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getOrganizationAddressesAsyncWithHttpInfo($access_token)
    {
        $returnType = '\OpenAPI\Client\Model\Address[]';
        $request = $this->getOrganizationAddressesRequest($access_token);

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
     * Create request for operation 'getOrganizationAddresses'
     *
     * @param  string $access_token Samsara API access token. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getOrganizationAddressesRequest($access_token)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getOrganizationAddresses'
            );
        }

        $resourcePath = '/addresses';
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
     * Operation getOrganizationContact
     *
     * /contacts/{contact_id}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $contact_id ID of the contact (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Contact|string
     */
    public function getOrganizationContact($access_token, $contact_id)
    {
        list($response) = $this->getOrganizationContactWithHttpInfo($access_token, $contact_id);
        return $response;
    }

    /**
     * Operation getOrganizationContactWithHttpInfo
     *
     * /contacts/{contact_id}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $contact_id ID of the contact (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Contact|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getOrganizationContactWithHttpInfo($access_token, $contact_id)
    {
        $request = $this->getOrganizationContactRequest($access_token, $contact_id);

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
                    if ('\OpenAPI\Client\Model\Contact' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Contact', []),
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

            $returnType = '\OpenAPI\Client\Model\Contact';
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
                        '\OpenAPI\Client\Model\Contact',
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
     * Operation getOrganizationContactAsync
     *
     * /contacts/{contact_id}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $contact_id ID of the contact (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getOrganizationContactAsync($access_token, $contact_id)
    {
        return $this->getOrganizationContactAsyncWithHttpInfo($access_token, $contact_id)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getOrganizationContactAsyncWithHttpInfo
     *
     * /contacts/{contact_id}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $contact_id ID of the contact (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getOrganizationContactAsyncWithHttpInfo($access_token, $contact_id)
    {
        $returnType = '\OpenAPI\Client\Model\Contact';
        $request = $this->getOrganizationContactRequest($access_token, $contact_id);

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
     * Create request for operation 'getOrganizationContact'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $contact_id ID of the contact (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getOrganizationContactRequest($access_token, $contact_id)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getOrganizationContact'
            );
        }
        // verify the required parameter 'contact_id' is set
        if ($contact_id === null || (is_array($contact_id) && count($contact_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $contact_id when calling getOrganizationContact'
            );
        }

        $resourcePath = '/contacts/{contact_id}';
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
        if ($contact_id !== null) {
            $resourcePath = str_replace(
                '{' . 'contact_id' . '}',
                ObjectSerializer::toPathValue($contact_id),
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
     * Operation getVehicleHarshEvent
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\VehicleHarshEventResponse|string
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
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\VehicleHarshEventResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getVehicleHarshEventWithHttpInfo($vehicle_id, $access_token, $timestamp)
    {
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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\VehicleHarshEventResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\VehicleHarshEventResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\VehicleHarshEventResponse';
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
                        '\OpenAPI\Client\Model\VehicleHarshEventResponse',
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
        $returnType = '\OpenAPI\Client\Model\VehicleHarshEventResponse';
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
     * Operation getVehicleLocations
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\FleetVehicleLocation[]|string
     */
    public function getVehicleLocations($access_token, $vehicle_id, $start_ms, $end_ms)
    {
        list($response) = $this->getVehicleLocationsWithHttpInfo($access_token, $vehicle_id, $start_ms, $end_ms);
        return $response;
    }

    /**
     * Operation getVehicleLocationsWithHttpInfo
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\FleetVehicleLocation[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getVehicleLocationsWithHttpInfo($access_token, $vehicle_id, $start_ms, $end_ms)
    {
        $request = $this->getVehicleLocationsRequest($access_token, $vehicle_id, $start_ms, $end_ms);

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
                    if ('\OpenAPI\Client\Model\FleetVehicleLocation[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\FleetVehicleLocation[]', []),
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

            $returnType = '\OpenAPI\Client\Model\FleetVehicleLocation[]';
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
                        '\OpenAPI\Client\Model\FleetVehicleLocation[]',
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
     * Operation getVehicleLocationsAsync
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getVehicleLocationsAsync($access_token, $vehicle_id, $start_ms, $end_ms)
    {
        return $this->getVehicleLocationsAsyncWithHttpInfo($access_token, $vehicle_id, $start_ms, $end_ms)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getVehicleLocationsAsyncWithHttpInfo
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getVehicleLocationsAsyncWithHttpInfo($access_token, $vehicle_id, $start_ms, $end_ms)
    {
        $returnType = '\OpenAPI\Client\Model\FleetVehicleLocation[]';
        $request = $this->getVehicleLocationsRequest($access_token, $vehicle_id, $start_ms, $end_ms);

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
     * Create request for operation 'getVehicleLocations'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $vehicle_id ID of the vehicle with the associated routes. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getVehicleLocationsRequest($access_token, $vehicle_id, $start_ms, $end_ms)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getVehicleLocations'
            );
        }
        // verify the required parameter 'vehicle_id' is set
        if ($vehicle_id === null || (is_array($vehicle_id) && count($vehicle_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $vehicle_id when calling getVehicleLocations'
            );
        }
        // verify the required parameter 'start_ms' is set
        if ($start_ms === null || (is_array($start_ms) && count($start_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $start_ms when calling getVehicleLocations'
            );
        }
        // verify the required parameter 'end_ms' is set
        if ($end_ms === null || (is_array($end_ms) && count($end_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $end_ms when calling getVehicleLocations'
            );
        }

        $resourcePath = '/fleet/vehicles/{vehicle_id}/locations';
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
     * Operation getVehicleSafetyScore
     *
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * @param  int $vehicle_id ID of the vehicle (required)
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param  int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\VehicleSafetyScoreResponse|string
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
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\VehicleSafetyScoreResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getVehicleSafetyScoreWithHttpInfo($vehicle_id, $access_token, $start_ms, $end_ms)
    {
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
            switch($statusCode) {
                case 200:
                    if ('\OpenAPI\Client\Model\VehicleSafetyScoreResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\VehicleSafetyScoreResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\VehicleSafetyScoreResponse';
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
                        '\OpenAPI\Client\Model\VehicleSafetyScoreResponse',
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
        $returnType = '\OpenAPI\Client\Model\VehicleSafetyScoreResponse';
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
     * Operation getVehicleStats
     *
     * /fleet/vehicles/stats
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query. (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query. (required)
     * @param  string $series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
     * @param  string $tag_ids Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
     * @param  string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\InlineResponse2005|string
     */
    public function getVehicleStats($access_token, $start_ms, $end_ms, $series = null, $tag_ids = null, $starting_after = null, $ending_before = null, $limit = null)
    {
        list($response) = $this->getVehicleStatsWithHttpInfo($access_token, $start_ms, $end_ms, $series, $tag_ids, $starting_after, $ending_before, $limit);
        return $response;
    }

    /**
     * Operation getVehicleStatsWithHttpInfo
     *
     * /fleet/vehicles/stats
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query. (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query. (required)
     * @param  string $series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
     * @param  string $tag_ids Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
     * @param  string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\InlineResponse2005|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getVehicleStatsWithHttpInfo($access_token, $start_ms, $end_ms, $series = null, $tag_ids = null, $starting_after = null, $ending_before = null, $limit = null)
    {
        $request = $this->getVehicleStatsRequest($access_token, $start_ms, $end_ms, $series, $tag_ids, $starting_after, $ending_before, $limit);

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
                    if ('\OpenAPI\Client\Model\InlineResponse2005' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\InlineResponse2005', []),
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

            $returnType = '\OpenAPI\Client\Model\InlineResponse2005';
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
                        '\OpenAPI\Client\Model\InlineResponse2005',
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
     * Operation getVehicleStatsAsync
     *
     * /fleet/vehicles/stats
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query. (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query. (required)
     * @param  string $series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
     * @param  string $tag_ids Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
     * @param  string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getVehicleStatsAsync($access_token, $start_ms, $end_ms, $series = null, $tag_ids = null, $starting_after = null, $ending_before = null, $limit = null)
    {
        return $this->getVehicleStatsAsyncWithHttpInfo($access_token, $start_ms, $end_ms, $series, $tag_ids, $starting_after, $ending_before, $limit)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getVehicleStatsAsyncWithHttpInfo
     *
     * /fleet/vehicles/stats
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query. (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query. (required)
     * @param  string $series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
     * @param  string $tag_ids Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
     * @param  string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getVehicleStatsAsyncWithHttpInfo($access_token, $start_ms, $end_ms, $series = null, $tag_ids = null, $starting_after = null, $ending_before = null, $limit = null)
    {
        $returnType = '\OpenAPI\Client\Model\InlineResponse2005';
        $request = $this->getVehicleStatsRequest($access_token, $start_ms, $end_ms, $series, $tag_ids, $starting_after, $ending_before, $limit);

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
     * Create request for operation 'getVehicleStats'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query. (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query. (required)
     * @param  string $series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
     * @param  string $tag_ids Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
     * @param  string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getVehicleStatsRequest($access_token, $start_ms, $end_ms, $series = null, $tag_ids = null, $starting_after = null, $ending_before = null, $limit = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getVehicleStats'
            );
        }
        // verify the required parameter 'start_ms' is set
        if ($start_ms === null || (is_array($start_ms) && count($start_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $start_ms when calling getVehicleStats'
            );
        }
        // verify the required parameter 'end_ms' is set
        if ($end_ms === null || (is_array($end_ms) && count($end_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $end_ms when calling getVehicleStats'
            );
        }

        $resourcePath = '/fleet/vehicles/stats';
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
        // query params
        if ($series !== null) {
            $queryParams['series'] = ObjectSerializer::toQueryValue($series);
        }
        // query params
        if ($tag_ids !== null) {
            $queryParams['tagIds'] = ObjectSerializer::toQueryValue($tag_ids);
        }
        // query params
        if ($starting_after !== null) {
            $queryParams['startingAfter'] = ObjectSerializer::toQueryValue($starting_after);
        }
        // query params
        if ($ending_before !== null) {
            $queryParams['endingBefore'] = ObjectSerializer::toQueryValue($ending_before);
        }
        // query params
        if ($limit !== null) {
            $queryParams['limit'] = ObjectSerializer::toQueryValue($limit);
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
     * Operation getVehiclesLocations
     *
     * /fleet/vehicles/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return object[]|string
     */
    public function getVehiclesLocations($access_token, $start_ms, $end_ms)
    {
        list($response) = $this->getVehiclesLocationsWithHttpInfo($access_token, $start_ms, $end_ms);
        return $response;
    }

    /**
     * Operation getVehiclesLocationsWithHttpInfo
     *
     * /fleet/vehicles/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of object[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function getVehiclesLocationsWithHttpInfo($access_token, $start_ms, $end_ms)
    {
        $request = $this->getVehiclesLocationsRequest($access_token, $start_ms, $end_ms);

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
                    if ('object[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, 'object[]', []),
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

            $returnType = 'object[]';
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
                        'object[]',
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
     * Operation getVehiclesLocationsAsync
     *
     * /fleet/vehicles/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getVehiclesLocationsAsync($access_token, $start_ms, $end_ms)
    {
        return $this->getVehiclesLocationsAsyncWithHttpInfo($access_token, $start_ms, $end_ms)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getVehiclesLocationsAsyncWithHttpInfo
     *
     * /fleet/vehicles/locations
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getVehiclesLocationsAsyncWithHttpInfo($access_token, $start_ms, $end_ms)
    {
        $returnType = 'object[]';
        $request = $this->getVehiclesLocationsRequest($access_token, $start_ms, $end_ms);

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
     * Create request for operation 'getVehiclesLocations'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param  int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getVehiclesLocationsRequest($access_token, $start_ms, $end_ms)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling getVehiclesLocations'
            );
        }
        // verify the required parameter 'start_ms' is set
        if ($start_ms === null || (is_array($start_ms) && count($start_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $start_ms when calling getVehiclesLocations'
            );
        }
        // verify the required parameter 'end_ms' is set
        if ($end_ms === null || (is_array($end_ms) && count($end_ms) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $end_ms when calling getVehiclesLocations'
            );
        }

        $resourcePath = '/fleet/vehicles/locations';
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
     * Operation listContacts
     *
     * /contacts
     *
     * @param  string $access_token Samsara API access token. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Contact[]|string
     */
    public function listContacts($access_token)
    {
        list($response) = $this->listContactsWithHttpInfo($access_token);
        return $response;
    }

    /**
     * Operation listContactsWithHttpInfo
     *
     * /contacts
     *
     * @param  string $access_token Samsara API access token. (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Contact[]|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function listContactsWithHttpInfo($access_token)
    {
        $request = $this->listContactsRequest($access_token);

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
                    if ('\OpenAPI\Client\Model\Contact[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Contact[]', []),
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

            $returnType = '\OpenAPI\Client\Model\Contact[]';
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
                        '\OpenAPI\Client\Model\Contact[]',
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
     * Operation listContactsAsync
     *
     * /contacts
     *
     * @param  string $access_token Samsara API access token. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function listContactsAsync($access_token)
    {
        return $this->listContactsAsyncWithHttpInfo($access_token)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation listContactsAsyncWithHttpInfo
     *
     * /contacts
     *
     * @param  string $access_token Samsara API access token. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function listContactsAsyncWithHttpInfo($access_token)
    {
        $returnType = '\OpenAPI\Client\Model\Contact[]';
        $request = $this->listContactsRequest($access_token);

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
     * Create request for operation 'listContacts'
     *
     * @param  string $access_token Samsara API access token. (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function listContactsRequest($access_token)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling listContacts'
            );
        }

        $resourcePath = '/contacts';
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
     * Operation listFleet
     *
     * /fleet/list
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject10 $group_param group_param (required)
     * @param  string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\InlineResponse2002|string
     */
    public function listFleet($access_token, $group_param, $starting_after = null, $ending_before = null, $limit = null)
    {
        list($response) = $this->listFleetWithHttpInfo($access_token, $group_param, $starting_after, $ending_before, $limit);
        return $response;
    }

    /**
     * Operation listFleetWithHttpInfo
     *
     * /fleet/list
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject10 $group_param (required)
     * @param  string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\InlineResponse2002|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function listFleetWithHttpInfo($access_token, $group_param, $starting_after = null, $ending_before = null, $limit = null)
    {
        $request = $this->listFleetRequest($access_token, $group_param, $starting_after, $ending_before, $limit);

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
                    if ('\OpenAPI\Client\Model\InlineResponse2002' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\InlineResponse2002', []),
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

            $returnType = '\OpenAPI\Client\Model\InlineResponse2002';
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
                        '\OpenAPI\Client\Model\InlineResponse2002',
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
     * Operation listFleetAsync
     *
     * /fleet/list
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject10 $group_param (required)
     * @param  string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function listFleetAsync($access_token, $group_param, $starting_after = null, $ending_before = null, $limit = null)
    {
        return $this->listFleetAsyncWithHttpInfo($access_token, $group_param, $starting_after, $ending_before, $limit)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation listFleetAsyncWithHttpInfo
     *
     * /fleet/list
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject10 $group_param (required)
     * @param  string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function listFleetAsyncWithHttpInfo($access_token, $group_param, $starting_after = null, $ending_before = null, $limit = null)
    {
        $returnType = '\OpenAPI\Client\Model\InlineResponse2002';
        $request = $this->listFleetRequest($access_token, $group_param, $starting_after, $ending_before, $limit);

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
     * Create request for operation 'listFleet'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject10 $group_param (required)
     * @param  string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param  string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param  int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function listFleetRequest($access_token, $group_param, $starting_after = null, $ending_before = null, $limit = null)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling listFleet'
            );
        }
        // verify the required parameter 'group_param' is set
        if ($group_param === null || (is_array($group_param) && count($group_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $group_param when calling listFleet'
            );
        }

        $resourcePath = '/fleet/list';
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
        if ($starting_after !== null) {
            $queryParams['startingAfter'] = ObjectSerializer::toQueryValue($starting_after);
        }
        // query params
        if ($ending_before !== null) {
            $queryParams['endingBefore'] = ObjectSerializer::toQueryValue($ending_before);
        }
        // query params
        if ($limit !== null) {
            $queryParams['limit'] = ObjectSerializer::toQueryValue($limit);
        }


        // body params
        $_tempBody = null;
        if (isset($group_param)) {
            $_tempBody = $group_param;
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
     * Operation patchFleetVehicle
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject16 $data data (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\FleetVehicleResponse|string
     */
    public function patchFleetVehicle($access_token, $vehicle_id_or_external_id, $data)
    {
        list($response) = $this->patchFleetVehicleWithHttpInfo($access_token, $vehicle_id_or_external_id, $data);
        return $response;
    }

    /**
     * Operation patchFleetVehicleWithHttpInfo
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject16 $data (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\FleetVehicleResponse|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function patchFleetVehicleWithHttpInfo($access_token, $vehicle_id_or_external_id, $data)
    {
        $request = $this->patchFleetVehicleRequest($access_token, $vehicle_id_or_external_id, $data);

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
                    if ('\OpenAPI\Client\Model\FleetVehicleResponse' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\FleetVehicleResponse', []),
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

            $returnType = '\OpenAPI\Client\Model\FleetVehicleResponse';
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
                        '\OpenAPI\Client\Model\FleetVehicleResponse',
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
     * Operation patchFleetVehicleAsync
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject16 $data (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function patchFleetVehicleAsync($access_token, $vehicle_id_or_external_id, $data)
    {
        return $this->patchFleetVehicleAsyncWithHttpInfo($access_token, $vehicle_id_or_external_id, $data)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation patchFleetVehicleAsyncWithHttpInfo
     *
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject16 $data (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function patchFleetVehicleAsyncWithHttpInfo($access_token, $vehicle_id_or_external_id, $data)
    {
        $returnType = '\OpenAPI\Client\Model\FleetVehicleResponse';
        $request = $this->patchFleetVehicleRequest($access_token, $vehicle_id_or_external_id, $data);

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
     * Create request for operation 'patchFleetVehicle'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject16 $data (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function patchFleetVehicleRequest($access_token, $vehicle_id_or_external_id, $data)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling patchFleetVehicle'
            );
        }
        // verify the required parameter 'vehicle_id_or_external_id' is set
        if ($vehicle_id_or_external_id === null || (is_array($vehicle_id_or_external_id) && count($vehicle_id_or_external_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $vehicle_id_or_external_id when calling patchFleetVehicle'
            );
        }
        // verify the required parameter 'data' is set
        if ($data === null || (is_array($data) && count($data) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $data when calling patchFleetVehicle'
            );
        }

        $resourcePath = '/fleet/vehicles/{vehicle_id_or_external_id}';
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
        if ($vehicle_id_or_external_id !== null) {
            $resourcePath = str_replace(
                '{' . 'vehicle_id_or_external_id' . '}',
                ObjectSerializer::toPathValue($vehicle_id_or_external_id),
                $resourcePath
            );
        }

        // body params
        $_tempBody = null;
        if (isset($data)) {
            $_tempBody = $data;
        }

        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                ['application/json']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['application/json'],
                ['application/json', 'application/merge-patch+json']
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
            'PATCH',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation reactivateDriverById
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject4 $reactivate_driver_param reactivate_driver_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \OpenAPI\Client\Model\Driver|string
     */
    public function reactivateDriverById($access_token, $driver_id_or_external_id, $reactivate_driver_param)
    {
        list($response) = $this->reactivateDriverByIdWithHttpInfo($access_token, $driver_id_or_external_id, $reactivate_driver_param);
        return $response;
    }

    /**
     * Operation reactivateDriverByIdWithHttpInfo
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject4 $reactivate_driver_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\Driver|string, HTTP status code, HTTP response headers (array of strings)
     */
    public function reactivateDriverByIdWithHttpInfo($access_token, $driver_id_or_external_id, $reactivate_driver_param)
    {
        $request = $this->reactivateDriverByIdRequest($access_token, $driver_id_or_external_id, $reactivate_driver_param);

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
                    if ('\OpenAPI\Client\Model\Driver' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\OpenAPI\Client\Model\Driver', []),
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

            $returnType = '\OpenAPI\Client\Model\Driver';
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
                        '\OpenAPI\Client\Model\Driver',
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
     * Operation reactivateDriverByIdAsync
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject4 $reactivate_driver_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function reactivateDriverByIdAsync($access_token, $driver_id_or_external_id, $reactivate_driver_param)
    {
        return $this->reactivateDriverByIdAsyncWithHttpInfo($access_token, $driver_id_or_external_id, $reactivate_driver_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation reactivateDriverByIdAsyncWithHttpInfo
     *
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject4 $reactivate_driver_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function reactivateDriverByIdAsyncWithHttpInfo($access_token, $driver_id_or_external_id, $reactivate_driver_param)
    {
        $returnType = '\OpenAPI\Client\Model\Driver';
        $request = $this->reactivateDriverByIdRequest($access_token, $driver_id_or_external_id, $reactivate_driver_param);

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
     * Create request for operation 'reactivateDriverById'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param  \OpenAPI\Client\Model\InlineObject4 $reactivate_driver_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function reactivateDriverByIdRequest($access_token, $driver_id_or_external_id, $reactivate_driver_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling reactivateDriverById'
            );
        }
        // verify the required parameter 'driver_id_or_external_id' is set
        if ($driver_id_or_external_id === null || (is_array($driver_id_or_external_id) && count($driver_id_or_external_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $driver_id_or_external_id when calling reactivateDriverById'
            );
        }
        // verify the required parameter 'reactivate_driver_param' is set
        if ($reactivate_driver_param === null || (is_array($reactivate_driver_param) && count($reactivate_driver_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $reactivate_driver_param when calling reactivateDriverById'
            );
        }

        $resourcePath = '/fleet/drivers/inactive/{driver_id_or_external_id}';
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
        if ($driver_id_or_external_id !== null) {
            $resourcePath = str_replace(
                '{' . 'driver_id_or_external_id' . '}',
                ObjectSerializer::toPathValue($driver_id_or_external_id),
                $resourcePath
            );
        }

        // body params
        $_tempBody = null;
        if (isset($reactivate_driver_param)) {
            $_tempBody = $reactivate_driver_param;
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
     * Operation updateOrganizationAddress
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     * @param  \OpenAPI\Client\Model\InlineObject1 $address address (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function updateOrganizationAddress($access_token, $address_id, $address)
    {
        $this->updateOrganizationAddressWithHttpInfo($access_token, $address_id, $address);
    }

    /**
     * Operation updateOrganizationAddressWithHttpInfo
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     * @param  \OpenAPI\Client\Model\InlineObject1 $address (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function updateOrganizationAddressWithHttpInfo($access_token, $address_id, $address)
    {
        $request = $this->updateOrganizationAddressRequest($access_token, $address_id, $address);

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
     * Operation updateOrganizationAddressAsync
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     * @param  \OpenAPI\Client\Model\InlineObject1 $address (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function updateOrganizationAddressAsync($access_token, $address_id, $address)
    {
        return $this->updateOrganizationAddressAsyncWithHttpInfo($access_token, $address_id, $address)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation updateOrganizationAddressAsyncWithHttpInfo
     *
     * /addresses/{addressId}
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     * @param  \OpenAPI\Client\Model\InlineObject1 $address (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function updateOrganizationAddressAsyncWithHttpInfo($access_token, $address_id, $address)
    {
        $returnType = '';
        $request = $this->updateOrganizationAddressRequest($access_token, $address_id, $address);

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
     * Create request for operation 'updateOrganizationAddress'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  int $address_id ID of the address/geofence (required)
     * @param  \OpenAPI\Client\Model\InlineObject1 $address (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function updateOrganizationAddressRequest($access_token, $address_id, $address)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling updateOrganizationAddress'
            );
        }
        // verify the required parameter 'address_id' is set
        if ($address_id === null || (is_array($address_id) && count($address_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $address_id when calling updateOrganizationAddress'
            );
        }
        // verify the required parameter 'address' is set
        if ($address === null || (is_array($address) && count($address) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $address when calling updateOrganizationAddress'
            );
        }

        $resourcePath = '/addresses/{addressId}';
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
        if ($address_id !== null) {
            $resourcePath = str_replace(
                '{' . 'addressId' . '}',
                ObjectSerializer::toPathValue($address_id),
                $resourcePath
            );
        }

        // body params
        $_tempBody = null;
        if (isset($address)) {
            $_tempBody = $address;
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
            'PATCH',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation updateVehicles
     *
     * /fleet/set_data
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject14 $vehicle_update_param vehicle_update_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function updateVehicles($access_token, $vehicle_update_param)
    {
        $this->updateVehiclesWithHttpInfo($access_token, $vehicle_update_param);
    }

    /**
     * Operation updateVehiclesWithHttpInfo
     *
     * /fleet/set_data
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject14 $vehicle_update_param (required)
     *
     * @throws \OpenAPI\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function updateVehiclesWithHttpInfo($access_token, $vehicle_update_param)
    {
        $request = $this->updateVehiclesRequest($access_token, $vehicle_update_param);

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
     * Operation updateVehiclesAsync
     *
     * /fleet/set_data
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject14 $vehicle_update_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function updateVehiclesAsync($access_token, $vehicle_update_param)
    {
        return $this->updateVehiclesAsyncWithHttpInfo($access_token, $vehicle_update_param)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation updateVehiclesAsyncWithHttpInfo
     *
     * /fleet/set_data
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject14 $vehicle_update_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function updateVehiclesAsyncWithHttpInfo($access_token, $vehicle_update_param)
    {
        $returnType = '';
        $request = $this->updateVehiclesRequest($access_token, $vehicle_update_param);

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
     * Create request for operation 'updateVehicles'
     *
     * @param  string $access_token Samsara API access token. (required)
     * @param  \OpenAPI\Client\Model\InlineObject14 $vehicle_update_param (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function updateVehiclesRequest($access_token, $vehicle_update_param)
    {
        // verify the required parameter 'access_token' is set
        if ($access_token === null || (is_array($access_token) && count($access_token) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $access_token when calling updateVehicles'
            );
        }
        // verify the required parameter 'vehicle_update_param' is set
        if ($vehicle_update_param === null || (is_array($vehicle_update_param) && count($vehicle_update_param) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $vehicle_update_param when calling updateVehicles'
            );
        }

        $resourcePath = '/fleet/set_data';
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
        if (isset($vehicle_update_param)) {
            $_tempBody = $vehicle_update_param;
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
