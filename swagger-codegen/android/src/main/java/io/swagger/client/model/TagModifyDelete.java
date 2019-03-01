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

import io.swagger.client.model.TaggedAssetBase;
import io.swagger.client.model.TaggedDriverBase;
import io.swagger.client.model.TaggedMachineBase;
import io.swagger.client.model.TaggedSensorBase;
import io.swagger.client.model.TaggedVehicleBase;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Specify devices, etc. that should be removed from the tag.
 **/
@ApiModel(description = "Specify devices, etc. that should be removed from the tag.")
public class TagModifyDelete {
  
  @SerializedName("assets")
  private List<TaggedAssetBase> assets = null;
  @SerializedName("drivers")
  private List<TaggedDriverBase> drivers = null;
  @SerializedName("machines")
  private List<TaggedMachineBase> machines = null;
  @SerializedName("sensors")
  private List<TaggedSensorBase> sensors = null;
  @SerializedName("vehicles")
  private List<TaggedVehicleBase> vehicles = null;

  /**
   * The assets to be removed from this tag.
   **/
  @ApiModelProperty(value = "The assets to be removed from this tag.")
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }
  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

  /**
   * The drivers to be removed from this tag.
   **/
  @ApiModelProperty(value = "The drivers to be removed from this tag.")
  public List<TaggedDriverBase> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
  }

  /**
   * The machines to be removed from this tag.
   **/
  @ApiModelProperty(value = "The machines to be removed from this tag.")
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }
  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

  /**
   * The sensors to be removed from this tag.
   **/
  @ApiModelProperty(value = "The sensors to be removed from this tag.")
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }
  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  /**
   * The vehicles to be removed from this tag.
   **/
  @ApiModelProperty(value = "The vehicles to be removed from this tag.")
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagModifyDelete tagModifyDelete = (TagModifyDelete) o;
    return (this.assets == null ? tagModifyDelete.assets == null : this.assets.equals(tagModifyDelete.assets)) &&
        (this.drivers == null ? tagModifyDelete.drivers == null : this.drivers.equals(tagModifyDelete.drivers)) &&
        (this.machines == null ? tagModifyDelete.machines == null : this.machines.equals(tagModifyDelete.machines)) &&
        (this.sensors == null ? tagModifyDelete.sensors == null : this.sensors.equals(tagModifyDelete.sensors)) &&
        (this.vehicles == null ? tagModifyDelete.vehicles == null : this.vehicles.equals(tagModifyDelete.vehicles));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.assets == null ? 0: this.assets.hashCode());
    result = 31 * result + (this.drivers == null ? 0: this.drivers.hashCode());
    result = 31 * result + (this.machines == null ? 0: this.machines.hashCode());
    result = 31 * result + (this.sensors == null ? 0: this.sensors.hashCode());
    result = 31 * result + (this.vehicles == null ? 0: this.vehicles.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagModifyDelete {\n");
    
    sb.append("  assets: ").append(assets).append("\n");
    sb.append("  drivers: ").append(drivers).append("\n");
    sb.append("  machines: ").append(machines).append("\n");
    sb.append("  sensors: ").append(sensors).append("\n");
    sb.append("  vehicles: ").append(vehicles).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
