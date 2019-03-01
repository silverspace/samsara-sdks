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

public class DriverDailyLogResponseDays  {
  
  @ApiModelProperty(value = "Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.")
 /**
   * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
  **/
  private Long certifiedAtMs;

  @ApiModelProperty(example = "1473836400000", value = "End of the HOS day, specified in milliseconds UNIX time.")
 /**
   * End of the HOS day, specified in milliseconds UNIX time.
  **/
  private Integer endMs;

  @ApiModelProperty(example = "1473750000000", value = "End of the HOS day, specified in milliseconds UNIX time.")
 /**
   * End of the HOS day, specified in milliseconds UNIX time.
  **/
  private Integer startMs;

  @ApiModelProperty(example = "[10293,192933]", value = "List of trailer ID's associated with the driver for the day.")
 /**
   * List of trailer ID's associated with the driver for the day.
  **/
  private Object trailerIds = null;

  @ApiModelProperty(example = "5.4", value = "Hours spent on duty or driving, rounded to two decimal places.")
 /**
   * Hours spent on duty or driving, rounded to two decimal places.
  **/
  private Double activeHours;

  @ApiModelProperty(example = "123.24", value = "Distance driven in miles, rounded to two decimal places.")
 /**
   * Distance driven in miles, rounded to two decimal places.
  **/
  private Double distanceMiles;

  @ApiModelProperty(example = "691200", value = "Milliseconds spent on duty or driving.")
 /**
   * Milliseconds spent on duty or driving.
  **/
  private Long activeMs;

  @ApiModelProperty(value = "Whether this HOS day chart was certified by the driver.")
 /**
   * Whether this HOS day chart was certified by the driver.
  **/
  private Boolean certified;

  @ApiModelProperty(example = "[192319,12958]", value = "List of vehicle ID's associated with the driver for the day.")
 /**
   * List of vehicle ID's associated with the driver for the day.
  **/
  private Object vehicleIds = null;
 /**
   * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
   * @return certifiedAtMs
  **/
  @JsonProperty("certifiedAtMs")
  public Long getCertifiedAtMs() {
    return certifiedAtMs;
  }

  public void setCertifiedAtMs(Long certifiedAtMs) {
    this.certifiedAtMs = certifiedAtMs;
  }

  public DriverDailyLogResponseDays certifiedAtMs(Long certifiedAtMs) {
    this.certifiedAtMs = certifiedAtMs;
    return this;
  }

 /**
   * End of the HOS day, specified in milliseconds UNIX time.
   * @return endMs
  **/
  @JsonProperty("endMs")
  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public DriverDailyLogResponseDays endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

 /**
   * End of the HOS day, specified in milliseconds UNIX time.
   * @return startMs
  **/
  @JsonProperty("startMs")
  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  public DriverDailyLogResponseDays startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

 /**
   * List of trailer ID&#39;s associated with the driver for the day.
   * @return trailerIds
  **/
  @JsonProperty("trailerIds")
  public Object getTrailerIds() {
    return trailerIds;
  }

  public void setTrailerIds(Object trailerIds) {
    this.trailerIds = trailerIds;
  }

  public DriverDailyLogResponseDays trailerIds(Object trailerIds) {
    this.trailerIds = trailerIds;
    return this;
  }

 /**
   * Hours spent on duty or driving, rounded to two decimal places.
   * @return activeHours
  **/
  @JsonProperty("activeHours")
  public Double getActiveHours() {
    return activeHours;
  }

  public void setActiveHours(Double activeHours) {
    this.activeHours = activeHours;
  }

  public DriverDailyLogResponseDays activeHours(Double activeHours) {
    this.activeHours = activeHours;
    return this;
  }

 /**
   * Distance driven in miles, rounded to two decimal places.
   * @return distanceMiles
  **/
  @JsonProperty("distanceMiles")
  public Double getDistanceMiles() {
    return distanceMiles;
  }

  public void setDistanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

  public DriverDailyLogResponseDays distanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
    return this;
  }

 /**
   * Milliseconds spent on duty or driving.
   * @return activeMs
  **/
  @JsonProperty("activeMs")
  public Long getActiveMs() {
    return activeMs;
  }

  public void setActiveMs(Long activeMs) {
    this.activeMs = activeMs;
  }

  public DriverDailyLogResponseDays activeMs(Long activeMs) {
    this.activeMs = activeMs;
    return this;
  }

 /**
   * Whether this HOS day chart was certified by the driver.
   * @return certified
  **/
  @JsonProperty("certified")
  public Boolean getCertified() {
    return certified;
  }

  public void setCertified(Boolean certified) {
    this.certified = certified;
  }

  public DriverDailyLogResponseDays certified(Boolean certified) {
    this.certified = certified;
    return this;
  }

 /**
   * List of vehicle ID&#39;s associated with the driver for the day.
   * @return vehicleIds
  **/
  @JsonProperty("vehicleIds")
  public Object getVehicleIds() {
    return vehicleIds;
  }

  public void setVehicleIds(Object vehicleIds) {
    this.vehicleIds = vehicleIds;
  }

  public DriverDailyLogResponseDays vehicleIds(Object vehicleIds) {
    this.vehicleIds = vehicleIds;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverDailyLogResponseDays {\n");
    
    sb.append("    certifiedAtMs: ").append(toIndentedString(certifiedAtMs)).append("\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    trailerIds: ").append(toIndentedString(trailerIds)).append("\n");
    sb.append("    activeHours: ").append(toIndentedString(activeHours)).append("\n");
    sb.append("    distanceMiles: ").append(toIndentedString(distanceMiles)).append("\n");
    sb.append("    activeMs: ").append(toIndentedString(activeMs)).append("\n");
    sb.append("    certified: ").append(toIndentedString(certified)).append("\n");
    sb.append("    vehicleIds: ").append(toIndentedString(vehicleIds)).append("\n");
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

