using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Current location of an asset
    /// </summary>
    public sealed class AssetCurrentLocation:  IEquatable<AssetCurrentLocation>
    { 
        /// <summary>
        /// The latitude of the location in degrees.
        /// </summary>
        public double? Latitude { get; private set; }

        /// <summary>
        /// The best effort (street,city,state) for the latitude and longitude.
        /// </summary>
        public string Location { get; private set; }

        /// <summary>
        /// The longitude of the location in degrees.
        /// </summary>
        public double? Longitude { get; private set; }

        /// <summary>
        /// The speed calculated from GPS that the asset was traveling at in miles per hour.
        /// </summary>
        public double? SpeedMilesPerHour { get; private set; }

        /// <summary>
        /// Time in Unix milliseconds since epoch when the asset was at the location.
        /// </summary>
        public long? TimeMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetCurrentLocation.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetCurrentLocation()
        {
        }

        private AssetCurrentLocation(double? Latitude, string Location, double? Longitude, double? SpeedMilesPerHour, long? TimeMs)
        {
            
            this.Latitude = Latitude;
            
            this.Location = Location;
            
            this.Longitude = Longitude;
            
            this.SpeedMilesPerHour = SpeedMilesPerHour;
            
            this.TimeMs = TimeMs;
            
        }

        /// <summary>
        /// Returns builder of AssetCurrentLocation.
        /// </summary>
        /// <returns>AssetCurrentLocationBuilder</returns>
        public static AssetCurrentLocationBuilder Builder()
        {
            return new AssetCurrentLocationBuilder();
        }

        /// <summary>
        /// Returns AssetCurrentLocationBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetCurrentLocationBuilder</returns>
        public AssetCurrentLocationBuilder With()
        {
            return Builder()
                .Latitude(Latitude)
                .Location(Location)
                .Longitude(Longitude)
                .SpeedMilesPerHour(SpeedMilesPerHour)
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

        public bool Equals(AssetCurrentLocation other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetCurrentLocation.
        /// </summary>
        /// <param name="left">Compared (AssetCurrentLocation</param>
        /// <param name="right">Compared (AssetCurrentLocation</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetCurrentLocation left, AssetCurrentLocation right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetCurrentLocation.
        /// </summary>
        /// <param name="left">Compared (AssetCurrentLocation</param>
        /// <param name="right">Compared (AssetCurrentLocation</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetCurrentLocation left, AssetCurrentLocation right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetCurrentLocation.
        /// </summary>
        public sealed class AssetCurrentLocationBuilder
        {
            private double? _Latitude;
            private string _Location;
            private double? _Longitude;
            private double? _SpeedMilesPerHour;
            private long? _TimeMs;

            internal AssetCurrentLocationBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetCurrentLocation.Latitude property.
            /// </summary>
            /// <param name="value">The latitude of the location in degrees.</param>
            public AssetCurrentLocationBuilder Latitude(double? value)
            {
                _Latitude = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetCurrentLocation.Location property.
            /// </summary>
            /// <param name="value">The best effort (street,city,state) for the latitude and longitude.</param>
            public AssetCurrentLocationBuilder Location(string value)
            {
                _Location = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetCurrentLocation.Longitude property.
            /// </summary>
            /// <param name="value">The longitude of the location in degrees.</param>
            public AssetCurrentLocationBuilder Longitude(double? value)
            {
                _Longitude = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetCurrentLocation.SpeedMilesPerHour property.
            /// </summary>
            /// <param name="value">The speed calculated from GPS that the asset was traveling at in miles per hour.</param>
            public AssetCurrentLocationBuilder SpeedMilesPerHour(double? value)
            {
                _SpeedMilesPerHour = value;
                return this;
            }

            /// <summary>
            /// Sets value for AssetCurrentLocation.TimeMs property.
            /// </summary>
            /// <param name="value">Time in Unix milliseconds since epoch when the asset was at the location.</param>
            public AssetCurrentLocationBuilder TimeMs(long? value)
            {
                _TimeMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetCurrentLocation.
            /// </summary>
            /// <returns>AssetCurrentLocation</returns>
            public AssetCurrentLocation Build()
            {
                Validate();
                return new AssetCurrentLocation(
                    Latitude: _Latitude,
                    Location: _Location,
                    Longitude: _Longitude,
                    SpeedMilesPerHour: _SpeedMilesPerHour,
                    TimeMs: _TimeMs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}