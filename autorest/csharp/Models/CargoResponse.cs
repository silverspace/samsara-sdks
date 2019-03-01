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
    /// Contains the current cargo status of a sensor.
    /// </summary>
    public partial class CargoResponse
    {
        /// <summary>
        /// Initializes a new instance of the CargoResponse class.
        /// </summary>
        public CargoResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the CargoResponse class.
        /// </summary>
        public CargoResponse(long? groupId = default(long?), IList<CargoResponseSensorsItem> sensors = default(IList<CargoResponseSensorsItem>))
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
        public IList<CargoResponseSensorsItem> Sensors { get; set; }

    }
}