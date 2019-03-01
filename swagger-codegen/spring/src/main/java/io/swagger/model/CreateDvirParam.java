package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateDvirParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class CreateDvirParam   {
  /**
   * Only type 'mechanic' is currently accepted.
   */
  public enum InspectionTypeEnum {
    MECHANIC("mechanic");

    private String value;

    InspectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InspectionTypeEnum fromValue(String text) {
      for (InspectionTypeEnum b : InspectionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("inspectionType")
  private InspectionTypeEnum inspectionType = null;

  @JsonProperty("mechanicNotes")
  private String mechanicNotes = null;

  @JsonProperty("odometerMiles")
  private Integer odometerMiles = null;

  @JsonProperty("previousDefectsCorrected")
  private Boolean previousDefectsCorrected = null;

  @JsonProperty("previousDefectsIgnored")
  private Boolean previousDefectsIgnored = null;

  /**
   * Whether or not this vehicle or trailer is safe to drive.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static SafeEnum fromValue(String text) {
      for (SafeEnum b : SafeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("safe")
  private SafeEnum safe = null;

  @JsonProperty("trailerId")
  private Integer trailerId = null;

  @JsonProperty("userEmail")
  private String userEmail = null;

  @JsonProperty("vehicleId")
  private Integer vehicleId = null;

  public CreateDvirParam inspectionType(InspectionTypeEnum inspectionType) {
    this.inspectionType = inspectionType;
    return this;
  }

  /**
   * Only type 'mechanic' is currently accepted.
   * @return inspectionType
  **/
  @ApiModelProperty(example = "mechanic", required = true, value = "Only type 'mechanic' is currently accepted.")
  @NotNull


  public InspectionTypeEnum getInspectionType() {
    return inspectionType;
  }

  public void setInspectionType(InspectionTypeEnum inspectionType) {
    this.inspectionType = inspectionType;
  }

  public CreateDvirParam mechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
    return this;
  }

  /**
   * Any notes from the mechanic.
   * @return mechanicNotes
  **/
  @ApiModelProperty(example = "Replaced headlight on passenger side.", value = "Any notes from the mechanic.")


  public String getMechanicNotes() {
    return mechanicNotes;
  }

  public void setMechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
  }

  public CreateDvirParam odometerMiles(Integer odometerMiles) {
    this.odometerMiles = odometerMiles;
    return this;
  }

  /**
   * The current odometer of the vehicle.
   * @return odometerMiles
  **/
  @ApiModelProperty(example = "38426", value = "The current odometer of the vehicle.")


  public Integer getOdometerMiles() {
    return odometerMiles;
  }

  public void setOdometerMiles(Integer odometerMiles) {
    this.odometerMiles = odometerMiles;
  }

  public CreateDvirParam previousDefectsCorrected(Boolean previousDefectsCorrected) {
    this.previousDefectsCorrected = previousDefectsCorrected;
    return this;
  }

  /**
   * Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
   * @return previousDefectsCorrected
  **/
  @ApiModelProperty(example = "true", value = "Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.")


  public Boolean isPreviousDefectsCorrected() {
    return previousDefectsCorrected;
  }

  public void setPreviousDefectsCorrected(Boolean previousDefectsCorrected) {
    this.previousDefectsCorrected = previousDefectsCorrected;
  }

  public CreateDvirParam previousDefectsIgnored(Boolean previousDefectsIgnored) {
    this.previousDefectsIgnored = previousDefectsIgnored;
    return this;
  }

  /**
   * Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
   * @return previousDefectsIgnored
  **/
  @ApiModelProperty(example = "false", value = "Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.")


  public Boolean isPreviousDefectsIgnored() {
    return previousDefectsIgnored;
  }

  public void setPreviousDefectsIgnored(Boolean previousDefectsIgnored) {
    this.previousDefectsIgnored = previousDefectsIgnored;
  }

  public CreateDvirParam safe(SafeEnum safe) {
    this.safe = safe;
    return this;
  }

  /**
   * Whether or not this vehicle or trailer is safe to drive.
   * @return safe
  **/
  @ApiModelProperty(example = "safe", required = true, value = "Whether or not this vehicle or trailer is safe to drive.")
  @NotNull


  public SafeEnum getSafe() {
    return safe;
  }

  public void setSafe(SafeEnum safe) {
    this.safe = safe;
  }

  public CreateDvirParam trailerId(Integer trailerId) {
    this.trailerId = trailerId;
    return this;
  }

  /**
   * Id of trailer being inspected. Either vehicleId or trailerId must be provided.
   * @return trailerId
  **/
  @ApiModelProperty(example = "11", value = "Id of trailer being inspected. Either vehicleId or trailerId must be provided.")


  public Integer getTrailerId() {
    return trailerId;
  }

  public void setTrailerId(Integer trailerId) {
    this.trailerId = trailerId;
  }

  public CreateDvirParam userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
   * @return userEmail
  **/
  @ApiModelProperty(example = "j.smith@yahoo.com", required = true, value = "The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.")
  @NotNull


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public CreateDvirParam vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
   * @return vehicleId
  **/
  @ApiModelProperty(example = "10", value = "Id of vehicle being inspected. Either vehicleId or trailerId must be provided.")


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
    return Objects.equals(this.inspectionType, createDvirParam.inspectionType) &&
        Objects.equals(this.mechanicNotes, createDvirParam.mechanicNotes) &&
        Objects.equals(this.odometerMiles, createDvirParam.odometerMiles) &&
        Objects.equals(this.previousDefectsCorrected, createDvirParam.previousDefectsCorrected) &&
        Objects.equals(this.previousDefectsIgnored, createDvirParam.previousDefectsIgnored) &&
        Objects.equals(this.safe, createDvirParam.safe) &&
        Objects.equals(this.trailerId, createDvirParam.trailerId) &&
        Objects.equals(this.userEmail, createDvirParam.userEmail) &&
        Objects.equals(this.vehicleId, createDvirParam.vehicleId);
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

