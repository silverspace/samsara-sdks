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
import io.swagger.model.AssetCable;
import io.swagger.model.AssetCurrentLocation;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Basic information of an asset
 */
@ApiModel(description = "Basic information of an asset")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public class AssetCurrentLocationsResponse   {
  @JsonProperty("cable")
  private List<AssetCable> cable = null;

  @JsonProperty("engineHours")
  private Integer engineHours = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("location")
  private List<AssetCurrentLocation> location = null;

  @JsonProperty("name")
  private String name = null;

  public AssetCurrentLocationsResponse cable(List<AssetCable> cable) {
    this.cable = cable;
    return this;
  }

  public AssetCurrentLocationsResponse addCableItem(AssetCable cableItem) {
    if (this.cable == null) {
      this.cable = new ArrayList<AssetCable>();
    }
    this.cable.add(cableItem);
    return this;
  }

  /**
   * The cable connected to the asset
   * @return cable
   **/
  @JsonProperty("cable")
  @ApiModelProperty(value = "The cable connected to the asset")
  public List<AssetCable> getCable() {
    return cable;
  }

  public void setCable(List<AssetCable> cable) {
    this.cable = cable;
  }

  public AssetCurrentLocationsResponse engineHours(Integer engineHours) {
    this.engineHours = engineHours;
    return this;
  }

  /**
   * Engine hours
   * @return engineHours
   **/
  @JsonProperty("engineHours")
  @ApiModelProperty(example = "104", value = "Engine hours")
  public Integer getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(Integer engineHours) {
    this.engineHours = engineHours;
  }

  public AssetCurrentLocationsResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Asset ID
   * @return id
   **/
  @JsonProperty("id")
  @ApiModelProperty(example = "1", required = true, value = "Asset ID")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AssetCurrentLocationsResponse location(List<AssetCurrentLocation> location) {
    this.location = location;
    return this;
  }

  public AssetCurrentLocationsResponse addLocationItem(AssetCurrentLocation locationItem) {
    if (this.location == null) {
      this.location = new ArrayList<AssetCurrentLocation>();
    }
    this.location.add(locationItem);
    return this;
  }

  /**
   * Current location of an asset
   * @return location
   **/
  @JsonProperty("location")
  @ApiModelProperty(value = "Current location of an asset")
  public List<AssetCurrentLocation> getLocation() {
    return location;
  }

  public void setLocation(List<AssetCurrentLocation> location) {
    this.location = location;
  }

  public AssetCurrentLocationsResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Asset name
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(example = "Trailer 123", value = "Asset name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetCurrentLocationsResponse assetCurrentLocationsResponse = (AssetCurrentLocationsResponse) o;
    return Objects.equals(this.cable, assetCurrentLocationsResponse.cable) &&
        Objects.equals(this.engineHours, assetCurrentLocationsResponse.engineHours) &&
        Objects.equals(this.id, assetCurrentLocationsResponse.id) &&
        Objects.equals(this.location, assetCurrentLocationsResponse.location) &&
        Objects.equals(this.name, assetCurrentLocationsResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cable, engineHours, id, location, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetCurrentLocationsResponse {\n");
    
    sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
    sb.append("    engineHours: ").append(toIndentedString(engineHours)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

