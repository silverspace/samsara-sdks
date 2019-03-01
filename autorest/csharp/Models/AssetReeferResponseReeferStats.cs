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

    public partial class AssetReeferResponseReeferStats
    {
        /// <summary>
        /// Initializes a new instance of the AssetReeferResponseReeferStats
        /// class.
        /// </summary>
        public AssetReeferResponseReeferStats()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the AssetReeferResponseReeferStats
        /// class.
        /// </summary>
        /// <param name="alarms">Reefer alarms</param>
        /// <param name="engineHours">Engine hours of the reefer</param>
        /// <param name="fuelPercentage">Fuel percentage of the reefer</param>
        /// <param name="powerStatus">Power status of the reefer</param>
        /// <param name="returnAirTemp">Return air temperature of the
        /// reefer</param>
        /// <param name="setPoint">Set point temperature of the reefer</param>
        public AssetReeferResponseReeferStats(IList<AssetReeferResponseReeferStatsAlarmsItem> alarms = default(IList<AssetReeferResponseReeferStatsAlarmsItem>), IList<AssetReeferResponseReeferStatsEngineHoursItem> engineHours = default(IList<AssetReeferResponseReeferStatsEngineHoursItem>), IList<AssetReeferResponseReeferStatsFuelPercentageItem> fuelPercentage = default(IList<AssetReeferResponseReeferStatsFuelPercentageItem>), IList<AssetReeferResponseReeferStatsPowerStatusItem> powerStatus = default(IList<AssetReeferResponseReeferStatsPowerStatusItem>), IList<AssetReeferResponseReeferStatsReturnAirTempItem> returnAirTemp = default(IList<AssetReeferResponseReeferStatsReturnAirTempItem>), IList<AssetReeferResponseReeferStatsSetPointItem> setPoint = default(IList<AssetReeferResponseReeferStatsSetPointItem>))
        {
            Alarms = alarms;
            EngineHours = engineHours;
            FuelPercentage = fuelPercentage;
            PowerStatus = powerStatus;
            ReturnAirTemp = returnAirTemp;
            SetPoint = setPoint;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets reefer alarms
        /// </summary>
        [JsonProperty(PropertyName = "alarms")]
        public IList<AssetReeferResponseReeferStatsAlarmsItem> Alarms { get; set; }

        /// <summary>
        /// Gets or sets engine hours of the reefer
        /// </summary>
        [JsonProperty(PropertyName = "engineHours")]
        public IList<AssetReeferResponseReeferStatsEngineHoursItem> EngineHours { get; set; }

        /// <summary>
        /// Gets or sets fuel percentage of the reefer
        /// </summary>
        [JsonProperty(PropertyName = "fuelPercentage")]
        public IList<AssetReeferResponseReeferStatsFuelPercentageItem> FuelPercentage { get; set; }

        /// <summary>
        /// Gets or sets power status of the reefer
        /// </summary>
        [JsonProperty(PropertyName = "powerStatus")]
        public IList<AssetReeferResponseReeferStatsPowerStatusItem> PowerStatus { get; set; }

        /// <summary>
        /// Gets or sets return air temperature of the reefer
        /// </summary>
        [JsonProperty(PropertyName = "returnAirTemp")]
        public IList<AssetReeferResponseReeferStatsReturnAirTempItem> ReturnAirTemp { get; set; }

        /// <summary>
        /// Gets or sets set point temperature of the reefer
        /// </summary>
        [JsonProperty(PropertyName = "setPoint")]
        public IList<AssetReeferResponseReeferStatsSetPointItem> SetPoint { get; set; }

    }
}