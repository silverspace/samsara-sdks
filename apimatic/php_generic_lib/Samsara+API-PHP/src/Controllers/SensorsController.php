<?php
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

namespace SamsaraAPILib\Controllers;

use SamsaraAPILib\APIException;
use SamsaraAPILib\APIHelper;
use SamsaraAPILib\Configuration;
use SamsaraAPILib\Models;
use SamsaraAPILib\Exceptions;
use SamsaraAPILib\Http\HttpRequest;
use SamsaraAPILib\Http\HttpResponse;
use SamsaraAPILib\Http\HttpMethod;
use SamsaraAPILib\Http\HttpContext;
use Unirest\Request;

/**
 * @todo Add a general description for this controller.
 */
class SensorsController extends BaseController
{
    /**
     * @var SensorsController The reference to *Singleton* instance of this class
     */
    private static $instance;

    /**
     * Returns the *Singleton* instance of this class.
     * @return SensorsController The *Singleton* instance.
     */
    public static function getInstance()
    {
        if (null === static::$instance) {
            static::$instance = new static();
        }
        
        return static::$instance;
    }

    /**
     * Get temperature for requested sensors. This method returns the current ambient temperature (and
     * probe temperature if applicable) for the requested sensors.
     *
     * @param string             $accessToken  Samsara API access token.
     * @param Models\SensorParam $sensorParam  Group ID and list of sensor IDs to query.
     * @return mixed response from the API call
     * @throws APIException Thrown if API call fails
     */
    public function createGetSensorsTemperature(
        $accessToken,
        $sensorParam
    ) {

        //prepare query string for API call
        $_queryBuilder = '/sensors/temperature';

        //process optional query parameters
        APIHelper::appendUrlWithQueryParameters($_queryBuilder, array (
            'access_token' => $accessToken,
            'access_token' => Configuration::$accessToken,
        ));

        //validate and preprocess url
        $_queryUrl = APIHelper::cleanUrl(Configuration::$BASEURI . $_queryBuilder);

        //prepare headers
        $_headers = array (
            'user-agent'    => BaseController::USER_AGENT,
            'Accept'        => 'application/json',
            'content-type'  => 'application/json; charset=utf-8'
        );

        //json encode body
        $_bodyJson = Request\Body::Json($sensorParam);

        //call on-before Http callback
        $_httpRequest = new HttpRequest(HttpMethod::POST, $_headers, $_queryUrl);
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnBeforeRequest($_httpRequest);
        }

        //and invoke the API call request to fetch the response
        $response = Request::post($_queryUrl, $_headers, $_bodyJson);

        $_httpResponse = new HttpResponse($response->code, $response->headers, $response->raw_body);
        $_httpContext = new HttpContext($_httpRequest, $_httpResponse);

