package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DvirBaseAuthorSignature;
import org.openapitools.model.DvirBaseMechanicOrAgentSignature;
import org.openapitools.model.DvirBaseNextDriverSignature;
import org.openapitools.model.DvirBaseTrailerDefects;
import org.openapitools.model.DvirBaseVehicle;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class DvirBase   {
  
  private DvirBaseAuthorSignature authorSignature = null;

  private Boolean defectsCorrected;

  private Boolean defectsNeedNotBeCorrected;

  private Long id;

  private String inspectionType;

  private String mechanicNotes;

  private DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature = null;

  private DvirBaseNextDriverSignature nextDriverSignature = null;

  private Long odometerMiles;

  private Long timeMs;

  private List<DvirBaseTrailerDefects> trailerDefects = null;

  private Integer trailerId;

  private String trailerName;

  private DvirBaseVehicle vehicle = null;

  private String vehicleCondition;

  private List<DvirBaseTrailerDefects> vehicleDefects = null;


  /**
   **/
  public DvirBase authorSignature(DvirBaseAuthorSignature authorSignature) {
    this.authorSignature = authorSignature;
    return this;
  }

  
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
  public DvirBase defectsCorrected(Boolean defectsCorrected) {
    this.defectsCorrected = defectsCorrected;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Signifies if the defects on the vehicle corrected after the DVIR is done.")
  @JsonProperty("defectsCorrected")
  public Boolean getDefectsCorrected() {
    return defectsCorrected;
  }
  public void setDefectsCorrected(Boolean defectsCorrected) {
    this.defectsCorrected = defectsCorrected;
  }


  /**
   * Signifies if the defects on this vehicle can be ignored.
   **/
  public DvirBase defectsNeedNotBeCorrected(Boolean defectsNeedNotBeCorrected) {
    this.defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Signifies if the defects on this vehicle can be ignored.")
  @JsonProperty("defectsNeedNotBeCorrected")
  public Boolean getDefectsNeedNotBeCorrected() {
    return defectsNeedNotBeCorrected;
  }
  public void setDefectsNeedNotBeCorrected(Boolean defectsNeedNotBeCorrected) {
    this.defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
  }


  /**
   * The id of this DVIR record.
   **/
  public DvirBase id(Long id) {
    this.id = id;
    return this;
  }

  
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
  public DvirBase inspectionType(String inspectionType) {
    this.inspectionType = inspectionType;
    return this;
  }

  
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
  public DvirBase mechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
    return this;
  }

  
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
  public DvirBase mechanicOrAgentSignature(DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature) {
    this.mechanicOrAgentSignature = mechanicOrAgentSignature;
    return this;
  }

  
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
  public DvirBase nextDriverSignature(DvirBaseNextDriverSignature nextDriverSignature) {
    this.nextDriverSignature = nextDriverSignature;
    return this;
  }

  
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
  public DvirBase odometerMiles(Long odometerMiles) {
    this.odometerMiles = odometerMiles;
    return this;
  }

  
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
  public DvirBase timeMs(Long timeMs) {
    this.timeMs = timeMs;
    return this;
  }

  
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
  public DvirBase trailerDefects(List<DvirBaseTrailerDefects> trailerDefects) {
    this.trailerDefects = trailerDefects;
    return this;
  }

  
  @ApiModelProperty(value = "Defects registered for the trailer which was part of the DVIR.")
  @JsonProperty("trailerDefects")
  public List<DvirBaseTrailerDefects> getTrailerDefects() {
    return trailerDefects;
  }
  public void setTrailerDefects(List<DvirBaseTrailerDefects> trailerDefects) {
    this.trailerDefects = trailerDefects;
  }

  public DvirBase addTrailerDefectsItem(DvirBaseTrailerDefects trailerDefectsItem) {
    if (this.trailerDefects == null) {
      this.trailerDefects = new ArrayList<DvirBaseTrailerDefects>();
    }
    this.trailerDefects.add(trailerDefectsItem);
    return this;
  }


  /**
   * The id of the trailer which was part of the DVIR.
   **/
  public DvirBase trailerId(Integer trailerId) {
    this.trailerId = trailerId;
    return this;
  }

  
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
  public DvirBase trailerName(String trailerName) {
    this.trailerName = trailerName;
    return this;
  }

  
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
  public DvirBase vehicle(DvirBaseVehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

  
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
  public DvirBase vehicleCondition(String vehicleCondition) {
    this.vehicleCondition = vehicleCondition;
    return this;
  }

  
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
  public DvirBase vehicleDefects(List<DvirBaseTrailerDefects> vehicleDefects) {
    this.vehicleDefects = vehicleDefects;
    return this;
  }

  
  @ApiModelProperty(value = "Defects registered for the vehicle which was part of the DVIR.")
  @JsonProperty("vehicleDefects")
  public List<DvirBaseTrailerDefects> getVehicleDefects() {
    return vehicleDefects;
  }
  public void setVehicleDefects(List<DvirBaseTrailerDefects> vehicleDefects) {
    this.vehicleDefects = vehicleDefects;
  }

  public DvirBase addVehicleDefectsItem(DvirBaseTrailerDefects vehicleDefectsItem) {
    if (this.vehicleDefects == null) {
      this.vehicleDefects = new ArrayList<DvirBaseTrailerDefects>();
    }
    this.vehicleDefects.add(vehicleDefectsItem);
    return this;
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

