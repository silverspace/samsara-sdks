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
  public class Document {
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
    /// Descriptive name of this type of document.
    /// </summary>
    /// <value>Descriptive name of this type of document.</value>
    [DataMember(Name="documentType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "documentType")]
    public string DocumentType { get; set; }

    /// <summary>
    /// The time in Unix epoch milliseconds that the document is created.
    /// </summary>
    /// <value>The time in Unix epoch milliseconds that the document is created.</value>
    [DataMember(Name="driverCreatedAtMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverCreatedAtMs")]
    public long? DriverCreatedAtMs { get; set; }

    /// <summary>
    /// ID of the driver for whom the document is submitted
    /// </summary>
    /// <value>ID of the driver for whom the document is submitted</value>
    [DataMember(Name="driverId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverId")]
    public long? DriverId { get; set; }

    /// <summary>
    /// The fields associated with this document.
    /// </summary>
    /// <value>The fields associated with this document.</value>
    [DataMember(Name="fields", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fields")]
    public List<DocumentField> Fields { get; set; }

    /// <summary>
    /// VehicleID of the driver at document creation.
    /// </summary>
    /// <value>VehicleID of the driver at document creation.</value>
    [DataMember(Name="vehicleId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleId")]
    public long? VehicleId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Document {\n");
      sb.Append("  DispatchJobId: ").Append(DispatchJobId).Append("\n");
      sb.Append("  Notes: ").Append(Notes).Append("\n");
      sb.Append("  DocumentType: ").Append(DocumentType).Append("\n");
      sb.Append("  DriverCreatedAtMs: ").Append(DriverCreatedAtMs).Append("\n");
      sb.Append("  DriverId: ").Append(DriverId).Append("\n");
      sb.Append("  Fields: ").Append(Fields).Append("\n");
      sb.Append("  VehicleId: ").Append(VehicleId).Append("\n");
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
