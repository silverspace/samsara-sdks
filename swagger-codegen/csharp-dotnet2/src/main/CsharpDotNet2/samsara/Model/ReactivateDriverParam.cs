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
  public class ReactivateDriverParam {
    /// <summary>
    /// True indicates that this driver should be reactivated.
    /// </summary>
    /// <value>True indicates that this driver should be reactivated.</value>
    [DataMember(Name="reactivate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "reactivate")]
    public bool? Reactivate { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ReactivateDriverParam {\n");
      sb.Append("  Reactivate: ").Append(Reactivate).Append("\n");
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
