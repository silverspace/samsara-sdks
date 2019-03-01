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
  public class DocumentBase {
    /// <summary>
    /// ID of the Samsara dispatch job for which the document is submitted
    /// </summary>
    /// <value>ID of the Samsara dispatch job for which the document is submitted</value>
    [DataMember(Name="dispatchJobId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dispatchJobId")]
    public long? DispatchJobId { get; set; }

    /// <summary>
    /// Notes submitted with this document.
    /// </summary>
    /// <value>Notes submitted with this document.</value>
    [DataMember(Name="notes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notes")]
    public string Notes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DocumentBase {\n");
      sb.Append("  DispatchJobId: ").Append(DispatchJobId).Append("\n");
      sb.Append("  Notes: ").Append(Notes).Append("\n");
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
