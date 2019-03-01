using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Basic information of an asset
    /// </summary>
    public sealed class Asset:  IEquatable<Asset>
    { 
        /// <summary>
        /// Serial number of the host asset
        /// </summary>
        public string AssetSerialNumber { get; private set; }

        /// <summary>
        /// The cable connected to the asset
        /// </summary>
        public List<AssetCable> Cable { get; private set; }

        /// <summary>
        /// Engine hours
        /// </summary>
        public int? EngineHours { get; private set; }

        /// <summary>
        /// Asset ID
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Asset name
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Asset.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Asset()
        {
        }

        private Asset(string AssetSerialNumber, List<AssetCable> Cable, int? EngineHours, long? Id, string Name)
        {
            
            this.AssetSerialNumber = AssetSerialNumber;
            
            this.Cable = Cable;
            
            this.EngineHours = EngineHours;
            
            this.Id = Id;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of Asset.
        /// </summary>
        /// <returns>AssetBuilder</returns>
        public static AssetBuilder Builder()
        {
            return new AssetBuilder();
        }

        /// <summary>
        /// Returns AssetBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetBuilder</returns>
        public AssetBuilder With()
        {
            return Builder()
                .AssetSerialNumber(AssetSerialNumber)
                .Cable(Cable)
                .EngineHours(EngineHours)
                .Id(Id)
                .Name(Name);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Asset other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Asset.
        /// </summary>
        /// <param name="left">Compared (Asset</param>
        /// <param name="right">Compared (Asset</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Asset left, Asset right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Asset.
        /// </summary>
        /// <param name="left">Compared (Asset</param>
        /// <param name="right">Compared (Asset</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Asset left, Asset right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Asset.
        /// </summary>
        public sealed class AssetBuilder
        {
            private string _AssetSerialNumber;
            private List<AssetCable> _Cable;
            private int? _EngineHours;
            private long? _Id;
            private string _Name;

            internal AssetBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Asset.AssetSerialNumber property.
            /// </summary>
            /// <param name="value">Serial number of the host asset</param>
            public AssetBuilder AssetSerialNumber(string value)
            {
                _AssetSerialNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for Asset.Cable property.
            /// </summary>
            /// <param name="value">The cable connected to the asset</param>
            public AssetBuilder Cable(List<AssetCable> value)
            {
                _Cable = value;
                return this;
            }

            /// <summary>
            /// Sets value for Asset.EngineHours property.
            /// </summary>
            /// <param name="value">Engine hours</param>
            public AssetBuilder EngineHours(int? value)
            {
                _EngineHours = value;
                return this;
            }

            /// <summary>
            /// Sets value for Asset.Id property.
            /// </summary>
            /// <param name="value">Asset ID</param>
            public AssetBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Asset.Name property.
            /// </summary>
            /// <param name="value">Asset name</param>
            public AssetBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Asset.
            /// </summary>
            /// <returns>Asset</returns>
            public Asset Build()
            {
                Validate();
                return new Asset(
                    AssetSerialNumber: _AssetSerialNumber,
                    Cable: _Cable,
                    EngineHours: _EngineHours,
                    Id: _Id,
                    Name: _Name
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for Asset and cannot be null");
                } 
            }
        }

        
    }
}