/*
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


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.Address;
import com.prokarma.pkmst.model.AllRouteJobUpdates;
import com.prokarma.pkmst.model.AssetReeferResponse;
import com.prokarma.pkmst.model.Contact;
import com.prokarma.pkmst.model.DispatchRoute;
import com.prokarma.pkmst.model.DispatchRouteCreate;
import com.prokarma.pkmst.model.DispatchRouteHistory;
import com.prokarma.pkmst.model.Document;
import com.prokarma.pkmst.model.DocumentCreate;
import com.prokarma.pkmst.model.DocumentType;
import com.prokarma.pkmst.model.Driver;
import com.prokarma.pkmst.model.DriverDailyLogResponse;
import com.prokarma.pkmst.model.DriverForCreate;
import com.prokarma.pkmst.model.DriverSafetyScoreResponse;
import com.prokarma.pkmst.model.DriversResponse;
import com.prokarma.pkmst.model.DriversSummaryResponse;
import com.prokarma.pkmst.model.DvirBase;
import com.prokarma.pkmst.model.DvirListResponse;
import com.prokarma.pkmst.model.FleetVehicleLocation;
import com.prokarma.pkmst.model.FleetVehicleResponse;
import com.prokarma.pkmst.model.HosAuthenticationLogsResponse;
import com.prokarma.pkmst.model.HosLogsResponse;
import com.prokarma.pkmst.model.HosLogsSummaryResponse;
import com.prokarma.pkmst.model.InlineObject;
import com.prokarma.pkmst.model.InlineObject1;
import com.prokarma.pkmst.model.InlineObject10;
import com.prokarma.pkmst.model.InlineObject11;
import com.prokarma.pkmst.model.InlineObject12;
import com.prokarma.pkmst.model.InlineObject13;
import com.prokarma.pkmst.model.InlineObject14;
import com.prokarma.pkmst.model.InlineObject15;
import com.prokarma.pkmst.model.InlineObject16;
import com.prokarma.pkmst.model.InlineObject2;
import com.prokarma.pkmst.model.InlineObject3;
import com.prokarma.pkmst.model.InlineObject4;
import com.prokarma.pkmst.model.InlineObject5;
import com.prokarma.pkmst.model.InlineObject6;
import com.prokarma.pkmst.model.InlineObject7;
import com.prokarma.pkmst.model.InlineObject8;
import com.prokarma.pkmst.model.InlineObject9;
import com.prokarma.pkmst.model.InlineResponse200;
import com.prokarma.pkmst.model.InlineResponse2001;
import com.prokarma.pkmst.model.InlineResponse2002;
import com.prokarma.pkmst.model.InlineResponse2003;
import com.prokarma.pkmst.model.InlineResponse2004;
import com.prokarma.pkmst.model.InlineResponse2005;
import com.prokarma.pkmst.model.TripResponse;
import com.prokarma.pkmst.model.VehicleHarshEventResponse;
import com.prokarma.pkmst.model.VehicleSafetyScoreResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for FleetApi
 */
