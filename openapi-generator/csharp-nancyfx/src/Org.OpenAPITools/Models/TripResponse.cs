using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
    /// </summary>
    public sealed class TripResponse:  IEquatable<TripResponse>
    { 
        /// <summary>
        /// Trips
        /// </summary>
        public List<TripResponseTrips> Trips { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TripResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TripResponse()
        {
        }

        private TripResponse(List<TripResponseTrips> Trips)
        {
            
            this.Trips = Trips;
            
        }

        /// <summary>
        /// Returns builder of TripResponse.
        /// </summary>
        /// <returns>TripResponseBuilder</returns>
        public static TripResponseBuilder Builder()
        {
            return new TripResponseBuilder();
        }

        /// <summary>
        /// Returns TripResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TripResponseBuilder</returns>
        public TripResponseBuilder With()
        {
            return Builder()
                .Trips(Trips);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(TripResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TripResponse.
        /// </summary>
        /// <param name="left">Compared (TripResponse</param>
        /// <param name="right">Compared (TripResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TripResponse left, TripResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TripResponse.
        /// </summary>
        /// <param name="left">Compared (TripResponse</param>
        /// <param name="right">Compared (TripResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TripResponse left, TripResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TripResponse.
        /// </summary>
        public sealed class TripResponseBuilder
        {
            private List<TripResponseTrips> _Trips;

            internal TripResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TripResponse.Trips property.
            /// </summary>
            /// <param name="value">Trips</param>
            public TripResponseBuilder Trips(List<TripResponseTrips> value)
            {
                _Trips = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TripResponse.
            /// </summary>
            /// <returns>TripResponse</returns>
            public TripResponse Build()
            {
                Validate();
                return new TripResponse(
                    Trips: _Trips
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}