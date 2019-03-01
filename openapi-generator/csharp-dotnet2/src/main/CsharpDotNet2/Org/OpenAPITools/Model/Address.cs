using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Information about an address/geofence. Geofences are either a circle or a polygon.
  /// </summary>
  [DataContract]
  public class Address {
    /// <summary>
    /// Gets or Sets Contacts
    /// </summary>
    [DataMember(Name="contacts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "contacts")]
    public List<Contact> Contacts { get; set; }

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
    /// ID of the address
    /// </summary>
    /// <value>ID of the address</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public long? Id { get; set; }

    /// <summary>
    /// Name of the address or geofence
    /// </summary>
    /// <value>Name of the address or geofence</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Notes associated with an address.
    /// </summary>
    /// <value>Notes associated with an address.</value>
    [DataMember(Name="notes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notes")]
    public string Notes { get; set; }

    /// <summary>
    /// Gets or Sets Tags
    /// </summary>
    [DataMember(Name="tags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tags")]
    public List<TagMetadata> Tags { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Address {\n");
      sb.Append("  Contacts: ").Append(Contacts).Append("\n");
      sb.Append("  FormattedAddress: ").Append(FormattedAddress).Append("\n");
      sb.Append("  Geofence: ").Append(Geofence).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Notes: ").Append(Notes).Append("\n");
      sb.Append("  Tags: ").Append(Tags).Append("\n");
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
