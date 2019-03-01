package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class HosLogsSummaryResponseDrivers   {
  
  private Long timeUntilBreak;
  private String vehicleName;
  private Long drivingInViolationToday;
  private Long driverId;
  private Long cycleRemaining;
  private String driverName;
  private String dutyStatus;
  private Long cycleTomorrow;
  private Long shiftDriveRemaining;
  private Long timeInCurrentStatus;
  private Long drivingInViolationCycle;
  private Long shiftRemaining;

  public HosLogsSummaryResponseDrivers () {

  }

  public HosLogsSummaryResponseDrivers (Long timeUntilBreak, String vehicleName, Long drivingInViolationToday, Long driverId, Long cycleRemaining, String driverName, String dutyStatus, Long cycleTomorrow, Long shiftDriveRemaining, Long timeInCurrentStatus, Long drivingInViolationCycle, Long shiftRemaining) {
    this.timeUntilBreak = timeUntilBreak;
    this.vehicleName = vehicleName;
    this.drivingInViolationToday = drivingInViolationToday;
    this.driverId = driverId;
    this.cycleRemaining = cycleRemaining;
    this.driverName = driverName;
    this.dutyStatus = dutyStatus;
    this.cycleTomorrow = cycleTomorrow;
    this.shiftDriveRemaining = shiftDriveRemaining;
    this.timeInCurrentStatus = timeInCurrentStatus;
    this.drivingInViolationCycle = drivingInViolationCycle;
    this.shiftRemaining = shiftRemaining;
  }

    
  @JsonProperty("timeUntilBreak")
  public Long getTimeUntilBreak() {
    return timeUntilBreak;
  }
  public void setTimeUntilBreak(Long timeUntilBreak) {
    this.timeUntilBreak = timeUntilBreak;
  }

    
  @JsonProperty("vehicleName")
  public String getVehicleName() {
    return vehicleName;
  }
  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

    
  @JsonProperty("drivingInViolationToday")
  public Long getDrivingInViolationToday() {
    return drivingInViolationToday;
  }
  public void setDrivingInViolationToday(Long drivingInViolationToday) {
    this.drivingInViolationToday = drivingInViolationToday;
  }

    
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

    
  @JsonProperty("cycleRemaining")
  public Long getCycleRemaining() {
    return cycleRemaining;
  }
  public void setCycleRemaining(Long cycleRemaining) {
    this.cycleRemaining = cycleRemaining;
  }

    
  @JsonProperty("driverName")
  public String getDriverName() {
    return driverName;
  }
  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

    
  @JsonProperty("dutyStatus")
  public String getDutyStatus() {
    return dutyStatus;
  }
  public void setDutyStatus(String dutyStatus) {
    this.dutyStatus = dutyStatus;
  }

    
  @JsonProperty("cycleTomorrow")
  public Long getCycleTomorrow() {
    return cycleTomorrow;
  }
  public void setCycleTomorrow(Long cycleTomorrow) {
    this.cycleTomorrow = cycleTomorrow;
  }

    
  @JsonProperty("shiftDriveRemaining")
  public Long getShiftDriveRemaining() {
    return shiftDriveRemaining;
  }
  public void setShiftDriveRemaining(Long shiftDriveRemaining) {
    this.shiftDriveRemaining = shiftDriveRemaining;
  }

    
  @JsonProperty("timeInCurrentStatus")
  public Long getTimeInCurrentStatus() {
    return timeInCurrentStatus;
  }
  public void setTimeInCurrentStatus(Long timeInCurrentStatus) {
    this.timeInCurrentStatus = timeInCurrentStatus;
  }

    
  @JsonProperty("drivingInViolationCycle")
  public Long getDrivingInViolationCycle() {
    return drivingInViolationCycle;
  }
  public void setDrivingInViolationCycle(Long drivingInViolationCycle) {
    this.drivingInViolationCycle = drivingInViolationCycle;
  }

    
  @JsonProperty("shiftRemaining")
  public Long getShiftRemaining() {
    return shiftRemaining;
  }
  public void setShiftRemaining(Long shiftRemaining) {
    this.shiftRemaining = shiftRemaining;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosLogsSummaryResponseDrivers hosLogsSummaryResponseDrivers = (HosLogsSummaryResponseDrivers) o;
    return Objects.equals(timeUntilBreak, hosLogsSummaryResponseDrivers.timeUntilBreak) &&
        Objects.equals(vehicleName, hosLogsSummaryResponseDrivers.vehicleName) &&
        Objects.equals(drivingInViolationToday, hosLogsSummaryResponseDrivers.drivingInViolationToday) &&
        Objects.equals(driverId, hosLogsSummaryResponseDrivers.driverId) &&
        Objects.equals(cycleRemaining, hosLogsSummaryResponseDrivers.cycleRemaining) &&
        Objects.equals(driverName, hosLogsSummaryResponseDrivers.driverName) &&
        Objects.equals(dutyStatus, hosLogsSummaryResponseDrivers.dutyStatus) &&
        Objects.equals(cycleTomorrow, hosLogsSummaryResponseDrivers.cycleTomorrow) &&
        Objects.equals(shiftDriveRemaining, hosLogsSummaryResponseDrivers.shiftDriveRemaining) &&
        Objects.equals(timeInCurrentStatus, hosLogsSummaryResponseDrivers.timeInCurrentStatus) &&
        Objects.equals(drivingInViolationCycle, hosLogsSummaryResponseDrivers.drivingInViolationCycle) &&
        Objects.equals(shiftRemaining, hosLogsSummaryResponseDrivers.shiftRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeUntilBreak, vehicleName, drivingInViolationToday, driverId, cycleRemaining, driverName, dutyStatus, cycleTomorrow, shiftDriveRemaining, timeInCurrentStatus, drivingInViolationCycle, shiftRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsSummaryResponseDrivers {\n");
    
    sb.append("    timeUntilBreak: ").append(toIndentedString(timeUntilBreak)).append("\n");
    sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
    sb.append("    drivingInViolationToday: ").append(toIndentedString(drivingInViolationToday)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    cycleRemaining: ").append(toIndentedString(cycleRemaining)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    dutyStatus: ").append(toIndentedString(dutyStatus)).append("\n");
    sb.append("    cycleTomorrow: ").append(toIndentedString(cycleTomorrow)).append("\n");
    sb.append("    shiftDriveRemaining: ").append(toIndentedString(shiftDriveRemaining)).append("\n");
    sb.append("    timeInCurrentStatus: ").append(toIndentedString(timeInCurrentStatus)).append("\n");
    sb.append("    drivingInViolationCycle: ").append(toIndentedString(drivingInViolationCycle)).append("\n");
    sb.append("    shiftRemaining: ").append(toIndentedString(shiftRemaining)).append("\n");
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
