using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Safety score details for a vehicle
    /// </summary>
    public sealed class VehicleSafetyScoreResponse:  IEquatable<VehicleSafetyScoreResponse>
    { 
        /// <summary>
        /// Crash event count
        /// </summary>
        public int? CrashCount { get; private set; }

        /// <summary>
        /// Harsh acceleration event count
        /// </summary>
        public int? HarshAccelCount { get; private set; }

        /// <summary>
        /// Harsh braking event count
        /// </summary>
        public int? HarshBrakingCount { get; private set; }

        /// <summary>
        /// HarshEvents
        /// </summary>
        public List<SafetyReportHarshEvent> HarshEvents { get; private set; }

        /// <summary>
        /// Harsh turning event count
        /// </summary>
        public int? HarshTurningCount { get; private set; }

        /// <summary>
        /// Safety Score
        /// </summary>
        public int? SafetyScore { get; private set; }

        /// <summary>
        /// Safety Score Rank
        /// </summary>
        public string SafetyScoreRank { get; private set; }

        /// <summary>
        /// Amount of time driven over the speed limit in milliseconds
        /// </summary>
        public int? TimeOverSpeedLimitMs { get; private set; }

        /// <summary>
        /// Total distance driven in meters
        /// </summary>
        public int? TotalDistanceDrivenMeters { get; private set; }

        /// <summary>
        /// Total harsh event count
        /// </summary>
        public int? TotalHarshEventCount { get; private set; }

        /// <summary>
        /// Amount of time driven in milliseconds
        /// </summary>
        public int? TotalTimeDrivenMs { get; private set; }

        /// <summary>
        /// Vehicle ID
        /// </summary>
        public int? VehicleId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VehicleSafetyScoreResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VehicleSafetyScoreResponse()
        {
        }

        private VehicleSafetyScoreResponse(int? CrashCount, int? HarshAccelCount, int? HarshBrakingCount, List<SafetyReportHarshEvent> HarshEvents, int? HarshTurningCount, int? SafetyScore, string SafetyScoreRank, int? TimeOverSpeedLimitMs, int? TotalDistanceDrivenMeters, int? TotalHarshEventCount, int? TotalTimeDrivenMs, int? VehicleId)
        {
            
            this.CrashCount = CrashCount;
            
            this.HarshAccelCount = HarshAccelCount;
            
            this.HarshBrakingCount = HarshBrakingCount;
            
            this.HarshEvents = HarshEvents;
            
            this.HarshTurningCount = HarshTurningCount;
            
            this.SafetyScore = SafetyScore;
            
            this.SafetyScoreRank = SafetyScoreRank;
            
            this.TimeOverSpeedLimitMs = TimeOverSpeedLimitMs;
            
            this.TotalDistanceDrivenMeters = TotalDistanceDrivenMeters;
            
            this.TotalHarshEventCount = TotalHarshEventCount;
            
            this.TotalTimeDrivenMs = TotalTimeDrivenMs;
            
            this.VehicleId = VehicleId;
            
        }

        /// <summary>
        /// Returns builder of VehicleSafetyScoreResponse.
        /// </summary>
        /// <returns>VehicleSafetyScoreResponseBuilder</returns>
        public static VehicleSafetyScoreResponseBuilder Builder()
        {
            return new VehicleSafetyScoreResponseBuilder();
        }

        /// <summary>
        /// Returns VehicleSafetyScoreResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleSafetyScoreResponseBuilder</returns>
        public VehicleSafetyScoreResponseBuilder With()
        {
            return Builder()
                .CrashCount(CrashCount)
                .HarshAccelCount(HarshAccelCount)
                .HarshBrakingCount(HarshBrakingCount)
                .HarshEvents(HarshEvents)
                .HarshTurningCount(HarshTurningCount)
                .SafetyScore(SafetyScore)
                .SafetyScoreRank(SafetyScoreRank)
                .TimeOverSpeedLimitMs(TimeOverSpeedLimitMs)
                .TotalDistanceDrivenMeters(TotalDistanceDrivenMeters)
                .TotalHarshEventCount(TotalHarshEventCount)
                .TotalTimeDrivenMs(TotalTimeDrivenMs)
                .VehicleId(VehicleId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VehicleSafetyScoreResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VehicleSafetyScoreResponse.
        /// </summary>
        /// <param name="left">Compared (VehicleSafetyScoreResponse</param>
        /// <param name="right">Compared (VehicleSafetyScoreResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VehicleSafetyScoreResponse left, VehicleSafetyScoreResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VehicleSafetyScoreResponse.
        /// </summary>
        /// <param name="left">Compared (VehicleSafetyScoreResponse</param>
        /// <param name="right">Compared (VehicleSafetyScoreResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VehicleSafetyScoreResponse left, VehicleSafetyScoreResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VehicleSafetyScoreResponse.
        /// </summary>
        public sealed class VehicleSafetyScoreResponseBuilder
        {
            private int? _CrashCount;
            private int? _HarshAccelCount;
            private int? _HarshBrakingCount;
            private List<SafetyReportHarshEvent> _HarshEvents;
            private int? _HarshTurningCount;
            private int? _SafetyScore;
            private string _SafetyScoreRank;
            private int? _TimeOverSpeedLimitMs;
            private int? _TotalDistanceDrivenMeters;
            private int? _TotalHarshEventCount;
            private int? _TotalTimeDrivenMs;
            private int? _VehicleId;

            internal VehicleSafetyScoreResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.CrashCount property.
            /// </summary>
            /// <param name="value">Crash event count</param>
            public VehicleSafetyScoreResponseBuilder CrashCount(int? value)
            {
                _CrashCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.HarshAccelCount property.
            /// </summary>
            /// <param name="value">Harsh acceleration event count</param>
            public VehicleSafetyScoreResponseBuilder HarshAccelCount(int? value)
            {
                _HarshAccelCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.HarshBrakingCount property.
            /// </summary>
            /// <param name="value">Harsh braking event count</param>
            public VehicleSafetyScoreResponseBuilder HarshBrakingCount(int? value)
            {
                _HarshBrakingCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.HarshEvents property.
            /// </summary>
            /// <param name="value">HarshEvents</param>
            public VehicleSafetyScoreResponseBuilder HarshEvents(List<SafetyReportHarshEvent> value)
            {
                _HarshEvents = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.HarshTurningCount property.
            /// </summary>
            /// <param name="value">Harsh turning event count</param>
            public VehicleSafetyScoreResponseBuilder HarshTurningCount(int? value)
            {
                _HarshTurningCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.SafetyScore property.
            /// </summary>
            /// <param name="value">Safety Score</param>
            public VehicleSafetyScoreResponseBuilder SafetyScore(int? value)
            {
                _SafetyScore = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.SafetyScoreRank property.
            /// </summary>
            /// <param name="value">Safety Score Rank</param>
            public VehicleSafetyScoreResponseBuilder SafetyScoreRank(string value)
            {
                _SafetyScoreRank = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.TimeOverSpeedLimitMs property.
            /// </summary>
            /// <param name="value">Amount of time driven over the speed limit in milliseconds</param>
            public VehicleSafetyScoreResponseBuilder TimeOverSpeedLimitMs(int? value)
            {
                _TimeOverSpeedLimitMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.TotalDistanceDrivenMeters property.
            /// </summary>
            /// <param name="value">Total distance driven in meters</param>
            public VehicleSafetyScoreResponseBuilder TotalDistanceDrivenMeters(int? value)
            {
                _TotalDistanceDrivenMeters = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.TotalHarshEventCount property.
            /// </summary>
            /// <param name="value">Total harsh event count</param>
            public VehicleSafetyScoreResponseBuilder TotalHarshEventCount(int? value)
            {
                _TotalHarshEventCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.TotalTimeDrivenMs property.
            /// </summary>
            /// <param name="value">Amount of time driven in milliseconds</param>
            public VehicleSafetyScoreResponseBuilder TotalTimeDrivenMs(int? value)
            {
                _TotalTimeDrivenMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleSafetyScoreResponse.VehicleId property.
            /// </summary>
            /// <param name="value">Vehicle ID</param>
            public VehicleSafetyScoreResponseBuilder VehicleId(int? value)
            {
                _VehicleId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VehicleSafetyScoreResponse.
            /// </summary>
            /// <returns>VehicleSafetyScoreResponse</returns>
            public VehicleSafetyScoreResponse Build()
            {
                Validate();
                return new VehicleSafetyScoreResponse(
                    CrashCount: _CrashCount,
                    HarshAccelCount: _HarshAccelCount,
                    HarshBrakingCount: _HarshBrakingCount,
                    HarshEvents: _HarshEvents,
                    HarshTurningCount: _HarshTurningCount,
                    SafetyScore: _SafetyScore,
                    SafetyScoreRank: _SafetyScoreRank,
                    TimeOverSpeedLimitMs: _TimeOverSpeedLimitMs,
                    TotalDistanceDrivenMeters: _TotalDistanceDrivenMeters,
                    TotalHarshEventCount: _TotalHarshEventCount,
                    TotalTimeDrivenMs: _TotalTimeDrivenMs,
                    VehicleId: _VehicleId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}