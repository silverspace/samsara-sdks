using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DispatchRoute
    /// </summary>
    public sealed class DispatchRoute:  IEquatable<DispatchRoute>
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
        /// The dispatch jobs associated with this route.
        /// </summary>
        public List<DispatchJob> DispatchJobs { get; private set; }

        /// <summary>
        /// ID of the Samsara dispatch route.
        /// </summary>
        public long? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DispatchRoute.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DispatchRoute()
        {
        }

        private DispatchRoute(long? ActualEndMs, long? ActualStartMs, long? DriverId, long? GroupId, string Name, long? ScheduledEndMs, long? ScheduledMeters, long? ScheduledStartMs, string StartLocationAddress, long? StartLocationAddressId, double? StartLocationLat, double? StartLocationLng, string StartLocationName, long? TrailerId, long? VehicleId, List<DispatchJob> DispatchJobs, long? Id)
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
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of DispatchRoute.
        /// </summary>
        /// <returns>DispatchRouteBuilder</returns>
        public static DispatchRouteBuilder Builder()
        {
            return new DispatchRouteBuilder();
        }

        /// <summary>
        /// Returns DispatchRouteBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DispatchRouteBuilder</returns>
        public DispatchRouteBuilder With()
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
                .DispatchJobs(DispatchJobs)
                .Id(Id);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DispatchRoute other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DispatchRoute.
        /// </summary>
        /// <param name="left">Compared (DispatchRoute</param>
        /// <param name="right">Compared (DispatchRoute</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DispatchRoute left, DispatchRoute right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DispatchRoute.
        /// </summary>
        /// <param name="left">Compared (DispatchRoute</param>
        /// <param name="right">Compared (DispatchRoute</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DispatchRoute left, DispatchRoute right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DispatchRoute.
        /// </summary>
        public sealed class DispatchRouteBuilder
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
            private List<DispatchJob> _DispatchJobs;
            private long? _Id;

            internal DispatchRouteBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DispatchRoute.ActualEndMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the route actually ended.</param>
            public DispatchRouteBuilder ActualEndMs(long? value)
            {
                _ActualEndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.ActualStartMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the route actually started.</param>
            public DispatchRouteBuilder ActualStartMs(long? value)
            {
                _ActualStartMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.DriverId property.
            /// </summary>
            /// <param name="value">ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.</param>
            public DispatchRouteBuilder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.GroupId property.
            /// </summary>
            /// <param name="value">ID of the group if the organization has multiple groups (optional).</param>
            public DispatchRouteBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.Name property.
            /// </summary>
            /// <param name="value">Descriptive name of this route.</param>
            public DispatchRouteBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.ScheduledEndMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the last job in the route is scheduled to end.</param>
            public DispatchRouteBuilder ScheduledEndMs(long? value)
            {
                _ScheduledEndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.ScheduledMeters property.
            /// </summary>
            /// <param name="value">The distance expected to be traveled for this route in meters.</param>
            public DispatchRouteBuilder ScheduledMeters(long? value)
            {
                _ScheduledMeters = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.ScheduledStartMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the route is scheduled to start.</param>
            public DispatchRouteBuilder ScheduledStartMs(long? value)
            {
                _ScheduledStartMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.StartLocationAddress property.
            /// </summary>
            /// <param name="value">The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.</param>
            public DispatchRouteBuilder StartLocationAddress(string value)
            {
                _StartLocationAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.StartLocationAddressId property.
            /// </summary>
            /// <param name="value">ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.</param>
            public DispatchRouteBuilder StartLocationAddressId(long? value)
            {
                _StartLocationAddressId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.StartLocationLat property.
            /// </summary>
            /// <param name="value">Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</param>
            public DispatchRouteBuilder StartLocationLat(double? value)
            {
                _StartLocationLat = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.StartLocationLng property.
            /// </summary>
            /// <param name="value">Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</param>
            public DispatchRouteBuilder StartLocationLng(double? value)
            {
                _StartLocationLng = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.StartLocationName property.
            /// </summary>
            /// <param name="value">The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.</param>
            public DispatchRouteBuilder StartLocationName(string value)
            {
                _StartLocationName = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.TrailerId property.
            /// </summary>
            /// <param name="value">ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.</param>
            public DispatchRouteBuilder TrailerId(long? value)
            {
                _TrailerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.VehicleId property.
            /// </summary>
            /// <param name="value">ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.</param>
            public DispatchRouteBuilder VehicleId(long? value)
            {
                _VehicleId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.DispatchJobs property.
            /// </summary>
            /// <param name="value">The dispatch jobs associated with this route.</param>
            public DispatchRouteBuilder DispatchJobs(List<DispatchJob> value)
            {
                _DispatchJobs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRoute.Id property.
            /// </summary>
            /// <param name="value">ID of the Samsara dispatch route.</param>
            public DispatchRouteBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DispatchRoute.
            /// </summary>
            /// <returns>DispatchRoute</returns>
            public DispatchRoute Build()
            {
                Validate();
                return new DispatchRoute(
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
                    DispatchJobs: _DispatchJobs,
                    Id: _Id
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for DispatchRoute and cannot be null");
                } 
                if (_ScheduledEndMs == null)
                {
                    throw new ArgumentException("ScheduledEndMs is a required property for DispatchRoute and cannot be null");
                } 
                if (_ScheduledStartMs == null)
                {
                    throw new ArgumentException("ScheduledStartMs is a required property for DispatchRoute and cannot be null");
                } 
                if (_DispatchJobs == null)
                {
                    throw new ArgumentException("DispatchJobs is a required property for DispatchRoute and cannot be null");
                } 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for DispatchRoute and cannot be null");
                } 
            }
        }

        
    }
}