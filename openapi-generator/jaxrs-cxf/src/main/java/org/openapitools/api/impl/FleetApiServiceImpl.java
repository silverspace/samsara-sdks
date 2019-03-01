package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Address;
import org.openapitools.model.AllRouteJobUpdates;
import org.openapitools.model.AssetReeferResponse;
import org.openapitools.model.Contact;
import org.openapitools.model.DispatchRoute;
import org.openapitools.model.DispatchRouteCreate;
import org.openapitools.model.DispatchRouteHistory;
import org.openapitools.model.Document;
import org.openapitools.model.DocumentCreate;
import org.openapitools.model.DocumentType;
import org.openapitools.model.Driver;
import org.openapitools.model.DriverDailyLogResponse;
import org.openapitools.model.DriverForCreate;
import org.openapitools.model.DriverSafetyScoreResponse;
import org.openapitools.model.DriversResponse;
import org.openapitools.model.DriversSummaryResponse;
import org.openapitools.model.DvirBase;
import org.openapitools.model.DvirListResponse;
import org.openapitools.model.FleetVehicleLocation;
import org.openapitools.model.FleetVehicleResponse;
import org.openapitools.model.HosAuthenticationLogsResponse;
import org.openapitools.model.HosLogsResponse;
import org.openapitools.model.HosLogsSummaryResponse;
import org.openapitools.model.InlineObject;
import org.openapitools.model.InlineObject1;
import org.openapitools.model.InlineObject10;
import org.openapitools.model.InlineObject11;
import org.openapitools.model.InlineObject12;
import org.openapitools.model.InlineObject13;
import org.openapitools.model.InlineObject14;
import org.openapitools.model.InlineObject15;
import org.openapitools.model.InlineObject16;
import org.openapitools.model.InlineObject2;
import org.openapitools.model.InlineObject3;
import org.openapitools.model.InlineObject4;
import org.openapitools.model.InlineObject5;
import org.openapitools.model.InlineObject6;
import org.openapitools.model.InlineObject7;
import org.openapitools.model.InlineObject8;
import org.openapitools.model.InlineObject9;
import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse2001;
import org.openapitools.model.InlineResponse2002;
import org.openapitools.model.InlineResponse2003;
import org.openapitools.model.InlineResponse2004;
import org.openapitools.model.InlineResponse2005;
import org.openapitools.model.TripResponse;
import org.openapitools.model.VehicleHarshEventResponse;
import org.openapitools.model.VehicleSafetyScoreResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Samsara API
 *
 * <p># Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 */
public class FleetApiServiceImpl implements FleetApi {
    /**
     * /fleet/add_address
     *
     * This method adds an address book entry to the specified group.
     *
     */
    public void addFleetAddress(String accessToken, InlineObject2 addressParam) {
        // TODO: Implement...
        
        
    }
    
