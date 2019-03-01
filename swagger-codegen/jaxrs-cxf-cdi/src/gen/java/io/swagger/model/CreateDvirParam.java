package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class CreateDvirParam   {
  

@XmlType(name="InspectionTypeEnum")
@XmlEnum(String.class)
public enum InspectionTypeEnum {

    @XmlEnumValue("mechanic") MECHANIC(String.valueOf("mechanic"));


    private String value;

    InspectionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static InspectionTypeEnum fromValue(String v) {
        for (InspectionTypeEnum b : InspectionTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private InspectionTypeEnum inspectionType = null;
  private String mechanicNotes = null;
  private Integer odometerMiles = null;
  private Boolean previousDefectsCorrected = null;
  private Boolean previousDefectsIgnored = null;

@XmlType(name="SafeEnum")
@XmlEnum(String.class)
public enum SafeEnum {

    @XmlEnumValue("safe") SAFE(String.valueOf("safe")), @XmlEnumValue("unsafe") UNSAFE(String.valueOf("unsafe"));


    private String value;

    SafeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SafeEnum fromValue(String v) {
        for (SafeEnum b : SafeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private SafeEnum safe = null;
  private Integer trailerId = null;
  private String userEmail = null;
  private Integer vehicleId = null;

  /**
   * Only type &#39;mechanic&#39; is currently accepted.
   **/
  public CreateDvirParam inspectionType(InspectionTypeEnum inspectionType) {
    this.inspectionType = inspectionType;
    return this;
  }

  
  @ApiModelProperty(example = "mechanic", required = true, value = "Only type 'mechanic' is currently accepted.")
  @JsonProperty("inspectionType")
  @NotNull
  public InspectionTypeEnum getInspectionType() {
    return inspectionType;
  }
  public void setInspectionType(InspectionTypeEnum inspectionType) {
    this.inspectionType = inspectionType;
  }

  /**
   * Any notes from the mechanic.
   **/
  public CreateDvirParam mechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
    return this;
  }

  
  @ApiModelProperty(example = "Replaced headlight on passenger side.", value = "Any notes from the mechanic.")
  @JsonProperty("mechanicNotes")
  public String getMechanicNotes() {
    return mechanicNotes;
  }
  public void setMechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
  }

  /**
   * The current odometer of the vehicle.
   **/
  public CreateDvirParam odometerMiles(Integer odometerMiles) {
    this.odometerMiles = odometerMiles;
    return this;
  }

  
  @ApiModelProperty(example = "38426", value = "The current odometer of the vehicle.")
  @JsonProperty("odometerMiles")
  public Integer getOdometerMiles() {
    return odometerMiles;
  }
  public void setOdometerMiles(Integer odometerMiles) {
    this.odometerMiles = odometerMiles;
  }

  /**
   * Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
   **/
  public CreateDvirParam previousDefectsCorrected(Boolean previousDefectsCorrected) {
    this.previousDefectsCorrected = previousDefectsCorrected;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.")
  @JsonProperty("previousDefectsCorrected")
  public Boolean isPreviousDefectsCorrected() {
    return previousDefectsCorrected;
  }
  public void setPreviousDefectsCorrected(Boolean previousDefectsCorrected) {
    this.previousDefectsCorrected = previousDefectsCorrected;
  }

  /**
   * Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
   **/
  public CreateDvirParam previousDefectsIgnored(Boolean previousDefectsIgnored) {
    this.previousDefectsIgnored = previousDefectsIgnored;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.")
  @JsonProperty("previousDefectsIgnored")
  public Boolean isPreviousDefectsIgnored() {
    return previousDefectsIgnored;
  }
  public void setPreviousDefectsIgnored(Boolean previousDefectsIgnored) {
    this.previousDefectsIgnored = previousDefectsIgnored;
  }

  /**
   * Whether or not this vehicle or trailer is safe to drive.
   **/
  public CreateDvirParam safe(SafeEnum safe) {
    this.safe = safe;
    return this;
  }

  
  @ApiModelProperty(example = "safe", required = true, value = "Whether or not this vehicle or trailer is safe to drive.")
  @JsonProperty("safe")
  @NotNull
  public SafeEnum getSafe() {
    return safe;
  }
  public void setSafe(SafeEnum safe) {
    this.safe = safe;
  }

  /**
   * Id of trailer being inspected. Either vehicleId or trailerId must be provided.
   **/
  public CreateDvirParam trailerId(Integer trailerId) {
    this.trailerId = trailerId;
    return this;
  }

  
  @ApiModelProperty(example = "11", value = "Id of trailer being inspected. Either vehicleId or trailerId must be provided.")
  @JsonProperty("trailerId")
  public Integer getTrailerId() {
    return trailerId;
  }
  public void setTrailerId(Integer trailerId) {
    this.trailerId = trailerId;
  }

  /**
   * The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email.
   **/
  public CreateDvirParam userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  
  @ApiModelProperty(example = "j.smith@yahoo.com", required = true, value = "The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.")
  @JsonProperty("userEmail")
  @NotNull
  public String getUserEmail() {
    return userEmail;
  }
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  /**
   * Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
   **/
  public CreateDvirParam vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  
  @ApiModelProperty(example = "10", value = "Id of vehicle being inspected. Either vehicleId or trailerId must be provided.")
  @JsonProperty("vehicleId")
  public Integer getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDvirParam createDvirParam = (CreateDvirParam) o;
    return Objects.equals(inspectionType, createDvirParam.inspectionType) &&
        Objects.equals(mechanicNotes, createDvirParam.mechanicNotes) &&
        Objects.equals(odometerMiles, createDvirParam.odometerMiles) &&
        Objects.equals(previousDefectsCorrected, createDvirParam.previousDefectsCorrected) &&
        Objects.equals(previousDefectsIgnored, createDvirParam.previousDefectsIgnored) &&
        Objects.equals(safe, createDvirParam.safe) &&
        Objects.equals(trailerId, createDvirParam.trailerId) &&
        Objects.equals(userEmail, createDvirParam.userEmail) &&
        Objects.equals(vehicleId, createDvirParam.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inspectionType, mechanicNotes, odometerMiles, previousDefectsCorrected, previousDefectsIgnored, safe, trailerId, userEmail, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDvirParam {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

