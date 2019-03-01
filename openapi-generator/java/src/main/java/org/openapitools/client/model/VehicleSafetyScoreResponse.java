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
import org.openapitools.client.model.SafetyReportHarshEvent;

/**
 * Safety score details for a vehicle
 */
@ApiModel(description = "Safety score details for a vehicle")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-01T05:34:00.976Z[GMT]")
public class VehicleSafetyScoreResponse {
  public static final String SERIALIZED_NAME_CRASH_COUNT = "crashCount";
  @SerializedName(SERIALIZED_NAME_CRASH_COUNT)
  private Integer crashCount;

  public static final String SERIALIZED_NAME_HARSH_ACCEL_COUNT = "harshAccelCount";
  @SerializedName(SERIALIZED_NAME_HARSH_ACCEL_COUNT)
  private Integer harshAccelCount;

  public static final String SERIALIZED_NAME_HARSH_BRAKING_COUNT = "harshBrakingCount";
  @SerializedName(SERIALIZED_NAME_HARSH_BRAKING_COUNT)
  private Integer harshBrakingCount;

  public static final String SERIALIZED_NAME_HARSH_EVENTS = "harshEvents";
  @SerializedName(SERIALIZED_NAME_HARSH_EVENTS)
  private List<SafetyReportHarshEvent> harshEvents = new ArrayList<SafetyReportHarshEvent>();

  public static final String SERIALIZED_NAME_HARSH_TURNING_COUNT = "harshTurningCount";
  @SerializedName(SERIALIZED_NAME_HARSH_TURNING_COUNT)
  private Integer harshTurningCount;

  public static final String SERIALIZED_NAME_SAFETY_SCORE = "safetyScore";
  @SerializedName(SERIALIZED_NAME_SAFETY_SCORE)
  private Integer safetyScore;

  public static final String SERIALIZED_NAME_SAFETY_SCORE_RANK = "safetyScoreRank";
  @SerializedName(SERIALIZED_NAME_SAFETY_SCORE_RANK)
  private String safetyScoreRank;

  public static final String SERIALIZED_NAME_TIME_OVER_SPEED_LIMIT_MS = "timeOverSpeedLimitMs";
  @SerializedName(SERIALIZED_NAME_TIME_OVER_SPEED_LIMIT_MS)
  private Integer timeOverSpeedLimitMs;

