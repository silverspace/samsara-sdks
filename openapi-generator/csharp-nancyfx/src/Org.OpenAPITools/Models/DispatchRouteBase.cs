using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DispatchRouteBase
    /// </summary>
    public sealed class DispatchRouteBase:  IEquatable<DispatchRouteBase>
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
        /// Empty constructor required by some serializers.
        /// Use DispatchRouteBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DispatchRouteBase()
        {
        }

        private DispatchRouteBase(long? ActualEndMs, long? ActualStartMs, long? DriverId, long? GroupId, string Name, long? ScheduledEndMs, long? ScheduledMeters, long? ScheduledStartMs, string StartLocationAddress, long? StartLocationAddressId, double? StartLocationLat, double? StartLocationLng, string StartLocationName, long? TrailerId, long? VehicleId)
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
            
        }

        /// <summary>
        /// Returns builder of DispatchRouteBase.
        /// </summary>
        /// <returns>DispatchRouteBaseBuilder</returns>
        public static DispatchRouteBaseBuilder Builder()
        {
            return new DispatchRouteBaseBuilder();
        }

        /// <summary>
        /// Returns DispatchRouteBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DispatchRouteBaseBuilder</returns>
        public DispatchRouteBaseBuilder With()
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
                .VehicleId(VehicleId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DispatchRouteBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DispatchRouteBase.
        /// </summary>
        /// <param name="left">Compared (DispatchRouteBase</param>
        /// <param name="right">Compared (DispatchRouteBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DispatchRouteBase left, DispatchRouteBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DispatchRouteBase.
        /// </summary>
        /// <param name="left">Compared (DispatchRouteBase</param>
        /// <param name="right">Compared (DispatchRouteBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DispatchRouteBase left, DispatchRouteBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DispatchRouteBase.
        /// </summary>
        public sealed class DispatchRouteBaseBuilder
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

            internal DispatchRouteBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.ActualEndMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the route actually ended.</param>
            public DispatchRouteBaseBuilder ActualEndMs(long? value)
            {
                _ActualEndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.ActualStartMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the route actually started.</param>
            public DispatchRouteBaseBuilder ActualStartMs(long? value)
            {
                _ActualStartMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.DriverId property.
            /// </summary>
            /// <param name="value">ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.</param>
            public DispatchRouteBaseBuilder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.GroupId property.
            /// </summary>
            /// <param name="value">ID of the group if the organization has multiple groups (optional).</param>
            public DispatchRouteBaseBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.Name property.
            /// </summary>
            /// <param name="value">Descriptive name of this route.</param>
            public DispatchRouteBaseBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.ScheduledEndMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the last job in the route is scheduled to end.</param>
            public DispatchRouteBaseBuilder ScheduledEndMs(long? value)
            {
                _ScheduledEndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.ScheduledMeters property.
            /// </summary>
            /// <param name="value">The distance expected to be traveled for this route in meters.</param>
            public DispatchRouteBaseBuilder ScheduledMeters(long? value)
            {
                _ScheduledMeters = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.ScheduledStartMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the route is scheduled to start.</param>
            public DispatchRouteBaseBuilder ScheduledStartMs(long? value)
            {
                _ScheduledStartMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.StartLocationAddress property.
            /// </summary>
            /// <param name="value">The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.</param>
            public DispatchRouteBaseBuilder StartLocationAddress(string value)
            {
                _StartLocationAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.StartLocationAddressId property.
            /// </summary>
            /// <param name="value">ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.</param>
            public DispatchRouteBaseBuilder StartLocationAddressId(long? value)
            {
                _StartLocationAddressId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.StartLocationLat property.
            /// </summary>
            /// <param name="value">Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</param>
            public DispatchRouteBaseBuilder StartLocationLat(double? value)
            {
                _StartLocationLat = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.StartLocationLng property.
            /// </summary>
            /// <param name="value">Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</param>
            public DispatchRouteBaseBuilder StartLocationLng(double? value)
            {
                _StartLocationLng = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.StartLocationName property.
            /// </summary>
            /// <param name="value">The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.</param>
            public DispatchRouteBaseBuilder StartLocationName(string value)
            {
                _StartLocationName = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.TrailerId property.
            /// </summary>
            /// <param name="value">ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.</param>
            public DispatchRouteBaseBuilder TrailerId(long? value)
            {
                _TrailerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteBase.VehicleId property.
            /// </summary>
            /// <param name="value">ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.</param>
            public DispatchRouteBaseBuilder VehicleId(long? value)
            {
                _VehicleId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DispatchRouteBase.
            /// </summary>
            /// <returns>DispatchRouteBase</returns>
            public DispatchRouteBase Build()
            {
                Validate();
                return new DispatchRouteBase(
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
                    VehicleId: _VehicleId
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for DispatchRouteBase and cannot be null");
                } 
                if (_ScheduledEndMs == null)
                {
                    throw new ArgumentException("ScheduledEndMs is a required property for DispatchRouteBase and cannot be null");
                } 
                if (_ScheduledStartMs == null)
                {
                    throw new ArgumentException("ScheduledStartMs is a required property for DispatchRouteBase and cannot be null");
                } 
            }
        }

        
    }
}