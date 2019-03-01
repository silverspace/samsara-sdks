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
import org.openapitools.client.model.TaggedAddress;
import org.openapitools.client.model.TaggedAsset;
import org.openapitools.client.model.TaggedDriver;
import org.openapitools.client.model.TaggedMachine;
import org.openapitools.client.model.TaggedSensor;
import org.openapitools.client.model.TaggedVehicle;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Tag {
  
  @SerializedName("addresses")
  private List<TaggedAddress> addresses = null;
  @SerializedName("assets")
  private List<TaggedAsset> assets = null;
  @SerializedName("drivers")
  private List<TaggedDriver> drivers = null;
  @SerializedName("groupId")
  private Long groupId = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("machines")
  private List<TaggedMachine> machines = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("parentTagId")
  private Long parentTagId = null;
  @SerializedName("sensors")
  private List<TaggedSensor> sensors = null;
  @SerializedName("vehicles")
  private List<TaggedVehicle> vehicles = null;

  /**
   * The addresses that belong to this tag.
   **/
  @ApiModelProperty(value = "The addresses that belong to this tag.")
  public List<TaggedAddress> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<TaggedAddress> addresses) {
    this.addresses = addresses;
  }

  /**
   * The assets that belong to this tag.
   **/
  @ApiModelProperty(value = "The assets that belong to this tag.")
  public List<TaggedAsset> getAssets() {
    return assets;
  }
  public void setAssets(List<TaggedAsset> assets) {
    this.assets = assets;
  }

  /**
   * The drivers that belong to this tag.
   **/
  @ApiModelProperty(value = "The drivers that belong to this tag.")
  public List<TaggedDriver> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<TaggedDriver> drivers) {
    this.drivers = drivers;
  }

  /**
   * The GroupID that this tag belongs to.
   **/
  @ApiModelProperty(value = "The GroupID that this tag belongs to.")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * The ID of this tag.
   **/
  @ApiModelProperty(required = true, value = "The ID of this tag.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * The machines that belong to this tag.
   **/
  @ApiModelProperty(value = "The machines that belong to this tag.")
  public List<TaggedMachine> getMachines() {
    return machines;
  }
  public void setMachines(List<TaggedMachine> machines) {
    this.machines = machines;
  }

  /**
   * Name of this tag.
   **/
  @ApiModelProperty(required = true, value = "Name of this tag.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
   **/
  @ApiModelProperty(value = "If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.")
  public Long getParentTagId() {
    return parentTagId;
  }
  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

  /**
   * The sensors that belong to this tag.
   **/
  @ApiModelProperty(value = "The sensors that belong to this tag.")
  public List<TaggedSensor> getSensors() {
    return sensors;
  }
  public void setSensors(List<TaggedSensor> sensors) {
    this.sensors = sensors;
  }

  /**
   * The vehicles that belong to this tag.
   **/
  @ApiModelProperty(value = "The vehicles that belong to this tag.")
  public List<TaggedVehicle> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<TaggedVehicle> vehicles) {
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
    Tag tag = (Tag) o;
    return (this.addresses == null ? tag.addresses == null : this.addresses.equals(tag.addresses)) &&
        (this.assets == null ? tag.assets == null : this.assets.equals(tag.assets)) &&
        (this.drivers == null ? tag.drivers == null : this.drivers.equals(tag.drivers)) &&
        (this.groupId == null ? tag.groupId == null : this.groupId.equals(tag.groupId)) &&
        (this.id == null ? tag.id == null : this.id.equals(tag.id)) &&
        (this.machines == null ? tag.machines == null : this.machines.equals(tag.machines)) &&
        (this.name == null ? tag.name == null : this.name.equals(tag.name)) &&
        (this.parentTagId == null ? tag.parentTagId == null : this.parentTagId.equals(tag.parentTagId)) &&
        (this.sensors == null ? tag.sensors == null : this.sensors.equals(tag.sensors)) &&
        (this.vehicles == null ? tag.vehicles == null : this.vehicles.equals(tag.vehicles));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.addresses == null ? 0: this.addresses.hashCode());
    result = 31 * result + (this.assets == null ? 0: this.assets.hashCode());
    result = 31 * result + (this.drivers == null ? 0: this.drivers.hashCode());
    result = 31 * result + (this.groupId == null ? 0: this.groupId.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.machines == null ? 0: this.machines.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.parentTagId == null ? 0: this.parentTagId.hashCode());
    result = 31 * result + (this.sensors == null ? 0: this.sensors.hashCode());
    result = 31 * result + (this.vehicles == null ? 0: this.vehicles.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("  addresses: ").append(addresses).append("\n");
    sb.append("  assets: ").append(assets).append("\n");
    sb.append("  drivers: ").append(drivers).append("\n");
    sb.append("  groupId: ").append(groupId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  machines: ").append(machines).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  parentTagId: ").append(parentTagId).append("\n");
    sb.append("  sensors: ").append(sensors).append("\n");
    sb.append("  vehicles: ").append(vehicles).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
