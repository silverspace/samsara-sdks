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
  public class AddressesAddresses {
    /// <summary>
    /// Notes associated with an address.
    /// </summary>
    /// <value>Notes associated with an address.</value>
    [DataMember(Name="notes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notes")]
    public string Notes { get; set; }

    /// <summary>
    /// The full address associated with this address/geofence, as it might be recognized by maps.google.com
    /// </summary>
    /// <value>The full address associated with this address/geofence, as it might be recognized by maps.google.com</value>
    [DataMember(Name="formattedAddress", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "formattedAddress")]
    public string FormattedAddress { get; set; }

    /// <summary>
    /// Gets or Sets Geofence
    /// </summary>
    [DataMember(Name="geofence", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "geofence")]
    public AddressGeofence Geofence { get; set; }

    /// <summary>
    /// A list of tag IDs.
    /// </summary>
    /// <value>A list of tag IDs.</value>
    [DataMember(Name="tagIds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tagIds")]
    public List<long?> TagIds { get; set; }

    /// <summary>
    /// The name of this address/geofence
    /// </summary>
    /// <value>The name of this address/geofence</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// A list of IDs for contact book entries.
    /// </summary>
    /// <value>A list of IDs for contact book entries.</value>
    [DataMember(Name="contactIds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "contactIds")]
    public List<long?> ContactIds { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AddressesAddresses {\n");
      sb.Append("  Notes: ").Append(Notes).Append("\n");
      sb.Append("  FormattedAddress: ").Append(FormattedAddress).Append("\n");
      sb.Append("  Geofence: ").Append(Geofence).Append("\n");
      sb.Append("  TagIds: ").Append(TagIds).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  ContactIds: ").Append(ContactIds).Append("\n");
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
