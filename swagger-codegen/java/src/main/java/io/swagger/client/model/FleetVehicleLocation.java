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
 * Contains the location and speed of a vehicle at a particular time
 */
@ApiModel(description = "Contains the location and speed of a vehicle at a particular time")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-01T04:19:45.344Z")
public class FleetVehicleLocation {
  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("longitude")
  private Double longitude = null;

  @SerializedName("speedMilesPerHour")
  private Double speedMilesPerHour = null;

  @SerializedName("timeMs")
  private Long timeMs = null;

  public FleetVehicleLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude of the location in degrees.
   * @return latitude
  **/
  @ApiModelProperty(example = "37.2", value = "The latitude of the location in degrees.")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public FleetVehicleLocation location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The best effort (street,city,state) for the latitude and longitude.
   * @return location
  **/
  @ApiModelProperty(example = "525 York, San Francisco, CA", value = "The best effort (street,city,state) for the latitude and longitude.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public FleetVehicleLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude of the location in degrees.
   * @return longitude
  **/
  @ApiModelProperty(example = "-122.5", value = "The longitude of the location in degrees.")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public FleetVehicleLocation speedMilesPerHour(Double speedMilesPerHour) {
    this.speedMilesPerHour = speedMilesPerHour;
    return this;
  }

   /**
   * The speed calculated from GPS that the asset was traveling at in miles per hour.
   * @return speedMilesPerHour
  **/
  @ApiModelProperty(example = "35.2", value = "The speed calculated from GPS that the asset was traveling at in miles per hour.")
  public Double getSpeedMilesPerHour() {
    return speedMilesPerHour;
  }

  public void setSpeedMilesPerHour(Double speedMilesPerHour) {
    this.speedMilesPerHour = speedMilesPerHour;
  }

  public FleetVehicleLocation timeMs(Long timeMs) {
    this.timeMs = timeMs;
    return this;
  }

   /**
   * Time in Unix milliseconds since epoch when the asset was at the location.
   * @return timeMs
  **/
  @ApiModelProperty(example = "1535586471332", value = "Time in Unix milliseconds since epoch when the asset was at the location.")
  public Long getTimeMs() {
    return timeMs;
  }

  public void setTimeMs(Long timeMs) {
    this.timeMs = timeMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetVehicleLocation fleetVehicleLocation = (FleetVehicleLocation) o;
    return Objects.equals(this.latitude, fleetVehicleLocation.latitude) &&
        Objects.equals(this.location, fleetVehicleLocation.location) &&
        Objects.equals(this.longitude, fleetVehicleLocation.longitude) &&
        Objects.equals(this.speedMilesPerHour, fleetVehicleLocation.speedMilesPerHour) &&
        Objects.equals(this.timeMs, fleetVehicleLocation.timeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, location, longitude, speedMilesPerHour, timeMs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetVehicleLocation {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    speedMilesPerHour: ").append(toIndentedString(speedMilesPerHour)).append("\n");
    sb.append("    timeMs: ").append(toIndentedString(timeMs)).append("\n");
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

