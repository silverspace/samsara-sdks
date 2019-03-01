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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  InlineObject21,
  InlineResponse2008,
  CargoResponse,
  InlineObject20,
  DoorResponse,
  InlineObject19,
  SensorHistoryResponse,
  HumidityResponse,
  TemperatureResponse,
  InlineObject24,
  InlineObject23,
  InlineObject22,
} from './models';

/**
 * getSensors - parameters interface
 */
export interface IGetSensorsParams {
  accessToken: string;
  groupParam: InlineObject23;
}

/**
 * getSensorsCargo - parameters interface
 */
export interface IGetSensorsCargoParams {
  accessToken: string;
  sensorParam: InlineObject19;
}

/**
 * getSensorsDoor - parameters interface
 */
export interface IGetSensorsDoorParams {
  accessToken: string;
  sensorParam: InlineObject20;
}

/**
 * getSensorsHistory - parameters interface
 */
export interface IGetSensorsHistoryParams {
  accessToken: string;
  historyParam: InlineObject21;
}

/**
 * getSensorsHumidity - parameters interface
 */
export interface IGetSensorsHumidityParams {
  accessToken: string;
  sensorParam: InlineObject22;
}

/**
 * getSensorsTemperature - parameters interface
 */
export interface IGetSensorsTemperatureParams {
  accessToken: string;
  sensorParam: InlineObject24;
}

/**
 * SensorsApi - API class
 */
@autoinject()
export class SensorsApi extends Api {

  /**
   * Creates a new SensorsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * /sensors/list
   * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
   * @param params.accessToken Samsara API access token.
   * @param params.groupParam 
   */
  async getSensors(params: IGetSensorsParams): Promise<InlineResponse2008> {
    // Verify required parameters are set
    this.ensureParamIsSet('getSensors', params, 'accessToken');
    this.ensureParamIsSet('getSensors', params, 'groupParam');

    // Create URL to call
    const url = `${this.basePath}/sensors/list`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['groupParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /sensors/cargo
   * Get cargo monitor status (empty / full) for requested sensors.
   * @param params.accessToken Samsara API access token.
   * @param params.sensorParam 
   */
  async getSensorsCargo(params: IGetSensorsCargoParams): Promise<CargoResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getSensorsCargo', params, 'accessToken');
    this.ensureParamIsSet('getSensorsCargo', params, 'sensorParam');

    // Create URL to call
    const url = `${this.basePath}/sensors/cargo`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['sensorParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /sensors/door
   * Get door monitor status (closed / open) for requested sensors.
   * @param params.accessToken Samsara API access token.
   * @param params.sensorParam 
   */
  async getSensorsDoor(params: IGetSensorsDoorParams): Promise<DoorResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getSensorsDoor', params, 'accessToken');
    this.ensureParamIsSet('getSensorsDoor', params, 'sensorParam');

    // Create URL to call
    const url = `${this.basePath}/sensors/door`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['sensorParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /sensors/history
   * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
   * @param params.accessToken Samsara API access token.
   * @param params.historyParam 
   */
  async getSensorsHistory(params: IGetSensorsHistoryParams): Promise<SensorHistoryResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getSensorsHistory', params, 'accessToken');
    this.ensureParamIsSet('getSensorsHistory', params, 'historyParam');

    // Create URL to call
    const url = `${this.basePath}/sensors/history`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['historyParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /sensors/humidity
   * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
   * @param params.accessToken Samsara API access token.
   * @param params.sensorParam 
   */
  async getSensorsHumidity(params: IGetSensorsHumidityParams): Promise<HumidityResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getSensorsHumidity', params, 'accessToken');
    this.ensureParamIsSet('getSensorsHumidity', params, 'sensorParam');

    // Create URL to call
    const url = `${this.basePath}/sensors/humidity`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['sensorParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /sensors/temperature
   * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
   * @param params.accessToken Samsara API access token.
   * @param params.sensorParam 
   */
  async getSensorsTemperature(params: IGetSensorsTemperatureParams): Promise<TemperatureResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('getSensorsTemperature', params, 'accessToken');
    this.ensureParamIsSet('getSensorsTemperature', params, 'sensorParam');

    // Create URL to call
    const url = `${this.basePath}/sensors/temperature`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['sensorParam'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

