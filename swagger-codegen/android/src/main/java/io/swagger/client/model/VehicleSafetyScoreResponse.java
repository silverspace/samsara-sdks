/**
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

import io.swagger.client.model.SafetyReportHarshEvent;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Safety score details for a vehicle
 **/
@ApiModel(description = "Safety score details for a vehicle")
public class VehicleSafetyScoreResponse {
  
  @SerializedName("crashCount")
  private Integer crashCount = null;
  @SerializedName("harshAccelCount")
  private Integer harshAccelCount = null;
  @SerializedName("harshBrakingCount")
  private Integer harshBrakingCount = null;
  @SerializedName("harshEvents")
  private List<SafetyReportHarshEvent> harshEvents = null;
  @SerializedName("harshTurningCount")
  private Integer harshTurningCount = null;
  @SerializedName("safetyScore")
  private Integer safetyScore = null;
  @SerializedName("safetyScoreRank")
  private String safetyScoreRank = null;
  @SerializedName("timeOverSpeedLimitMs")
  private Integer timeOverSpeedLimitMs = null;
  @SerializedName("totalDistanceDrivenMeters")
  private Integer totalDistanceDrivenMeters = null;
  @SerializedName("totalHarshEventCount")
  private Integer totalHarshEventCount = null;
  @SerializedName("totalTimeDrivenMs")
  private Integer totalTimeDrivenMs = null;
  @SerializedName("vehicleId")
  private Integer vehicleId = null;

  /**
   * Crash event count
   **/
  @ApiModelProperty(value = "Crash event count")
  public Integer getCrashCount() {
    return crashCount;
  }
  public void setCrashCount(Integer crashCount) {
    this.crashCount = crashCount;
  }

  /**
   * Harsh acceleration event count
   **/
  @ApiModelProperty(value = "Harsh acceleration event count")
  public Integer getHarshAccelCount() {
    return harshAccelCount;
  }
  public void setHarshAccelCount(Integer harshAccelCount) {
    this.harshAccelCount = harshAccelCount;
  }

