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

    public partial class DriversSummaryResponse
    {
        /// <summary>
        /// Initializes a new instance of the DriversSummaryResponse class.
        /// </summary>
        public DriversSummaryResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DriversSummaryResponse class.
        /// </summary>
        public DriversSummaryResponse(IList<DriversSummaryResponseSummariesItem> summaries = default(IList<DriversSummaryResponseSummariesItem>))
        {
            Summaries = summaries;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Summaries")]
        public IList<DriversSummaryResponseSummariesItem> Summaries { get; set; }

    }
}
