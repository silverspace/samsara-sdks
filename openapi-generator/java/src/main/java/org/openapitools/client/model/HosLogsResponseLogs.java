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

/**
 * HosLogsResponseLogs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-01T05:34:00.976Z[GMT]")
public class HosLogsResponseLogs {
  public static final String SERIALIZED_NAME_LOC_LNG = "locLng";
  @SerializedName(SERIALIZED_NAME_LOC_LNG)
  private Double locLng;

  public static final String SERIALIZED_NAME_LOG_START_MS = "logStartMs";
  @SerializedName(SERIALIZED_NAME_LOG_START_MS)
  private Long logStartMs;

  public static final String SERIALIZED_NAME_DRIVER_ID = "driverId";
  @SerializedName(SERIALIZED_NAME_DRIVER_ID)
  private Long driverId;

  public static final String SERIALIZED_NAME_STATUS_TYPE = "statusType";
  @SerializedName(SERIALIZED_NAME_STATUS_TYPE)
  private String statusType;

  public static final String SERIALIZED_NAME_LOC_CITY = "locCity";
  @SerializedName(SERIALIZED_NAME_LOC_CITY)
  private String locCity;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_LOC_NAME = "locName";
  @SerializedName(SERIALIZED_NAME_LOC_NAME)
  private String locName;

  public static final String SERIALIZED_NAME_LOC_LAT = "locLat";
  @SerializedName(SERIALIZED_NAME_LOC_LAT)
  private Double locLat;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  public static final String SERIALIZED_NAME_LOC_STATE = "locState";
  @SerializedName(SERIALIZED_NAME_LOC_STATE)
  private String locState;

  public static final String SERIALIZED_NAME_VEHICLE_ID = "vehicleId";
  @SerializedName(SERIALIZED_NAME_VEHICLE_ID)
  private Long vehicleId;

  public static final String SERIALIZED_NAME_CODRIVER_IDS = "codriverIds";
  @SerializedName(SERIALIZED_NAME_CODRIVER_IDS)
  private List<Long> codriverIds = new ArrayList<Long>();

  public HosLogsResponseLogs locLng(Double locLng) {
    this.locLng = locLng;
    return this;
  }

   /**
   * Longitude at which the log was recorded.
   * @return locLng
  **/
  @ApiModelProperty(example = "-98.502888123", value = "Longitude at which the log was recorded.")
  public Double getLocLng() {
    return locLng;
  }

  public void setLocLng(Double locLng) {
    this.locLng = locLng;
  }

  public HosLogsResponseLogs logStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
    return this;
  }

   /**
   * The time at which the log/HOS status started in UNIX milliseconds.
   * @return logStartMs
  **/
  @ApiModelProperty(example = "1462881998034", value = "The time at which the log/HOS status started in UNIX milliseconds.")
  public Long getLogStartMs() {
    return logStartMs;
  }

  public void setLogStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
  }

  public HosLogsResponseLogs driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * ID of the driver.
   * @return driverId
  **/
  @ApiModelProperty(example = "444", value = "ID of the driver.")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public HosLogsResponseLogs statusType(String statusType) {
    this.statusType = statusType;
    return this;
  }

   /**
   * The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
   * @return statusType
  **/
  @ApiModelProperty(example = "OFF_DUTY", value = "The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.")
  public String getStatusType() {
    return statusType;
  }

  public void setStatusType(String statusType) {
    this.statusType = statusType;
  }

  public HosLogsResponseLogs locCity(String locCity) {
    this.locCity = locCity;
    return this;
  }

   /**
   * City in which the log was recorded.
   * @return locCity
  **/
  @ApiModelProperty(example = "Ahwatukee", value = "City in which the log was recorded.")
  public String getLocCity() {
    return locCity;
  }

  public void setLocCity(String locCity) {
    this.locCity = locCity;
  }

  public HosLogsResponseLogs groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * ID of the group.
   * @return groupId
  **/
  @ApiModelProperty(example = "101", value = "ID of the group.")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public HosLogsResponseLogs locName(String locName) {
    this.locName = locName;
    return this;
  }

   /**
   * Name of location at which the log was recorded.
   * @return locName
  **/
  @ApiModelProperty(example = "McLean Site A", value = "Name of location at which the log was recorded.")
  public String getLocName() {
    return locName;
  }

  public void setLocName(String locName) {
    this.locName = locName;
  }

  public HosLogsResponseLogs locLat(Double locLat) {
    this.locLat = locLat;
    return this;
  }

   /**
   * Latitude at which the log was recorded.
   * @return locLat
  **/
  @ApiModelProperty(example = "23.413702345", value = "Latitude at which the log was recorded.")
  public Double getLocLat() {
    return locLat;
  }

  public void setLocLat(Double locLat) {
    this.locLat = locLat;
  }

  public HosLogsResponseLogs remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * Remark associated with the log entry.
   * @return remark
  **/
  @ApiModelProperty(example = "Lunch Break", value = "Remark associated with the log entry.")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public HosLogsResponseLogs locState(String locState) {
    this.locState = locState;
    return this;
  }

   /**
   * State in which the log was recorded.
   * @return locState
  **/
  @ApiModelProperty(example = "Arizona", value = "State in which the log was recorded.")
  public String getLocState() {
    return locState;
  }

  public void setLocState(String locState) {
    this.locState = locState;
  }

  public HosLogsResponseLogs vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * ID of the vehicle.
   * @return vehicleId
  **/
  @ApiModelProperty(example = "112", value = "ID of the vehicle.")
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public HosLogsResponseLogs codriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
    return this;
  }

  public HosLogsResponseLogs addCodriverIdsItem(Long codriverIdsItem) {
    if (this.codriverIds == null) {
      this.codriverIds = new ArrayList<Long>();
    }
    this.codriverIds.add(codriverIdsItem);
    return this;
  }

   /**
   * Get codriverIds
   * @return codriverIds
  **/
  @ApiModelProperty(value = "")
  public List<Long> getCodriverIds() {
    return codriverIds;
  }

  public void setCodriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosLogsResponseLogs hosLogsResponseLogs = (HosLogsResponseLogs) o;
    return Objects.equals(this.locLng, hosLogsResponseLogs.locLng) &&
        Objects.equals(this.logStartMs, hosLogsResponseLogs.logStartMs) &&
        Objects.equals(this.driverId, hosLogsResponseLogs.driverId) &&
        Objects.equals(this.statusType, hosLogsResponseLogs.statusType) &&
        Objects.equals(this.locCity, hosLogsResponseLogs.locCity) &&
        Objects.equals(this.groupId, hosLogsResponseLogs.groupId) &&
        Objects.equals(this.locName, hosLogsResponseLogs.locName) &&
        Objects.equals(this.locLat, hosLogsResponseLogs.locLat) &&
        Objects.equals(this.remark, hosLogsResponseLogs.remark) &&
        Objects.equals(this.locState, hosLogsResponseLogs.locState) &&
        Objects.equals(this.vehicleId, hosLogsResponseLogs.vehicleId) &&
        Objects.equals(this.codriverIds, hosLogsResponseLogs.codriverIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locLng, logStartMs, driverId, statusType, locCity, groupId, locName, locLat, remark, locState, vehicleId, codriverIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsResponseLogs {\n");
    sb.append("    locLng: ").append(toIndentedString(locLng)).append("\n");
    sb.append("    logStartMs: ").append(toIndentedString(logStartMs)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
    sb.append("    locCity: ").append(toIndentedString(locCity)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    locName: ").append(toIndentedString(locName)).append("\n");
    sb.append("    locLat: ").append(toIndentedString(locLat)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    locState: ").append(toIndentedString(locState)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    codriverIds: ").append(toIndentedString(codriverIds)).append("\n");
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

