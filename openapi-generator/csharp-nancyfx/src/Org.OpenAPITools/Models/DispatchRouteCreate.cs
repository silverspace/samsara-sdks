using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DispatchRouteCreate
    /// </summary>
    public sealed class DispatchRouteCreate:  IEquatable<DispatchRouteCreate>
    { 
        /// <summary>
        /// The time in Unix epoch milliseconds that the route actually ended.
        /// </summary>
        public long? ActualEndMs { get; private set; }

        /// <summary>
        /// The time in Unix epoch milliseconds that the route actually started.
        /// </summary>
        public long? ActualStartMs { get; private set; }

        /// <summary>
        /// ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
        /// </summary>
        public long? DriverId { get; private set; }

        /// <summary>
        /// ID of the group if the organization has multiple groups (optional).
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Descriptive name of this route.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
        /// </summary>
        public long? ScheduledEndMs { get; private set; }

        /// <summary>
        /// The distance expected to be traveled for this route in meters.
        /// </summary>
        public long? ScheduledMeters { get; private set; }

        /// <summary>
        /// The time in Unix epoch milliseconds that the route is scheduled to start.
        /// </summary>
        public long? ScheduledStartMs { get; private set; }

        /// <summary>
        /// The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
        /// </summary>
        public string StartLocationAddress { get; private set; }

        /// <summary>
        /// ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
        /// </summary>
        public long? StartLocationAddressId { get; private set; }

        /// <summary>
        /// Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
        /// </summary>
        public double? StartLocationLat { get; private set; }

        /// <summary>
        /// Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
        /// </summary>
        public double? StartLocationLng { get; private set; }

        /// <summary>
        /// The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
        /// </summary>
        public string StartLocationName { get; private set; }

        /// <summary>
        /// ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
        /// </summary>
        public long? TrailerId { get; private set; }

        /// <summary>
        /// ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
        /// </summary>
        public long? VehicleId { get; private set; }

        /// <summary>
        /// The dispatch jobs to create for this route.
        /// </summary>
        public List<DispatchJobCreate> DispatchJobs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DispatchRouteCreate.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DispatchRouteCreate()
        {
        }

        private DispatchRouteCreate(long? ActualEndMs, long? ActualStartMs, long? DriverId, long? GroupId, string Name, long? ScheduledEndMs, long? ScheduledMeters, long? ScheduledStartMs, string StartLocationAddress, long? StartLocationAddressId, double? StartLocationLat, double? StartLocationLng, string StartLocationName, long? TrailerId, long? VehicleId, List<DispatchJobCreate> DispatchJobs)
        {
            
            this.ActualEndMs = ActualEndMs;
            
            this.ActualStartMs = ActualStartMs;
            
            this.DriverId = DriverId;
            
            this.GroupId = GroupId;
            
            this.Name = Name;
            
            this.ScheduledEndMs = ScheduledEndMs;
            
            this.ScheduledMeters = ScheduledMeters;
            
            this.ScheduledStartMs = ScheduledStartMs;
            
            this.StartLocationAddress = StartLocationAddress;
            
            this.StartLocationAddressId = StartLocationAddressId;
            
            this.StartLocationLat = StartLocationLat;
            
            this.StartLocationLng = StartLocationLng;
            
            this.StartLocationName = StartLocationName;
            
            this.TrailerId = TrailerId;
            
            this.VehicleId = VehicleId;
            
            this.DispatchJobs = DispatchJobs;
            
        }

        /// <summary>
        /// Returns builder of DispatchRouteCreate.
        /// </summary>
        /// <returns>DispatchRouteCreateBuilder</returns>
        public static DispatchRouteCreateBuilder Builder()
        {
            return new DispatchRouteCreateBuilder();
        }

        /// <summary>
        /// Returns DispatchRouteCreateBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DispatchRouteCreateBuilder</returns>
        public DispatchRouteCreateBuilder With()
        {
            return Builder()
                .ActualEndMs(ActualEndMs)
                .ActualStartMs(ActualStartMs)
                .DriverId(DriverId)
                .GroupId(GroupId)
                .Name(Name)
                .ScheduledEndMs(ScheduledEndMs)
                .ScheduledMeters(ScheduledMeters)
                .ScheduledStartMs(ScheduledStartMs)
                .StartLocationAddress(StartLocationAddress)
                .StartLocationAddressId(StartLocationAddressId)
                .StartLocationLat(StartLocationLat)
                .StartLocationLng(StartLocationLng)
                .StartLocationName(StartLocationName)
                .TrailerId(TrailerId)
                .VehicleId(VehicleId)
                .DispatchJobs(DispatchJobs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DispatchRouteCreate other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DispatchRouteCreate.
        /// </summary>
        /// <param name="left">Compared (DispatchRouteCreate</param>
        /// <param name="right">Compared (DispatchRouteCreate</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DispatchRouteCreate left, DispatchRouteCreate right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DispatchRouteCreate.
        /// </summary>
        /// <param name="left">Compared (DispatchRouteCreate</param>
        /// <param name="right">Compared (DispatchRouteCreate</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DispatchRouteCreate left, DispatchRouteCreate right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DispatchRouteCreate.
        /// </summary>
        public sealed class DispatchRouteCreateBuilder
        {
            private long? _ActualEndMs;
            private long? _ActualStartMs;
            private long? _DriverId;
            private long? _GroupId;
            private string _Name;
            private long? _ScheduledEndMs;
            private long? _ScheduledMeters;
            private long? _ScheduledStartMs;
            private string _StartLocationAddress;
            private long? _StartLocationAddressId;
            private double? _StartLocationLat;
            private double? _StartLocationLng;
            private string _StartLocationName;
            private long? _TrailerId;
            private long? _VehicleId;
            private List<DispatchJobCreate> _DispatchJobs;

            internal DispatchRouteCreateBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.ActualEndMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the route actually ended.</param>
            public DispatchRouteCreateBuilder ActualEndMs(long? value)
            {
                _ActualEndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.ActualStartMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the route actually started.</param>
            public DispatchRouteCreateBuilder ActualStartMs(long? value)
            {
                _ActualStartMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.DriverId property.
            /// </summary>
            /// <param name="value">ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.</param>
            public DispatchRouteCreateBuilder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.GroupId property.
            /// </summary>
            /// <param name="value">ID of the group if the organization has multiple groups (optional).</param>
            public DispatchRouteCreateBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.Name property.
            /// </summary>
            /// <param name="value">Descriptive name of this route.</param>
            public DispatchRouteCreateBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.ScheduledEndMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the last job in the route is scheduled to end.</param>
            public DispatchRouteCreateBuilder ScheduledEndMs(long? value)
            {
                _ScheduledEndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.ScheduledMeters property.
            /// </summary>
            /// <param name="value">The distance expected to be traveled for this route in meters.</param>
            public DispatchRouteCreateBuilder ScheduledMeters(long? value)
            {
                _ScheduledMeters = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.ScheduledStartMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the route is scheduled to start.</param>
            public DispatchRouteCreateBuilder ScheduledStartMs(long? value)
            {
                _ScheduledStartMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.StartLocationAddress property.
            /// </summary>
            /// <param name="value">The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.</param>
            public DispatchRouteCreateBuilder StartLocationAddress(string value)
            {
                _StartLocationAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.StartLocationAddressId property.
            /// </summary>
            /// <param name="value">ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.</param>
            public DispatchRouteCreateBuilder StartLocationAddressId(long? value)
            {
                _StartLocationAddressId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.StartLocationLat property.
            /// </summary>
            /// <param name="value">Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</param>
            public DispatchRouteCreateBuilder StartLocationLat(double? value)
            {
                _StartLocationLat = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.StartLocationLng property.
            /// </summary>
            /// <param name="value">Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</param>
            public DispatchRouteCreateBuilder StartLocationLng(double? value)
            {
                _StartLocationLng = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.StartLocationName property.
            /// </summary>
            /// <param name="value">The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.</param>
            public DispatchRouteCreateBuilder StartLocationName(string value)
            {
                _StartLocationName = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.TrailerId property.
            /// </summary>
            /// <param name="value">ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.</param>
            public DispatchRouteCreateBuilder TrailerId(long? value)
            {
                _TrailerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.VehicleId property.
            /// </summary>
            /// <param name="value">ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.</param>
            public DispatchRouteCreateBuilder VehicleId(long? value)
            {
                _VehicleId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteCreate.DispatchJobs property.
            /// </summary>
            /// <param name="value">The dispatch jobs to create for this route.</param>
            public DispatchRouteCreateBuilder DispatchJobs(List<DispatchJobCreate> value)
            {
                _DispatchJobs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DispatchRouteCreate.
            /// </summary>
            /// <returns>DispatchRouteCreate</returns>
            public DispatchRouteCreate Build()
            {
                Validate();
                return new DispatchRouteCreate(
                    ActualEndMs: _ActualEndMs,
                    ActualStartMs: _ActualStartMs,
                    DriverId: _DriverId,
                    GroupId: _GroupId,
                    Name: _Name,
                    ScheduledEndMs: _ScheduledEndMs,
                    ScheduledMeters: _ScheduledMeters,
                    ScheduledStartMs: _ScheduledStartMs,
                    StartLocationAddress: _StartLocationAddress,
                    StartLocationAddressId: _StartLocationAddressId,
                    StartLocationLat: _StartLocationLat,
                    StartLocationLng: _StartLocationLng,
                    StartLocationName: _StartLocationName,
                    TrailerId: _TrailerId,
                    VehicleId: _VehicleId,
                    DispatchJobs: _DispatchJobs
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for DispatchRouteCreate and cannot be null");
                } 
                if (_ScheduledEndMs == null)
                {
                    throw new ArgumentException("ScheduledEndMs is a required property for DispatchRouteCreate and cannot be null");
                } 
                if (_ScheduledStartMs == null)
                {
                    throw new ArgumentException("ScheduledStartMs is a required property for DispatchRouteCreate and cannot be null");
                } 
                if (_DispatchJobs == null)
                {
                    throw new ArgumentException("DispatchJobs is a required property for DispatchRouteCreate and cannot be null");
                } 
            }
        }

        
    }
}