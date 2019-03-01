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
  public class DocumentCreate {
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
    /// Universally unique identifier for the document type this document is being created for.
    /// </summary>
    /// <value>Universally unique identifier for the document type this document is being created for.</value>
    [DataMember(Name="documentTypeUuid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "documentTypeUuid")]
    public string DocumentTypeUuid { get; set; }

    /// <summary>
    /// List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
    /// </summary>
    /// <value>List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</value>
    [DataMember(Name="fields", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fields")]
    public List<DocumentField> Fields { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DocumentCreate {\n");
      sb.Append("  DispatchJobId: ").Append(DispatchJobId).Append("\n");
      sb.Append("  Notes: ").Append(Notes).Append("\n");
      sb.Append("  DocumentTypeUuid: ").Append(DocumentTypeUuid).Append("\n");
      sb.Append("  Fields: ").Append(Fields).Append("\n");
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
