using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Safety score details for a driver
    /// </summary>
    public sealed class DriverSafetyScoreResponse:  IEquatable<DriverSafetyScoreResponse>
    { 
        /// <summary>
        /// Crash event count
        /// </summary>
        public int? CrashCount { get; private set; }

        /// <summary>
        /// Driver ID
        /// </summary>
        public int? DriverId { get; private set; }

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
        /// Empty constructor required by some serializers.
        /// Use DriverSafetyScoreResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DriverSafetyScoreResponse()
        {
        }

        private DriverSafetyScoreResponse(int? CrashCount, int? DriverId, int? HarshAccelCount, int? HarshBrakingCount, List<SafetyReportHarshEvent> HarshEvents, int? HarshTurningCount, int? SafetyScore, string SafetyScoreRank, int? TimeOverSpeedLimitMs, int? TotalDistanceDrivenMeters, int? TotalHarshEventCount, int? TotalTimeDrivenMs)
        {
            
            this.CrashCount = CrashCount;
            
            this.DriverId = DriverId;
            
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
            
        }

        /// <summary>
        /// Returns builder of DriverSafetyScoreResponse.
        /// </summary>
        /// <returns>DriverSafetyScoreResponseBuilder</returns>
        public static DriverSafetyScoreResponseBuilder Builder()
        {
            return new DriverSafetyScoreResponseBuilder();
        }

        /// <summary>
        /// Returns DriverSafetyScoreResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DriverSafetyScoreResponseBuilder</returns>
        public DriverSafetyScoreResponseBuilder With()
        {
            return Builder()
                .CrashCount(CrashCount)
                .DriverId(DriverId)
                .HarshAccelCount(HarshAccelCount)
                .HarshBrakingCount(HarshBrakingCount)
                .HarshEvents(HarshEvents)
                .HarshTurningCount(HarshTurningCount)
                .SafetyScore(SafetyScore)
                .SafetyScoreRank(SafetyScoreRank)
                .TimeOverSpeedLimitMs(TimeOverSpeedLimitMs)
                .TotalDistanceDrivenMeters(TotalDistanceDrivenMeters)
                .TotalHarshEventCount(TotalHarshEventCount)
                .TotalTimeDrivenMs(TotalTimeDrivenMs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DriverSafetyScoreResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DriverSafetyScoreResponse.
        /// </summary>
        /// <param name="left">Compared (DriverSafetyScoreResponse</param>
        /// <param name="right">Compared (DriverSafetyScoreResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DriverSafetyScoreResponse left, DriverSafetyScoreResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DriverSafetyScoreResponse.
        /// </summary>
        /// <param name="left">Compared (DriverSafetyScoreResponse</param>
        /// <param name="right">Compared (DriverSafetyScoreResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DriverSafetyScoreResponse left, DriverSafetyScoreResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DriverSafetyScoreResponse.
        /// </summary>
        public sealed class DriverSafetyScoreResponseBuilder
        {
            private int? _CrashCount;
            private int? _DriverId;
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

            internal DriverSafetyScoreResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.CrashCount property.
            /// </summary>
            /// <param name="value">Crash event count</param>
            public DriverSafetyScoreResponseBuilder CrashCount(int? value)
            {
                _CrashCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.DriverId property.
            /// </summary>
            /// <param name="value">Driver ID</param>
            public DriverSafetyScoreResponseBuilder DriverId(int? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.HarshAccelCount property.
            /// </summary>
            /// <param name="value">Harsh acceleration event count</param>
            public DriverSafetyScoreResponseBuilder HarshAccelCount(int? value)
            {
                _HarshAccelCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.HarshBrakingCount property.
            /// </summary>
            /// <param name="value">Harsh braking event count</param>
            public DriverSafetyScoreResponseBuilder HarshBrakingCount(int? value)
            {
                _HarshBrakingCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.HarshEvents property.
            /// </summary>
            /// <param name="value">HarshEvents</param>
            public DriverSafetyScoreResponseBuilder HarshEvents(List<SafetyReportHarshEvent> value)
            {
                _HarshEvents = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.HarshTurningCount property.
            /// </summary>
            /// <param name="value">Harsh turning event count</param>
            public DriverSafetyScoreResponseBuilder HarshTurningCount(int? value)
            {
                _HarshTurningCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.SafetyScore property.
            /// </summary>
            /// <param name="value">Safety Score</param>
            public DriverSafetyScoreResponseBuilder SafetyScore(int? value)
            {
                _SafetyScore = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.SafetyScoreRank property.
            /// </summary>
            /// <param name="value">Safety Score Rank</param>
            public DriverSafetyScoreResponseBuilder SafetyScoreRank(string value)
            {
                _SafetyScoreRank = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.TimeOverSpeedLimitMs property.
            /// </summary>
            /// <param name="value">Amount of time driven over the speed limit in milliseconds</param>
            public DriverSafetyScoreResponseBuilder TimeOverSpeedLimitMs(int? value)
            {
                _TimeOverSpeedLimitMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.TotalDistanceDrivenMeters property.
            /// </summary>
            /// <param name="value">Total distance driven in meters</param>
            public DriverSafetyScoreResponseBuilder TotalDistanceDrivenMeters(int? value)
            {
                _TotalDistanceDrivenMeters = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.TotalHarshEventCount property.
            /// </summary>
            /// <param name="value">Total harsh event count</param>
            public DriverSafetyScoreResponseBuilder TotalHarshEventCount(int? value)
            {
                _TotalHarshEventCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverSafetyScoreResponse.TotalTimeDrivenMs property.
            /// </summary>
            /// <param name="value">Amount of time driven in milliseconds</param>
            public DriverSafetyScoreResponseBuilder TotalTimeDrivenMs(int? value)
            {
                _TotalTimeDrivenMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DriverSafetyScoreResponse.
            /// </summary>
            /// <returns>DriverSafetyScoreResponse</returns>
            public DriverSafetyScoreResponse Build()
            {
                Validate();
                return new DriverSafetyScoreResponse(
                    CrashCount: _CrashCount,
                    DriverId: _DriverId,
                    HarshAccelCount: _HarshAccelCount,
                    HarshBrakingCount: _HarshBrakingCount,
                    HarshEvents: _HarshEvents,
                    HarshTurningCount: _HarshTurningCount,
                    SafetyScore: _SafetyScore,
                    SafetyScoreRank: _SafetyScoreRank,
                    TimeOverSpeedLimitMs: _TimeOverSpeedLimitMs,
                    TotalDistanceDrivenMeters: _TotalDistanceDrivenMeters,
                    TotalHarshEventCount: _TotalHarshEventCount,
                    TotalTimeDrivenMs: _TotalTimeDrivenMs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}