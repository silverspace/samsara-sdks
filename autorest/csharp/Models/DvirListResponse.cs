// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class DvirListResponse
    {
        /// <summary>
        /// Initializes a new instance of the DvirListResponse class.
        /// </summary>
        public DvirListResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DvirListResponse class.
        /// </summary>
        public DvirListResponse(IList<DvirBase> dvirs = default(IList<DvirBase>))
        {
            Dvirs = dvirs;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "dvirs")]
        public IList<DvirBase> Dvirs { get; set; }

    }
}
