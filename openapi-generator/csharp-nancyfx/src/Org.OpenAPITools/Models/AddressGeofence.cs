using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
    /// </summary>
    public sealed class AddressGeofence:  IEquatable<AddressGeofence>
    { 
        /// <summary>
        /// Circle
        /// </summary>
        public AddressGeofenceCircle Circle { get; private set; }

        /// <summary>
        /// Polygon
        /// </summary>
        public AddressGeofencePolygon Polygon { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AddressGeofence.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AddressGeofence()
        {
        }

        private AddressGeofence(AddressGeofenceCircle Circle, AddressGeofencePolygon Polygon)
        {
            
            this.Circle = Circle;
            
            this.Polygon = Polygon;
            
        }

        /// <summary>
        /// Returns builder of AddressGeofence.
        /// </summary>
        /// <returns>AddressGeofenceBuilder</returns>
        public static AddressGeofenceBuilder Builder()
        {
            return new AddressGeofenceBuilder();
        }

        /// <summary>
        /// Returns AddressGeofenceBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AddressGeofenceBuilder</returns>
        public AddressGeofenceBuilder With()
        {
            return Builder()
                .Circle(Circle)
                .Polygon(Polygon);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AddressGeofence other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AddressGeofence.
        /// </summary>
        /// <param name="left">Compared (AddressGeofence</param>
        /// <param name="right">Compared (AddressGeofence</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AddressGeofence left, AddressGeofence right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AddressGeofence.
        /// </summary>
        /// <param name="left">Compared (AddressGeofence</param>
        /// <param name="right">Compared (AddressGeofence</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AddressGeofence left, AddressGeofence right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AddressGeofence.
        /// </summary>
        public sealed class AddressGeofenceBuilder
        {
            private AddressGeofenceCircle _Circle;
            private AddressGeofencePolygon _Polygon;

            internal AddressGeofenceBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AddressGeofence.Circle property.
            /// </summary>
            /// <param name="value">Circle</param>
            public AddressGeofenceBuilder Circle(AddressGeofenceCircle value)
            {
                _Circle = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressGeofence.Polygon property.
            /// </summary>
            /// <param name="value">Polygon</param>
            public AddressGeofenceBuilder Polygon(AddressGeofencePolygon value)
            {
                _Polygon = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AddressGeofence.
            /// </summary>
            /// <returns>AddressGeofence</returns>
            public AddressGeofence Build()
            {
                Validate();
                return new AddressGeofence(
                    Circle: _Circle,
                    Polygon: _Polygon
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}