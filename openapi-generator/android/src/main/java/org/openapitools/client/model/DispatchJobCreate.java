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

@ApiModel(description = "")
public class DispatchJobCreate {
  
  @SerializedName("destination_address")
  private String destinationAddress = null;
  @SerializedName("destination_address_id")
  private Long destinationAddressId = null;
  @SerializedName("destination_lat")
  private Double destinationLat = null;
  @SerializedName("destination_lng")
  private Double destinationLng = null;
  @SerializedName("destination_name")
  private String destinationName = null;
  @SerializedName("notes")
  private String notes = null;
  @SerializedName("scheduled_arrival_time_ms")
  private Long scheduledArrivalTimeMs = null;
  @SerializedName("scheduled_departure_time_ms")
  private Long scheduledDepartureTimeMs = null;

  /**
   * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
   **/
  @ApiModelProperty(value = "The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.")
  public String getDestinationAddress() {
    return destinationAddress;
  }
  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  /**
   * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
   **/
  @ApiModelProperty(value = "ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.")
  public Long getDestinationAddressId() {
    return destinationAddressId;
  }
  public void setDestinationAddressId(Long destinationAddressId) {
    this.destinationAddressId = destinationAddressId;
  }

  /**
   * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   **/
  @ApiModelProperty(value = "Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.")
  public Double getDestinationLat() {
    return destinationLat;
  }
  public void setDestinationLat(Double destinationLat) {
    this.destinationLat = destinationLat;
  }

  /**
   * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   **/
  @ApiModelProperty(value = "Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.")
  public Double getDestinationLng() {
    return destinationLng;
  }
  public void setDestinationLng(Double destinationLng) {
    this.destinationLng = destinationLng;
  }

  /**
   * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
   **/
  @ApiModelProperty(value = "The name of the job destination. If provided, it will take precedence over the name of the address book entry.")
  public String getDestinationName() {
    return destinationName;
  }
  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  /**
   * Notes regarding the details of this job.
   **/
  @ApiModelProperty(value = "Notes regarding the details of this job.")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * The time at which the assigned driver is scheduled to arrive at the job destination.
   **/
  @ApiModelProperty(required = true, value = "The time at which the assigned driver is scheduled to arrive at the job destination.")
  public Long getScheduledArrivalTimeMs() {
    return scheduledArrivalTimeMs;
  }
  public void setScheduledArrivalTimeMs(Long scheduledArrivalTimeMs) {
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
  }

  /**
   * The time at which the assigned driver is scheduled to depart from the job destination.
   **/
  @ApiModelProperty(value = "The time at which the assigned driver is scheduled to depart from the job destination.")
  public Long getScheduledDepartureTimeMs() {
    return scheduledDepartureTimeMs;
  }
  public void setScheduledDepartureTimeMs(Long scheduledDepartureTimeMs) {
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchJobCreate dispatchJobCreate = (DispatchJobCreate) o;
    return (this.destinationAddress == null ? dispatchJobCreate.destinationAddress == null : this.destinationAddress.equals(dispatchJobCreate.destinationAddress)) &&
        (this.destinationAddressId == null ? dispatchJobCreate.destinationAddressId == null : this.destinationAddressId.equals(dispatchJobCreate.destinationAddressId)) &&
        (this.destinationLat == null ? dispatchJobCreate.destinationLat == null : this.destinationLat.equals(dispatchJobCreate.destinationLat)) &&
        (this.destinationLng == null ? dispatchJobCreate.destinationLng == null : this.destinationLng.equals(dispatchJobCreate.destinationLng)) &&
        (this.destinationName == null ? dispatchJobCreate.destinationName == null : this.destinationName.equals(dispatchJobCreate.destinationName)) &&
        (this.notes == null ? dispatchJobCreate.notes == null : this.notes.equals(dispatchJobCreate.notes)) &&
        (this.scheduledArrivalTimeMs == null ? dispatchJobCreate.scheduledArrivalTimeMs == null : this.scheduledArrivalTimeMs.equals(dispatchJobCreate.scheduledArrivalTimeMs)) &&
        (this.scheduledDepartureTimeMs == null ? dispatchJobCreate.scheduledDepartureTimeMs == null : this.scheduledDepartureTimeMs.equals(dispatchJobCreate.scheduledDepartureTimeMs));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.destinationAddress == null ? 0: this.destinationAddress.hashCode());
    result = 31 * result + (this.destinationAddressId == null ? 0: this.destinationAddressId.hashCode());
    result = 31 * result + (this.destinationLat == null ? 0: this.destinationLat.hashCode());
    result = 31 * result + (this.destinationLng == null ? 0: this.destinationLng.hashCode());
    result = 31 * result + (this.destinationName == null ? 0: this.destinationName.hashCode());
    result = 31 * result + (this.notes == null ? 0: this.notes.hashCode());
    result = 31 * result + (this.scheduledArrivalTimeMs == null ? 0: this.scheduledArrivalTimeMs.hashCode());
    result = 31 * result + (this.scheduledDepartureTimeMs == null ? 0: this.scheduledDepartureTimeMs.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatchJobCreate {\n");
    
    sb.append("  destinationAddress: ").append(destinationAddress).append("\n");
    sb.append("  destinationAddressId: ").append(destinationAddressId).append("\n");
    sb.append("  destinationLat: ").append(destinationLat).append("\n");
    sb.append("  destinationLng: ").append(destinationLng).append("\n");
    sb.append("  destinationName: ").append(destinationName).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  scheduledArrivalTimeMs: ").append(scheduledArrivalTimeMs).append("\n");
    sb.append("  scheduledDepartureTimeMs: ").append(scheduledDepartureTimeMs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
