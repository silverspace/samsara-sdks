using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// SensorHistoryResponseResults
    /// </summary>
    public sealed class SensorHistoryResponseResults:  IEquatable<SensorHistoryResponseResults>
    { 
        /// <summary>
        /// List of datapoints, one for each requested (sensor, field) pair.
        /// </summary>
        public List<long?> Series { get; private set; }

        /// <summary>
        /// Timestamp in UNIX milliseconds.
        /// </summary>
        public int? TimeMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SensorHistoryResponseResults.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SensorHistoryResponseResults()
        {
        }

        private SensorHistoryResponseResults(List<long?> Series, int? TimeMs)
        {
            
            this.Series = Series;
            
            this.TimeMs = TimeMs;
            
        }

        /// <summary>
        /// Returns builder of SensorHistoryResponseResults.
        /// </summary>
        /// <returns>SensorHistoryResponseResultsBuilder</returns>
        public static SensorHistoryResponseResultsBuilder Builder()
        {
            return new SensorHistoryResponseResultsBuilder();
        }

        /// <summary>
        /// Returns SensorHistoryResponseResultsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SensorHistoryResponseResultsBuilder</returns>
        public SensorHistoryResponseResultsBuilder With()
        {
            return Builder()
                .Series(Series)
                .TimeMs(TimeMs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SensorHistoryResponseResults other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SensorHistoryResponseResults.
        /// </summary>
        /// <param name="left">Compared (SensorHistoryResponseResults</param>
        /// <param name="right">Compared (SensorHistoryResponseResults</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SensorHistoryResponseResults left, SensorHistoryResponseResults right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SensorHistoryResponseResults.
        /// </summary>
        /// <param name="left">Compared (SensorHistoryResponseResults</param>
        /// <param name="right">Compared (SensorHistoryResponseResults</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SensorHistoryResponseResults left, SensorHistoryResponseResults right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SensorHistoryResponseResults.
        /// </summary>
        public sealed class SensorHistoryResponseResultsBuilder
        {
            private List<long?> _Series;
            private int? _TimeMs;

            internal SensorHistoryResponseResultsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SensorHistoryResponseResults.Series property.
            /// </summary>
            /// <param name="value">List of datapoints, one for each requested (sensor, field) pair.</param>
            public SensorHistoryResponseResultsBuilder Series(List<long?> value)
            {
                _Series = value;
                return this;
            }

            /// <summary>
            /// Sets value for SensorHistoryResponseResults.TimeMs property.
            /// </summary>
            /// <param name="value">Timestamp in UNIX milliseconds.</param>
            public SensorHistoryResponseResultsBuilder TimeMs(int? value)
            {
                _TimeMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SensorHistoryResponseResults.
            /// </summary>
            /// <returns>SensorHistoryResponseResults</returns>
            public SensorHistoryResponseResults Build()
            {
                Validate();
                return new SensorHistoryResponseResults(
                    Series: _Series,
                    TimeMs: _TimeMs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}