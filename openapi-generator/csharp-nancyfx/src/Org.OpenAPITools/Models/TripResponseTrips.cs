using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TripResponseTrips
    /// </summary>
    public sealed class TripResponseTrips:  IEquatable<TripResponseTrips>
    { 
        /// <summary>
        /// Odometer reading at the end of the trip.
        /// </summary>
        public int? EndOdometer { get; private set; }

        /// <summary>
        /// Length of the trip in meters.
        /// </summary>
        public int? DistanceMeters { get; private set; }

        /// <summary>
        /// End of the trip in UNIX milliseconds.
        /// </summary>
        public int? EndMs { get; private set; }

        /// <summary>
        /// Beginning of the trip in UNIX milliseconds.
        /// </summary>
        public int? StartMs { get; private set; }

        /// <summary>
        /// Amount in milliliters of fuel consumed on this trip.
        /// </summary>
        public int? FuelConsumedMl { get; private set; }

        /// <summary>
        /// Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
        /// </summary>
        public string StartAddress { get; private set; }

        /// <summary>
        /// StartCoordinates
        /// </summary>
        public TripResponseStartCoordinates StartCoordinates { get; private set; }

        /// <summary>
        /// EndCoordinates
        /// </summary>
        public TripResponseEndCoordinates EndCoordinates { get; private set; }

        /// <summary>
        /// Odometer reading at the beginning of the trip.
        /// </summary>
        public int? StartOdometer { get; private set; }

        /// <summary>
        /// ID of the driver.
        /// </summary>
        public int? DriverId { get; private set; }

        /// <summary>
        /// Geocoded street address of start (latitude, longitude) coordinates.
        /// </summary>
        public string StartLocation { get; private set; }

        /// <summary>
        /// Length in meters trip spent on toll roads.
        /// </summary>
        public int? TollMeters { get; private set; }

        /// <summary>
        /// Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
        /// </summary>
        public string EndAddress { get; private set; }

        /// <summary>
        /// Geocoded street address of start (latitude, longitude) coordinates.
        /// </summary>
        public string EndLocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TripResponseTrips.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TripResponseTrips()
        {
        }

        private TripResponseTrips(int? EndOdometer, int? DistanceMeters, int? EndMs, int? StartMs, int? FuelConsumedMl, string StartAddress, TripResponseStartCoordinates StartCoordinates, TripResponseEndCoordinates EndCoordinates, int? StartOdometer, int? DriverId, string StartLocation, int? TollMeters, string EndAddress, string EndLocation)
        {
            
            this.EndOdometer = EndOdometer;
            
            this.DistanceMeters = DistanceMeters;
            
            this.EndMs = EndMs;
            
            this.StartMs = StartMs;
            
            this.FuelConsumedMl = FuelConsumedMl;
            
            this.StartAddress = StartAddress;
            
            this.StartCoordinates = StartCoordinates;
            
            this.EndCoordinates = EndCoordinates;
            
            this.StartOdometer = StartOdometer;
            
            this.DriverId = DriverId;
            
            this.StartLocation = StartLocation;
            
            this.TollMeters = TollMeters;
            
            this.EndAddress = EndAddress;
            
            this.EndLocation = EndLocation;
            
        }

        /// <summary>
        /// Returns builder of TripResponseTrips.
        /// </summary>
        /// <returns>TripResponseTripsBuilder</returns>
        public static TripResponseTripsBuilder Builder()
        {
            return new TripResponseTripsBuilder();
        }

        /// <summary>
        /// Returns TripResponseTripsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TripResponseTripsBuilder</returns>
        public TripResponseTripsBuilder With()
        {
            return Builder()
                .EndOdometer(EndOdometer)
                .DistanceMeters(DistanceMeters)
                .EndMs(EndMs)
                .StartMs(StartMs)
                .FuelConsumedMl(FuelConsumedMl)
                .StartAddress(StartAddress)
                .StartCoordinates(StartCoordinates)
                .EndCoordinates(EndCoordinates)
                .StartOdometer(StartOdometer)
                .DriverId(DriverId)
                .StartLocation(StartLocation)
                .TollMeters(TollMeters)
                .EndAddress(EndAddress)
                .EndLocation(EndLocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(TripResponseTrips other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TripResponseTrips.
        /// </summary>
        /// <param name="left">Compared (TripResponseTrips</param>
        /// <param name="right">Compared (TripResponseTrips</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TripResponseTrips left, TripResponseTrips right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TripResponseTrips.
        /// </summary>
        /// <param name="left">Compared (TripResponseTrips</param>
        /// <param name="right">Compared (TripResponseTrips</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TripResponseTrips left, TripResponseTrips right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TripResponseTrips.
        /// </summary>
        public sealed class TripResponseTripsBuilder
        {
            private int? _EndOdometer;
            private int? _DistanceMeters;
            private int? _EndMs;
            private int? _StartMs;
            private int? _FuelConsumedMl;
            private string _StartAddress;
            private TripResponseStartCoordinates _StartCoordinates;
            private TripResponseEndCoordinates _EndCoordinates;
            private int? _StartOdometer;
            private int? _DriverId;
            private string _StartLocation;
            private int? _TollMeters;
            private string _EndAddress;
            private string _EndLocation;

            internal TripResponseTripsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TripResponseTrips.EndOdometer property.
            /// </summary>
            /// <param name="value">Odometer reading at the end of the trip.</param>
            public TripResponseTripsBuilder EndOdometer(int? value)
            {
                _EndOdometer = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.DistanceMeters property.
            /// </summary>
            /// <param name="value">Length of the trip in meters.</param>
            public TripResponseTripsBuilder DistanceMeters(int? value)
            {
                _DistanceMeters = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.EndMs property.
            /// </summary>
            /// <param name="value">End of the trip in UNIX milliseconds.</param>
            public TripResponseTripsBuilder EndMs(int? value)
            {
                _EndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.StartMs property.
            /// </summary>
            /// <param name="value">Beginning of the trip in UNIX milliseconds.</param>
            public TripResponseTripsBuilder StartMs(int? value)
            {
                _StartMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.FuelConsumedMl property.
            /// </summary>
            /// <param name="value">Amount in milliliters of fuel consumed on this trip.</param>
            public TripResponseTripsBuilder FuelConsumedMl(int? value)
            {
                _FuelConsumedMl = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.StartAddress property.
            /// </summary>
            /// <param name="value">Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.</param>
            public TripResponseTripsBuilder StartAddress(string value)
            {
                _StartAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.StartCoordinates property.
            /// </summary>
            /// <param name="value">StartCoordinates</param>
            public TripResponseTripsBuilder StartCoordinates(TripResponseStartCoordinates value)
            {
                _StartCoordinates = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.EndCoordinates property.
            /// </summary>
            /// <param name="value">EndCoordinates</param>
            public TripResponseTripsBuilder EndCoordinates(TripResponseEndCoordinates value)
            {
                _EndCoordinates = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.StartOdometer property.
            /// </summary>
            /// <param name="value">Odometer reading at the beginning of the trip.</param>
            public TripResponseTripsBuilder StartOdometer(int? value)
            {
                _StartOdometer = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.DriverId property.
            /// </summary>
            /// <param name="value">ID of the driver.</param>
            public TripResponseTripsBuilder DriverId(int? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.StartLocation property.
            /// </summary>
            /// <param name="value">Geocoded street address of start (latitude, longitude) coordinates.</param>
            public TripResponseTripsBuilder StartLocation(string value)
            {
                _StartLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.TollMeters property.
            /// </summary>
            /// <param name="value">Length in meters trip spent on toll roads.</param>
            public TripResponseTripsBuilder TollMeters(int? value)
            {
                _TollMeters = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.EndAddress property.
            /// </summary>
            /// <param name="value">Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.</param>
            public TripResponseTripsBuilder EndAddress(string value)
            {
                _EndAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for TripResponseTrips.EndLocation property.
            /// </summary>
            /// <param name="value">Geocoded street address of start (latitude, longitude) coordinates.</param>
            public TripResponseTripsBuilder EndLocation(string value)
            {
                _EndLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TripResponseTrips.
            /// </summary>
            /// <returns>TripResponseTrips</returns>
            public TripResponseTrips Build()
            {
                Validate();
                return new TripResponseTrips(
                    EndOdometer: _EndOdometer,
                    DistanceMeters: _DistanceMeters,
                    EndMs: _EndMs,
                    StartMs: _StartMs,
                    FuelConsumedMl: _FuelConsumedMl,
                    StartAddress: _StartAddress,
                    StartCoordinates: _StartCoordinates,
                    EndCoordinates: _EndCoordinates,
                    StartOdometer: _StartOdometer,
                    DriverId: _DriverId,
                    StartLocation: _StartLocation,
                    TollMeters: _TollMeters,
                    EndAddress: _EndAddress,
                    EndLocation: _EndLocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}