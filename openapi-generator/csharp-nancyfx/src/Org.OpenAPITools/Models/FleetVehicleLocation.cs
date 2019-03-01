using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains the location and speed of a vehicle at a particular time
    /// </summary>
    public sealed class FleetVehicleLocation:  IEquatable<FleetVehicleLocation>
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
        /// Use FleetVehicleLocation.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public FleetVehicleLocation()
        {
        }

        private FleetVehicleLocation(double? Latitude, string Location, double? Longitude, double? SpeedMilesPerHour, long? TimeMs)
        {
            
            this.Latitude = Latitude;
            
            this.Location = Location;
            
            this.Longitude = Longitude;
            
            this.SpeedMilesPerHour = SpeedMilesPerHour;
            
            this.TimeMs = TimeMs;
            
        }

        /// <summary>
        /// Returns builder of FleetVehicleLocation.
        /// </summary>
        /// <returns>FleetVehicleLocationBuilder</returns>
        public static FleetVehicleLocationBuilder Builder()
        {
            return new FleetVehicleLocationBuilder();
        }

        /// <summary>
        /// Returns FleetVehicleLocationBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>FleetVehicleLocationBuilder</returns>
        public FleetVehicleLocationBuilder With()
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

        public bool Equals(FleetVehicleLocation other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (FleetVehicleLocation.
        /// </summary>
        /// <param name="left">Compared (FleetVehicleLocation</param>
        /// <param name="right">Compared (FleetVehicleLocation</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (FleetVehicleLocation left, FleetVehicleLocation right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (FleetVehicleLocation.
        /// </summary>
        /// <param name="left">Compared (FleetVehicleLocation</param>
        /// <param name="right">Compared (FleetVehicleLocation</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (FleetVehicleLocation left, FleetVehicleLocation right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of FleetVehicleLocation.
        /// </summary>
        public sealed class FleetVehicleLocationBuilder
        {
            private double? _Latitude;
            private string _Location;
            private double? _Longitude;
            private double? _SpeedMilesPerHour;
            private long? _TimeMs;

            internal FleetVehicleLocationBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for FleetVehicleLocation.Latitude property.
            /// </summary>
            /// <param name="value">The latitude of the location in degrees.</param>
            public FleetVehicleLocationBuilder Latitude(double? value)
            {
                _Latitude = value;
                return this;
            }

            /// <summary>
            /// Sets value for FleetVehicleLocation.Location property.
            /// </summary>
            /// <param name="value">The best effort (street,city,state) for the latitude and longitude.</param>
            public FleetVehicleLocationBuilder Location(string value)
            {
                _Location = value;
                return this;
            }

            /// <summary>
            /// Sets value for FleetVehicleLocation.Longitude property.
            /// </summary>
            /// <param name="value">The longitude of the location in degrees.</param>
            public FleetVehicleLocationBuilder Longitude(double? value)
            {
                _Longitude = value;
                return this;
            }

            /// <summary>
            /// Sets value for FleetVehicleLocation.SpeedMilesPerHour property.
            /// </summary>
            /// <param name="value">The speed calculated from GPS that the asset was traveling at in miles per hour.</param>
            public FleetVehicleLocationBuilder SpeedMilesPerHour(double? value)
            {
                _SpeedMilesPerHour = value;
                return this;
            }

            /// <summary>
            /// Sets value for FleetVehicleLocation.TimeMs property.
            /// </summary>
            /// <param name="value">Time in Unix milliseconds since epoch when the asset was at the location.</param>
            public FleetVehicleLocationBuilder TimeMs(long? value)
            {
                _TimeMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of FleetVehicleLocation.
            /// </summary>
            /// <returns>FleetVehicleLocation</returns>
            public FleetVehicleLocation Build()
            {
                Validate();
                return new FleetVehicleLocation(
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