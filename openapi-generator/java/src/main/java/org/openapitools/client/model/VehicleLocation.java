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

/**
 * Contains the location, in latitude and longitude, of a vehicle.
 */
@ApiModel(description = "Contains the location, in latitude and longitude, of a vehicle.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-01T05:34:00.976Z[GMT]")
public class VehicleLocation {
  public static final String SERIALIZED_NAME_HEADING = "heading";
  @SerializedName(SERIALIZED_NAME_HEADING)
  private Double heading;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ODOMETER_METERS = "odometerMeters";
  @SerializedName(SERIALIZED_NAME_ODOMETER_METERS)
  private Long odometerMeters;

  public static final String SERIALIZED_NAME_ON_TRIP = "onTrip";
  @SerializedName(SERIALIZED_NAME_ON_TRIP)
  private Boolean onTrip;

  public static final String SERIALIZED_NAME_SPEED = "speed";
  @SerializedName(SERIALIZED_NAME_SPEED)
  private Double speed;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Integer time;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private String vin;

  public VehicleLocation heading(Double heading) {
    this.heading = heading;
    return this;
  }

   /**
   * Heading in degrees.
   * @return heading
  **/
  @ApiModelProperty(example = "246.42", value = "Heading in degrees.")
  public Double getHeading() {
    return heading;
  }

  public void setHeading(Double heading) {
    this.heading = heading;
  }

  public VehicleLocation id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the vehicle.
   * @return id
  **/
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public VehicleLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude in decimal degrees.
   * @return latitude
  **/
  @ApiModelProperty(example = "123.456", value = "Latitude in decimal degrees.")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public VehicleLocation location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
   * @return location
  **/
  @ApiModelProperty(example = "1 Main St, Dallas, TX", value = "Text representation of nearest identifiable location to (latitude, longitude) coordinates.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public VehicleLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude in decimal degrees.
   * @return longitude
  **/
  @ApiModelProperty(example = "32.897", value = "Longitude in decimal degrees.")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public VehicleLocation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the vehicle.
   * @return name
  **/
  @ApiModelProperty(example = "Truck A7", value = "Name of the vehicle.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VehicleLocation odometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
    return this;
  }

   /**
   * The number of meters reported by the odometer.
   * @return odometerMeters
  **/
  @ApiModelProperty(example = "71774705", value = "The number of meters reported by the odometer.")
  public Long getOdometerMeters() {
    return odometerMeters;
  }

  public void setOdometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
  }

  public VehicleLocation onTrip(Boolean onTrip) {
    this.onTrip = onTrip;
    return this;
  }

   /**
   * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
   * @return onTrip
  **/
  @ApiModelProperty(example = "true", value = "Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.")
  public Boolean getOnTrip() {
    return onTrip;
  }

  public void setOnTrip(Boolean onTrip) {
    this.onTrip = onTrip;
  }

  public VehicleLocation speed(Double speed) {
    this.speed = speed;
    return this;
  }

   /**
   * Speed in miles per hour.
   * @return speed
  **/
  @ApiModelProperty(example = "64.37", value = "Speed in miles per hour.")
  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  public VehicleLocation time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
   * @return time
  **/
  @ApiModelProperty(example = "1462881998034", value = "The time the reported location was logged, reported as a UNIX timestamp in milliseconds.")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public VehicleLocation vin(String vin) {
    this.vin = vin;
    return this;
  }

   /**
   * Vehicle Identification Number (VIN) of the vehicle.
   * @return vin
  **/
  @ApiModelProperty(example = "JTNBB46KX73011966", value = "Vehicle Identification Number (VIN) of the vehicle.")
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleLocation vehicleLocation = (VehicleLocation) o;
    return Objects.equals(this.heading, vehicleLocation.heading) &&
        Objects.equals(this.id, vehicleLocation.id) &&
        Objects.equals(this.latitude, vehicleLocation.latitude) &&
        Objects.equals(this.location, vehicleLocation.location) &&
        Objects.equals(this.longitude, vehicleLocation.longitude) &&
        Objects.equals(this.name, vehicleLocation.name) &&
        Objects.equals(this.odometerMeters, vehicleLocation.odometerMeters) &&
        Objects.equals(this.onTrip, vehicleLocation.onTrip) &&
        Objects.equals(this.speed, vehicleLocation.speed) &&
        Objects.equals(this.time, vehicleLocation.time) &&
        Objects.equals(this.vin, vehicleLocation.vin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heading, id, latitude, location, longitude, name, odometerMeters, onTrip, speed, time, vin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleLocation {\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    odometerMeters: ").append(toIndentedString(odometerMeters)).append("\n");
    sb.append("    onTrip: ").append(toIndentedString(onTrip)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
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

