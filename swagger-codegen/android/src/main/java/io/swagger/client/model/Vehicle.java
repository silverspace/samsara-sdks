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

/**
 * A vehicle object.
 **/
@ApiModel(description = "A vehicle object.")
public class Vehicle {
  
  @SerializedName("engineHours")
  private Long engineHours = null;
  @SerializedName("fuelLevelPercent")
  private Double fuelLevelPercent = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("note")
  private String note = null;
  @SerializedName("odometerMeters")
  private Long odometerMeters = null;
  @SerializedName("vin")
  private String vin = null;

  /**
   * Total engine hours for the vehicle.
   **/
  @ApiModelProperty(value = "Total engine hours for the vehicle.")
  public Long getEngineHours() {
    return engineHours;
  }
  public void setEngineHours(Long engineHours) {
    this.engineHours = engineHours;
  }

  /**
   * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
   **/
  @ApiModelProperty(value = "The fuel level of the vehicle as a percentage. (0.0 to 1.0)")
  public Double getFuelLevelPercent() {
    return fuelLevelPercent;
  }
  public void setFuelLevelPercent(Double fuelLevelPercent) {
    this.fuelLevelPercent = fuelLevelPercent;
  }

  /**
   * ID of the vehicle.
   **/
  @ApiModelProperty(required = true, value = "ID of the vehicle.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Name of the vehicle.
   **/
  @ApiModelProperty(value = "Name of the vehicle.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The number of meters reported by the odometer.
   **/
  @ApiModelProperty(value = "The number of meters reported by the odometer.")
  public Long getOdometerMeters() {
    return odometerMeters;
  }
  public void setOdometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
  }

  /**
   * Vehicle Identification Number.
   **/
  @ApiModelProperty(value = "Vehicle Identification Number.")
  public String getVin() {
    return vin;
  }
  public void setVin(String vin) {
    this.vin = vin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return (this.engineHours == null ? vehicle.engineHours == null : this.engineHours.equals(vehicle.engineHours)) &&
        (this.fuelLevelPercent == null ? vehicle.fuelLevelPercent == null : this.fuelLevelPercent.equals(vehicle.fuelLevelPercent)) &&
        (this.id == null ? vehicle.id == null : this.id.equals(vehicle.id)) &&
        (this.name == null ? vehicle.name == null : this.name.equals(vehicle.name)) &&
        (this.note == null ? vehicle.note == null : this.note.equals(vehicle.note)) &&
        (this.odometerMeters == null ? vehicle.odometerMeters == null : this.odometerMeters.equals(vehicle.odometerMeters)) &&
        (this.vin == null ? vehicle.vin == null : this.vin.equals(vehicle.vin));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.engineHours == null ? 0: this.engineHours.hashCode());
    result = 31 * result + (this.fuelLevelPercent == null ? 0: this.fuelLevelPercent.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.note == null ? 0: this.note.hashCode());
    result = 31 * result + (this.odometerMeters == null ? 0: this.odometerMeters.hashCode());
    result = 31 * result + (this.vin == null ? 0: this.vin.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("  engineHours: ").append(engineHours).append("\n");
    sb.append("  fuelLevelPercent: ").append(fuelLevelPercent).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  note: ").append(note).append("\n");
    sb.append("  odometerMeters: ").append(odometerMeters).append("\n");
    sb.append("  vin: ").append(vin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
