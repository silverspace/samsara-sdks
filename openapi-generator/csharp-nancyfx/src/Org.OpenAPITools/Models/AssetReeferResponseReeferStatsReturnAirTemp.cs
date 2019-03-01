using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AssetReeferResponseReeferStatsReturnAirTemp
    /// </summary>
    public sealed class AssetReeferResponseReeferStatsReturnAirTemp:  IEquatable<AssetReeferResponseReeferStatsReturnAirTemp>
    { 
        /// <summary>
        /// Return air temperature in millidegree Celsius.
        /// </summary>
        public long? TempInMilliC { get; private set; }

        /// <summary>
        /// Timestamp in Unix milliseconds since epoch.
        /// </summary>
        public long? ChangedAtMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetReeferResponseReeferStatsReturnAirTemp.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetReeferResponseReeferStatsReturnAirTemp()
        {
        }

        private AssetReeferResponseReeferStatsReturnAirTemp(long? TempInMilliC, long? ChangedAtMs)
        {
            
            this.TempInMilliC = TempInMilliC;
            
            this.ChangedAtMs = ChangedAtMs;
            
        }

        /// <summary>
        /// Returns builder of AssetReeferResponseReeferStatsReturnAirTemp.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsReturnAirTempBuilder</returns>
        public static AssetReeferResponseReeferStatsReturnAirTempBuilder Builder()
        {
            return new AssetReeferResponseReeferStatsReturnAirTempBuilder();
        }

        /// <summary>
        /// Returns AssetReeferResponseReeferStatsReturnAirTempBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsReturnAirTempBuilder</returns>
        public AssetReeferResponseReeferStatsReturnAirTempBuilder With()
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

        public bool Equals(AssetReeferResponseReeferStatsReturnAirTemp other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetReeferResponseReeferStatsReturnAirTemp.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsReturnAirTemp</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsReturnAirTemp</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetReeferResponseReeferStatsReturnAirTemp left, AssetReeferResponseReeferStatsReturnAirTemp right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetReeferResponseReeferStatsReturnAirTemp.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsReturnAirTemp</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsReturnAirTemp</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetReeferResponseReeferStatsReturnAirTemp left, AssetReeferResponseReeferStatsReturnAirTemp right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetReeferResponseReeferStatsReturnAirTemp.
        /// </summary>
        public sealed class AssetReeferResponseReeferStatsReturnAirTempBuilder
        {
            private long? _TempInMilliC;
            private long? _ChangedAtMs;

            internal AssetReeferResponseReeferStatsReturnAirTempBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsReturnAirTemp.TempInMilliC property.
            /// </summary>
            /// <param name="value">Return air temperature in millidegree Celsius.</param>
            public AssetReeferResponseReeferStatsReturnAirTempBuilder TempInMilliC(long? value)
            {
                _TempInMilliC = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsReturnAirTemp.ChangedAtMs property.
            /// </summary>
            /// <param name="value">Timestamp in Unix milliseconds since epoch.</param>
            public AssetReeferResponseReeferStatsReturnAirTempBuilder ChangedAtMs(long? value)
            {
                _ChangedAtMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetReeferResponseReeferStatsReturnAirTemp.
            /// </summary>
            /// <returns>AssetReeferResponseReeferStatsReturnAirTemp</returns>
            public AssetReeferResponseReeferStatsReturnAirTemp Build()
            {
                Validate();
                return new AssetReeferResponseReeferStatsReturnAirTemp(
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