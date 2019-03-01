using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// End (latitude, longitude) in decimal degrees.
    /// </summary>
    public sealed class TripResponseEndCoordinates:  IEquatable<TripResponseEndCoordinates>
    { 
        /// <summary>
        /// Latitude
        /// </summary>
        public double? Latitude { get; private set; }

        /// <summary>
        /// Longitude
        /// </summary>
        public double? Longitude { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TripResponseEndCoordinates.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TripResponseEndCoordinates()
        {
        }

        private TripResponseEndCoordinates(double? Latitude, double? Longitude)
        {
            
            this.Latitude = Latitude;
            
            this.Longitude = Longitude;
            
        }

        /// <summary>
        /// Returns builder of TripResponseEndCoordinates.
        /// </summary>
        /// <returns>TripResponseEndCoordinatesBuilder</returns>
        public static TripResponseEndCoordinatesBuilder Builder()
        {
            return new TripResponseEndCoordinatesBuilder();
        }

        /// <summary>
        /// Returns TripResponseEndCoordinatesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TripResponseEndCoordinatesBuilder</returns>
        public TripResponseEndCoordinatesBuilder With()
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

        public bool Equals(TripResponseEndCoordinates other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TripResponseEndCoordinates.
        /// </summary>
        /// <param name="left">Compared (TripResponseEndCoordinates</param>
        /// <param name="right">Compared (TripResponseEndCoordinates</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TripResponseEndCoordinates left, TripResponseEndCoordinates right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TripResponseEndCoordinates.
        /// </summary>
        /// <param name="left">Compared (TripResponseEndCoordinates</param>
        /// <param name="right">Compared (TripResponseEndCoordinates</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TripResponseEndCoordinates left, TripResponseEndCoordinates right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TripResponseEndCoordinates.
        /// </summary>
        public sealed class TripResponseEndCoordinatesBuilder
        {
            private double? _Latitude;
            private double? _Longitude;

            internal TripResponseEndCoordinatesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TripResponseEndCoordinates.Latitude property.
            /// </summary>
            /// <param name="value">Latitude</param>
            public TripResponseEndCoordinatesBuilder Latitude(double? value)
            {
                _Latitude = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseEndCoordinates.Longitude property.
            /// </summary>
            /// <param name="value">Longitude</param>
            public TripResponseEndCoordinatesBuilder Longitude(double? value)
            {
                _Longitude = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TripResponseEndCoordinates.
            /// </summary>
            /// <returns>TripResponseEndCoordinates</returns>
            public TripResponseEndCoordinates Build()
            {
                Validate();
                return new TripResponseEndCoordinates(
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