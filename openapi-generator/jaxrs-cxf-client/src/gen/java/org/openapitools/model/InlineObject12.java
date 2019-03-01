package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineObject12  {
  
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
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  @ApiModelProperty(example = "mechanic", required = true, value = "Only type 'mechanic' is currently accepted.")
 /**
   * Only type 'mechanic' is currently accepted.
  **/
  private InspectionTypeEnum inspectionType;

  @ApiModelProperty(example = "Replaced headlight on passenger side.", value = "Any notes from the mechanic.")
 /**
   * Any notes from the mechanic.
  **/
  private String mechanicNotes;

  @ApiModelProperty(example = "38426", value = "The current odometer of the vehicle.")
 /**
   * The current odometer of the vehicle.
  **/
  private Integer odometerMiles;

  @ApiModelProperty(example = "true", value = "Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.")
 /**
   * Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
  **/
  private Boolean previousDefectsCorrected;

  @ApiModelProperty(example = "false", value = "Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.")
 /**
   * Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
  **/
  private Boolean previousDefectsIgnored;

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
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  @ApiModelProperty(example = "safe", required = true, value = "Whether or not this vehicle or trailer is safe to drive.")
 /**
   * Whether or not this vehicle or trailer is safe to drive.
  **/
  private SafeEnum safe;

  @ApiModelProperty(example = "11", value = "Id of trailer being inspected. Either vehicleId or trailerId must be provided.")
 /**
   * Id of trailer being inspected. Either vehicleId or trailerId must be provided.
  **/
  private Integer trailerId;

  @ApiModelProperty(example = "j.smith@yahoo.com", required = true, value = "The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.")
 /**
   * The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
  **/
  private String userEmail;

  @ApiModelProperty(example = "10", value = "Id of vehicle being inspected. Either vehicleId or trailerId must be provided.")
 /**
   * Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
  **/
  private Integer vehicleId;
 /**
   * Only type &#39;mechanic&#39; is currently accepted.
   * @return inspectionType
  **/
  @JsonProperty("inspectionType")
  public String getInspectionType() {
    if (inspectionType == null) {
      return null;
    }
    return inspectionType.value();
  }

  public void setInspectionType(InspectionTypeEnum inspectionType) {
    this.inspectionType = inspectionType;
  }

  public InlineObject12 inspectionType(InspectionTypeEnum inspectionType) {
    this.inspectionType = inspectionType;
    return this;
  }

 /**
   * Any notes from the mechanic.
   * @return mechanicNotes
  **/
  @JsonProperty("mechanicNotes")
  public String getMechanicNotes() {
    return mechanicNotes;
  }

  public void setMechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
  }

  public InlineObject12 mechanicNotes(String mechanicNotes) {
    this.mechanicNotes = mechanicNotes;
    return this;
  }

 /**
   * The current odometer of the vehicle.
   * @return odometerMiles
  **/
  @JsonProperty("odometerMiles")
  public Integer getOdometerMiles() {
    return odometerMiles;
  }

  public void setOdometerMiles(Integer odometerMiles) {
    this.odometerMiles = odometerMiles;
  }

  public InlineObject12 odometerMiles(Integer odometerMiles) {
    this.odometerMiles = odometerMiles;
    return this;
  }

 /**
   * Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
   * @return previousDefectsCorrected
  **/
  @JsonProperty("previousDefectsCorrected")
  public Boolean getPreviousDefectsCorrected() {
    return previousDefectsCorrected;
  }

  public void setPreviousDefectsCorrected(Boolean previousDefectsCorrected) {
    this.previousDefectsCorrected = previousDefectsCorrected;
  }

  public InlineObject12 previousDefectsCorrected(Boolean previousDefectsCorrected) {
    this.previousDefectsCorrected = previousDefectsCorrected;
    return this;
  }

 /**
   * Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
   * @return previousDefectsIgnored
  **/
  @JsonProperty("previousDefectsIgnored")
  public Boolean getPreviousDefectsIgnored() {
    return previousDefectsIgnored;
  }

  public void setPreviousDefectsIgnored(Boolean previousDefectsIgnored) {
    this.previousDefectsIgnored = previousDefectsIgnored;
  }

  public InlineObject12 previousDefectsIgnored(Boolean previousDefectsIgnored) {
    this.previousDefectsIgnored = previousDefectsIgnored;
    return this;
  }

 /**
   * Whether or not this vehicle or trailer is safe to drive.
   * @return safe
  **/
  @JsonProperty("safe")
  public String getSafe() {
    if (safe == null) {
      return null;
    }
    return safe.value();
  }

  public void setSafe(SafeEnum safe) {
    this.safe = safe;
  }

  public InlineObject12 safe(SafeEnum safe) {
    this.safe = safe;
    return this;
  }

 /**
   * Id of trailer being inspected. Either vehicleId or trailerId must be provided.
   * @return trailerId
  **/
  @JsonProperty("trailerId")
  public Integer getTrailerId() {
    return trailerId;
  }

  public void setTrailerId(Integer trailerId) {
    this.trailerId = trailerId;
  }

  public InlineObject12 trailerId(Integer trailerId) {
    this.trailerId = trailerId;
    return this;
  }

 /**
   * The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email.
   * @return userEmail
  **/
  @JsonProperty("userEmail")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public InlineObject12 userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

 /**
   * Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
   * @return vehicleId
  **/
  @JsonProperty("vehicleId")
  public Integer getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
  }

  public InlineObject12 vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

