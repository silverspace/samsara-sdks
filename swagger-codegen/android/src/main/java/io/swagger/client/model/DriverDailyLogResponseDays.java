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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DriverDailyLogResponseDays {
  
  @SerializedName("activeHours")
  private Double activeHours = null;
  @SerializedName("activeMs")
  private Long activeMs = null;
  @SerializedName("certified")
  private Boolean certified = null;
  @SerializedName("certifiedAtMs")
  private Long certifiedAtMs = null;
  @SerializedName("distanceMiles")
  private Double distanceMiles = null;
  @SerializedName("endMs")
  private Integer endMs = null;
  @SerializedName("startMs")
  private Integer startMs = null;
  @SerializedName("trailerIds")
  private Object trailerIds = null;
  @SerializedName("vehicleIds")
  private Object vehicleIds = null;

  /**
   * Hours spent on duty or driving, rounded to two decimal places.
   **/
  @ApiModelProperty(value = "Hours spent on duty or driving, rounded to two decimal places.")
  public Double getActiveHours() {
    return activeHours;
  }
  public void setActiveHours(Double activeHours) {
    this.activeHours = activeHours;
  }

  /**
   * Milliseconds spent on duty or driving.
   **/
  @ApiModelProperty(value = "Milliseconds spent on duty or driving.")
  public Long getActiveMs() {
    return activeMs;
  }
  public void setActiveMs(Long activeMs) {
    this.activeMs = activeMs;
  }

  /**
   * Whether this HOS day chart was certified by the driver.
   **/
  @ApiModelProperty(value = "Whether this HOS day chart was certified by the driver.")
  public Boolean getCertified() {
    return certified;
  }
  public void setCertified(Boolean certified) {
    this.certified = certified;
  }

  /**
   * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
   **/
  @ApiModelProperty(value = "Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.")
  public Long getCertifiedAtMs() {
    return certifiedAtMs;
  }
  public void setCertifiedAtMs(Long certifiedAtMs) {
    this.certifiedAtMs = certifiedAtMs;
  }

  /**
   * Distance driven in miles, rounded to two decimal places.
   **/
  @ApiModelProperty(value = "Distance driven in miles, rounded to two decimal places.")
  public Double getDistanceMiles() {
    return distanceMiles;
  }
  public void setDistanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

  /**
   * End of the HOS day, specified in milliseconds UNIX time.
   **/
  @ApiModelProperty(value = "End of the HOS day, specified in milliseconds UNIX time.")
  public Integer getEndMs() {
    return endMs;
  }
  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  /**
   * End of the HOS day, specified in milliseconds UNIX time.
   **/
  @ApiModelProperty(value = "End of the HOS day, specified in milliseconds UNIX time.")
  public Integer getStartMs() {
    return startMs;
  }
  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  /**
   * List of trailer ID's associated with the driver for the day.
   **/
  @ApiModelProperty(value = "List of trailer ID's associated with the driver for the day.")
  public Object getTrailerIds() {
    return trailerIds;
  }
  public void setTrailerIds(Object trailerIds) {
    this.trailerIds = trailerIds;
  }

  /**
   * List of vehicle ID's associated with the driver for the day.
   **/
  @ApiModelProperty(value = "List of vehicle ID's associated with the driver for the day.")
  public Object getVehicleIds() {
    return vehicleIds;
  }
  public void setVehicleIds(Object vehicleIds) {
    this.vehicleIds = vehicleIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverDailyLogResponseDays driverDailyLogResponseDays = (DriverDailyLogResponseDays) o;
    return (this.activeHours == null ? driverDailyLogResponseDays.activeHours == null : this.activeHours.equals(driverDailyLogResponseDays.activeHours)) &&
        (this.activeMs == null ? driverDailyLogResponseDays.activeMs == null : this.activeMs.equals(driverDailyLogResponseDays.activeMs)) &&
        (this.certified == null ? driverDailyLogResponseDays.certified == null : this.certified.equals(driverDailyLogResponseDays.certified)) &&
        (this.certifiedAtMs == null ? driverDailyLogResponseDays.certifiedAtMs == null : this.certifiedAtMs.equals(driverDailyLogResponseDays.certifiedAtMs)) &&
        (this.distanceMiles == null ? driverDailyLogResponseDays.distanceMiles == null : this.distanceMiles.equals(driverDailyLogResponseDays.distanceMiles)) &&
        (this.endMs == null ? driverDailyLogResponseDays.endMs == null : this.endMs.equals(driverDailyLogResponseDays.endMs)) &&
        (this.startMs == null ? driverDailyLogResponseDays.startMs == null : this.startMs.equals(driverDailyLogResponseDays.startMs)) &&
        (this.trailerIds == null ? driverDailyLogResponseDays.trailerIds == null : this.trailerIds.equals(driverDailyLogResponseDays.trailerIds)) &&
        (this.vehicleIds == null ? driverDailyLogResponseDays.vehicleIds == null : this.vehicleIds.equals(driverDailyLogResponseDays.vehicleIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.activeHours == null ? 0: this.activeHours.hashCode());
    result = 31 * result + (this.activeMs == null ? 0: this.activeMs.hashCode());
    result = 31 * result + (this.certified == null ? 0: this.certified.hashCode());
    result = 31 * result + (this.certifiedAtMs == null ? 0: this.certifiedAtMs.hashCode());
    result = 31 * result + (this.distanceMiles == null ? 0: this.distanceMiles.hashCode());
    result = 31 * result + (this.endMs == null ? 0: this.endMs.hashCode());
    result = 31 * result + (this.startMs == null ? 0: this.startMs.hashCode());
    result = 31 * result + (this.trailerIds == null ? 0: this.trailerIds.hashCode());
    result = 31 * result + (this.vehicleIds == null ? 0: this.vehicleIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverDailyLogResponseDays {\n");
    
    sb.append("  activeHours: ").append(activeHours).append("\n");
    sb.append("  activeMs: ").append(activeMs).append("\n");
    sb.append("  certified: ").append(certified).append("\n");
    sb.append("  certifiedAtMs: ").append(certifiedAtMs).append("\n");
    sb.append("  distanceMiles: ").append(distanceMiles).append("\n");
    sb.append("  endMs: ").append(endMs).append("\n");
    sb.append("  startMs: ").append(startMs).append("\n");
    sb.append("  trailerIds: ").append(trailerIds).append("\n");
    sb.append("  vehicleIds: ").append(vehicleIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
