package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class InlineObject12   {
  

public enum InspectionTypeEnum {

    MECHANIC(String.valueOf("mechanic"));


    private String value;

    InspectionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static InspectionTypeEnum fromValue(String v) {
        for (InspectionTypeEnum b : InspectionTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  private @Valid InspectionTypeEnum inspectionType;
  private @Valid String mechanicNotes;
  private @Valid Integer odometerMiles;
  private @Valid Boolean previousDefectsCorrected;
  private @Valid Boolean previousDefectsIgnored;

public enum SafeEnum {

    SAFE(String.valueOf("safe")), UNSAFE(String.valueOf("unsafe"));


    private String value;

    SafeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static SafeEnum fromValue(String v) {
        for (SafeEnum b : SafeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  private @Valid SafeEnum safe;
  private @Valid Integer trailerId;
  private @Valid String userEmail;
  private @Valid Integer vehicleId;

  /**
   * Only type &#39;mechanic&#39; is currently accepted.
   **/
  public InlineObject12 inspectionType(InspectionTypeEnum inspectionType) {
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
  public InlineObject12 mechanicNotes(String mechanicNotes) {
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
  public InlineObject12 odometerMiles(Integer odometerMiles) {
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
  public InlineObject12 previousDefectsCorrected(Boolean previousDefectsCorrected) {
    this.previousDefectsCorrected = previousDefectsCorrected;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.")
  @JsonProperty("previousDefectsCorrected")
  public Boolean getPreviousDefectsCorrected() {
    return previousDefectsCorrected;
  }
  public void setPreviousDefectsCorrected(Boolean previousDefectsCorrected) {
    this.previousDefectsCorrected = previousDefectsCorrected;
  }

  /**
   * Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
   **/
  public InlineObject12 previousDefectsIgnored(Boolean previousDefectsIgnored) {
    this.previousDefectsIgnored = previousDefectsIgnored;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.")
  @JsonProperty("previousDefectsIgnored")
  public Boolean getPreviousDefectsIgnored() {
    return previousDefectsIgnored;
  }
  public void setPreviousDefectsIgnored(Boolean previousDefectsIgnored) {
    this.previousDefectsIgnored = previousDefectsIgnored;
  }

  /**
   * Whether or not this vehicle or trailer is safe to drive.
   **/
  public InlineObject12 safe(SafeEnum safe) {
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
  public InlineObject12 trailerId(Integer trailerId) {
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
  public InlineObject12 userEmail(String userEmail) {
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
  public InlineObject12 vehicleId(Integer vehicleId) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

