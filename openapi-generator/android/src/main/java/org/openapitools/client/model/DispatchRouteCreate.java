/**
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

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.DispatchJobCreate;
import org.openapitools.client.model.DispatchRouteBase;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DispatchRouteCreate {
  
  @SerializedName("actual_end_ms")
  private Long actualEndMs = null;
  @SerializedName("actual_start_ms")
  private Long actualStartMs = null;
  @SerializedName("driver_id")
  private Long driverId = null;
  @SerializedName("group_id")
  private Long groupId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("scheduled_end_ms")
  private Long scheduledEndMs = null;
  @SerializedName("scheduled_meters")
  private Long scheduledMeters = null;
  @SerializedName("scheduled_start_ms")
  private Long scheduledStartMs = null;
  @SerializedName("start_location_address")
  private String startLocationAddress = null;
  @SerializedName("start_location_address_id")
  private Long startLocationAddressId = null;
  @SerializedName("start_location_lat")
  private Double startLocationLat = null;
  @SerializedName("start_location_lng")
  private Double startLocationLng = null;
  @SerializedName("start_location_name")
  private String startLocationName = null;
  @SerializedName("trailer_id")
  private Long trailerId = null;
  @SerializedName("vehicle_id")
  private Long vehicleId = null;
  @SerializedName("dispatch_jobs")
  private List<DispatchJobCreate> dispatchJobs = null;

  /**
   * The time in Unix epoch milliseconds that the route actually ended.
   **/
  @ApiModelProperty(value = "The time in Unix epoch milliseconds that the route actually ended.")
  public Long getActualEndMs() {
    return actualEndMs;
  }
  public void setActualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
  }

  /**
   * The time in Unix epoch milliseconds that the route actually started.
   **/
  @ApiModelProperty(value = "The time in Unix epoch milliseconds that the route actually started.")
  public Long getActualStartMs() {
    return actualStartMs;
  }
  public void setActualStartMs(Long actualStartMs) {
    this.actualStartMs = actualStartMs;
  }

  /**
   * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
   **/
  @ApiModelProperty(value = "ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  /**
   * ID of the group if the organization has multiple groups (optional).
   **/
  @ApiModelProperty(value = "ID of the group if the organization has multiple groups (optional).")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * Descriptive name of this route.
   **/
  @ApiModelProperty(required = true, value = "Descriptive name of this route.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
   **/
  @ApiModelProperty(required = true, value = "The time in Unix epoch milliseconds that the last job in the route is scheduled to end.")
  public Long getScheduledEndMs() {
    return scheduledEndMs;
  }
  public void setScheduledEndMs(Long scheduledEndMs) {
    this.scheduledEndMs = scheduledEndMs;
  }

  /**
   * The distance expected to be traveled for this route in meters.
   **/
  @ApiModelProperty(value = "The distance expected to be traveled for this route in meters.")
  public Long getScheduledMeters() {
    return scheduledMeters;
  }
  public void setScheduledMeters(Long scheduledMeters) {
    this.scheduledMeters = scheduledMeters;
  }

  /**
   * The time in Unix epoch milliseconds that the route is scheduled to start.
   **/
  @ApiModelProperty(required = true, value = "The time in Unix epoch milliseconds that the route is scheduled to start.")
  public Long getScheduledStartMs() {
    return scheduledStartMs;
  }
  public void setScheduledStartMs(Long scheduledStartMs) {
    this.scheduledStartMs = scheduledStartMs;
  }

  /**
   * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
   **/
  @ApiModelProperty(value = "The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.")
  public String getStartLocationAddress() {
    return startLocationAddress;
  }
  public void setStartLocationAddress(String startLocationAddress) {
    this.startLocationAddress = startLocationAddress;
  }

  /**
   * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
   **/
  @ApiModelProperty(value = "ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.")
  public Long getStartLocationAddressId() {
    return startLocationAddressId;
  }
  public void setStartLocationAddressId(Long startLocationAddressId) {
    this.startLocationAddressId = startLocationAddressId;
  }

  /**
   * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   **/
  @ApiModelProperty(value = "Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.")
  public Double getStartLocationLat() {
    return startLocationLat;
  }
  public void setStartLocationLat(Double startLocationLat) {
    this.startLocationLat = startLocationLat;
  }

  /**
   * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   **/
  @ApiModelProperty(value = "Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.")
  public Double getStartLocationLng() {
    return startLocationLng;
  }
  public void setStartLocationLng(Double startLocationLng) {
    this.startLocationLng = startLocationLng;
  }

  /**
   * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
   **/
  @ApiModelProperty(value = "The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.")
  public String getStartLocationName() {
    return startLocationName;
  }
  public void setStartLocationName(String startLocationName) {
    this.startLocationName = startLocationName;
  }

  /**
   * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
   **/
  @ApiModelProperty(value = "ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.")
  public Long getTrailerId() {
    return trailerId;
  }
  public void setTrailerId(Long trailerId) {
    this.trailerId = trailerId;
  }

  /**
   * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
   **/
  @ApiModelProperty(value = "ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  /**
   * The dispatch jobs to create for this route.
   **/
  @ApiModelProperty(required = true, value = "The dispatch jobs to create for this route.")
  public List<DispatchJobCreate> getDispatchJobs() {
    return dispatchJobs;
  }
  public void setDispatchJobs(List<DispatchJobCreate> dispatchJobs) {
    this.dispatchJobs = dispatchJobs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchRouteCreate dispatchRouteCreate = (DispatchRouteCreate) o;
    return (this.actualEndMs == null ? dispatchRouteCreate.actualEndMs == null : this.actualEndMs.equals(dispatchRouteCreate.actualEndMs)) &&
        (this.actualStartMs == null ? dispatchRouteCreate.actualStartMs == null : this.actualStartMs.equals(dispatchRouteCreate.actualStartMs)) &&
        (this.driverId == null ? dispatchRouteCreate.driverId == null : this.driverId.equals(dispatchRouteCreate.driverId)) &&
        (this.groupId == null ? dispatchRouteCreate.groupId == null : this.groupId.equals(dispatchRouteCreate.groupId)) &&
        (this.name == null ? dispatchRouteCreate.name == null : this.name.equals(dispatchRouteCreate.name)) &&
        (this.scheduledEndMs == null ? dispatchRouteCreate.scheduledEndMs == null : this.scheduledEndMs.equals(dispatchRouteCreate.scheduledEndMs)) &&
        (this.scheduledMeters == null ? dispatchRouteCreate.scheduledMeters == null : this.scheduledMeters.equals(dispatchRouteCreate.scheduledMeters)) &&
        (this.scheduledStartMs == null ? dispatchRouteCreate.scheduledStartMs == null : this.scheduledStartMs.equals(dispatchRouteCreate.scheduledStartMs)) &&
        (this.startLocationAddress == null ? dispatchRouteCreate.startLocationAddress == null : this.startLocationAddress.equals(dispatchRouteCreate.startLocationAddress)) &&
        (this.startLocationAddressId == null ? dispatchRouteCreate.startLocationAddressId == null : this.startLocationAddressId.equals(dispatchRouteCreate.startLocationAddressId)) &&
        (this.startLocationLat == null ? dispatchRouteCreate.startLocationLat == null : this.startLocationLat.equals(dispatchRouteCreate.startLocationLat)) &&
        (this.startLocationLng == null ? dispatchRouteCreate.startLocationLng == null : this.startLocationLng.equals(dispatchRouteCreate.startLocationLng)) &&
        (this.startLocationName == null ? dispatchRouteCreate.startLocationName == null : this.startLocationName.equals(dispatchRouteCreate.startLocationName)) &&
        (this.trailerId == null ? dispatchRouteCreate.trailerId == null : this.trailerId.equals(dispatchRouteCreate.trailerId)) &&
        (this.vehicleId == null ? dispatchRouteCreate.vehicleId == null : this.vehicleId.equals(dispatchRouteCreate.vehicleId)) &&
        (this.dispatchJobs == null ? dispatchRouteCreate.dispatchJobs == null : this.dispatchJobs.equals(dispatchRouteCreate.dispatchJobs));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.actualEndMs == null ? 0: this.actualEndMs.hashCode());
    result = 31 * result + (this.actualStartMs == null ? 0: this.actualStartMs.hashCode());
    result = 31 * result + (this.driverId == null ? 0: this.driverId.hashCode());
    result = 31 * result + (this.groupId == null ? 0: this.groupId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.scheduledEndMs == null ? 0: this.scheduledEndMs.hashCode());
    result = 31 * result + (this.scheduledMeters == null ? 0: this.scheduledMeters.hashCode());
    result = 31 * result + (this.scheduledStartMs == null ? 0: this.scheduledStartMs.hashCode());
    result = 31 * result + (this.startLocationAddress == null ? 0: this.startLocationAddress.hashCode());
    result = 31 * result + (this.startLocationAddressId == null ? 0: this.startLocationAddressId.hashCode());
    result = 31 * result + (this.startLocationLat == null ? 0: this.startLocationLat.hashCode());
    result = 31 * result + (this.startLocationLng == null ? 0: this.startLocationLng.hashCode());
    result = 31 * result + (this.startLocationName == null ? 0: this.startLocationName.hashCode());
    result = 31 * result + (this.trailerId == null ? 0: this.trailerId.hashCode());
    result = 31 * result + (this.vehicleId == null ? 0: this.vehicleId.hashCode());
    result = 31 * result + (this.dispatchJobs == null ? 0: this.dispatchJobs.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatchRouteCreate {\n");
    
    sb.append("  actualEndMs: ").append(actualEndMs).append("\n");
    sb.append("  actualStartMs: ").append(actualStartMs).append("\n");
    sb.append("  driverId: ").append(driverId).append("\n");
    sb.append("  groupId: ").append(groupId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  scheduledEndMs: ").append(scheduledEndMs).append("\n");
    sb.append("  scheduledMeters: ").append(scheduledMeters).append("\n");
    sb.append("  scheduledStartMs: ").append(scheduledStartMs).append("\n");
    sb.append("  startLocationAddress: ").append(startLocationAddress).append("\n");
    sb.append("  startLocationAddressId: ").append(startLocationAddressId).append("\n");
    sb.append("  startLocationLat: ").append(startLocationLat).append("\n");
    sb.append("  startLocationLng: ").append(startLocationLng).append("\n");
    sb.append("  startLocationName: ").append(startLocationName).append("\n");
    sb.append("  trailerId: ").append(trailerId).append("\n");
    sb.append("  vehicleId: ").append(vehicleId).append("\n");
    sb.append("  dispatchJobs: ").append(dispatchJobs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
