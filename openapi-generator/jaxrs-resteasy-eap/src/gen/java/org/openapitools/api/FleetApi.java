package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AllRouteJobUpdates;
import org.openapitools.model.AssetReeferResponse;
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

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/fleet")


@io.swagger.annotations.Api(description = "the fleet API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public interface FleetApi  {
   
    @POST
    @Path("/add_address")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/add_address", notes = "This method adds an address book entry to the specified group.", response = Void.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Address was successfully added. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response addFleetAddress( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject2 addressParam,@Context SecurityContext securityContext);
    @POST
    @Path("/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes", notes = "Create a new dispatch route.", response = DispatchRoute.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDispatchRoute( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid DispatchRouteCreate createDispatchRouteParams,@Context SecurityContext securityContext);
    @POST
    @Path("/drivers/create")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/create", notes = "Create a new driver.", response = Driver.class, tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the successfully created the driver.", response = Driver.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDriver( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "Driver creation body" ,required=true) @NotNull @Valid DriverForCreate createDriverParam,@Context SecurityContext securityContext);
    @POST
    @Path("/drivers/{driver_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", notes = "Create a new dispatch route for the driver with driver_id.", response = DispatchRoute.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDriverDispatchRoute( @NotNull @QueryParam("access_token") String accessToken, @PathParam("driver_id") Long driverId,@ApiParam(value = "" ,required=true) @NotNull @Valid DispatchRouteCreate createDispatchRouteParams,@Context SecurityContext securityContext);
    @POST
    @Path("/drivers/{driver_id}/documents")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/documents", notes = "Create a driver document for the given driver.", response = Document.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the created document.", response = Document.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDriverDocument( @NotNull @QueryParam("access_token") String accessToken, @PathParam("driver_id") Long driverId,@ApiParam(value = "To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_." ,required=true) @NotNull @Valid DocumentCreate createDocumentParams,@Context SecurityContext securityContext);
    @POST
    @Path("/maintenance/dvirs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/maintenance/dvirs", notes = "Create a new dvir, marking a vehicle or trailer safe or unsafe.", response = DvirBase.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Newly created DVIR.", response = DvirBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDvir( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject12 createDvirParam,@Context SecurityContext securityContext);
    @POST
    @Path("/vehicles/{vehicle_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", notes = "Create a new dispatch route for the vehicle with vehicle_id.", response = DispatchRoute.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createVehicleDispatchRoute( @NotNull @QueryParam("access_token") String accessToken, @PathParam("vehicle_id") Long vehicleId,@ApiParam(value = "" ,required=true) @NotNull @Valid DispatchRouteCreate createDispatchRouteParams,@Context SecurityContext securityContext);
    @DELETE
    @Path("/drivers/{driver_id_or_external_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Deactivate a driver with the given id.", response = Void.class, tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deactivateDriver( @NotNull @QueryParam("access_token") String accessToken, @PathParam("driver_id_or_external_id") String driverIdOrExternalId,@Context SecurityContext securityContext);
    @DELETE
    @Path("/dispatch/routes/{route_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", notes = "Delete a dispatch route and its associated jobs.", response = Void.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully deleted the dispatch route. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deleteDispatchRouteById( @NotNull @QueryParam("access_token") String accessToken, @PathParam("route_id") Long routeId,@Context SecurityContext securityContext);
    @GET
    @Path("/dispatch/routes")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes", notes = "Fetch all of the dispatch routes for the group.", response = DispatchRoute.class, responseContainer = "List", tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "All dispatch route objects for the group.", response = DispatchRoute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response fetchAllDispatchRoutes( @NotNull @QueryParam("access_token") String accessToken, @QueryParam("group_id") Long groupId, @QueryParam("end_time") Long endTime, @QueryParam("duration") Long duration,@Context SecurityContext securityContext);
    @GET
    @Path("/dispatch/routes/job_updates")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes/job_updates", notes = "Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID", response = AllRouteJobUpdates.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "All job updates on routes.", response = AllRouteJobUpdates.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response fetchAllRouteJobUpdates( @NotNull @QueryParam("access_token") String accessToken, @QueryParam("group_id") Long groupId, @QueryParam("sequence_id") String sequenceId, @QueryParam("include") String include,@Context SecurityContext securityContext);
    @GET
    @Path("/assets/locations")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/assets/locations", notes = "Fetch current locations of all assets for the group.", response = InlineResponse2001.class, tags={ "Fleet","Assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of assets and their current locations.", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllAssetCurrentLocations( @NotNull @QueryParam("access_token") String accessToken, @QueryParam("group_id") Long groupId,@Context SecurityContext securityContext);
    @GET
    @Path("/assets")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/assets", notes = "Fetch all of the assets for the group.", response = InlineResponse200.class, tags={ "Fleet","Assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of assets.", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllAssets( @NotNull @QueryParam("access_token") String accessToken, @QueryParam("group_id") Long groupId,@Context SecurityContext securityContext);
    @GET
    @Path("/drivers/inactive")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/inactive", notes = "Fetch all deactivated drivers for the group.", response = Driver.class, responseContainer = "List", tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}", response = Driver.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllDeactivatedDrivers( @NotNull @QueryParam("access_token") String accessToken, @QueryParam("group_id") Long groupId,@Context SecurityContext securityContext);
    @GET
    @Path("/assets/{asset_id}/locations")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/assets/{assetId:[0-9]+}/locations", notes = "Fetch the historical locations for the asset.", response = Object.class, responseContainer = "List", tags={ "Fleet","Assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Asset location details.", response = Object.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAssetLocation( @NotNull @QueryParam("access_token") String accessToken, @PathParam("asset_id") Long assetId, @NotNull @QueryParam("startMs") Long startMs, @NotNull @QueryParam("endMs") Long endMs,@Context SecurityContext securityContext);
    @GET
    @Path("/assets/{asset_id}/reefer")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/assets/{assetId:[0-9]+}/reefer", notes = "Fetch the reefer-specific stats of an asset.", response = AssetReeferResponse.class, tags={ "Fleet","Assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Reefer-specific asset details.", response = AssetReeferResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAssetReefer( @NotNull @QueryParam("access_token") String accessToken, @PathParam("asset_id") Long assetId, @NotNull @QueryParam("startMs") Long startMs, @NotNull @QueryParam("endMs") Long endMs,@Context SecurityContext securityContext);
    @GET
    @Path("/drivers/inactive/{driver_id_or_external_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Fetch deactivated driver by id.", response = Driver.class, tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the deactivated driver with the given driver_id.", response = Driver.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDeactivatedDriverById( @NotNull @QueryParam("access_token") String accessToken, @PathParam("driver_id_or_external_id") String driverIdOrExternalId,@Context SecurityContext securityContext);
    @GET
    @Path("/dispatch/routes/{route_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}", notes = "Fetch a dispatch route by id.", response = DispatchRoute.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The dispatch route corresponding to route_id.", response = DispatchRoute.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRouteById( @NotNull @QueryParam("access_token") String accessToken, @PathParam("route_id") Long routeId,@Context SecurityContext securityContext);
    @GET
    @Path("/dispatch/routes/{route_id}/history")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/history", notes = "Fetch the history of a dispatch route.", response = DispatchRouteHistory.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The historical route state changes between start_time and end_time.", response = DispatchRouteHistory.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRouteHistory( @NotNull @QueryParam("access_token") String accessToken, @PathParam("route_id") Long routeId, @QueryParam("start_time") Long startTime, @QueryParam("end_time") Long endTime,@Context SecurityContext securityContext);
    @GET
    @Path("/drivers/{driver_id}/dispatch/routes")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", notes = "Fetch all of the dispatch routes for a given driver.", response = DispatchRoute.class, responseContainer = "List", tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the dispatch routes for the given driver_id.", response = DispatchRoute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRoutesByDriverId( @NotNull @QueryParam("access_token") String accessToken, @PathParam("driver_id") Long driverId, @QueryParam("end_time") Long endTime, @QueryParam("duration") Long duration,@Context SecurityContext securityContext);
    @GET
    @Path("/vehicles/{vehicle_id}/dispatch/routes")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", notes = "Fetch all of the dispatch routes for a given vehicle.", response = DispatchRoute.class, responseContainer = "List", tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns all of the dispatch routes for the given vehicle_id.", response = DispatchRoute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRoutesByVehicleId( @NotNull @QueryParam("access_token") String accessToken, @PathParam("vehicle_id") Long vehicleId, @QueryParam("end_time") Long endTime, @QueryParam("duration") Long duration,@Context SecurityContext securityContext);
    @GET
    @Path("/drivers/{driver_id_or_external_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Fetch driver by id.", response = Driver.class, tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the driver for the given driver_id.", response = Driver.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverById( @NotNull @QueryParam("access_token") String accessToken, @PathParam("driver_id_or_external_id") String driverIdOrExternalId,@Context SecurityContext securityContext);
    @GET
    @Path("/drivers/document_types")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/document_types", notes = "Fetch all of the document types.", response = DocumentType.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns all of the document types.", response = DocumentType.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverDocumentTypesByOrgId(@Context SecurityContext securityContext);
    @GET
    @Path("/drivers/documents")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/documents", notes = "Fetch all of the documents.", response = Document.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns all of the documents.", response = Document.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverDocumentsByOrgId( @NotNull @QueryParam("access_token") String accessToken, @QueryParam("endMs") Long endMs, @QueryParam("durationMs") Long durationMs,@Context SecurityContext securityContext);
    @GET
    @Path("/drivers/{driverId}/safety/score")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driverId:[0-9]+}/safety/score", notes = "Fetch the safety score for the driver.", response = DriverSafetyScoreResponse.class, tags={ "Fleet","Safety", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Safety score details.", response = DriverSafetyScoreResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverSafetyScore( @PathParam("driverId") Long driverId, @NotNull @QueryParam("access_token") String accessToken, @NotNull @QueryParam("startMs") Long startMs, @NotNull @QueryParam("endMs") Long endMs,@Context SecurityContext securityContext);
    @GET
    @Path("/maintenance/dvirs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/maintenance/dvirs", notes = "Get DVIRs for the org within provided time constraints", response = DvirListResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "DVIRs for the specified duration.", response = DvirListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDvirs( @NotNull @QueryParam("access_token") String accessToken, @NotNull @QueryParam("end_ms") Integer endMs, @NotNull @QueryParam("duration_ms") Integer durationMs, @QueryParam("group_id") Integer groupId,@Context SecurityContext securityContext);
    @POST
    @Path("/drivers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers", notes = "Get all the drivers for the specified group.", response = DriversResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "All drivers in the group.", response = DriversResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetDrivers( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject3 groupDriversParam,@Context SecurityContext securityContext);
    @POST
    @Path("/drivers/{driver_id}/hos_daily_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs", notes = "Get summarized daily HOS charts for a specified driver.", response = DriverDailyLogResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Distance traveled and time active for each driver in the organization over the specified time period.", response = DriverDailyLogResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetDriversHosDailyLogs( @NotNull @QueryParam("access_token") String accessToken, @PathParam("driver_id") Long driverId,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject6 hosLogsParam,@Context SecurityContext securityContext);
    @POST
    @Path("/drivers/summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/summary", notes = "Get the distance and time each driver in an organization has driven in a given time period.", response = DriversSummaryResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Distance traveled and time active for each driver in the organization over the specified time period.", response = DriversSummaryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetDriversSummary( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject5 driversSummaryParam, @QueryParam("snap_to_day_bounds") Boolean snapToDayBounds,@Context SecurityContext securityContext);
    @POST
    @Path("/hos_authentication_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/hos_authentication_logs", notes = "Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.", response = HosAuthenticationLogsResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "HOS authentication logs for the specified driver.", response = HosAuthenticationLogsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetHosAuthenticationLogs( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject7 hosAuthenticationLogsParam,@Context SecurityContext securityContext);
    @POST
    @Path("/hos_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/hos_logs", notes = "Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.", response = HosLogsResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "HOS logs for the specified driver.", response = HosLogsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetHosLogs( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject8 hosLogsParam,@Context SecurityContext securityContext);
    @POST
    @Path("/hos_logs_summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/hos_logs_summary", notes = "Get the current HOS status for all drivers in the group.", response = HosLogsSummaryResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "HOS logs for the specified driver.", response = HosLogsSummaryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetHosLogsSummary( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject9 hosLogsParam,@Context SecurityContext securityContext);
    @POST
    @Path("/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/locations", notes = "Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.", response = InlineResponse2003.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of vehicle objects containing their location and the time at which that location was logged.", response = InlineResponse2003.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetLocations( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject11 groupParam,@Context SecurityContext securityContext);
    @POST
    @Path("/maintenance/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/maintenance/list", notes = "Get list of the vehicles with any engine faults or check light data.", response = InlineResponse2004.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of vehicles and maintenance information about each.", response = InlineResponse2004.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetMaintenanceList( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject13 groupParam,@Context SecurityContext securityContext);
    @POST
    @Path("/trips")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/trips", notes = "Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.", response = TripResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of trips taken by the requested vehicle within the specified timeframe.", response = TripResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetTrips( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject15 tripsParam,@Context SecurityContext securityContext);
    @GET
    @Path("/vehicles/{vehicle_id_or_external_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Gets a specific vehicle.", response = FleetVehicleResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The specified vehicle.", response = FleetVehicleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetVehicle( @NotNull @QueryParam("access_token") String accessToken, @PathParam("vehicle_id_or_external_id") String vehicleIdOrExternalId,@Context SecurityContext securityContext);
    @GET
    @Path("/vehicles/{vehicleId}/safety/harsh_event")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event", notes = "Fetch harsh event details for a vehicle.", response = VehicleHarshEventResponse.class, tags={ "Fleet","Safety", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Harsh event details.", response = VehicleHarshEventResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleHarshEvent( @PathParam("vehicleId") Long vehicleId, @NotNull @QueryParam("access_token") String accessToken, @NotNull @QueryParam("timestamp") Long timestamp,@Context SecurityContext securityContext);
    @GET
    @Path("/vehicles/{vehicle_id}/locations")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/locations", notes = "Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.", response = FleetVehicleLocation.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.", response = FleetVehicleLocation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleLocations( @NotNull @QueryParam("access_token") String accessToken, @PathParam("vehicle_id") Long vehicleId, @NotNull @QueryParam("startMs") Long startMs, @NotNull @QueryParam("endMs") Long endMs,@Context SecurityContext securityContext);
    @GET
    @Path("/vehicles/{vehicleId}/safety/score")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicleId:[0-9]+}/safety/score", notes = "Fetch the safety score for the vehicle.", response = VehicleSafetyScoreResponse.class, tags={ "Fleet","Safety", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Safety score details.", response = VehicleSafetyScoreResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleSafetyScore( @PathParam("vehicleId") Long vehicleId, @NotNull @QueryParam("access_token") String accessToken, @NotNull @QueryParam("startMs") Long startMs, @NotNull @QueryParam("endMs") Long endMs,@Context SecurityContext securityContext);
    @GET
    @Path("/vehicles/stats")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/stats", notes = "Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.", response = InlineResponse2005.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns engine state and/or aux input data for all vehicles in the group between a start/end time.", response = InlineResponse2005.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleStats( @NotNull @QueryParam("access_token") String accessToken, @NotNull @QueryParam("startMs") Integer startMs, @NotNull @QueryParam("endMs") Integer endMs, @QueryParam("series") String series, @QueryParam("tagIds") String tagIds, @QueryParam("startingAfter") String startingAfter, @QueryParam("endingBefore") String endingBefore, @QueryParam("limit") Long limit,@Context SecurityContext securityContext);
    @GET
    @Path("/vehicles/locations")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/locations", notes = "Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.", response = Object.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.", response = Object.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehiclesLocations( @NotNull @QueryParam("access_token") String accessToken, @NotNull @QueryParam("startMs") Integer startMs, @NotNull @QueryParam("endMs") Integer endMs,@Context SecurityContext securityContext);
    @POST
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/list", notes = "Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.", response = InlineResponse2002.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of vehicles and information about each.", response = InlineResponse2002.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response listFleet( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject10 groupParam, @QueryParam("startingAfter") String startingAfter, @QueryParam("endingBefore") String endingBefore, @QueryParam("limit") Long limit,@Context SecurityContext securityContext);
    @PATCH
    @Path("/vehicles/{vehicle_id_or_external_id}")
    @Consumes({ "application/json", "application/merge-patch+json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.", response = FleetVehicleResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The updated vehicle.", response = FleetVehicleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response patchFleetVehicle( @NotNull @QueryParam("access_token") String accessToken, @PathParam("vehicle_id_or_external_id") String vehicleIdOrExternalId,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject16 data,@Context SecurityContext securityContext);
    @PUT
    @Path("/drivers/inactive/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Reactivate the inactive driver having id.", response = Driver.class, tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.", response = Driver.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response reactivateDriverById( @NotNull @QueryParam("access_token") String accessToken, @PathParam("driver_id_or_external_id") String driverIdOrExternalId,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject4 reactivateDriverParam,@Context SecurityContext securityContext);
    @PUT
    @Path("/dispatch/routes/{route_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", notes = "Update a dispatch route and its associated jobs.", response = DispatchRoute.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.", response = DispatchRoute.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response updateDispatchRouteById( @NotNull @QueryParam("access_token") String accessToken, @PathParam("route_id") Long routeId,@ApiParam(value = "" ,required=true) @NotNull @Valid DispatchRoute updateDispatchRouteParams,@Context SecurityContext securityContext);
    @POST
    @Path("/set_data")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/set_data", notes = "This method enables the mutation of metadata for vehicles in the Samsara Cloud.", response = Void.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Vehicles were successfully updated. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response updateVehicles( @NotNull @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject14 vehicleUpdateParam,@Context SecurityContext securityContext);
}
