package org.openapitools.api;

import org.openapitools.model.CargoResponse;
import org.openapitools.model.DoorResponse;
import org.openapitools.model.HumidityResponse;
import org.openapitools.model.InlineObject19;
import org.openapitools.model.InlineObject20;
import org.openapitools.model.InlineObject21;
import org.openapitools.model.InlineObject22;
import org.openapitools.model.InlineObject23;
import org.openapitools.model.InlineObject24;
import org.openapitools.model.InlineResponse2008;
import org.openapitools.model.SensorHistoryResponse;
import org.openapitools.model.TemperatureResponse;

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
public interface SensorsApi  {

    /**
     * /sensors/list
     *
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     *
     */
    @POST
    @Path("/sensors/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/list", tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects.", response = InlineResponse2008.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public InlineResponse2008 getSensors(@QueryParam("access_token") @NotNull  String accessToken, @Valid InlineObject23 groupParam);

    /**
     * /sensors/cargo
     *
     * Get cargo monitor status (empty / full) for requested sensors.
     *
     */
    @POST
    @Path("/sensors/cargo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/cargo", tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current cargo status reported by each sensor.", response = CargoResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public CargoResponse getSensorsCargo(@QueryParam("access_token") @NotNull  String accessToken, @Valid InlineObject19 sensorParam);

    /**
     * /sensors/door
     *
     * Get door monitor status (closed / open) for requested sensors.
     *
     */
    @POST
    @Path("/sensors/door")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/door", tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current door status reported by each sensor.", response = DoorResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public DoorResponse getSensorsDoor(@QueryParam("access_token") @NotNull  String accessToken, @Valid InlineObject20 sensorParam);

    /**
     * /sensors/history
     *
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     *
     */
    @POST
    @Path("/sensors/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/history", tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of results objects, each containing a time and a datapoint for each requested sensor/field pair.", response = SensorHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public SensorHistoryResponse getSensorsHistory(@QueryParam("access_token") @NotNull  String accessToken, @Valid InlineObject21 historyParam);

    /**
     * /sensors/humidity
     *
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     *
     */
    @POST
    @Path("/sensors/humidity")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/humidity", tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current humidity reported by each sensor.", response = HumidityResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public HumidityResponse getSensorsHumidity(@QueryParam("access_token") @NotNull  String accessToken, @Valid InlineObject22 sensorParam);

    /**
     * /sensors/temperature
     *
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     *
     */
    @POST
    @Path("/sensors/temperature")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/temperature", tags={ "Sensors" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current temperature reported by each sensor.", response = TemperatureResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public TemperatureResponse getSensorsTemperature(@QueryParam("access_token") @NotNull  String accessToken, @Valid InlineObject24 sensorParam);
}

