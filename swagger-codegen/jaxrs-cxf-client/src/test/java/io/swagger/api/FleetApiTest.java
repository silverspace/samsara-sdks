/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.api;

import io.swagger.model.Address;
import io.swagger.model.AddressParam;
import io.swagger.model.Addresses;
import io.swagger.model.AllRouteJobUpdates;
import io.swagger.model.AssetLocationResponse;
import io.swagger.model.AssetReeferResponse;
import io.swagger.model.Contact;
import io.swagger.model.CreateDvirParam;
import io.swagger.model.CurrentDriver;
import io.swagger.model.Data;
import io.swagger.model.DispatchRoute;
import io.swagger.model.DispatchRouteCreate;
import io.swagger.model.DispatchRouteHistory;
import io.swagger.model.DispatchRoutes;
import io.swagger.model.Document;
import io.swagger.model.DocumentCreate;
import io.swagger.model.DocumentTypes;
import io.swagger.model.Documents;
import io.swagger.model.Driver;
import io.swagger.model.DriverDailyLogResponse;
import io.swagger.model.DriverForCreate;
import io.swagger.model.DriverSafetyScoreResponse;
import io.swagger.model.DriversResponse;
import io.swagger.model.DriversSummaryParam;
import io.swagger.model.DriversSummaryResponse;
import io.swagger.model.DvirBase;
import io.swagger.model.DvirListResponse;
import io.swagger.model.FleetVehicleLocations;
import io.swagger.model.FleetVehicleResponse;
import io.swagger.model.FleetVehiclesLocations;
import io.swagger.model.GroupDriversParam;
import io.swagger.model.GroupParam;
import io.swagger.model.HosAuthenticationLogsParam;
import io.swagger.model.HosAuthenticationLogsResponse;
import io.swagger.model.HosLogsParam;
import io.swagger.model.HosLogsParam1;
import io.swagger.model.HosLogsParam2;
import io.swagger.model.HosLogsResponse;
import io.swagger.model.HosLogsSummaryResponse;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.ReactivateDriverParam;
import io.swagger.model.TripResponse;
import io.swagger.model.TripsParam;
import io.swagger.model.VehicleHarshEventResponse;
import io.swagger.model.VehicleSafetyScoreResponse;
import io.swagger.model.VehicleUpdateParam;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Samsara API
 *
 * <p># Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * API tests for FleetApi 
 */
public class FleetApiTest {


    private FleetApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://api.samsara.com/v1", FleetApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * /fleet/add_address
     *
     * This method adds an address book entry to the specified group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFleetAddressTest() {
        String accessToken = null;
        AddressParam addressParam = null;
        //api.addFleetAddress(accessToken, addressParam);
        
        // TODO: test validations
        
        
    }
    
