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

    public partial class DispatchRouteHistory
    {
        /// <summary>
        /// Initializes a new instance of the DispatchRouteHistory class.
        /// </summary>
        public DispatchRouteHistory()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DispatchRouteHistory class.
        /// </summary>
        /// <param name="history">History of the route's state changes.</param>
        public DispatchRouteHistory(IList<DispatchRouteHistoricalEntry> history = default(IList<DispatchRouteHistoricalEntry>))
        {
            History = history;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets history of the route's state changes.
        /// </summary>
        [JsonProperty(PropertyName = "history")]
        public IList<DispatchRouteHistoricalEntry> History { get; set; }

    }
}
