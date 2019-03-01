using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AssetReeferResponseReeferStatsSetPoint
    /// </summary>
    public sealed class AssetReeferResponseReeferStatsSetPoint:  IEquatable<AssetReeferResponseReeferStatsSetPoint>
    { 
        /// <summary>
        /// Set point temperature in millidegree Celsius.
        /// </summary>
        public long? TempInMilliC { get; private set; }

        /// <summary>
        /// Timestamp in Unix milliseconds since epoch.
        /// </summary>
        public long? ChangedAtMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetReeferResponseReeferStatsSetPoint.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetReeferResponseReeferStatsSetPoint()
        {
        }

        private AssetReeferResponseReeferStatsSetPoint(long? TempInMilliC, long? ChangedAtMs)
        {
            
            this.TempInMilliC = TempInMilliC;
            
            this.ChangedAtMs = ChangedAtMs;
            
        }

        /// <summary>
        /// Returns builder of AssetReeferResponseReeferStatsSetPoint.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsSetPointBuilder</returns>
        public static AssetReeferResponseReeferStatsSetPointBuilder Builder()
        {
            return new AssetReeferResponseReeferStatsSetPointBuilder();
        }

        /// <summary>
        /// Returns AssetReeferResponseReeferStatsSetPointBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsSetPointBuilder</returns>
        public AssetReeferResponseReeferStatsSetPointBuilder With()
        {
            return Builder()
                .TempInMilliC(TempInMilliC)
                .ChangedAtMs(ChangedAtMs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AssetReeferResponseReeferStatsSetPoint other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetReeferResponseReeferStatsSetPoint.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsSetPoint</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsSetPoint</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetReeferResponseReeferStatsSetPoint left, AssetReeferResponseReeferStatsSetPoint right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetReeferResponseReeferStatsSetPoint.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsSetPoint</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsSetPoint</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetReeferResponseReeferStatsSetPoint left, AssetReeferResponseReeferStatsSetPoint right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetReeferResponseReeferStatsSetPoint.
        /// </summary>
        public sealed class AssetReeferResponseReeferStatsSetPointBuilder
        {
            private long? _TempInMilliC;
            private long? _ChangedAtMs;

            internal AssetReeferResponseReeferStatsSetPointBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsSetPoint.TempInMilliC property.
            /// </summary>
            /// <param name="value">Set point temperature in millidegree Celsius.</param>
            public AssetReeferResponseReeferStatsSetPointBuilder TempInMilliC(long? value)
            {
                _TempInMilliC = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsSetPoint.ChangedAtMs property.
            /// </summary>
            /// <param name="value">Timestamp in Unix milliseconds since epoch.</param>
            public AssetReeferResponseReeferStatsSetPointBuilder ChangedAtMs(long? value)
            {
                _ChangedAtMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetReeferResponseReeferStatsSetPoint.
            /// </summary>
            /// <returns>AssetReeferResponseReeferStatsSetPoint</returns>
            public AssetReeferResponseReeferStatsSetPoint Build()
            {
                Validate();
                return new AssetReeferResponseReeferStatsSetPoint(
                    TempInMilliC: _TempInMilliC,
                    ChangedAtMs: _ChangedAtMs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}