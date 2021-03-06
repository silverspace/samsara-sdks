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

    /// <summary>
    /// Contains the current humidity of a sensor.
    /// </summary>
    public partial class HumidityResponse
    {
        /// <summary>
        /// Initializes a new instance of the HumidityResponse class.
        /// </summary>
        public HumidityResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the HumidityResponse class.
        /// </summary>
        public HumidityResponse(long? groupId = default(long?), IList<HumidityResponseSensorsItem> sensors = default(IList<HumidityResponseSensorsItem>))
        {
            GroupId = groupId;
            Sensors = sensors;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "groupId")]
        public long? GroupId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "sensors")]
        public IList<HumidityResponseSensorsItem> Sensors { get; set; }

    }
}
