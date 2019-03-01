using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Reefer-specific asset details
    /// </summary>
    public sealed class AssetReeferResponse:  IEquatable<AssetReeferResponse>
    { 
        /// <summary>
        /// Asset type
        /// </summary>
        public string AssetType { get; private set; }

        /// <summary>
        /// Asset ID
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// Asset name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// ReeferStats
        /// </summary>
        public AssetReeferResponseReeferStats ReeferStats { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetReeferResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetReeferResponse()
        {
        }

        private AssetReeferResponse(string AssetType, int? Id, string Name, AssetReeferResponseReeferStats ReeferStats)
        {
            
            this.AssetType = AssetType;
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.ReeferStats = ReeferStats;
            
        }

        /// <summary>
        /// Returns builder of AssetReeferResponse.
        /// </summary>
        /// <returns>AssetReeferResponseBuilder</returns>
        public static AssetReeferResponseBuilder Builder()
        {
            return new AssetReeferResponseBuilder();
        }

        /// <summary>
        /// Returns AssetReeferResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetReeferResponseBuilder</returns>
        public AssetReeferResponseBuilder With()
        {
            return Builder()
                .AssetType(AssetType)
                .Id(Id)
                .Name(Name)
                .ReeferStats(ReeferStats);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AssetReeferResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetReeferResponse.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponse</param>
        /// <param name="right">Compared (AssetReeferResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetReeferResponse left, AssetReeferResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetReeferResponse.
        /// </summary>
        /// <param name="left">Compared (AssetReeferResponse</param>
        /// <param name="right">Compared (AssetReeferResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetReeferResponse left, AssetReeferResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetReeferResponse.
        /// </summary>
        public sealed class AssetReeferResponseBuilder
        {
            private string _AssetType;
            private int? _Id;
            private string _Name;
            private AssetReeferResponseReeferStats _ReeferStats;

            internal AssetReeferResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetReeferResponse.AssetType property.
            /// </summary>
            /// <param name="value">Asset type</param>
            public AssetReeferResponseBuilder AssetType(string value)
            {
                _AssetType = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponse.Id property.
            /// </summary>
            /// <param name="value">Asset ID</param>
            public AssetReeferResponseBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponse.Name property.
            /// </summary>
            /// <param name="value">Asset name</param>
            public AssetReeferResponseBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetReeferResponse.ReeferStats property.
            /// </summary>
            /// <param name="value">ReeferStats</param>
            public AssetReeferResponseBuilder ReeferStats(AssetReeferResponseReeferStats value)
            {
                _ReeferStats = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetReeferResponse.
            /// </summary>
            /// <returns>AssetReeferResponse</returns>
            public AssetReeferResponse Build()
            {
                Validate();
                return new AssetReeferResponse(
                    AssetType: _AssetType,
                    Id: _Id,
                    Name: _Name,
                    ReeferStats: _ReeferStats
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}