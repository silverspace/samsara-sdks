package io.swagger.api;

import io.swagger.model.AddressParam;
import io.swagger.model.AllRouteJobUpdates;
import io.swagger.model.AssetLocationResponse;
import io.swagger.model.AssetReeferResponse;
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

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/fleet")
@Api(description = "the fleet API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-01T04:20:18.722Z")
public class FleetApi {

    @POST
    @Path("/add_address")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/add_address", notes = "This method adds an address book entry to the specified group.", response = Void.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Address was successfully added. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response addFleetAddress(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid AddressParam addressParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes", notes = "Create a new dispatch route.", response = DispatchRoute.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response createDispatchRoute(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid DispatchRouteCreate createDispatchRouteParams) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/drivers/create")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/create", notes = "Create a new driver.", response = Driver.class, tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the successfully created the driver.", response = Driver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response createDriver(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid DriverForCreate createDriverParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/drivers/{driver_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", notes = "Create a new dispatch route for the driver with driver_id.", response = DispatchRoute.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response createDriverDispatchRoute(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("driver_id") @ApiParam("ID of the driver with the associated routes.") Long driverId,@Valid DispatchRouteCreate createDispatchRouteParams) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/drivers/{driver_id}/documents")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/documents", notes = "Create a driver document for the given driver.", response = Document.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the created document.", response = Document.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response createDriverDocument(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("driver_id") @ApiParam("ID of the driver for whom the document is created.") Long driverId,@Valid DocumentCreate createDocumentParams) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/maintenance/dvirs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/maintenance/dvirs", notes = "Create a new dvir, marking a vehicle or trailer safe or unsafe.", response = DvirBase.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Newly created DVIR.", response = DvirBase.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response createDvir(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid CreateDvirParam createDvirParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/vehicles/{vehicle_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", notes = "Create a new dispatch route for the vehicle with vehicle_id.", response = DispatchRoute.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response createVehicleDispatchRoute(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("vehicle_id") @ApiParam("ID of the vehicle with the associated routes.") Long vehicleId,@Valid DispatchRouteCreate createDispatchRouteParams) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/drivers/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Deactivate a driver with the given id.", response = Void.class, tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response deactivateDriver(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("driver_id_or_external_id") @ApiParam("ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.") String driverIdOrExternalId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/dispatch/routes/{route_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", notes = "Delete a dispatch route and its associated jobs.", response = Void.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deleted the dispatch route. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response deleteDispatchRouteById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("route_id") @ApiParam("ID of the dispatch route.") Long routeId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes", notes = "Fetch all of the dispatch routes for the group.", response = DispatchRoutes.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All dispatch route objects for the group.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response fetchAllDispatchRoutes(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("group_id")   @ApiParam("Optional group ID if the organization has multiple groups (uncommon).")  Long groupId,@QueryParam("end_time")   @ApiParam("Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.")  Long endTime,@QueryParam("duration")   @ApiParam("Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.")  Long duration) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/dispatch/routes/job_updates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/job_updates", notes = "Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID", response = AllRouteJobUpdates.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All job updates on routes.", response = AllRouteJobUpdates.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response fetchAllRouteJobUpdates(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("group_id")   @ApiParam("Optional group ID if the organization has multiple groups (uncommon).")  Long groupId,@QueryParam("sequence_id")   @ApiParam("Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.")  String sequenceId,@QueryParam("include")   @ApiParam("Optionally set include&#x3D;route to include route object in response payload.")  String include) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/assets/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets/locations", notes = "Fetch current locations of all assets for the group.", response = InlineResponse2001.class, tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of assets and their current locations.", response = InlineResponse2001.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getAllAssetCurrentLocations(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("group_id")   @ApiParam("Optional group ID if the organization has multiple groups (uncommon).")  Long groupId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/assets")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets", notes = "Fetch all of the assets for the group.", response = InlineResponse200.class, tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of assets.", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getAllAssets(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("group_id")   @ApiParam("Optional group ID if the organization has multiple groups (uncommon).")  Long groupId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/drivers/inactive")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/inactive", notes = "Fetch all deactivated drivers for the group.", response = Driver.class, responseContainer = "List", tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}", response = Driver.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getAllDeactivatedDrivers(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("group_id")   @ApiParam("Optional group ID if the organization has multiple groups (uncommon).")  Long groupId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/assets/{asset_id}/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets/{assetId:[0-9]+}/locations", notes = "Fetch the historical locations for the asset.", response = AssetLocationResponse.class, tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Asset location details.", response = AssetLocationResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getAssetLocation(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("asset_id") @ApiParam("ID of the asset") Long assetId,@QueryParam("startMs") @NotNull   @ApiParam("Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.")  Long startMs,@QueryParam("endMs") @NotNull   @ApiParam("Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.")  Long endMs) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/assets/{asset_id}/reefer")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets/{assetId:[0-9]+}/reefer", notes = "Fetch the reefer-specific stats of an asset.", response = AssetReeferResponse.class, tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Reefer-specific asset details.", response = AssetReeferResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getAssetReefer(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("asset_id") @ApiParam("ID of the asset") Long assetId,@QueryParam("startMs") @NotNull   @ApiParam("Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.")  Long startMs,@QueryParam("endMs") @NotNull   @ApiParam("Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.")  Long endMs) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/drivers/inactive/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Fetch deactivated driver by id.", response = Driver.class, tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the deactivated driver with the given driver_id.", response = Driver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getDeactivatedDriverById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("driver_id_or_external_id") @ApiParam("ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.") String driverIdOrExternalId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/dispatch/routes/{route_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}", notes = "Fetch a dispatch route by id.", response = DispatchRoute.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The dispatch route corresponding to route_id.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getDispatchRouteById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("route_id") @ApiParam("ID of the dispatch route.") Long routeId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/dispatch/routes/{route_id}/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/history", notes = "Fetch the history of a dispatch route.", response = DispatchRouteHistory.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The historical route state changes between start_time and end_time.", response = DispatchRouteHistory.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getDispatchRouteHistory(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("route_id") @ApiParam("ID of the route with history.") Long routeId,@QueryParam("start_time")   @ApiParam("Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.")  Long startTime,@QueryParam("end_time")   @ApiParam("Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.")  Long endTime) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/drivers/{driver_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", notes = "Fetch all of the dispatch routes for a given driver.", response = DispatchRoutes.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the dispatch routes for the given driver_id.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getDispatchRoutesByDriverId(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("driver_id") @ApiParam("ID of the driver with the associated routes.") Long driverId,@QueryParam("end_time")   @ApiParam("Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.")  Long endTime,@QueryParam("duration")   @ApiParam("Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.")  Long duration) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/vehicles/{vehicle_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", notes = "Fetch all of the dispatch routes for a given vehicle.", response = DispatchRoutes.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all of the dispatch routes for the given vehicle_id.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getDispatchRoutesByVehicleId(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("vehicle_id") @ApiParam("ID of the vehicle with the associated routes.") Long vehicleId,@QueryParam("end_time")   @ApiParam("Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.")  Long endTime,@QueryParam("duration")   @ApiParam("Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.")  Long duration) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/drivers/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Fetch driver by id.", response = CurrentDriver.class, tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the driver for the given driver_id.", response = CurrentDriver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getDriverById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("driver_id_or_external_id") @ApiParam("ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.") String driverIdOrExternalId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/drivers/document_types")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/document_types", notes = "Fetch all of the document types.", response = DocumentTypes.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all of the document types.", response = DocumentTypes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getDriverDocumentTypesByOrgId() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/drivers/documents")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/documents", notes = "Fetch all of the documents.", response = Documents.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all of the documents.", response = Documents.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getDriverDocumentsByOrgId(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("endMs")   @ApiParam("Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.")  Long endMs,@QueryParam("durationMs")   @ApiParam("Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.")  Long durationMs) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/drivers/{driverId}/safety/score")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driverId:[0-9]+}/safety/score", notes = "Fetch the safety score for the driver.", response = DriverSafetyScoreResponse.class, tags={ "Fleet", "Safety",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Safety score details.", response = DriverSafetyScoreResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getDriverSafetyScore(@PathParam("driverId") @ApiParam("ID of the driver") Long driverId,@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("startMs") @NotNull   @ApiParam("Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.")  Long startMs,@QueryParam("endMs") @NotNull   @ApiParam("Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.")  Long endMs) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/maintenance/dvirs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/maintenance/dvirs", notes = "Get DVIRs for the org within provided time constraints", response = DvirListResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "DVIRs for the specified duration.", response = DvirListResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getDvirs(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("end_ms") @NotNull   @ApiParam("time in millis until the last dvir log.")  Integer endMs,@QueryParam("duration_ms") @NotNull   @ApiParam("time in millis which corresponds to the duration before the end_ms.")  Integer durationMs,@QueryParam("group_id")   @ApiParam("Group ID to query.")  Integer groupId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/drivers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers", notes = "Get all the drivers for the specified group.", response = DriversResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All drivers in the group.", response = DriversResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getFleetDrivers(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid GroupDriversParam groupDriversParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/drivers/{driver_id}/hos_daily_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs", notes = "Get summarized daily HOS charts for a specified driver.", response = DriverDailyLogResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Distance traveled and time active for each driver in the organization over the specified time period.", response = DriverDailyLogResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getFleetDriversHosDailyLogs(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("driver_id") @ApiParam("ID of the driver with HOS logs.") Long driverId,@Valid HosLogsParam hosLogsParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/drivers/summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/summary", notes = "Get the distance and time each driver in an organization has driven in a given time period.", response = DriversSummaryResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Distance traveled and time active for each driver in the organization over the specified time period.", response = DriversSummaryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getFleetDriversSummary(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid DriversSummaryParam driversSummaryParam,@QueryParam("snap_to_day_bounds")   @ApiParam("Snap query result to HOS day boundaries.")  Boolean snapToDayBounds) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/hos_authentication_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/hos_authentication_logs", notes = "Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.", response = HosAuthenticationLogsResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "HOS authentication logs for the specified driver.", response = HosAuthenticationLogsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getFleetHosAuthenticationLogs(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid HosAuthenticationLogsParam hosAuthenticationLogsParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/hos_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/hos_logs", notes = "Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.", response = HosLogsResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "HOS logs for the specified driver.", response = HosLogsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getFleetHosLogs(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid HosLogsParam1 hosLogsParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/hos_logs_summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/hos_logs_summary", notes = "Get the current HOS status for all drivers in the group.", response = HosLogsSummaryResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "HOS logs for the specified driver.", response = HosLogsSummaryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getFleetHosLogsSummary(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid HosLogsParam2 hosLogsParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/locations", notes = "Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.", response = InlineResponse2003.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of vehicle objects containing their location and the time at which that location was logged.", response = InlineResponse2003.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getFleetLocations(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid GroupParam groupParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/maintenance/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/maintenance/list", notes = "Get list of the vehicles with any engine faults or check light data.", response = InlineResponse2004.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of vehicles and maintenance information about each.", response = InlineResponse2004.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getFleetMaintenanceList(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid GroupParam groupParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/trips")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/trips", notes = "Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.", response = TripResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of trips taken by the requested vehicle within the specified timeframe.", response = TripResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getFleetTrips(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid TripsParam tripsParam) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/vehicles/{vehicle_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Gets a specific vehicle.", response = FleetVehicleResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The specified vehicle.", response = FleetVehicleResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getFleetVehicle(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("vehicle_id_or_external_id") @ApiParam("ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.") String vehicleIdOrExternalId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/vehicles/{vehicleId}/safety/harsh_event")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event", notes = "Fetch harsh event details for a vehicle.", response = VehicleHarshEventResponse.class, tags={ "Fleet", "Safety",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Harsh event details.", response = VehicleHarshEventResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getVehicleHarshEvent(@PathParam("vehicleId") @ApiParam("ID of the vehicle") Long vehicleId,@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("timestamp") @NotNull   @ApiParam("Timestamp in milliseconds representing the timestamp of a harsh event.")  Long timestamp) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/vehicles/{vehicle_id}/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/locations", notes = "Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.", response = FleetVehicleLocations.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.", response = FleetVehicleLocations.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getVehicleLocations(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("vehicle_id") @ApiParam("ID of the vehicle with the associated routes.") Long vehicleId,@QueryParam("startMs") @NotNull   @ApiParam("Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)")  Long startMs,@QueryParam("endMs") @NotNull   @ApiParam("Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)")  Long endMs) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/vehicles/{vehicleId}/safety/score")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicleId:[0-9]+}/safety/score", notes = "Fetch the safety score for the vehicle.", response = VehicleSafetyScoreResponse.class, tags={ "Fleet", "Safety",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Safety score details.", response = VehicleSafetyScoreResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getVehicleSafetyScore(@PathParam("vehicleId") @ApiParam("ID of the vehicle") Long vehicleId,@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("startMs") @NotNull   @ApiParam("Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.")  Long startMs,@QueryParam("endMs") @NotNull   @ApiParam("Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.")  Long endMs) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/vehicles/stats")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/stats", notes = "Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.", response = InlineResponse2005.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns engine state and/or aux input data for all vehicles in the group between a start/end time.", response = InlineResponse2005.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getVehicleStats(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("startMs") @NotNull   @ApiParam("Time in Unix epoch milliseconds for the start of the query.")  Integer startMs,@QueryParam("endMs") @NotNull   @ApiParam("Time in Unix epoch milliseconds for the end of the query.")  Integer endMs,@QueryParam("series")   @ApiParam("Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2")  String series,@QueryParam("tagIds")   @ApiParam("Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3")  String tagIds,@QueryParam("startingAfter")   @ApiParam("Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.")  String startingAfter,@QueryParam("endingBefore")   @ApiParam("Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.")  String endingBefore,@QueryParam("limit")   @ApiParam("Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.")  Long limit) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/vehicles/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/locations", notes = "Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.", response = FleetVehiclesLocations.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.", response = FleetVehiclesLocations.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getVehiclesLocations(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("startMs") @NotNull   @ApiParam("Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)")  Integer startMs,@QueryParam("endMs") @NotNull   @ApiParam("Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)")  Integer endMs) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/list", notes = "Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.", response = InlineResponse2002.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of vehicles and information about each.", response = InlineResponse2002.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response listFleet(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid GroupParam groupParam,@QueryParam("startingAfter")   @ApiParam("Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.")  String startingAfter,@QueryParam("endingBefore")   @ApiParam("Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.")  String endingBefore,@QueryParam("limit")   @ApiParam("Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.")  Long limit) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/vehicles/{vehicle_id_or_external_id}")
    @Consumes({ "application/json", "application/merge-patch+json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.", response = FleetVehicleResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated vehicle.", response = FleetVehicleResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response patchFleetVehicle(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("vehicle_id_or_external_id") @ApiParam("ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.") String vehicleIdOrExternalId,@Valid Data data) {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/drivers/inactive/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Reactivate the inactive driver having id.", response = CurrentDriver.class, tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.", response = CurrentDriver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response reactivateDriverById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("driver_id_or_external_id") @ApiParam("ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.") String driverIdOrExternalId,@Valid ReactivateDriverParam reactivateDriverParam) {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/dispatch/routes/{route_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", notes = "Update a dispatch route and its associated jobs.", response = DispatchRoute.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response updateDispatchRouteById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("route_id") @ApiParam("ID of the dispatch route.") Long routeId,@Valid DispatchRoute updateDispatchRouteParams) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/set_data")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/set_data", notes = "This method enables the mutation of metadata for vehicles in the Samsara Cloud.", response = Void.class, tags={ "Fleet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Vehicles were successfully updated. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response updateVehicles(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid VehicleUpdateParam vehicleUpdateParam) {
        return Response.ok().entity("magic!").build();
    }
}
