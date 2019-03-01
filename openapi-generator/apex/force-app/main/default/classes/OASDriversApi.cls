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

public class OASDriversApi {
    OASClient client;

    public OASDriversApi(OASClient client) {
        this.client = client;
    }

    public OASDriversApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * /fleet/drivers/create
     * Create a new driver.
     * @param accessToken Samsara API access token. (required)
     * @param createDriverParam Driver creation body (required)
     * @return OASDriver
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriver createDriver(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('createDriverParam'), 'createDriverParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriver) client.invoke(
            'POST', '/fleet/drivers/create',
            (OASDriverForCreate) params.get('createDriverParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDriver.class
        );
    }
    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Deactivate a driver with the given id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @throws OAS.ApiException if fails to make API call
     */
    public void deactivateDriver(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverIdOrExternalId'), 'driverIdOrExternalId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        client.invoke(
            'DELETE', '/fleet/drivers/{driver_id_or_external_id}', '',
            query, form,
            new Map<String, Object>{
                'driver_id_or_external_id' => (String) params.get('driverIdOrExternalId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            null
        );
    }
    /**
     * /fleet/drivers/inactive
     * Fetch all deactivated drivers for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return List<OASDriver>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASDriver> getAllDeactivatedDrivers(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('group_id', (Long) params.get('groupId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASDriver>) client.invoke(
            'GET', '/fleet/drivers/inactive', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASDriver>.class
        );
    }
    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch deactivated driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @return OASDriver
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriver getDeactivatedDriverById(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverIdOrExternalId'), 'driverIdOrExternalId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriver) client.invoke(
            'GET', '/fleet/drivers/inactive/{driver_id_or_external_id}', '',
            query, form,
            new Map<String, Object>{
                'driver_id_or_external_id' => (String) params.get('driverIdOrExternalId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASDriver.class
        );
    }
    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @return OASDriver
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriver getDriverById(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverIdOrExternalId'), 'driverIdOrExternalId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriver) client.invoke(
            'GET', '/fleet/drivers/{driver_id_or_external_id}', '',
            query, form,
            new Map<String, Object>{
                'driver_id_or_external_id' => (String) params.get('driverIdOrExternalId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASDriver.class
        );
    }
    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Reactivate the inactive driver having id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param reactivateDriverParam  (required)
     * @return OASDriver
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriver reactivateDriverById(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverIdOrExternalId'), 'driverIdOrExternalId');
        client.assertNotNull(params.get('reactivateDriverParam'), 'reactivateDriverParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriver) client.invoke(
            'PUT', '/fleet/drivers/inactive/{driver_id_or_external_id}',
            (OASInlineObject4) params.get('reactivateDriverParam'),
            query, form,
            new Map<String, Object>{
                'driver_id_or_external_id' => (String) params.get('driverIdOrExternalId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDriver.class
        );
    }
}