@Ignore
public class FleetApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final FleetApi api = new FleetApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * /fleet/add_address
     *
     * This method adds an address book entry to the specified group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addFleetAddressTest() throws Exception {
        String accessToken = null;
        InlineObject2 addressParam = null;
    ResponseEntity<Void> response = api.addFleetAddress(accessToken, addressParam , accept);

        // TODO: test validations
    }
    
    /**
     * /addresses
     *
     * Add one or more addresses to the organization
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addOrganizationAddressesTest() throws Exception {
        String accessToken = null;
        InlineObject addresses = null;
    ResponseEntity<List<Address>> response = api.addOrganizationAddresses(accessToken, addresses , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/dispatch/routes
     *
     * Create a new dispatch route.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDispatchRouteTest() throws Exception {
        String accessToken = null;
        DispatchRouteCreate createDispatchRouteParams = null;
    ResponseEntity<DispatchRoute> response = api.createDispatchRoute(accessToken, createDispatchRouteParams , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/create
     *
     * Create a new driver.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDriverTest() throws Exception {
        String accessToken = null;
        DriverForCreate createDriverParam = null;
    ResponseEntity<Driver> response = api.createDriver(accessToken, createDriverParam , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * Create a new dispatch route for the driver with driver_id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDriverDispatchRouteTest() throws Exception {
        String accessToken = null;
        Long driverId = null;
        DispatchRouteCreate createDispatchRouteParams = null;
    ResponseEntity<DispatchRoute> response = api.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     *
     * Create a driver document for the given driver.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDriverDocumentTest() throws Exception {
        String accessToken = null;
        Long driverId = null;
        DocumentCreate createDocumentParams = null;
    ResponseEntity<Document> response = api.createDriverDocument(accessToken, driverId, createDocumentParams , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/maintenance/dvirs
     *
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDvirTest() throws Exception {
        String accessToken = null;
        InlineObject12 createDvirParam = null;
    ResponseEntity<DvirBase> response = api.createDvir(accessToken, createDvirParam , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * Create a new dispatch route for the vehicle with vehicle_id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createVehicleDispatchRouteTest() throws Exception {
        String accessToken = null;
        Long vehicleId = null;
        DispatchRouteCreate createDispatchRouteParams = null;
    ResponseEntity<DispatchRoute> response = api.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Deactivate a driver with the given id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deactivateDriverTest() throws Exception {
        String accessToken = null;
        String driverIdOrExternalId = null;
    ResponseEntity<Void> response = api.deactivateDriver(accessToken, driverIdOrExternalId , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * Delete a dispatch route and its associated jobs.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDispatchRouteByIdTest() throws Exception {
        String accessToken = null;
        Long routeId = null;
    ResponseEntity<Void> response = api.deleteDispatchRouteById(accessToken, routeId , accept);

        // TODO: test validations
    }
    
    /**
     * /addresses/{addressId}
     *
     * Delete an address.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOrganizationAddressTest() throws Exception {
        String accessToken = null;
        Long addressId = null;
    ResponseEntity<Void> response = api.deleteOrganizationAddress(accessToken, addressId , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/dispatch/routes
     *
     * Fetch all of the dispatch routes for the group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void fetchAllDispatchRoutesTest() throws Exception {
        String accessToken = null;
        Long groupId = null;
        Long endTime = null;
        Long duration = null;
    ResponseEntity<List<DispatchRoute>> response = api.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/dispatch/routes/job_updates
     *
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void fetchAllRouteJobUpdatesTest() throws Exception {
        String accessToken = null;
        Long groupId = null;
        String sequenceId = null;
        String include = null;
    ResponseEntity<AllRouteJobUpdates> response = api.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/assets/locations
     *
     * Fetch current locations of all assets for the group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllAssetCurrentLocationsTest() throws Exception {
        String accessToken = null;
        Long groupId = null;
    ResponseEntity<InlineResponse2001> response = api.getAllAssetCurrentLocations(accessToken, groupId , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/assets
     *
     * Fetch all of the assets for the group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllAssetsTest() throws Exception {
        String accessToken = null;
        Long groupId = null;
    ResponseEntity<InlineResponse200> response = api.getAllAssets(accessToken, groupId , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/inactive
     *
     * Fetch all deactivated drivers for the group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllDeactivatedDriversTest() throws Exception {
        String accessToken = null;
        Long groupId = null;
    ResponseEntity<List<Driver>> response = api.getAllDeactivatedDrivers(accessToken, groupId , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     *
     * Fetch the historical locations for the asset.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAssetLocationTest() throws Exception {
        String accessToken = null;
        Long assetId = null;
        Long startMs = null;
        Long endMs = null;
    ResponseEntity<List<Object>> response = api.getAssetLocation(accessToken, assetId, startMs, endMs , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     *
     * Fetch the reefer-specific stats of an asset.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAssetReeferTest() throws Exception {
        String accessToken = null;
        Long assetId = null;
        Long startMs = null;
        Long endMs = null;
    ResponseEntity<AssetReeferResponse> response = api.getAssetReefer(accessToken, assetId, startMs, endMs , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Fetch deactivated driver by id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDeactivatedDriverByIdTest() throws Exception {
        String accessToken = null;
        String driverIdOrExternalId = null;
    ResponseEntity<Driver> response = api.getDeactivatedDriverById(accessToken, driverIdOrExternalId , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     *
     * Fetch a dispatch route by id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDispatchRouteByIdTest() throws Exception {
        String accessToken = null;
        Long routeId = null;
    ResponseEntity<DispatchRoute> response = api.getDispatchRouteById(accessToken, routeId , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     *
     * Fetch the history of a dispatch route.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDispatchRouteHistoryTest() throws Exception {
        String accessToken = null;
        Long routeId = null;
        Long startTime = null;
        Long endTime = null;
    ResponseEntity<DispatchRouteHistory> response = api.getDispatchRouteHistory(accessToken, routeId, startTime, endTime , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * Fetch all of the dispatch routes for a given driver.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDispatchRoutesByDriverIdTest() throws Exception {
        String accessToken = null;
        Long driverId = null;
        Long endTime = null;
        Long duration = null;
    ResponseEntity<List<DispatchRoute>> response = api.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * Fetch all of the dispatch routes for a given vehicle.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDispatchRoutesByVehicleIdTest() throws Exception {
        String accessToken = null;
        Long vehicleId = null;
        Long endTime = null;
        Long duration = null;
    ResponseEntity<List<DispatchRoute>> response = api.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Fetch driver by id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDriverByIdTest() throws Exception {
        String accessToken = null;
        String driverIdOrExternalId = null;
    ResponseEntity<Driver> response = api.getDriverById(accessToken, driverIdOrExternalId , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/document_types
     *
     * Fetch all of the document types.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDriverDocumentTypesByOrgIdTest() throws Exception {
    ResponseEntity<List<DocumentType>> response = api.getDriverDocumentTypesByOrgId(  accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/documents
     *
     * Fetch all of the documents.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDriverDocumentsByOrgIdTest() throws Exception {
        String accessToken = null;
        Long endMs = null;
        Long durationMs = null;
    ResponseEntity<List<Document>> response = api.getDriverDocumentsByOrgId(accessToken, endMs, durationMs , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * Fetch the safety score for the driver.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDriverSafetyScoreTest() throws Exception {
        Long driverId = null;
        String accessToken = null;
        Long startMs = null;
        Long endMs = null;
    ResponseEntity<DriverSafetyScoreResponse> response = api.getDriverSafetyScore(driverId, accessToken, startMs, endMs , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/maintenance/dvirs
     *
     * Get DVIRs for the org within provided time constraints
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDvirsTest() throws Exception {
        String accessToken = null;
        Integer endMs = null;
        Integer durationMs = null;
        Integer groupId = null;
    ResponseEntity<DvirListResponse> response = api.getDvirs(accessToken, endMs, durationMs, groupId , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers
     *
     * Get all the drivers for the specified group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFleetDriversTest() throws Exception {
        String accessToken = null;
        InlineObject3 groupDriversParam = null;
    ResponseEntity<DriversResponse> response = api.getFleetDrivers(accessToken, groupDriversParam , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     *
     * Get summarized daily HOS charts for a specified driver.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFleetDriversHosDailyLogsTest() throws Exception {
        String accessToken = null;
        Long driverId = null;
        InlineObject6 hosLogsParam = null;
    ResponseEntity<DriverDailyLogResponse> response = api.getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/summary
     *
     * Get the distance and time each driver in an organization has driven in a given time period.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFleetDriversSummaryTest() throws Exception {
        String accessToken = null;
        InlineObject5 driversSummaryParam = null;
        Boolean snapToDayBounds = null;
    ResponseEntity<DriversSummaryResponse> response = api.getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/hos_authentication_logs
     *
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFleetHosAuthenticationLogsTest() throws Exception {
        String accessToken = null;
        InlineObject7 hosAuthenticationLogsParam = null;
    ResponseEntity<HosAuthenticationLogsResponse> response = api.getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/hos_logs
     *
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFleetHosLogsTest() throws Exception {
        String accessToken = null;
        InlineObject8 hosLogsParam = null;
    ResponseEntity<HosLogsResponse> response = api.getFleetHosLogs(accessToken, hosLogsParam , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/hos_logs_summary
     *
     * Get the current HOS status for all drivers in the group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFleetHosLogsSummaryTest() throws Exception {
        String accessToken = null;
        InlineObject9 hosLogsParam = null;
    ResponseEntity<HosLogsSummaryResponse> response = api.getFleetHosLogsSummary(accessToken, hosLogsParam , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/locations
     *
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFleetLocationsTest() throws Exception {
        String accessToken = null;
        InlineObject11 groupParam = null;
    ResponseEntity<InlineResponse2003> response = api.getFleetLocations(accessToken, groupParam , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/maintenance/list
     *
     * Get list of the vehicles with any engine faults or check light data.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFleetMaintenanceListTest() throws Exception {
        String accessToken = null;
        InlineObject13 groupParam = null;
    ResponseEntity<InlineResponse2004> response = api.getFleetMaintenanceList(accessToken, groupParam , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/trips
     *
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFleetTripsTest() throws Exception {
        String accessToken = null;
        InlineObject15 tripsParam = null;
    ResponseEntity<TripResponse> response = api.getFleetTrips(accessToken, tripsParam , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Gets a specific vehicle.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFleetVehicleTest() throws Exception {
        String accessToken = null;
        String vehicleIdOrExternalId = null;
    ResponseEntity<FleetVehicleResponse> response = api.getFleetVehicle(accessToken, vehicleIdOrExternalId , accept);

        // TODO: test validations
    }
    
    /**
     * /addresses/{addressId}
     *
     * Fetch an address by its id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOrganizationAddressTest() throws Exception {
        String accessToken = null;
        Long addressId = null;
    ResponseEntity<Address> response = api.getOrganizationAddress(accessToken, addressId , accept);

        // TODO: test validations
    }
    
    /**
     * /addresses
     *
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOrganizationAddressesTest() throws Exception {
        String accessToken = null;
    ResponseEntity<List<Address>> response = api.getOrganizationAddresses(accessToken , accept);

        // TODO: test validations
    }
    
    /**
     * /contacts/{contact_id}
     *
     * Fetch a contact by its id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOrganizationContactTest() throws Exception {
        String accessToken = null;
        Long contactId = null;
    ResponseEntity<Contact> response = api.getOrganizationContact(accessToken, contactId , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * Fetch harsh event details for a vehicle.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVehicleHarshEventTest() throws Exception {
        Long vehicleId = null;
        String accessToken = null;
        Long timestamp = null;
    ResponseEntity<VehicleHarshEventResponse> response = api.getVehicleHarshEvent(vehicleId, accessToken, timestamp , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     *
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVehicleLocationsTest() throws Exception {
        String accessToken = null;
        Long vehicleId = null;
        Long startMs = null;
        Long endMs = null;
    ResponseEntity<List<FleetVehicleLocation>> response = api.getVehicleLocations(accessToken, vehicleId, startMs, endMs , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * Fetch the safety score for the vehicle.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVehicleSafetyScoreTest() throws Exception {
        Long vehicleId = null;
        String accessToken = null;
        Long startMs = null;
        Long endMs = null;
    ResponseEntity<VehicleSafetyScoreResponse> response = api.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/vehicles/stats
     *
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVehicleStatsTest() throws Exception {
        String accessToken = null;
        Integer startMs = null;
        Integer endMs = null;
        String series = null;
        String tagIds = null;
        String startingAfter = null;
        String endingBefore = null;
        Long limit = null;
    ResponseEntity<InlineResponse2005> response = api.getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/vehicles/locations
     *
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVehiclesLocationsTest() throws Exception {
        String accessToken = null;
        Integer startMs = null;
        Integer endMs = null;
    ResponseEntity<List<Object>> response = api.getVehiclesLocations(accessToken, startMs, endMs , accept);

        // TODO: test validations
    }
    
    /**
     * /contacts
     *
     * Fetch all contacts for the organization.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listContactsTest() throws Exception {
        String accessToken = null;
    ResponseEntity<List<Contact>> response = api.listContacts(accessToken , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/list
     *
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listFleetTest() throws Exception {
        String accessToken = null;
        InlineObject10 groupParam = null;
        String startingAfter = null;
        String endingBefore = null;
        Long limit = null;
    ResponseEntity<InlineResponse2002> response = api.listFleet(accessToken, groupParam, startingAfter, endingBefore, limit , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchFleetVehicleTest() throws Exception {
        String accessToken = null;
        String vehicleIdOrExternalId = null;
        InlineObject16 data = null;
    ResponseEntity<FleetVehicleResponse> response = api.patchFleetVehicle(accessToken, vehicleIdOrExternalId, data , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Reactivate the inactive driver having id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void reactivateDriverByIdTest() throws Exception {
        String accessToken = null;
        String driverIdOrExternalId = null;
        InlineObject4 reactivateDriverParam = null;
    ResponseEntity<Driver> response = api.reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * Update a dispatch route and its associated jobs.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDispatchRouteByIdTest() throws Exception {
        String accessToken = null;
        Long routeId = null;
        DispatchRoute updateDispatchRouteParams = null;
    ResponseEntity<DispatchRoute> response = api.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams , accept);

        // TODO: test validations
    }
    
    /**
     * /addresses/{addressId}
     *
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateOrganizationAddressTest() throws Exception {
        String accessToken = null;
        Long addressId = null;
        InlineObject1 address = null;
    ResponseEntity<Void> response = api.updateOrganizationAddress(accessToken, addressId, address , accept);

        // TODO: test validations
    }
    
    /**
     * /fleet/set_data
     *
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateVehiclesTest() throws Exception {
        String accessToken = null;
        InlineObject14 vehicleUpdateParam = null;
    ResponseEntity<Void> response = api.updateVehicles(accessToken, vehicleUpdateParam , accept);

        // TODO: test validations
    }
    
}
