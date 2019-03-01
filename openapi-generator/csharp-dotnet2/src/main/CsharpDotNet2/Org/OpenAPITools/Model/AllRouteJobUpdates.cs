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
  public class AllRouteJobUpdates {
    /// <summary>
    /// Gets or Sets JobUpdates
    /// </summary>
    [DataMember(Name="job_updates", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "job_updates")]
    public List<JobUpdateObject> JobUpdates { get; set; }

    /// <summary>
    /// Sequence ID of the last update returned in the response
    /// </summary>
    /// <value>Sequence ID of the last update returned in the response</value>
    [DataMember(Name="sequence_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sequence_id")]
    public string SequenceId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AllRouteJobUpdates {\n");
      sb.Append("  JobUpdates: ").Append(JobUpdates).Append("\n");
      sb.Append("  SequenceId: ").Append(SequenceId).Append("\n");
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
