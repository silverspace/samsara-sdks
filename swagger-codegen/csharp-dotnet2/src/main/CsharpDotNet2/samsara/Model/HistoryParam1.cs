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
  public class HistoryParam1 {
    /// <summary>
    /// End of the time range, specified in milliseconds UNIX time.
    /// </summary>
    /// <value>End of the time range, specified in milliseconds UNIX time.</value>
    [DataMember(Name="endMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "endMs")]
    public int? EndMs { get; set; }

    /// <summary>
    /// Gets or Sets FillMissing
    /// </summary>
    [DataMember(Name="fillMissing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fillMissing")]
    public string FillMissing { get; set; }

    /// <summary>
    /// Group ID to query.
    /// </summary>
    /// <value>Group ID to query.</value>
    [DataMember(Name="groupId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "groupId")]
    public long? GroupId { get; set; }

    /// <summary>
    /// Gets or Sets Series
    /// </summary>
    [DataMember(Name="series", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "series")]
    public List<SensorshistorySeries> Series { get; set; }

    /// <summary>
    /// Beginning of the time range, specified in milliseconds UNIX time.
    /// </summary>
    /// <value>Beginning of the time range, specified in milliseconds UNIX time.</value>
    [DataMember(Name="startMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startMs")]
    public int? StartMs { get; set; }

    /// <summary>
    /// Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
    /// </summary>
    /// <value>Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.</value>
    [DataMember(Name="stepMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stepMs")]
    public int? StepMs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class HistoryParam1 {\n");
      sb.Append("  EndMs: ").Append(EndMs).Append("\n");
      sb.Append("  FillMissing: ").Append(FillMissing).Append("\n");
      sb.Append("  GroupId: ").Append(GroupId).Append("\n");
      sb.Append("  Series: ").Append(Series).Append("\n");
      sb.Append("  StartMs: ").Append(StartMs).Append("\n");
      sb.Append("  StepMs: ").Append(StepMs).Append("\n");
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
