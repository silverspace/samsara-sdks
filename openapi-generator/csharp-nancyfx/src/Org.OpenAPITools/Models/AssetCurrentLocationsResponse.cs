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
    public sealed class AssetCurrentLocationsResponse:  IEquatable<AssetCurrentLocationsResponse>
    { 
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
        /// Current location of an asset
        /// </summary>
        public List<AssetCurrentLocation> Location { get; private set; }

        /// <summary>
        /// Asset name
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetCurrentLocationsResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetCurrentLocationsResponse()
        {
        }

        private AssetCurrentLocationsResponse(List<AssetCable> Cable, int? EngineHours, long? Id, List<AssetCurrentLocation> Location, string Name)
        {
            
            this.Cable = Cable;
            
            this.EngineHours = EngineHours;
            
            this.Id = Id;
            
            this.Location = Location;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of AssetCurrentLocationsResponse.
        /// </summary>
        /// <returns>AssetCurrentLocationsResponseBuilder</returns>
        public static AssetCurrentLocationsResponseBuilder Builder()
        {
            return new AssetCurrentLocationsResponseBuilder();
        }

        /// <summary>
        /// Returns AssetCurrentLocationsResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetCurrentLocationsResponseBuilder</returns>
        public AssetCurrentLocationsResponseBuilder With()
        {
            return Builder()
                .Cable(Cable)
                .EngineHours(EngineHours)
                .Id(Id)
                .Location(Location)
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

        public bool Equals(AssetCurrentLocationsResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetCurrentLocationsResponse.
        /// </summary>
        /// <param name="left">Compared (AssetCurrentLocationsResponse</param>
        /// <param name="right">Compared (AssetCurrentLocationsResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetCurrentLocationsResponse left, AssetCurrentLocationsResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetCurrentLocationsResponse.
        /// </summary>
        /// <param name="left">Compared (AssetCurrentLocationsResponse</param>
        /// <param name="right">Compared (AssetCurrentLocationsResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetCurrentLocationsResponse left, AssetCurrentLocationsResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetCurrentLocationsResponse.
        /// </summary>
        public sealed class AssetCurrentLocationsResponseBuilder
        {
            private List<AssetCable> _Cable;
            private int? _EngineHours;
            private long? _Id;
            private List<AssetCurrentLocation> _Location;
            private string _Name;

            internal AssetCurrentLocationsResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetCurrentLocationsResponse.Cable property.
            /// </summary>
            /// <param name="value">The cable connected to the asset</param>
            public AssetCurrentLocationsResponseBuilder Cable(List<AssetCable> value)
            {
                _Cable = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetCurrentLocationsResponse.EngineHours property.
            /// </summary>
            /// <param name="value">Engine hours</param>
            public AssetCurrentLocationsResponseBuilder EngineHours(int? value)
            {
                _EngineHours = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetCurrentLocationsResponse.Id property.
            /// </summary>
            /// <param name="value">Asset ID</param>
            public AssetCurrentLocationsResponseBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetCurrentLocationsResponse.Location property.
            /// </summary>
            /// <param name="value">Current location of an asset</param>
            public AssetCurrentLocationsResponseBuilder Location(List<AssetCurrentLocation> value)
            {
                _Location = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetCurrentLocationsResponse.Name property.
            /// </summary>
            /// <param name="value">Asset name</param>
            public AssetCurrentLocationsResponseBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetCurrentLocationsResponse.
            /// </summary>
            /// <returns>AssetCurrentLocationsResponse</returns>
            public AssetCurrentLocationsResponse Build()
            {
                Validate();
                return new AssetCurrentLocationsResponse(
                    Cable: _Cable,
                    EngineHours: _EngineHours,
                    Id: _Id,
                    Location: _Location,
                    Name: _Name
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for AssetCurrentLocationsResponse and cannot be null");
                } 
            }
        }

        
    }
}