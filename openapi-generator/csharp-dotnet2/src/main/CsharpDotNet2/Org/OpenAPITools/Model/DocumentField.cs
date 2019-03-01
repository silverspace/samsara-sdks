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
  public class DocumentField {
    /// <summary>
    /// Value of this field if this document field has valueType: ValueType_Number.
    /// </summary>
    /// <value>Value of this field if this document field has valueType: ValueType_Number.</value>
    [DataMember(Name="numberValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "numberValue")]
    public double? NumberValue { get; set; }

    /// <summary>
    /// Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
    /// </summary>
    /// <value>Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.</value>
    [DataMember(Name="photoValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "photoValue")]
    public List<DocumentFieldCreatePhotoValue> PhotoValue { get; set; }

    /// <summary>
    /// Value of this field if this document field has valueType: ValueType_String.
    /// </summary>
    /// <value>Value of this field if this document field has valueType: ValueType_String.</value>
    [DataMember(Name="stringValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stringValue")]
    public string StringValue { get; set; }

    /// <summary>
    /// Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
    /// </summary>
    /// <value>Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.</value>
    [DataMember(Name="valueType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "valueType")]
    public string ValueType { get; set; }

    /// <summary>
    /// Descriptive name of this field.
    /// </summary>
    /// <value>Descriptive name of this field.</value>
    [DataMember(Name="label", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "label")]
    public string Label { get; set; }

    /// <summary>
    /// DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
    /// </summary>
    /// <value>DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.</value>
    [DataMember(Name="value", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "value")]
    public Object Value { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DocumentField {\n");
      sb.Append("  NumberValue: ").Append(NumberValue).Append("\n");
      sb.Append("  PhotoValue: ").Append(PhotoValue).Append("\n");
      sb.Append("  StringValue: ").Append(StringValue).Append("\n");
      sb.Append("  ValueType: ").Append(ValueType).Append("\n");
      sb.Append("  Label: ").Append(Label).Append("\n");
      sb.Append("  Value: ").Append(Value).Append("\n");
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
