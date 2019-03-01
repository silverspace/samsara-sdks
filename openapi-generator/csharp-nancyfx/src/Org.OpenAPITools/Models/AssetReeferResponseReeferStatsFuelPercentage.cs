using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AssetReeferResponseReeferStatsFuelPercentage
    /// </summary>
    public sealed class AssetReeferResponseReeferStatsFuelPercentage:  IEquatable<AssetReeferResponseReeferStatsFuelPercentage>
    { 
        /// <summary>
        /// Fuel percentage of the reefer.
        /// </summary>
        public long? FuelPercentage { get; private set; }

        /// <summary>
        /// Timestamp in Unix milliseconds since epoch.
        /// </summary>
        public long? ChangedAtMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetReeferResponseReeferStatsFuelPercentage.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetReeferResponseReeferStatsFuelPercentage()
        {
        }

        private AssetReeferResponseReeferStatsFuelPercentage(long? FuelPercentage, long? ChangedAtMs)
        {
            
            this.FuelPercentage = FuelPercentage;
            
            this.ChangedAtMs = ChangedAtMs;
            
        }

        /// <summary>
        /// Returns builder of AssetReeferResponseReeferStatsFuelPercentage.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsFuelPercentageBuilder</returns>
        public static AssetReeferResponseReeferStatsFuelPercentageBuilder Builder()
        {
            return new AssetReeferResponseReeferStatsFuelPercentageBuilder();
        }

        /// <summary>
        /// Returns AssetReeferResponseReeferStatsFuelPercentageBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsFuelPercentageBuilder</returns>
        public AssetReeferResponseReeferStatsFuelPercentageBuilder With()
        {
            return Builder()
                .FuelPercentage(FuelPercentage)
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

        public bool Equals(AssetReeferResponseReeferStatsFuelPercentage other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetReeferResponseReeferStatsFuelPercentage.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsFuelPercentage</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsFuelPercentage</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetReeferResponseReeferStatsFuelPercentage left, AssetReeferResponseReeferStatsFuelPercentage right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetReeferResponseReeferStatsFuelPercentage.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsFuelPercentage</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsFuelPercentage</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetReeferResponseReeferStatsFuelPercentage left, AssetReeferResponseReeferStatsFuelPercentage right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetReeferResponseReeferStatsFuelPercentage.
        /// </summary>
        public sealed class AssetReeferResponseReeferStatsFuelPercentageBuilder
        {
            private long? _FuelPercentage;
            private long? _ChangedAtMs;

            internal AssetReeferResponseReeferStatsFuelPercentageBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsFuelPercentage.FuelPercentage property.
            /// </summary>
            /// <param name="value">Fuel percentage of the reefer.</param>
            public AssetReeferResponseReeferStatsFuelPercentageBuilder FuelPercentage(long? value)
            {
                _FuelPercentage = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsFuelPercentage.ChangedAtMs property.
            /// </summary>
            /// <param name="value">Timestamp in Unix milliseconds since epoch.</param>
            public AssetReeferResponseReeferStatsFuelPercentageBuilder ChangedAtMs(long? value)
            {
                _ChangedAtMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetReeferResponseReeferStatsFuelPercentage.
            /// </summary>
            /// <returns>AssetReeferResponseReeferStatsFuelPercentage</returns>
            public AssetReeferResponseReeferStatsFuelPercentage Build()
            {
                Validate();
                return new AssetReeferResponseReeferStatsFuelPercentage(
                    FuelPercentage: _FuelPercentage,
                    ChangedAtMs: _ChangedAtMs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}