package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DriverDailyLogResponseDays
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class DriverDailyLogResponseDays   {
  @JsonProperty("certifiedAtMs")
  private Long certifiedAtMs;

  @JsonProperty("endMs")
  private Integer endMs;

  @JsonProperty("startMs")
  private Integer startMs;

  @JsonProperty("trailerIds")
  private Object trailerIds = null;

  @JsonProperty("activeHours")
  private Double activeHours;

  @JsonProperty("distanceMiles")
  private Double distanceMiles;

  @JsonProperty("activeMs")
  private Long activeMs;

  @JsonProperty("certified")
  private Boolean certified;

  @JsonProperty("vehicleIds")
  private Object vehicleIds = null;

  public DriverDailyLogResponseDays certifiedAtMs(Long certifiedAtMs) {
    this.certifiedAtMs = certifiedAtMs;
    return this;
  }

   /**
   * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
   * @return certifiedAtMs
  **/
  @ApiModelProperty(value = "Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.")
  public Long getCertifiedAtMs() {
    return certifiedAtMs;
  }

  public void setCertifiedAtMs(Long certifiedAtMs) {
    this.certifiedAtMs = certifiedAtMs;
  }

  public DriverDailyLogResponseDays endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

   /**
   * End of the HOS day, specified in milliseconds UNIX time.
   * @return endMs
  **/
  @ApiModelProperty(example = "1473836400000", value = "End of the HOS day, specified in milliseconds UNIX time.")
  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public DriverDailyLogResponseDays startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

   /**
   * End of the HOS day, specified in milliseconds UNIX time.
   * @return startMs
  **/
  @ApiModelProperty(example = "1473750000000", value = "End of the HOS day, specified in milliseconds UNIX time.")
  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  public DriverDailyLogResponseDays trailerIds(Object trailerIds) {
    this.trailerIds = trailerIds;
    return this;
  }

   /**
   * List of trailer ID's associated with the driver for the day.
   * @return trailerIds
  **/
  @ApiModelProperty(example = "[10293,192933]", value = "List of trailer ID's associated with the driver for the day.")
  public Object getTrailerIds() {
    return trailerIds;
  }

  public void setTrailerIds(Object trailerIds) {
    this.trailerIds = trailerIds;
  }

  public DriverDailyLogResponseDays activeHours(Double activeHours) {
    this.activeHours = activeHours;
    return this;
  }

   /**
   * Hours spent on duty or driving, rounded to two decimal places.
   * @return activeHours
  **/
  @ApiModelProperty(example = "5.4", value = "Hours spent on duty or driving, rounded to two decimal places.")
  public Double getActiveHours() {
    return activeHours;
  }

  public void setActiveHours(Double activeHours) {
    this.activeHours = activeHours;
  }

  public DriverDailyLogResponseDays distanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
    return this;
  }

   /**
   * Distance driven in miles, rounded to two decimal places.
   * @return distanceMiles
  **/
  @ApiModelProperty(example = "123.24", value = "Distance driven in miles, rounded to two decimal places.")
  public Double getDistanceMiles() {
    return distanceMiles;
  }

  public void setDistanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

  public DriverDailyLogResponseDays activeMs(Long activeMs) {
    this.activeMs = activeMs;
    return this;
  }

   /**
   * Milliseconds spent on duty or driving.
   * @return activeMs
  **/
  @ApiModelProperty(example = "691200", value = "Milliseconds spent on duty or driving.")
  public Long getActiveMs() {
    return activeMs;
  }

  public void setActiveMs(Long activeMs) {
    this.activeMs = activeMs;
  }

  public DriverDailyLogResponseDays certified(Boolean certified) {
    this.certified = certified;
    return this;
  }

   /**
   * Whether this HOS day chart was certified by the driver.
   * @return certified
  **/
  @ApiModelProperty(value = "Whether this HOS day chart was certified by the driver.")
  public Boolean getCertified() {
    return certified;
  }

  public void setCertified(Boolean certified) {
    this.certified = certified;
  }

  public DriverDailyLogResponseDays vehicleIds(Object vehicleIds) {
    this.vehicleIds = vehicleIds;
    return this;
  }

   /**
   * List of vehicle ID's associated with the driver for the day.
   * @return vehicleIds
  **/
  @ApiModelProperty(example = "[192319,12958]", value = "List of vehicle ID's associated with the driver for the day.")
  public Object getVehicleIds() {
    return vehicleIds;
  }

  public void setVehicleIds(Object vehicleIds) {
    this.vehicleIds = vehicleIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverDailyLogResponseDays driverDailyLogResponseDays = (DriverDailyLogResponseDays) o;
    return Objects.equals(this.certifiedAtMs, driverDailyLogResponseDays.certifiedAtMs) &&
        Objects.equals(this.endMs, driverDailyLogResponseDays.endMs) &&
        Objects.equals(this.startMs, driverDailyLogResponseDays.startMs) &&
        Objects.equals(this.trailerIds, driverDailyLogResponseDays.trailerIds) &&
        Objects.equals(this.activeHours, driverDailyLogResponseDays.activeHours) &&
        Objects.equals(this.distanceMiles, driverDailyLogResponseDays.distanceMiles) &&
        Objects.equals(this.activeMs, driverDailyLogResponseDays.activeMs) &&
        Objects.equals(this.certified, driverDailyLogResponseDays.certified) &&
        Objects.equals(this.vehicleIds, driverDailyLogResponseDays.vehicleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certifiedAtMs, endMs, startMs, trailerIds, activeHours, distanceMiles, activeMs, certified, vehicleIds);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

