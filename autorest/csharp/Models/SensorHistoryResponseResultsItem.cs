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

    public partial class SensorHistoryResponseResultsItem
    {
        /// <summary>
        /// Initializes a new instance of the SensorHistoryResponseResultsItem
        /// class.
        /// </summary>
        public SensorHistoryResponseResultsItem()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the SensorHistoryResponseResultsItem
        /// class.
        /// </summary>
        /// <param name="series">List of datapoints, one for each requested
        /// (sensor, field) pair.</param>
        /// <param name="timeMs">Timestamp in UNIX milliseconds.</param>
        public SensorHistoryResponseResultsItem(IList<long?> series = default(IList<long?>), int? timeMs = default(int?))
        {
            Series = series;
            TimeMs = timeMs;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets list of datapoints, one for each requested (sensor,
        /// field) pair.
        /// </summary>
        [JsonProperty(PropertyName = "series")]
        public IList<long?> Series { get; set; }

        /// <summary>
        /// Gets or sets timestamp in UNIX milliseconds.
        /// </summary>
        [JsonProperty(PropertyName = "timeMs")]
        public int? TimeMs { get; set; }

    }
}