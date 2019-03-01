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
  public class InlineObject2 {
    /// <summary>
    /// The address of the entry to add, as it would be recognized if provided to maps.google.com.
    /// </summary>
    /// <value>The address of the entry to add, as it would be recognized if provided to maps.google.com.</value>
    [DataMember(Name="address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "address")]
    public string Address { get; set; }

    /// <summary>
    /// Group ID to query.
    /// </summary>
    /// <value>Group ID to query.</value>
    [DataMember(Name="groupId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "groupId")]
    public long? GroupId { get; set; }

    /// <summary>
    /// Name of the location to add to the address book.
    /// </summary>
    /// <value>Name of the location to add to the address book.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Radius in meters of the address (used for matching vehicle trip stops to this location).
    /// </summary>
    /// <value>Radius in meters of the address (used for matching vehicle trip stops to this location).</value>
    [DataMember(Name="radius", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "radius")]
    public int? Radius { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class InlineObject2 {\n");
      sb.Append("  Address: ").Append(Address).Append("\n");
      sb.Append("  GroupId: ").Append(GroupId).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Radius: ").Append(Radius).Append("\n");
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
