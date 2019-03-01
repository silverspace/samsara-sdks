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
import io.swagger.api.FleetApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/fleet")
@RequestScoped

@Api(description = "the fleet API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")

public class FleetApi  {

  @Context SecurityContext securityContext;

  @Inject FleetApiService delegate;


    @POST
    @Path("/add_address")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/add_address", notes = "This method adds an address book entry to the specified group.", response = Void.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Address was successfully added. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response addFleetAddress( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) AddressParam addressParam) {
        return delegate.addFleetAddress(accessToken, addressParam, securityContext);
    }

    @POST
    @Path("/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes", notes = "Create a new dispatch route.", response = DispatchRoute.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDispatchRoute( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) DispatchRouteCreate createDispatchRouteParams) {
        return delegate.createDispatchRoute(accessToken, createDispatchRouteParams, securityContext);
    }

    @POST
    @Path("/drivers/create")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/create", notes = "Create a new driver.", response = Driver.class, tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the successfully created the driver.", response = Driver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDriver( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "Driver creation body" ,required=true) DriverForCreate createDriverParam) {
        return delegate.createDriver(accessToken, createDriverParam, securityContext);
    }

    @POST
    @Path("/drivers/{driver_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", notes = "Create a new dispatch route for the driver with driver_id.", response = DispatchRoute.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDriverDispatchRoute( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the driver with the associated routes.",required=true) @PathParam("driver_id") Long driverId, @ApiParam(value = "" ,required=true) DispatchRouteCreate createDispatchRouteParams) {
        return delegate.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, securityContext);
    }

    @POST
    @Path("/drivers/{driver_id}/documents")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/documents", notes = "Create a driver document for the given driver.", response = Document.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the created document.", response = Document.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDriverDocument( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the driver for whom the document is created.",required=true) @PathParam("driver_id") Long driverId, @ApiParam(value = "To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_." ,required=true) DocumentCreate createDocumentParams) {
        return delegate.createDriverDocument(accessToken, driverId, createDocumentParams, securityContext);
    }

    @POST
    @Path("/maintenance/dvirs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/maintenance/dvirs", notes = "Create a new dvir, marking a vehicle or trailer safe or unsafe.", response = DvirBase.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Newly created DVIR.", response = DvirBase.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDvir( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "DVIR creation body" ,required=true) CreateDvirParam createDvirParam) {
        return delegate.createDvir(accessToken, createDvirParam, securityContext);
    }

    @POST
    @Path("/vehicles/{vehicle_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", notes = "Create a new dispatch route for the vehicle with vehicle_id.", response = DispatchRoute.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createVehicleDispatchRoute( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the vehicle with the associated routes.",required=true) @PathParam("vehicle_id") Long vehicleId, @ApiParam(value = "" ,required=true) DispatchRouteCreate createDispatchRouteParams) {
        return delegate.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, securityContext);
    }

    @DELETE
    @Path("/drivers/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Deactivate a driver with the given id.", response = Void.class, tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deactivateDriver( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathParam("driver_id_or_external_id") String driverIdOrExternalId) {
        return delegate.deactivateDriver(accessToken, driverIdOrExternalId, securityContext);
    }

    @DELETE
    @Path("/dispatch/routes/{route_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", notes = "Delete a dispatch route and its associated jobs.", response = Void.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deleted the dispatch route. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deleteDispatchRouteById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the dispatch route.",required=true) @PathParam("route_id") Long routeId) {
        return delegate.deleteDispatchRouteById(accessToken, routeId, securityContext);
    }

    @GET
    @Path("/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes", notes = "Fetch all of the dispatch routes for the group.", response = DispatchRoutes.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All dispatch route objects for the group.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response fetchAllDispatchRoutes( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @QueryParam("group_id") Long groupId,  @ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.")  @QueryParam("end_time") Long endTime,  @ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.")  @QueryParam("duration") Long duration) {
        return delegate.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, securityContext);
    }

    @GET
    @Path("/dispatch/routes/job_updates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/job_updates", notes = "Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID", response = AllRouteJobUpdates.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All job updates on routes.", response = AllRouteJobUpdates.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response fetchAllRouteJobUpdates( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @QueryParam("group_id") Long groupId,  @ApiParam(value = "Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.")  @QueryParam("sequence_id") String sequenceId,  @ApiParam(value = "Optionally set include=route to include route object in response payload.")  @QueryParam("include") String include) {
        return delegate.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, securityContext);
    }

    @GET
    @Path("/assets/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets/locations", notes = "Fetch current locations of all assets for the group.", response = InlineResponse2001.class, tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of assets and their current locations.", response = InlineResponse2001.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllAssetCurrentLocations( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @QueryParam("group_id") Long groupId) {
        return delegate.getAllAssetCurrentLocations(accessToken, groupId, securityContext);
    }

    @GET
    @Path("/assets")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets", notes = "Fetch all of the assets for the group.", response = InlineResponse200.class, tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of assets.", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllAssets( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @QueryParam("group_id") Long groupId) {
        return delegate.getAllAssets(accessToken, groupId, securityContext);
    }

    @GET
    @Path("/drivers/inactive")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/inactive", notes = "Fetch all deactivated drivers for the group.", response = Driver.class, responseContainer = "List", tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}", response = Driver.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllDeactivatedDrivers( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @QueryParam("group_id") Long groupId) {
        return delegate.getAllDeactivatedDrivers(accessToken, groupId, securityContext);
    }

    @GET
    @Path("/assets/{asset_id}/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets/{assetId:[0-9]+}/locations", notes = "Fetch the historical locations for the asset.", response = AssetLocationResponse.class, tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Asset location details.", response = AssetLocationResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAssetLocation( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the asset",required=true) @PathParam("asset_id") Long assetId,  @NotNull @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.",required=true)  @QueryParam("startMs") Long startMs,  @NotNull @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.",required=true)  @QueryParam("endMs") Long endMs) {
        return delegate.getAssetLocation(accessToken, assetId, startMs, endMs, securityContext);
    }

    @GET
    @Path("/assets/{asset_id}/reefer")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/assets/{assetId:[0-9]+}/reefer", notes = "Fetch the reefer-specific stats of an asset.", response = AssetReeferResponse.class, tags={ "Fleet", "Assets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Reefer-specific asset details.", response = AssetReeferResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAssetReefer( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the asset",required=true) @PathParam("asset_id") Long assetId,  @NotNull @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.",required=true)  @QueryParam("startMs") Long startMs,  @NotNull @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.",required=true)  @QueryParam("endMs") Long endMs) {
        return delegate.getAssetReefer(accessToken, assetId, startMs, endMs, securityContext);
    }

    @GET
    @Path("/drivers/inactive/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Fetch deactivated driver by id.", response = Driver.class, tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the deactivated driver with the given driver_id.", response = Driver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDeactivatedDriverById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathParam("driver_id_or_external_id") String driverIdOrExternalId) {
        return delegate.getDeactivatedDriverById(accessToken, driverIdOrExternalId, securityContext);
    }

    @GET
    @Path("/dispatch/routes/{route_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}", notes = "Fetch a dispatch route by id.", response = DispatchRoute.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The dispatch route corresponding to route_id.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRouteById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the dispatch route.",required=true) @PathParam("route_id") Long routeId) {
        return delegate.getDispatchRouteById(accessToken, routeId, securityContext);
    }

    @GET
    @Path("/dispatch/routes/{route_id}/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/history", notes = "Fetch the history of a dispatch route.", response = DispatchRouteHistory.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The historical route state changes between start_time and end_time.", response = DispatchRouteHistory.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRouteHistory( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the route with history.",required=true) @PathParam("route_id") Long routeId,  @ApiParam(value = "Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.")  @QueryParam("start_time") Long startTime,  @ApiParam(value = "Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.")  @QueryParam("end_time") Long endTime) {
        return delegate.getDispatchRouteHistory(accessToken, routeId, startTime, endTime, securityContext);
    }

    @GET
    @Path("/drivers/{driver_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", notes = "Fetch all of the dispatch routes for a given driver.", response = DispatchRoutes.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the dispatch routes for the given driver_id.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRoutesByDriverId( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the driver with the associated routes.",required=true) @PathParam("driver_id") Long driverId,  @ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.")  @QueryParam("end_time") Long endTime,  @ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.")  @QueryParam("duration") Long duration) {
        return delegate.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, securityContext);
    }

    @GET
    @Path("/vehicles/{vehicle_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", notes = "Fetch all of the dispatch routes for a given vehicle.", response = DispatchRoutes.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all of the dispatch routes for the given vehicle_id.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRoutesByVehicleId( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the vehicle with the associated routes.",required=true) @PathParam("vehicle_id") Long vehicleId,  @ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.")  @QueryParam("end_time") Long endTime,  @ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.")  @QueryParam("duration") Long duration) {
        return delegate.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, securityContext);
    }

    @GET
    @Path("/drivers/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Fetch driver by id.", response = CurrentDriver.class, tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the driver for the given driver_id.", response = CurrentDriver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathParam("driver_id_or_external_id") String driverIdOrExternalId) {
        return delegate.getDriverById(accessToken, driverIdOrExternalId, securityContext);
    }

    @GET
    @Path("/drivers/document_types")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/document_types", notes = "Fetch all of the document types.", response = DocumentTypes.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all of the document types.", response = DocumentTypes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverDocumentTypesByOrgId() {
        return delegate.getDriverDocumentTypesByOrgId(securityContext);
    }

    @GET
    @Path("/drivers/documents")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/documents", notes = "Fetch all of the documents.", response = Documents.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all of the documents.", response = Documents.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverDocumentsByOrgId( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @ApiParam(value = "Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.")  @QueryParam("endMs") Long endMs,  @ApiParam(value = "Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.")  @QueryParam("durationMs") Long durationMs) {
        return delegate.getDriverDocumentsByOrgId(accessToken, endMs, durationMs, securityContext);
    }

    @GET
    @Path("/drivers/{driverId}/safety/score")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driverId:[0-9]+}/safety/score", notes = "Fetch the safety score for the driver.", response = DriverSafetyScoreResponse.class, tags={ "Fleet", "Safety",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Safety score details.", response = DriverSafetyScoreResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverSafetyScore(@ApiParam(value = "ID of the driver",required=true) @PathParam("driverId") Long driverId,  @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @NotNull @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.",required=true)  @QueryParam("startMs") Long startMs,  @NotNull @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.",required=true)  @QueryParam("endMs") Long endMs) {
        return delegate.getDriverSafetyScore(driverId, accessToken, startMs, endMs, securityContext);
    }

    @GET
    @Path("/maintenance/dvirs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/maintenance/dvirs", notes = "Get DVIRs for the org within provided time constraints", response = DvirListResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "DVIRs for the specified duration.", response = DvirListResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDvirs( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @NotNull @ApiParam(value = "time in millis until the last dvir log.",required=true)  @QueryParam("end_ms") Integer endMs,  @NotNull @ApiParam(value = "time in millis which corresponds to the duration before the end_ms.",required=true)  @QueryParam("duration_ms") Integer durationMs,  @ApiParam(value = "Group ID to query.")  @QueryParam("group_id") Integer groupId) {
        return delegate.getDvirs(accessToken, endMs, durationMs, groupId, securityContext);
    }

    @POST
    @Path("/drivers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers", notes = "Get all the drivers for the specified group.", response = DriversResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All drivers in the group.", response = DriversResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetDrivers( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) GroupDriversParam groupDriversParam) {
        return delegate.getFleetDrivers(accessToken, groupDriversParam, securityContext);
    }

    @POST
    @Path("/drivers/{driver_id}/hos_daily_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs", notes = "Get summarized daily HOS charts for a specified driver.", response = DriverDailyLogResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Distance traveled and time active for each driver in the organization over the specified time period.", response = DriverDailyLogResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetDriversHosDailyLogs( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the driver with HOS logs.",required=true) @PathParam("driver_id") Long driverId, @ApiParam(value = "" ,required=true) HosLogsParam hosLogsParam) {
        return delegate.getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam, securityContext);
    }

    @POST
    @Path("/drivers/summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/summary", notes = "Get the distance and time each driver in an organization has driven in a given time period.", response = DriversSummaryResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Distance traveled and time active for each driver in the organization over the specified time period.", response = DriversSummaryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetDriversSummary( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "Org ID and time range to query." ,required=true) DriversSummaryParam driversSummaryParam,  @ApiParam(value = "Snap query result to HOS day boundaries.")  @QueryParam("snap_to_day_bounds") Boolean snapToDayBounds) {
        return delegate.getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds, securityContext);
    }

    @POST
    @Path("/hos_authentication_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/hos_authentication_logs", notes = "Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.", response = HosAuthenticationLogsResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "HOS authentication logs for the specified driver.", response = HosAuthenticationLogsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetHosAuthenticationLogs( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) HosAuthenticationLogsParam hosAuthenticationLogsParam) {
        return delegate.getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam, securityContext);
    }

    @POST
    @Path("/hos_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/hos_logs", notes = "Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.", response = HosLogsResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "HOS logs for the specified driver.", response = HosLogsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetHosLogs( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) HosLogsParam1 hosLogsParam) {
        return delegate.getFleetHosLogs(accessToken, hosLogsParam, securityContext);
    }

    @POST
    @Path("/hos_logs_summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/hos_logs_summary", notes = "Get the current HOS status for all drivers in the group.", response = HosLogsSummaryResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "HOS logs for the specified driver.", response = HosLogsSummaryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetHosLogsSummary( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) HosLogsParam2 hosLogsParam) {
        return delegate.getFleetHosLogsSummary(accessToken, hosLogsParam, securityContext);
    }

    @POST
    @Path("/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/locations", notes = "Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.", response = InlineResponse2003.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of vehicle objects containing their location and the time at which that location was logged.", response = InlineResponse2003.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetLocations( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "Group ID to query." ,required=true) GroupParam groupParam) {
        return delegate.getFleetLocations(accessToken, groupParam, securityContext);
    }

    @POST
    @Path("/maintenance/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/maintenance/list", notes = "Get list of the vehicles with any engine faults or check light data.", response = InlineResponse2004.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of vehicles and maintenance information about each.", response = InlineResponse2004.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetMaintenanceList( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "Group ID to query." ,required=true) GroupParam groupParam) {
        return delegate.getFleetMaintenanceList(accessToken, groupParam, securityContext);
    }

    @POST
    @Path("/trips")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/trips", notes = "Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.", response = TripResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of trips taken by the requested vehicle within the specified timeframe.", response = TripResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetTrips( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "Group ID, vehicle ID and time range to query." ,required=true) TripsParam tripsParam) {
        return delegate.getFleetTrips(accessToken, tripsParam, securityContext);
    }

    @GET
    @Path("/vehicles/{vehicle_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Gets a specific vehicle.", response = FleetVehicleResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The specified vehicle.", response = FleetVehicleResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetVehicle( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.",required=true) @PathParam("vehicle_id_or_external_id") String vehicleIdOrExternalId) {
        return delegate.getFleetVehicle(accessToken, vehicleIdOrExternalId, securityContext);
    }

    @GET
    @Path("/vehicles/{vehicleId}/safety/harsh_event")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event", notes = "Fetch harsh event details for a vehicle.", response = VehicleHarshEventResponse.class, tags={ "Fleet", "Safety",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Harsh event details.", response = VehicleHarshEventResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleHarshEvent(@ApiParam(value = "ID of the vehicle",required=true) @PathParam("vehicleId") Long vehicleId,  @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @NotNull @ApiParam(value = "Timestamp in milliseconds representing the timestamp of a harsh event.",required=true)  @QueryParam("timestamp") Long timestamp) {
        return delegate.getVehicleHarshEvent(vehicleId, accessToken, timestamp, securityContext);
    }

    @GET
    @Path("/vehicles/{vehicle_id}/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/locations", notes = "Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.", response = FleetVehicleLocations.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.", response = FleetVehicleLocations.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleLocations( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the vehicle with the associated routes.",required=true) @PathParam("vehicle_id") Long vehicleId,  @NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)",required=true)  @QueryParam("startMs") Long startMs,  @NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)",required=true)  @QueryParam("endMs") Long endMs) {
        return delegate.getVehicleLocations(accessToken, vehicleId, startMs, endMs, securityContext);
    }

    @GET
    @Path("/vehicles/{vehicleId}/safety/score")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicleId:[0-9]+}/safety/score", notes = "Fetch the safety score for the vehicle.", response = VehicleSafetyScoreResponse.class, tags={ "Fleet", "Safety",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Safety score details.", response = VehicleSafetyScoreResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleSafetyScore(@ApiParam(value = "ID of the vehicle",required=true) @PathParam("vehicleId") Long vehicleId,  @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @NotNull @ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.",required=true)  @QueryParam("startMs") Long startMs,  @NotNull @ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.",required=true)  @QueryParam("endMs") Long endMs) {
        return delegate.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, securityContext);
    }

    @GET
    @Path("/vehicles/stats")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/stats", notes = "Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.", response = InlineResponse2005.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns engine state and/or aux input data for all vehicles in the group between a start/end time.", response = InlineResponse2005.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleStats( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the start of the query.",required=true)  @QueryParam("startMs") Integer startMs,  @NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the end of the query.",required=true)  @QueryParam("endMs") Integer endMs,  @ApiParam(value = "Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2", allowableValues="engineState, auxInput1, auxInput2")  @QueryParam("series") String series,  @ApiParam(value = "Comma-separated list of tag ids. Example: tagIds=1,2,3")  @QueryParam("tagIds") String tagIds,  @ApiParam(value = "Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.")  @QueryParam("startingAfter") String startingAfter,  @ApiParam(value = "Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.")  @QueryParam("endingBefore") String endingBefore,  @ApiParam(value = "Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.")  @QueryParam("limit") Long limit) {
        return delegate.getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, securityContext);
    }

    @GET
    @Path("/vehicles/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/locations", notes = "Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.", response = FleetVehiclesLocations.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.", response = FleetVehiclesLocations.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehiclesLocations( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)",required=true)  @QueryParam("startMs") Integer startMs,  @NotNull @ApiParam(value = "Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)",required=true)  @QueryParam("endMs") Integer endMs) {
        return delegate.getVehiclesLocations(accessToken, startMs, endMs, securityContext);
    }

    @POST
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/list", notes = "Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.", response = InlineResponse2002.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of vehicles and information about each.", response = InlineResponse2002.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response listFleet( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "Group ID to query." ,required=true) GroupParam groupParam,  @ApiParam(value = "Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.")  @QueryParam("startingAfter") String startingAfter,  @ApiParam(value = "Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.")  @QueryParam("endingBefore") String endingBefore,  @ApiParam(value = "Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.")  @QueryParam("limit") Long limit) {
        return delegate.listFleet(accessToken, groupParam, startingAfter, endingBefore, limit, securityContext);
    }

    @PATCH
    @Path("/vehicles/{vehicle_id_or_external_id}")
    @Consumes({ "application/json", "application/merge-patch+json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.", response = FleetVehicleResponse.class, tags={ "Fleet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated vehicle.", response = FleetVehicleResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response patchFleetVehicle( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.",required=true) @PathParam("vehicle_id_or_external_id") String vehicleIdOrExternalId, @ApiParam(value = "" ,required=true) Data data) {
        return delegate.patchFleetVehicle(accessToken, vehicleIdOrExternalId, data, securityContext);
    }

    @PUT
    @Path("/drivers/inactive/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Reactivate the inactive driver having id.", response = CurrentDriver.class, tags={ "Fleet", "Drivers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.", response = CurrentDriver.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response reactivateDriverById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathParam("driver_id_or_external_id") String driverIdOrExternalId, @ApiParam(value = "Driver reactivation body" ,required=true) ReactivateDriverParam reactivateDriverParam) {
        return delegate.reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, securityContext);
    }

    @PUT
    @Path("/dispatch/routes/{route_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", notes = "Update a dispatch route and its associated jobs.", response = DispatchRoute.class, tags={ "Fleet", "Routes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response updateDispatchRouteById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the dispatch route.",required=true) @PathParam("route_id") Long routeId, @ApiParam(value = "" ,required=true) DispatchRoute updateDispatchRouteParams) {
        return delegate.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, securityContext);
    }

    @POST
    @Path("/set_data")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/fleet/set_data", notes = "This method enables the mutation of metadata for vehicles in the Samsara Cloud.", response = Void.class, tags={ "Fleet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Vehicles were successfully updated. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response updateVehicles( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) VehicleUpdateParam vehicleUpdateParam) {
        return delegate.updateVehicles(accessToken, vehicleUpdateParam, securityContext);
    }
}
