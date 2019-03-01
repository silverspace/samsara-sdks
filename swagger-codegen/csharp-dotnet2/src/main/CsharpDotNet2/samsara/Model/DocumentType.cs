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
  public class DocumentType {
    /// <summary>
    /// The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
    /// </summary>
    /// <value>The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.</value>
    [DataMember(Name="fieldTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fieldTypes")]
    public List<DocumentFieldTypes> FieldTypes { get; set; }

    /// <summary>
    /// Name of the document type.
    /// </summary>
    /// <value>Name of the document type.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// ID for the organization this document belongs to.
    /// </summary>
    /// <value>ID for the organization this document belongs to.</value>
    [DataMember(Name="orgId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "orgId")]
    public long? OrgId { get; set; }

    /// <summary>
    /// Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
    /// </summary>
    /// <value>Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.</value>
    [DataMember(Name="uuid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "uuid")]
    public string Uuid { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DocumentType {\n");
      sb.Append("  FieldTypes: ").Append(FieldTypes).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  OrgId: ").Append(OrgId).Append("\n");
      sb.Append("  Uuid: ").Append(Uuid).Append("\n");
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
