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
  public class DvirBaseTrailerDefects {
    /// <summary>
    /// The comment describing the type of DVIR defect
    /// </summary>
    /// <value>The comment describing the type of DVIR defect</value>
    [DataMember(Name="comment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "comment")]
    public string Comment { get; set; }

    /// <summary>
    /// The type of DVIR defect
    /// </summary>
    /// <value>The type of DVIR defect</value>
    [DataMember(Name="defectType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defectType")]
    public string DefectType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DvirBaseTrailerDefects {\n");
      sb.Append("  Comment: ").Append(Comment).Append("\n");
      sb.Append("  DefectType: ").Append(DefectType).Append("\n");
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
