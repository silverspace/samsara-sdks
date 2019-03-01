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
  public class VehicleMaintenanceJ1939DiagnosticTroubleCodes {
    /// <summary>
    /// Gets or Sets FmiId
    /// </summary>
    [DataMember(Name="fmiId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fmiId")]
    public int? FmiId { get; set; }

    /// <summary>
    /// Gets or Sets FmiText
    /// </summary>
    [DataMember(Name="fmiText", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fmiText")]
    public string FmiText { get; set; }

    /// <summary>
    /// Gets or Sets OccurrenceCount
    /// </summary>
    [DataMember(Name="occurrenceCount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "occurrenceCount")]
    public int? OccurrenceCount { get; set; }

    /// <summary>
    /// Gets or Sets SpnDescription
    /// </summary>
    [DataMember(Name="spnDescription", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "spnDescription")]
    public string SpnDescription { get; set; }

    /// <summary>
    /// Gets or Sets SpnId
    /// </summary>
    [DataMember(Name="spnId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "spnId")]
    public int? SpnId { get; set; }

    /// <summary>
    /// Gets or Sets TxId
    /// </summary>
    [DataMember(Name="txId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "txId")]
    public int? TxId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class VehicleMaintenanceJ1939DiagnosticTroubleCodes {\n");
      sb.Append("  FmiId: ").Append(FmiId).Append("\n");
      sb.Append("  FmiText: ").Append(FmiText).Append("\n");
      sb.Append("  OccurrenceCount: ").Append(OccurrenceCount).Append("\n");
      sb.Append("  SpnDescription: ").Append(SpnDescription).Append("\n");
      sb.Append("  SpnId: ").Append(SpnId).Append("\n");
      sb.Append("  TxId: ").Append(TxId).Append("\n");
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
