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
import io.swagger.client.model.TripResponseEndCoordinates;
import io.swagger.client.model.TripResponseStartCoordinates;
import java.io.IOException;

/**
 * TripResponseTrips
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-01T04:19:45.344Z")
public class TripResponseTrips {
  @SerializedName("distanceMeters")
  private Integer distanceMeters = null;

  @SerializedName("driverId")
  private Integer driverId = null;

  @SerializedName("endAddress")
  private String endAddress = null;

  @SerializedName("endCoordinates")
  private TripResponseEndCoordinates endCoordinates = null;

  @SerializedName("endLocation")
  private String endLocation = null;

  @SerializedName("endMs")
  private Integer endMs = null;

  @SerializedName("endOdometer")
  private Integer endOdometer = null;

  @SerializedName("fuelConsumedMl")
  private Integer fuelConsumedMl = null;

  @SerializedName("startAddress")
  private String startAddress = null;

  @SerializedName("startCoordinates")
  private TripResponseStartCoordinates startCoordinates = null;

  @SerializedName("startLocation")
  private String startLocation = null;

  @SerializedName("startMs")
  private Integer startMs = null;

  @SerializedName("startOdometer")
  private Integer startOdometer = null;

  @SerializedName("tollMeters")
  private Integer tollMeters = null;

  public TripResponseTrips distanceMeters(Integer distanceMeters) {
    this.distanceMeters = distanceMeters;
    return this;
  }

   /**
   * Length of the trip in meters.
   * @return distanceMeters
  **/
  @ApiModelProperty(example = "2500", value = "Length of the trip in meters.")
  public Integer getDistanceMeters() {
    return distanceMeters;
  }

  public void setDistanceMeters(Integer distanceMeters) {
    this.distanceMeters = distanceMeters;
  }

  public TripResponseTrips driverId(Integer driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * ID of the driver.
   * @return driverId
  **/
  @ApiModelProperty(example = "719", value = "ID of the driver.")
  public Integer getDriverId() {
    return driverId;
  }

  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }

  public TripResponseTrips endAddress(String endAddress) {
    this.endAddress = endAddress;
    return this;
  }

   /**
   * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
   * @return endAddress
  **/
  @ApiModelProperty(example = "Winchell's Donuts House", value = "Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.")
  public String getEndAddress() {
    return endAddress;
  }

  public void setEndAddress(String endAddress) {
    this.endAddress = endAddress;
  }

  public TripResponseTrips endCoordinates(TripResponseEndCoordinates endCoordinates) {
    this.endCoordinates = endCoordinates;
    return this;
  }

   /**
   * Get endCoordinates
   * @return endCoordinates
  **/
  @ApiModelProperty(value = "")
  public TripResponseEndCoordinates getEndCoordinates() {
    return endCoordinates;
  }

  public void setEndCoordinates(TripResponseEndCoordinates endCoordinates) {
    this.endCoordinates = endCoordinates;
  }

  public TripResponseTrips endLocation(String endLocation) {
    this.endLocation = endLocation;
    return this;
  }

   /**
   * Geocoded street address of start (latitude, longitude) coordinates.
   * @return endLocation
  **/
  @ApiModelProperty(example = "571 S Lake Ave, Pasadena, CA 91101", value = "Geocoded street address of start (latitude, longitude) coordinates.")
  public String getEndLocation() {
    return endLocation;
  }

  public void setEndLocation(String endLocation) {
    this.endLocation = endLocation;
  }

  public TripResponseTrips endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

   /**
   * End of the trip in UNIX milliseconds.
   * @return endMs
  **/
  @ApiModelProperty(example = "1462881998034", value = "End of the trip in UNIX milliseconds.")
  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public TripResponseTrips endOdometer(Integer endOdometer) {
    this.endOdometer = endOdometer;
    return this;
  }

   /**
   * Odometer reading at the end of the trip.
   * @return endOdometer
  **/
  @ApiModelProperty(example = "210430500", value = "Odometer reading at the end of the trip.")
  public Integer getEndOdometer() {
    return endOdometer;
  }

  public void setEndOdometer(Integer endOdometer) {
    this.endOdometer = endOdometer;
  }

  public TripResponseTrips fuelConsumedMl(Integer fuelConsumedMl) {
    this.fuelConsumedMl = fuelConsumedMl;
    return this;
  }

   /**
   * Amount in milliliters of fuel consumed on this trip.
   * @return fuelConsumedMl
  **/
  @ApiModelProperty(example = "75700", value = "Amount in milliliters of fuel consumed on this trip.")
  public Integer getFuelConsumedMl() {
    return fuelConsumedMl;
  }

  public void setFuelConsumedMl(Integer fuelConsumedMl) {
    this.fuelConsumedMl = fuelConsumedMl;
  }

  public TripResponseTrips startAddress(String startAddress) {
    this.startAddress = startAddress;
    return this;
  }

   /**
   * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
   * @return startAddress
  **/
  @ApiModelProperty(example = "Ramen Tatsunoya", value = "Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.")
  public String getStartAddress() {
    return startAddress;
  }

  public void setStartAddress(String startAddress) {
    this.startAddress = startAddress;
  }

  public TripResponseTrips startCoordinates(TripResponseStartCoordinates startCoordinates) {
    this.startCoordinates = startCoordinates;
    return this;
  }

   /**
   * Get startCoordinates
   * @return startCoordinates
  **/
  @ApiModelProperty(value = "")
  public TripResponseStartCoordinates getStartCoordinates() {
    return startCoordinates;
  }

  public void setStartCoordinates(TripResponseStartCoordinates startCoordinates) {
    this.startCoordinates = startCoordinates;
  }

  public TripResponseTrips startLocation(String startLocation) {
    this.startLocation = startLocation;
    return this;
  }

   /**
   * Geocoded street address of start (latitude, longitude) coordinates.
   * @return startLocation
  **/
  @ApiModelProperty(example = "16 N Fair Oaks Ave, Pasadena, CA 91103", value = "Geocoded street address of start (latitude, longitude) coordinates.")
  public String getStartLocation() {
    return startLocation;
  }

  public void setStartLocation(String startLocation) {
    this.startLocation = startLocation;
  }

  public TripResponseTrips startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

   /**
   * Beginning of the trip in UNIX milliseconds.
   * @return startMs
  **/
  @ApiModelProperty(example = "1462878398034", value = "Beginning of the trip in UNIX milliseconds.")
  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  public TripResponseTrips startOdometer(Integer startOdometer) {
    this.startOdometer = startOdometer;
    return this;
  }

   /**
   * Odometer reading at the beginning of the trip.
   * @return startOdometer
  **/
  @ApiModelProperty(example = "210430450", value = "Odometer reading at the beginning of the trip.")
  public Integer getStartOdometer() {
    return startOdometer;
  }

  public void setStartOdometer(Integer startOdometer) {
    this.startOdometer = startOdometer;
  }

  public TripResponseTrips tollMeters(Integer tollMeters) {
    this.tollMeters = tollMeters;
    return this;
  }

   /**
   * Length in meters trip spent on toll roads.
   * @return tollMeters
  **/
  @ApiModelProperty(example = "32000", value = "Length in meters trip spent on toll roads.")
  public Integer getTollMeters() {
    return tollMeters;
  }

  public void setTollMeters(Integer tollMeters) {
    this.tollMeters = tollMeters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripResponseTrips tripResponseTrips = (TripResponseTrips) o;
    return Objects.equals(this.distanceMeters, tripResponseTrips.distanceMeters) &&
        Objects.equals(this.driverId, tripResponseTrips.driverId) &&
        Objects.equals(this.endAddress, tripResponseTrips.endAddress) &&
        Objects.equals(this.endCoordinates, tripResponseTrips.endCoordinates) &&
        Objects.equals(this.endLocation, tripResponseTrips.endLocation) &&
        Objects.equals(this.endMs, tripResponseTrips.endMs) &&
        Objects.equals(this.endOdometer, tripResponseTrips.endOdometer) &&
        Objects.equals(this.fuelConsumedMl, tripResponseTrips.fuelConsumedMl) &&
        Objects.equals(this.startAddress, tripResponseTrips.startAddress) &&
        Objects.equals(this.startCoordinates, tripResponseTrips.startCoordinates) &&
        Objects.equals(this.startLocation, tripResponseTrips.startLocation) &&
        Objects.equals(this.startMs, tripResponseTrips.startMs) &&
        Objects.equals(this.startOdometer, tripResponseTrips.startOdometer) &&
        Objects.equals(this.tollMeters, tripResponseTrips.tollMeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distanceMeters, driverId, endAddress, endCoordinates, endLocation, endMs, endOdometer, fuelConsumedMl, startAddress, startCoordinates, startLocation, startMs, startOdometer, tollMeters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripResponseTrips {\n");
    
    sb.append("    distanceMeters: ").append(toIndentedString(distanceMeters)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    endAddress: ").append(toIndentedString(endAddress)).append("\n");
    sb.append("    endCoordinates: ").append(toIndentedString(endCoordinates)).append("\n");
    sb.append("    endLocation: ").append(toIndentedString(endLocation)).append("\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    endOdometer: ").append(toIndentedString(endOdometer)).append("\n");
    sb.append("    fuelConsumedMl: ").append(toIndentedString(fuelConsumedMl)).append("\n");
    sb.append("    startAddress: ").append(toIndentedString(startAddress)).append("\n");
    sb.append("    startCoordinates: ").append(toIndentedString(startCoordinates)).append("\n");
    sb.append("    startLocation: ").append(toIndentedString(startLocation)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    startOdometer: ").append(toIndentedString(startOdometer)).append("\n");
    sb.append("    tollMeters: ").append(toIndentedString(tollMeters)).append("\n");
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

