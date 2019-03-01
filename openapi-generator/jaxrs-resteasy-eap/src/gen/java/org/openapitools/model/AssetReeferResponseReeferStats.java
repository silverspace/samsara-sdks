package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AssetReeferResponseReeferStatsAlarms1;
import org.openapitools.model.AssetReeferResponseReeferStatsEngineHours;
import org.openapitools.model.AssetReeferResponseReeferStatsFuelPercentage;
import org.openapitools.model.AssetReeferResponseReeferStatsPowerStatus;
import org.openapitools.model.AssetReeferResponseReeferStatsReturnAirTemp;
import org.openapitools.model.AssetReeferResponseReeferStatsSetPoint;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class AssetReeferResponseReeferStats   {
  

  private List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage = new ArrayList<AssetReeferResponseReeferStatsFuelPercentage>();

  private List<AssetReeferResponseReeferStatsPowerStatus> powerStatus = new ArrayList<AssetReeferResponseReeferStatsPowerStatus>();

  private List<AssetReeferResponseReeferStatsEngineHours> engineHours = new ArrayList<AssetReeferResponseReeferStatsEngineHours>();

  private List<AssetReeferResponseReeferStatsSetPoint> setPoint = new ArrayList<AssetReeferResponseReeferStatsSetPoint>();

  private List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp = new ArrayList<AssetReeferResponseReeferStatsReturnAirTemp>();

  private List<AssetReeferResponseReeferStatsAlarms1> alarms = new ArrayList<AssetReeferResponseReeferStatsAlarms1>();

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStats assetReeferResponseReeferStats = (AssetReeferResponseReeferStats) o;
    return Objects.equals(fuelPercentage, assetReeferResponseReeferStats.fuelPercentage) &&
        Objects.equals(powerStatus, assetReeferResponseReeferStats.powerStatus) &&
        Objects.equals(engineHours, assetReeferResponseReeferStats.engineHours) &&
        Objects.equals(setPoint, assetReeferResponseReeferStats.setPoint) &&
        Objects.equals(returnAirTemp, assetReeferResponseReeferStats.returnAirTemp) &&
        Objects.equals(alarms, assetReeferResponseReeferStats.alarms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fuelPercentage, powerStatus, engineHours, setPoint, returnAirTemp, alarms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStats {\n");
    
    sb.append("    fuelPercentage: ").append(toIndentedString(fuelPercentage)).append("\n");
    sb.append("    powerStatus: ").append(toIndentedString(powerStatus)).append("\n");
    sb.append("    engineHours: ").append(toIndentedString(engineHours)).append("\n");
    sb.append("    setPoint: ").append(toIndentedString(setPoint)).append("\n");
    sb.append("    returnAirTemp: ").append(toIndentedString(returnAirTemp)).append("\n");
    sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
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

