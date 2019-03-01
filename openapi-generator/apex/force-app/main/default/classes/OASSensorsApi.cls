/*
 * Samsara API
 * # Introduction\n\nSamsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.\n\nThe Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.\n\nAPI access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.\n\nIf you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)\n\n# Endpoints\n\nAll our APIs can be accessed through HTTP requests to URLs like:\n\n```curl\nhttps://api.samsara.com/<version>/<endpoint>\n```\n\nAll our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.\n\n# Authentication\n\nTo authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.\n\nYour API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.\n\nAuthentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.\n\n```curl\nhttps://api.samsara.com/<version>/<endpoint>?access_token={access_token}\n```\n\nAll API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.\n\n# Request Methods\n\nOur API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.\n\n## GET\n\nGET requests are typically used for fetching data (like data for a particular driver).\n\n## POST\n\nPOST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).\n\n## PUT\n\nPUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).\n\n## PATCH\n\nPATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).\n\n## DELETE\n\nDELETE requests are used for deleting a record (like deleting a tag from the system).\n\n# Response Codes\n\nAll API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.\n\n## 2XX\n\nThese are successful responses and indicate that the API request returned the expected response.\n\n## 4XX\n\nThese indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.\n\n## 5XX\n\nThese indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.\n\n# Error Responses\n\nIn case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.\n\n| Status Code | Message | Description |\n|-------------|----------------|-------------------------------------------------------------------|\n| 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). |\n| 404 | Page not found | The API endpoint being accessed is invalid. |\n| 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |\n\n# Versioning\n\nAll our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.\n\n# FAQs\n\nCheck out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OAS-api/OAS-codegen.git
 * Do not edit the class manually.
 */

public class OASSensorsApi {
    OASClient client;

    public OASSensorsApi(OASClient client) {
        this.client = client;
    }

    public OASSensorsApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * /sensors/list
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @return OASInlineResponse2008
     * @throws OAS.ApiException if fails to make API call
     */
    public OASInlineResponse2008 getSensors(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('groupParam'), 'groupParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASInlineResponse2008) client.invoke(
            'POST', '/sensors/list',
            (OASInlineObject23) params.get('groupParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASInlineResponse2008.class
        );
    }
    /**
     * /sensors/cargo
     * Get cargo monitor status (empty / full) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return OASCargoResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASCargoResponse getSensorsCargo(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('sensorParam'), 'sensorParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASCargoResponse) client.invoke(
            'POST', '/sensors/cargo',
            (OASInlineObject19) params.get('sensorParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASCargoResponse.class
        );
    }
    /**
     * /sensors/door
     * Get door monitor status (closed / open) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return OASDoorResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDoorResponse getSensorsDoor(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('sensorParam'), 'sensorParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDoorResponse) client.invoke(
            'POST', '/sensors/door',
            (OASInlineObject20) params.get('sensorParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDoorResponse.class
        );
    }
    /**
     * /sensors/history
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @param accessToken Samsara API access token. (required)
     * @param historyParam  (required)
     * @return OASSensorHistoryResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASSensorHistoryResponse getSensorsHistory(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('historyParam'), 'historyParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASSensorHistoryResponse) client.invoke(
            'POST', '/sensors/history',
            (OASInlineObject21) params.get('historyParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASSensorHistoryResponse.class
        );
    }
    /**
     * /sensors/humidity
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return OASHumidityResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASHumidityResponse getSensorsHumidity(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('sensorParam'), 'sensorParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASHumidityResponse) client.invoke(
            'POST', '/sensors/humidity',
            (OASInlineObject22) params.get('sensorParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASHumidityResponse.class
        );
    }
    /**
     * /sensors/temperature
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return OASTemperatureResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASTemperatureResponse getSensorsTemperature(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('sensorParam'), 'sensorParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASTemperatureResponse) client.invoke(
            'POST', '/sensors/temperature',
            (OASInlineObject24) params.get('sensorParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASTemperatureResponse.class
        );
    }
}
