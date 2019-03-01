package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.DvirBaseAuthorSignature;
import org.openapitools.server.api.model.DvirBaseMechanicOrAgentSignature;
import org.openapitools.server.api.model.DvirBaseNextDriverSignature;
import org.openapitools.server.api.model.DvirBaseTrailerDefects;
import org.openapitools.server.api.model.DvirBaseVehicle;

@JsonInclude(JsonInclude.Include.NON_NULL) 
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
  private List<DvirBaseTrailerDefects> trailerDefects = new ArrayList<>();
  private Integer trailerId;
  private String trailerName;
  private DvirBaseVehicle vehicle = null;
  private String vehicleCondition;
  private List<DvirBaseTrailerDefects> vehicleDefects = new ArrayList<>();

  public DvirBase () {

  }

  public DvirBase (DvirBaseAuthorSignature authorSignature, Boolean defectsCorrected, Boolean defectsNeedNotBeCorrected, Long id, String inspectionType, String mechanicNotes, DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature, DvirBaseNextDriverSignature nextDriverSignature, Long odometerMiles, Long timeMs, List<DvirBaseTrailerDefects> trailerDefects, Integer trailerId, String trailerName, DvirBaseVehicle vehicle, String vehicleCondition, List<DvirBaseTrailerDefects> vehicleDefects) {
    this.authorSignature = authorSignature;
    this.defectsCorrected = defectsCorrected;
    this.defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
    this.id = id;
    this.inspectionType = inspectionType;
    this.mechanicNotes = mechanicNotes;
    this.mechanicOrAgentSignature = mechanicOrAgentSignature;
    this.nextDriverSignature = nextDriverSignature;
    this.odometerMiles = odometerMiles;
    this.timeMs = timeMs;
    this.trailerDefects = trailerDefects;
    this.trailerId = trailerId;
    this.trailerName = trailerName;
    this.vehicle = vehicle;
    this.vehicleCondition = vehicleCondition;
    this.vehicleDefects = vehicleDefects;
  }

    
  @JsonProperty("authorSignature")
  public DvirBaseAuthorSignature getAuthorSignature() {
    return authorSignature;
  }
  public void setAuthorSignature(DvirBaseAuthorSignature authorSignature) {
    this.authorSignature = authorSignature;
  }

    
  @JsonProperty("defectsCorrected")
  public Boolean getDefectsCorrected() {
    return defectsCorrected;
  }
  public void setDefectsCorrected(Boolean defectsCorrected) {
    this.defectsCorrected = defectsCorrected;
  }

    
  @JsonProperty("defectsNeedNotBeCorrected")
  public Boolean getDefectsNeedNotBeCorrected() {
    return defectsNeedNotBeCorrected;
  }
  public void setDefectsNeedNotBeCorrected(Boolean defectsNeedNotBeCorrected) {
    this.defectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("inspectionType")
  public String getInspectionType() {
    return inspectionType;
  }
  public void setInspectionType(String inspectionType) {
    this.inspectionType = inspectionType;
  }

    
  @JsonProperty("mechanicNotes")
  public String getMechanicNotes() {
    return mechanicNotes;
  }
  public void setMechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
  }

    
  @JsonProperty("mechanicOrAgentSignature")
  public DvirBaseMechanicOrAgentSignature getMechanicOrAgentSignature() {
    return mechanicOrAgentSignature;
  }
  public void setMechanicOrAgentSignature(DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature) {
    this.mechanicOrAgentSignature = mechanicOrAgentSignature;
  }

    
  @JsonProperty("nextDriverSignature")
  public DvirBaseNextDriverSignature getNextDriverSignature() {
    return nextDriverSignature;
  }
  public void setNextDriverSignature(DvirBaseNextDriverSignature nextDriverSignature) {
    this.nextDriverSignature = nextDriverSignature;
  }

    
  @JsonProperty("odometerMiles")
  public Long getOdometerMiles() {
    return odometerMiles;
  }
  public void setOdometerMiles(Long odometerMiles) {
    this.odometerMiles = odometerMiles;
  }

    
  @JsonProperty("timeMs")
  public Long getTimeMs() {
    return timeMs;
  }
  public void setTimeMs(Long timeMs) {
    this.timeMs = timeMs;
  }

    
  @JsonProperty("trailerDefects")
  public List<DvirBaseTrailerDefects> getTrailerDefects() {
    return trailerDefects;
  }
  public void setTrailerDefects(List<DvirBaseTrailerDefects> trailerDefects) {
    this.trailerDefects = trailerDefects;
  }

    
  @JsonProperty("trailerId")
  public Integer getTrailerId() {
    return trailerId;
  }
  public void setTrailerId(Integer trailerId) {
    this.trailerId = trailerId;
  }

    
  @JsonProperty("trailerName")
  public String getTrailerName() {
    return trailerName;
  }
  public void setTrailerName(String trailerName) {
    this.trailerName = trailerName;
  }

    
  @JsonProperty("vehicle")
  public DvirBaseVehicle getVehicle() {
    return vehicle;
  }
  public void setVehicle(DvirBaseVehicle vehicle) {
    this.vehicle = vehicle;
  }

    
  @JsonProperty("vehicleCondition")
  public String getVehicleCondition() {
    return vehicleCondition;
  }
  public void setVehicleCondition(String vehicleCondition) {
    this.vehicleCondition = vehicleCondition;
  }

    
  @JsonProperty("vehicleDefects")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
