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
  public class JobUpdateObject {
    /// <summary>
    /// Timestamp that this event was updated, represented as Unix milliseconds since epoch.
    /// </summary>
    /// <value>Timestamp that this event was updated, represented as Unix milliseconds since epoch.</value>
    [DataMember(Name="changed_at_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "changed_at_ms")]
    public long? ChangedAtMs { get; set; }

    /// <summary>
    /// ID of the Samsara job.
    /// </summary>
    /// <value>ID of the Samsara job.</value>
    [DataMember(Name="job_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "job_id")]
    public long? JobId { get; set; }

    /// <summary>
    /// Gets or Sets JobState
    /// </summary>
    [DataMember(Name="job_state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "job_state")]
    public JobStatus JobState { get; set; }

    /// <summary>
    /// Gets or Sets PrevJobState
    /// </summary>
    [DataMember(Name="prev_job_state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "prev_job_state")]
    public PrevJobStatus PrevJobState { get; set; }

    /// <summary>
    /// Gets or Sets Route
    /// </summary>
    [DataMember(Name="route", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route")]
    public DispatchRoute Route { get; set; }

    /// <summary>
    /// ID of the Samsara dispatch route.
    /// </summary>
    /// <value>ID of the Samsara dispatch route.</value>
    [DataMember(Name="route_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_id")]
    public long? RouteId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class JobUpdateObject {\n");
      sb.Append("  ChangedAtMs: ").Append(ChangedAtMs).Append("\n");
      sb.Append("  JobId: ").Append(JobId).Append("\n");
      sb.Append("  JobState: ").Append(JobState).Append("\n");
      sb.Append("  PrevJobState: ").Append(PrevJobState).Append("\n");
      sb.Append("  Route: ").Append(Route).Append("\n");
      sb.Append("  RouteId: ").Append(RouteId).Append("\n");
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
