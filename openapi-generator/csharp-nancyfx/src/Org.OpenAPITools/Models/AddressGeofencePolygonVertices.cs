using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AddressGeofencePolygonVertices
    /// </summary>
    public sealed class AddressGeofencePolygonVertices:  IEquatable<AddressGeofencePolygonVertices>
    { 
        /// <summary>
        /// The longitude of a geofence vertex
        /// </summary>
        public double? Latitude { get; private set; }

        /// <summary>
        /// The longitude of a geofence vertex
        /// </summary>
        public double? Longitude { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AddressGeofencePolygonVertices.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AddressGeofencePolygonVertices()
        {
        }

        private AddressGeofencePolygonVertices(double? Latitude, double? Longitude)
        {
            
            this.Latitude = Latitude;
            
            this.Longitude = Longitude;
            
        }

        /// <summary>
        /// Returns builder of AddressGeofencePolygonVertices.
        /// </summary>
        /// <returns>AddressGeofencePolygonVerticesBuilder</returns>
        public static AddressGeofencePolygonVerticesBuilder Builder()
        {
            return new AddressGeofencePolygonVerticesBuilder();
        }

        /// <summary>
        /// Returns AddressGeofencePolygonVerticesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AddressGeofencePolygonVerticesBuilder</returns>
        public AddressGeofencePolygonVerticesBuilder With()
        {
            return Builder()
                .Latitude(Latitude)
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

        public bool Equals(AddressGeofencePolygonVertices other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AddressGeofencePolygonVertices.
        /// </summary>
        /// <param name="left">Compared (AddressGeofencePolygonVertices</param>
        /// <param name="right">Compared (AddressGeofencePolygonVertices</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AddressGeofencePolygonVertices left, AddressGeofencePolygonVertices right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AddressGeofencePolygonVertices.
        /// </summary>
        /// <param name="left">Compared (AddressGeofencePolygonVertices</param>
        /// <param name="right">Compared (AddressGeofencePolygonVertices</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AddressGeofencePolygonVertices left, AddressGeofencePolygonVertices right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AddressGeofencePolygonVertices.
        /// </summary>
        public sealed class AddressGeofencePolygonVerticesBuilder
        {
            private double? _Latitude;
            private double? _Longitude;

            internal AddressGeofencePolygonVerticesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AddressGeofencePolygonVertices.Latitude property.
            /// </summary>
            /// <param name="value">The longitude of a geofence vertex</param>
            public AddressGeofencePolygonVerticesBuilder Latitude(double? value)
            {
                _Latitude = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressGeofencePolygonVertices.Longitude property.
            /// </summary>
            /// <param name="value">The longitude of a geofence vertex</param>
            public AddressGeofencePolygonVerticesBuilder Longitude(double? value)
            {
                _Longitude = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AddressGeofencePolygonVertices.
            /// </summary>
            /// <returns>AddressGeofencePolygonVertices</returns>
            public AddressGeofencePolygonVertices Build()
            {
                Validate();
                return new AddressGeofencePolygonVertices(
                    Latitude: _Latitude,
                    Longitude: _Longitude
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}