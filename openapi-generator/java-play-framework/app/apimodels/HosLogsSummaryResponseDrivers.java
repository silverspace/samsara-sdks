package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * HosLogsSummaryResponseDrivers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class HosLogsSummaryResponseDrivers   {
  @JsonProperty("timeUntilBreak")
  private Long timeUntilBreak;

  @JsonProperty("vehicleName")
  private String vehicleName;

  @JsonProperty("drivingInViolationToday")
  private Long drivingInViolationToday;

  @JsonProperty("driverId")
  private Long driverId;

  @JsonProperty("cycleRemaining")
  private Long cycleRemaining;

  @JsonProperty("driverName")
  private String driverName;

  @JsonProperty("dutyStatus")
  private String dutyStatus;

  @JsonProperty("cycleTomorrow")
  private Long cycleTomorrow;

  @JsonProperty("shiftDriveRemaining")
  private Long shiftDriveRemaining;

  @JsonProperty("timeInCurrentStatus")
  private Long timeInCurrentStatus;

  @JsonProperty("drivingInViolationCycle")
  private Long drivingInViolationCycle;

  @JsonProperty("shiftRemaining")
  private Long shiftRemaining;

  public HosLogsSummaryResponseDrivers timeUntilBreak(Long timeUntilBreak) {
    this.timeUntilBreak = timeUntilBreak;
    return this;
  }

   /**
   * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
   * @return timeUntilBreak
  **/
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
    public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

  public HosLogsSummaryResponseDrivers drivingInViolationToday(Long drivingInViolationToday) {
    this.drivingInViolationToday = drivingInViolationToday;
    return this;
  }

   /**
   * The amount of driving time in violation today (in ms).
   * @return drivingInViolationToday
  **/
    public Long getDrivingInViolationToday() {
    return drivingInViolationToday;
  }

  public void setDrivingInViolationToday(Long drivingInViolationToday) {
    this.drivingInViolationToday = drivingInViolationToday;
  }

  public HosLogsSummaryResponseDrivers driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * ID of the driver.
   * @return driverId
  **/
    public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public HosLogsSummaryResponseDrivers cycleRemaining(Long cycleRemaining) {
    this.cycleRemaining = cycleRemaining;
    return this;
  }

   /**
   * The amount of remaining cycle time (in ms).
   * @return cycleRemaining
  **/
    public Long getCycleRemaining() {
    return cycleRemaining;
  }

  public void setCycleRemaining(Long cycleRemaining) {
    this.cycleRemaining = cycleRemaining;
  }

  public HosLogsSummaryResponseDrivers driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

   /**
   * Name of the driver.
   * @return driverName
  **/
    public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public HosLogsSummaryResponseDrivers dutyStatus(String dutyStatus) {
    this.dutyStatus = dutyStatus;
    return this;
  }

   /**
   * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
   * @return dutyStatus
  **/
    public String getDutyStatus() {
    return dutyStatus;
  }

  public void setDutyStatus(String dutyStatus) {
    this.dutyStatus = dutyStatus;
  }

  public HosLogsSummaryResponseDrivers cycleTomorrow(Long cycleTomorrow) {
    this.cycleTomorrow = cycleTomorrow;
    return this;
  }

   /**
   * The amount of cycle time (in ms) available tomorrow.
   * @return cycleTomorrow
  **/
    public Long getCycleTomorrow() {
    return cycleTomorrow;
  }

  public void setCycleTomorrow(Long cycleTomorrow) {
    this.cycleTomorrow = cycleTomorrow;
  }

  public HosLogsSummaryResponseDrivers shiftDriveRemaining(Long shiftDriveRemaining) {
    this.shiftDriveRemaining = shiftDriveRemaining;
    return this;
  }

   /**
   * The amount of remaining shift drive time (in ms).
   * @return shiftDriveRemaining
  **/
    public Long getShiftDriveRemaining() {
    return shiftDriveRemaining;
  }

  public void setShiftDriveRemaining(Long shiftDriveRemaining) {
    this.shiftDriveRemaining = shiftDriveRemaining;
  }

  public HosLogsSummaryResponseDrivers timeInCurrentStatus(Long timeInCurrentStatus) {
    this.timeInCurrentStatus = timeInCurrentStatus;
    return this;
  }

   /**
   * The amount of time (in ms) that the driver has been in the current `dutyStatus`.
   * @return timeInCurrentStatus
  **/
    public Long getTimeInCurrentStatus() {
    return timeInCurrentStatus;
  }

  public void setTimeInCurrentStatus(Long timeInCurrentStatus) {
    this.timeInCurrentStatus = timeInCurrentStatus;
  }

  public HosLogsSummaryResponseDrivers drivingInViolationCycle(Long drivingInViolationCycle) {
    this.drivingInViolationCycle = drivingInViolationCycle;
    return this;
  }

   /**
   * The amount of driving time in violation in this cycle (in ms).
   * @return drivingInViolationCycle
  **/
    public Long getDrivingInViolationCycle() {
    return drivingInViolationCycle;
  }

  public void setDrivingInViolationCycle(Long drivingInViolationCycle) {
    this.drivingInViolationCycle = drivingInViolationCycle;
  }

  public HosLogsSummaryResponseDrivers shiftRemaining(Long shiftRemaining) {
    this.shiftRemaining = shiftRemaining;
    return this;
  }

   /**
   * The amount of remaining shift time (in ms).
   * @return shiftRemaining
  **/
    public Long getShiftRemaining() {
    return shiftRemaining;
  }

  public void setShiftRemaining(Long shiftRemaining) {
    this.shiftRemaining = shiftRemaining;
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

