// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class DvirBaseTrailerDefectsItem
    {
        /// <summary>
        /// Initializes a new instance of the DvirBaseTrailerDefectsItem class.
        /// </summary>
        public DvirBaseTrailerDefectsItem()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DvirBaseTrailerDefectsItem class.
        /// </summary>
        /// <param name="comment">The comment describing the type of DVIR
        /// defect</param>
        /// <param name="defectType">The type of DVIR defect</param>
        public DvirBaseTrailerDefectsItem(string comment = default(string), string defectType = default(string))
        {
            Comment = comment;
            DefectType = defectType;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the comment describing the type of DVIR defect
        /// </summary>
        [JsonProperty(PropertyName = "comment")]
        public string Comment { get; set; }

        /// <summary>
        /// Gets or sets the type of DVIR defect
        /// </summary>
        [JsonProperty(PropertyName = "defectType")]
        public string DefectType { get; set; }

    }
}
