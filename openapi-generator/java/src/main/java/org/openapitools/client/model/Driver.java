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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.DriverBase;
import org.openapitools.client.model.TagMetadata;

/**
 * Driver
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-01T05:34:00.976Z[GMT]")
public class Driver {
  public static final String SERIALIZED_NAME_ELD_ADVERSE_WEATHER_EXEMPTION_ENABLED = "eldAdverseWeatherExemptionEnabled";
  @SerializedName(SERIALIZED_NAME_ELD_ADVERSE_WEATHER_EXEMPTION_ENABLED)
  private Boolean eldAdverseWeatherExemptionEnabled;

  public static final String SERIALIZED_NAME_ELD_BIG_DAY_EXEMPTION_ENABLED = "eldBigDayExemptionEnabled";
  @SerializedName(SERIALIZED_NAME_ELD_BIG_DAY_EXEMPTION_ENABLED)
  private Boolean eldBigDayExemptionEnabled;

  public static final String SERIALIZED_NAME_ELD_DAY_START_HOUR = "eldDayStartHour";
  @SerializedName(SERIALIZED_NAME_ELD_DAY_START_HOUR)
  private Integer eldDayStartHour;

  public static final String SERIALIZED_NAME_ELD_EXEMPT = "eldExempt";
  @SerializedName(SERIALIZED_NAME_ELD_EXEMPT)
  private Boolean eldExempt;

  public static final String SERIALIZED_NAME_ELD_EXEMPT_REASON = "eldExemptReason";
  @SerializedName(SERIALIZED_NAME_ELD_EXEMPT_REASON)
  private String eldExemptReason;

  public static final String SERIALIZED_NAME_ELD_PC_ENABLED = "eldPcEnabled";
  @SerializedName(SERIALIZED_NAME_ELD_PC_ENABLED)
  private Boolean eldPcEnabled = false;

  public static final String SERIALIZED_NAME_ELD_YM_ENABLED = "eldYmEnabled";
  @SerializedName(SERIALIZED_NAME_ELD_YM_ENABLED)
  private Boolean eldYmEnabled = false;

  public static final String SERIALIZED_NAME_EXTERNAL_IDS = "externalIds";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDS)
  private Map<String, String> externalIds = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_LICENSE_NUMBER = "licenseNumber";
  @SerializedName(SERIALIZED_NAME_LICENSE_NUMBER)
  private String licenseNumber;

  public static final String SERIALIZED_NAME_LICENSE_STATE = "licenseState";
  @SerializedName(SERIALIZED_NAME_LICENSE_STATE)
  private String licenseState;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_VEHICLE_ID = "vehicleId";
  @SerializedName(SERIALIZED_NAME_VEHICLE_ID)
  private Long vehicleId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_IS_DEACTIVATED = "isDeactivated";
  @SerializedName(SERIALIZED_NAME_IS_DEACTIVATED)
  private Boolean isDeactivated;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TagMetadata> tags = new ArrayList<TagMetadata>();

  public Driver eldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   * @return eldAdverseWeatherExemptionEnabled
  **/
  @ApiModelProperty(value = "Flag indicating this driver may use Adverse Weather exemptions in ELD logs.")
  public Boolean getEldAdverseWeatherExemptionEnabled() {
    return eldAdverseWeatherExemptionEnabled;
  }

  public void setEldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
  }

  public Driver eldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
   * @return eldBigDayExemptionEnabled
  **/
  @ApiModelProperty(value = "Flag indicating this driver may use Big Day excemptions in ELD logs.")
  public Boolean getEldBigDayExemptionEnabled() {
    return eldBigDayExemptionEnabled;
  }

  public void setEldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
  }

  public Driver eldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
    return this;
  }

   /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
   * @return eldDayStartHour
  **/
  @ApiModelProperty(value = "0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.")
  public Integer getEldDayStartHour() {
    return eldDayStartHour;
  }

  public void setEldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
  }

  public Driver eldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
    return this;
  }

   /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
   * @return eldExempt
  **/
  @ApiModelProperty(value = "Flag indicating this driver is exempt from the Electronic Logging Mandate.")
  public Boolean getEldExempt() {
    return eldExempt;
  }

  public void setEldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
  }

  public Driver eldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
    return this;
  }

   /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
   * @return eldExemptReason
  **/
  @ApiModelProperty(value = "Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).")
  public String getEldExemptReason() {
    return eldExemptReason;
  }

  public void setEldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
  }

  public Driver eldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
   * @return eldPcEnabled
  **/
  @ApiModelProperty(value = "Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.")
  public Boolean getEldPcEnabled() {
    return eldPcEnabled;
  }

  public void setEldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
  }

  public Driver eldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
   * @return eldYmEnabled
  **/
  @ApiModelProperty(value = "Flag indicating this driver may select the Yard Move duty status in ELD logs.")
  public Boolean getEldYmEnabled() {
    return eldYmEnabled;
  }

  public void setEldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
  }

  public Driver externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public Driver putExternalIdsItem(String key, String externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new HashMap<String, String>();
    }
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

   /**
   * Dictionary of external IDs (string key-value pairs)
   * @return externalIds
  **/
  @ApiModelProperty(example = "{\"maintenanceId\":\"250020\",\"payrollId\":\"123\"}", value = "Dictionary of external IDs (string key-value pairs)")
  public Map<String, String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  public Driver groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * ID of the group if the organization has multiple groups (uncommon).
   * @return groupId
  **/
  @ApiModelProperty(example = "101", value = "ID of the group if the organization has multiple groups (uncommon).")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public Driver licenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
    return this;
  }

   /**
   * Driver&#39;s state issued license number.
   * @return licenseNumber
  **/
  @ApiModelProperty(example = "E1234567", value = "Driver's state issued license number.")
  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public Driver licenseState(String licenseState) {
    this.licenseState = licenseState;
    return this;
  }

   /**
   * Abbreviation of state that issued driver&#39;s license.
   * @return licenseState
  **/
  @ApiModelProperty(example = "CA", value = "Abbreviation of state that issued driver's license.")
  public String getLicenseState() {
    return licenseState;
  }

  public void setLicenseState(String licenseState) {
    this.licenseState = licenseState;
  }

  public Driver name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Driver&#39;s name.
   * @return name
  **/
  @ApiModelProperty(example = "Susan Jones", required = true, value = "Driver's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Driver notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes about the driver.
   * @return notes
  **/
  @ApiModelProperty(example = "Also goes by the nickname 'Furious Fred'.", value = "Notes about the driver.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Driver phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Driver&#39;s phone number. Please include only digits, ex. 4157771234
   * @return phone
  **/
  @ApiModelProperty(example = "5558234327", value = "Driver's phone number. Please include only digits, ex. 4157771234")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Driver username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Driver&#39;s login username into the driver app.
   * @return username
  **/
  @ApiModelProperty(example = "Susan Jones", value = "Driver's login username into the driver app.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Driver vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
   * @return vehicleId
  **/
  @ApiModelProperty(example = "444", value = "ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).")
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public Driver id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the driver.
   * @return id
  **/
  @ApiModelProperty(example = "556", required = true, value = "ID of the driver.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Driver isDeactivated(Boolean isDeactivated) {
    this.isDeactivated = isDeactivated;
    return this;
  }

   /**
   * True if the driver account has been deactivated.
   * @return isDeactivated
  **/
  @ApiModelProperty(value = "True if the driver account has been deactivated.")
  public Boolean getIsDeactivated() {
    return isDeactivated;
  }

  public void setIsDeactivated(Boolean isDeactivated) {
    this.isDeactivated = isDeactivated;
  }

  public Driver tags(List<TagMetadata> tags) {
    this.tags = tags;
    return this;
  }

  public Driver addTagsItem(TagMetadata tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagMetadata>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<TagMetadata> getTags() {
    return tags;
  }

  public void setTags(List<TagMetadata> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Driver driver = (Driver) o;
    return Objects.equals(this.eldAdverseWeatherExemptionEnabled, driver.eldAdverseWeatherExemptionEnabled) &&
        Objects.equals(this.eldBigDayExemptionEnabled, driver.eldBigDayExemptionEnabled) &&
        Objects.equals(this.eldDayStartHour, driver.eldDayStartHour) &&
        Objects.equals(this.eldExempt, driver.eldExempt) &&
        Objects.equals(this.eldExemptReason, driver.eldExemptReason) &&
        Objects.equals(this.eldPcEnabled, driver.eldPcEnabled) &&
        Objects.equals(this.eldYmEnabled, driver.eldYmEnabled) &&
        Objects.equals(this.externalIds, driver.externalIds) &&
        Objects.equals(this.groupId, driver.groupId) &&
        Objects.equals(this.licenseNumber, driver.licenseNumber) &&
        Objects.equals(this.licenseState, driver.licenseState) &&
        Objects.equals(this.name, driver.name) &&
        Objects.equals(this.notes, driver.notes) &&
        Objects.equals(this.phone, driver.phone) &&
        Objects.equals(this.username, driver.username) &&
        Objects.equals(this.vehicleId, driver.vehicleId) &&
        Objects.equals(this.id, driver.id) &&
        Objects.equals(this.isDeactivated, driver.isDeactivated) &&
        Objects.equals(this.tags, driver.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eldAdverseWeatherExemptionEnabled, eldBigDayExemptionEnabled, eldDayStartHour, eldExempt, eldExemptReason, eldPcEnabled, eldYmEnabled, externalIds, groupId, licenseNumber, licenseState, name, notes, phone, username, vehicleId, id, isDeactivated, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Driver {\n");
    sb.append("    eldAdverseWeatherExemptionEnabled: ").append(toIndentedString(eldAdverseWeatherExemptionEnabled)).append("\n");
    sb.append("    eldBigDayExemptionEnabled: ").append(toIndentedString(eldBigDayExemptionEnabled)).append("\n");
    sb.append("    eldDayStartHour: ").append(toIndentedString(eldDayStartHour)).append("\n");
    sb.append("    eldExempt: ").append(toIndentedString(eldExempt)).append("\n");
    sb.append("    eldExemptReason: ").append(toIndentedString(eldExemptReason)).append("\n");
    sb.append("    eldPcEnabled: ").append(toIndentedString(eldPcEnabled)).append("\n");
    sb.append("    eldYmEnabled: ").append(toIndentedString(eldYmEnabled)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    licenseNumber: ").append(toIndentedString(licenseNumber)).append("\n");
    sb.append("    licenseState: ").append(toIndentedString(licenseState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeactivated: ").append(toIndentedString(isDeactivated)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

