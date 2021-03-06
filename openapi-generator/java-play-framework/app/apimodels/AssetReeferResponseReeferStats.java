package apimodels;

import apimodels.AssetReeferResponseReeferStatsAlarms1;
import apimodels.AssetReeferResponseReeferStatsEngineHours;
import apimodels.AssetReeferResponseReeferStatsFuelPercentage;
import apimodels.AssetReeferResponseReeferStatsPowerStatus;
import apimodels.AssetReeferResponseReeferStatsReturnAirTemp;
import apimodels.AssetReeferResponseReeferStatsSetPoint;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * AssetReeferResponseReeferStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
    if (fuelPercentage == null) {
      fuelPercentage = new ArrayList<>();
    }
    fuelPercentage.add(fuelPercentageItem);
    return this;
  }

   /**
   * Fuel percentage of the reefer
   * @return fuelPercentage
  **/
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
    if (powerStatus == null) {
      powerStatus = new ArrayList<>();
    }
    powerStatus.add(powerStatusItem);
    return this;
  }

   /**
   * Power status of the reefer
   * @return powerStatus
  **/
  @Valid
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
    if (engineHours == null) {
      engineHours = new ArrayList<>();
    }
    engineHours.add(engineHoursItem);
    return this;
  }

   /**
   * Engine hours of the reefer
   * @return engineHours
  **/
  @Valid
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
    if (setPoint == null) {
      setPoint = new ArrayList<>();
    }
    setPoint.add(setPointItem);
    return this;
  }

   /**
   * Set point temperature of the reefer
   * @return setPoint
  **/
  @Valid
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
    if (returnAirTemp == null) {
      returnAirTemp = new ArrayList<>();
    }
    returnAirTemp.add(returnAirTempItem);
    return this;
  }

   /**
   * Return air temperature of the reefer
   * @return returnAirTemp
  **/
  @Valid
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
    if (alarms == null) {
      alarms = new ArrayList<>();
    }
    alarms.add(alarmsItem);
    return this;
  }

   /**
   * Reefer alarms
   * @return alarms
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

