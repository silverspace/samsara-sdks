package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DvirBaseAuthorSignature;
import org.openapitools.model.DvirBaseMechanicOrAgentSignature;
import org.openapitools.model.DvirBaseNextDriverSignature;
import org.openapitools.model.DvirBaseTrailerDefects;
import org.openapitools.model.DvirBaseVehicle;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DvirBase  {
  
  @ApiModelProperty(value = "")
  @Valid
  private DvirBaseAuthorSignature authorSignature = null;

  @ApiModelProperty(example = "true", value = "Signifies if the defects on the vehicle corrected after the DVIR is done.")
 /**
   * Signifies if the defects on the vehicle corrected after the DVIR is done.
  **/
  private Boolean defectsCorrected;

  @ApiModelProperty(example = "false", value = "Signifies if the defects on this vehicle can be ignored.")
 /**
   * Signifies if the defects on this vehicle can be ignored.
  **/
  private Boolean defectsNeedNotBeCorrected;

  @ApiModelProperty(example = "19", value = "The id of this DVIR record.")
 /**
   * The id of this DVIR record.
  **/
  private Long id;

  @ApiModelProperty(example = "pre trip", value = "Inspection type of the DVIR.")
 /**
   * Inspection type of the DVIR.
  **/
  private String inspectionType;

  @ApiModelProperty(example = "The vehicle is now safe.", value = "The mechanics notes on the DVIR.")
 /**
   * The mechanics notes on the DVIR.
  **/
  private String mechanicNotes;

  @ApiModelProperty(value = "")
  @Valid
  private DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature = null;

  @ApiModelProperty(value = "")
  @Valid
  private DvirBaseNextDriverSignature nextDriverSignature = null;

  @ApiModelProperty(example = "49912", value = "The odometer reading in miles for the vehicle when the DVIR was done.")
 /**
   * The odometer reading in miles for the vehicle when the DVIR was done.
  **/
  private Long odometerMiles;

  @ApiModelProperty(example = "1453449599999", value = "Timestamp of this DVIR in UNIX milliseconds.")
 /**
   * Timestamp of this DVIR in UNIX milliseconds.
  **/
  private Long timeMs;

  @ApiModelProperty(value = "Defects registered for the trailer which was part of the DVIR.")
  @Valid
 /**
   * Defects registered for the trailer which was part of the DVIR.
  **/
  private List<DvirBaseTrailerDefects> trailerDefects = null;

  @ApiModelProperty(example = "19", value = "The id of the trailer which was part of the DVIR.")
 /**
   * The id of the trailer which was part of the DVIR.
  **/
  private Integer trailerId;

  @ApiModelProperty(example = "Storer's Trailer 19", value = "The name of the trailer which was part of the DVIR.")
 /**
   * The name of the trailer which was part of the DVIR.
  **/
  private String trailerName;

  @ApiModelProperty(value = "")
  @Valid
  private DvirBaseVehicle vehicle = null;

  @ApiModelProperty(example = "SATISFACTORY", value = "The condition of vechile on which DVIR was done.")
 /**
   * The condition of vechile on which DVIR was done.
  **/
  private String vehicleCondition;

  @ApiModelProperty(value = "Defects registered for the vehicle which was part of the DVIR.")
  @Valid
 /**
   * Defects registered for the vehicle which was part of the DVIR.
  **/
  private List<DvirBaseTrailerDefects> vehicleDefects = null;
 /**
   * Get authorSignature
   * @return authorSignature
  **/
  @JsonProperty("authorSignature")
  public DvirBaseAuthorSignature getAuthorSignature() {
    return authorSignature;
  }

  public void setAuthorSignature(DvirBaseAuthorSignature authorSignature) {
    this.authorSignature = authorSignature;
  }

  public DvirBase authorSignature(DvirBaseAuthorSignature authorSignature) {
    this.authorSignature = authorSignature;
    return this;
  }

 /**
   * Signifies if the defects on the vehicle corrected after the DVIR is done.
   * @return defectsCorrected
  **/
  @JsonProperty("defectsCorrected")
  public Boolean getDefectsCorrected() {
    return defectsCorrected;
  }

  public void setDefectsCorrected(Boolean defectsCorrected) {
    this.defectsCorrected = defectsCorrected;
  }

  public DvirBase defectsCorrected(Boolean defectsCorrected) {
    this.defectsCorrected = defectsCorrected;
    return this;
  }

 /**
   * Signifies if the defects on this vehicle can be ignored.
   * @return defectsNeedNotBeCorrected
  **/
  @JsonProperty("defectsNeedNotBeCorrected")
  public Boolean getDefectsNeedNotBeCorrected() {
    return defectsNeedNotBeCorrected;
  }

  public void setDefectsNeedNotBeCorrected(Boolean defectsNeedNotBeCorrected) {
    this.defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
  }

  public DvirBase defectsNeedNotBeCorrected(Boolean defectsNeedNotBeCorrected) {
    this.defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
    return this;
  }

 /**
   * The id of this DVIR record.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DvirBase id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Inspection type of the DVIR.
   * @return inspectionType
  **/
  @JsonProperty("inspectionType")
  public String getInspectionType() {
    return inspectionType;
  }

  public void setInspectionType(String inspectionType) {
    this.inspectionType = inspectionType;
  }

  public DvirBase inspectionType(String inspectionType) {
    this.inspectionType = inspectionType;
    return this;
  }

 /**
   * The mechanics notes on the DVIR.
   * @return mechanicNotes
  **/
  @JsonProperty("mechanicNotes")
  public String getMechanicNotes() {
    return mechanicNotes;
  }

  public void setMechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
  }

  public DvirBase mechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
    return this;
  }

 /**
   * Get mechanicOrAgentSignature
   * @return mechanicOrAgentSignature
  **/
  @JsonProperty("mechanicOrAgentSignature")
  public DvirBaseMechanicOrAgentSignature getMechanicOrAgentSignature() {
    return mechanicOrAgentSignature;
  }

  public void setMechanicOrAgentSignature(DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature) {
    this.mechanicOrAgentSignature = mechanicOrAgentSignature;
  }

  public DvirBase mechanicOrAgentSignature(DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature) {
    this.mechanicOrAgentSignature = mechanicOrAgentSignature;
    return this;
  }

 /**
   * Get nextDriverSignature
   * @return nextDriverSignature
  **/
  @JsonProperty("nextDriverSignature")
  public DvirBaseNextDriverSignature getNextDriverSignature() {
    return nextDriverSignature;
  }

  public void setNextDriverSignature(DvirBaseNextDriverSignature nextDriverSignature) {
    this.nextDriverSignature = nextDriverSignature;
  }

  public DvirBase nextDriverSignature(DvirBaseNextDriverSignature nextDriverSignature) {
    this.nextDriverSignature = nextDriverSignature;
    return this;
  }

 /**
   * The odometer reading in miles for the vehicle when the DVIR was done.
   * @return odometerMiles
  **/
  @JsonProperty("odometerMiles")
  public Long getOdometerMiles() {
    return odometerMiles;
  }

  public void setOdometerMiles(Long odometerMiles) {
    this.odometerMiles = odometerMiles;
  }

  public DvirBase odometerMiles(Long odometerMiles) {
    this.odometerMiles = odometerMiles;
    return this;
  }

 /**
   * Timestamp of this DVIR in UNIX milliseconds.
   * @return timeMs
  **/
  @JsonProperty("timeMs")
  public Long getTimeMs() {
    return timeMs;
  }

  public void setTimeMs(Long timeMs) {
    this.timeMs = timeMs;
  }

  public DvirBase timeMs(Long timeMs) {
    this.timeMs = timeMs;
    return this;
  }

 /**
   * Defects registered for the trailer which was part of the DVIR.
   * @return trailerDefects
  **/
  @JsonProperty("trailerDefects")
  public List<DvirBaseTrailerDefects> getTrailerDefects() {
    return trailerDefects;
  }

  public void setTrailerDefects(List<DvirBaseTrailerDefects> trailerDefects) {
    this.trailerDefects = trailerDefects;
  }

  public DvirBase trailerDefects(List<DvirBaseTrailerDefects> trailerDefects) {
    this.trailerDefects = trailerDefects;
    return this;
  }

  public DvirBase addTrailerDefectsItem(DvirBaseTrailerDefects trailerDefectsItem) {
    this.trailerDefects.add(trailerDefectsItem);
    return this;
  }

 /**
   * The id of the trailer which was part of the DVIR.
   * @return trailerId
  **/
  @JsonProperty("trailerId")
  public Integer getTrailerId() {
    return trailerId;
  }

  public void setTrailerId(Integer trailerId) {
    this.trailerId = trailerId;
  }

  public DvirBase trailerId(Integer trailerId) {
    this.trailerId = trailerId;
    return this;
  }

 /**
   * The name of the trailer which was part of the DVIR.
   * @return trailerName
  **/
  @JsonProperty("trailerName")
  public String getTrailerName() {
    return trailerName;
  }

  public void setTrailerName(String trailerName) {
    this.trailerName = trailerName;
  }

  public DvirBase trailerName(String trailerName) {
    this.trailerName = trailerName;
    return this;
  }

 /**
   * Get vehicle
   * @return vehicle
  **/
  @JsonProperty("vehicle")
  public DvirBaseVehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(DvirBaseVehicle vehicle) {
    this.vehicle = vehicle;
  }

  public DvirBase vehicle(DvirBaseVehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

 /**
   * The condition of vechile on which DVIR was done.
   * @return vehicleCondition
  **/
  @JsonProperty("vehicleCondition")
  public String getVehicleCondition() {
    return vehicleCondition;
  }

  public void setVehicleCondition(String vehicleCondition) {
    this.vehicleCondition = vehicleCondition;
  }

  public DvirBase vehicleCondition(String vehicleCondition) {
    this.vehicleCondition = vehicleCondition;
    return this;
  }

 /**
   * Defects registered for the vehicle which was part of the DVIR.
   * @return vehicleDefects
  **/
  @JsonProperty("vehicleDefects")
  public List<DvirBaseTrailerDefects> getVehicleDefects() {
    return vehicleDefects;
  }

  public void setVehicleDefects(List<DvirBaseTrailerDefects> vehicleDefects) {
    this.vehicleDefects = vehicleDefects;
  }

  public DvirBase vehicleDefects(List<DvirBaseTrailerDefects> vehicleDefects) {
    this.vehicleDefects = vehicleDefects;
    return this;
  }

  public DvirBase addVehicleDefectsItem(DvirBaseTrailerDefects vehicleDefectsItem) {
    this.vehicleDefects.add(vehicleDefectsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

