// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class TemperatureResponseSensorsItem
    {
        /// <summary>
        /// Initializes a new instance of the TemperatureResponseSensorsItem
        /// class.
        /// </summary>
        public TemperatureResponseSensorsItem()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the TemperatureResponseSensorsItem
        /// class.
        /// </summary>
        /// <param name="ambientTemperature">Currently reported ambient
        /// temperature in millidegrees celsius.</param>
        /// <param name="id">ID of the sensor.</param>
        /// <param name="name">Name of the sensor.</param>
        /// <param name="probeTemperature">Currently reported probe temperature
        /// in millidegrees celsius. If no probe is connected, this parameter
        /// will not be reported.</param>
        public TemperatureResponseSensorsItem(int? ambientTemperature = default(int?), long? id = default(long?), string name = default(string), int? probeTemperature = default(int?))
        {
            AmbientTemperature = ambientTemperature;
            Id = id;
            Name = name;
            ProbeTemperature = probeTemperature;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets currently reported ambient temperature in millidegrees
        /// celsius.
        /// </summary>
        [JsonProperty(PropertyName = "ambientTemperature")]
        public int? AmbientTemperature { get; set; }

        /// <summary>
        /// Gets or sets ID of the sensor.
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public long? Id { get; set; }

        /// <summary>
        /// Gets or sets name of the sensor.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets currently reported probe temperature in millidegrees
        /// celsius. If no probe is connected, this parameter will not be
        /// reported.
        /// </summary>
        [JsonProperty(PropertyName = "probeTemperature")]
        public int? ProbeTemperature { get; set; }

    }
}
