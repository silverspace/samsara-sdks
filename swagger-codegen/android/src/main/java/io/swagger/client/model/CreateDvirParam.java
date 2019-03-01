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

@ApiModel(description = "")
public class CreateDvirParam {
  
  public enum InspectionTypeEnum {
     mechanic, 
  };
  @SerializedName("inspectionType")
  private InspectionTypeEnum inspectionType = null;
  @SerializedName("mechanicNotes")
  private String mechanicNotes = null;
  @SerializedName("odometerMiles")
  private Integer odometerMiles = null;
  @SerializedName("previousDefectsCorrected")
  private Boolean previousDefectsCorrected = null;
  @SerializedName("previousDefectsIgnored")
  private Boolean previousDefectsIgnored = null;
  public enum SafeEnum {
     safe,  unsafe, 
  };
  @SerializedName("safe")
  private SafeEnum safe = null;
  @SerializedName("trailerId")
  private Integer trailerId = null;
  @SerializedName("userEmail")
  private String userEmail = null;
  @SerializedName("vehicleId")
  private Integer vehicleId = null;

  /**
   * Only type 'mechanic' is currently accepted.
   **/
  @ApiModelProperty(required = true, value = "Only type 'mechanic' is currently accepted.")
  public InspectionTypeEnum getInspectionType() {
    return inspectionType;
  }
  public void setInspectionType(InspectionTypeEnum inspectionType) {
    this.inspectionType = inspectionType;
  }

  /**
   * Any notes from the mechanic.
   **/
  @ApiModelProperty(value = "Any notes from the mechanic.")
  public String getMechanicNotes() {
    return mechanicNotes;
  }
  public void setMechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
  }

  /**
   * The current odometer of the vehicle.
   **/
  @ApiModelProperty(value = "The current odometer of the vehicle.")
  public Integer getOdometerMiles() {
    return odometerMiles;
  }
  public void setOdometerMiles(Integer odometerMiles) {
    this.odometerMiles = odometerMiles;
  }

  /**
   * Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
   **/
  @ApiModelProperty(value = "Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.")
  public Boolean getPreviousDefectsCorrected() {
    return previousDefectsCorrected;
  }
  public void setPreviousDefectsCorrected(Boolean previousDefectsCorrected) {
    this.previousDefectsCorrected = previousDefectsCorrected;
  }

  /**
   * Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
   **/
  @ApiModelProperty(value = "Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.")
  public Boolean getPreviousDefectsIgnored() {
    return previousDefectsIgnored;
  }
  public void setPreviousDefectsIgnored(Boolean previousDefectsIgnored) {
    this.previousDefectsIgnored = previousDefectsIgnored;
  }

  /**
   * Whether or not this vehicle or trailer is safe to drive.
   **/
  @ApiModelProperty(required = true, value = "Whether or not this vehicle or trailer is safe to drive.")
  public SafeEnum getSafe() {
    return safe;
  }
  public void setSafe(SafeEnum safe) {
    this.safe = safe;
  }

  /**
   * Id of trailer being inspected. Either vehicleId or trailerId must be provided.
   **/
  @ApiModelProperty(value = "Id of trailer being inspected. Either vehicleId or trailerId must be provided.")
  public Integer getTrailerId() {
    return trailerId;
  }
  public void setTrailerId(Integer trailerId) {
    this.trailerId = trailerId;
  }

  /**
   * The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
   **/
  @ApiModelProperty(required = true, value = "The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.")
  public String getUserEmail() {
    return userEmail;
  }
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  /**
   * Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
   **/
  @ApiModelProperty(value = "Id of vehicle being inspected. Either vehicleId or trailerId must be provided.")
  public Integer getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Integer vehicleId) {
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
    CreateDvirParam createDvirParam = (CreateDvirParam) o;
    return (this.inspectionType == null ? createDvirParam.inspectionType == null : this.inspectionType.equals(createDvirParam.inspectionType)) &&
        (this.mechanicNotes == null ? createDvirParam.mechanicNotes == null : this.mechanicNotes.equals(createDvirParam.mechanicNotes)) &&
        (this.odometerMiles == null ? createDvirParam.odometerMiles == null : this.odometerMiles.equals(createDvirParam.odometerMiles)) &&
        (this.previousDefectsCorrected == null ? createDvirParam.previousDefectsCorrected == null : this.previousDefectsCorrected.equals(createDvirParam.previousDefectsCorrected)) &&
        (this.previousDefectsIgnored == null ? createDvirParam.previousDefectsIgnored == null : this.previousDefectsIgnored.equals(createDvirParam.previousDefectsIgnored)) &&
        (this.safe == null ? createDvirParam.safe == null : this.safe.equals(createDvirParam.safe)) &&
        (this.trailerId == null ? createDvirParam.trailerId == null : this.trailerId.equals(createDvirParam.trailerId)) &&
        (this.userEmail == null ? createDvirParam.userEmail == null : this.userEmail.equals(createDvirParam.userEmail)) &&
        (this.vehicleId == null ? createDvirParam.vehicleId == null : this.vehicleId.equals(createDvirParam.vehicleId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.inspectionType == null ? 0: this.inspectionType.hashCode());
    result = 31 * result + (this.mechanicNotes == null ? 0: this.mechanicNotes.hashCode());
    result = 31 * result + (this.odometerMiles == null ? 0: this.odometerMiles.hashCode());
    result = 31 * result + (this.previousDefectsCorrected == null ? 0: this.previousDefectsCorrected.hashCode());
    result = 31 * result + (this.previousDefectsIgnored == null ? 0: this.previousDefectsIgnored.hashCode());
    result = 31 * result + (this.safe == null ? 0: this.safe.hashCode());
    result = 31 * result + (this.trailerId == null ? 0: this.trailerId.hashCode());
    result = 31 * result + (this.userEmail == null ? 0: this.userEmail.hashCode());
    result = 31 * result + (this.vehicleId == null ? 0: this.vehicleId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDvirParam {\n");
    
    sb.append("  inspectionType: ").append(inspectionType).append("\n");
    sb.append("  mechanicNotes: ").append(mechanicNotes).append("\n");
    sb.append("  odometerMiles: ").append(odometerMiles).append("\n");
    sb.append("  previousDefectsCorrected: ").append(previousDefectsCorrected).append("\n");
    sb.append("  previousDefectsIgnored: ").append(previousDefectsIgnored).append("\n");
    sb.append("  safe: ").append(safe).append("\n");
    sb.append("  trailerId: ").append(trailerId).append("\n");
    sb.append("  userEmail: ").append(userEmail).append("\n");
    sb.append("  vehicleId: ").append(vehicleId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