    /**
     * /addresses
     *
     * Add one or more addresses to the organization
     *
     */
    public List<Address> addOrganizationAddresses(String accessToken, InlineObject addresses) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/dispatch/routes
     *
     * Create a new dispatch route.
     *
     */
    public DispatchRoute createDispatchRoute(String accessToken, DispatchRouteCreate createDispatchRouteParams) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/create
     *
     * Create a new driver.
     *
     */
    public Driver createDriver(String accessToken, DriverForCreate createDriverParam) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * Create a new dispatch route for the driver with driver_id.
     *
     */
    public DispatchRoute createDriverDispatchRoute(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     *
     * Create a driver document for the given driver.
     *
     */
    public Document createDriverDocument(String accessToken, Long driverId, DocumentCreate createDocumentParams) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/maintenance/dvirs
     *
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     *
     */
    public DvirBase createDvir(String accessToken, InlineObject12 createDvirParam) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * Create a new dispatch route for the vehicle with vehicle_id.
     *
     */
    public DispatchRoute createVehicleDispatchRoute(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Deactivate a driver with the given id.
     *
     */
    public void deactivateDriver(String accessToken, String driverIdOrExternalId) {
        // TODO: Implement...
        
        
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * Delete a dispatch route and its associated jobs.
     *
     */
    public void deleteDispatchRouteById(String accessToken, Long routeId) {
        // TODO: Implement...
        
        
    }
    
    /**
     * /addresses/{addressId}
     *
     * Delete an address.
     *
     */
    public void deleteOrganizationAddress(String accessToken, Long addressId) {
        // TODO: Implement...
        
        
    }
    
    /**
     * /fleet/dispatch/routes
     *
     * Fetch all of the dispatch routes for the group.
     *
     */
    public List<DispatchRoute> fetchAllDispatchRoutes(String accessToken, Long groupId, Long endTime, Long duration) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/dispatch/routes/job_updates
     *
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     *
     */
    public AllRouteJobUpdates fetchAllRouteJobUpdates(String accessToken, Long groupId, String sequenceId, String include) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/assets/locations
     *
     * Fetch current locations of all assets for the group.
     *
     */
    public InlineResponse2001 getAllAssetCurrentLocations(String accessToken, Long groupId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/assets
     *
     * Fetch all of the assets for the group.
     *
     */
    public InlineResponse200 getAllAssets(String accessToken, Long groupId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/inactive
     *
     * Fetch all deactivated drivers for the group.
     *
     */
    public List<Driver> getAllDeactivatedDrivers(String accessToken, Long groupId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     *
     * Fetch the historical locations for the asset.
     *
     */
    public List<Object> getAssetLocation(String accessToken, Long assetId, Long startMs, Long endMs) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     *
     * Fetch the reefer-specific stats of an asset.
     *
     */
    public AssetReeferResponse getAssetReefer(String accessToken, Long assetId, Long startMs, Long endMs) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Fetch deactivated driver by id.
     *
     */
    public Driver getDeactivatedDriverById(String accessToken, String driverIdOrExternalId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     *
     * Fetch a dispatch route by id.
     *
     */
    public DispatchRoute getDispatchRouteById(String accessToken, Long routeId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     *
     * Fetch the history of a dispatch route.
     *
     */
    public DispatchRouteHistory getDispatchRouteHistory(String accessToken, Long routeId, Long startTime, Long endTime) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * Fetch all of the dispatch routes for a given driver.
     *
     */
    public List<DispatchRoute> getDispatchRoutesByDriverId(String accessToken, Long driverId, Long endTime, Long duration) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * Fetch all of the dispatch routes for a given vehicle.
     *
     */
    public List<DispatchRoute> getDispatchRoutesByVehicleId(String accessToken, Long vehicleId, Long endTime, Long duration) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Fetch driver by id.
     *
     */
    public Driver getDriverById(String accessToken, String driverIdOrExternalId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/document_types
     *
     * Fetch all of the document types.
     *
     */
    public List<DocumentType> getDriverDocumentTypesByOrgId() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/documents
     *
     * Fetch all of the documents.
     *
     */
    public List<Document> getDriverDocumentsByOrgId(String accessToken, Long endMs, Long durationMs) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * Fetch the safety score for the driver.
     *
     */
    public DriverSafetyScoreResponse getDriverSafetyScore(Long driverId, String accessToken, Long startMs, Long endMs) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/maintenance/dvirs
     *
     * Get DVIRs for the org within provided time constraints
     *
     */
    public DvirListResponse getDvirs(String accessToken, Integer endMs, Integer durationMs, Integer groupId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers
     *
     * Get all the drivers for the specified group.
     *
     */
    public DriversResponse getFleetDrivers(String accessToken, InlineObject3 groupDriversParam) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     *
     * Get summarized daily HOS charts for a specified driver.
     *
     */
    public DriverDailyLogResponse getFleetDriversHosDailyLogs(String accessToken, Long driverId, InlineObject6 hosLogsParam) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/summary
     *
     * Get the distance and time each driver in an organization has driven in a given time period.
     *
     */
    public DriversSummaryResponse getFleetDriversSummary(String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/hos_authentication_logs
     *
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     *
     */
    public HosAuthenticationLogsResponse getFleetHosAuthenticationLogs(String accessToken, InlineObject7 hosAuthenticationLogsParam) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/hos_logs
     *
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     *
     */
    public HosLogsResponse getFleetHosLogs(String accessToken, InlineObject8 hosLogsParam) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/hos_logs_summary
     *
     * Get the current HOS status for all drivers in the group.
     *
     */
    public HosLogsSummaryResponse getFleetHosLogsSummary(String accessToken, InlineObject9 hosLogsParam) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/locations
     *
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     *
     */
    public InlineResponse2003 getFleetLocations(String accessToken, InlineObject11 groupParam) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/maintenance/list
     *
     * Get list of the vehicles with any engine faults or check light data.
     *
     */
    public InlineResponse2004 getFleetMaintenanceList(String accessToken, InlineObject13 groupParam) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/trips
     *
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     *
     */
    public TripResponse getFleetTrips(String accessToken, InlineObject15 tripsParam) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Gets a specific vehicle.
     *
     */
    public FleetVehicleResponse getFleetVehicle(String accessToken, String vehicleIdOrExternalId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /addresses/{addressId}
     *
     * Fetch an address by its id.
     *
     */
    public Address getOrganizationAddress(String accessToken, Long addressId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /addresses
     *
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     *
     */
    public List<Address> getOrganizationAddresses(String accessToken) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /contacts/{contact_id}
     *
     * Fetch a contact by its id.
     *
     */
    public Contact getOrganizationContact(String accessToken, Long contactId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * Fetch harsh event details for a vehicle.
     *
     */
    public VehicleHarshEventResponse getVehicleHarshEvent(Long vehicleId, String accessToken, Long timestamp) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     *
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     *
     */
    public List<FleetVehicleLocation> getVehicleLocations(String accessToken, Long vehicleId, Long startMs, Long endMs) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * Fetch the safety score for the vehicle.
     *
     */
    public VehicleSafetyScoreResponse getVehicleSafetyScore(Long vehicleId, String accessToken, Long startMs, Long endMs) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/vehicles/stats
     *
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     *
     */
    public InlineResponse2005 getVehicleStats(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/vehicles/locations
     *
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     *
     */
    public List<Object> getVehiclesLocations(String accessToken, Integer startMs, Integer endMs) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /contacts
     *
     * Fetch all contacts for the organization.
     *
     */
    public List<Contact> listContacts(String accessToken) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/list
     *
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     *
     */
    public InlineResponse2002 listFleet(String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     *
     */
    public FleetVehicleResponse patchFleetVehicle(String accessToken, String vehicleIdOrExternalId, InlineObject16 data) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Reactivate the inactive driver having id.
     *
     */
    public Driver reactivateDriverById(String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * Update a dispatch route and its associated jobs.
     *
     */
    public DispatchRoute updateDispatchRouteById(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * /addresses/{addressId}
     *
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     *
     */
    public void updateOrganizationAddress(String accessToken, Long addressId, InlineObject1 address) {
        // TODO: Implement...
        
        
    }
    
    /**
     * /fleet/set_data
     *
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     *
     */
    public void updateVehicles(String accessToken, InlineObject14 vehicleUpdateParam) {
        // TODO: Implement...
        
        
    }
    
}

