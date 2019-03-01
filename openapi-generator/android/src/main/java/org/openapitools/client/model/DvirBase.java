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
import org.openapitools.client.model.DvirBaseAuthorSignature;
import org.openapitools.client.model.DvirBaseMechanicOrAgentSignature;
import org.openapitools.client.model.DvirBaseNextDriverSignature;
import org.openapitools.client.model.DvirBaseTrailerDefects;
import org.openapitools.client.model.DvirBaseVehicle;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DvirBase {
  
  @SerializedName("authorSignature")
  private DvirBaseAuthorSignature authorSignature = null;
  @SerializedName("defectsCorrected")
  private Boolean defectsCorrected = null;
  @SerializedName("defectsNeedNotBeCorrected")
  private Boolean defectsNeedNotBeCorrected = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("inspectionType")
  private String inspectionType = null;
  @SerializedName("mechanicNotes")
  private String mechanicNotes = null;
  @SerializedName("mechanicOrAgentSignature")
  private DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature = null;
  @SerializedName("nextDriverSignature")
  private DvirBaseNextDriverSignature nextDriverSignature = null;
  @SerializedName("odometerMiles")
  private Long odometerMiles = null;
  @SerializedName("timeMs")
  private Long timeMs = null;
  @SerializedName("trailerDefects")
  private List<DvirBaseTrailerDefects> trailerDefects = null;
  @SerializedName("trailerId")
  private Integer trailerId = null;
  @SerializedName("trailerName")
  private String trailerName = null;
  @SerializedName("vehicle")
  private DvirBaseVehicle vehicle = null;
  @SerializedName("vehicleCondition")
  private String vehicleCondition = null;
  @SerializedName("vehicleDefects")
  private List<DvirBaseTrailerDefects> vehicleDefects = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public DvirBaseAuthorSignature getAuthorSignature() {
    return authorSignature;
  }
  public void setAuthorSignature(DvirBaseAuthorSignature authorSignature) {
    this.authorSignature = authorSignature;
  }

  /**
   * Signifies if the defects on the vehicle corrected after the DVIR is done.
   **/
  @ApiModelProperty(value = "Signifies if the defects on the vehicle corrected after the DVIR is done.")
  public Boolean getDefectsCorrected() {
    return defectsCorrected;
  }
  public void setDefectsCorrected(Boolean defectsCorrected) {
    this.defectsCorrected = defectsCorrected;
  }

  /**
   * Signifies if the defects on this vehicle can be ignored.
   **/
  @ApiModelProperty(value = "Signifies if the defects on this vehicle can be ignored.")
  public Boolean getDefectsNeedNotBeCorrected() {
    return defectsNeedNotBeCorrected;
  }
  public void setDefectsNeedNotBeCorrected(Boolean defectsNeedNotBeCorrected) {
    this.defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
  }

  /**
   * The id of this DVIR record.
   **/
  @ApiModelProperty(value = "The id of this DVIR record.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Inspection type of the DVIR.
   **/
  @ApiModelProperty(value = "Inspection type of the DVIR.")
  public String getInspectionType() {
    return inspectionType;
  }
  public void setInspectionType(String inspectionType) {
    this.inspectionType = inspectionType;
  }

  /**
   * The mechanics notes on the DVIR.
   **/
  @ApiModelProperty(value = "The mechanics notes on the DVIR.")
  public String getMechanicNotes() {
    return mechanicNotes;
  }
  public void setMechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DvirBaseMechanicOrAgentSignature getMechanicOrAgentSignature() {
    return mechanicOrAgentSignature;
  }
  public void setMechanicOrAgentSignature(DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature) {
    this.mechanicOrAgentSignature = mechanicOrAgentSignature;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DvirBaseNextDriverSignature getNextDriverSignature() {
    return nextDriverSignature;
  }
  public void setNextDriverSignature(DvirBaseNextDriverSignature nextDriverSignature) {
    this.nextDriverSignature = nextDriverSignature;
  }

  /**
   * The odometer reading in miles for the vehicle when the DVIR was done.
   **/
  @ApiModelProperty(value = "The odometer reading in miles for the vehicle when the DVIR was done.")
  public Long getOdometerMiles() {
    return odometerMiles;
  }
  public void setOdometerMiles(Long odometerMiles) {
    this.odometerMiles = odometerMiles;
  }

  /**
   * Timestamp of this DVIR in UNIX milliseconds.
   **/
  @ApiModelProperty(value = "Timestamp of this DVIR in UNIX milliseconds.")
  public Long getTimeMs() {
    return timeMs;
  }
  public void setTimeMs(Long timeMs) {
    this.timeMs = timeMs;
  }

  /**
   * Defects registered for the trailer which was part of the DVIR.
   **/
  @ApiModelProperty(value = "Defects registered for the trailer which was part of the DVIR.")
  public List<DvirBaseTrailerDefects> getTrailerDefects() {
    return trailerDefects;
  }
  public void setTrailerDefects(List<DvirBaseTrailerDefects> trailerDefects) {
    this.trailerDefects = trailerDefects;
  }

  /**
   * The id of the trailer which was part of the DVIR.
   **/
  @ApiModelProperty(value = "The id of the trailer which was part of the DVIR.")
  public Integer getTrailerId() {
    return trailerId;
  }
  public void setTrailerId(Integer trailerId) {
    this.trailerId = trailerId;
  }

  /**
   * The name of the trailer which was part of the DVIR.
   **/
  @ApiModelProperty(value = "The name of the trailer which was part of the DVIR.")
  public String getTrailerName() {
    return trailerName;
  }
  public void setTrailerName(String trailerName) {
    this.trailerName = trailerName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DvirBaseVehicle getVehicle() {
    return vehicle;
  }
  public void setVehicle(DvirBaseVehicle vehicle) {
    this.vehicle = vehicle;
  }

  /**
   * The condition of vechile on which DVIR was done.
   **/
  @ApiModelProperty(value = "The condition of vechile on which DVIR was done.")
  public String getVehicleCondition() {
    return vehicleCondition;
  }
  public void setVehicleCondition(String vehicleCondition) {
    this.vehicleCondition = vehicleCondition;
  }

  /**
   * Defects registered for the vehicle which was part of the DVIR.
   **/
  @ApiModelProperty(value = "Defects registered for the vehicle which was part of the DVIR.")
  public List<DvirBaseTrailerDefects> getVehicleDefects() {
    return vehicleDefects;
  }
  public void setVehicleDefects(List<DvirBaseTrailerDefects> vehicleDefects) {
    this.vehicleDefects = vehicleDefects;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvirBase dvirBase = (DvirBase) o;
    return (this.authorSignature == null ? dvirBase.authorSignature == null : this.authorSignature.equals(dvirBase.authorSignature)) &&
        (this.defectsCorrected == null ? dvirBase.defectsCorrected == null : this.defectsCorrected.equals(dvirBase.defectsCorrected)) &&
        (this.defectsNeedNotBeCorrected == null ? dvirBase.defectsNeedNotBeCorrected == null : this.defectsNeedNotBeCorrected.equals(dvirBase.defectsNeedNotBeCorrected)) &&
        (this.id == null ? dvirBase.id == null : this.id.equals(dvirBase.id)) &&
        (this.inspectionType == null ? dvirBase.inspectionType == null : this.inspectionType.equals(dvirBase.inspectionType)) &&
        (this.mechanicNotes == null ? dvirBase.mechanicNotes == null : this.mechanicNotes.equals(dvirBase.mechanicNotes)) &&
        (this.mechanicOrAgentSignature == null ? dvirBase.mechanicOrAgentSignature == null : this.mechanicOrAgentSignature.equals(dvirBase.mechanicOrAgentSignature)) &&
        (this.nextDriverSignature == null ? dvirBase.nextDriverSignature == null : this.nextDriverSignature.equals(dvirBase.nextDriverSignature)) &&
        (this.odometerMiles == null ? dvirBase.odometerMiles == null : this.odometerMiles.equals(dvirBase.odometerMiles)) &&
        (this.timeMs == null ? dvirBase.timeMs == null : this.timeMs.equals(dvirBase.timeMs)) &&
        (this.trailerDefects == null ? dvirBase.trailerDefects == null : this.trailerDefects.equals(dvirBase.trailerDefects)) &&
        (this.trailerId == null ? dvirBase.trailerId == null : this.trailerId.equals(dvirBase.trailerId)) &&
        (this.trailerName == null ? dvirBase.trailerName == null : this.trailerName.equals(dvirBase.trailerName)) &&
        (this.vehicle == null ? dvirBase.vehicle == null : this.vehicle.equals(dvirBase.vehicle)) &&
        (this.vehicleCondition == null ? dvirBase.vehicleCondition == null : this.vehicleCondition.equals(dvirBase.vehicleCondition)) &&
        (this.vehicleDefects == null ? dvirBase.vehicleDefects == null : this.vehicleDefects.equals(dvirBase.vehicleDefects));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.authorSignature == null ? 0: this.authorSignature.hashCode());
    result = 31 * result + (this.defectsCorrected == null ? 0: this.defectsCorrected.hashCode());
    result = 31 * result + (this.defectsNeedNotBeCorrected == null ? 0: this.defectsNeedNotBeCorrected.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.inspectionType == null ? 0: this.inspectionType.hashCode());
    result = 31 * result + (this.mechanicNotes == null ? 0: this.mechanicNotes.hashCode());
    result = 31 * result + (this.mechanicOrAgentSignature == null ? 0: this.mechanicOrAgentSignature.hashCode());
    result = 31 * result + (this.nextDriverSignature == null ? 0: this.nextDriverSignature.hashCode());
    result = 31 * result + (this.odometerMiles == null ? 0: this.odometerMiles.hashCode());
    result = 31 * result + (this.timeMs == null ? 0: this.timeMs.hashCode());
    result = 31 * result + (this.trailerDefects == null ? 0: this.trailerDefects.hashCode());
    result = 31 * result + (this.trailerId == null ? 0: this.trailerId.hashCode());
    result = 31 * result + (this.trailerName == null ? 0: this.trailerName.hashCode());
    result = 31 * result + (this.vehicle == null ? 0: this.vehicle.hashCode());
    result = 31 * result + (this.vehicleCondition == null ? 0: this.vehicleCondition.hashCode());
    result = 31 * result + (this.vehicleDefects == null ? 0: this.vehicleDefects.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirBase {\n");
    
    sb.append("  authorSignature: ").append(authorSignature).append("\n");
    sb.append("  defectsCorrected: ").append(defectsCorrected).append("\n");
    sb.append("  defectsNeedNotBeCorrected: ").append(defectsNeedNotBeCorrected).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  inspectionType: ").append(inspectionType).append("\n");
    sb.append("  mechanicNotes: ").append(mechanicNotes).append("\n");
    sb.append("  mechanicOrAgentSignature: ").append(mechanicOrAgentSignature).append("\n");
    sb.append("  nextDriverSignature: ").append(nextDriverSignature).append("\n");
    sb.append("  odometerMiles: ").append(odometerMiles).append("\n");
    sb.append("  timeMs: ").append(timeMs).append("\n");
    sb.append("  trailerDefects: ").append(trailerDefects).append("\n");
    sb.append("  trailerId: ").append(trailerId).append("\n");
    sb.append("  trailerName: ").append(trailerName).append("\n");
    sb.append("  vehicle: ").append(vehicle).append("\n");
    sb.append("  vehicleCondition: ").append(vehicleCondition).append("\n");
    sb.append("  vehicleDefects: ").append(vehicleDefects).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
