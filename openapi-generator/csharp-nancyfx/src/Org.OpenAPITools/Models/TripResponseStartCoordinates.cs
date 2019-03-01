using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Start (latitude, longitude) in decimal degrees.
    /// </summary>
    public sealed class TripResponseStartCoordinates:  IEquatable<TripResponseStartCoordinates>
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
        /// Use TripResponseStartCoordinates.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TripResponseStartCoordinates()
        {
        }

        private TripResponseStartCoordinates(double? Latitude, double? Longitude)
        {
            
            this.Latitude = Latitude;
            
            this.Longitude = Longitude;
            
        }

        /// <summary>
        /// Returns builder of TripResponseStartCoordinates.
        /// </summary>
        /// <returns>TripResponseStartCoordinatesBuilder</returns>
        public static TripResponseStartCoordinatesBuilder Builder()
        {
            return new TripResponseStartCoordinatesBuilder();
        }

        /// <summary>
        /// Returns TripResponseStartCoordinatesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TripResponseStartCoordinatesBuilder</returns>
        public TripResponseStartCoordinatesBuilder With()
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

        public bool Equals(TripResponseStartCoordinates other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TripResponseStartCoordinates.
        /// </summary>
        /// <param name="left">Compared (TripResponseStartCoordinates</param>
        /// <param name="right">Compared (TripResponseStartCoordinates</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TripResponseStartCoordinates left, TripResponseStartCoordinates right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TripResponseStartCoordinates.
        /// </summary>
        /// <param name="left">Compared (TripResponseStartCoordinates</param>
        /// <param name="right">Compared (TripResponseStartCoordinates</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TripResponseStartCoordinates left, TripResponseStartCoordinates right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TripResponseStartCoordinates.
        /// </summary>
        public sealed class TripResponseStartCoordinatesBuilder
        {
            private double? _Latitude;
            private double? _Longitude;

            internal TripResponseStartCoordinatesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TripResponseStartCoordinates.Latitude property.
            /// </summary>
            /// <param name="value">Latitude</param>
            public TripResponseStartCoordinatesBuilder Latitude(double? value)
            {
                _Latitude = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseStartCoordinates.Longitude property.
            /// </summary>
            /// <param name="value">Longitude</param>
            public TripResponseStartCoordinatesBuilder Longitude(double? value)
            {
                _Longitude = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TripResponseStartCoordinates.
            /// </summary>
            /// <returns>TripResponseStartCoordinates</returns>
            public TripResponseStartCoordinates Build()
            {
                Validate();
                return new TripResponseStartCoordinates(
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