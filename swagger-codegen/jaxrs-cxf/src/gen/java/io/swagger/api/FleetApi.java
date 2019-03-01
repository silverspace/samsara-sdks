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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Samsara API
 *
 * <p># Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface FleetApi  {

    /**
     * /fleet/add_address
     *
     * This method adds an address book entry to the specified group.
     *
     */
    @POST
    @Path("/fleet/add_address")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/add_address", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Address was successfully added. No response body is returned."),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public void addFleetAddress(@QueryParam("access_token") @NotNull String accessToken, @Valid AddressParam addressParam);

    /**
     * /addresses
     *
     * Add one or more addresses to the organization
     *
     */
    @POST
    @Path("/addresses")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of added addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.", response = Address.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public List<Address> addOrganizationAddresses(@QueryParam("access_token") @NotNull String accessToken, @Valid Addresses addresses);

    /**
     * /fleet/dispatch/routes
     *
     * Create a new dispatch route.
     *
     */
    @POST
    @Path("/fleet/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes", tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoute createDispatchRoute(@QueryParam("access_token") @NotNull String accessToken, @Valid DispatchRouteCreate createDispatchRouteParams);

    /**
     * /fleet/drivers/create
     *
     * Create a new driver.
     *
     */
    @POST
    @Path("/fleet/drivers/create")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/create", tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the successfully created the driver.", response = Driver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Driver createDriver(@QueryParam("access_token") @NotNull String accessToken, @Valid DriverForCreate createDriverParam);

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * Create a new dispatch route for the driver with driver_id.
     *
     */
    @POST
    @Path("/fleet/drivers/{driver_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoute createDriverDispatchRoute(@QueryParam("access_token") @NotNull String accessToken, @PathParam("driver_id") Long driverId, @Valid DispatchRouteCreate createDispatchRouteParams);

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     *
     * Create a driver document for the given driver.
     *
     */
    @POST
    @Path("/fleet/drivers/{driver_id}/documents")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/documents", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the created document.", response = Document.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Document createDriverDocument(@QueryParam("access_token") @NotNull String accessToken, @PathParam("driver_id") Long driverId, @Valid DocumentCreate createDocumentParams);

    /**
     * /fleet/maintenance/dvirs
     *
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     *
     */
    @POST
    @Path("/fleet/maintenance/dvirs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/maintenance/dvirs", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Newly created DVIR.", response = DvirBase.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DvirBase createDvir(@QueryParam("access_token") @NotNull String accessToken, @Valid CreateDvirParam createDvirParam);

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * Create a new dispatch route for the vehicle with vehicle_id.
     *
     */
    @POST
    @Path("/fleet/vehicles/{vehicle_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoute createVehicleDispatchRoute(@QueryParam("access_token") @NotNull String accessToken, @PathParam("vehicle_id") Long vehicleId, @Valid DispatchRouteCreate createDispatchRouteParams);

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Deactivate a driver with the given id.
     *
     */
    @DELETE
    @Path("/fleet/drivers/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}."),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public void deactivateDriver(@QueryParam("access_token") @NotNull String accessToken, @PathParam("driver_id_or_external_id") String driverIdOrExternalId);

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * Delete a dispatch route and its associated jobs.
     *
     */
    @DELETE
    @Path("/fleet/dispatch/routes/{route_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deleted the dispatch route. No response body is returned."),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public void deleteDispatchRouteById(@QueryParam("access_token") @NotNull String accessToken, @PathParam("route_id") Long routeId);

    /**
     * /addresses/{addressId}
     *
     * Delete an address.
     *
     */
    @DELETE
    @Path("/addresses/{addressId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses/{addressId}", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Address was successfully deleted. No response body is returned."),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public void deleteOrganizationAddress(@QueryParam("access_token") @NotNull String accessToken, @PathParam("addressId") Long addressId);

    /**
     * /fleet/dispatch/routes
     *
     * Fetch all of the dispatch routes for the group.
     *
     */
    @GET
    @Path("/fleet/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes", tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All dispatch route objects for the group.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoutes fetchAllDispatchRoutes(@QueryParam("access_token") @NotNull String accessToken, @QueryParam("group_id") Long groupId, @QueryParam("end_time") Long endTime, @QueryParam("duration") Long duration);

    /**
     * /fleet/dispatch/routes/job_updates
     *
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     *
     */
    @GET
    @Path("/fleet/dispatch/routes/job_updates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/job_updates", tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All job updates on routes.", response = AllRouteJobUpdates.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public AllRouteJobUpdates fetchAllRouteJobUpdates(@QueryParam("access_token") @NotNull String accessToken, @QueryParam("group_id") Long groupId, @QueryParam("sequence_id") String sequenceId, @QueryParam("include") String include);

    /**
     * /fleet/assets/locations
     *
     * Fetch current locations of all assets for the group.
     *
     */
    @GET
    @Path("/fleet/assets/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets/locations", tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of assets and their current locations.", response = InlineResponse2001.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public InlineResponse2001 getAllAssetCurrentLocations(@QueryParam("access_token") @NotNull String accessToken, @QueryParam("group_id") Long groupId);

    /**
     * /fleet/assets
     *
     * Fetch all of the assets for the group.
     *
     */
    @GET
    @Path("/fleet/assets")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets", tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of assets.", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public InlineResponse200 getAllAssets(@QueryParam("access_token") @NotNull String accessToken, @QueryParam("group_id") Long groupId);

    /**
     * /fleet/drivers/inactive
     *
     * Fetch all deactivated drivers for the group.
     *
     */
    @GET
    @Path("/fleet/drivers/inactive")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/inactive", tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}", response = Driver.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public List<Driver> getAllDeactivatedDrivers(@QueryParam("access_token") @NotNull String accessToken, @QueryParam("group_id") Long groupId);

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     *
     * Fetch the historical locations for the asset.
     *
     */
    @GET
    @Path("/fleet/assets/{asset_id}/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets/{assetId:[0-9]+}/locations", tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Asset location details.", response = AssetLocationResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public AssetLocationResponse getAssetLocation(@QueryParam("access_token") @NotNull String accessToken, @PathParam("asset_id") Long assetId, @QueryParam("startMs") @NotNull Long startMs, @QueryParam("endMs") @NotNull Long endMs);

    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     *
     * Fetch the reefer-specific stats of an asset.
     *
     */
    @GET
    @Path("/fleet/assets/{asset_id}/reefer")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets/{assetId:[0-9]+}/reefer", tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Reefer-specific asset details.", response = AssetReeferResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public AssetReeferResponse getAssetReefer(@QueryParam("access_token") @NotNull String accessToken, @PathParam("asset_id") Long assetId, @QueryParam("startMs") @NotNull Long startMs, @QueryParam("endMs") @NotNull Long endMs);

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Fetch deactivated driver by id.
     *
     */
    @GET
    @Path("/fleet/drivers/inactive/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the deactivated driver with the given driver_id.", response = Driver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Driver getDeactivatedDriverById(@QueryParam("access_token") @NotNull String accessToken, @PathParam("driver_id_or_external_id") String driverIdOrExternalId);

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     *
     * Fetch a dispatch route by id.
     *
     */
    @GET
    @Path("/fleet/dispatch/routes/{route_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}", tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The dispatch route corresponding to route_id.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoute getDispatchRouteById(@QueryParam("access_token") @NotNull String accessToken, @PathParam("route_id") Long routeId);

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     *
     * Fetch the history of a dispatch route.
     *
     */
    @GET
    @Path("/fleet/dispatch/routes/{route_id}/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/history", tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The historical route state changes between start_time and end_time.", response = DispatchRouteHistory.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRouteHistory getDispatchRouteHistory(@QueryParam("access_token") @NotNull String accessToken, @PathParam("route_id") Long routeId, @QueryParam("start_time") Long startTime, @QueryParam("end_time") Long endTime);

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     *
     * Fetch all of the dispatch routes for a given driver.
     *
     */
    @GET
    @Path("/fleet/drivers/{driver_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the dispatch routes for the given driver_id.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoutes getDispatchRoutesByDriverId(@QueryParam("access_token") @NotNull String accessToken, @PathParam("driver_id") Long driverId, @QueryParam("end_time") Long endTime, @QueryParam("duration") Long duration);

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     *
     * Fetch all of the dispatch routes for a given vehicle.
     *
     */
    @GET
    @Path("/fleet/vehicles/{vehicle_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all of the dispatch routes for the given vehicle_id.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoutes getDispatchRoutesByVehicleId(@QueryParam("access_token") @NotNull String accessToken, @PathParam("vehicle_id") Long vehicleId, @QueryParam("end_time") Long endTime, @QueryParam("duration") Long duration);

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Fetch driver by id.
     *
     */
    @GET
    @Path("/fleet/drivers/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the driver for the given driver_id.", response = CurrentDriver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public CurrentDriver getDriverById(@QueryParam("access_token") @NotNull String accessToken, @PathParam("driver_id_or_external_id") String driverIdOrExternalId);

    /**
     * /fleet/drivers/document_types
     *
     * Fetch all of the document types.
     *
     */
    @GET
    @Path("/fleet/drivers/document_types")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/document_types", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all of the document types.", response = DocumentTypes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DocumentTypes getDriverDocumentTypesByOrgId();

    /**
     * /fleet/drivers/documents
     *
     * Fetch all of the documents.
     *
     */
    @GET
    @Path("/fleet/drivers/documents")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/documents", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all of the documents.", response = Documents.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Documents getDriverDocumentsByOrgId(@QueryParam("access_token") @NotNull String accessToken, @QueryParam("endMs") Long endMs, @QueryParam("durationMs") Long durationMs);

    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     *
     * Fetch the safety score for the driver.
     *
     */
    @GET
    @Path("/fleet/drivers/{driverId}/safety/score")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driverId:[0-9]+}/safety/score", tags={ "Fleet", "Safety",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Safety score details.", response = DriverSafetyScoreResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DriverSafetyScoreResponse getDriverSafetyScore(@PathParam("driverId") Long driverId, @QueryParam("access_token") @NotNull String accessToken, @QueryParam("startMs") @NotNull Long startMs, @QueryParam("endMs") @NotNull Long endMs);

    /**
     * /fleet/maintenance/dvirs
     *
     * Get DVIRs for the org within provided time constraints
     *
     */
    @GET
    @Path("/fleet/maintenance/dvirs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/maintenance/dvirs", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "DVIRs for the specified duration.", response = DvirListResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DvirListResponse getDvirs(@QueryParam("access_token") @NotNull String accessToken, @QueryParam("end_ms") @NotNull Integer endMs, @QueryParam("duration_ms") @NotNull Integer durationMs, @QueryParam("group_id") Integer groupId);

    /**
     * /fleet/drivers
     *
     * Get all the drivers for the specified group.
     *
     */
    @POST
    @Path("/fleet/drivers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All drivers in the group.", response = DriversResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DriversResponse getFleetDrivers(@QueryParam("access_token") @NotNull String accessToken, @Valid GroupDriversParam groupDriversParam);

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     *
     * Get summarized daily HOS charts for a specified driver.
     *
     */
    @POST
    @Path("/fleet/drivers/{driver_id}/hos_daily_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Distance traveled and time active for each driver in the organization over the specified time period.", response = DriverDailyLogResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DriverDailyLogResponse getFleetDriversHosDailyLogs(@QueryParam("access_token") @NotNull String accessToken, @PathParam("driver_id") Long driverId, @Valid HosLogsParam hosLogsParam);

    /**
     * /fleet/drivers/summary
     *
     * Get the distance and time each driver in an organization has driven in a given time period.
     *
     */
    @POST
    @Path("/fleet/drivers/summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/summary", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Distance traveled and time active for each driver in the organization over the specified time period.", response = DriversSummaryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DriversSummaryResponse getFleetDriversSummary(@QueryParam("access_token") @NotNull String accessToken, @Valid DriversSummaryParam driversSummaryParam, @QueryParam("snap_to_day_bounds") Boolean snapToDayBounds);

    /**
     * /fleet/hos_authentication_logs
     *
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     *
     */
    @POST
    @Path("/fleet/hos_authentication_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/hos_authentication_logs", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "HOS authentication logs for the specified driver.", response = HosAuthenticationLogsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public HosAuthenticationLogsResponse getFleetHosAuthenticationLogs(@QueryParam("access_token") @NotNull String accessToken, @Valid HosAuthenticationLogsParam hosAuthenticationLogsParam);

    /**
     * /fleet/hos_logs
     *
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     *
     */
    @POST
    @Path("/fleet/hos_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/hos_logs", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "HOS logs for the specified driver.", response = HosLogsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public HosLogsResponse getFleetHosLogs(@QueryParam("access_token") @NotNull String accessToken, @Valid HosLogsParam1 hosLogsParam);

    /**
     * /fleet/hos_logs_summary
     *
     * Get the current HOS status for all drivers in the group.
     *
     */
    @POST
    @Path("/fleet/hos_logs_summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/hos_logs_summary", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "HOS logs for the specified driver.", response = HosLogsSummaryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public HosLogsSummaryResponse getFleetHosLogsSummary(@QueryParam("access_token") @NotNull String accessToken, @Valid HosLogsParam2 hosLogsParam);

    /**
     * /fleet/locations
     *
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     *
     */
    @POST
    @Path("/fleet/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/locations", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of vehicle objects containing their location and the time at which that location was logged.", response = InlineResponse2003.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public InlineResponse2003 getFleetLocations(@QueryParam("access_token") @NotNull String accessToken, @Valid GroupParam groupParam);

    /**
     * /fleet/maintenance/list
     *
     * Get list of the vehicles with any engine faults or check light data.
     *
     */
    @POST
    @Path("/fleet/maintenance/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/maintenance/list", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of vehicles and maintenance information about each.", response = InlineResponse2004.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public InlineResponse2004 getFleetMaintenanceList(@QueryParam("access_token") @NotNull String accessToken, @Valid GroupParam groupParam);

    /**
     * /fleet/trips
     *
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     *
     */
    @POST
    @Path("/fleet/trips")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/trips", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of trips taken by the requested vehicle within the specified timeframe.", response = TripResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public TripResponse getFleetTrips(@QueryParam("access_token") @NotNull String accessToken, @Valid TripsParam tripsParam);

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Gets a specific vehicle.
     *
     */
    @GET
    @Path("/fleet/vehicles/{vehicle_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The specified vehicle.", response = FleetVehicleResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public FleetVehicleResponse getFleetVehicle(@QueryParam("access_token") @NotNull String accessToken, @PathParam("vehicle_id_or_external_id") String vehicleIdOrExternalId);

    /**
     * /addresses/{addressId}
     *
     * Fetch an address by its id.
     *
     */
    @GET
    @Path("/addresses/{addressId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses/{addressId}", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The address/geofence. The geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Address getOrganizationAddress(@QueryParam("access_token") @NotNull String accessToken, @PathParam("addressId") Long addressId);

    /**
     * /addresses
     *
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     *
     */
    @GET
    @Path("/addresses")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.", response = Address.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public List<Address> getOrganizationAddresses(@QueryParam("access_token") @NotNull String accessToken);

    /**
     * /contacts/{contact_id}
     *
     * Fetch a contact by its id.
     *
     */
    @GET
    @Path("/contacts/{contact_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/contacts/{contact_id}", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The contact.", response = Contact.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Contact getOrganizationContact(@QueryParam("access_token") @NotNull String accessToken, @PathParam("contact_id") Long contactId);

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     *
     * Fetch harsh event details for a vehicle.
     *
     */
    @GET
    @Path("/fleet/vehicles/{vehicleId}/safety/harsh_event")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event", tags={ "Fleet", "Safety",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Harsh event details.", response = VehicleHarshEventResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public VehicleHarshEventResponse getVehicleHarshEvent(@PathParam("vehicleId") Long vehicleId, @QueryParam("access_token") @NotNull String accessToken, @QueryParam("timestamp") @NotNull Long timestamp);

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     *
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     *
     */
    @GET
    @Path("/fleet/vehicles/{vehicle_id}/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/locations", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.", response = FleetVehicleLocations.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public FleetVehicleLocations getVehicleLocations(@QueryParam("access_token") @NotNull String accessToken, @PathParam("vehicle_id") Long vehicleId, @QueryParam("startMs") @NotNull Long startMs, @QueryParam("endMs") @NotNull Long endMs);

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     *
     * Fetch the safety score for the vehicle.
     *
     */
    @GET
    @Path("/fleet/vehicles/{vehicleId}/safety/score")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicleId:[0-9]+}/safety/score", tags={ "Fleet", "Safety",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Safety score details.", response = VehicleSafetyScoreResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public VehicleSafetyScoreResponse getVehicleSafetyScore(@PathParam("vehicleId") Long vehicleId, @QueryParam("access_token") @NotNull String accessToken, @QueryParam("startMs") @NotNull Long startMs, @QueryParam("endMs") @NotNull Long endMs);

    /**
     * /fleet/vehicles/stats
     *
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     *
     */
    @GET
    @Path("/fleet/vehicles/stats")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/stats", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns engine state and/or aux input data for all vehicles in the group between a start/end time.", response = InlineResponse2005.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public InlineResponse2005 getVehicleStats(@QueryParam("access_token") @NotNull String accessToken, @QueryParam("startMs") @NotNull Integer startMs, @QueryParam("endMs") @NotNull Integer endMs, @QueryParam("series") String series, @QueryParam("tagIds") String tagIds, @QueryParam("startingAfter") String startingAfter, @QueryParam("endingBefore") String endingBefore, @QueryParam("limit") Long limit);

    /**
     * /fleet/vehicles/locations
     *
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     *
     */
    @GET
    @Path("/fleet/vehicles/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/locations", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.", response = FleetVehiclesLocations.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public FleetVehiclesLocations getVehiclesLocations(@QueryParam("access_token") @NotNull String accessToken, @QueryParam("startMs") @NotNull Integer startMs, @QueryParam("endMs") @NotNull Integer endMs);

    /**
     * /contacts
     *
     * Fetch all contacts for the organization.
     *
     */
    @GET
    @Path("/contacts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/contacts", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of contacts.", response = Contact.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public List<Contact> listContacts(@QueryParam("access_token") @NotNull String accessToken);

    /**
     * /fleet/list
     *
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     *
     */
    @POST
    @Path("/fleet/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/list", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of vehicles and information about each.", response = InlineResponse2002.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public InlineResponse2002 listFleet(@QueryParam("access_token") @NotNull String accessToken, @Valid GroupParam groupParam, @QueryParam("startingAfter") String startingAfter, @QueryParam("endingBefore") String endingBefore, @QueryParam("limit") Long limit);

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     *
     */
    @PATCH
    @Path("/fleet/vehicles/{vehicle_id_or_external_id}")
    @Consumes({ "application/json", "application/merge-patch+json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated vehicle.", response = FleetVehicleResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public FleetVehicleResponse patchFleetVehicle(@QueryParam("access_token") @NotNull String accessToken, @PathParam("vehicle_id_or_external_id") String vehicleIdOrExternalId, @Valid Data data);

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     *
     * Reactivate the inactive driver having id.
     *
     */
    @PUT
    @Path("/fleet/drivers/inactive/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.", response = CurrentDriver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public CurrentDriver reactivateDriverById(@QueryParam("access_token") @NotNull String accessToken, @PathParam("driver_id_or_external_id") String driverIdOrExternalId, @Valid ReactivateDriverParam reactivateDriverParam);

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     *
     * Update a dispatch route and its associated jobs.
     *
     */
    @PUT
    @Path("/fleet/dispatch/routes/{route_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoute updateDispatchRouteById(@QueryParam("access_token") @NotNull String accessToken, @PathParam("route_id") Long routeId, @Valid DispatchRoute updateDispatchRouteParams);

    /**
     * /addresses/{addressId}
     *
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     *
     */
    @PATCH
    @Path("/addresses/{addressId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/addresses/{addressId}", tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Address was successfully updated. No response body is returned."),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public void updateOrganizationAddress(@QueryParam("access_token") @NotNull String accessToken, @Valid Address address, @PathParam("addressId") Long addressId);

    /**
     * /fleet/set_data
     *
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     *
     */
    @POST
    @Path("/fleet/set_data")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/set_data", tags={ "Fleet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Vehicles were successfully updated. No response body is returned."),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public void updateVehicles(@QueryParam("access_token") @NotNull String accessToken, @Valid VehicleUpdateParam vehicleUpdateParam);
}

