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
  public class Pagination {
    /// <summary>
    /// Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
    /// </summary>
    /// <value>Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.</value>
    [DataMember(Name="endCursor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "endCursor")]
    public string EndCursor { get; set; }

    /// <summary>
    /// True if there are more pages of results after this response.
    /// </summary>
    /// <value>True if there are more pages of results after this response.</value>
    [DataMember(Name="hasNextPage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hasNextPage")]
    public bool? HasNextPage { get; set; }

    /// <summary>
    /// True if there are more pages of results before this response.
    /// </summary>
    /// <value>True if there are more pages of results before this response.</value>
    [DataMember(Name="hasPrevPage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hasPrevPage")]
    public bool? HasPrevPage { get; set; }

    /// <summary>
    /// Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
    /// </summary>
    /// <value>Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.</value>
    [DataMember(Name="startCursor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startCursor")]
    public string StartCursor { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Pagination {\n");
      sb.Append("  EndCursor: ").Append(EndCursor).Append("\n");
      sb.Append("  HasNextPage: ").Append(HasNextPage).Append("\n");
      sb.Append("  HasPrevPage: ").Append(HasPrevPage).Append("\n");
      sb.Append("  StartCursor: ").Append(StartCursor).Append("\n");
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
