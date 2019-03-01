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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.DispatchJobCreate;
import org.openapitools.client.model.DispatchRouteBase;

/**
 * DispatchRouteCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-01T05:34:00.976Z[GMT]")
public class DispatchRouteCreate {
  public static final String SERIALIZED_NAME_ACTUAL_END_MS = "actual_end_ms";
  @SerializedName(SERIALIZED_NAME_ACTUAL_END_MS)
  private Long actualEndMs;

  public static final String SERIALIZED_NAME_ACTUAL_START_MS = "actual_start_ms";
  @SerializedName(SERIALIZED_NAME_ACTUAL_START_MS)
  private Long actualStartMs;

  public static final String SERIALIZED_NAME_DRIVER_ID = "driver_id";
  @SerializedName(SERIALIZED_NAME_DRIVER_ID)
  private Long driverId;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCHEDULED_END_MS = "scheduled_end_ms";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_END_MS)
  private Long scheduledEndMs;

  public static final String SERIALIZED_NAME_SCHEDULED_METERS = "scheduled_meters";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_METERS)
  private Long scheduledMeters;

  public static final String SERIALIZED_NAME_SCHEDULED_START_MS = "scheduled_start_ms";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_START_MS)
  private Long scheduledStartMs;

  public static final String SERIALIZED_NAME_START_LOCATION_ADDRESS = "start_location_address";
  @SerializedName(SERIALIZED_NAME_START_LOCATION_ADDRESS)
  private String startLocationAddress;

  public static final String SERIALIZED_NAME_START_LOCATION_ADDRESS_ID = "start_location_address_id";
  @SerializedName(SERIALIZED_NAME_START_LOCATION_ADDRESS_ID)
  private Long startLocationAddressId;

  public static final String SERIALIZED_NAME_START_LOCATION_LAT = "start_location_lat";
  @SerializedName(SERIALIZED_NAME_START_LOCATION_LAT)
  private Double startLocationLat;

  public static final String SERIALIZED_NAME_START_LOCATION_LNG = "start_location_lng";
  @SerializedName(SERIALIZED_NAME_START_LOCATION_LNG)
  private Double startLocationLng;

  public static final String SERIALIZED_NAME_START_LOCATION_NAME = "start_location_name";
  @SerializedName(SERIALIZED_NAME_START_LOCATION_NAME)
  private String startLocationName;

  public static final String SERIALIZED_NAME_TRAILER_ID = "trailer_id";
  @SerializedName(SERIALIZED_NAME_TRAILER_ID)
  private Long trailerId;

  public static final String SERIALIZED_NAME_VEHICLE_ID = "vehicle_id";
  @SerializedName(SERIALIZED_NAME_VEHICLE_ID)
  private Long vehicleId;

  public static final String SERIALIZED_NAME_DISPATCH_JOBS = "dispatch_jobs";
  @SerializedName(SERIALIZED_NAME_DISPATCH_JOBS)
  private List<DispatchJobCreate> dispatchJobs = new ArrayList<DispatchJobCreate>();

  public DispatchRouteCreate actualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
    return this;
  }

   /**
   * The time in Unix epoch milliseconds that the route actually ended.
   * @return actualEndMs
  **/
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
  @ApiModelProperty(example = "Bid #123", required = true, value = "Descriptive name of this route.")
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
  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the last job in the route is scheduled to end.")
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
  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the route is scheduled to start.")
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
  @ApiModelProperty(required = true, value = "The dispatch jobs to create for this route.")
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