        //call on-after Http callback
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnAfterRequest($_httpContext);
        }

        //Error handling using HTTP status codes
        if (($response->code < 200) || ($response->code > 208)) {
            throw new APIException('Unexpected error.', $_httpContext);
        }

        //handle errors defined at the API level
        $this->validateResponse($_httpResponse, $_httpContext);

        $mapper = $this->getJsonMapper();

        return $mapper->mapClass($response->body, 'SamsaraAPILib\\Models\\TemperatureResponse');
    }

    /**
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and
     * information about them.
     *
     * @param string            $accessToken  Samsara API access token.
     * @param Models\GroupParam $groupParam   Group ID to query.
     * @return mixed response from the API call
     * @throws APIException Thrown if API call fails
     */
    public function createGetSensors(
        $accessToken,
        $groupParam
    ) {

        //prepare query string for API call
        $_queryBuilder = '/sensors/list';

        //process optional query parameters
        APIHelper::appendUrlWithQueryParameters($_queryBuilder, array (
            'access_token' => $accessToken,
            'access_token' => Configuration::$accessToken,
        ));

        //validate and preprocess url
        $_queryUrl = APIHelper::cleanUrl(Configuration::$BASEURI . $_queryBuilder);

        //prepare headers
        $_headers = array (
            'user-agent'    => BaseController::USER_AGENT,
            'Accept'        => 'application/json',
            'content-type'  => 'application/json; charset=utf-8'
        );

        //json encode body
        $_bodyJson = Request\Body::Json($groupParam);

        //call on-before Http callback
        $_httpRequest = new HttpRequest(HttpMethod::POST, $_headers, $_queryUrl);
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnBeforeRequest($_httpRequest);
        }

        //and invoke the API call request to fetch the response
        $response = Request::post($_queryUrl, $_headers, $_bodyJson);

        $_httpResponse = new HttpResponse($response->code, $response->headers, $response->raw_body);
        $_httpContext = new HttpContext($_httpRequest, $_httpResponse);

        //call on-after Http callback
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnAfterRequest($_httpContext);
        }

        //Error handling using HTTP status codes
        if (($response->code < 200) || ($response->code > 208)) {
            throw new APIException('Unexpected error.', $_httpContext);
        }

        //handle errors defined at the API level
        $this->validateResponse($_httpResponse, $_httpContext);

        $mapper = $this->getJsonMapper();

        return $mapper->mapClass($response->body, 'SamsaraAPILib\\Models\\GetSensorsResponse');
    }

    /**
     * Get humidity for requested sensors. This method returns the current relative humidity for the
     * requested sensors.
     *
     * @param string             $accessToken  Samsara API access token.
     * @param Models\SensorParam $sensorParam  Group ID and list of sensor IDs to query.
     * @return mixed response from the API call
     * @throws APIException Thrown if API call fails
     */
    public function createGetSensorsHumidity(
        $accessToken,
        $sensorParam
    ) {

        //prepare query string for API call
        $_queryBuilder = '/sensors/humidity';

        //process optional query parameters
        APIHelper::appendUrlWithQueryParameters($_queryBuilder, array (
            'access_token' => $accessToken,
            'access_token' => Configuration::$accessToken,
        ));

        //validate and preprocess url
        $_queryUrl = APIHelper::cleanUrl(Configuration::$BASEURI . $_queryBuilder);

        //prepare headers
        $_headers = array (
            'user-agent'    => BaseController::USER_AGENT,
            'Accept'        => 'application/json',
            'content-type'  => 'application/json; charset=utf-8'
        );

        //json encode body
        $_bodyJson = Request\Body::Json($sensorParam);

        //call on-before Http callback
        $_httpRequest = new HttpRequest(HttpMethod::POST, $_headers, $_queryUrl);
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnBeforeRequest($_httpRequest);
        }

        //and invoke the API call request to fetch the response
        $response = Request::post($_queryUrl, $_headers, $_bodyJson);

        $_httpResponse = new HttpResponse($response->code, $response->headers, $response->raw_body);
        $_httpContext = new HttpContext($_httpRequest, $_httpResponse);

        //call on-after Http callback
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnAfterRequest($_httpContext);
        }

        //Error handling using HTTP status codes
        if (($response->code < 200) || ($response->code > 208)) {
            throw new APIException('Unexpected error.', $_httpContext);
        }

        //handle errors defined at the API level
        $this->validateResponse($_httpResponse, $_httpContext);

        $mapper = $this->getJsonMapper();

        return $mapper->mapClass($response->body, 'SamsaraAPILib\\Models\\HumidityResponse');
    }

    /**
     * Get historical data for specified sensors. This method returns a set of historical data for the
     * specified sensors in the specified time range and at the specified time resolution.
     *
     * @param string               $accessToken  Samsara API access token.
     * @param Models\HistoryParam1 $historyParam Group ID, time range and resolution, and list of sensor ID, field
     *                                           pairs to query.
     * @return mixed response from the API call
     * @throws APIException Thrown if API call fails
     */
    public function createGetSensorsHistory(
        $accessToken,
        $historyParam
    ) {

        //prepare query string for API call
        $_queryBuilder = '/sensors/history';

        //process optional query parameters
        APIHelper::appendUrlWithQueryParameters($_queryBuilder, array (
            'access_token' => $accessToken,
            'access_token' => Configuration::$accessToken,
        ));

        //validate and preprocess url
        $_queryUrl = APIHelper::cleanUrl(Configuration::$BASEURI . $_queryBuilder);

        //prepare headers
        $_headers = array (
            'user-agent'    => BaseController::USER_AGENT,
            'Accept'        => 'application/json',
            'content-type'  => 'application/json; charset=utf-8'
        );

        //json encode body
        $_bodyJson = Request\Body::Json($historyParam);

        //call on-before Http callback
        $_httpRequest = new HttpRequest(HttpMethod::POST, $_headers, $_queryUrl);
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnBeforeRequest($_httpRequest);
        }

        //and invoke the API call request to fetch the response
        $response = Request::post($_queryUrl, $_headers, $_bodyJson);

        $_httpResponse = new HttpResponse($response->code, $response->headers, $response->raw_body);
        $_httpContext = new HttpContext($_httpRequest, $_httpResponse);

        //call on-after Http callback
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnAfterRequest($_httpContext);
        }

        //Error handling using HTTP status codes
        if (($response->code < 200) || ($response->code > 208)) {
            throw new APIException('Unexpected error.', $_httpContext);
        }

        //handle errors defined at the API level
        $this->validateResponse($_httpResponse, $_httpContext);

        $mapper = $this->getJsonMapper();

        return $mapper->mapClass($response->body, 'SamsaraAPILib\\Models\\SensorHistoryResponse');
    }

    /**
     * Get door monitor status (closed / open) for requested sensors.
     *
     * @param string             $accessToken  Samsara API access token.
     * @param Models\SensorParam $sensorParam  Group ID and list of sensor IDs to query.
     * @return mixed response from the API call
     * @throws APIException Thrown if API call fails
     */
    public function createGetSensorsDoor(
        $accessToken,
        $sensorParam
    ) {

        //prepare query string for API call
        $_queryBuilder = '/sensors/door';

        //process optional query parameters
        APIHelper::appendUrlWithQueryParameters($_queryBuilder, array (
            'access_token' => $accessToken,
            'access_token' => Configuration::$accessToken,
        ));

        //validate and preprocess url
        $_queryUrl = APIHelper::cleanUrl(Configuration::$BASEURI . $_queryBuilder);

        //prepare headers
        $_headers = array (
            'user-agent'    => BaseController::USER_AGENT,
            'Accept'        => 'application/json',
            'content-type'  => 'application/json; charset=utf-8'
        );

        //json encode body
        $_bodyJson = Request\Body::Json($sensorParam);

        //call on-before Http callback
        $_httpRequest = new HttpRequest(HttpMethod::POST, $_headers, $_queryUrl);
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnBeforeRequest($_httpRequest);
        }

        //and invoke the API call request to fetch the response
        $response = Request::post($_queryUrl, $_headers, $_bodyJson);

        $_httpResponse = new HttpResponse($response->code, $response->headers, $response->raw_body);
        $_httpContext = new HttpContext($_httpRequest, $_httpResponse);

        //call on-after Http callback
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnAfterRequest($_httpContext);
        }

        //Error handling using HTTP status codes
        if (($response->code < 200) || ($response->code > 208)) {
            throw new APIException('Unexpected error.', $_httpContext);
        }

        //handle errors defined at the API level
        $this->validateResponse($_httpResponse, $_httpContext);

        $mapper = $this->getJsonMapper();

        return $mapper->mapClass($response->body, 'SamsaraAPILib\\Models\\DoorResponse');
    }

    /**
     * Get cargo monitor status (empty / full) for requested sensors.
     *
     * @param string             $accessToken  Samsara API access token.
     * @param Models\SensorParam $sensorParam  Group ID and list of sensor IDs to query.
     * @return mixed response from the API call
     * @throws APIException Thrown if API call fails
     */
    public function createGetSensorsCargo(
        $accessToken,
        $sensorParam
    ) {

        //prepare query string for API call
        $_queryBuilder = '/sensors/cargo';

        //process optional query parameters
        APIHelper::appendUrlWithQueryParameters($_queryBuilder, array (
            'access_token' => $accessToken,
            'access_token' => Configuration::$accessToken,
        ));

        //validate and preprocess url
        $_queryUrl = APIHelper::cleanUrl(Configuration::$BASEURI . $_queryBuilder);

        //prepare headers
        $_headers = array (
            'user-agent'    => BaseController::USER_AGENT,
            'Accept'        => 'application/json',
            'content-type'  => 'application/json; charset=utf-8'
        );

        //json encode body
        $_bodyJson = Request\Body::Json($sensorParam);

        //call on-before Http callback
        $_httpRequest = new HttpRequest(HttpMethod::POST, $_headers, $_queryUrl);
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnBeforeRequest($_httpRequest);
        }

        //and invoke the API call request to fetch the response
        $response = Request::post($_queryUrl, $_headers, $_bodyJson);

        $_httpResponse = new HttpResponse($response->code, $response->headers, $response->raw_body);
        $_httpContext = new HttpContext($_httpRequest, $_httpResponse);

        //call on-after Http callback
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnAfterRequest($_httpContext);
        }

        //Error handling using HTTP status codes
        if (($response->code < 200) || ($response->code > 208)) {
            throw new APIException('Unexpected error.', $_httpContext);
        }

        //handle errors defined at the API level
        $this->validateResponse($_httpResponse, $_httpContext);

        $mapper = $this->getJsonMapper();

        return $mapper->mapClass($response->body, 'SamsaraAPILib\\Models\\CargoResponse');
    }
}