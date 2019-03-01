using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class AssetReeferResponseReeferStats {
    /// <summary>
    /// Fuel percentage of the reefer
    /// </summary>
    /// <value>Fuel percentage of the reefer</value>
    [DataMember(Name="fuelPercentage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fuelPercentage")]
    public List<AssetReeferResponseReeferStatsFuelPercentage> FuelPercentage { get; set; }

    /// <summary>
    /// Power status of the reefer
    /// </summary>
    /// <value>Power status of the reefer</value>
    [DataMember(Name="powerStatus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "powerStatus")]
    public List<AssetReeferResponseReeferStatsPowerStatus> PowerStatus { get; set; }

    /// <summary>
    /// Engine hours of the reefer
    /// </summary>
    /// <value>Engine hours of the reefer</value>
    [DataMember(Name="engineHours", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "engineHours")]
    public List<AssetReeferResponseReeferStatsEngineHours> EngineHours { get; set; }

    /// <summary>
    /// Set point temperature of the reefer
    /// </summary>
    /// <value>Set point temperature of the reefer</value>
    [DataMember(Name="setPoint", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "setPoint")]
    public List<AssetReeferResponseReeferStatsSetPoint> SetPoint { get; set; }

    /// <summary>
    /// Return air temperature of the reefer
    /// </summary>
    /// <value>Return air temperature of the reefer</value>
    [DataMember(Name="returnAirTemp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "returnAirTemp")]
    public List<AssetReeferResponseReeferStatsReturnAirTemp> ReturnAirTemp { get; set; }

    /// <summary>
    /// Reefer alarms
    /// </summary>
    /// <value>Reefer alarms</value>
    [DataMember(Name="alarms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "alarms")]
    public List<AssetReeferResponseReeferStatsAlarms1> Alarms { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AssetReeferResponseReeferStats {\n");
      sb.Append("  FuelPercentage: ").Append(FuelPercentage).Append("\n");
      sb.Append("  PowerStatus: ").Append(PowerStatus).Append("\n");
      sb.Append("  EngineHours: ").Append(EngineHours).Append("\n");
      sb.Append("  SetPoint: ").Append(SetPoint).Append("\n");
      sb.Append("  ReturnAirTemp: ").Append(ReturnAirTemp).Append("\n");
      sb.Append("  Alarms: ").Append(Alarms).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
