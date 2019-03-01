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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class HosLogsResponseLogs {
  
  @SerializedName("locLng")
  private Double locLng = null;
  @SerializedName("logStartMs")
  private Long logStartMs = null;
  @SerializedName("driverId")
  private Long driverId = null;
  @SerializedName("statusType")
  private String statusType = null;
  @SerializedName("locCity")
  private String locCity = null;
  @SerializedName("groupId")
  private Long groupId = null;
  @SerializedName("locName")
  private String locName = null;
  @SerializedName("locLat")
  private Double locLat = null;
  @SerializedName("remark")
  private String remark = null;
  @SerializedName("locState")
  private String locState = null;
  @SerializedName("vehicleId")
  private Long vehicleId = null;
  @SerializedName("codriverIds")
  private List<Long> codriverIds = null;

  /**
   * Longitude at which the log was recorded.
   **/
  @ApiModelProperty(value = "Longitude at which the log was recorded.")
  public Double getLocLng() {
    return locLng;
  }
  public void setLocLng(Double locLng) {
    this.locLng = locLng;
  }

  /**
   * The time at which the log/HOS status started in UNIX milliseconds.
   **/
  @ApiModelProperty(value = "The time at which the log/HOS status started in UNIX milliseconds.")
  public Long getLogStartMs() {
    return logStartMs;
  }
  public void setLogStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
  }

  /**
   * ID of the driver.
   **/
  @ApiModelProperty(value = "ID of the driver.")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  /**
   * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
   **/
  @ApiModelProperty(value = "The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.")
  public String getStatusType() {
    return statusType;
  }
  public void setStatusType(String statusType) {
    this.statusType = statusType;
  }

  /**
   * City in which the log was recorded.
   **/
  @ApiModelProperty(value = "City in which the log was recorded.")
  public String getLocCity() {
    return locCity;
  }
  public void setLocCity(String locCity) {
    this.locCity = locCity;
  }

  /**
   * ID of the group.
   **/
  @ApiModelProperty(value = "ID of the group.")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * Name of location at which the log was recorded.
   **/
  @ApiModelProperty(value = "Name of location at which the log was recorded.")
  public String getLocName() {
    return locName;
  }
  public void setLocName(String locName) {
    this.locName = locName;
  }

  /**
   * Latitude at which the log was recorded.
   **/
  @ApiModelProperty(value = "Latitude at which the log was recorded.")
  public Double getLocLat() {
    return locLat;
  }
  public void setLocLat(Double locLat) {
    this.locLat = locLat;
  }

  /**
   * Remark associated with the log entry.
   **/
  @ApiModelProperty(value = "Remark associated with the log entry.")
  public String getRemark() {
    return remark;
  }
  public void setRemark(String remark) {
    this.remark = remark;
  }

  /**
   * State in which the log was recorded.
   **/
  @ApiModelProperty(value = "State in which the log was recorded.")
  public String getLocState() {
    return locState;
  }
  public void setLocState(String locState) {
    this.locState = locState;
  }

  /**
   * ID of the vehicle.
   **/
  @ApiModelProperty(value = "ID of the vehicle.")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Long> getCodriverIds() {
    return codriverIds;
  }
  public void setCodriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosLogsResponseLogs hosLogsResponseLogs = (HosLogsResponseLogs) o;
    return (this.locLng == null ? hosLogsResponseLogs.locLng == null : this.locLng.equals(hosLogsResponseLogs.locLng)) &&
        (this.logStartMs == null ? hosLogsResponseLogs.logStartMs == null : this.logStartMs.equals(hosLogsResponseLogs.logStartMs)) &&
        (this.driverId == null ? hosLogsResponseLogs.driverId == null : this.driverId.equals(hosLogsResponseLogs.driverId)) &&
        (this.statusType == null ? hosLogsResponseLogs.statusType == null : this.statusType.equals(hosLogsResponseLogs.statusType)) &&
        (this.locCity == null ? hosLogsResponseLogs.locCity == null : this.locCity.equals(hosLogsResponseLogs.locCity)) &&
        (this.groupId == null ? hosLogsResponseLogs.groupId == null : this.groupId.equals(hosLogsResponseLogs.groupId)) &&
        (this.locName == null ? hosLogsResponseLogs.locName == null : this.locName.equals(hosLogsResponseLogs.locName)) &&
        (this.locLat == null ? hosLogsResponseLogs.locLat == null : this.locLat.equals(hosLogsResponseLogs.locLat)) &&
        (this.remark == null ? hosLogsResponseLogs.remark == null : this.remark.equals(hosLogsResponseLogs.remark)) &&
        (this.locState == null ? hosLogsResponseLogs.locState == null : this.locState.equals(hosLogsResponseLogs.locState)) &&
        (this.vehicleId == null ? hosLogsResponseLogs.vehicleId == null : this.vehicleId.equals(hosLogsResponseLogs.vehicleId)) &&
        (this.codriverIds == null ? hosLogsResponseLogs.codriverIds == null : this.codriverIds.equals(hosLogsResponseLogs.codriverIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.locLng == null ? 0: this.locLng.hashCode());
    result = 31 * result + (this.logStartMs == null ? 0: this.logStartMs.hashCode());
    result = 31 * result + (this.driverId == null ? 0: this.driverId.hashCode());
    result = 31 * result + (this.statusType == null ? 0: this.statusType.hashCode());
    result = 31 * result + (this.locCity == null ? 0: this.locCity.hashCode());
    result = 31 * result + (this.groupId == null ? 0: this.groupId.hashCode());
    result = 31 * result + (this.locName == null ? 0: this.locName.hashCode());
    result = 31 * result + (this.locLat == null ? 0: this.locLat.hashCode());
    result = 31 * result + (this.remark == null ? 0: this.remark.hashCode());
    result = 31 * result + (this.locState == null ? 0: this.locState.hashCode());
    result = 31 * result + (this.vehicleId == null ? 0: this.vehicleId.hashCode());
    result = 31 * result + (this.codriverIds == null ? 0: this.codriverIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsResponseLogs {\n");
    
    sb.append("  locLng: ").append(locLng).append("\n");
    sb.append("  logStartMs: ").append(logStartMs).append("\n");
    sb.append("  driverId: ").append(driverId).append("\n");
    sb.append("  statusType: ").append(statusType).append("\n");
    sb.append("  locCity: ").append(locCity).append("\n");
    sb.append("  groupId: ").append(groupId).append("\n");
    sb.append("  locName: ").append(locName).append("\n");
    sb.append("  locLat: ").append(locLat).append("\n");
    sb.append("  remark: ").append(remark).append("\n");
    sb.append("  locState: ").append(locState).append("\n");
    sb.append("  vehicleId: ").append(vehicleId).append("\n");
    sb.append("  codriverIds: ").append(codriverIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
