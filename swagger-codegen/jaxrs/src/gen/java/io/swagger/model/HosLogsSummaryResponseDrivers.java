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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * HosLogsSummaryResponseDrivers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public class HosLogsSummaryResponseDrivers   {
  @JsonProperty("cycleRemaining")
  private Long cycleRemaining = null;

  @JsonProperty("cycleTomorrow")
  private Long cycleTomorrow = null;

  @JsonProperty("driverId")
  private Long driverId = null;

  @JsonProperty("driverName")
  private String driverName = null;

  @JsonProperty("drivingInViolationCycle")
  private Long drivingInViolationCycle = null;

  @JsonProperty("drivingInViolationToday")
  private Long drivingInViolationToday = null;

  @JsonProperty("dutyStatus")
  private String dutyStatus = null;

  @JsonProperty("shiftDriveRemaining")
  private Long shiftDriveRemaining = null;

  @JsonProperty("shiftRemaining")
  private Long shiftRemaining = null;

  @JsonProperty("timeInCurrentStatus")
  private Long timeInCurrentStatus = null;

  @JsonProperty("timeUntilBreak")
  private Long timeUntilBreak = null;

  @JsonProperty("vehicleName")
  private String vehicleName = null;

  public HosLogsSummaryResponseDrivers cycleRemaining(Long cycleRemaining) {
    this.cycleRemaining = cycleRemaining;
    return this;
  }

  /**
   * The amount of remaining cycle time (in ms).
   * @return cycleRemaining
   **/
  @JsonProperty("cycleRemaining")
  @ApiModelProperty(example = "252000000", value = "The amount of remaining cycle time (in ms).")
  public Long getCycleRemaining() {
    return cycleRemaining;
  }

  public void setCycleRemaining(Long cycleRemaining) {
    this.cycleRemaining = cycleRemaining;
  }

  public HosLogsSummaryResponseDrivers cycleTomorrow(Long cycleTomorrow) {
    this.cycleTomorrow = cycleTomorrow;
    return this;
  }

  /**
   * The amount of cycle time (in ms) available tomorrow.
   * @return cycleTomorrow
   **/
  @JsonProperty("cycleTomorrow")
  @ApiModelProperty(example = "252000000", value = "The amount of cycle time (in ms) available tomorrow.")
  public Long getCycleTomorrow() {
    return cycleTomorrow;
  }

  public void setCycleTomorrow(Long cycleTomorrow) {
    this.cycleTomorrow = cycleTomorrow;
  }

  public HosLogsSummaryResponseDrivers driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * ID of the driver.
   * @return driverId
   **/
  @JsonProperty("driverId")
  @ApiModelProperty(example = "444", value = "ID of the driver.")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public HosLogsSummaryResponseDrivers driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  /**
   * Name of the driver.
   * @return driverName
   **/
  @JsonProperty("driverName")
  @ApiModelProperty(example = "Fred Jacobs", value = "Name of the driver.")
  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public HosLogsSummaryResponseDrivers drivingInViolationCycle(Long drivingInViolationCycle) {
    this.drivingInViolationCycle = drivingInViolationCycle;
    return this;
  }

  /**
   * The amount of driving time in violation in this cycle (in ms).
   * @return drivingInViolationCycle
   **/
  @JsonProperty("drivingInViolationCycle")
  @ApiModelProperty(example = "50400000", value = "The amount of driving time in violation in this cycle (in ms).")
  public Long getDrivingInViolationCycle() {
    return drivingInViolationCycle;
  }

  public void setDrivingInViolationCycle(Long drivingInViolationCycle) {
    this.drivingInViolationCycle = drivingInViolationCycle;
  }

  public HosLogsSummaryResponseDrivers drivingInViolationToday(Long drivingInViolationToday) {
    this.drivingInViolationToday = drivingInViolationToday;
    return this;
  }

  /**
   * The amount of driving time in violation today (in ms).
   * @return drivingInViolationToday
   **/
  @JsonProperty("drivingInViolationToday")
  @ApiModelProperty(example = "39600000", value = "The amount of driving time in violation today (in ms).")
  public Long getDrivingInViolationToday() {
    return drivingInViolationToday;
  }

  public void setDrivingInViolationToday(Long drivingInViolationToday) {
    this.drivingInViolationToday = drivingInViolationToday;
  }

  public HosLogsSummaryResponseDrivers dutyStatus(String dutyStatus) {
    this.dutyStatus = dutyStatus;
    return this;
  }

  /**
   * The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
   * @return dutyStatus
   **/
  @JsonProperty("dutyStatus")
  @ApiModelProperty(example = "OFF_DUTY", value = "The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.")
  public String getDutyStatus() {
    return dutyStatus;
  }

  public void setDutyStatus(String dutyStatus) {
    this.dutyStatus = dutyStatus;
  }

  public HosLogsSummaryResponseDrivers shiftDriveRemaining(Long shiftDriveRemaining) {
    this.shiftDriveRemaining = shiftDriveRemaining;
    return this;
  }

  /**
   * The amount of remaining shift drive time (in ms).
   * @return shiftDriveRemaining
   **/
  @JsonProperty("shiftDriveRemaining")
  @ApiModelProperty(example = "39600000", value = "The amount of remaining shift drive time (in ms).")
  public Long getShiftDriveRemaining() {
    return shiftDriveRemaining;
  }

  public void setShiftDriveRemaining(Long shiftDriveRemaining) {
    this.shiftDriveRemaining = shiftDriveRemaining;
  }

  public HosLogsSummaryResponseDrivers shiftRemaining(Long shiftRemaining) {
    this.shiftRemaining = shiftRemaining;
    return this;
  }

  /**
   * The amount of remaining shift time (in ms).
   * @return shiftRemaining
   **/
  @JsonProperty("shiftRemaining")
  @ApiModelProperty(example = "50400000", value = "The amount of remaining shift time (in ms).")
  public Long getShiftRemaining() {
    return shiftRemaining;
  }

  public void setShiftRemaining(Long shiftRemaining) {
    this.shiftRemaining = shiftRemaining;
  }

  public HosLogsSummaryResponseDrivers timeInCurrentStatus(Long timeInCurrentStatus) {
    this.timeInCurrentStatus = timeInCurrentStatus;
    return this;
  }

  /**
   * The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.
   * @return timeInCurrentStatus
   **/
  @JsonProperty("timeInCurrentStatus")
  @ApiModelProperty(example = "5000", value = "The amount of time (in ms) that the driver has been in the current `dutyStatus`.")
  public Long getTimeInCurrentStatus() {
    return timeInCurrentStatus;
  }

  public void setTimeInCurrentStatus(Long timeInCurrentStatus) {
    this.timeInCurrentStatus = timeInCurrentStatus;
  }

  public HosLogsSummaryResponseDrivers timeUntilBreak(Long timeUntilBreak) {
    this.timeUntilBreak = timeUntilBreak;
    return this;
  }

  /**
   * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
   * @return timeUntilBreak
   **/
  @JsonProperty("timeUntilBreak")
  @ApiModelProperty(example = "28800000", value = "The amount of time (in ms) remaining until the driver cannot drive without a rest break.")
  public Long getTimeUntilBreak() {
    return timeUntilBreak;
  }

  public void setTimeUntilBreak(Long timeUntilBreak) {
    this.timeUntilBreak = timeUntilBreak;
  }

  public HosLogsSummaryResponseDrivers vehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
    return this;
  }

  /**
   * Name of the vehicle.
   * @return vehicleName
   **/
  @JsonProperty("vehicleName")
  @ApiModelProperty(example = "Vehicle 1", value = "Name of the vehicle.")
  public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers = (HosLogsSummaryResponseDrivers) o;
    return Objects.equals(this.cycleRemaining, hosLogsSummaryResponseDrivers.cycleRemaining) &&
        Objects.equals(this.cycleTomorrow, hosLogsSummaryResponseDrivers.cycleTomorrow) &&
        Objects.equals(this.driverId, hosLogsSummaryResponseDrivers.driverId) &&
        Objects.equals(this.driverName, hosLogsSummaryResponseDrivers.driverName) &&
        Objects.equals(this.drivingInViolationCycle, hosLogsSummaryResponseDrivers.drivingInViolationCycle) &&
        Objects.equals(this.drivingInViolationToday, hosLogsSummaryResponseDrivers.drivingInViolationToday) &&
        Objects.equals(this.dutyStatus, hosLogsSummaryResponseDrivers.dutyStatus) &&
        Objects.equals(this.shiftDriveRemaining, hosLogsSummaryResponseDrivers.shiftDriveRemaining) &&
        Objects.equals(this.shiftRemaining, hosLogsSummaryResponseDrivers.shiftRemaining) &&
        Objects.equals(this.timeInCurrentStatus, hosLogsSummaryResponseDrivers.timeInCurrentStatus) &&
        Objects.equals(this.timeUntilBreak, hosLogsSummaryResponseDrivers.timeUntilBreak) &&
        Objects.equals(this.vehicleName, hosLogsSummaryResponseDrivers.vehicleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleRemaining, cycleTomorrow, driverId, driverName, drivingInViolationCycle, drivingInViolationToday, dutyStatus, shiftDriveRemaining, shiftRemaining, timeInCurrentStatus, timeUntilBreak, vehicleName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsSummaryResponseDrivers {\n");
    
    sb.append("    cycleRemaining: ").append(toIndentedString(cycleRemaining)).append("\n");
    sb.append("    cycleTomorrow: ").append(toIndentedString(cycleTomorrow)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    drivingInViolationCycle: ").append(toIndentedString(drivingInViolationCycle)).append("\n");
    sb.append("    drivingInViolationToday: ").append(toIndentedString(drivingInViolationToday)).append("\n");
    sb.append("    dutyStatus: ").append(toIndentedString(dutyStatus)).append("\n");
    sb.append("    shiftDriveRemaining: ").append(toIndentedString(shiftDriveRemaining)).append("\n");
    sb.append("    shiftRemaining: ").append(toIndentedString(shiftRemaining)).append("\n");
    sb.append("    timeInCurrentStatus: ").append(toIndentedString(timeInCurrentStatus)).append("\n");
    sb.append("    timeUntilBreak: ").append(toIndentedString(timeUntilBreak)).append("\n");
    sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
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

