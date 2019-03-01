package apimodels;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * HosLogsResponseLogs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class HosLogsResponseLogs   {
  @JsonProperty("locLng")
  private Double locLng;

  @JsonProperty("logStartMs")
  private Long logStartMs;

  @JsonProperty("driverId")
  private Long driverId;

  @JsonProperty("statusType")
  private String statusType;

  @JsonProperty("locCity")
  private String locCity;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("locName")
  private String locName;

  @JsonProperty("locLat")
  private Double locLat;

  @JsonProperty("remark")
  private String remark;

  @JsonProperty("locState")
  private String locState;

  @JsonProperty("vehicleId")
  private Long vehicleId;

  @JsonProperty("codriverIds")
  private List<Long> codriverIds = null;

  public HosLogsResponseLogs locLng(Double locLng) {
    this.locLng = locLng;
    return this;
  }

   /**
   * Longitude at which the log was recorded.
   * @return locLng
  **/
    public Double getLocLng() {
    return locLng;
  }

  public void setLocLng(Double locLng) {
    this.locLng = locLng;
  }

  public HosLogsResponseLogs logStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
    return this;
  }

   /**
   * The time at which the log/HOS status started in UNIX milliseconds.
   * @return logStartMs
  **/
    public Long getLogStartMs() {
    return logStartMs;
  }

  public void setLogStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
  }

  public HosLogsResponseLogs driverId(Long driverId) {
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

  public HosLogsResponseLogs statusType(String statusType) {
    this.statusType = statusType;
    return this;
  }

   /**
   * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
   * @return statusType
  **/
    public String getStatusType() {
    return statusType;
  }

  public void setStatusType(String statusType) {
    this.statusType = statusType;
  }

  public HosLogsResponseLogs locCity(String locCity) {
    this.locCity = locCity;
    return this;
  }

   /**
   * City in which the log was recorded.
   * @return locCity
  **/
    public String getLocCity() {
    return locCity;
  }

  public void setLocCity(String locCity) {
    this.locCity = locCity;
  }

  public HosLogsResponseLogs groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * ID of the group.
   * @return groupId
  **/
    public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public HosLogsResponseLogs locName(String locName) {
    this.locName = locName;
    return this;
  }

   /**
   * Name of location at which the log was recorded.
   * @return locName
  **/
    public String getLocName() {
    return locName;
  }

  public void setLocName(String locName) {
    this.locName = locName;
  }

  public HosLogsResponseLogs locLat(Double locLat) {
    this.locLat = locLat;
    return this;
  }

   /**
   * Latitude at which the log was recorded.
   * @return locLat
  **/
    public Double getLocLat() {
    return locLat;
  }

  public void setLocLat(Double locLat) {
    this.locLat = locLat;
  }

  public HosLogsResponseLogs remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * Remark associated with the log entry.
   * @return remark
  **/
    public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public HosLogsResponseLogs locState(String locState) {
    this.locState = locState;
    return this;
  }

   /**
   * State in which the log was recorded.
   * @return locState
  **/
    public String getLocState() {
    return locState;
  }

  public void setLocState(String locState) {
    this.locState = locState;
  }

  public HosLogsResponseLogs vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * ID of the vehicle.
   * @return vehicleId
  **/
    public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public HosLogsResponseLogs codriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
    return this;
  }

  public HosLogsResponseLogs addCodriverIdsItem(Long codriverIdsItem) {
    if (codriverIds == null) {
      codriverIds = new ArrayList<>();
    }
    codriverIds.add(codriverIdsItem);
    return this;
  }

   /**
   * Get codriverIds
   * @return codriverIds
  **/
    public List<Long> getCodriverIds() {
    return codriverIds;
  }

  public void setCodriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosLogsResponseLogs hosLogsResponseLogs = (HosLogsResponseLogs) o;
    return Objects.equals(locLng, hosLogsResponseLogs.locLng) &&
        Objects.equals(logStartMs, hosLogsResponseLogs.logStartMs) &&
        Objects.equals(driverId, hosLogsResponseLogs.driverId) &&
        Objects.equals(statusType, hosLogsResponseLogs.statusType) &&
        Objects.equals(locCity, hosLogsResponseLogs.locCity) &&
        Objects.equals(groupId, hosLogsResponseLogs.groupId) &&
        Objects.equals(locName, hosLogsResponseLogs.locName) &&
        Objects.equals(locLat, hosLogsResponseLogs.locLat) &&
        Objects.equals(remark, hosLogsResponseLogs.remark) &&
        Objects.equals(locState, hosLogsResponseLogs.locState) &&
        Objects.equals(vehicleId, hosLogsResponseLogs.vehicleId) &&
        Objects.equals(codriverIds, hosLogsResponseLogs.codriverIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locLng, logStartMs, driverId, statusType, locCity, groupId, locName, locLat, remark, locState, vehicleId, codriverIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsResponseLogs {\n");
    
    sb.append("    locLng: ").append(toIndentedString(locLng)).append("\n");
    sb.append("    logStartMs: ").append(toIndentedString(logStartMs)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
    sb.append("    locCity: ").append(toIndentedString(locCity)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    locName: ").append(toIndentedString(locName)).append("\n");
    sb.append("    locLat: ").append(toIndentedString(locLat)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    locState: ").append(toIndentedString(locState)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    codriverIds: ").append(toIndentedString(codriverIds)).append("\n");
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

