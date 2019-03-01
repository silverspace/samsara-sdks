package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class HosLogsResponseLogs   {
  
  private Double locLng;
  private Long logStartMs;
  private Long driverId;
  private String statusType;
  private String locCity;
  private Long groupId;
  private String locName;
  private Double locLat;
  private String remark;
  private String locState;
  private Long vehicleId;
  private List<Long> codriverIds = new ArrayList<>();

  public HosLogsResponseLogs () {

  }

  public HosLogsResponseLogs (Double locLng, Long logStartMs, Long driverId, String statusType, String locCity, Long groupId, String locName, Double locLat, String remark, String locState, Long vehicleId, List<Long> codriverIds) {
    this.locLng = locLng;
    this.logStartMs = logStartMs;
    this.driverId = driverId;
    this.statusType = statusType;
    this.locCity = locCity;
    this.groupId = groupId;
    this.locName = locName;
    this.locLat = locLat;
    this.remark = remark;
    this.locState = locState;
    this.vehicleId = vehicleId;
    this.codriverIds = codriverIds;
  }

    
  @JsonProperty("locLng")
  public Double getLocLng() {
    return locLng;
  }
  public void setLocLng(Double locLng) {
    this.locLng = locLng;
  }

    
  @JsonProperty("logStartMs")
  public Long getLogStartMs() {
    return logStartMs;
  }
  public void setLogStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
  }

    
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

    
  @JsonProperty("statusType")
  public String getStatusType() {
    return statusType;
  }
  public void setStatusType(String statusType) {
    this.statusType = statusType;
  }

    
  @JsonProperty("locCity")
  public String getLocCity() {
    return locCity;
  }
  public void setLocCity(String locCity) {
    this.locCity = locCity;
  }

    
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

    
  @JsonProperty("locName")
  public String getLocName() {
    return locName;
  }
  public void setLocName(String locName) {
    this.locName = locName;
  }

    
  @JsonProperty("locLat")
  public Double getLocLat() {
    return locLat;
  }
  public void setLocLat(Double locLat) {
    this.locLat = locLat;
  }

    
  @JsonProperty("remark")
  public String getRemark() {
    return remark;
  }
  public void setRemark(String remark) {
    this.remark = remark;
  }

    
  @JsonProperty("locState")
  public String getLocState() {
    return locState;
  }
  public void setLocState(String locState) {
    this.locState = locState;
  }

    
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

    
  @JsonProperty("codriverIds")
  public List<Long> getCodriverIds() {
    return codriverIds;
  }
  public void setCodriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