  /**
   * Harsh braking event count
   **/
  @ApiModelProperty(value = "Harsh braking event count")
  public Integer getHarshBrakingCount() {
    return harshBrakingCount;
  }
  public void setHarshBrakingCount(Integer harshBrakingCount) {
    this.harshBrakingCount = harshBrakingCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SafetyReportHarshEvent> getHarshEvents() {
    return harshEvents;
  }
  public void setHarshEvents(List<SafetyReportHarshEvent> harshEvents) {
    this.harshEvents = harshEvents;
  }

  /**
   * Harsh turning event count
   **/
  @ApiModelProperty(value = "Harsh turning event count")
  public Integer getHarshTurningCount() {
    return harshTurningCount;
  }
  public void setHarshTurningCount(Integer harshTurningCount) {
    this.harshTurningCount = harshTurningCount;
  }

  /**
   * Safety Score
   **/
  @ApiModelProperty(value = "Safety Score")
  public Integer getSafetyScore() {
    return safetyScore;
  }
  public void setSafetyScore(Integer safetyScore) {
    this.safetyScore = safetyScore;
  }

  /**
   * Safety Score Rank
   **/
  @ApiModelProperty(value = "Safety Score Rank")
  public String getSafetyScoreRank() {
    return safetyScoreRank;
  }
  public void setSafetyScoreRank(String safetyScoreRank) {
    this.safetyScoreRank = safetyScoreRank;
  }

  /**
   * Amount of time driven over the speed limit in milliseconds
   **/
  @ApiModelProperty(value = "Amount of time driven over the speed limit in milliseconds")
  public Integer getTimeOverSpeedLimitMs() {
    return timeOverSpeedLimitMs;
  }
  public void setTimeOverSpeedLimitMs(Integer timeOverSpeedLimitMs) {
    this.timeOverSpeedLimitMs = timeOverSpeedLimitMs;
  }

  /**
   * Total distance driven in meters
   **/
  @ApiModelProperty(value = "Total distance driven in meters")
  public Integer getTotalDistanceDrivenMeters() {
    return totalDistanceDrivenMeters;
  }
  public void setTotalDistanceDrivenMeters(Integer totalDistanceDrivenMeters) {
    this.totalDistanceDrivenMeters = totalDistanceDrivenMeters;
  }

  /**
   * Total harsh event count
   **/
  @ApiModelProperty(value = "Total harsh event count")
  public Integer getTotalHarshEventCount() {
    return totalHarshEventCount;
  }
  public void setTotalHarshEventCount(Integer totalHarshEventCount) {
    this.totalHarshEventCount = totalHarshEventCount;
  }

  /**
   * Amount of time driven in milliseconds
   **/
  @ApiModelProperty(value = "Amount of time driven in milliseconds")
  public Integer getTotalTimeDrivenMs() {
    return totalTimeDrivenMs;
  }
  public void setTotalTimeDrivenMs(Integer totalTimeDrivenMs) {
    this.totalTimeDrivenMs = totalTimeDrivenMs;
  }

  /**
   * Vehicle ID
   **/
  @ApiModelProperty(value = "Vehicle ID")
  public Integer getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleSafetyScoreResponse vehicleSafetyScoreResponse = (VehicleSafetyScoreResponse) o;
    return (this.crashCount == null ? vehicleSafetyScoreResponse.crashCount == null : this.crashCount.equals(vehicleSafetyScoreResponse.crashCount)) &&
        (this.harshAccelCount == null ? vehicleSafetyScoreResponse.harshAccelCount == null : this.harshAccelCount.equals(vehicleSafetyScoreResponse.harshAccelCount)) &&
        (this.harshBrakingCount == null ? vehicleSafetyScoreResponse.harshBrakingCount == null : this.harshBrakingCount.equals(vehicleSafetyScoreResponse.harshBrakingCount)) &&
        (this.harshEvents == null ? vehicleSafetyScoreResponse.harshEvents == null : this.harshEvents.equals(vehicleSafetyScoreResponse.harshEvents)) &&
        (this.harshTurningCount == null ? vehicleSafetyScoreResponse.harshTurningCount == null : this.harshTurningCount.equals(vehicleSafetyScoreResponse.harshTurningCount)) &&
        (this.safetyScore == null ? vehicleSafetyScoreResponse.safetyScore == null : this.safetyScore.equals(vehicleSafetyScoreResponse.safetyScore)) &&
        (this.safetyScoreRank == null ? vehicleSafetyScoreResponse.safetyScoreRank == null : this.safetyScoreRank.equals(vehicleSafetyScoreResponse.safetyScoreRank)) &&
        (this.timeOverSpeedLimitMs == null ? vehicleSafetyScoreResponse.timeOverSpeedLimitMs == null : this.timeOverSpeedLimitMs.equals(vehicleSafetyScoreResponse.timeOverSpeedLimitMs)) &&
        (this.totalDistanceDrivenMeters == null ? vehicleSafetyScoreResponse.totalDistanceDrivenMeters == null : this.totalDistanceDrivenMeters.equals(vehicleSafetyScoreResponse.totalDistanceDrivenMeters)) &&
        (this.totalHarshEventCount == null ? vehicleSafetyScoreResponse.totalHarshEventCount == null : this.totalHarshEventCount.equals(vehicleSafetyScoreResponse.totalHarshEventCount)) &&
        (this.totalTimeDrivenMs == null ? vehicleSafetyScoreResponse.totalTimeDrivenMs == null : this.totalTimeDrivenMs.equals(vehicleSafetyScoreResponse.totalTimeDrivenMs)) &&
        (this.vehicleId == null ? vehicleSafetyScoreResponse.vehicleId == null : this.vehicleId.equals(vehicleSafetyScoreResponse.vehicleId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.crashCount == null ? 0: this.crashCount.hashCode());
    result = 31 * result + (this.harshAccelCount == null ? 0: this.harshAccelCount.hashCode());
    result = 31 * result + (this.harshBrakingCount == null ? 0: this.harshBrakingCount.hashCode());
    result = 31 * result + (this.harshEvents == null ? 0: this.harshEvents.hashCode());
    result = 31 * result + (this.harshTurningCount == null ? 0: this.harshTurningCount.hashCode());
    result = 31 * result + (this.safetyScore == null ? 0: this.safetyScore.hashCode());
    result = 31 * result + (this.safetyScoreRank == null ? 0: this.safetyScoreRank.hashCode());
    result = 31 * result + (this.timeOverSpeedLimitMs == null ? 0: this.timeOverSpeedLimitMs.hashCode());
    result = 31 * result + (this.totalDistanceDrivenMeters == null ? 0: this.totalDistanceDrivenMeters.hashCode());
    result = 31 * result + (this.totalHarshEventCount == null ? 0: this.totalHarshEventCount.hashCode());
    result = 31 * result + (this.totalTimeDrivenMs == null ? 0: this.totalTimeDrivenMs.hashCode());
    result = 31 * result + (this.vehicleId == null ? 0: this.vehicleId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleSafetyScoreResponse {\n");
    
    sb.append("  crashCount: ").append(crashCount).append("\n");
    sb.append("  harshAccelCount: ").append(harshAccelCount).append("\n");
    sb.append("  harshBrakingCount: ").append(harshBrakingCount).append("\n");
    sb.append("  harshEvents: ").append(harshEvents).append("\n");
    sb.append("  harshTurningCount: ").append(harshTurningCount).append("\n");
    sb.append("  safetyScore: ").append(safetyScore).append("\n");
    sb.append("  safetyScoreRank: ").append(safetyScoreRank).append("\n");
    sb.append("  timeOverSpeedLimitMs: ").append(timeOverSpeedLimitMs).append("\n");
    sb.append("  totalDistanceDrivenMeters: ").append(totalDistanceDrivenMeters).append("\n");
    sb.append("  totalHarshEventCount: ").append(totalHarshEventCount).append("\n");
    sb.append("  totalTimeDrivenMs: ").append(totalTimeDrivenMs).append("\n");
    sb.append("  vehicleId: ").append(vehicleId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
