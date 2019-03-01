using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AssetReeferResponseReeferStatsEngineHours
    /// </summary>
    public sealed class AssetReeferResponseReeferStatsEngineHours:  IEquatable<AssetReeferResponseReeferStatsEngineHours>
    { 
        /// <summary>
        /// Engine hours of the reefer.
        /// </summary>
        public long? EngineHours { get; private set; }

        /// <summary>
        /// Timestamp in Unix milliseconds since epoch.
        /// </summary>
        public long? ChangedAtMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetReeferResponseReeferStatsEngineHours.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetReeferResponseReeferStatsEngineHours()
        {
        }

        private AssetReeferResponseReeferStatsEngineHours(long? EngineHours, long? ChangedAtMs)
        {
            
            this.EngineHours = EngineHours;
            
            this.ChangedAtMs = ChangedAtMs;
            
        }

        /// <summary>
        /// Returns builder of AssetReeferResponseReeferStatsEngineHours.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsEngineHoursBuilder</returns>
        public static AssetReeferResponseReeferStatsEngineHoursBuilder Builder()
        {
            return new AssetReeferResponseReeferStatsEngineHoursBuilder();
        }

        /// <summary>
        /// Returns AssetReeferResponseReeferStatsEngineHoursBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsEngineHoursBuilder</returns>
        public AssetReeferResponseReeferStatsEngineHoursBuilder With()
        {
            return Builder()
                .EngineHours(EngineHours)
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

        public bool Equals(AssetReeferResponseReeferStatsEngineHours other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetReeferResponseReeferStatsEngineHours.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsEngineHours</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsEngineHours</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetReeferResponseReeferStatsEngineHours left, AssetReeferResponseReeferStatsEngineHours right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetReeferResponseReeferStatsEngineHours.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsEngineHours</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsEngineHours</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetReeferResponseReeferStatsEngineHours left, AssetReeferResponseReeferStatsEngineHours right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetReeferResponseReeferStatsEngineHours.
        /// </summary>
        public sealed class AssetReeferResponseReeferStatsEngineHoursBuilder
        {
            private long? _EngineHours;
            private long? _ChangedAtMs;

            internal AssetReeferResponseReeferStatsEngineHoursBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsEngineHours.EngineHours property.
            /// </summary>
            /// <param name="value">Engine hours of the reefer.</param>
            public AssetReeferResponseReeferStatsEngineHoursBuilder EngineHours(long? value)
            {
                _EngineHours = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsEngineHours.ChangedAtMs property.
            /// </summary>
            /// <param name="value">Timestamp in Unix milliseconds since epoch.</param>
            public AssetReeferResponseReeferStatsEngineHoursBuilder ChangedAtMs(long? value)
            {
                _ChangedAtMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetReeferResponseReeferStatsEngineHours.
            /// </summary>
            /// <returns>AssetReeferResponseReeferStatsEngineHours</returns>
            public AssetReeferResponseReeferStatsEngineHours Build()
            {
                Validate();
                return new AssetReeferResponseReeferStatsEngineHours(
                    EngineHours: _EngineHours,
                    ChangedAtMs: _ChangedAtMs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}