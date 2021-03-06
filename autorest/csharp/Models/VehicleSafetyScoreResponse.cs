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
    /// Safety score details for a vehicle
    /// </summary>
    public partial class VehicleSafetyScoreResponse
    {
        /// <summary>
        /// Initializes a new instance of the VehicleSafetyScoreResponse class.
        /// </summary>
        public VehicleSafetyScoreResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the VehicleSafetyScoreResponse class.
        /// </summary>
        /// <param name="crashCount">Crash event count</param>
        /// <param name="harshAccelCount">Harsh acceleration event
        /// count</param>
        /// <param name="harshBrakingCount">Harsh braking event count</param>
        /// <param name="harshTurningCount">Harsh turning event count</param>
        /// <param name="safetyScore">Safety Score</param>
        /// <param name="safetyScoreRank">Safety Score Rank</param>
        /// <param name="timeOverSpeedLimitMs">Amount of time driven over the
        /// speed limit in milliseconds</param>
        /// <param name="totalDistanceDrivenMeters">Total distance driven in
        /// meters</param>
        /// <param name="totalHarshEventCount">Total harsh event count</param>
        /// <param name="totalTimeDrivenMs">Amount of time driven in
        /// milliseconds</param>
        /// <param name="vehicleId">Vehicle ID</param>
        public VehicleSafetyScoreResponse(int? crashCount = default(int?), int? harshAccelCount = default(int?), int? harshBrakingCount = default(int?), IList<SafetyReportHarshEvent> harshEvents = default(IList<SafetyReportHarshEvent>), int? harshTurningCount = default(int?), int? safetyScore = default(int?), string safetyScoreRank = default(string), int? timeOverSpeedLimitMs = default(int?), int? totalDistanceDrivenMeters = default(int?), int? totalHarshEventCount = default(int?), int? totalTimeDrivenMs = default(int?), int? vehicleId = default(int?))
        {
            CrashCount = crashCount;
            HarshAccelCount = harshAccelCount;
            HarshBrakingCount = harshBrakingCount;
            HarshEvents = harshEvents;
            HarshTurningCount = harshTurningCount;
            SafetyScore = safetyScore;
            SafetyScoreRank = safetyScoreRank;
            TimeOverSpeedLimitMs = timeOverSpeedLimitMs;
            TotalDistanceDrivenMeters = totalDistanceDrivenMeters;
            TotalHarshEventCount = totalHarshEventCount;
            TotalTimeDrivenMs = totalTimeDrivenMs;
            VehicleId = vehicleId;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets crash event count
        /// </summary>
        [JsonProperty(PropertyName = "crashCount")]
        public int? CrashCount { get; set; }

        /// <summary>
        /// Gets or sets harsh acceleration event count
        /// </summary>
        [JsonProperty(PropertyName = "harshAccelCount")]
        public int? HarshAccelCount { get; set; }

        /// <summary>
        /// Gets or sets harsh braking event count
        /// </summary>
        [JsonProperty(PropertyName = "harshBrakingCount")]
        public int? HarshBrakingCount { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "harshEvents")]
        public IList<SafetyReportHarshEvent> HarshEvents { get; set; }

        /// <summary>
        /// Gets or sets harsh turning event count
        /// </summary>
        [JsonProperty(PropertyName = "harshTurningCount")]
        public int? HarshTurningCount { get; set; }

        /// <summary>
        /// Gets or sets safety Score
        /// </summary>
        [JsonProperty(PropertyName = "safetyScore")]
        public int? SafetyScore { get; set; }

        /// <summary>
        /// Gets or sets safety Score Rank
        /// </summary>
        [JsonProperty(PropertyName = "safetyScoreRank")]
        public string SafetyScoreRank { get; set; }

        /// <summary>
        /// Gets or sets amount of time driven over the speed limit in
        /// milliseconds
        /// </summary>
        [JsonProperty(PropertyName = "timeOverSpeedLimitMs")]
        public int? TimeOverSpeedLimitMs { get; set; }

        /// <summary>
        /// Gets or sets total distance driven in meters
        /// </summary>
        [JsonProperty(PropertyName = "totalDistanceDrivenMeters")]
        public int? TotalDistanceDrivenMeters { get; set; }

        /// <summary>
        /// Gets or sets total harsh event count
        /// </summary>
        [JsonProperty(PropertyName = "totalHarshEventCount")]
        public int? TotalHarshEventCount { get; set; }

        /// <summary>
        /// Gets or sets amount of time driven in milliseconds
        /// </summary>
        [JsonProperty(PropertyName = "totalTimeDrivenMs")]
        public int? TotalTimeDrivenMs { get; set; }

        /// <summary>
        /// Gets or sets vehicle ID
        /// </summary>
        [JsonProperty(PropertyName = "vehicleId")]
        public int? VehicleId { get; set; }

    }
}
