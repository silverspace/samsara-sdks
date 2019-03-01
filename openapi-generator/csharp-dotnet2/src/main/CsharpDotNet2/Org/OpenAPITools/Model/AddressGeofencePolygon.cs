using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Information about a polygon geofence. This field is only populated if the geofence is a polygon.
  /// </summary>
  [DataContract]
  public class AddressGeofencePolygon {
    /// <summary>
    /// The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
    /// </summary>
    /// <value>The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.</value>
    [DataMember(Name="vertices", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vertices")]
    public List<AddressGeofencePolygonVertices> Vertices { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AddressGeofencePolygon {\n");
      sb.Append("  Vertices: ").Append(Vertices).Append("\n");
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
