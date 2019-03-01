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
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DriverBase {
  
  @SerializedName("eldAdverseWeatherExemptionEnabled")
  private Boolean eldAdverseWeatherExemptionEnabled = null;
  @SerializedName("eldBigDayExemptionEnabled")
  private Boolean eldBigDayExemptionEnabled = null;
  @SerializedName("eldDayStartHour")
  private Integer eldDayStartHour = null;
  @SerializedName("eldExempt")
  private Boolean eldExempt = null;
  @SerializedName("eldExemptReason")
  private String eldExemptReason = null;
  @SerializedName("eldPcEnabled")
  private Boolean eldPcEnabled = false;
  @SerializedName("eldYmEnabled")
  private Boolean eldYmEnabled = false;
  @SerializedName("externalIds")
  private Map<String, String> externalIds = null;
  @SerializedName("groupId")
  private Long groupId = null;
  @SerializedName("licenseNumber")
  private String licenseNumber = null;
  @SerializedName("licenseState")
  private String licenseState = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("notes")
  private String notes = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("vehicleId")
  private Long vehicleId = null;

  /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   **/
  @ApiModelProperty(value = "Flag indicating this driver may use Adverse Weather exemptions in ELD logs.")
  public Boolean getEldAdverseWeatherExemptionEnabled() {
    return eldAdverseWeatherExemptionEnabled;
  }
  public void setEldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
  }

  /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
   **/
  @ApiModelProperty(value = "Flag indicating this driver may use Big Day excemptions in ELD logs.")
  public Boolean getEldBigDayExemptionEnabled() {
    return eldBigDayExemptionEnabled;
  }
  public void setEldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
  }

  /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
   **/
  @ApiModelProperty(value = "0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.")
  public Integer getEldDayStartHour() {
    return eldDayStartHour;
  }
  public void setEldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
  }

  /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
   **/
  @ApiModelProperty(value = "Flag indicating this driver is exempt from the Electronic Logging Mandate.")
  public Boolean getEldExempt() {
    return eldExempt;
  }
  public void setEldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
  }

  /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
   **/
  @ApiModelProperty(value = "Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).")
  public String getEldExemptReason() {
    return eldExemptReason;
  }
  public void setEldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
  }

  /**
   * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
   **/
  @ApiModelProperty(value = "Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.")
  public Boolean getEldPcEnabled() {
    return eldPcEnabled;
  }
  public void setEldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
  }

  /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
   **/
  @ApiModelProperty(value = "Flag indicating this driver may select the Yard Move duty status in ELD logs.")
  public Boolean getEldYmEnabled() {
    return eldYmEnabled;
  }
  public void setEldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
  }

  /**
   * Dictionary of external IDs (string key-value pairs)
   **/
  @ApiModelProperty(value = "Dictionary of external IDs (string key-value pairs)")
  public Map<String, String> getExternalIds() {
    return externalIds;
  }
  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  /**
   * ID of the group if the organization has multiple groups (uncommon).
   **/
  @ApiModelProperty(value = "ID of the group if the organization has multiple groups (uncommon).")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * Driver's state issued license number.
   **/
  @ApiModelProperty(value = "Driver's state issued license number.")
  public String getLicenseNumber() {
    return licenseNumber;
  }
  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  /**
   * Abbreviation of state that issued driver's license.
   **/
  @ApiModelProperty(value = "Abbreviation of state that issued driver's license.")
  public String getLicenseState() {
    return licenseState;
  }
  public void setLicenseState(String licenseState) {
    this.licenseState = licenseState;
  }

  /**
   * Driver's name.
   **/
  @ApiModelProperty(required = true, value = "Driver's name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Notes about the driver.
   **/
  @ApiModelProperty(value = "Notes about the driver.")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Driver's phone number. Please include only digits, ex. 4157771234
   **/
  @ApiModelProperty(value = "Driver's phone number. Please include only digits, ex. 4157771234")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Driver's login username into the driver app.
   **/
  @ApiModelProperty(value = "Driver's login username into the driver app.")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
   **/
  @ApiModelProperty(value = "ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverBase driverBase = (DriverBase) o;
    return (this.eldAdverseWeatherExemptionEnabled == null ? driverBase.eldAdverseWeatherExemptionEnabled == null : this.eldAdverseWeatherExemptionEnabled.equals(driverBase.eldAdverseWeatherExemptionEnabled)) &&
        (this.eldBigDayExemptionEnabled == null ? driverBase.eldBigDayExemptionEnabled == null : this.eldBigDayExemptionEnabled.equals(driverBase.eldBigDayExemptionEnabled)) &&
        (this.eldDayStartHour == null ? driverBase.eldDayStartHour == null : this.eldDayStartHour.equals(driverBase.eldDayStartHour)) &&
        (this.eldExempt == null ? driverBase.eldExempt == null : this.eldExempt.equals(driverBase.eldExempt)) &&
        (this.eldExemptReason == null ? driverBase.eldExemptReason == null : this.eldExemptReason.equals(driverBase.eldExemptReason)) &&
        (this.eldPcEnabled == null ? driverBase.eldPcEnabled == null : this.eldPcEnabled.equals(driverBase.eldPcEnabled)) &&
        (this.eldYmEnabled == null ? driverBase.eldYmEnabled == null : this.eldYmEnabled.equals(driverBase.eldYmEnabled)) &&
        (this.externalIds == null ? driverBase.externalIds == null : this.externalIds.equals(driverBase.externalIds)) &&
        (this.groupId == null ? driverBase.groupId == null : this.groupId.equals(driverBase.groupId)) &&
        (this.licenseNumber == null ? driverBase.licenseNumber == null : this.licenseNumber.equals(driverBase.licenseNumber)) &&
        (this.licenseState == null ? driverBase.licenseState == null : this.licenseState.equals(driverBase.licenseState)) &&
        (this.name == null ? driverBase.name == null : this.name.equals(driverBase.name)) &&
        (this.notes == null ? driverBase.notes == null : this.notes.equals(driverBase.notes)) &&
        (this.phone == null ? driverBase.phone == null : this.phone.equals(driverBase.phone)) &&
        (this.username == null ? driverBase.username == null : this.username.equals(driverBase.username)) &&
        (this.vehicleId == null ? driverBase.vehicleId == null : this.vehicleId.equals(driverBase.vehicleId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eldAdverseWeatherExemptionEnabled == null ? 0: this.eldAdverseWeatherExemptionEnabled.hashCode());
    result = 31 * result + (this.eldBigDayExemptionEnabled == null ? 0: this.eldBigDayExemptionEnabled.hashCode());
    result = 31 * result + (this.eldDayStartHour == null ? 0: this.eldDayStartHour.hashCode());
    result = 31 * result + (this.eldExempt == null ? 0: this.eldExempt.hashCode());
    result = 31 * result + (this.eldExemptReason == null ? 0: this.eldExemptReason.hashCode());
    result = 31 * result + (this.eldPcEnabled == null ? 0: this.eldPcEnabled.hashCode());
    result = 31 * result + (this.eldYmEnabled == null ? 0: this.eldYmEnabled.hashCode());
    result = 31 * result + (this.externalIds == null ? 0: this.externalIds.hashCode());
    result = 31 * result + (this.groupId == null ? 0: this.groupId.hashCode());
    result = 31 * result + (this.licenseNumber == null ? 0: this.licenseNumber.hashCode());
    result = 31 * result + (this.licenseState == null ? 0: this.licenseState.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.notes == null ? 0: this.notes.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.vehicleId == null ? 0: this.vehicleId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverBase {\n");
    
    sb.append("  eldAdverseWeatherExemptionEnabled: ").append(eldAdverseWeatherExemptionEnabled).append("\n");
    sb.append("  eldBigDayExemptionEnabled: ").append(eldBigDayExemptionEnabled).append("\n");
    sb.append("  eldDayStartHour: ").append(eldDayStartHour).append("\n");
    sb.append("  eldExempt: ").append(eldExempt).append("\n");
    sb.append("  eldExemptReason: ").append(eldExemptReason).append("\n");
    sb.append("  eldPcEnabled: ").append(eldPcEnabled).append("\n");
    sb.append("  eldYmEnabled: ").append(eldYmEnabled).append("\n");
    sb.append("  externalIds: ").append(externalIds).append("\n");
    sb.append("  groupId: ").append(groupId).append("\n");
    sb.append("  licenseNumber: ").append(licenseNumber).append("\n");
    sb.append("  licenseState: ").append(licenseState).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  vehicleId: ").append(vehicleId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
