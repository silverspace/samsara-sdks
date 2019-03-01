using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class VehicleMaintenancePassengerDiagnosticTroubleCodes {
    /// <summary>
    /// Gets or Sets DtcDescription
    /// </summary>
    [DataMember(Name="dtcDescription", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dtcDescription")]
    public string DtcDescription { get; set; }

    /// <summary>
    /// Gets or Sets DtcId
    /// </summary>
    [DataMember(Name="dtcId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dtcId")]
    public int? DtcId { get; set; }

    /// <summary>
    /// Gets or Sets DtcShortCode
    /// </summary>
    [DataMember(Name="dtcShortCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dtcShortCode")]
    public string DtcShortCode { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class VehicleMaintenancePassengerDiagnosticTroubleCodes {\n");
      sb.Append("  DtcDescription: ").Append(DtcDescription).Append("\n");
      sb.Append("  DtcId: ").Append(DtcId).Append("\n");
      sb.Append("  DtcShortCode: ").Append(DtcShortCode).Append("\n");
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
