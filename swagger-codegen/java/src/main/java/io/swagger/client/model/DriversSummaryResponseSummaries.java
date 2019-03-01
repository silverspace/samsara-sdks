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
import java.io.IOException;

/**
 * DriversSummaryResponseSummaries
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-01T04:19:45.344Z")
public class DriversSummaryResponseSummaries {
  @SerializedName("activeMs")
  private Long activeMs = null;

  @SerializedName("distanceMiles")
  private Double distanceMiles = null;

  @SerializedName("driveMs")
  private Long driveMs = null;

  @SerializedName("driverId")
  private Long driverId = null;

  @SerializedName("driverName")
  private String driverName = null;

  @SerializedName("driverUsername")
  private String driverUsername = null;

  @SerializedName("groupId")
  private Long groupId = null;

  @SerializedName("onDutyMs")
  private Long onDutyMs = null;

  public DriversSummaryResponseSummaries activeMs(Long activeMs) {
    this.activeMs = activeMs;
    return this;
  }

   /**
   * Duration in milliseconds that driver was on duty or driving during the requested time range
   * @return activeMs
  **/
  @ApiModelProperty(example = "43200000", value = "Duration in milliseconds that driver was on duty or driving during the requested time range")
  public Long getActiveMs() {
    return activeMs;
  }

  public void setActiveMs(Long activeMs) {
    this.activeMs = activeMs;
  }

  public DriversSummaryResponseSummaries distanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
    return this;
  }

   /**
   * Distance driven in miles, rounded to two decimal places.
   * @return distanceMiles
  **/
  @ApiModelProperty(example = "123.24", value = "Distance driven in miles, rounded to two decimal places.")
  public Double getDistanceMiles() {
    return distanceMiles;
  }

  public void setDistanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

  public DriversSummaryResponseSummaries driveMs(Long driveMs) {
    this.driveMs = driveMs;
    return this;
  }

   /**
   * Duration in milliseconds that driver was driving during the requested time range
   * @return driveMs
  **/
  @ApiModelProperty(example = "21600000", value = "Duration in milliseconds that driver was driving during the requested time range")
  public Long getDriveMs() {
    return driveMs;
  }

  public void setDriveMs(Long driveMs) {
    this.driveMs = driveMs;
  }

  public DriversSummaryResponseSummaries driverId(Long driverId) {
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

  public DriversSummaryResponseSummaries driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

   /**
   * Name of the driver.
   * @return driverName
  **/
  @ApiModelProperty(example = "Fred Jacobs", value = "Name of the driver.")
  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public DriversSummaryResponseSummaries driverUsername(String driverUsername) {
    this.driverUsername = driverUsername;
    return this;
  }

   /**
   * Username of the driver.
   * @return driverUsername
  **/
  @ApiModelProperty(example = "fjacobs", value = "Username of the driver.")
  public String getDriverUsername() {
    return driverUsername;
  }

  public void setDriverUsername(String driverUsername) {
    this.driverUsername = driverUsername;
  }

  public DriversSummaryResponseSummaries groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group of the driver.
   * @return groupId
  **/
  @ApiModelProperty(example = "111", value = "Group of the driver.")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DriversSummaryResponseSummaries onDutyMs(Long onDutyMs) {
    this.onDutyMs = onDutyMs;
    return this;
  }

   /**
   * Duration in milliseconds that driver was on duty during the requested time range
   * @return onDutyMs
  **/
  @ApiModelProperty(example = "21600000", value = "Duration in milliseconds that driver was on duty during the requested time range")
  public Long getOnDutyMs() {
    return onDutyMs;
  }

  public void setOnDutyMs(Long onDutyMs) {
    this.onDutyMs = onDutyMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriversSummaryResponseSummaries driversSummaryResponseSummaries = (DriversSummaryResponseSummaries) o;
    return Objects.equals(this.activeMs, driversSummaryResponseSummaries.activeMs) &&
        Objects.equals(this.distanceMiles, driversSummaryResponseSummaries.distanceMiles) &&
        Objects.equals(this.driveMs, driversSummaryResponseSummaries.driveMs) &&
        Objects.equals(this.driverId, driversSummaryResponseSummaries.driverId) &&
        Objects.equals(this.driverName, driversSummaryResponseSummaries.driverName) &&
        Objects.equals(this.driverUsername, driversSummaryResponseSummaries.driverUsername) &&
        Objects.equals(this.groupId, driversSummaryResponseSummaries.groupId) &&
        Objects.equals(this.onDutyMs, driversSummaryResponseSummaries.onDutyMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeMs, distanceMiles, driveMs, driverId, driverName, driverUsername, groupId, onDutyMs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriversSummaryResponseSummaries {\n");
    
    sb.append("    activeMs: ").append(toIndentedString(activeMs)).append("\n");
    sb.append("    distanceMiles: ").append(toIndentedString(distanceMiles)).append("\n");
    sb.append("    driveMs: ").append(toIndentedString(driveMs)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    driverUsername: ").append(toIndentedString(driverUsername)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    onDutyMs: ").append(toIndentedString(onDutyMs)).append("\n");
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

