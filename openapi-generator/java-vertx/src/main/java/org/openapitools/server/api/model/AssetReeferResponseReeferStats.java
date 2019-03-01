package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.AssetReeferResponseReeferStatsAlarms1;
import org.openapitools.server.api.model.AssetReeferResponseReeferStatsEngineHours;
import org.openapitools.server.api.model.AssetReeferResponseReeferStatsFuelPercentage;
import org.openapitools.server.api.model.AssetReeferResponseReeferStatsPowerStatus;
import org.openapitools.server.api.model.AssetReeferResponseReeferStatsReturnAirTemp;
import org.openapitools.server.api.model.AssetReeferResponseReeferStatsSetPoint;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AssetReeferResponseReeferStats   {
  
  private List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage = new ArrayList<>();
  private List<AssetReeferResponseReeferStatsPowerStatus> powerStatus = new ArrayList<>();
  private List<AssetReeferResponseReeferStatsEngineHours> engineHours = new ArrayList<>();
  private List<AssetReeferResponseReeferStatsSetPoint> setPoint = new ArrayList<>();
  private List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp = new ArrayList<>();
  private List<AssetReeferResponseReeferStatsAlarms1> alarms = new ArrayList<>();

  public AssetReeferResponseReeferStats () {

  }

  public AssetReeferResponseReeferStats (List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage, List<AssetReeferResponseReeferStatsPowerStatus> powerStatus, List<AssetReeferResponseReeferStatsEngineHours> engineHours, List<AssetReeferResponseReeferStatsSetPoint> setPoint, List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp, List<AssetReeferResponseReeferStatsAlarms1> alarms) {
    this.fuelPercentage = fuelPercentage;
    this.powerStatus = powerStatus;
    this.engineHours = engineHours;
    this.setPoint = setPoint;
    this.returnAirTemp = returnAirTemp;
    this.alarms = alarms;
  }

    
  @JsonProperty("fuelPercentage")
  public List<AssetReeferResponseReeferStatsFuelPercentage> getFuelPercentage() {
    return fuelPercentage;
  }
  public void setFuelPercentage(List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
  }

    
  @JsonProperty("powerStatus")
  public List<AssetReeferResponseReeferStatsPowerStatus> getPowerStatus() {
    return powerStatus;
  }
  public void setPowerStatus(List<AssetReeferResponseReeferStatsPowerStatus> powerStatus) {
    this.powerStatus = powerStatus;
  }

    
  @JsonProperty("engineHours")
  public List<AssetReeferResponseReeferStatsEngineHours> getEngineHours() {
    return engineHours;
  }
  public void setEngineHours(List<AssetReeferResponseReeferStatsEngineHours> engineHours) {
    this.engineHours = engineHours;
  }

    
  @JsonProperty("setPoint")
  public List<AssetReeferResponseReeferStatsSetPoint> getSetPoint() {
    return setPoint;
  }
  public void setSetPoint(List<AssetReeferResponseReeferStatsSetPoint> setPoint) {
    this.setPoint = setPoint;
  }

    
  @JsonProperty("returnAirTemp")
  public List<AssetReeferResponseReeferStatsReturnAirTemp> getReturnAirTemp() {
    return returnAirTemp;
  }
  public void setReturnAirTemp(List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp) {
    this.returnAirTemp = returnAirTemp;
  }

    
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
