package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class HosLogsSummaryResponseDrivers   {
  
  private Long cycleRemaining = null;
  private Long cycleTomorrow = null;
  private Long driverId = null;
  private String driverName = null;
  private Long drivingInViolationCycle = null;
  private Long drivingInViolationToday = null;
  private String dutyStatus = null;
  private Long shiftDriveRemaining = null;
  private Long shiftRemaining = null;
  private Long timeInCurrentStatus = null;
  private Long timeUntilBreak = null;
  private String vehicleName = null;

  /**
   * The amount of remaining cycle time (in ms).
   **/
  
  @ApiModelProperty(example = "252000000", value = "The amount of remaining cycle time (in ms).")
  @JsonProperty("cycleRemaining")
  public Long getCycleRemaining() {
    return cycleRemaining;
  }
  public void setCycleRemaining(Long cycleRemaining) {
    this.cycleRemaining = cycleRemaining;
  }

  /**
   * The amount of cycle time (in ms) available tomorrow.
   **/
  
  @ApiModelProperty(example = "252000000", value = "The amount of cycle time (in ms) available tomorrow.")
  @JsonProperty("cycleTomorrow")
  public Long getCycleTomorrow() {
    return cycleTomorrow;
  }
  public void setCycleTomorrow(Long cycleTomorrow) {
    this.cycleTomorrow = cycleTomorrow;
  }

  /**
   * ID of the driver.
   **/
  
  @ApiModelProperty(example = "444", value = "ID of the driver.")
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  /**
   * Name of the driver.
   **/
  
  @ApiModelProperty(example = "Fred Jacobs", value = "Name of the driver.")
  @JsonProperty("driverName")
  public String getDriverName() {
    return driverName;
  }
  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  /**
   * The amount of driving time in violation in this cycle (in ms).
   **/
  
  @ApiModelProperty(example = "50400000", value = "The amount of driving time in violation in this cycle (in ms).")
  @JsonProperty("drivingInViolationCycle")
  public Long getDrivingInViolationCycle() {
    return drivingInViolationCycle;
  }
  public void setDrivingInViolationCycle(Long drivingInViolationCycle) {
    this.drivingInViolationCycle = drivingInViolationCycle;
  }

  /**
   * The amount of driving time in violation today (in ms).
   **/
  
  @ApiModelProperty(example = "39600000", value = "The amount of driving time in violation today (in ms).")
  @JsonProperty("drivingInViolationToday")
  public Long getDrivingInViolationToday() {
    return drivingInViolationToday;
  }
  public void setDrivingInViolationToday(Long drivingInViolationToday) {
    this.drivingInViolationToday = drivingInViolationToday;
  }

  /**
   * The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
   **/
  
  @ApiModelProperty(example = "OFF_DUTY", value = "The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.")
  @JsonProperty("dutyStatus")
  public String getDutyStatus() {
    return dutyStatus;
  }
  public void setDutyStatus(String dutyStatus) {
    this.dutyStatus = dutyStatus;
  }

  /**
   * The amount of remaining shift drive time (in ms).
   **/
  
  @ApiModelProperty(example = "39600000", value = "The amount of remaining shift drive time (in ms).")
  @JsonProperty("shiftDriveRemaining")
  public Long getShiftDriveRemaining() {
    return shiftDriveRemaining;
  }
  public void setShiftDriveRemaining(Long shiftDriveRemaining) {
    this.shiftDriveRemaining = shiftDriveRemaining;
  }

  /**
   * The amount of remaining shift time (in ms).
   **/
  
  @ApiModelProperty(example = "50400000", value = "The amount of remaining shift time (in ms).")
  @JsonProperty("shiftRemaining")
  public Long getShiftRemaining() {
    return shiftRemaining;
  }
  public void setShiftRemaining(Long shiftRemaining) {
    this.shiftRemaining = shiftRemaining;
  }

  /**
   * The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.
   **/
  
  @ApiModelProperty(example = "5000", value = "The amount of time (in ms) that the driver has been in the current `dutyStatus`.")
  @JsonProperty("timeInCurrentStatus")
  public Long getTimeInCurrentStatus() {
    return timeInCurrentStatus;
  }
  public void setTimeInCurrentStatus(Long timeInCurrentStatus) {
    this.timeInCurrentStatus = timeInCurrentStatus;
  }

  /**
   * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
   **/
  
  @ApiModelProperty(example = "28800000", value = "The amount of time (in ms) remaining until the driver cannot drive without a rest break.")
  @JsonProperty("timeUntilBreak")
  public Long getTimeUntilBreak() {
    return timeUntilBreak;
  }
  public void setTimeUntilBreak(Long timeUntilBreak) {
    this.timeUntilBreak = timeUntilBreak;
  }

  /**
   * Name of the vehicle.
   **/
  
  @ApiModelProperty(example = "Vehicle 1", value = "Name of the vehicle.")
  @JsonProperty("vehicleName")
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
    return Objects.equals(cycleRemaining, hosLogsSummaryResponseDrivers.cycleRemaining) &&
        Objects.equals(cycleTomorrow, hosLogsSummaryResponseDrivers.cycleTomorrow) &&
        Objects.equals(driverId, hosLogsSummaryResponseDrivers.driverId) &&
        Objects.equals(driverName, hosLogsSummaryResponseDrivers.driverName) &&
        Objects.equals(drivingInViolationCycle, hosLogsSummaryResponseDrivers.drivingInViolationCycle) &&
        Objects.equals(drivingInViolationToday, hosLogsSummaryResponseDrivers.drivingInViolationToday) &&
        Objects.equals(dutyStatus, hosLogsSummaryResponseDrivers.dutyStatus) &&
        Objects.equals(shiftDriveRemaining, hosLogsSummaryResponseDrivers.shiftDriveRemaining) &&
        Objects.equals(shiftRemaining, hosLogsSummaryResponseDrivers.shiftRemaining) &&
        Objects.equals(timeInCurrentStatus, hosLogsSummaryResponseDrivers.timeInCurrentStatus) &&
        Objects.equals(timeUntilBreak, hosLogsSummaryResponseDrivers.timeUntilBreak) &&
        Objects.equals(vehicleName, hosLogsSummaryResponseDrivers.vehicleName);
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

