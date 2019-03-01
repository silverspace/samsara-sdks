using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DataInputHistoryResponsePoints
    /// </summary>
    public sealed class DataInputHistoryResponsePoints:  IEquatable<DataInputHistoryResponsePoints>
    { 
        /// <summary>
        /// Value
        /// </summary>
        public double? Value { get; private set; }

        /// <summary>
        /// TimeMs
        /// </summary>
        public long? TimeMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DataInputHistoryResponsePoints.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DataInputHistoryResponsePoints()
        {
        }

        private DataInputHistoryResponsePoints(double? Value, long? TimeMs)
        {
            
            this.Value = Value;
            
            this.TimeMs = TimeMs;
            
        }

        /// <summary>
        /// Returns builder of DataInputHistoryResponsePoints.
        /// </summary>
        /// <returns>DataInputHistoryResponsePointsBuilder</returns>
        public static DataInputHistoryResponsePointsBuilder Builder()
        {
            return new DataInputHistoryResponsePointsBuilder();
        }

        /// <summary>
        /// Returns DataInputHistoryResponsePointsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DataInputHistoryResponsePointsBuilder</returns>
        public DataInputHistoryResponsePointsBuilder With()
        {
            return Builder()
                .Value(Value)
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

        public bool Equals(DataInputHistoryResponsePoints other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DataInputHistoryResponsePoints.
        /// </summary>
        /// <param name="left">Compared (DataInputHistoryResponsePoints</param>
        /// <param name="right">Compared (DataInputHistoryResponsePoints</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DataInputHistoryResponsePoints left, DataInputHistoryResponsePoints right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DataInputHistoryResponsePoints.
        /// </summary>
        /// <param name="left">Compared (DataInputHistoryResponsePoints</param>
        /// <param name="right">Compared (DataInputHistoryResponsePoints</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DataInputHistoryResponsePoints left, DataInputHistoryResponsePoints right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DataInputHistoryResponsePoints.
        /// </summary>
        public sealed class DataInputHistoryResponsePointsBuilder
        {
            private double? _Value;
            private long? _TimeMs;

            internal DataInputHistoryResponsePointsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DataInputHistoryResponsePoints.Value property.
            /// </summary>
            /// <param name="value">Value</param>
            public DataInputHistoryResponsePointsBuilder Value(double? value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for DataInputHistoryResponsePoints.TimeMs property.
            /// </summary>
            /// <param name="value">TimeMs</param>
            public DataInputHistoryResponsePointsBuilder TimeMs(long? value)
            {
                _TimeMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DataInputHistoryResponsePoints.
            /// </summary>
            /// <returns>DataInputHistoryResponsePoints</returns>
            public DataInputHistoryResponsePoints Build()
            {
                Validate();
                return new DataInputHistoryResponsePoints(
                    Value: _Value,
                    TimeMs: _TimeMs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}