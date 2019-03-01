package org.openapitools.model;

import java.util.Objects;
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

/**
 * DvirBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class DvirBase   {
  @JsonProperty("authorSignature")
  private DvirBaseAuthorSignature authorSignature = null;

  @JsonProperty("defectsCorrected")
  private Boolean defectsCorrected;

  @JsonProperty("defectsNeedNotBeCorrected")
  private Boolean defectsNeedNotBeCorrected;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("inspectionType")
  private String inspectionType;

  @JsonProperty("mechanicNotes")
  private String mechanicNotes;

  @JsonProperty("mechanicOrAgentSignature")
  private DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature = null;

  @JsonProperty("nextDriverSignature")
  private DvirBaseNextDriverSignature nextDriverSignature = null;

  @JsonProperty("odometerMiles")
  private Long odometerMiles;

  @JsonProperty("timeMs")
  private Long timeMs;

  @JsonProperty("trailerDefects")
  private List<DvirBaseTrailerDefects> trailerDefects = null;

  @JsonProperty("trailerId")
  private Integer trailerId;

  @JsonProperty("trailerName")
  private String trailerName;

  @JsonProperty("vehicle")
  private DvirBaseVehicle vehicle = null;

  @JsonProperty("vehicleCondition")
  private String vehicleCondition;

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
  @ApiModelProperty(example = "true", value = "Signifies if the defects on the vehicle corrected after the DVIR is done.")
  public Boolean getDefectsCorrected() {
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
  @ApiModelProperty(example = "false", value = "Signifies if the defects on this vehicle can be ignored.")
  public Boolean getDefectsNeedNotBeCorrected() {
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

