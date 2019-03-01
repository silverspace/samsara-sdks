package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DvirBaseAuthorSignature;
import io.swagger.model.DvirBaseMechanicOrAgentSignature;
import io.swagger.model.DvirBaseNextDriverSignature;
import io.swagger.model.DvirBaseTrailerDefects;
import io.swagger.model.DvirBaseVehicle;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class DvirBase   {
  
  private DvirBaseAuthorSignature authorSignature = null;
  private Boolean defectsCorrected = null;
  private Boolean defectsNeedNotBeCorrected = null;
  private Long id = null;
  private String inspectionType = null;
  private String mechanicNotes = null;
  private DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature = null;
  private DvirBaseNextDriverSignature nextDriverSignature = null;
  private Long odometerMiles = null;
  private Long timeMs = null;
  private List<DvirBaseTrailerDefects> trailerDefects = new ArrayList<DvirBaseTrailerDefects>();
  private Integer trailerId = null;
  private String trailerName = null;
  private DvirBaseVehicle vehicle = null;
  private String vehicleCondition = null;
  private List<DvirBaseTrailerDefects> vehicleDefects = new ArrayList<DvirBaseTrailerDefects>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorSignature")
  public DvirBaseAuthorSignature getAuthorSignature() {
    return authorSignature;
  }
  public void setAuthorSignature(DvirBaseAuthorSignature authorSignature) {
    this.authorSignature = authorSignature;
  }

  /**
   * Signifies if the defects on the vehicle corrected after the DVIR is done.
   **/
  
  @ApiModelProperty(example = "true", value = "Signifies if the defects on the vehicle corrected after the DVIR is done.")
  @JsonProperty("defectsCorrected")
  public Boolean isDefectsCorrected() {
    return defectsCorrected;
  }
  public void setDefectsCorrected(Boolean defectsCorrected) {
    this.defectsCorrected = defectsCorrected;
  }

  /**
   * Signifies if the defects on this vehicle can be ignored.
   **/
  
  @ApiModelProperty(example = "false", value = "Signifies if the defects on this vehicle can be ignored.")
  @JsonProperty("defectsNeedNotBeCorrected")
  public Boolean isDefectsNeedNotBeCorrected() {
    return defectsNeedNotBeCorrected;
  }
  public void setDefectsNeedNotBeCorrected(Boolean defectsNeedNotBeCorrected) {
    this.defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
  }

  /**
   * The id of this DVIR record.
   **/
  
  @ApiModelProperty(example = "19", value = "The id of this DVIR record.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Inspection type of the DVIR.
   **/
  
  @ApiModelProperty(example = "pre trip", value = "Inspection type of the DVIR.")
  @JsonProperty("inspectionType")
  public String getInspectionType() {
    return inspectionType;
  }
  public void setInspectionType(String inspectionType) {
    this.inspectionType = inspectionType;
  }

  /**
   * The mechanics notes on the DVIR.
   **/
  
  @ApiModelProperty(example = "The vehicle is now safe.", value = "The mechanics notes on the DVIR.")
  @JsonProperty("mechanicNotes")
  public String getMechanicNotes() {
    return mechanicNotes;
  }
  public void setMechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mechanicOrAgentSignature")
  public DvirBaseMechanicOrAgentSignature getMechanicOrAgentSignature() {
    return mechanicOrAgentSignature;
  }
  public void setMechanicOrAgentSignature(DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature) {
    this.mechanicOrAgentSignature = mechanicOrAgentSignature;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nextDriverSignature")
  public DvirBaseNextDriverSignature getNextDriverSignature() {
    return nextDriverSignature;
  }
  public void setNextDriverSignature(DvirBaseNextDriverSignature nextDriverSignature) {
    this.nextDriverSignature = nextDriverSignature;
  }

  /**
   * The odometer reading in miles for the vehicle when the DVIR was done.
   **/
  
  @ApiModelProperty(example = "49912", value = "The odometer reading in miles for the vehicle when the DVIR was done.")
  @JsonProperty("odometerMiles")
  public Long getOdometerMiles() {
    return odometerMiles;
  }
  public void setOdometerMiles(Long odometerMiles) {
    this.odometerMiles = odometerMiles;
  }

  /**
   * Timestamp of this DVIR in UNIX milliseconds.
   **/
  
  @ApiModelProperty(example = "1453449599999", value = "Timestamp of this DVIR in UNIX milliseconds.")
  @JsonProperty("timeMs")
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
  @JsonProperty("trailerDefects")
  public List<DvirBaseTrailerDefects> getTrailerDefects() {
    return trailerDefects;
  }
  public void setTrailerDefects(List<DvirBaseTrailerDefects> trailerDefects) {
    this.trailerDefects = trailerDefects;
  }

  /**
   * The id of the trailer which was part of the DVIR.
   **/
  
  @ApiModelProperty(example = "19", value = "The id of the trailer which was part of the DVIR.")
  @JsonProperty("trailerId")
  public Integer getTrailerId() {
    return trailerId;
  }
  public void setTrailerId(Integer trailerId) {
    this.trailerId = trailerId;
  }

  /**
   * The name of the trailer which was part of the DVIR.
   **/
  
  @ApiModelProperty(example = "Storer's Trailer 19", value = "The name of the trailer which was part of the DVIR.")
  @JsonProperty("trailerName")
  public String getTrailerName() {
    return trailerName;
  }
  public void setTrailerName(String trailerName) {
    this.trailerName = trailerName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vehicle")
  public DvirBaseVehicle getVehicle() {
    return vehicle;
  }
  public void setVehicle(DvirBaseVehicle vehicle) {
    this.vehicle = vehicle;
  }

  /**
   * The condition of vechile on which DVIR was done.
   **/
  
  @ApiModelProperty(example = "SATISFACTORY", value = "The condition of vechile on which DVIR was done.")
  @JsonProperty("vehicleCondition")
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
  @JsonProperty("vehicleDefects")
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
    return Objects.equals(authorSignature, dvirBase.authorSignature) &&
        Objects.equals(defectsCorrected, dvirBase.defectsCorrected) &&
        Objects.equals(defectsNeedNotBeCorrected, dvirBase.defectsNeedNotBeCorrected) &&
        Objects.equals(id, dvirBase.id) &&
        Objects.equals(inspectionType, dvirBase.inspectionType) &&
        Objects.equals(mechanicNotes, dvirBase.mechanicNotes) &&
        Objects.equals(mechanicOrAgentSignature, dvirBase.mechanicOrAgentSignature) &&
        Objects.equals(nextDriverSignature, dvirBase.nextDriverSignature) &&
        Objects.equals(odometerMiles, dvirBase.odometerMiles) &&
        Objects.equals(timeMs, dvirBase.timeMs) &&
        Objects.equals(trailerDefects, dvirBase.trailerDefects) &&
        Objects.equals(trailerId, dvirBase.trailerId) &&
        Objects.equals(trailerName, dvirBase.trailerName) &&
        Objects.equals(vehicle, dvirBase.vehicle) &&
        Objects.equals(vehicleCondition, dvirBase.vehicleCondition) &&
        Objects.equals(vehicleDefects, dvirBase.vehicleDefects);
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

