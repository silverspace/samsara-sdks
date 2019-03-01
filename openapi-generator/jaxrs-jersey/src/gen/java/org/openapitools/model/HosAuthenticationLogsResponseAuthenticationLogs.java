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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * HosAuthenticationLogsResponseAuthenticationLogs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class HosAuthenticationLogsResponseAuthenticationLogs   {
  @JsonProperty("actionType")
  private String actionType;

  @JsonProperty("address")
  private String address;

  @JsonProperty("city")
  private String city;

  @JsonProperty("happenedAtMs")
  private Long happenedAtMs;

  @JsonProperty("addressName")
  private String addressName;

  @JsonProperty("state")
  private String state;

  public HosAuthenticationLogsResponseAuthenticationLogs actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * The log type - one of &#39;signin&#39; or &#39;signout&#39;
   * @return actionType
   **/
  @JsonProperty("actionType")
  @ApiModelProperty(example = "signin", value = "The log type - one of 'signin' or 'signout'")
  
  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address at which the log was recorded, if applicable.
   * @return address
   **/
  @JsonProperty("address")
  @ApiModelProperty(example = "123 Main St., Ahwatukee, Arizona 85044", value = "Address at which the log was recorded, if applicable.")
  
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City in which the log was recorded, if applicable.
   * @return city
   **/
  @JsonProperty("city")
  @ApiModelProperty(example = "Ahwatukee", value = "City in which the log was recorded, if applicable.")
  
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs happenedAtMs(Long happenedAtMs) {
    this.happenedAtMs = happenedAtMs;
    return this;
  }

  /**
   * The time at which the event was recorded in UNIX milliseconds.
   * @return happenedAtMs
   **/
  @JsonProperty("happenedAtMs")
  @ApiModelProperty(example = "1462881998034", value = "The time at which the event was recorded in UNIX milliseconds.")
  
  public Long getHappenedAtMs() {
    return happenedAtMs;
  }

  public void setHappenedAtMs(Long happenedAtMs) {
    this.happenedAtMs = happenedAtMs;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs addressName(String addressName) {
    this.addressName = addressName;
    return this;
  }

  /**
   * Address name from the group address book at which the log was recorded, if applicable.
   * @return addressName
   **/
  @JsonProperty("addressName")
  @ApiModelProperty(example = "Garage Number 3", value = "Address name from the group address book at which the log was recorded, if applicable.")
  
  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public HosAuthenticationLogsResponseAuthenticationLogs state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State in which the log was recorded, if applicable.
   * @return state
   **/
  @JsonProperty("state")
  @ApiModelProperty(example = "Arizona", value = "State in which the log was recorded, if applicable.")
  
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosAuthenticationLogsResponseAuthenticationLogs hosAuthenticationLogsResponseAuthenticationLogs = (HosAuthenticationLogsResponseAuthenticationLogs) o;
    return Objects.equals(this.actionType, hosAuthenticationLogsResponseAuthenticationLogs.actionType) &&
        Objects.equals(this.address, hosAuthenticationLogsResponseAuthenticationLogs.address) &&
        Objects.equals(this.city, hosAuthenticationLogsResponseAuthenticationLogs.city) &&
        Objects.equals(this.happenedAtMs, hosAuthenticationLogsResponseAuthenticationLogs.happenedAtMs) &&
        Objects.equals(this.addressName, hosAuthenticationLogsResponseAuthenticationLogs.addressName) &&
        Objects.equals(this.state, hosAuthenticationLogsResponseAuthenticationLogs.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, address, city, happenedAtMs, addressName, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosAuthenticationLogsResponseAuthenticationLogs {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    happenedAtMs: ").append(toIndentedString(happenedAtMs)).append("\n");
    sb.append("    addressName: ").append(toIndentedString(addressName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

