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
  public class DocumentFieldType {
    /// <summary>
    /// Descriptive name of this field type.
    /// </summary>
    /// <value>Descriptive name of this field type.</value>
    [DataMember(Name="label", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "label")]
    public string Label { get; set; }

    /// <summary>
    /// Gets or Sets NumberValueTypeMetadata
    /// </summary>
    [DataMember(Name="numberValueTypeMetadata", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "numberValueTypeMetadata")]
    public DocumentFieldTypeNumberValueTypeMetadata NumberValueTypeMetadata { get; set; }

    /// <summary>
    /// The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
    /// </summary>
    /// <value>The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.</value>
    [DataMember(Name="valueType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "valueType")]
    public string ValueType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DocumentFieldType {\n");
      sb.Append("  Label: ").Append(Label).Append("\n");
      sb.Append("  NumberValueTypeMetadata: ").Append(NumberValueTypeMetadata).Append("\n");
      sb.Append("  ValueType: ").Append(ValueType).Append("\n");
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
