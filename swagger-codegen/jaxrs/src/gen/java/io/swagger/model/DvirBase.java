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
import io.swagger.model.DvirBaseAuthorSignature;
import io.swagger.model.DvirBaseMechanicOrAgentSignature;
import io.swagger.model.DvirBaseNextDriverSignature;
import io.swagger.model.DvirBaseTrailerDefects;
import io.swagger.model.DvirBaseVehicle;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * DvirBase
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public class DvirBase   {
  @JsonProperty("authorSignature")
  private DvirBaseAuthorSignature authorSignature = null;

  @JsonProperty("defectsCorrected")
  private Boolean defectsCorrected = null;

  @JsonProperty("defectsNeedNotBeCorrected")
  private Boolean defectsNeedNotBeCorrected = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("inspectionType")
  private String inspectionType = null;

  @JsonProperty("mechanicNotes")
  private String mechanicNotes = null;

  @JsonProperty("mechanicOrAgentSignature")
  private DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature = null;

  @JsonProperty("nextDriverSignature")
  private DvirBaseNextDriverSignature nextDriverSignature = null;

  @JsonProperty("odometerMiles")
  private Long odometerMiles = null;

  @JsonProperty("timeMs")
  private Long timeMs = null;

  @JsonProperty("trailerDefects")
  private List<DvirBaseTrailerDefects> trailerDefects = null;

  @JsonProperty("trailerId")
  private Integer trailerId = null;

  @JsonProperty("trailerName")
  private String trailerName = null;

  @JsonProperty("vehicle")
  private DvirBaseVehicle vehicle = null;

  @JsonProperty("vehicleCondition")
  private String vehicleCondition = null;

  @JsonProperty("vehicleDefects")
  private List<DvirBaseTrailerDefects> vehicleDefects = null;

  public DvirBase authorSignature(DvirBaseAuthorSignature authorSignature) {
    this.authorSignature = authorSignature;
    return this;
  }

  /**
   * Get authorSignature
   * @return authorSignature
   **/
  @JsonProperty("authorSignature")
  @ApiModelProperty(value = "")
  public DvirBaseAuthorSignature getAuthorSignature() {
    return authorSignature;
  }

  public void setAuthorSignature(DvirBaseAuthorSignature authorSignature) {
    this.authorSignature = authorSignature;
  }

  public DvirBase defectsCorrected(Boolean defectsCorrected) {
    this.defectsCorrected = defectsCorrected;
    return this;
  }

  /**
   * Signifies if the defects on the vehicle corrected after the DVIR is done.
   * @return defectsCorrected
   **/
  @JsonProperty("defectsCorrected")
  @ApiModelProperty(example = "true", value = "Signifies if the defects on the vehicle corrected after the DVIR is done.")
  public Boolean isDefectsCorrected() {
    return defectsCorrected;
  }

  public void setDefectsCorrected(Boolean defectsCorrected) {
    this.defectsCorrected = defectsCorrected;
  }

  public DvirBase defectsNeedNotBeCorrected(Boolean defectsNeedNotBeCorrected) {
    this.defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
    return this;
  }

  /**
   * Signifies if the defects on this vehicle can be ignored.
   * @return defectsNeedNotBeCorrected
   **/
  @JsonProperty("defectsNeedNotBeCorrected")
  @ApiModelProperty(example = "false", value = "Signifies if the defects on this vehicle can be ignored.")
  public Boolean isDefectsNeedNotBeCorrected() {
    return defectsNeedNotBeCorrected;
  }

  public void setDefectsNeedNotBeCorrected(Boolean defectsNeedNotBeCorrected) {
    this.defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
  }

  public DvirBase id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The id of this DVIR record.
   * @return id
   **/
  @JsonProperty("id")
  @ApiModelProperty(example = "19", value = "The id of this DVIR record.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DvirBase inspectionType(String inspectionType) {
    this.inspectionType = inspectionType;
    return this;
  }

  /**
   * Inspection type of the DVIR.
   * @return inspectionType
   **/
  @JsonProperty("inspectionType")
  @ApiModelProperty(example = "pre trip", value = "Inspection type of the DVIR.")
  public String getInspectionType() {
    return inspectionType;
  }

  public void setInspectionType(String inspectionType) {
    this.inspectionType = inspectionType;
  }

  public DvirBase mechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
    return this;
  }

  /**
   * The mechanics notes on the DVIR.
   * @return mechanicNotes
   **/
  @JsonProperty("mechanicNotes")
  @ApiModelProperty(example = "The vehicle is now safe.", value = "The mechanics notes on the DVIR.")
  public String getMechanicNotes() {
    return mechanicNotes;
  }

  public void setMechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
  }

  public DvirBase mechanicOrAgentSignature(DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature) {
    this.mechanicOrAgentSignature = mechanicOrAgentSignature;
    return this;
  }

  /**
   * Get mechanicOrAgentSignature
   * @return mechanicOrAgentSignature
   **/
  @JsonProperty("mechanicOrAgentSignature")
  @ApiModelProperty(value = "")
  public DvirBaseMechanicOrAgentSignature getMechanicOrAgentSignature() {
    return mechanicOrAgentSignature;
  }

  public void setMechanicOrAgentSignature(DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature) {
    this.mechanicOrAgentSignature = mechanicOrAgentSignature;
  }

  public DvirBase nextDriverSignature(DvirBaseNextDriverSignature nextDriverSignature) {
    this.nextDriverSignature = nextDriverSignature;
    return this;
  }

  /**
   * Get nextDriverSignature
   * @return nextDriverSignature
   **/
  @JsonProperty("nextDriverSignature")
  @ApiModelProperty(value = "")
  public DvirBaseNextDriverSignature getNextDriverSignature() {
    return nextDriverSignature;
  }

  public void setNextDriverSignature(DvirBaseNextDriverSignature nextDriverSignature) {
    this.nextDriverSignature = nextDriverSignature;
  }

  public DvirBase odometerMiles(Long odometerMiles) {
    this.odometerMiles = odometerMiles;
    return this;
  }

  /**
   * The odometer reading in miles for the vehicle when the DVIR was done.
   * @return odometerMiles
   **/
  @JsonProperty("odometerMiles")
  @ApiModelProperty(example = "49912", value = "The odometer reading in miles for the vehicle when the DVIR was done.")
  public Long getOdometerMiles() {
    return odometerMiles;
  }

  public void setOdometerMiles(Long odometerMiles) {
    this.odometerMiles = odometerMiles;
  }

  public DvirBase timeMs(Long timeMs) {
    this.timeMs = timeMs;
    return this;
  }

  /**
   * Timestamp of this DVIR in UNIX milliseconds.
   * @return timeMs
   **/
  @JsonProperty("timeMs")
  @ApiModelProperty(example = "1453449599999", value = "Timestamp of this DVIR in UNIX milliseconds.")
  public Long getTimeMs() {
    return timeMs;
  }

  public void setTimeMs(Long timeMs) {
    this.timeMs = timeMs;
  }

  public DvirBase trailerDefects(List<DvirBaseTrailerDefects> trailerDefects) {
    this.trailerDefects = trailerDefects;
    return this;
  }

  public DvirBase addTrailerDefectsItem(DvirBaseTrailerDefects trailerDefectsItem) {
    if (this.trailerDefects == null) {
      this.trailerDefects = new ArrayList<DvirBaseTrailerDefects>();
    }
    this.trailerDefects.add(trailerDefectsItem);
    return this;
  }

  /**
   * Defects registered for the trailer which was part of the DVIR.
   * @return trailerDefects
   **/
  @JsonProperty("trailerDefects")
  @ApiModelProperty(value = "Defects registered for the trailer which was part of the DVIR.")
  public List<DvirBaseTrailerDefects> getTrailerDefects() {
    return trailerDefects;
  }

  public void setTrailerDefects(List<DvirBaseTrailerDefects> trailerDefects) {
    this.trailerDefects = trailerDefects;
  }

  public DvirBase trailerId(Integer trailerId) {
    this.trailerId = trailerId;
    return this;
  }

  /**
   * The id of the trailer which was part of the DVIR.
   * @return trailerId
   **/
  @JsonProperty("trailerId")
  @ApiModelProperty(example = "19", value = "The id of the trailer which was part of the DVIR.")
  public Integer getTrailerId() {
    return trailerId;
  }

  public void setTrailerId(Integer trailerId) {
    this.trailerId = trailerId;
  }

  public DvirBase trailerName(String trailerName) {
    this.trailerName = trailerName;
    return this;
  }

  /**
   * The name of the trailer which was part of the DVIR.
   * @return trailerName
   **/
  @JsonProperty("trailerName")
  @ApiModelProperty(example = "Storer's Trailer 19", value = "The name of the trailer which was part of the DVIR.")
  public String getTrailerName() {
    return trailerName;
  }

  public void setTrailerName(String trailerName) {
    this.trailerName = trailerName;
  }

  public DvirBase vehicle(DvirBaseVehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

  /**
   * Get vehicle
   * @return vehicle
   **/
  @JsonProperty("vehicle")
  @ApiModelProperty(value = "")
  public DvirBaseVehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(DvirBaseVehicle vehicle) {
    this.vehicle = vehicle;
  }

  public DvirBase vehicleCondition(String vehicleCondition) {
    this.vehicleCondition = vehicleCondition;
    return this;
  }

  /**
   * The condition of vechile on which DVIR was done.
   * @return vehicleCondition
   **/
  @JsonProperty("vehicleCondition")
  @ApiModelProperty(example = "SATISFACTORY", value = "The condition of vechile on which DVIR was done.")
  public String getVehicleCondition() {
    return vehicleCondition;
  }

  public void setVehicleCondition(String vehicleCondition) {
    this.vehicleCondition = vehicleCondition;
  }

  public DvirBase vehicleDefects(List<DvirBaseTrailerDefects> vehicleDefects) {
    this.vehicleDefects = vehicleDefects;
    return this;
  }

  public DvirBase addVehicleDefectsItem(DvirBaseTrailerDefects vehicleDefectsItem) {
    if (this.vehicleDefects == null) {
      this.vehicleDefects = new ArrayList<DvirBaseTrailerDefects>();
    }
    this.vehicleDefects.add(vehicleDefectsItem);
    return this;
  }

  /**
   * Defects registered for the vehicle which was part of the DVIR.
   * @return vehicleDefects
   **/
  @JsonProperty("vehicleDefects")
  @ApiModelProperty(value = "Defects registered for the vehicle which was part of the DVIR.")
  public List<DvirBaseTrailerDefects> getVehicleDefects() {
    return vehicleDefects;
  }

  public void setVehicleDefects(List<DvirBaseTrailerDefects> vehicleDefects) {
    this.vehicleDefects = vehicleDefects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvirBase dvirBase = (DvirBase) o;
    return Objects.equals(this.authorSignature, dvirBase.authorSignature) &&
        Objects.equals(this.defectsCorrected, dvirBase.defectsCorrected) &&
        Objects.equals(this.defectsNeedNotBeCorrected, dvirBase.defectsNeedNotBeCorrected) &&
        Objects.equals(this.id, dvirBase.id) &&
        Objects.equals(this.inspectionType, dvirBase.inspectionType) &&
        Objects.equals(this.mechanicNotes, dvirBase.mechanicNotes) &&
        Objects.equals(this.mechanicOrAgentSignature, dvirBase.mechanicOrAgentSignature) &&
        Objects.equals(this.nextDriverSignature, dvirBase.nextDriverSignature) &&
        Objects.equals(this.odometerMiles, dvirBase.odometerMiles) &&
        Objects.equals(this.timeMs, dvirBase.timeMs) &&
        Objects.equals(this.trailerDefects, dvirBase.trailerDefects) &&
        Objects.equals(this.trailerId, dvirBase.trailerId) &&
        Objects.equals(this.trailerName, dvirBase.trailerName) &&
        Objects.equals(this.vehicle, dvirBase.vehicle) &&
        Objects.equals(this.vehicleCondition, dvirBase.vehicleCondition) &&
        Objects.equals(this.vehicleDefects, dvirBase.vehicleDefects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorSignature, defectsCorrected, defectsNeedNotBeCorrected, id, inspectionType, mechanicNotes, mechanicOrAgentSignature, nextDriverSignature, odometerMiles, timeMs, trailerDefects, trailerId, trailerName, vehicle, vehicleCondition, vehicleDefects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvirBase {\n");
    
    sb.append("    authorSignature: ").append(toIndentedString(authorSignature)).append("\n");
    sb.append("    defectsCorrected: ").append(toIndentedString(defectsCorrected)).append("\n");
    sb.append("    defectsNeedNotBeCorrected: ").append(toIndentedString(defectsNeedNotBeCorrected)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inspectionType: ").append(toIndentedString(inspectionType)).append("\n");
    sb.append("    mechanicNotes: ").append(toIndentedString(mechanicNotes)).append("\n");
    sb.append("    mechanicOrAgentSignature: ").append(toIndentedString(mechanicOrAgentSignature)).append("\n");
    sb.append("    nextDriverSignature: ").append(toIndentedString(nextDriverSignature)).append("\n");
    sb.append("    odometerMiles: ").append(toIndentedString(odometerMiles)).append("\n");
    sb.append("    timeMs: ").append(toIndentedString(timeMs)).append("\n");
    sb.append("    trailerDefects: ").append(toIndentedString(trailerDefects)).append("\n");
    sb.append("    trailerId: ").append(toIndentedString(trailerId)).append("\n");
    sb.append("    trailerName: ").append(toIndentedString(trailerName)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    vehicleCondition: ").append(toIndentedString(vehicleCondition)).append("\n");
    sb.append("    vehicleDefects: ").append(toIndentedString(vehicleDefects)).append("\n");
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

