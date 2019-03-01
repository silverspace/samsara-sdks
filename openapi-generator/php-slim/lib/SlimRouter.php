<?php
/**
 * SlimRouter
 *
 * PHP version 7
 *
 * @package OpenAPIServer
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
namespace OpenAPIServer;

use Slim\App;
use Slim\Interfaces\RouteInterface;
use Psr\Container\ContainerInterface;
use InvalidArgumentException;
use Dyorg\TokenAuthentication;
use Dyorg\TokenAuthentication\TokenSearch;
use Psr\Http\Message\ServerRequestInterface;
use Exception;

/**
 * SlimRouter Class Doc Comment
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class SlimRouter
{

    /** @var App instance */
    private $slimApp;

    /** @var array[] list of all api operations */
    private $operations = [
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/assets/locations',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractAssetsApi',
            'userClassname' => 'AssetsApi',
            'operationId' => 'getAllAssetCurrentLocations',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/assets',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractAssetsApi',
            'userClassname' => 'AssetsApi',
            'operationId' => 'getAllAssets',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/assets/{asset_id}/locations',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractAssetsApi',
            'userClassname' => 'AssetsApi',
            'operationId' => 'getAssetLocation',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/assets/{asset_id}/reefer',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractAssetsApi',
            'userClassname' => 'AssetsApi',
            'operationId' => 'getAssetReefer',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/create',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractDriversApi',
            'userClassname' => 'DriversApi',
            'operationId' => 'createDriver',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/inactive',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractDriversApi',
            'userClassname' => 'DriversApi',
            'operationId' => 'getAllDeactivatedDrivers',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'DELETE',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driver_id_or_external_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractDriversApi',
            'userClassname' => 'DriversApi',
            'operationId' => 'deactivateDriver',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/inactive/{driver_id_or_external_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractDriversApi',
            'userClassname' => 'DriversApi',
            'operationId' => 'getDeactivatedDriverById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driver_id_or_external_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractDriversApi',
            'userClassname' => 'DriversApi',
            'operationId' => 'getDriverById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'PUT',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/inactive/{driver_id_or_external_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractDriversApi',
            'userClassname' => 'DriversApi',
            'operationId' => 'reactivateDriverById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/add_address',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'addFleetAddress',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/addresses',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'addOrganizationAddresses',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'createDispatchRoute',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/create',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'createDriver',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/maintenance/dvirs',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'createDvir',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'fetchAllDispatchRoutes',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes/job_updates',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'fetchAllRouteJobUpdates',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/assets/locations',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getAllAssetCurrentLocations',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/assets',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getAllAssets',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/inactive',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getAllDeactivatedDrivers',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/document_types',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getDriverDocumentTypesByOrgId',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/documents',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getDriverDocumentsByOrgId',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/maintenance/dvirs',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getDvirs',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getFleetDrivers',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/summary',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getFleetDriversSummary',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/hos_authentication_logs',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getFleetHosAuthenticationLogs',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/hos_logs',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getFleetHosLogs',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/hos_logs_summary',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getFleetHosLogsSummary',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/locations',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getFleetLocations',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/maintenance/list',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getFleetMaintenanceList',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/trips',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getFleetTrips',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/addresses',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getOrganizationAddresses',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/stats',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getVehicleStats',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/locations',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getVehiclesLocations',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/contacts',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'listContacts',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/list',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'listFleet',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/set_data',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'updateVehicles',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driver_id}/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'createDriverDispatchRoute',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driver_id}/documents',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'createDriverDocument',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/{vehicle_id}/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'createVehicleDispatchRoute',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'DELETE',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driver_id_or_external_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'deactivateDriver',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'DELETE',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes/{route_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'deleteDispatchRouteById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'DELETE',
            'basePathWithoutHost' => '/v1',
            'path' => '/addresses/{addressId}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'deleteOrganizationAddress',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/assets/{asset_id}/locations',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getAssetLocation',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/assets/{asset_id}/reefer',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getAssetReefer',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/inactive/{driver_id_or_external_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getDeactivatedDriverById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes/{route_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getDispatchRouteById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes/{route_id}/history',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getDispatchRouteHistory',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driver_id}/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getDispatchRoutesByDriverId',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/{vehicle_id}/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getDispatchRoutesByVehicleId',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driver_id_or_external_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getDriverById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driverId}/safety/score',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getDriverSafetyScore',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driver_id}/hos_daily_logs',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getFleetDriversHosDailyLogs',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/{vehicle_id_or_external_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getFleetVehicle',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/addresses/{addressId}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getOrganizationAddress',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/contacts/{contact_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getOrganizationContact',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/{vehicleId}/safety/harsh_event',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getVehicleHarshEvent',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/{vehicle_id}/locations',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getVehicleLocations',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/{vehicleId}/safety/score',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'getVehicleSafetyScore',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'PATCH',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/{vehicle_id_or_external_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'patchFleetVehicle',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'PUT',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/inactive/{driver_id_or_external_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'reactivateDriverById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'PUT',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes/{route_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'updateDispatchRouteById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'PATCH',
            'basePathWithoutHost' => '/v1',
            'path' => '/addresses/{addressId}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractFleetApi',
            'userClassname' => 'FleetApi',
            'operationId' => 'updateOrganizationAddress',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/industrial/data',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractIndustrialApi',
            'userClassname' => 'IndustrialApi',
            'operationId' => 'getAllDataInputs',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/machines/list',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractIndustrialApi',
            'userClassname' => 'IndustrialApi',
            'operationId' => 'getMachines',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/machines/history',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractIndustrialApi',
            'userClassname' => 'IndustrialApi',
            'operationId' => 'getMachinesHistory',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/industrial/data/{data_input_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractIndustrialApi',
            'userClassname' => 'IndustrialApi',
            'operationId' => 'getDataInput',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractRoutesApi',
            'userClassname' => 'RoutesApi',
            'operationId' => 'createDispatchRoute',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractRoutesApi',
            'userClassname' => 'RoutesApi',
            'operationId' => 'fetchAllDispatchRoutes',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes/job_updates',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractRoutesApi',
            'userClassname' => 'RoutesApi',
            'operationId' => 'fetchAllRouteJobUpdates',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driver_id}/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractRoutesApi',
            'userClassname' => 'RoutesApi',
            'operationId' => 'createDriverDispatchRoute',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/{vehicle_id}/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractRoutesApi',
            'userClassname' => 'RoutesApi',
            'operationId' => 'createVehicleDispatchRoute',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'DELETE',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes/{route_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractRoutesApi',
            'userClassname' => 'RoutesApi',
            'operationId' => 'deleteDispatchRouteById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes/{route_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractRoutesApi',
            'userClassname' => 'RoutesApi',
            'operationId' => 'getDispatchRouteById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes/{route_id}/history',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractRoutesApi',
            'userClassname' => 'RoutesApi',
            'operationId' => 'getDispatchRouteHistory',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driver_id}/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractRoutesApi',
            'userClassname' => 'RoutesApi',
            'operationId' => 'getDispatchRoutesByDriverId',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/{vehicle_id}/dispatch/routes',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractRoutesApi',
            'userClassname' => 'RoutesApi',
            'operationId' => 'getDispatchRoutesByVehicleId',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'PUT',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/dispatch/routes/{route_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractRoutesApi',
            'userClassname' => 'RoutesApi',
            'operationId' => 'updateDispatchRouteById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/drivers/{driverId}/safety/score',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractSafetyApi',
            'userClassname' => 'SafetyApi',
            'operationId' => 'getDriverSafetyScore',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/{vehicleId}/safety/harsh_event',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractSafetyApi',
            'userClassname' => 'SafetyApi',
            'operationId' => 'getVehicleHarshEvent',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/fleet/vehicles/{vehicleId}/safety/score',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractSafetyApi',
            'userClassname' => 'SafetyApi',
            'operationId' => 'getVehicleSafetyScore',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/sensors/list',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractSensorsApi',
            'userClassname' => 'SensorsApi',
            'operationId' => 'getSensors',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/sensors/cargo',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractSensorsApi',
            'userClassname' => 'SensorsApi',
            'operationId' => 'getSensorsCargo',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/sensors/door',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractSensorsApi',
            'userClassname' => 'SensorsApi',
            'operationId' => 'getSensorsDoor',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/sensors/history',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractSensorsApi',
            'userClassname' => 'SensorsApi',
            'operationId' => 'getSensorsHistory',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/sensors/humidity',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractSensorsApi',
            'userClassname' => 'SensorsApi',
            'operationId' => 'getSensorsHumidity',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/sensors/temperature',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractSensorsApi',
            'userClassname' => 'SensorsApi',
            'operationId' => 'getSensorsTemperature',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'POST',
            'basePathWithoutHost' => '/v1',
            'path' => '/tags',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractTagsApi',
            'userClassname' => 'TagsApi',
            'operationId' => 'createTag',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/tags',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractTagsApi',
            'userClassname' => 'TagsApi',
            'operationId' => 'getAllTags',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'DELETE',
            'basePathWithoutHost' => '/v1',
            'path' => '/tags/{tag_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractTagsApi',
            'userClassname' => 'TagsApi',
            'operationId' => 'deleteTagById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/tags/{tag_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractTagsApi',
            'userClassname' => 'TagsApi',
            'operationId' => 'getTagById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'PATCH',
            'basePathWithoutHost' => '/v1',
            'path' => '/tags/{tag_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractTagsApi',
            'userClassname' => 'TagsApi',
            'operationId' => 'modifyTagById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'PUT',
            'basePathWithoutHost' => '/v1',
            'path' => '/tags/{tag_id}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractTagsApi',
            'userClassname' => 'TagsApi',
            'operationId' => 'updateTagById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/user_roles',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractUsersApi',
            'userClassname' => 'UsersApi',
            'operationId' => 'listUserRoles',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/users',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractUsersApi',
            'userClassname' => 'UsersApi',
            'operationId' => 'listUsers',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'DELETE',
            'basePathWithoutHost' => '/v1',
            'path' => '/users/{userId}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractUsersApi',
            'userClassname' => 'UsersApi',
            'operationId' => 'deleteUserById',
            'authMethods' => [
            ],
        ],
        [
            'httpMethod' => 'GET',
            'basePathWithoutHost' => '/v1',
            'path' => '/users/{userId}',
            'apiPackage' => 'OpenAPIServer\Api',
            'classname' => 'AbstractUsersApi',
            'userClassname' => 'UsersApi',
            'operationId' => 'getUserById',
            'authMethods' => [
            ],
        ],
    ];

    /**
     * Class constructor
     *
     * @param ContainerInterface|array $container Either a ContainerInterface or an associative array of app settings
     *
     * @throws InvalidArgumentException When no container is provided that implements ContainerInterface
     * @throws Exception When implementation class doesn't exists
     */
    public function __construct($container = [])
    {
        $this->slimApp = new App($container);


        foreach ($this->operations as $operation) {
            $callback = function ($request, $response, $arguments) use ($operation) {
                $message = "How about extending {$operation['classname']} by {$operation['apiPackage']}\\{$operation['userClassname']} class implementing {$operation['operationId']} as a {$operation['httpMethod']} method?";
                throw new Exception($message);
                return $response->withStatus(501)->write($message);
            };
            $middlewares = [];

            if (class_exists("\\{$operation['apiPackage']}\\{$operation['userClassname']}")) {
                $callback = "\\{$operation['apiPackage']}\\{$operation['userClassname']}:{$operation['operationId']}";
            }


            $this->addRoute(
                [$operation['httpMethod']],
                "{$operation['basePathWithoutHost']}{$operation['path']}",
                $callback,
                $middlewares
            )->setName($operation['operationId']);
        }
    }

    /**
     * Merges user defined options with dynamic params
     *
     * @param array $options Params which need to merge into user options
     *
     * @return array Merged array
     */
    private function getTokenAuthenticationOptions(array $options)
    {
        if (is_array($this->slimApp->getContainer()['tokenAuthenticationOptions']) === false) {
            return $options;
        }

        return array_merge($this->slimApp->getContainer()['tokenAuthenticationOptions'], $options);
    }

    /**
     * Add route with multiple methods
     *
     * @param string[]        $methods     Numeric array of HTTP method names
     * @param string          $pattern     The route URI pattern
     * @param callable|string $callable    The route callback routine
     * @param array|null      $middlewares List of middlewares
     *
     * @return RouteInterface
     *
     * @throws InvalidArgumentException If the route pattern isn't a string
     */
    public function addRoute(array $methods, string $pattern, $callable, $middlewares = [])
    {
        $route = $this->slimApp->map($methods, $pattern, $callable);
        foreach ($middlewares as $middleware) {
            $route->add($middleware);
        }
        return $route;
    }

    /**
     * Returns Slim Framework instance
     *
     * @return App
     */
    public function getSlimApp()
    {
        return $this->slimApp;
    }
}
