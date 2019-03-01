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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DispatchJobCreate;
import org.openapitools.model.DispatchRouteBase;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * DispatchRouteCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class DispatchRouteCreate   {
  @JsonProperty("actual_end_ms")
  private Long actualEndMs;

  @JsonProperty("actual_start_ms")
  private Long actualStartMs;

  @JsonProperty("driver_id")
  private Long driverId;

  @JsonProperty("group_id")
  private Long groupId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("scheduled_end_ms")
  private Long scheduledEndMs;

  @JsonProperty("scheduled_meters")
  private Long scheduledMeters;

  @JsonProperty("scheduled_start_ms")
  private Long scheduledStartMs;

  @JsonProperty("start_location_address")
  private String startLocationAddress;

  @JsonProperty("start_location_address_id")
  private Long startLocationAddressId;

  @JsonProperty("start_location_lat")
  private Double startLocationLat;

  @JsonProperty("start_location_lng")
  private Double startLocationLng;

  @JsonProperty("start_location_name")
  private String startLocationName;

  @JsonProperty("trailer_id")
  private Long trailerId;

  @JsonProperty("vehicle_id")
  private Long vehicleId;

  @JsonProperty("dispatch_jobs")
  private List<DispatchJobCreate> dispatchJobs = new ArrayList<DispatchJobCreate>();

  public DispatchRouteCreate actualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
    return this;
  }

  /**
   * The time in Unix epoch milliseconds that the route actually ended.
   * @return actualEndMs
   **/
  @JsonProperty("actual_end_ms")
  @ApiModelProperty(example = "1462882101000", value = "The time in Unix epoch milliseconds that the route actually ended.")
  
  public Long getActualEndMs() {
    return actualEndMs;
  }

  public void setActualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
  }

  public DispatchRouteCreate actualStartMs(Long actualStartMs) {
    this.actualStartMs = actualStartMs;
    return this;
  }

  /**
   * The time in Unix epoch milliseconds that the route actually started.
   * @return actualStartMs
   **/
  @JsonProperty("actual_start_ms")
  @ApiModelProperty(example = "1462882098000", value = "The time in Unix epoch milliseconds that the route actually started.")
  
  public Long getActualStartMs() {
    return actualStartMs;
  }

  public void setActualStartMs(Long actualStartMs) {
    this.actualStartMs = actualStartMs;
  }

  public DispatchRouteCreate driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
   * @return driverId
   **/
  @JsonProperty("driver_id")
  @ApiModelProperty(example = "555", value = "ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.")
  
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public DispatchRouteCreate groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * ID of the group if the organization has multiple groups (optional).
   * @return groupId
   **/
  @JsonProperty("group_id")
  @ApiModelProperty(example = "101", value = "ID of the group if the organization has multiple groups (optional).")
  
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DispatchRouteCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Descriptive name of this route.
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(example = "Bid #123", required = true, value = "Descriptive name of this route.")
  @NotNull 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DispatchRouteCreate scheduledEndMs(Long scheduledEndMs) {
    this.scheduledEndMs = scheduledEndMs;
    return this;
  }

  /**
   * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
   * @return scheduledEndMs
   **/
  @JsonProperty("scheduled_end_ms")
  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the last job in the route is scheduled to end.")
  @NotNull 
  public Long getScheduledEndMs() {
    return scheduledEndMs;
  }

  public void setScheduledEndMs(Long scheduledEndMs) {
    this.scheduledEndMs = scheduledEndMs;
  }

  public DispatchRouteCreate scheduledMeters(Long scheduledMeters) {
    this.scheduledMeters = scheduledMeters;
    return this;
  }

  /**
   * The distance expected to be traveled for this route in meters.
   * @return scheduledMeters
   **/
  @JsonProperty("scheduled_meters")
  @ApiModelProperty(example = "10000", value = "The distance expected to be traveled for this route in meters.")
  
  public Long getScheduledMeters() {
    return scheduledMeters;
  }

  public void setScheduledMeters(Long scheduledMeters) {
    this.scheduledMeters = scheduledMeters;
  }

  public DispatchRouteCreate scheduledStartMs(Long scheduledStartMs) {
    this.scheduledStartMs = scheduledStartMs;
    return this;
  }

  /**
   * The time in Unix epoch milliseconds that the route is scheduled to start.
   * @return scheduledStartMs
   **/
  @JsonProperty("scheduled_start_ms")
  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the route is scheduled to start.")
  @NotNull 
  public Long getScheduledStartMs() {
    return scheduledStartMs;
  }

  public void setScheduledStartMs(Long scheduledStartMs) {
    this.scheduledStartMs = scheduledStartMs;
  }

  public DispatchRouteCreate startLocationAddress(String startLocationAddress) {
    this.startLocationAddress = startLocationAddress;
    return this;
  }

  /**
   * The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
   * @return startLocationAddress
   **/
  @JsonProperty("start_location_address")
  @ApiModelProperty(example = "123 Main St, Philadelphia, PA 19106", value = "The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.")
  
  public String getStartLocationAddress() {
    return startLocationAddress;
  }

  public void setStartLocationAddress(String startLocationAddress) {
    this.startLocationAddress = startLocationAddress;
  }

  public DispatchRouteCreate startLocationAddressId(Long startLocationAddressId) {
    this.startLocationAddressId = startLocationAddressId;
    return this;
  }

  /**
   * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
   * @return startLocationAddressId
   **/
  @JsonProperty("start_location_address_id")
  @ApiModelProperty(example = "67890", value = "ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.")
  
  public Long getStartLocationAddressId() {
    return startLocationAddressId;
  }

  public void setStartLocationAddressId(Long startLocationAddressId) {
    this.startLocationAddressId = startLocationAddressId;
  }

  public DispatchRouteCreate startLocationLat(Double startLocationLat) {
    this.startLocationLat = startLocationLat;
    return this;
  }

  /**
   * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   * @return startLocationLat
   **/
  @JsonProperty("start_location_lat")
  @ApiModelProperty(example = "123.456", value = "Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.")
  
  public Double getStartLocationLat() {
    return startLocationLat;
  }

  public void setStartLocationLat(Double startLocationLat) {
    this.startLocationLat = startLocationLat;
  }

  public DispatchRouteCreate startLocationLng(Double startLocationLng) {
    this.startLocationLng = startLocationLng;
    return this;
  }

  /**
   * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   * @return startLocationLng
   **/
  @JsonProperty("start_location_lng")
  @ApiModelProperty(example = "37.459", value = "Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.")
  
  public Double getStartLocationLng() {
    return startLocationLng;
  }

  public void setStartLocationLng(Double startLocationLng) {
    this.startLocationLng = startLocationLng;
  }

  public DispatchRouteCreate startLocationName(String startLocationName) {
    this.startLocationName = startLocationName;
    return this;
  }

  /**
   * The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
   * @return startLocationName
   **/
  @JsonProperty("start_location_name")
  @ApiModelProperty(example = "ACME Inc. Philadelphia HQ", value = "The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.")
  
  public String getStartLocationName() {
    return startLocationName;
  }

  public void setStartLocationName(String startLocationName) {
    this.startLocationName = startLocationName;
  }

  public DispatchRouteCreate trailerId(Long trailerId) {
    this.trailerId = trailerId;
    return this;
  }

  /**
   * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
   * @return trailerId
   **/
  @JsonProperty("trailer_id")
  @ApiModelProperty(example = "666", value = "ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.")
  
  public Long getTrailerId() {
    return trailerId;
  }

  public void setTrailerId(Long trailerId) {
    this.trailerId = trailerId;
  }

  public DispatchRouteCreate vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
   * @return vehicleId
   **/
  @JsonProperty("vehicle_id")
  @ApiModelProperty(example = "444", value = "ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.")
  
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public DispatchRouteCreate dispatchJobs(List<DispatchJobCreate> dispatchJobs) {
    this.dispatchJobs = dispatchJobs;
    return this;
  }

  public DispatchRouteCreate addDispatchJobsItem(DispatchJobCreate dispatchJobsItem) {
    this.dispatchJobs.add(dispatchJobsItem);
    return this;
  }

  /**
   * The dispatch jobs to create for this route.
   * @return dispatchJobs
   **/
  @JsonProperty("dispatch_jobs")
  @ApiModelProperty(required = true, value = "The dispatch jobs to create for this route.")
  @NotNull @Valid 
  public List<DispatchJobCreate> getDispatchJobs() {
    return dispatchJobs;
  }

  public void setDispatchJobs(List<DispatchJobCreate> dispatchJobs) {
    this.dispatchJobs = dispatchJobs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchRouteCreate dispatchRouteCreate = (DispatchRouteCreate) o;
    return Objects.equals(this.actualEndMs, dispatchRouteCreate.actualEndMs) &&
        Objects.equals(this.actualStartMs, dispatchRouteCreate.actualStartMs) &&
        Objects.equals(this.driverId, dispatchRouteCreate.driverId) &&
        Objects.equals(this.groupId, dispatchRouteCreate.groupId) &&
        Objects.equals(this.name, dispatchRouteCreate.name) &&
        Objects.equals(this.scheduledEndMs, dispatchRouteCreate.scheduledEndMs) &&
        Objects.equals(this.scheduledMeters, dispatchRouteCreate.scheduledMeters) &&
        Objects.equals(this.scheduledStartMs, dispatchRouteCreate.scheduledStartMs) &&
        Objects.equals(this.startLocationAddress, dispatchRouteCreate.startLocationAddress) &&
        Objects.equals(this.startLocationAddressId, dispatchRouteCreate.startLocationAddressId) &&
        Objects.equals(this.startLocationLat, dispatchRouteCreate.startLocationLat) &&
        Objects.equals(this.startLocationLng, dispatchRouteCreate.startLocationLng) &&
        Objects.equals(this.startLocationName, dispatchRouteCreate.startLocationName) &&
        Objects.equals(this.trailerId, dispatchRouteCreate.trailerId) &&
        Objects.equals(this.vehicleId, dispatchRouteCreate.vehicleId) &&
        Objects.equals(this.dispatchJobs, dispatchRouteCreate.dispatchJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualEndMs, actualStartMs, driverId, groupId, name, scheduledEndMs, scheduledMeters, scheduledStartMs, startLocationAddress, startLocationAddressId, startLocationLat, startLocationLng, startLocationName, trailerId, vehicleId, dispatchJobs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatchRouteCreate {\n");
    
    sb.append("    actualEndMs: ").append(toIndentedString(actualEndMs)).append("\n");
    sb.append("    actualStartMs: ").append(toIndentedString(actualStartMs)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduledEndMs: ").append(toIndentedString(scheduledEndMs)).append("\n");
    sb.append("    scheduledMeters: ").append(toIndentedString(scheduledMeters)).append("\n");
    sb.append("    scheduledStartMs: ").append(toIndentedString(scheduledStartMs)).append("\n");
    sb.append("    startLocationAddress: ").append(toIndentedString(startLocationAddress)).append("\n");
    sb.append("    startLocationAddressId: ").append(toIndentedString(startLocationAddressId)).append("\n");
    sb.append("    startLocationLat: ").append(toIndentedString(startLocationLat)).append("\n");
    sb.append("    startLocationLng: ").append(toIndentedString(startLocationLng)).append("\n");
    sb.append("    startLocationName: ").append(toIndentedString(startLocationName)).append("\n");
    sb.append("    trailerId: ").append(toIndentedString(trailerId)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    dispatchJobs: ").append(toIndentedString(dispatchJobs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

