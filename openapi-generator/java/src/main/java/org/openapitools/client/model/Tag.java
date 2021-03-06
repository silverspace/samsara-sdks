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
import org.openapitools.client.model.TaggedAddress;
import org.openapitools.client.model.TaggedAsset;
import org.openapitools.client.model.TaggedDriver;
import org.openapitools.client.model.TaggedMachine;
import org.openapitools.client.model.TaggedSensor;
import org.openapitools.client.model.TaggedVehicle;

/**
 * Tag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-01T05:34:00.976Z[GMT]")
public class Tag {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<TaggedAddress> addresses = new ArrayList<TaggedAddress>();

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private List<TaggedAsset> assets = new ArrayList<TaggedAsset>();

  public static final String SERIALIZED_NAME_DRIVERS = "drivers";
  @SerializedName(SERIALIZED_NAME_DRIVERS)
  private List<TaggedDriver> drivers = new ArrayList<TaggedDriver>();

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_MACHINES = "machines";
  @SerializedName(SERIALIZED_NAME_MACHINES)
  private List<TaggedMachine> machines = new ArrayList<TaggedMachine>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_TAG_ID = "parentTagId";
  @SerializedName(SERIALIZED_NAME_PARENT_TAG_ID)
  private Long parentTagId;

  public static final String SERIALIZED_NAME_SENSORS = "sensors";
  @SerializedName(SERIALIZED_NAME_SENSORS)
  private List<TaggedSensor> sensors = new ArrayList<TaggedSensor>();

  public static final String SERIALIZED_NAME_VEHICLES = "vehicles";
  @SerializedName(SERIALIZED_NAME_VEHICLES)
  private List<TaggedVehicle> vehicles = new ArrayList<TaggedVehicle>();

  public Tag addresses(List<TaggedAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Tag addAddressesItem(TaggedAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<TaggedAddress>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * The addresses that belong to this tag.
   * @return addresses
  **/
  @ApiModelProperty(value = "The addresses that belong to this tag.")
  public List<TaggedAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<TaggedAddress> addresses) {
    this.addresses = addresses;
  }

  public Tag assets(List<TaggedAsset> assets) {
    this.assets = assets;
    return this;
  }

  public Tag addAssetsItem(TaggedAsset assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<TaggedAsset>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * The assets that belong to this tag.
   * @return assets
  **/
  @ApiModelProperty(value = "The assets that belong to this tag.")
  public List<TaggedAsset> getAssets() {
    return assets;
  }

  public void setAssets(List<TaggedAsset> assets) {
    this.assets = assets;
  }

  public Tag drivers(List<TaggedDriver> drivers) {
    this.drivers = drivers;
    return this;
  }

  public Tag addDriversItem(TaggedDriver driversItem) {
    if (this.drivers == null) {
      this.drivers = new ArrayList<TaggedDriver>();
    }
    this.drivers.add(driversItem);
    return this;
  }

   /**
   * The drivers that belong to this tag.
   * @return drivers
  **/
  @ApiModelProperty(value = "The drivers that belong to this tag.")
  public List<TaggedDriver> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<TaggedDriver> drivers) {
    this.drivers = drivers;
  }

  public Tag groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The GroupID that this tag belongs to.
   * @return groupId
  **/
  @ApiModelProperty(example = "2348", value = "The GroupID that this tag belongs to.")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public Tag id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of this tag.
   * @return id
  **/
  @ApiModelProperty(example = "12345", required = true, value = "The ID of this tag.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Tag machines(List<TaggedMachine> machines) {
    this.machines = machines;
    return this;
  }

  public Tag addMachinesItem(TaggedMachine machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<TaggedMachine>();
    }
    this.machines.add(machinesItem);
    return this;
  }

   /**
   * The machines that belong to this tag.
   * @return machines
  **/
  @ApiModelProperty(value = "The machines that belong to this tag.")
  public List<TaggedMachine> getMachines() {
    return machines;
  }

  public void setMachines(List<TaggedMachine> machines) {
    this.machines = machines;
  }

  public Tag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of this tag.
   * @return name
  **/
  @ApiModelProperty(example = "Broken Vehicles", required = true, value = "Name of this tag.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

   /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
   * @return parentTagId
  **/
  @ApiModelProperty(example = "8389", value = "If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.")
  public Long getParentTagId() {
    return parentTagId;
  }

  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

  public Tag sensors(List<TaggedSensor> sensors) {
    this.sensors = sensors;
    return this;
  }

  public Tag addSensorsItem(TaggedSensor sensorsItem) {
    if (this.sensors == null) {
      this.sensors = new ArrayList<TaggedSensor>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }

   /**
   * The sensors that belong to this tag.
   * @return sensors
  **/
  @ApiModelProperty(value = "The sensors that belong to this tag.")
  public List<TaggedSensor> getSensors() {
    return sensors;
  }

  public void setSensors(List<TaggedSensor> sensors) {
    this.sensors = sensors;
  }

  public Tag vehicles(List<TaggedVehicle> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public Tag addVehiclesItem(TaggedVehicle vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<TaggedVehicle>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * The vehicles that belong to this tag.
   * @return vehicles
  **/
  @ApiModelProperty(value = "The vehicles that belong to this tag.")
  public List<TaggedVehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<TaggedVehicle> vehicles) {
    this.vehicles = vehicles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.addresses, tag.addresses) &&
        Objects.equals(this.assets, tag.assets) &&
        Objects.equals(this.drivers, tag.drivers) &&
        Objects.equals(this.groupId, tag.groupId) &&
        Objects.equals(this.id, tag.id) &&
        Objects.equals(this.machines, tag.machines) &&
        Objects.equals(this.name, tag.name) &&
        Objects.equals(this.parentTagId, tag.parentTagId) &&
        Objects.equals(this.sensors, tag.sensors) &&
        Objects.equals(this.vehicles, tag.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, assets, drivers, groupId, id, machines, name, parentTagId, sensors, vehicles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentTagId: ").append(toIndentedString(parentTagId)).append("\n");
    sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
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