    /**
     * /addresses
     *
     * Add one or more addresses to the organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrganizationAddressesTest() {
        String accessToken = null;
        Addresses addresses = null;
        //List<Address> response = api.addOrganizationAddresses(accessToken, addresses);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/dispatch/routes
     *
     * Create a new dispatch route.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDispatchRouteTest() {
        String accessToken = null;
        DispatchRouteCreate createDispatchRouteParams = null;
        //DispatchRoute response = api.createDispatchRoute(accessToken, createDispatchRouteParams);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/create
     *
     * Create a new driver.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDriverTest() {
        String accessToken = null;
        DriverForCreate createDriverParam = null;
        //Driver response = api.createDriver(accessToken, createDriverParam);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * Create a new dispatch route for the driver with driver_id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDriverDispatchRouteTest() {
        String accessToken = null;
        Long driverId = null;
        DispatchRouteCreate createDispatchRouteParams = null;
        //DispatchRoute response = api.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     *
     * Create a driver document for the given driver.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDriverDocumentTest() {
        String accessToken = null;
        Long driverId = null;
        DocumentCreate createDocumentParams = null;
        //Document response = api.createDriverDocument(accessToken, driverId, createDocumentParams);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/maintenance/dvirs
     *
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDvirTest() {
        String accessToken = null;
        CreateDvirParam createDvirParam = null;
        //DvirBase response = api.createDvir(accessToken, createDvirParam);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * Create a new dispatch route for the vehicle with vehicle_id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVehicleDispatchRouteTest() {
        String accessToken = null;
        Long vehicleId = null;
        DispatchRouteCreate createDispatchRouteParams = null;
        //DispatchRoute response = api.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Deactivate a driver with the given id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deactivateDriverTest() {
        String accessToken = null;
        String driverIdOrExternalId = null;
        //api.deactivateDriver(accessToken, driverIdOrExternalId);
        
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * Delete a dispatch route and its associated jobs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDispatchRouteByIdTest() {
        String accessToken = null;
        Long routeId = null;
        //api.deleteDispatchRouteById(accessToken, routeId);
        
        // TODO: test validations
        
        
    }
    
    /**
     * /addresses/{addressId}
     *
     * Delete an address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrganizationAddressTest() {
        String accessToken = null;
        Long addressId = null;
        //api.deleteOrganizationAddress(accessToken, addressId);
        
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/dispatch/routes
     *
     * Fetch all of the dispatch routes for the group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchAllDispatchRoutesTest() {
        String accessToken = null;
        Long groupId = null;
        Long endTime = null;
        Long duration = null;
        //DispatchRoutes response = api.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/dispatch/routes/job_updates
     *
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchAllRouteJobUpdatesTest() {
        String accessToken = null;
        Long groupId = null;
        String sequenceId = null;
        String include = null;
        //AllRouteJobUpdates response = api.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/assets/locations
     *
     * Fetch current locations of all assets for the group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAssetCurrentLocationsTest() {
        String accessToken = null;
        Long groupId = null;
        //InlineResponse2001 response = api.getAllAssetCurrentLocations(accessToken, groupId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/assets
     *
     * Fetch all of the assets for the group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAssetsTest() {
        String accessToken = null;
        Long groupId = null;
        //InlineResponse200 response = api.getAllAssets(accessToken, groupId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/inactive
     *
     * Fetch all deactivated drivers for the group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDeactivatedDriversTest() {
        String accessToken = null;
        Long groupId = null;
        //List<Driver> response = api.getAllDeactivatedDrivers(accessToken, groupId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     *
     * Fetch the historical locations for the asset.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAssetLocationTest() {
        String accessToken = null;
        Long assetId = null;
        Long startMs = null;
        Long endMs = null;
        //AssetLocationResponse response = api.getAssetLocation(accessToken, assetId, startMs, endMs);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     *
     * Fetch the reefer-specific stats of an asset.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAssetReeferTest() {
        String accessToken = null;
        Long assetId = null;
        Long startMs = null;
        Long endMs = null;
        //AssetReeferResponse response = api.getAssetReefer(accessToken, assetId, startMs, endMs);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Fetch deactivated driver by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeactivatedDriverByIdTest() {
        String accessToken = null;
        String driverIdOrExternalId = null;
        //Driver response = api.getDeactivatedDriverById(accessToken, driverIdOrExternalId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     *
     * Fetch a dispatch route by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDispatchRouteByIdTest() {
        String accessToken = null;
        Long routeId = null;
        //DispatchRoute response = api.getDispatchRouteById(accessToken, routeId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     *
     * Fetch the history of a dispatch route.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDispatchRouteHistoryTest() {
        String accessToken = null;
        Long routeId = null;
        Long startTime = null;
        Long endTime = null;
        //DispatchRouteHistory response = api.getDispatchRouteHistory(accessToken, routeId, startTime, endTime);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * Fetch all of the dispatch routes for a given driver.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDispatchRoutesByDriverIdTest() {
        String accessToken = null;
        Long driverId = null;
        Long endTime = null;
        Long duration = null;
        //DispatchRoutes response = api.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * Fetch all of the dispatch routes for a given vehicle.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDispatchRoutesByVehicleIdTest() {
        String accessToken = null;
        Long vehicleId = null;
        Long endTime = null;
        Long duration = null;
        //DispatchRoutes response = api.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Fetch driver by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDriverByIdTest() {
        String accessToken = null;
        String driverIdOrExternalId = null;
        //CurrentDriver response = api.getDriverById(accessToken, driverIdOrExternalId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/document_types
     *
     * Fetch all of the document types.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDriverDocumentTypesByOrgIdTest() {
        //DocumentTypes response = api.getDriverDocumentTypesByOrgId();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/documents
     *
     * Fetch all of the documents.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDriverDocumentsByOrgIdTest() {
        String accessToken = null;
        Long endMs = null;
        Long durationMs = null;
        //Documents response = api.getDriverDocumentsByOrgId(accessToken, endMs, durationMs);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * Fetch the safety score for the driver.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDriverSafetyScoreTest() {
        Long driverId = null;
        String accessToken = null;
        Long startMs = null;
        Long endMs = null;
        //DriverSafetyScoreResponse response = api.getDriverSafetyScore(driverId, accessToken, startMs, endMs);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/maintenance/dvirs
     *
     * Get DVIRs for the org within provided time constraints
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDvirsTest() {
        String accessToken = null;
        Integer endMs = null;
        Integer durationMs = null;
        Integer groupId = null;
        //DvirListResponse response = api.getDvirs(accessToken, endMs, durationMs, groupId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers
     *
     * Get all the drivers for the specified group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetDriversTest() {
        String accessToken = null;
        GroupDriversParam groupDriversParam = null;
        //DriversResponse response = api.getFleetDrivers(accessToken, groupDriversParam);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     *
     * Get summarized daily HOS charts for a specified driver.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetDriversHosDailyLogsTest() {
        String accessToken = null;
        Long driverId = null;
        HosLogsParam hosLogsParam = null;
        //DriverDailyLogResponse response = api.getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/summary
     *
     * Get the distance and time each driver in an organization has driven in a given time period.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetDriversSummaryTest() {
        String accessToken = null;
        DriversSummaryParam driversSummaryParam = null;
        Boolean snapToDayBounds = null;
        //DriversSummaryResponse response = api.getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/hos_authentication_logs
     *
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetHosAuthenticationLogsTest() {
        String accessToken = null;
        HosAuthenticationLogsParam hosAuthenticationLogsParam = null;
        //HosAuthenticationLogsResponse response = api.getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/hos_logs
     *
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetHosLogsTest() {
        String accessToken = null;
        HosLogsParam1 hosLogsParam = null;
        //HosLogsResponse response = api.getFleetHosLogs(accessToken, hosLogsParam);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/hos_logs_summary
     *
     * Get the current HOS status for all drivers in the group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetHosLogsSummaryTest() {
        String accessToken = null;
        HosLogsParam2 hosLogsParam = null;
        //HosLogsSummaryResponse response = api.getFleetHosLogsSummary(accessToken, hosLogsParam);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/locations
     *
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetLocationsTest() {
        String accessToken = null;
        GroupParam groupParam = null;
        //InlineResponse2003 response = api.getFleetLocations(accessToken, groupParam);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/maintenance/list
     *
     * Get list of the vehicles with any engine faults or check light data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetMaintenanceListTest() {
        String accessToken = null;
        GroupParam groupParam = null;
        //InlineResponse2004 response = api.getFleetMaintenanceList(accessToken, groupParam);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/trips
     *
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetTripsTest() {
        String accessToken = null;
        TripsParam tripsParam = null;
        //TripResponse response = api.getFleetTrips(accessToken, tripsParam);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Gets a specific vehicle.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetVehicleTest() {
        String accessToken = null;
        String vehicleIdOrExternalId = null;
        //FleetVehicleResponse response = api.getFleetVehicle(accessToken, vehicleIdOrExternalId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /addresses/{addressId}
     *
     * Fetch an address by its id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationAddressTest() {
        String accessToken = null;
        Long addressId = null;
        //Address response = api.getOrganizationAddress(accessToken, addressId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /addresses
     *
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationAddressesTest() {
        String accessToken = null;
        //List<Address> response = api.getOrganizationAddresses(accessToken);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /contacts/{contact_id}
     *
     * Fetch a contact by its id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationContactTest() {
        String accessToken = null;
        Long contactId = null;
        //Contact response = api.getOrganizationContact(accessToken, contactId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * Fetch harsh event details for a vehicle.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVehicleHarshEventTest() {
        Long vehicleId = null;
        String accessToken = null;
        Long timestamp = null;
        //VehicleHarshEventResponse response = api.getVehicleHarshEvent(vehicleId, accessToken, timestamp);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     *
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVehicleLocationsTest() {
        String accessToken = null;
        Long vehicleId = null;
        Long startMs = null;
        Long endMs = null;
        //FleetVehicleLocations response = api.getVehicleLocations(accessToken, vehicleId, startMs, endMs);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * Fetch the safety score for the vehicle.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVehicleSafetyScoreTest() {
        Long vehicleId = null;
        String accessToken = null;
        Long startMs = null;
        Long endMs = null;
        //VehicleSafetyScoreResponse response = api.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/vehicles/stats
     *
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVehicleStatsTest() {
        String accessToken = null;
        Integer startMs = null;
        Integer endMs = null;
        String series = null;
        String tagIds = null;
        String startingAfter = null;
        String endingBefore = null;
        Long limit = null;
        //InlineResponse2005 response = api.getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/vehicles/locations
     *
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVehiclesLocationsTest() {
        String accessToken = null;
        Integer startMs = null;
        Integer endMs = null;
        //FleetVehiclesLocations response = api.getVehiclesLocations(accessToken, startMs, endMs);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /contacts
     *
     * Fetch all contacts for the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listContactsTest() {
        String accessToken = null;
        //List<Contact> response = api.listContacts(accessToken);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/list
     *
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFleetTest() {
        String accessToken = null;
        GroupParam groupParam = null;
        String startingAfter = null;
        String endingBefore = null;
        Long limit = null;
        //InlineResponse2002 response = api.listFleet(accessToken, groupParam, startingAfter, endingBefore, limit);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchFleetVehicleTest() {
        String accessToken = null;
        String vehicleIdOrExternalId = null;
        Data data = null;
        //FleetVehicleResponse response = api.patchFleetVehicle(accessToken, vehicleIdOrExternalId, data);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Reactivate the inactive driver having id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reactivateDriverByIdTest() {
        String accessToken = null;
        String driverIdOrExternalId = null;
        ReactivateDriverParam reactivateDriverParam = null;
        //CurrentDriver response = api.reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * Update a dispatch route and its associated jobs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDispatchRouteByIdTest() {
        String accessToken = null;
        Long routeId = null;
        DispatchRoute updateDispatchRouteParams = null;
        //DispatchRoute response = api.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * /addresses/{addressId}
     *
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganizationAddressTest() {
        String accessToken = null;
        Address address = null;
        Long addressId = null;
        //api.updateOrganizationAddress(accessToken, address, addressId);
        
        // TODO: test validations
        
        
    }
    
    /**
     * /fleet/set_data
     *
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVehiclesTest() {
        String accessToken = null;
        VehicleUpdateParam vehicleUpdateParam = null;
        //api.updateVehicles(accessToken, vehicleUpdateParam);
        
        // TODO: test validations
        
        
    }
    
}
