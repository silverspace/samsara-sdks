package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssetReeferResponseReeferStatsAlarms1;
import io.swagger.model.AssetReeferResponseReeferStatsEngineHours;
import io.swagger.model.AssetReeferResponseReeferStatsFuelPercentage;
import io.swagger.model.AssetReeferResponseReeferStatsPowerStatus;
import io.swagger.model.AssetReeferResponseReeferStatsReturnAirTemp;
import io.swagger.model.AssetReeferResponseReeferStatsSetPoint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssetReeferResponseReeferStats
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class AssetReeferResponseReeferStats   {
  @JsonProperty("alarms")
  @Valid
  private List<AssetReeferResponseReeferStatsAlarms1> alarms = null;

  @JsonProperty("engineHours")
  @Valid
  private List<AssetReeferResponseReeferStatsEngineHours> engineHours = null;

  @JsonProperty("fuelPercentage")
  @Valid
  private List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage = null;

  @JsonProperty("powerStatus")
  @Valid
  private List<AssetReeferResponseReeferStatsPowerStatus> powerStatus = null;

  @JsonProperty("returnAirTemp")
  @Valid
  private List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp = null;

  @JsonProperty("setPoint")
  @Valid
  private List<AssetReeferResponseReeferStatsSetPoint> setPoint = null;

  public AssetReeferResponseReeferStats alarms(List<AssetReeferResponseReeferStatsAlarms1> alarms) {
    this.alarms = alarms;
    return this;
  }

  public AssetReeferResponseReeferStats addAlarmsItem(AssetReeferResponseReeferStatsAlarms1 alarmsItem) {
    if (this.alarms == null) {
      this.alarms = new ArrayList<AssetReeferResponseReeferStatsAlarms1>();
    }
    this.alarms.add(alarmsItem);
    return this;
  }

  /**
   * Reefer alarms
   * @return alarms
  **/
  @ApiModelProperty(value = "Reefer alarms")

  @Valid

  public List<AssetReeferResponseReeferStatsAlarms1> getAlarms() {
    return alarms;
  }

  public void setAlarms(List<AssetReeferResponseReeferStatsAlarms1> alarms) {
    this.alarms = alarms;
  }

  public AssetReeferResponseReeferStats engineHours(List<AssetReeferResponseReeferStatsEngineHours> engineHours) {
    this.engineHours = engineHours;
    return this;
  }

  public AssetReeferResponseReeferStats addEngineHoursItem(AssetReeferResponseReeferStatsEngineHours engineHoursItem) {
    if (this.engineHours == null) {
      this.engineHours = new ArrayList<AssetReeferResponseReeferStatsEngineHours>();
    }
    this.engineHours.add(engineHoursItem);
    return this;
  }

  /**
   * Engine hours of the reefer
   * @return engineHours
  **/
  @ApiModelProperty(value = "Engine hours of the reefer")

  @Valid

  public List<AssetReeferResponseReeferStatsEngineHours> getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(List<AssetReeferResponseReeferStatsEngineHours> engineHours) {
    this.engineHours = engineHours;
  }

  public AssetReeferResponseReeferStats fuelPercentage(List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
    return this;
  }

  public AssetReeferResponseReeferStats addFuelPercentageItem(AssetReeferResponseReeferStatsFuelPercentage fuelPercentageItem) {
    if (this.fuelPercentage == null) {
      this.fuelPercentage = new ArrayList<AssetReeferResponseReeferStatsFuelPercentage>();
    }
    this.fuelPercentage.add(fuelPercentageItem);
    return this;
  }

  /**
   * Fuel percentage of the reefer
   * @return fuelPercentage
  **/
  @ApiModelProperty(value = "Fuel percentage of the reefer")

  @Valid

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
      this.powerStatus = new ArrayList<AssetReeferResponseReeferStatsPowerStatus>();
    }
    this.powerStatus.add(powerStatusItem);
    return this;
  }

  /**
   * Power status of the reefer
   * @return powerStatus
  **/
  @ApiModelProperty(value = "Power status of the reefer")

  @Valid

  public List<AssetReeferResponseReeferStatsPowerStatus> getPowerStatus() {
    return powerStatus;
  }

  public void setPowerStatus(List<AssetReeferResponseReeferStatsPowerStatus> powerStatus) {
    this.powerStatus = powerStatus;
  }

  public AssetReeferResponseReeferStats returnAirTemp(List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp) {
    this.returnAirTemp = returnAirTemp;
    return this;
  }

  public AssetReeferResponseReeferStats addReturnAirTempItem(AssetReeferResponseReeferStatsReturnAirTemp returnAirTempItem) {
    if (this.returnAirTemp == null) {
      this.returnAirTemp = new ArrayList<AssetReeferResponseReeferStatsReturnAirTemp>();
    }
    this.returnAirTemp.add(returnAirTempItem);
    return this;
  }

  /**
   * Return air temperature of the reefer
   * @return returnAirTemp
  **/
  @ApiModelProperty(value = "Return air temperature of the reefer")

  @Valid

  public List<AssetReeferResponseReeferStatsReturnAirTemp> getReturnAirTemp() {
    return returnAirTemp;
  }

  public void setReturnAirTemp(List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp) {
    this.returnAirTemp = returnAirTemp;
  }

  public AssetReeferResponseReeferStats setPoint(List<AssetReeferResponseReeferStatsSetPoint> setPoint) {
    this.setPoint = setPoint;
    return this;
  }

  public AssetReeferResponseReeferStats addSetPointItem(AssetReeferResponseReeferStatsSetPoint setPointItem) {
    if (this.setPoint == null) {
      this.setPoint = new ArrayList<AssetReeferResponseReeferStatsSetPoint>();
    }
    this.setPoint.add(setPointItem);
    return this;
  }

  /**
   * Set point temperature of the reefer
   * @return setPoint
  **/
  @ApiModelProperty(value = "Set point temperature of the reefer")

  @Valid

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
    return Objects.equals(this.alarms, assetReeferResponseReeferStats.alarms) &&
        Objects.equals(this.engineHours, assetReeferResponseReeferStats.engineHours) &&
        Objects.equals(this.fuelPercentage, assetReeferResponseReeferStats.fuelPercentage) &&
        Objects.equals(this.powerStatus, assetReeferResponseReeferStats.powerStatus) &&
        Objects.equals(this.returnAirTemp, assetReeferResponseReeferStats.returnAirTemp) &&
        Objects.equals(this.setPoint, assetReeferResponseReeferStats.setPoint);
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

