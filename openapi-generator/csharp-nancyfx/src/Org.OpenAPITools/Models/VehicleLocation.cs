using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains the location, in latitude and longitude, of a vehicle.
    /// </summary>
    public sealed class VehicleLocation:  IEquatable<VehicleLocation>
    { 
        /// <summary>
        /// Heading in degrees.
        /// </summary>
        public double? Heading { get; private set; }

        /// <summary>
        /// ID of the vehicle.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Latitude in decimal degrees.
        /// </summary>
        public double? Latitude { get; private set; }

        /// <summary>
        /// Text representation of nearest identifiable location to (latitude, longitude) coordinates.
        /// </summary>
        public string Location { get; private set; }

        /// <summary>
        /// Longitude in decimal degrees.
        /// </summary>
        public double? Longitude { get; private set; }

        /// <summary>
        /// Name of the vehicle.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The number of meters reported by the odometer.
        /// </summary>
        public long? OdometerMeters { get; private set; }

        /// <summary>
        /// Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
        /// </summary>
        public bool? OnTrip { get; private set; }

        /// <summary>
        /// Speed in miles per hour.
        /// </summary>
        public double? Speed { get; private set; }

        /// <summary>
        /// The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
        /// </summary>
        public int? Time { get; private set; }

        /// <summary>
        /// Vehicle Identification Number (VIN) of the vehicle.
        /// </summary>
        public string Vin { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VehicleLocation.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VehicleLocation()
        {
        }

        private VehicleLocation(double? Heading, long? Id, double? Latitude, string Location, double? Longitude, string Name, long? OdometerMeters, bool? OnTrip, double? Speed, int? Time, string Vin)
        {
            
            this.Heading = Heading;
            
            this.Id = Id;
            
            this.Latitude = Latitude;
            
            this.Location = Location;
            
            this.Longitude = Longitude;
            
            this.Name = Name;
            
            this.OdometerMeters = OdometerMeters;
            
            this.OnTrip = OnTrip;
            
            this.Speed = Speed;
            
            this.Time = Time;
            
            this.Vin = Vin;
            
        }

        /// <summary>
        /// Returns builder of VehicleLocation.
        /// </summary>
        /// <returns>VehicleLocationBuilder</returns>
        public static VehicleLocationBuilder Builder()
        {
            return new VehicleLocationBuilder();
        }

        /// <summary>
        /// Returns VehicleLocationBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleLocationBuilder</returns>
        public VehicleLocationBuilder With()
        {
            return Builder()
                .Heading(Heading)
                .Id(Id)
                .Latitude(Latitude)
                .Location(Location)
                .Longitude(Longitude)
                .Name(Name)
                .OdometerMeters(OdometerMeters)
                .OnTrip(OnTrip)
                .Speed(Speed)
                .Time(Time)
                .Vin(Vin);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VehicleLocation other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VehicleLocation.
        /// </summary>
        /// <param name="left">Compared (VehicleLocation</param>
        /// <param name="right">Compared (VehicleLocation</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VehicleLocation left, VehicleLocation right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VehicleLocation.
        /// </summary>
        /// <param name="left">Compared (VehicleLocation</param>
        /// <param name="right">Compared (VehicleLocation</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VehicleLocation left, VehicleLocation right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VehicleLocation.
        /// </summary>
        public sealed class VehicleLocationBuilder
        {
            private double? _Heading;
            private long? _Id;
            private double? _Latitude;
            private string _Location;
            private double? _Longitude;
            private string _Name;
            private long? _OdometerMeters;
            private bool? _OnTrip;
            private double? _Speed;
            private int? _Time;
            private string _Vin;

            internal VehicleLocationBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VehicleLocation.Heading property.
            /// </summary>
            /// <param name="value">Heading in degrees.</param>
            public VehicleLocationBuilder Heading(double? value)
            {
                _Heading = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleLocation.Id property.
            /// </summary>
            /// <param name="value">ID of the vehicle.</param>
            public VehicleLocationBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleLocation.Latitude property.
            /// </summary>
            /// <param name="value">Latitude in decimal degrees.</param>
            public VehicleLocationBuilder Latitude(double? value)
            {
                _Latitude = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleLocation.Location property.
            /// </summary>
            /// <param name="value">Text representation of nearest identifiable location to (latitude, longitude) coordinates.</param>
            public VehicleLocationBuilder Location(string value)
            {
                _Location = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleLocation.Longitude property.
            /// </summary>
            /// <param name="value">Longitude in decimal degrees.</param>
            public VehicleLocationBuilder Longitude(double? value)
            {
                _Longitude = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleLocation.Name property.
            /// </summary>
            /// <param name="value">Name of the vehicle.</param>
            public VehicleLocationBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleLocation.OdometerMeters property.
            /// </summary>
            /// <param name="value">The number of meters reported by the odometer.</param>
            public VehicleLocationBuilder OdometerMeters(long? value)
            {
                _OdometerMeters = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleLocation.OnTrip property.
            /// </summary>
            /// <param name="value">Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.</param>
            public VehicleLocationBuilder OnTrip(bool? value)
            {
                _OnTrip = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleLocation.Speed property.
            /// </summary>
            /// <param name="value">Speed in miles per hour.</param>
            public VehicleLocationBuilder Speed(double? value)
            {
                _Speed = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleLocation.Time property.
            /// </summary>
            /// <param name="value">The time the reported location was logged, reported as a UNIX timestamp in milliseconds.</param>
            public VehicleLocationBuilder Time(int? value)
            {
                _Time = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleLocation.Vin property.
            /// </summary>
            /// <param name="value">Vehicle Identification Number (VIN) of the vehicle.</param>
            public VehicleLocationBuilder Vin(string value)
            {
                _Vin = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VehicleLocation.
            /// </summary>
            /// <returns>VehicleLocation</returns>
            public VehicleLocation Build()
            {
                Validate();
                return new VehicleLocation(
                    Heading: _Heading,
                    Id: _Id,
                    Latitude: _Latitude,
                    Location: _Location,
                    Longitude: _Longitude,
                    Name: _Name,
                    OdometerMeters: _OdometerMeters,
                    OnTrip: _OnTrip,
                    Speed: _Speed,
                    Time: _Time,
                    Vin: _Vin
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for VehicleLocation and cannot be null");
                } 
            }
        }

        
    }
}