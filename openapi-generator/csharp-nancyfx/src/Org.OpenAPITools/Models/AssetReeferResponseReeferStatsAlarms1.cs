using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AssetReeferResponseReeferStatsAlarms1
    /// </summary>
    public sealed class AssetReeferResponseReeferStatsAlarms1:  IEquatable<AssetReeferResponseReeferStatsAlarms1>
    { 
        /// <summary>
        /// Alarms
        /// </summary>
        public List<AssetReeferResponseReeferStatsAlarms> Alarms { get; private set; }

        /// <summary>
        /// Timestamp when the alarms were reported, in Unix milliseconds since epoch
        /// </summary>
        public long? ChangedAtMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetReeferResponseReeferStatsAlarms1.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetReeferResponseReeferStatsAlarms1()
        {
        }

        private AssetReeferResponseReeferStatsAlarms1(List<AssetReeferResponseReeferStatsAlarms> Alarms, long? ChangedAtMs)
        {
            
            this.Alarms = Alarms;
            
            this.ChangedAtMs = ChangedAtMs;
            
        }

        /// <summary>
        /// Returns builder of AssetReeferResponseReeferStatsAlarms1.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsAlarms1Builder</returns>
        public static AssetReeferResponseReeferStatsAlarms1Builder Builder()
        {
            return new AssetReeferResponseReeferStatsAlarms1Builder();
        }

        /// <summary>
        /// Returns AssetReeferResponseReeferStatsAlarms1Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsAlarms1Builder</returns>
        public AssetReeferResponseReeferStatsAlarms1Builder With()
        {
            return Builder()
                .Alarms(Alarms)
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

        public bool Equals(AssetReeferResponseReeferStatsAlarms1 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetReeferResponseReeferStatsAlarms1.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsAlarms1</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsAlarms1</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetReeferResponseReeferStatsAlarms1 left, AssetReeferResponseReeferStatsAlarms1 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetReeferResponseReeferStatsAlarms1.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsAlarms1</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsAlarms1</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetReeferResponseReeferStatsAlarms1 left, AssetReeferResponseReeferStatsAlarms1 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetReeferResponseReeferStatsAlarms1.
        /// </summary>
        public sealed class AssetReeferResponseReeferStatsAlarms1Builder
        {
            private List<AssetReeferResponseReeferStatsAlarms> _Alarms;
            private long? _ChangedAtMs;

            internal AssetReeferResponseReeferStatsAlarms1Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsAlarms1.Alarms property.
            /// </summary>
            /// <param name="value">Alarms</param>
            public AssetReeferResponseReeferStatsAlarms1Builder Alarms(List<AssetReeferResponseReeferStatsAlarms> value)
            {
                _Alarms = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsAlarms1.ChangedAtMs property.
            /// </summary>
            /// <param name="value">Timestamp when the alarms were reported, in Unix milliseconds since epoch</param>
            public AssetReeferResponseReeferStatsAlarms1Builder ChangedAtMs(long? value)
            {
                _ChangedAtMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetReeferResponseReeferStatsAlarms1.
            /// </summary>
            /// <returns>AssetReeferResponseReeferStatsAlarms1</returns>
            public AssetReeferResponseReeferStatsAlarms1 Build()
            {
                Validate();
                return new AssetReeferResponseReeferStatsAlarms1(
                    Alarms: _Alarms,
                    ChangedAtMs: _ChangedAtMs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}