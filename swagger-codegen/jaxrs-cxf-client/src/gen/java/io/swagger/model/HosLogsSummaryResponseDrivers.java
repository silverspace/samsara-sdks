package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HosLogsSummaryResponseDrivers  {
  
  @ApiModelProperty(example = "252000000", value = "The amount of remaining cycle time (in ms).")
 /**
   * The amount of remaining cycle time (in ms).
  **/
  private Long cycleRemaining = null;

  @ApiModelProperty(example = "252000000", value = "The amount of cycle time (in ms) available tomorrow.")
 /**
   * The amount of cycle time (in ms) available tomorrow.
  **/
  private Long cycleTomorrow = null;

  @ApiModelProperty(example = "444", value = "ID of the driver.")
 /**
   * ID of the driver.
  **/
  private Long driverId = null;

  @ApiModelProperty(example = "Fred Jacobs", value = "Name of the driver.")
 /**
   * Name of the driver.
  **/
  private String driverName = null;

  @ApiModelProperty(example = "50400000", value = "The amount of driving time in violation in this cycle (in ms).")
 /**
   * The amount of driving time in violation in this cycle (in ms).
  **/
  private Long drivingInViolationCycle = null;

  @ApiModelProperty(example = "39600000", value = "The amount of driving time in violation today (in ms).")
 /**
   * The amount of driving time in violation today (in ms).
  **/
  private Long drivingInViolationToday = null;

  @ApiModelProperty(example = "OFF_DUTY", value = "The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.")
 /**
   * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
  **/
  private String dutyStatus = null;

  @ApiModelProperty(example = "39600000", value = "The amount of remaining shift drive time (in ms).")
 /**
   * The amount of remaining shift drive time (in ms).
  **/
  private Long shiftDriveRemaining = null;

  @ApiModelProperty(example = "50400000", value = "The amount of remaining shift time (in ms).")
 /**
   * The amount of remaining shift time (in ms).
  **/
  private Long shiftRemaining = null;

  @ApiModelProperty(example = "5000", value = "The amount of time (in ms) that the driver has been in the current `dutyStatus`.")
 /**
   * The amount of time (in ms) that the driver has been in the current `dutyStatus`.
  **/
  private Long timeInCurrentStatus = null;

  @ApiModelProperty(example = "28800000", value = "The amount of time (in ms) remaining until the driver cannot drive without a rest break.")
 /**
   * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
  **/
  private Long timeUntilBreak = null;

  @ApiModelProperty(example = "Vehicle 1", value = "Name of the vehicle.")
 /**
   * Name of the vehicle.
  **/
  private String vehicleName = null;
 /**
   * The amount of remaining cycle time (in ms).
   * @return cycleRemaining
  **/
  @JsonProperty("cycleRemaining")
  public Long getCycleRemaining() {
    return cycleRemaining;
  }

  public void setCycleRemaining(Long cycleRemaining) {
    this.cycleRemaining = cycleRemaining;
  }

  public HosLogsSummaryResponseDrivers cycleRemaining(Long cycleRemaining) {
    this.cycleRemaining = cycleRemaining;
    return this;
  }

 /**
   * The amount of cycle time (in ms) available tomorrow.
   * @return cycleTomorrow
  **/
  @JsonProperty("cycleTomorrow")
  public Long getCycleTomorrow() {
    return cycleTomorrow;
  }

  public void setCycleTomorrow(Long cycleTomorrow) {
    this.cycleTomorrow = cycleTomorrow;
  }

  public HosLogsSummaryResponseDrivers cycleTomorrow(Long cycleTomorrow) {
    this.cycleTomorrow = cycleTomorrow;
    return this;
  }

 /**
   * ID of the driver.
   * @return driverId
  **/
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public HosLogsSummaryResponseDrivers driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

 /**
   * Name of the driver.
   * @return driverName
  **/
  @JsonProperty("driverName")
  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public HosLogsSummaryResponseDrivers driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

 /**
   * The amount of driving time in violation in this cycle (in ms).
   * @return drivingInViolationCycle
  **/
  @JsonProperty("drivingInViolationCycle")
  public Long getDrivingInViolationCycle() {
    return drivingInViolationCycle;
  }

  public void setDrivingInViolationCycle(Long drivingInViolationCycle) {
    this.drivingInViolationCycle = drivingInViolationCycle;
  }

  public HosLogsSummaryResponseDrivers drivingInViolationCycle(Long drivingInViolationCycle) {
    this.drivingInViolationCycle = drivingInViolationCycle;
    return this;
  }

 /**
   * The amount of driving time in violation today (in ms).
   * @return drivingInViolationToday
  **/
  @JsonProperty("drivingInViolationToday")
  public Long getDrivingInViolationToday() {
    return drivingInViolationToday;
  }

  public void setDrivingInViolationToday(Long drivingInViolationToday) {
    this.drivingInViolationToday = drivingInViolationToday;
  }

  public HosLogsSummaryResponseDrivers drivingInViolationToday(Long drivingInViolationToday) {
    this.drivingInViolationToday = drivingInViolationToday;
    return this;
  }

 /**
   * The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
   * @return dutyStatus
  **/
  @JsonProperty("dutyStatus")
  public String getDutyStatus() {
    return dutyStatus;
  }

  public void setDutyStatus(String dutyStatus) {
    this.dutyStatus = dutyStatus;
  }

  public HosLogsSummaryResponseDrivers dutyStatus(String dutyStatus) {
    this.dutyStatus = dutyStatus;
    return this;
  }

 /**
   * The amount of remaining shift drive time (in ms).
   * @return shiftDriveRemaining
  **/
  @JsonProperty("shiftDriveRemaining")
  public Long getShiftDriveRemaining() {
    return shiftDriveRemaining;
  }

  public void setShiftDriveRemaining(Long shiftDriveRemaining) {
    this.shiftDriveRemaining = shiftDriveRemaining;
  }

  public HosLogsSummaryResponseDrivers shiftDriveRemaining(Long shiftDriveRemaining) {
    this.shiftDriveRemaining = shiftDriveRemaining;
    return this;
  }

 /**
   * The amount of remaining shift time (in ms).
   * @return shiftRemaining
  **/
  @JsonProperty("shiftRemaining")
  public Long getShiftRemaining() {
    return shiftRemaining;
  }

  public void setShiftRemaining(Long shiftRemaining) {
    this.shiftRemaining = shiftRemaining;
  }

  public HosLogsSummaryResponseDrivers shiftRemaining(Long shiftRemaining) {
    this.shiftRemaining = shiftRemaining;
    return this;
  }

 /**
   * The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.
   * @return timeInCurrentStatus
  **/
  @JsonProperty("timeInCurrentStatus")
  public Long getTimeInCurrentStatus() {
    return timeInCurrentStatus;
  }

  public void setTimeInCurrentStatus(Long timeInCurrentStatus) {
    this.timeInCurrentStatus = timeInCurrentStatus;
  }

  public HosLogsSummaryResponseDrivers timeInCurrentStatus(Long timeInCurrentStatus) {
    this.timeInCurrentStatus = timeInCurrentStatus;
    return this;
  }

 /**
   * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
   * @return timeUntilBreak
  **/
  @JsonProperty("timeUntilBreak")
  public Long getTimeUntilBreak() {
    return timeUntilBreak;
  }

  public void setTimeUntilBreak(Long timeUntilBreak) {
    this.timeUntilBreak = timeUntilBreak;
  }

  public HosLogsSummaryResponseDrivers timeUntilBreak(Long timeUntilBreak) {
    this.timeUntilBreak = timeUntilBreak;
    return this;
  }

 /**
   * Name of the vehicle.
   * @return vehicleName
  **/
  @JsonProperty("vehicleName")
  public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

  public HosLogsSummaryResponseDrivers vehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

