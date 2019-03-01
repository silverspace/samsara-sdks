package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineObject12   {
  


  public enum InspectionTypeEnum {
    MECHANIC("mechanic");

    private String value;

    InspectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private InspectionTypeEnum inspectionType;
  private String mechanicNotes;
  private Integer odometerMiles;
  private Boolean previousDefectsCorrected;
  private Boolean previousDefectsIgnored;


  public enum SafeEnum {
    SAFE("safe"),
    UNSAFE("unsafe");

    private String value;

    SafeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SafeEnum safe;
  private Integer trailerId;
  private String userEmail;
  private Integer vehicleId;

  public InlineObject12 () {

  }

  public InlineObject12 (InspectionTypeEnum inspectionType, String mechanicNotes, Integer odometerMiles, Boolean previousDefectsCorrected, Boolean previousDefectsIgnored, SafeEnum safe, Integer trailerId, String userEmail, Integer vehicleId) {
    this.inspectionType = inspectionType;
    this.mechanicNotes = mechanicNotes;
    this.odometerMiles = odometerMiles;
    this.previousDefectsCorrected = previousDefectsCorrected;
    this.previousDefectsIgnored = previousDefectsIgnored;
    this.safe = safe;
    this.trailerId = trailerId;
    this.userEmail = userEmail;
    this.vehicleId = vehicleId;
  }

    
  @JsonProperty("inspectionType")
  public InspectionTypeEnum getInspectionType() {
    return inspectionType;
  }
  public void setInspectionType(InspectionTypeEnum inspectionType) {
    this.inspectionType = inspectionType;
  }

    
  @JsonProperty("mechanicNotes")
  public String getMechanicNotes() {
    return mechanicNotes;
  }
  public void setMechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
  }

    
  @JsonProperty("odometerMiles")
  public Integer getOdometerMiles() {
    return odometerMiles;
  }
  public void setOdometerMiles(Integer odometerMiles) {
    this.odometerMiles = odometerMiles;
  }

    
  @JsonProperty("previousDefectsCorrected")
  public Boolean getPreviousDefectsCorrected() {
    return previousDefectsCorrected;
  }
  public void setPreviousDefectsCorrected(Boolean previousDefectsCorrected) {
    this.previousDefectsCorrected = previousDefectsCorrected;
  }

    
  @JsonProperty("previousDefectsIgnored")
  public Boolean getPreviousDefectsIgnored() {
    return previousDefectsIgnored;
  }
  public void setPreviousDefectsIgnored(Boolean previousDefectsIgnored) {
    this.previousDefectsIgnored = previousDefectsIgnored;
  }

    
  @JsonProperty("safe")
  public SafeEnum getSafe() {
    return safe;
  }
  public void setSafe(SafeEnum safe) {
    this.safe = safe;
  }

    
  @JsonProperty("trailerId")
  public Integer getTrailerId() {
    return trailerId;
  }
  public void setTrailerId(Integer trailerId) {
    this.trailerId = trailerId;
  }

    
  @JsonProperty("userEmail")
  public String getUserEmail() {
    return userEmail;
  }
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

    
  @JsonProperty("vehicleId")
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
    InlineObject12 inlineObject12 = (InlineObject12) o;
    return Objects.equals(inspectionType, inlineObject12.inspectionType) &&
        Objects.equals(mechanicNotes, inlineObject12.mechanicNotes) &&
        Objects.equals(odometerMiles, inlineObject12.odometerMiles) &&
        Objects.equals(previousDefectsCorrected, inlineObject12.previousDefectsCorrected) &&
        Objects.equals(previousDefectsIgnored, inlineObject12.previousDefectsIgnored) &&
        Objects.equals(safe, inlineObject12.safe) &&
        Objects.equals(trailerId, inlineObject12.trailerId) &&
        Objects.equals(userEmail, inlineObject12.userEmail) &&
        Objects.equals(vehicleId, inlineObject12.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inspectionType, mechanicNotes, odometerMiles, previousDefectsCorrected, previousDefectsIgnored, safe, trailerId, userEmail, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject12 {\n");
    
    sb.append("    inspectionType: ").append(toIndentedString(inspectionType)).append("\n");
    sb.append("    mechanicNotes: ").append(toIndentedString(mechanicNotes)).append("\n");
    sb.append("    odometerMiles: ").append(toIndentedString(odometerMiles)).append("\n");
    sb.append("    previousDefectsCorrected: ").append(toIndentedString(previousDefectsCorrected)).append("\n");
    sb.append("    previousDefectsIgnored: ").append(toIndentedString(previousDefectsIgnored)).append("\n");
    sb.append("    safe: ").append(toIndentedString(safe)).append("\n");
    sb.append("    trailerId: ").append(toIndentedString(trailerId)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
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
