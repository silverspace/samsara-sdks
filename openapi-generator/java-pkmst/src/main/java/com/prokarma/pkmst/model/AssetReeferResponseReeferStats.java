package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AssetReeferResponseReeferStatsAlarms1;
import com.prokarma.pkmst.model.AssetReeferResponseReeferStatsEngineHours;
import com.prokarma.pkmst.model.AssetReeferResponseReeferStatsFuelPercentage;
import com.prokarma.pkmst.model.AssetReeferResponseReeferStatsPowerStatus;
import com.prokarma.pkmst.model.AssetReeferResponseReeferStatsReturnAirTemp;
import com.prokarma.pkmst.model.AssetReeferResponseReeferStatsSetPoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AssetReeferResponseReeferStats
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class AssetReeferResponseReeferStats   {
  @JsonProperty("fuelPercentage")
  
  private List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage = null;

  @JsonProperty("powerStatus")
  
  private List<AssetReeferResponseReeferStatsPowerStatus> powerStatus = null;

  @JsonProperty("engineHours")
  
  private List<AssetReeferResponseReeferStatsEngineHours> engineHours = null;

  @JsonProperty("setPoint")
  
  private List<AssetReeferResponseReeferStatsSetPoint> setPoint = null;

  @JsonProperty("returnAirTemp")
  
  private List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp = null;

  @JsonProperty("alarms")
  
  private List<AssetReeferResponseReeferStatsAlarms1> alarms = null;

  public AssetReeferResponseReeferStats fuelPercentage(List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
    return this;
  }

  public AssetReeferResponseReeferStats addFuelPercentageItem(AssetReeferResponseReeferStatsFuelPercentage fuelPercentageItem) {
    if (this.fuelPercentage == null) {
      this.fuelPercentage = new ArrayList<>();
    }
    this.fuelPercentage.add(fuelPercentageItem);
    return this;
  }

   /**
   * Fuel percentage of the reefer
   * @return fuelPercentage
  **/
  @ApiModelProperty(value = "Fuel percentage of the reefer")
  public List<AssetReeferResponseReeferStatsFuelPercentage> getFuelPercentage() {
    return fuelPercentage;
  }

  public void setFuelPercentage(List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
  }

  public AssetReeferResponseReeferStats powerStatus(List<AssetReeferResponseReeferStatsPowerStatus> powerStatus) {
    this.powerStatus = powerStatus;
    return this;
  }

  public AssetReeferResponseReeferStats addPowerStatusItem(AssetReeferResponseReeferStatsPowerStatus powerStatusItem) {
    if (this.powerStatus == null) {
      this.powerStatus = new ArrayList<>();
    }
    this.powerStatus.add(powerStatusItem);
    return this;
  }

   /**
   * Power status of the reefer
   * @return powerStatus
  **/
  @ApiModelProperty(value = "Power status of the reefer")
  public List<AssetReeferResponseReeferStatsPowerStatus> getPowerStatus() {
    return powerStatus;
  }

  public void setPowerStatus(List<AssetReeferResponseReeferStatsPowerStatus> powerStatus) {
    this.powerStatus = powerStatus;
  }

  public AssetReeferResponseReeferStats engineHours(List<AssetReeferResponseReeferStatsEngineHours> engineHours) {
    this.engineHours = engineHours;
    return this;
  }

  public AssetReeferResponseReeferStats addEngineHoursItem(AssetReeferResponseReeferStatsEngineHours engineHoursItem) {
    if (this.engineHours == null) {
      this.engineHours = new ArrayList<>();
    }
    this.engineHours.add(engineHoursItem);
    return this;
  }

   /**
   * Engine hours of the reefer
   * @return engineHours
  **/
  @ApiModelProperty(value = "Engine hours of the reefer")
  public List<AssetReeferResponseReeferStatsEngineHours> getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(List<AssetReeferResponseReeferStatsEngineHours> engineHours) {
    this.engineHours = engineHours;
  }

  public AssetReeferResponseReeferStats setPoint(List<AssetReeferResponseReeferStatsSetPoint> setPoint) {
    this.setPoint = setPoint;
    return this;
  }

  public AssetReeferResponseReeferStats addSetPointItem(AssetReeferResponseReeferStatsSetPoint setPointItem) {
    if (this.setPoint == null) {
      this.setPoint = new ArrayList<>();
    }
    this.setPoint.add(setPointItem);
    return this;
  }

   /**
   * Set point temperature of the reefer
   * @return setPoint
  **/
  @ApiModelProperty(value = "Set point temperature of the reefer")
  public List<AssetReeferResponseReeferStatsSetPoint> getSetPoint() {
    return setPoint;
  }

  public void setSetPoint(List<AssetReeferResponseReeferStatsSetPoint> setPoint) {
    this.setPoint = setPoint;
  }

  public AssetReeferResponseReeferStats returnAirTemp(List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp) {
    this.returnAirTemp = returnAirTemp;
    return this;
  }

  public AssetReeferResponseReeferStats addReturnAirTempItem(AssetReeferResponseReeferStatsReturnAirTemp returnAirTempItem) {
    if (this.returnAirTemp == null) {
      this.returnAirTemp = new ArrayList<>();
    }
    this.returnAirTemp.add(returnAirTempItem);
    return this;
  }

   /**
   * Return air temperature of the reefer
   * @return returnAirTemp
  **/
  @ApiModelProperty(value = "Return air temperature of the reefer")
  public List<AssetReeferResponseReeferStatsReturnAirTemp> getReturnAirTemp() {
    return returnAirTemp;
  }

  public void setReturnAirTemp(List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp) {
    this.returnAirTemp = returnAirTemp;
  }

  public AssetReeferResponseReeferStats alarms(List<AssetReeferResponseReeferStatsAlarms1> alarms) {
    this.alarms = alarms;
    return this;
  }

  public AssetReeferResponseReeferStats addAlarmsItem(AssetReeferResponseReeferStatsAlarms1 alarmsItem) {
    if (this.alarms == null) {
      this.alarms = new ArrayList<>();
    }
    this.alarms.add(alarmsItem);
    return this;
  }

   /**
   * Reefer alarms
   * @return alarms
  **/
  @ApiModelProperty(value = "Reefer alarms")
  public List<AssetReeferResponseReeferStatsAlarms1> getAlarms() {
    return alarms;
  }

  public void setAlarms(List<AssetReeferResponseReeferStatsAlarms1> alarms) {
    this.alarms = alarms;
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
    return Objects.equals(this.fuelPercentage, assetReeferResponseReeferStats.fuelPercentage) &&
        Objects.equals(this.powerStatus, assetReeferResponseReeferStats.powerStatus) &&
        Objects.equals(this.engineHours, assetReeferResponseReeferStats.engineHours) &&
        Objects.equals(this.setPoint, assetReeferResponseReeferStats.setPoint) &&
        Objects.equals(this.returnAirTemp, assetReeferResponseReeferStats.returnAirTemp) &&
        Objects.equals(this.alarms, assetReeferResponseReeferStats.alarms);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

