using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Information about a circular geofence. This field is only populated if the geofence is a circle.
    /// </summary>
    public sealed class AddressGeofenceCircle:  IEquatable<AddressGeofenceCircle>
    { 
        /// <summary>
        /// The latitude of the center of the circular geofence
        /// </summary>
        public double? Latitude { get; private set; }

        /// <summary>
        /// The radius of the circular geofence
        /// </summary>
        public long? RadiusMeters { get; private set; }

        /// <summary>
        /// The longitude of the center of the circular geofence
        /// </summary>
        public double? Longitude { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AddressGeofenceCircle.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AddressGeofenceCircle()
        {
        }

        private AddressGeofenceCircle(double? Latitude, long? RadiusMeters, double? Longitude)
        {
            
            this.Latitude = Latitude;
            
            this.RadiusMeters = RadiusMeters;
            
            this.Longitude = Longitude;
            
        }

        /// <summary>
        /// Returns builder of AddressGeofenceCircle.
        /// </summary>
        /// <returns>AddressGeofenceCircleBuilder</returns>
        public static AddressGeofenceCircleBuilder Builder()
        {
            return new AddressGeofenceCircleBuilder();
        }

        /// <summary>
        /// Returns AddressGeofenceCircleBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AddressGeofenceCircleBuilder</returns>
        public AddressGeofenceCircleBuilder With()
        {
            return Builder()
                .Latitude(Latitude)
                .RadiusMeters(RadiusMeters)
                .Longitude(Longitude);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AddressGeofenceCircle other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AddressGeofenceCircle.
        /// </summary>
        /// <param name="left">Compared (AddressGeofenceCircle</param>
        /// <param name="right">Compared (AddressGeofenceCircle</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AddressGeofenceCircle left, AddressGeofenceCircle right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AddressGeofenceCircle.
        /// </summary>
        /// <param name="left">Compared (AddressGeofenceCircle</param>
        /// <param name="right">Compared (AddressGeofenceCircle</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AddressGeofenceCircle left, AddressGeofenceCircle right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AddressGeofenceCircle.
        /// </summary>
        public sealed class AddressGeofenceCircleBuilder
        {
            private double? _Latitude;
            private long? _RadiusMeters;
            private double? _Longitude;

            internal AddressGeofenceCircleBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AddressGeofenceCircle.Latitude property.
            /// </summary>
            /// <param name="value">The latitude of the center of the circular geofence</param>
            public AddressGeofenceCircleBuilder Latitude(double? value)
            {
                _Latitude = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressGeofenceCircle.RadiusMeters property.
            /// </summary>
            /// <param name="value">The radius of the circular geofence</param>
            public AddressGeofenceCircleBuilder RadiusMeters(long? value)
            {
                _RadiusMeters = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressGeofenceCircle.Longitude property.
            /// </summary>
            /// <param name="value">The longitude of the center of the circular geofence</param>
            public AddressGeofenceCircleBuilder Longitude(double? value)
            {
                _Longitude = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AddressGeofenceCircle.
            /// </summary>
            /// <returns>AddressGeofenceCircle</returns>
            public AddressGeofenceCircle Build()
            {
                Validate();
                return new AddressGeofenceCircle(
                    Latitude: _Latitude,
                    RadiusMeters: _RadiusMeters,
                    Longitude: _Longitude
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}