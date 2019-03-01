using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
  /// </summary>
  [DataContract]
  public class DocumentFieldTypeNumberValueTypeMetadata {
    /// <summary>
    /// Number of decimal places that values for this field type can have.
    /// </summary>
    /// <value>Number of decimal places that values for this field type can have.</value>
    [DataMember(Name="numDecimalPlaces", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "numDecimalPlaces")]
    public long? NumDecimalPlaces { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DocumentFieldTypeNumberValueTypeMetadata {\n");
      sb.Append("  NumDecimalPlaces: ").Append(NumDecimalPlaces).Append("\n");
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
