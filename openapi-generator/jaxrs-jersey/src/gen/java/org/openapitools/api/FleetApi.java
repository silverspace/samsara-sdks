package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.FleetApiService;
import org.openapitools.api.factories.FleetApiServiceFactory;

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

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/fleet")


@io.swagger.annotations.Api(description = "the fleet API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class FleetApi  {
   private final FleetApiService delegate;

   public FleetApi(@Context ServletConfig servletContext) {
      FleetApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FleetApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FleetApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = FleetApiServiceFactory.getFleetApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/add_address")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/add_address", notes = "This method adds an address book entry to the specified group.", response = Void.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Address was successfully added. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response addFleetAddress(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject2 addressParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addFleetAddress(accessToken,addressParam,securityContext);
    }
    @POST
    @Path("/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes", notes = "Create a new dispatch route.", response = DispatchRoute.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDispatchRoute(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid DispatchRouteCreate createDispatchRouteParams
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createDispatchRoute(accessToken,createDispatchRouteParams,securityContext);
    }
    @POST
    @Path("/drivers/create")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/create", notes = "Create a new driver.", response = Driver.class, tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the successfully created the driver.", response = Driver.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDriver(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Driver creation body" ,required=true) @NotNull @Valid DriverForCreate createDriverParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createDriver(accessToken,createDriverParam,securityContext);
    }
    @POST
    @Path("/drivers/{driver_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", notes = "Create a new dispatch route for the driver with driver_id.", response = DispatchRoute.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDriverDispatchRoute(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the driver with the associated routes.",required=true) @PathParam("driver_id") Long driverId
,@ApiParam(value = "" ,required=true) @NotNull @Valid DispatchRouteCreate createDispatchRouteParams
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createDriverDispatchRoute(accessToken,driverId,createDispatchRouteParams,securityContext);
    }
    @POST
    @Path("/drivers/{driver_id}/documents")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/documents", notes = "Create a driver document for the given driver.", response = Document.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the created document.", response = Document.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDriverDocument(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the driver for whom the document is created.",required=true) @PathParam("driver_id") Long driverId
,@ApiParam(value = "To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_." ,required=true) @NotNull @Valid DocumentCreate createDocumentParams
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createDriverDocument(accessToken,driverId,createDocumentParams,securityContext);
    }
    @POST
    @Path("/maintenance/dvirs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/maintenance/dvirs", notes = "Create a new dvir, marking a vehicle or trailer safe or unsafe.", response = DvirBase.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Newly created DVIR.", response = DvirBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createDvir(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject12 createDvirParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createDvir(accessToken,createDvirParam,securityContext);
    }
    @POST
    @Path("/vehicles/{vehicle_id}/dispatch/routes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", notes = "Create a new dispatch route for the vehicle with vehicle_id.", response = DispatchRoute.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createVehicleDispatchRoute(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the vehicle with the associated routes.",required=true) @PathParam("vehicle_id") Long vehicleId
,@ApiParam(value = "" ,required=true) @NotNull @Valid DispatchRouteCreate createDispatchRouteParams
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createVehicleDispatchRoute(accessToken,vehicleId,createDispatchRouteParams,securityContext);
    }
    @DELETE
    @Path("/drivers/{driver_id_or_external_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Deactivate a driver with the given id.", response = Void.class, tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deactivateDriver(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathParam("driver_id_or_external_id") String driverIdOrExternalId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deactivateDriver(accessToken,driverIdOrExternalId,securityContext);
    }
    @DELETE
    @Path("/dispatch/routes/{route_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", notes = "Delete a dispatch route and its associated jobs.", response = Void.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully deleted the dispatch route. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deleteDispatchRouteById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the dispatch route.",required=true) @PathParam("route_id") Long routeId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteDispatchRouteById(accessToken,routeId,securityContext);
    }
    @GET
    @Path("/dispatch/routes")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes", notes = "Fetch all of the dispatch routes for the group.", response = DispatchRoute.class, responseContainer = "List", tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "All dispatch route objects for the group.", response = DispatchRoute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response fetchAllDispatchRoutes(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @QueryParam("group_id") Long groupId
,@ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.") @QueryParam("end_time") Long endTime
,@ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.") @QueryParam("duration") Long duration
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.fetchAllDispatchRoutes(accessToken,groupId,endTime,duration,securityContext);
    }
    @GET
    @Path("/dispatch/routes/job_updates")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes/job_updates", notes = "Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID", response = AllRouteJobUpdates.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "All job updates on routes.", response = AllRouteJobUpdates.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response fetchAllRouteJobUpdates(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @QueryParam("group_id") Long groupId
,@ApiParam(value = "Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.") @QueryParam("sequence_id") String sequenceId
,@ApiParam(value = "Optionally set include=route to include route object in response payload.") @QueryParam("include") String include
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.fetchAllRouteJobUpdates(accessToken,groupId,sequenceId,include,securityContext);
    }
    @GET
    @Path("/assets/locations")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/assets/locations", notes = "Fetch current locations of all assets for the group.", response = InlineResponse2001.class, tags={ "Fleet","Assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of assets and their current locations.", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllAssetCurrentLocations(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @QueryParam("group_id") Long groupId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllAssetCurrentLocations(accessToken,groupId,securityContext);
    }
    @GET
    @Path("/assets")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/assets", notes = "Fetch all of the assets for the group.", response = InlineResponse200.class, tags={ "Fleet","Assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of assets.", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllAssets(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @QueryParam("group_id") Long groupId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllAssets(accessToken,groupId,securityContext);
    }
    @GET
    @Path("/drivers/inactive")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/inactive", notes = "Fetch all deactivated drivers for the group.", response = Driver.class, responseContainer = "List", tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}", response = Driver.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllDeactivatedDrivers(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @QueryParam("group_id") Long groupId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllDeactivatedDrivers(accessToken,groupId,securityContext);
    }
    @GET
    @Path("/assets/{asset_id}/locations")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/assets/{assetId:[0-9]+}/locations", notes = "Fetch the historical locations for the asset.", response = Object.class, responseContainer = "List", tags={ "Fleet","Assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Asset location details.", response = Object.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAssetLocation(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the asset",required=true) @PathParam("asset_id") Long assetId
,@ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.",required=true) @QueryParam("startMs") Long startMs
,@ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.",required=true) @QueryParam("endMs") Long endMs
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAssetLocation(accessToken,assetId,startMs,endMs,securityContext);
    }
    @GET
    @Path("/assets/{asset_id}/reefer")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/assets/{assetId:[0-9]+}/reefer", notes = "Fetch the reefer-specific stats of an asset.", response = AssetReeferResponse.class, tags={ "Fleet","Assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Reefer-specific asset details.", response = AssetReeferResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAssetReefer(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the asset",required=true) @PathParam("asset_id") Long assetId
