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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The authors signature for the DVIR.
 **/
@ApiModel(description = "The authors signature for the DVIR.")
public class DvirBaseAuthorSignature {
  
  @SerializedName("mechanicUserId")
  private Long mechanicUserId = null;
  @SerializedName("driverId")
  private Long driverId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("signedAt")
  private Long signedAt = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("username")
  private String username = null;

  /**
   * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
   **/
  @ApiModelProperty(value = "ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.")
  public Long getMechanicUserId() {
    return mechanicUserId;
  }
  public void setMechanicUserId(Long mechanicUserId) {
    this.mechanicUserId = mechanicUserId;
  }

  /**
   * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
   **/
  @ApiModelProperty(value = "ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  /**
   * The name of the driver or mechanic who signed the DVIR.
   **/
  @ApiModelProperty(value = "The name of the driver or mechanic who signed the DVIR.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The time in millis when the DVIR was signed
   **/
  @ApiModelProperty(value = "The time in millis when the DVIR was signed")
  public Long getSignedAt() {
    return signedAt;
  }
  public void setSignedAt(Long signedAt) {
    this.signedAt = signedAt;
  }

  /**
   * Type corresponds to whether the signature corresponds to driver|mechanic.
   **/
  @ApiModelProperty(value = "Type corresponds to whether the signature corresponds to driver|mechanic.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Email of the  driver|mechanic who signed the DVIR.
   **/
  @ApiModelProperty(value = "Email of the  driver|mechanic who signed the DVIR.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Username of the  driver|mechanic who signed the DVIR.
   **/
  @ApiModelProperty(value = "Username of the  driver|mechanic who signed the DVIR.")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvirBaseAuthorSignature dvirBaseAuthorSignature = (DvirBaseAuthorSignature) o;
    return (this.mechanicUserId == null ? dvirBaseAuthorSignature.mechanicUserId == null : this.mechanicUserId.equals(dvirBaseAuthorSignature.mechanicUserId)) &&
        (this.driverId == null ? dvirBaseAuthorSignature.driverId == null : this.driverId.equals(dvirBaseAuthorSignature.driverId)) &&
        (this.name == null ? dvirBaseAuthorSignature.name == null : this.name.equals(dvirBaseAuthorSignature.name)) &&
        (this.signedAt == null ? dvirBaseAuthorSignature.signedAt == null : this.signedAt.equals(dvirBaseAuthorSignature.signedAt)) &&
        (this.type == null ? dvirBaseAuthorSignature.type == null : this.type.equals(dvirBaseAuthorSignature.type)) &&
        (this.email == null ? dvirBaseAuthorSignature.email == null : this.email.equals(dvirBaseAuthorSignature.email)) &&
        (this.username == null ? dvirBaseAuthorSignature.username == null : this.username.equals(dvirBaseAuthorSignature.username));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mechanicUserId == null ? 0: this.mechanicUserId.hashCode());
    result = 31 * result + (this.driverId == null ? 0: this.driverId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.signedAt == null ? 0: this.signedAt.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirBaseAuthorSignature {\n");
    
    sb.append("  mechanicUserId: ").append(mechanicUserId).append("\n");
    sb.append("  driverId: ").append(driverId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  signedAt: ").append(signedAt).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
