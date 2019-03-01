using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AssetReeferResponseReeferStatsPowerStatus
    /// </summary>
    public sealed class AssetReeferResponseReeferStatsPowerStatus:  IEquatable<AssetReeferResponseReeferStatsPowerStatus>
    { 
        /// <summary>
        /// Timestamp in Unix milliseconds since epoch.
        /// </summary>
        public long? ChangedAtMs { get; private set; }

        /// <summary>
        /// Power status of the reefer.
        /// </summary>
        public string Status { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetReeferResponseReeferStatsPowerStatus.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetReeferResponseReeferStatsPowerStatus()
        {
        }

        private AssetReeferResponseReeferStatsPowerStatus(long? ChangedAtMs, string Status)
        {
            
            this.ChangedAtMs = ChangedAtMs;
            
            this.Status = Status;
            
        }

        /// <summary>
        /// Returns builder of AssetReeferResponseReeferStatsPowerStatus.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsPowerStatusBuilder</returns>
        public static AssetReeferResponseReeferStatsPowerStatusBuilder Builder()
        {
            return new AssetReeferResponseReeferStatsPowerStatusBuilder();
        }

        /// <summary>
        /// Returns AssetReeferResponseReeferStatsPowerStatusBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetReeferResponseReeferStatsPowerStatusBuilder</returns>
        public AssetReeferResponseReeferStatsPowerStatusBuilder With()
        {
            return Builder()
                .ChangedAtMs(ChangedAtMs)
                .Status(Status);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AssetReeferResponseReeferStatsPowerStatus other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetReeferResponseReeferStatsPowerStatus.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsPowerStatus</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsPowerStatus</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetReeferResponseReeferStatsPowerStatus left, AssetReeferResponseReeferStatsPowerStatus right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetReeferResponseReeferStatsPowerStatus.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponseReeferStatsPowerStatus</param>
        /// <param name="right">Compared (AssetReeferResponseReeferStatsPowerStatus</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetReeferResponseReeferStatsPowerStatus left, AssetReeferResponseReeferStatsPowerStatus right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetReeferResponseReeferStatsPowerStatus.
        /// </summary>
        public sealed class AssetReeferResponseReeferStatsPowerStatusBuilder
        {
            private long? _ChangedAtMs;
            private string _Status;

            internal AssetReeferResponseReeferStatsPowerStatusBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsPowerStatus.ChangedAtMs property.
            /// </summary>
            /// <param name="value">Timestamp in Unix milliseconds since epoch.</param>
            public AssetReeferResponseReeferStatsPowerStatusBuilder ChangedAtMs(long? value)
            {
                _ChangedAtMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponseReeferStatsPowerStatus.Status property.
            /// </summary>
            /// <param name="value">Power status of the reefer.</param>
            public AssetReeferResponseReeferStatsPowerStatusBuilder Status(string value)
            {
                _Status = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetReeferResponseReeferStatsPowerStatus.
            /// </summary>
            /// <returns>AssetReeferResponseReeferStatsPowerStatus</returns>
            public AssetReeferResponseReeferStatsPowerStatus Build()
            {
                Validate();
                return new AssetReeferResponseReeferStatsPowerStatus(
                    ChangedAtMs: _ChangedAtMs,
                    Status: _Status
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}