  public static final String SERIALIZED_NAME_TOTAL_DISTANCE_DRIVEN_METERS = "totalDistanceDrivenMeters";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISTANCE_DRIVEN_METERS)
  private Integer totalDistanceDrivenMeters;

  public static final String SERIALIZED_NAME_TOTAL_HARSH_EVENT_COUNT = "totalHarshEventCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_HARSH_EVENT_COUNT)
  private Integer totalHarshEventCount;

  public static final String SERIALIZED_NAME_TOTAL_TIME_DRIVEN_MS = "totalTimeDrivenMs";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIME_DRIVEN_MS)
  private Integer totalTimeDrivenMs;

  public static final String SERIALIZED_NAME_VEHICLE_ID = "vehicleId";
  @SerializedName(SERIALIZED_NAME_VEHICLE_ID)
  private Integer vehicleId;

  public VehicleSafetyScoreResponse crashCount(Integer crashCount) {
    this.crashCount = crashCount;
    return this;
  }

   /**
   * Crash event count
   * @return crashCount
  **/
  @ApiModelProperty(example = "0", value = "Crash event count")
  public Integer getCrashCount() {
    return crashCount;
  }

  public void setCrashCount(Integer crashCount) {
    this.crashCount = crashCount;
  }

  public VehicleSafetyScoreResponse harshAccelCount(Integer harshAccelCount) {
    this.harshAccelCount = harshAccelCount;
    return this;
  }

   /**
   * Harsh acceleration event count
   * @return harshAccelCount
  **/
  @ApiModelProperty(example = "1", value = "Harsh acceleration event count")
  public Integer getHarshAccelCount() {
    return harshAccelCount;
  }

  public void setHarshAccelCount(Integer harshAccelCount) {
    this.harshAccelCount = harshAccelCount;
  }

  public VehicleSafetyScoreResponse harshBrakingCount(Integer harshBrakingCount) {
    this.harshBrakingCount = harshBrakingCount;
    return this;
  }

   /**
   * Harsh braking event count
   * @return harshBrakingCount
  **/
  @ApiModelProperty(example = "2", value = "Harsh braking event count")
  public Integer getHarshBrakingCount() {
    return harshBrakingCount;
  }

  public void setHarshBrakingCount(Integer harshBrakingCount) {
    this.harshBrakingCount = harshBrakingCount;
  }

  public VehicleSafetyScoreResponse harshEvents(List<SafetyReportHarshEvent> harshEvents) {
    this.harshEvents = harshEvents;
    return this;
  }

  public VehicleSafetyScoreResponse addHarshEventsItem(SafetyReportHarshEvent harshEventsItem) {
    if (this.harshEvents == null) {
      this.harshEvents = new ArrayList<SafetyReportHarshEvent>();
    }
    this.harshEvents.add(harshEventsItem);
    return this;
  }

   /**
   * Get harshEvents
   * @return harshEvents
  **/
  @ApiModelProperty(value = "")
  public List<SafetyReportHarshEvent> getHarshEvents() {
    return harshEvents;
  }

  public void setHarshEvents(List<SafetyReportHarshEvent> harshEvents) {
    this.harshEvents = harshEvents;
  }

  public VehicleSafetyScoreResponse harshTurningCount(Integer harshTurningCount) {
    this.harshTurningCount = harshTurningCount;
    return this;
  }

   /**
   * Harsh turning event count
   * @return harshTurningCount
  **/
  @ApiModelProperty(example = "0", value = "Harsh turning event count")
  public Integer getHarshTurningCount() {
    return harshTurningCount;
  }

  public void setHarshTurningCount(Integer harshTurningCount) {
    this.harshTurningCount = harshTurningCount;
  }

  public VehicleSafetyScoreResponse safetyScore(Integer safetyScore) {
    this.safetyScore = safetyScore;
    return this;
  }

   /**
   * Safety Score
   * @return safetyScore
  **/
  @ApiModelProperty(example = "97", value = "Safety Score")
  public Integer getSafetyScore() {
    return safetyScore;
  }

  public void setSafetyScore(Integer safetyScore) {
    this.safetyScore = safetyScore;
  }

  public VehicleSafetyScoreResponse safetyScoreRank(String safetyScoreRank) {
    this.safetyScoreRank = safetyScoreRank;
    return this;
  }

   /**
   * Safety Score Rank
   * @return safetyScoreRank
  **/
  @ApiModelProperty(example = "26", value = "Safety Score Rank")
  public String getSafetyScoreRank() {
    return safetyScoreRank;
  }

  public void setSafetyScoreRank(String safetyScoreRank) {
    this.safetyScoreRank = safetyScoreRank;
  }

  public VehicleSafetyScoreResponse timeOverSpeedLimitMs(Integer timeOverSpeedLimitMs) {
    this.timeOverSpeedLimitMs = timeOverSpeedLimitMs;
    return this;
  }

   /**
   * Amount of time driven over the speed limit in milliseconds
   * @return timeOverSpeedLimitMs
  **/
  @ApiModelProperty(example = "3769", value = "Amount of time driven over the speed limit in milliseconds")
  public Integer getTimeOverSpeedLimitMs() {
    return timeOverSpeedLimitMs;
  }

  public void setTimeOverSpeedLimitMs(Integer timeOverSpeedLimitMs) {
    this.timeOverSpeedLimitMs = timeOverSpeedLimitMs;
  }

  public VehicleSafetyScoreResponse totalDistanceDrivenMeters(Integer totalDistanceDrivenMeters) {
    this.totalDistanceDrivenMeters = totalDistanceDrivenMeters;
    return this;
  }

   /**
   * Total distance driven in meters
   * @return totalDistanceDrivenMeters
  **/
  @ApiModelProperty(example = "291836", value = "Total distance driven in meters")
  public Integer getTotalDistanceDrivenMeters() {
    return totalDistanceDrivenMeters;
  }

  public void setTotalDistanceDrivenMeters(Integer totalDistanceDrivenMeters) {
    this.totalDistanceDrivenMeters = totalDistanceDrivenMeters;
  }

  public VehicleSafetyScoreResponse totalHarshEventCount(Integer totalHarshEventCount) {
    this.totalHarshEventCount = totalHarshEventCount;
    return this;
  }

   /**
   * Total harsh event count
   * @return totalHarshEventCount
  **/
  @ApiModelProperty(example = "3", value = "Total harsh event count")
  public Integer getTotalHarshEventCount() {
    return totalHarshEventCount;
  }

  public void setTotalHarshEventCount(Integer totalHarshEventCount) {
    this.totalHarshEventCount = totalHarshEventCount;
  }

  public VehicleSafetyScoreResponse totalTimeDrivenMs(Integer totalTimeDrivenMs) {
    this.totalTimeDrivenMs = totalTimeDrivenMs;
    return this;
  }

   /**
   * Amount of time driven in milliseconds
   * @return totalTimeDrivenMs
  **/
  @ApiModelProperty(example = "19708293", value = "Amount of time driven in milliseconds")
  public Integer getTotalTimeDrivenMs() {
    return totalTimeDrivenMs;
  }

  public void setTotalTimeDrivenMs(Integer totalTimeDrivenMs) {
    this.totalTimeDrivenMs = totalTimeDrivenMs;
  }

  public VehicleSafetyScoreResponse vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Vehicle ID
   * @return vehicleId
  **/
  @ApiModelProperty(example = "4321", value = "Vehicle ID")
  public Integer getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Integer vehicleId) {
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
    VehicleSafetyScoreResponse vehicleSafetyScoreResponse = (VehicleSafetyScoreResponse) o;
    return Objects.equals(this.crashCount, vehicleSafetyScoreResponse.crashCount) &&
        Objects.equals(this.harshAccelCount, vehicleSafetyScoreResponse.harshAccelCount) &&
        Objects.equals(this.harshBrakingCount, vehicleSafetyScoreResponse.harshBrakingCount) &&
        Objects.equals(this.harshEvents, vehicleSafetyScoreResponse.harshEvents) &&
        Objects.equals(this.harshTurningCount, vehicleSafetyScoreResponse.harshTurningCount) &&
        Objects.equals(this.safetyScore, vehicleSafetyScoreResponse.safetyScore) &&
        Objects.equals(this.safetyScoreRank, vehicleSafetyScoreResponse.safetyScoreRank) &&
        Objects.equals(this.timeOverSpeedLimitMs, vehicleSafetyScoreResponse.timeOverSpeedLimitMs) &&
        Objects.equals(this.totalDistanceDrivenMeters, vehicleSafetyScoreResponse.totalDistanceDrivenMeters) &&
        Objects.equals(this.totalHarshEventCount, vehicleSafetyScoreResponse.totalHarshEventCount) &&
        Objects.equals(this.totalTimeDrivenMs, vehicleSafetyScoreResponse.totalTimeDrivenMs) &&
        Objects.equals(this.vehicleId, vehicleSafetyScoreResponse.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crashCount, harshAccelCount, harshBrakingCount, harshEvents, harshTurningCount, safetyScore, safetyScoreRank, timeOverSpeedLimitMs, totalDistanceDrivenMeters, totalHarshEventCount, totalTimeDrivenMs, vehicleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleSafetyScoreResponse {\n");
    sb.append("    crashCount: ").append(toIndentedString(crashCount)).append("\n");
    sb.append("    harshAccelCount: ").append(toIndentedString(harshAccelCount)).append("\n");
    sb.append("    harshBrakingCount: ").append(toIndentedString(harshBrakingCount)).append("\n");
    sb.append("    harshEvents: ").append(toIndentedString(harshEvents)).append("\n");
    sb.append("    harshTurningCount: ").append(toIndentedString(harshTurningCount)).append("\n");
    sb.append("    safetyScore: ").append(toIndentedString(safetyScore)).append("\n");
    sb.append("    safetyScoreRank: ").append(toIndentedString(safetyScoreRank)).append("\n");
    sb.append("    timeOverSpeedLimitMs: ").append(toIndentedString(timeOverSpeedLimitMs)).append("\n");
    sb.append("    totalDistanceDrivenMeters: ").append(toIndentedString(totalDistanceDrivenMeters)).append("\n");
    sb.append("    totalHarshEventCount: ").append(toIndentedString(totalHarshEventCount)).append("\n");
    sb.append("    totalTimeDrivenMs: ").append(toIndentedString(totalTimeDrivenMs)).append("\n");
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