,@ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.",required=true) @QueryParam("startMs") Long startMs
,@ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.",required=true) @QueryParam("endMs") Long endMs
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAssetReefer(accessToken,assetId,startMs,endMs,securityContext);
    }
    @GET
    @Path("/drivers/inactive/{driver_id_or_external_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Fetch deactivated driver by id.", response = Driver.class, tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the deactivated driver with the given driver_id.", response = Driver.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDeactivatedDriverById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathParam("driver_id_or_external_id") String driverIdOrExternalId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDeactivatedDriverById(accessToken,driverIdOrExternalId,securityContext);
    }
    @GET
    @Path("/dispatch/routes/{route_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}", notes = "Fetch a dispatch route by id.", response = DispatchRoute.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The dispatch route corresponding to route_id.", response = DispatchRoute.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRouteById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the dispatch route.",required=true) @PathParam("route_id") Long routeId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDispatchRouteById(accessToken,routeId,securityContext);
    }
    @GET
    @Path("/dispatch/routes/{route_id}/history")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/history", notes = "Fetch the history of a dispatch route.", response = DispatchRouteHistory.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The historical route state changes between start_time and end_time.", response = DispatchRouteHistory.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRouteHistory(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the route with history.",required=true) @PathParam("route_id") Long routeId
,@ApiParam(value = "Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.") @QueryParam("start_time") Long startTime
,@ApiParam(value = "Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.") @QueryParam("end_time") Long endTime
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDispatchRouteHistory(accessToken,routeId,startTime,endTime,securityContext);
    }
    @GET
    @Path("/drivers/{driver_id}/dispatch/routes")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", notes = "Fetch all of the dispatch routes for a given driver.", response = DispatchRoute.class, responseContainer = "List", tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the dispatch routes for the given driver_id.", response = DispatchRoute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRoutesByDriverId(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the driver with the associated routes.",required=true) @PathParam("driver_id") Long driverId
,@ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.") @QueryParam("end_time") Long endTime
,@ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.") @QueryParam("duration") Long duration
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDispatchRoutesByDriverId(accessToken,driverId,endTime,duration,securityContext);
    }
    @GET
    @Path("/vehicles/{vehicle_id}/dispatch/routes")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", notes = "Fetch all of the dispatch routes for a given vehicle.", response = DispatchRoute.class, responseContainer = "List", tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns all of the dispatch routes for the given vehicle_id.", response = DispatchRoute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDispatchRoutesByVehicleId(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the vehicle with the associated routes.",required=true) @PathParam("vehicle_id") Long vehicleId
,@ApiParam(value = "Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.") @QueryParam("end_time") Long endTime
,@ApiParam(value = "Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.") @QueryParam("duration") Long duration
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDispatchRoutesByVehicleId(accessToken,vehicleId,endTime,duration,securityContext);
    }
    @GET
    @Path("/drivers/{driver_id_or_external_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Fetch driver by id.", response = Driver.class, tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the driver for the given driver_id.", response = Driver.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathParam("driver_id_or_external_id") String driverIdOrExternalId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDriverById(accessToken,driverIdOrExternalId,securityContext);
    }
    @GET
    @Path("/drivers/document_types")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/document_types", notes = "Fetch all of the document types.", response = DocumentType.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns all of the document types.", response = DocumentType.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverDocumentTypesByOrgId(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDriverDocumentTypesByOrgId(securityContext);
    }
    @GET
    @Path("/drivers/documents")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/documents", notes = "Fetch all of the documents.", response = Document.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns all of the documents.", response = Document.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverDocumentsByOrgId(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.") @QueryParam("endMs") Long endMs
,@ApiParam(value = "Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.") @QueryParam("durationMs") Long durationMs
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDriverDocumentsByOrgId(accessToken,endMs,durationMs,securityContext);
    }
    @GET
    @Path("/drivers/{driverId}/safety/score")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driverId:[0-9]+}/safety/score", notes = "Fetch the safety score for the driver.", response = DriverSafetyScoreResponse.class, tags={ "Fleet","Safety", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Safety score details.", response = DriverSafetyScoreResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDriverSafetyScore(@ApiParam(value = "ID of the driver",required=true) @PathParam("driverId") Long driverId
,@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.",required=true) @QueryParam("startMs") Long startMs
,@ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.",required=true) @QueryParam("endMs") Long endMs
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDriverSafetyScore(driverId,accessToken,startMs,endMs,securityContext);
    }
    @GET
    @Path("/maintenance/dvirs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/maintenance/dvirs", notes = "Get DVIRs for the org within provided time constraints", response = DvirListResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "DVIRs for the specified duration.", response = DvirListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDvirs(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "time in millis until the last dvir log.",required=true) @QueryParam("end_ms") Integer endMs
,@ApiParam(value = "time in millis which corresponds to the duration before the end_ms.",required=true) @QueryParam("duration_ms") Integer durationMs
,@ApiParam(value = "Group ID to query.") @QueryParam("group_id") Integer groupId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDvirs(accessToken,endMs,durationMs,groupId,securityContext);
    }
    @POST
    @Path("/drivers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers", notes = "Get all the drivers for the specified group.", response = DriversResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "All drivers in the group.", response = DriversResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetDrivers(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject3 groupDriversParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFleetDrivers(accessToken,groupDriversParam,securityContext);
    }
    @POST
    @Path("/drivers/{driver_id}/hos_daily_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs", notes = "Get summarized daily HOS charts for a specified driver.", response = DriverDailyLogResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Distance traveled and time active for each driver in the organization over the specified time period.", response = DriverDailyLogResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetDriversHosDailyLogs(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the driver with HOS logs.",required=true) @PathParam("driver_id") Long driverId
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject6 hosLogsParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFleetDriversHosDailyLogs(accessToken,driverId,hosLogsParam,securityContext);
    }
    @POST
    @Path("/drivers/summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/summary", notes = "Get the distance and time each driver in an organization has driven in a given time period.", response = DriversSummaryResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Distance traveled and time active for each driver in the organization over the specified time period.", response = DriversSummaryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetDriversSummary(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject5 driversSummaryParam
,@ApiParam(value = "Snap query result to HOS day boundaries.") @QueryParam("snap_to_day_bounds") Boolean snapToDayBounds
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFleetDriversSummary(accessToken,driversSummaryParam,snapToDayBounds,securityContext);
    }
    @POST
    @Path("/hos_authentication_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/hos_authentication_logs", notes = "Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.", response = HosAuthenticationLogsResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "HOS authentication logs for the specified driver.", response = HosAuthenticationLogsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetHosAuthenticationLogs(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject7 hosAuthenticationLogsParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFleetHosAuthenticationLogs(accessToken,hosAuthenticationLogsParam,securityContext);
    }
    @POST
    @Path("/hos_logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/hos_logs", notes = "Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.", response = HosLogsResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "HOS logs for the specified driver.", response = HosLogsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetHosLogs(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject8 hosLogsParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFleetHosLogs(accessToken,hosLogsParam,securityContext);
    }
    @POST
    @Path("/hos_logs_summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/hos_logs_summary", notes = "Get the current HOS status for all drivers in the group.", response = HosLogsSummaryResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "HOS logs for the specified driver.", response = HosLogsSummaryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetHosLogsSummary(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject9 hosLogsParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFleetHosLogsSummary(accessToken,hosLogsParam,securityContext);
    }
    @POST
    @Path("/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/locations", notes = "Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.", response = InlineResponse2003.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of vehicle objects containing their location and the time at which that location was logged.", response = InlineResponse2003.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetLocations(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject11 groupParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFleetLocations(accessToken,groupParam,securityContext);
    }
    @POST
    @Path("/maintenance/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/maintenance/list", notes = "Get list of the vehicles with any engine faults or check light data.", response = InlineResponse2004.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of vehicles and maintenance information about each.", response = InlineResponse2004.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetMaintenanceList(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject13 groupParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFleetMaintenanceList(accessToken,groupParam,securityContext);
    }
    @POST
    @Path("/trips")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/trips", notes = "Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.", response = TripResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of trips taken by the requested vehicle within the specified timeframe.", response = TripResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetTrips(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject15 tripsParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFleetTrips(accessToken,tripsParam,securityContext);
    }
    @GET
    @Path("/vehicles/{vehicle_id_or_external_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Gets a specific vehicle.", response = FleetVehicleResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The specified vehicle.", response = FleetVehicleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getFleetVehicle(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.",required=true) @PathParam("vehicle_id_or_external_id") String vehicleIdOrExternalId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFleetVehicle(accessToken,vehicleIdOrExternalId,securityContext);
    }
    @GET
    @Path("/vehicles/{vehicleId}/safety/harsh_event")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event", notes = "Fetch harsh event details for a vehicle.", response = VehicleHarshEventResponse.class, tags={ "Fleet","Safety", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Harsh event details.", response = VehicleHarshEventResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleHarshEvent(@ApiParam(value = "ID of the vehicle",required=true) @PathParam("vehicleId") Long vehicleId
,@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Timestamp in milliseconds representing the timestamp of a harsh event.",required=true) @QueryParam("timestamp") Long timestamp
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVehicleHarshEvent(vehicleId,accessToken,timestamp,securityContext);
    }
    @GET
    @Path("/vehicles/{vehicle_id}/locations")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/locations", notes = "Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.", response = FleetVehicleLocation.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.", response = FleetVehicleLocation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleLocations(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the vehicle with the associated routes.",required=true) @PathParam("vehicle_id") Long vehicleId
,@ApiParam(value = "Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)",required=true) @QueryParam("startMs") Long startMs
,@ApiParam(value = "Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)",required=true) @QueryParam("endMs") Long endMs
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVehicleLocations(accessToken,vehicleId,startMs,endMs,securityContext);
    }
    @GET
    @Path("/vehicles/{vehicleId}/safety/score")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicleId:[0-9]+}/safety/score", notes = "Fetch the safety score for the vehicle.", response = VehicleSafetyScoreResponse.class, tags={ "Fleet","Safety", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Safety score details.", response = VehicleSafetyScoreResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleSafetyScore(@ApiParam(value = "ID of the vehicle",required=true) @PathParam("vehicleId") Long vehicleId
,@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.",required=true) @QueryParam("startMs") Long startMs
,@ApiParam(value = "Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.",required=true) @QueryParam("endMs") Long endMs
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVehicleSafetyScore(vehicleId,accessToken,startMs,endMs,securityContext);
    }
    @GET
    @Path("/vehicles/stats")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/stats", notes = "Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.", response = InlineResponse2005.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns engine state and/or aux input data for all vehicles in the group between a start/end time.", response = InlineResponse2005.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehicleStats(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Time in Unix epoch milliseconds for the start of the query.",required=true) @QueryParam("startMs") Integer startMs
,@ApiParam(value = "Time in Unix epoch milliseconds for the end of the query.",required=true) @QueryParam("endMs") Integer endMs
,@ApiParam(value = "Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2", allowableValues="engineState, auxInput1, auxInput2") @QueryParam("series") String series
,@ApiParam(value = "Comma-separated list of tag ids. Example: tagIds=1,2,3") @QueryParam("tagIds") String tagIds
,@ApiParam(value = "Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.") @QueryParam("startingAfter") String startingAfter
,@ApiParam(value = "Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.") @QueryParam("endingBefore") String endingBefore
,@ApiParam(value = "Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.") @QueryParam("limit") Long limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVehicleStats(accessToken,startMs,endMs,series,tagIds,startingAfter,endingBefore,limit,securityContext);
    }
    @GET
    @Path("/vehicles/locations")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/locations", notes = "Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.", response = Object.class, responseContainer = "List", tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.", response = Object.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getVehiclesLocations(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)",required=true) @QueryParam("startMs") Integer startMs
,@ApiParam(value = "Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)",required=true) @QueryParam("endMs") Integer endMs
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVehiclesLocations(accessToken,startMs,endMs,securityContext);
    }
    @POST
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/list", notes = "Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.", response = InlineResponse2002.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of vehicles and information about each.", response = InlineResponse2002.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response listFleet(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject10 groupParam
,@ApiParam(value = "Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.") @QueryParam("startingAfter") String startingAfter
,@ApiParam(value = "Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.") @QueryParam("endingBefore") String endingBefore
,@ApiParam(value = "Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.") @QueryParam("limit") Long limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listFleet(accessToken,groupParam,startingAfter,endingBefore,limit,securityContext);
    }
    @PATCH
    @Path("/vehicles/{vehicle_id_or_external_id}")
    @Consumes({ "application/json", "application/merge-patch+json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.", response = FleetVehicleResponse.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The updated vehicle.", response = FleetVehicleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response patchFleetVehicle(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.",required=true) @PathParam("vehicle_id_or_external_id") String vehicleIdOrExternalId
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject16 data
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchFleetVehicle(accessToken,vehicleIdOrExternalId,data,securityContext);
    }
    @PUT
    @Path("/drivers/inactive/{driver_id_or_external_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}", notes = "Reactivate the inactive driver having id.", response = Driver.class, tags={ "Fleet","Drivers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.", response = Driver.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response reactivateDriverById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.",required=true) @PathParam("driver_id_or_external_id") String driverIdOrExternalId
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject4 reactivateDriverParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reactivateDriverById(accessToken,driverIdOrExternalId,reactivateDriverParam,securityContext);
    }
    @PUT
    @Path("/dispatch/routes/{route_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", notes = "Update a dispatch route and its associated jobs.", response = DispatchRoute.class, tags={ "Fleet","Routes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.", response = DispatchRoute.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response updateDispatchRouteById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the dispatch route.",required=true) @PathParam("route_id") Long routeId
,@ApiParam(value = "" ,required=true) @NotNull @Valid DispatchRoute updateDispatchRouteParams
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateDispatchRouteById(accessToken,routeId,updateDispatchRouteParams,securityContext);
    }
    @POST
    @Path("/set_data")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/fleet/set_data", notes = "This method enables the mutation of metadata for vehicles in the Samsara Cloud.", response = Void.class, tags={ "Fleet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Vehicles were successfully updated. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response updateVehicles(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject14 vehicleUpdateParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateVehicles(accessToken,vehicleUpdateParam,securityContext);
    }
}
