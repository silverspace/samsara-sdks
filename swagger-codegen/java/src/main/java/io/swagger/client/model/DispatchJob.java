/*
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DispatchJobCreate;
import io.swagger.client.model.JobStatus;
import java.io.IOException;

/**
 * DispatchJob
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-01T04:19:45.344Z")
public class DispatchJob {
  @SerializedName("destination_address")
  private String destinationAddress = null;

  @SerializedName("destination_address_id")
  private Long destinationAddressId = null;

  @SerializedName("destination_lat")
  private Double destinationLat = null;

  @SerializedName("destination_lng")
  private Double destinationLng = null;

  @SerializedName("destination_name")
  private String destinationName = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("scheduled_arrival_time_ms")
  private Long scheduledArrivalTimeMs = null;

  @SerializedName("scheduled_departure_time_ms")
  private Long scheduledDepartureTimeMs = null;

  @SerializedName("arrived_at_ms")
  private Long arrivedAtMs = null;

  @SerializedName("completed_at_ms")
  private Long completedAtMs = null;

  @SerializedName("dispatch_route_id")
  private Long dispatchRouteId = null;

  @SerializedName("driver_id")
  private Long driverId = null;

  @SerializedName("en_route_at_ms")
  private Long enRouteAtMs = null;

  @SerializedName("estimated_arrival_ms")
  private Long estimatedArrivalMs = null;

  @SerializedName("fleet_viewer_url")
  private String fleetViewerUrl = null;

  @SerializedName("group_id")
  private Long groupId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("job_state")
  private JobStatus jobState = null;

  @SerializedName("skipped_at_ms")
  private Long skippedAtMs = null;

  @SerializedName("vehicle_id")
  private Long vehicleId = null;

  public DispatchJob destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

   /**
   * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
   * @return destinationAddress
  **/
  @ApiModelProperty(example = "123 Main St, Philadelphia, PA 19106", value = "The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.")
  public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public DispatchJob destinationAddressId(Long destinationAddressId) {
    this.destinationAddressId = destinationAddressId;
    return this;
  }

   /**
   * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
   * @return destinationAddressId
  **/
  @ApiModelProperty(example = "67890", value = "ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.")
  public Long getDestinationAddressId() {
    return destinationAddressId;
  }

  public void setDestinationAddressId(Long destinationAddressId) {
    this.destinationAddressId = destinationAddressId;
  }

  public DispatchJob destinationLat(Double destinationLat) {
    this.destinationLat = destinationLat;
    return this;
  }

   /**
   * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   * @return destinationLat
  **/
  @ApiModelProperty(example = "123.456", value = "Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.")
  public Double getDestinationLat() {
    return destinationLat;
  }

  public void setDestinationLat(Double destinationLat) {
    this.destinationLat = destinationLat;
  }

  public DispatchJob destinationLng(Double destinationLng) {
    this.destinationLng = destinationLng;
    return this;
  }

   /**
   * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   * @return destinationLng
  **/
  @ApiModelProperty(example = "37.459", value = "Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.")
  public Double getDestinationLng() {
    return destinationLng;
  }

  public void setDestinationLng(Double destinationLng) {
    this.destinationLng = destinationLng;
  }

  public DispatchJob destinationName(String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

   /**
   * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
   * @return destinationName
  **/
  @ApiModelProperty(example = "ACME Inc. Philadelphia HQ", value = "The name of the job destination. If provided, it will take precedence over the name of the address book entry.")
  public String getDestinationName() {
    return destinationName;
  }

  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  public DispatchJob notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes regarding the details of this job.
   * @return notes
  **/
  @ApiModelProperty(example = "Ensure crates are stacked no more than 3 high.", value = "Notes regarding the details of this job.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DispatchJob scheduledArrivalTimeMs(Long scheduledArrivalTimeMs) {
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
    return this;
  }

   /**
   * The time at which the assigned driver is scheduled to arrive at the job destination.
   * @return scheduledArrivalTimeMs
  **/
  @ApiModelProperty(example = "1462881998034", required = true, value = "The time at which the assigned driver is scheduled to arrive at the job destination.")
  public Long getScheduledArrivalTimeMs() {
    return scheduledArrivalTimeMs;
  }

  public void setScheduledArrivalTimeMs(Long scheduledArrivalTimeMs) {
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
  }

  public DispatchJob scheduledDepartureTimeMs(Long scheduledDepartureTimeMs) {
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
    return this;
  }

   /**
   * The time at which the assigned driver is scheduled to depart from the job destination.
   * @return scheduledDepartureTimeMs
  **/
  @ApiModelProperty(example = "1462881998034", value = "The time at which the assigned driver is scheduled to depart from the job destination.")
  public Long getScheduledDepartureTimeMs() {
    return scheduledDepartureTimeMs;
  }

  public void setScheduledDepartureTimeMs(Long scheduledDepartureTimeMs) {
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
  }

  public DispatchJob arrivedAtMs(Long arrivedAtMs) {
    this.arrivedAtMs = arrivedAtMs;
    return this;
  }

   /**
   * The time at which the driver arrived at the job destination.
   * @return arrivedAtMs
  **/
  @ApiModelProperty(example = "1462881998034", value = "The time at which the driver arrived at the job destination.")
  public Long getArrivedAtMs() {
    return arrivedAtMs;
  }

  public void setArrivedAtMs(Long arrivedAtMs) {
    this.arrivedAtMs = arrivedAtMs;
  }

  public DispatchJob completedAtMs(Long completedAtMs) {
    this.completedAtMs = completedAtMs;
    return this;
  }

   /**
   * The time at which the job was marked complete (e.g. started driving to the next destination).
   * @return completedAtMs
  **/
  @ApiModelProperty(example = "1462881998034", value = "The time at which the job was marked complete (e.g. started driving to the next destination).")
  public Long getCompletedAtMs() {
    return completedAtMs;
  }

  public void setCompletedAtMs(Long completedAtMs) {
    this.completedAtMs = completedAtMs;
  }

  public DispatchJob dispatchRouteId(Long dispatchRouteId) {
    this.dispatchRouteId = dispatchRouteId;
    return this;
  }

   /**
   * ID of the route that this job belongs to.
   * @return dispatchRouteId
  **/
  @ApiModelProperty(example = "55", required = true, value = "ID of the route that this job belongs to.")
  public Long getDispatchRouteId() {
    return dispatchRouteId;
  }

  public void setDispatchRouteId(Long dispatchRouteId) {
    this.dispatchRouteId = dispatchRouteId;
  }

  public DispatchJob driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * ID of the driver assigned to the dispatch job.
   * @return driverId
  **/
  @ApiModelProperty(example = "444", value = "ID of the driver assigned to the dispatch job.")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public DispatchJob enRouteAtMs(Long enRouteAtMs) {
    this.enRouteAtMs = enRouteAtMs;
    return this;
  }

   /**
   * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
   * @return enRouteAtMs
  **/
  @ApiModelProperty(example = "1462881998034", value = "The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).")
  public Long getEnRouteAtMs() {
    return enRouteAtMs;
  }

  public void setEnRouteAtMs(Long enRouteAtMs) {
    this.enRouteAtMs = enRouteAtMs;
  }

  public DispatchJob estimatedArrivalMs(Long estimatedArrivalMs) {
    this.estimatedArrivalMs = estimatedArrivalMs;
    return this;
  }

   /**
   * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
   * @return estimatedArrivalMs
  **/
  @ApiModelProperty(example = "1462881998034", value = "The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.")
  public Long getEstimatedArrivalMs() {
    return estimatedArrivalMs;
  }

  public void setEstimatedArrivalMs(Long estimatedArrivalMs) {
    this.estimatedArrivalMs = estimatedArrivalMs;
  }

  public DispatchJob fleetViewerUrl(String fleetViewerUrl) {
    this.fleetViewerUrl = fleetViewerUrl;
    return this;
  }

   /**
   * Fleet viewer url of the dispatch job.
   * @return fleetViewerUrl
  **/
  @ApiModelProperty(example = "https://cloud.samsara.com/fleet/viewer/job/fleet_viewer_token", value = "Fleet viewer url of the dispatch job.")
  public String getFleetViewerUrl() {
    return fleetViewerUrl;
  }

  public void setFleetViewerUrl(String fleetViewerUrl) {
    this.fleetViewerUrl = fleetViewerUrl;
  }

  public DispatchJob groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(example = "101", required = true, value = "")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DispatchJob id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the Samsara dispatch job.
   * @return id
  **/
  @ApiModelProperty(example = "773", required = true, value = "ID of the Samsara dispatch job.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DispatchJob jobState(JobStatus jobState) {
    this.jobState = jobState;
    return this;
  }

   /**
   * Get jobState
   * @return jobState
  **/
  @ApiModelProperty(required = true, value = "")
  public JobStatus getJobState() {
    return jobState;
  }

  public void setJobState(JobStatus jobState) {
    this.jobState = jobState;
  }

  public DispatchJob skippedAtMs(Long skippedAtMs) {
    this.skippedAtMs = skippedAtMs;
    return this;
  }

   /**
   * The time at which the job was marked skipped.
   * @return skippedAtMs
  **/
  @ApiModelProperty(example = "1462881998034", value = "The time at which the job was marked skipped.")
  public Long getSkippedAtMs() {
    return skippedAtMs;
  }

  public void setSkippedAtMs(Long skippedAtMs) {
    this.skippedAtMs = skippedAtMs;
  }

  public DispatchJob vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * ID of the vehicle used for the dispatch job.
   * @return vehicleId
  **/
  @ApiModelProperty(example = "112", value = "ID of the vehicle used for the dispatch job.")
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchJob dispatchJob = (DispatchJob) o;
    return Objects.equals(this.destinationAddress, dispatchJob.destinationAddress) &&
        Objects.equals(this.destinationAddressId, dispatchJob.destinationAddressId) &&
        Objects.equals(this.destinationLat, dispatchJob.destinationLat) &&
        Objects.equals(this.destinationLng, dispatchJob.destinationLng) &&
        Objects.equals(this.destinationName, dispatchJob.destinationName) &&
        Objects.equals(this.notes, dispatchJob.notes) &&
        Objects.equals(this.scheduledArrivalTimeMs, dispatchJob.scheduledArrivalTimeMs) &&
        Objects.equals(this.scheduledDepartureTimeMs, dispatchJob.scheduledDepartureTimeMs) &&
        Objects.equals(this.arrivedAtMs, dispatchJob.arrivedAtMs) &&
        Objects.equals(this.completedAtMs, dispatchJob.completedAtMs) &&
        Objects.equals(this.dispatchRouteId, dispatchJob.dispatchRouteId) &&
        Objects.equals(this.driverId, dispatchJob.driverId) &&
        Objects.equals(this.enRouteAtMs, dispatchJob.enRouteAtMs) &&
        Objects.equals(this.estimatedArrivalMs, dispatchJob.estimatedArrivalMs) &&
        Objects.equals(this.fleetViewerUrl, dispatchJob.fleetViewerUrl) &&
        Objects.equals(this.groupId, dispatchJob.groupId) &&
        Objects.equals(this.id, dispatchJob.id) &&
        Objects.equals(this.jobState, dispatchJob.jobState) &&
        Objects.equals(this.skippedAtMs, dispatchJob.skippedAtMs) &&
        Objects.equals(this.vehicleId, dispatchJob.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationAddress, destinationAddressId, destinationLat, destinationLng, destinationName, notes, scheduledArrivalTimeMs, scheduledDepartureTimeMs, arrivedAtMs, completedAtMs, dispatchRouteId, driverId, enRouteAtMs, estimatedArrivalMs, fleetViewerUrl, groupId, id, jobState, skippedAtMs, vehicleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatchJob {\n");
    
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    destinationAddressId: ").append(toIndentedString(destinationAddressId)).append("\n");
    sb.append("    destinationLat: ").append(toIndentedString(destinationLat)).append("\n");
    sb.append("    destinationLng: ").append(toIndentedString(destinationLng)).append("\n");
    sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    scheduledArrivalTimeMs: ").append(toIndentedString(scheduledArrivalTimeMs)).append("\n");
    sb.append("    scheduledDepartureTimeMs: ").append(toIndentedString(scheduledDepartureTimeMs)).append("\n");
    sb.append("    arrivedAtMs: ").append(toIndentedString(arrivedAtMs)).append("\n");
    sb.append("    completedAtMs: ").append(toIndentedString(completedAtMs)).append("\n");
    sb.append("    dispatchRouteId: ").append(toIndentedString(dispatchRouteId)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    enRouteAtMs: ").append(toIndentedString(enRouteAtMs)).append("\n");
    sb.append("    estimatedArrivalMs: ").append(toIndentedString(estimatedArrivalMs)).append("\n");
    sb.append("    fleetViewerUrl: ").append(toIndentedString(fleetViewerUrl)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
    sb.append("    skippedAtMs: ").append(toIndentedString(skippedAtMs)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
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

