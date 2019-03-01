package io.swagger.api;

import io.swagger.model.AllRouteJobUpdates;
import io.swagger.model.DispatchRoute;
import io.swagger.model.DispatchRouteCreate;
import io.swagger.model.DispatchRouteHistory;
import io.swagger.model.DispatchRoutes;

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

/**
 * Samsara API
 *
 * <p># Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface RoutesApi  {

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
    @ApiOperation(value = "/fleet/dispatch/routes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoute createDispatchRoute(@QueryParam("access_token")String accessToken, DispatchRouteCreate createDispatchRouteParams);

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
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoute createDriverDispatchRoute(@QueryParam("access_token")String accessToken, @PathParam("driver_id") Long driverId, DispatchRouteCreate createDispatchRouteParams);

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
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created route object including the new route ID.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoute createVehicleDispatchRoute(@QueryParam("access_token")String accessToken, @PathParam("vehicle_id") Long vehicleId, DispatchRouteCreate createDispatchRouteParams);

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
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deleted the dispatch route. No response body is returned."),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public void deleteDispatchRouteById(@QueryParam("access_token")String accessToken, @PathParam("route_id") Long routeId);

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
    @ApiOperation(value = "/fleet/dispatch/routes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All dispatch route objects for the group.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoutes fetchAllDispatchRoutes(@QueryParam("access_token")String accessToken, @QueryParam("group_id")Long groupId, @QueryParam("end_time")Long endTime, @QueryParam("duration")Long duration);

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
    @ApiOperation(value = "/fleet/dispatch/routes/job_updates", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All job updates on routes.", response = AllRouteJobUpdates.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public AllRouteJobUpdates fetchAllRouteJobUpdates(@QueryParam("access_token")String accessToken, @QueryParam("group_id")Long groupId, @QueryParam("sequence_id")String sequenceId, @QueryParam("include")String include);

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
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The dispatch route corresponding to route_id.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoute getDispatchRouteById(@QueryParam("access_token")String accessToken, @PathParam("route_id") Long routeId);

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
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/history", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The historical route state changes between start_time and end_time.", response = DispatchRouteHistory.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRouteHistory getDispatchRouteHistory(@QueryParam("access_token")String accessToken, @PathParam("route_id") Long routeId, @QueryParam("start_time")Long startTime, @QueryParam("end_time")Long endTime);

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
    @ApiOperation(value = "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the dispatch routes for the given driver_id.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoutes getDispatchRoutesByDriverId(@QueryParam("access_token")String accessToken, @PathParam("driver_id") Long driverId, @QueryParam("end_time")Long endTime, @QueryParam("duration")Long duration);

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
    @ApiOperation(value = "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns all of the dispatch routes for the given vehicle_id.", response = DispatchRoutes.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoutes getDispatchRoutesByVehicleId(@QueryParam("access_token")String accessToken, @PathParam("vehicle_id") Long vehicleId, @QueryParam("end_time")Long endTime, @QueryParam("duration")Long duration);

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
    @ApiOperation(value = "/fleet/dispatch/routes/{route_id:[0-9]+}/", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.", response = DispatchRoute.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DispatchRoute updateDispatchRouteById(@QueryParam("access_token")String accessToken, @PathParam("route_id") Long routeId, DispatchRoute updateDispatchRouteParams);
}
