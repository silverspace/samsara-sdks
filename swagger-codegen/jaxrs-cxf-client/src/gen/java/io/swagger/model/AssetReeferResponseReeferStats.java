package io.swagger.model;

import io.swagger.model.AssetReeferResponseReeferStatsAlarms1;
import io.swagger.model.AssetReeferResponseReeferStatsEngineHours;
import io.swagger.model.AssetReeferResponseReeferStatsFuelPercentage;
import io.swagger.model.AssetReeferResponseReeferStatsPowerStatus;
import io.swagger.model.AssetReeferResponseReeferStatsReturnAirTemp;
import io.swagger.model.AssetReeferResponseReeferStatsSetPoint;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AssetReeferResponseReeferStats  {
  
  @ApiModelProperty(value = "Reefer alarms")
 /**
   * Reefer alarms
  **/
  private List<AssetReeferResponseReeferStatsAlarms1> alarms = null;

  @ApiModelProperty(value = "Engine hours of the reefer")
 /**
   * Engine hours of the reefer
  **/
  private List<AssetReeferResponseReeferStatsEngineHours> engineHours = null;

  @ApiModelProperty(value = "Fuel percentage of the reefer")
 /**
   * Fuel percentage of the reefer
  **/
  private List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage = null;

  @ApiModelProperty(value = "Power status of the reefer")
 /**
   * Power status of the reefer
  **/
  private List<AssetReeferResponseReeferStatsPowerStatus> powerStatus = null;

  @ApiModelProperty(value = "Return air temperature of the reefer")
 /**
   * Return air temperature of the reefer
  **/
  private List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp = null;

  @ApiModelProperty(value = "Set point temperature of the reefer")
 /**
   * Set point temperature of the reefer
  **/
  private List<AssetReeferResponseReeferStatsSetPoint> setPoint = null;
 /**
   * Reefer alarms
   * @return alarms
  **/
  @JsonProperty("alarms")
  public List<AssetReeferResponseReeferStatsAlarms1> getAlarms() {
    return alarms;
  }

  public void setAlarms(List<AssetReeferResponseReeferStatsAlarms1> alarms) {
    this.alarms = alarms;
  }

  public AssetReeferResponseReeferStats alarms(List<AssetReeferResponseReeferStatsAlarms1> alarms) {
    this.alarms = alarms;
    return this;
  }

  public AssetReeferResponseReeferStats addAlarmsItem(AssetReeferResponseReeferStatsAlarms1 alarmsItem) {
    this.alarms.add(alarmsItem);
    return this;
  }

 /**
   * Engine hours of the reefer
   * @return engineHours
  **/
  @JsonProperty("engineHours")
  public List<AssetReeferResponseReeferStatsEngineHours> getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(List<AssetReeferResponseReeferStatsEngineHours> engineHours) {
    this.engineHours = engineHours;
  }

  public AssetReeferResponseReeferStats engineHours(List<AssetReeferResponseReeferStatsEngineHours> engineHours) {
    this.engineHours = engineHours;
    return this;
  }

  public AssetReeferResponseReeferStats addEngineHoursItem(AssetReeferResponseReeferStatsEngineHours engineHoursItem) {
    this.engineHours.add(engineHoursItem);
    return this;
  }

 /**
   * Fuel percentage of the reefer
   * @return fuelPercentage
  **/
  @JsonProperty("fuelPercentage")
  public List<AssetReeferResponseReeferStatsFuelPercentage> getFuelPercentage() {
    return fuelPercentage;
  }

  public void setFuelPercentage(List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
  }

  public AssetReeferResponseReeferStats fuelPercentage(List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
    return this;
  }

  public AssetReeferResponseReeferStats addFuelPercentageItem(AssetReeferResponseReeferStatsFuelPercentage fuelPercentageItem) {
    this.fuelPercentage.add(fuelPercentageItem);
    return this;
  }

 /**
   * Power status of the reefer
   * @return powerStatus
  **/
  @JsonProperty("powerStatus")
  public List<AssetReeferResponseReeferStatsPowerStatus> getPowerStatus() {
    return powerStatus;
  }

  public void setPowerStatus(List<AssetReeferResponseReeferStatsPowerStatus> powerStatus) {
    this.powerStatus = powerStatus;
  }

  public AssetReeferResponseReeferStats powerStatus(List<AssetReeferResponseReeferStatsPowerStatus> powerStatus) {
    this.powerStatus = powerStatus;
    return this;
  }

  public AssetReeferResponseReeferStats addPowerStatusItem(AssetReeferResponseReeferStatsPowerStatus powerStatusItem) {
    this.powerStatus.add(powerStatusItem);
    return this;
  }

 /**
   * Return air temperature of the reefer
   * @return returnAirTemp
  **/
  @JsonProperty("returnAirTemp")
  public List<AssetReeferResponseReeferStatsReturnAirTemp> getReturnAirTemp() {
    return returnAirTemp;
  }

  public void setReturnAirTemp(List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp) {
    this.returnAirTemp = returnAirTemp;
  }

  public AssetReeferResponseReeferStats returnAirTemp(List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp) {
    this.returnAirTemp = returnAirTemp;
    return this;
  }

  public AssetReeferResponseReeferStats addReturnAirTempItem(AssetReeferResponseReeferStatsReturnAirTemp returnAirTempItem) {
    this.returnAirTemp.add(returnAirTempItem);
    return this;
  }

 /**
   * Set point temperature of the reefer
   * @return setPoint
  **/
  @JsonProperty("setPoint")
  public List<AssetReeferResponseReeferStatsSetPoint> getSetPoint() {
    return setPoint;
  }

  public void setSetPoint(List<AssetReeferResponseReeferStatsSetPoint> setPoint) {
    this.setPoint = setPoint;
  }

  public AssetReeferResponseReeferStats setPoint(List<AssetReeferResponseReeferStatsSetPoint> setPoint) {
    this.setPoint = setPoint;
    return this;
  }

  public AssetReeferResponseReeferStats addSetPointItem(AssetReeferResponseReeferStatsSetPoint setPointItem) {
    this.setPoint.add(setPointItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStats {\n");
    
    sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
    sb.append("    engineHours: ").append(toIndentedString(engineHours)).append("\n");
    sb.append("    fuelPercentage: ").append(toIndentedString(fuelPercentage)).append("\n");
    sb.append("    powerStatus: ").append(toIndentedString(powerStatus)).append("\n");
    sb.append("    returnAirTemp: ").append(toIndentedString(returnAirTemp)).append("\n");
    sb.append("    setPoint: ").append(toIndentedString(setPoint)).append("\n");
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

