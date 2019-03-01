using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Information about a polygon geofence. This field is only populated if the geofence is a polygon.
    /// </summary>
    public sealed class AddressGeofencePolygon:  IEquatable<AddressGeofencePolygon>
    { 
        /// <summary>
        /// The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
        /// </summary>
        public List<AddressGeofencePolygonVertices> Vertices { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AddressGeofencePolygon.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AddressGeofencePolygon()
        {
        }

        private AddressGeofencePolygon(List<AddressGeofencePolygonVertices> Vertices)
        {
            
            this.Vertices = Vertices;
            
        }

        /// <summary>
        /// Returns builder of AddressGeofencePolygon.
        /// </summary>
        /// <returns>AddressGeofencePolygonBuilder</returns>
        public static AddressGeofencePolygonBuilder Builder()
        {
            return new AddressGeofencePolygonBuilder();
        }

        /// <summary>
        /// Returns AddressGeofencePolygonBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AddressGeofencePolygonBuilder</returns>
        public AddressGeofencePolygonBuilder With()
        {
            return Builder()
                .Vertices(Vertices);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AddressGeofencePolygon other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AddressGeofencePolygon.
        /// </summary>
        /// <param name="left">Compared (AddressGeofencePolygon</param>
        /// <param name="right">Compared (AddressGeofencePolygon</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AddressGeofencePolygon left, AddressGeofencePolygon right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AddressGeofencePolygon.
        /// </summary>
        /// <param name="left">Compared (AddressGeofencePolygon</param>
        /// <param name="right">Compared (AddressGeofencePolygon</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AddressGeofencePolygon left, AddressGeofencePolygon right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AddressGeofencePolygon.
        /// </summary>
        public sealed class AddressGeofencePolygonBuilder
        {
            private List<AddressGeofencePolygonVertices> _Vertices;

            internal AddressGeofencePolygonBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AddressGeofencePolygon.Vertices property.
            /// </summary>
            /// <param name="value">The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.</param>
            public AddressGeofencePolygonBuilder Vertices(List<AddressGeofencePolygonVertices> value)
            {
                _Vertices = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AddressGeofencePolygon.
            /// </summary>
            /// <returns>AddressGeofencePolygon</returns>
            public AddressGeofencePolygon Build()
            {
                Validate();
                return new AddressGeofencePolygon(
                    Vertices: _Vertices
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}