package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssetReeferResponseReeferStatsAlarms1;
import io.swagger.model.AssetReeferResponseReeferStatsEngineHours;
import io.swagger.model.AssetReeferResponseReeferStatsFuelPercentage;
import io.swagger.model.AssetReeferResponseReeferStatsPowerStatus;
import io.swagger.model.AssetReeferResponseReeferStatsReturnAirTemp;
import io.swagger.model.AssetReeferResponseReeferStatsSetPoint;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class AssetReeferResponseReeferStats   {
  
  private List<AssetReeferResponseReeferStatsAlarms1> alarms = new ArrayList<AssetReeferResponseReeferStatsAlarms1>();
  private List<AssetReeferResponseReeferStatsEngineHours> engineHours = new ArrayList<AssetReeferResponseReeferStatsEngineHours>();
  private List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage = new ArrayList<AssetReeferResponseReeferStatsFuelPercentage>();
  private List<AssetReeferResponseReeferStatsPowerStatus> powerStatus = new ArrayList<AssetReeferResponseReeferStatsPowerStatus>();
  private List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp = new ArrayList<AssetReeferResponseReeferStatsReturnAirTemp>();
  private List<AssetReeferResponseReeferStatsSetPoint> setPoint = new ArrayList<AssetReeferResponseReeferStatsSetPoint>();

  /**
   * Reefer alarms
   **/
  
  @ApiModelProperty(value = "Reefer alarms")
  @JsonProperty("alarms")
  public List<AssetReeferResponseReeferStatsAlarms1> getAlarms() {
    return alarms;
  }
  public void setAlarms(List<AssetReeferResponseReeferStatsAlarms1> alarms) {
    this.alarms = alarms;
  }

  /**
   * Engine hours of the reefer
   **/
  
  @ApiModelProperty(value = "Engine hours of the reefer")
  @JsonProperty("engineHours")
  public List<AssetReeferResponseReeferStatsEngineHours> getEngineHours() {
    return engineHours;
  }
  public void setEngineHours(List<AssetReeferResponseReeferStatsEngineHours> engineHours) {
    this.engineHours = engineHours;
  }

  /**
   * Fuel percentage of the reefer
   **/
  
  @ApiModelProperty(value = "Fuel percentage of the reefer")
  @JsonProperty("fuelPercentage")
  public List<AssetReeferResponseReeferStatsFuelPercentage> getFuelPercentage() {
    return fuelPercentage;
  }
  public void setFuelPercentage(List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
  }

  /**
   * Power status of the reefer
   **/
  
  @ApiModelProperty(value = "Power status of the reefer")
  @JsonProperty("powerStatus")
  public List<AssetReeferResponseReeferStatsPowerStatus> getPowerStatus() {
    return powerStatus;
  }
  public void setPowerStatus(List<AssetReeferResponseReeferStatsPowerStatus> powerStatus) {
    this.powerStatus = powerStatus;
  }

  /**
   * Return air temperature of the reefer
   **/
  
  @ApiModelProperty(value = "Return air temperature of the reefer")
  @JsonProperty("returnAirTemp")
  public List<AssetReeferResponseReeferStatsReturnAirTemp> getReturnAirTemp() {
    return returnAirTemp;
  }
  public void setReturnAirTemp(List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp) {
    this.returnAirTemp = returnAirTemp;
  }

  /**
   * Set point temperature of the reefer
   **/
  
  @ApiModelProperty(value = "Set point temperature of the reefer")
  @JsonProperty("setPoint")
  public List<AssetReeferResponseReeferStatsSetPoint> getSetPoint() {
    return setPoint;
  }
  public void setSetPoint(List<AssetReeferResponseReeferStatsSetPoint> setPoint) {
    this.setPoint = setPoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStats assetReeferResponseReeferStats = (AssetReeferResponseReeferStats) o;
    return Objects.equals(alarms, assetReeferResponseReeferStats.alarms) &&
        Objects.equals(engineHours, assetReeferResponseReeferStats.engineHours) &&
        Objects.equals(fuelPercentage, assetReeferResponseReeferStats.fuelPercentage) &&
        Objects.equals(powerStatus, assetReeferResponseReeferStats.powerStatus) &&
        Objects.equals(returnAirTemp, assetReeferResponseReeferStats.returnAirTemp) &&
        Objects.equals(setPoint, assetReeferResponseReeferStats.setPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarms, engineHours, fuelPercentage, powerStatus, returnAirTemp, setPoint);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

