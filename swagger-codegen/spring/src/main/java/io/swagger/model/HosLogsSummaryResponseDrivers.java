package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HosLogsSummaryResponseDrivers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class HosLogsSummaryResponseDrivers   {
  @JsonProperty("cycleRemaining")
  private Long cycleRemaining = null;

  @JsonProperty("cycleTomorrow")
  private Long cycleTomorrow = null;

  @JsonProperty("driverId")
  private Long driverId = null;

  @JsonProperty("driverName")
  private String driverName = null;

  @JsonProperty("drivingInViolationCycle")
  private Long drivingInViolationCycle = null;

  @JsonProperty("drivingInViolationToday")
  private Long drivingInViolationToday = null;

  @JsonProperty("dutyStatus")
  private String dutyStatus = null;

  @JsonProperty("shiftDriveRemaining")
  private Long shiftDriveRemaining = null;

  @JsonProperty("shiftRemaining")
  private Long shiftRemaining = null;

  @JsonProperty("timeInCurrentStatus")
  private Long timeInCurrentStatus = null;

  @JsonProperty("timeUntilBreak")
  private Long timeUntilBreak = null;

  @JsonProperty("vehicleName")
  private String vehicleName = null;

  public HosLogsSummaryResponseDrivers cycleRemaining(Long cycleRemaining) {
    this.cycleRemaining = cycleRemaining;
    return this;
  }

  /**
   * The amount of remaining cycle time (in ms).
   * @return cycleRemaining
  **/
  @ApiModelProperty(example = "252000000", value = "The amount of remaining cycle time (in ms).")


  public Long getCycleRemaining() {
    return cycleRemaining;
  }

  public void setCycleRemaining(Long cycleRemaining) {
    this.cycleRemaining = cycleRemaining;
  }

  public HosLogsSummaryResponseDrivers cycleTomorrow(Long cycleTomorrow) {
    this.cycleTomorrow = cycleTomorrow;
    return this;
  }

  /**
   * The amount of cycle time (in ms) available tomorrow.
   * @return cycleTomorrow
  **/
  @ApiModelProperty(example = "252000000", value = "The amount of cycle time (in ms) available tomorrow.")


  public Long getCycleTomorrow() {
    return cycleTomorrow;
  }

  public void setCycleTomorrow(Long cycleTomorrow) {
    this.cycleTomorrow = cycleTomorrow;
  }

  public HosLogsSummaryResponseDrivers driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * ID of the driver.
   * @return driverId
  **/
  @ApiModelProperty(example = "444", value = "ID of the driver.")


  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public HosLogsSummaryResponseDrivers driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  /**
   * Name of the driver.
   * @return driverName
  **/
  @ApiModelProperty(example = "Fred Jacobs", value = "Name of the driver.")


  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public HosLogsSummaryResponseDrivers drivingInViolationCycle(Long drivingInViolationCycle) {
    this.drivingInViolationCycle = drivingInViolationCycle;
    return this;
  }

  /**
   * The amount of driving time in violation in this cycle (in ms).
   * @return drivingInViolationCycle
  **/
  @ApiModelProperty(example = "50400000", value = "The amount of driving time in violation in this cycle (in ms).")


  public Long getDrivingInViolationCycle() {
    return drivingInViolationCycle;
  }

  public void setDrivingInViolationCycle(Long drivingInViolationCycle) {
    this.drivingInViolationCycle = drivingInViolationCycle;
  }

  public HosLogsSummaryResponseDrivers drivingInViolationToday(Long drivingInViolationToday) {
    this.drivingInViolationToday = drivingInViolationToday;
    return this;
  }

  /**
   * The amount of driving time in violation today (in ms).
   * @return drivingInViolationToday
  **/
  @ApiModelProperty(example = "39600000", value = "The amount of driving time in violation today (in ms).")


  public Long getDrivingInViolationToday() {
    return drivingInViolationToday;
  }

  public void setDrivingInViolationToday(Long drivingInViolationToday) {
    this.drivingInViolationToday = drivingInViolationToday;
  }

  public HosLogsSummaryResponseDrivers dutyStatus(String dutyStatus) {
    this.dutyStatus = dutyStatus;
    return this;
  }

  /**
   * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
   * @return dutyStatus
  **/
  @ApiModelProperty(example = "OFF_DUTY", value = "The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.")


  public String getDutyStatus() {
    return dutyStatus;
  }

  public void setDutyStatus(String dutyStatus) {
    this.dutyStatus = dutyStatus;
  }

  public HosLogsSummaryResponseDrivers shiftDriveRemaining(Long shiftDriveRemaining) {
    this.shiftDriveRemaining = shiftDriveRemaining;
    return this;
  }

  /**
   * The amount of remaining shift drive time (in ms).
   * @return shiftDriveRemaining
  **/
  @ApiModelProperty(example = "39600000", value = "The amount of remaining shift drive time (in ms).")


  public Long getShiftDriveRemaining() {
    return shiftDriveRemaining;
  }

  public void setShiftDriveRemaining(Long shiftDriveRemaining) {
    this.shiftDriveRemaining = shiftDriveRemaining;
  }

  public HosLogsSummaryResponseDrivers shiftRemaining(Long shiftRemaining) {
    this.shiftRemaining = shiftRemaining;
    return this;
  }

  /**
   * The amount of remaining shift time (in ms).
   * @return shiftRemaining
  **/
  @ApiModelProperty(example = "50400000", value = "The amount of remaining shift time (in ms).")


  public Long getShiftRemaining() {
    return shiftRemaining;
  }

  public void setShiftRemaining(Long shiftRemaining) {
    this.shiftRemaining = shiftRemaining;
  }

  public HosLogsSummaryResponseDrivers timeInCurrentStatus(Long timeInCurrentStatus) {
    this.timeInCurrentStatus = timeInCurrentStatus;
    return this;
  }

  /**
   * The amount of time (in ms) that the driver has been in the current `dutyStatus`.
   * @return timeInCurrentStatus
  **/
  @ApiModelProperty(example = "5000", value = "The amount of time (in ms) that the driver has been in the current `dutyStatus`.")


  public Long getTimeInCurrentStatus() {
    return timeInCurrentStatus;
  }

  public void setTimeInCurrentStatus(Long timeInCurrentStatus) {
    this.timeInCurrentStatus = timeInCurrentStatus;
  }

  public HosLogsSummaryResponseDrivers timeUntilBreak(Long timeUntilBreak) {
    this.timeUntilBreak = timeUntilBreak;
    return this;
  }

  /**
   * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
   * @return timeUntilBreak
  **/
  @ApiModelProperty(example = "28800000", value = "The amount of time (in ms) remaining until the driver cannot drive without a rest break.")


  public Long getTimeUntilBreak() {
    return timeUntilBreak;
  }

  public void setTimeUntilBreak(Long timeUntilBreak) {
    this.timeUntilBreak = timeUntilBreak;
  }

  public HosLogsSummaryResponseDrivers vehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
    return this;
  }

  /**
   * Name of the vehicle.
   * @return vehicleName
  **/
  @ApiModelProperty(example = "Vehicle 1", value = "Name of the vehicle.")


  public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers = (HosLogsSummaryResponseDrivers) o;
    return Objects.equals(this.cycleRemaining, hosLogsSummaryResponseDrivers.cycleRemaining) &&
        Objects.equals(this.cycleTomorrow, hosLogsSummaryResponseDrivers.cycleTomorrow) &&
        Objects.equals(this.driverId, hosLogsSummaryResponseDrivers.driverId) &&
        Objects.equals(this.driverName, hosLogsSummaryResponseDrivers.driverName) &&
        Objects.equals(this.drivingInViolationCycle, hosLogsSummaryResponseDrivers.drivingInViolationCycle) &&
        Objects.equals(this.drivingInViolationToday, hosLogsSummaryResponseDrivers.drivingInViolationToday) &&
        Objects.equals(this.dutyStatus, hosLogsSummaryResponseDrivers.dutyStatus) &&
        Objects.equals(this.shiftDriveRemaining, hosLogsSummaryResponseDrivers.shiftDriveRemaining) &&
        Objects.equals(this.shiftRemaining, hosLogsSummaryResponseDrivers.shiftRemaining) &&
        Objects.equals(this.timeInCurrentStatus, hosLogsSummaryResponseDrivers.timeInCurrentStatus) &&
        Objects.equals(this.timeUntilBreak, hosLogsSummaryResponseDrivers.timeUntilBreak) &&
        Objects.equals(this.vehicleName, hosLogsSummaryResponseDrivers.vehicleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleRemaining, cycleTomorrow, driverId, driverName, drivingInViolationCycle, drivingInViolationToday, dutyStatus, shiftDriveRemaining, shiftRemaining, timeInCurrentStatus, timeUntilBreak, vehicleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsSummaryResponseDrivers {\n");
    
    sb.append("    cycleRemaining: ").append(toIndentedString(cycleRemaining)).append("\n");
    sb.append("    cycleTomorrow: ").append(toIndentedString(cycleTomorrow)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    drivingInViolationCycle: ").append(toIndentedString(drivingInViolationCycle)).append("\n");
    sb.append("    drivingInViolationToday: ").append(toIndentedString(drivingInViolationToday)).append("\n");
    sb.append("    dutyStatus: ").append(toIndentedString(dutyStatus)).append("\n");
    sb.append("    shiftDriveRemaining: ").append(toIndentedString(shiftDriveRemaining)).append("\n");
    sb.append("    shiftRemaining: ").append(toIndentedString(shiftRemaining)).append("\n");
    sb.append("    timeInCurrentStatus: ").append(toIndentedString(timeInCurrentStatus)).append("\n");
    sb.append("    timeUntilBreak: ").append(toIndentedString(timeUntilBreak)).append("\n");
    sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
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

