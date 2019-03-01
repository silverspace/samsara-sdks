using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DispatchJob
    /// </summary>
    public sealed class DispatchJob:  IEquatable<DispatchJob>
    { 
        /// <summary>
        /// The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
        /// </summary>
        public string DestinationAddress { get; private set; }

        /// <summary>
        /// ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
        /// </summary>
        public long? DestinationAddressId { get; private set; }

        /// <summary>
        /// Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
        /// </summary>
        public double? DestinationLat { get; private set; }

        /// <summary>
        /// Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
        /// </summary>
        public double? DestinationLng { get; private set; }

        /// <summary>
        /// The name of the job destination. If provided, it will take precedence over the name of the address book entry.
        /// </summary>
        public string DestinationName { get; private set; }

        /// <summary>
        /// Notes regarding the details of this job.
        /// </summary>
        public string Notes { get; private set; }

        /// <summary>
        /// The time at which the assigned driver is scheduled to arrive at the job destination.
        /// </summary>
        public long? ScheduledArrivalTimeMs { get; private set; }

        /// <summary>
        /// The time at which the assigned driver is scheduled to depart from the job destination.
        /// </summary>
        public long? ScheduledDepartureTimeMs { get; private set; }

        /// <summary>
        /// The time at which the driver arrived at the job destination.
        /// </summary>
        public long? ArrivedAtMs { get; private set; }

        /// <summary>
        /// The time at which the job was marked complete (e.g. started driving to the next destination).
        /// </summary>
        public long? CompletedAtMs { get; private set; }

        /// <summary>
        /// ID of the route that this job belongs to.
        /// </summary>
        public long? DispatchRouteId { get; private set; }

        /// <summary>
        /// ID of the driver assigned to the dispatch job.
        /// </summary>
        public long? DriverId { get; private set; }

        /// <summary>
        /// The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
        /// </summary>
        public long? EnRouteAtMs { get; private set; }

        /// <summary>
        /// The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
        /// </summary>
        public long? EstimatedArrivalMs { get; private set; }

        /// <summary>
        /// Fleet viewer url of the dispatch job.
        /// </summary>
        public string FleetViewerUrl { get; private set; }

        /// <summary>
        /// GroupId
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// ID of the Samsara dispatch job.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// JobState
        /// </summary>
        public JobStatus JobState { get; private set; }

        /// <summary>
        /// The time at which the job was marked skipped.
        /// </summary>
        public long? SkippedAtMs { get; private set; }

        /// <summary>
        /// ID of the vehicle used for the dispatch job.
        /// </summary>
        public long? VehicleId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DispatchJob.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DispatchJob()
        {
        }

        private DispatchJob(string DestinationAddress, long? DestinationAddressId, double? DestinationLat, double? DestinationLng, string DestinationName, string Notes, long? ScheduledArrivalTimeMs, long? ScheduledDepartureTimeMs, long? ArrivedAtMs, long? CompletedAtMs, long? DispatchRouteId, long? DriverId, long? EnRouteAtMs, long? EstimatedArrivalMs, string FleetViewerUrl, long? GroupId, long? Id, JobStatus JobState, long? SkippedAtMs, long? VehicleId)
        {
            
            this.DestinationAddress = DestinationAddress;
            
            this.DestinationAddressId = DestinationAddressId;
            
            this.DestinationLat = DestinationLat;
            
            this.DestinationLng = DestinationLng;
            
            this.DestinationName = DestinationName;
            
            this.Notes = Notes;
            
            this.ScheduledArrivalTimeMs = ScheduledArrivalTimeMs;
            
            this.ScheduledDepartureTimeMs = ScheduledDepartureTimeMs;
            
            this.ArrivedAtMs = ArrivedAtMs;
            
            this.CompletedAtMs = CompletedAtMs;
            
            this.DispatchRouteId = DispatchRouteId;
            
            this.DriverId = DriverId;
            
            this.EnRouteAtMs = EnRouteAtMs;
            
            this.EstimatedArrivalMs = EstimatedArrivalMs;
            
            this.FleetViewerUrl = FleetViewerUrl;
            
            this.GroupId = GroupId;
            
            this.Id = Id;
            
            this.JobState = JobState;
            
            this.SkippedAtMs = SkippedAtMs;
            
            this.VehicleId = VehicleId;
            
        }

        /// <summary>
        /// Returns builder of DispatchJob.
        /// </summary>
        /// <returns>DispatchJobBuilder</returns>
        public static DispatchJobBuilder Builder()
        {
            return new DispatchJobBuilder();
        }

        /// <summary>
        /// Returns DispatchJobBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DispatchJobBuilder</returns>
        public DispatchJobBuilder With()
        {
            return Builder()
                .DestinationAddress(DestinationAddress)
                .DestinationAddressId(DestinationAddressId)
                .DestinationLat(DestinationLat)
                .DestinationLng(DestinationLng)
                .DestinationName(DestinationName)
                .Notes(Notes)
                .ScheduledArrivalTimeMs(ScheduledArrivalTimeMs)
                .ScheduledDepartureTimeMs(ScheduledDepartureTimeMs)
                .ArrivedAtMs(ArrivedAtMs)
                .CompletedAtMs(CompletedAtMs)
                .DispatchRouteId(DispatchRouteId)
                .DriverId(DriverId)
                .EnRouteAtMs(EnRouteAtMs)
                .EstimatedArrivalMs(EstimatedArrivalMs)
                .FleetViewerUrl(FleetViewerUrl)
                .GroupId(GroupId)
                .Id(Id)
                .JobState(JobState)
                .SkippedAtMs(SkippedAtMs)
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

        public bool Equals(DispatchJob other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DispatchJob.
        /// </summary>
        /// <param name="left">Compared (DispatchJob</param>
        /// <param name="right">Compared (DispatchJob</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DispatchJob left, DispatchJob right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DispatchJob.
        /// </summary>
        /// <param name="left">Compared (DispatchJob</param>
        /// <param name="right">Compared (DispatchJob</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DispatchJob left, DispatchJob right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DispatchJob.
        /// </summary>
        public sealed class DispatchJobBuilder
        {
            private string _DestinationAddress;
            private long? _DestinationAddressId;
            private double? _DestinationLat;
            private double? _DestinationLng;
            private string _DestinationName;
            private string _Notes;
            private long? _ScheduledArrivalTimeMs;
            private long? _ScheduledDepartureTimeMs;
            private long? _ArrivedAtMs;
            private long? _CompletedAtMs;
            private long? _DispatchRouteId;
            private long? _DriverId;
            private long? _EnRouteAtMs;
            private long? _EstimatedArrivalMs;
            private string _FleetViewerUrl;
            private long? _GroupId;
            private long? _Id;
            private JobStatus _JobState;
            private long? _SkippedAtMs;
            private long? _VehicleId;

            internal DispatchJobBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DispatchJob.DestinationAddress property.
            /// </summary>
            /// <param name="value">The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.</param>
            public DispatchJobBuilder DestinationAddress(string value)
            {
                _DestinationAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.DestinationAddressId property.
            /// </summary>
            /// <param name="value">ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.</param>
            public DispatchJobBuilder DestinationAddressId(long? value)
            {
                _DestinationAddressId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.DestinationLat property.
            /// </summary>
            /// <param name="value">Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.</param>
            public DispatchJobBuilder DestinationLat(double? value)
            {
                _DestinationLat = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.DestinationLng property.
            /// </summary>
            /// <param name="value">Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.</param>
            public DispatchJobBuilder DestinationLng(double? value)
            {
                _DestinationLng = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.DestinationName property.
            /// </summary>
            /// <param name="value">The name of the job destination. If provided, it will take precedence over the name of the address book entry.</param>
            public DispatchJobBuilder DestinationName(string value)
            {
                _DestinationName = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.Notes property.
            /// </summary>
            /// <param name="value">Notes regarding the details of this job.</param>
            public DispatchJobBuilder Notes(string value)
            {
                _Notes = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.ScheduledArrivalTimeMs property.
            /// </summary>
            /// <param name="value">The time at which the assigned driver is scheduled to arrive at the job destination.</param>
            public DispatchJobBuilder ScheduledArrivalTimeMs(long? value)
            {
                _ScheduledArrivalTimeMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.ScheduledDepartureTimeMs property.
            /// </summary>
            /// <param name="value">The time at which the assigned driver is scheduled to depart from the job destination.</param>
            public DispatchJobBuilder ScheduledDepartureTimeMs(long? value)
            {
                _ScheduledDepartureTimeMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.ArrivedAtMs property.
            /// </summary>
            /// <param name="value">The time at which the driver arrived at the job destination.</param>
            public DispatchJobBuilder ArrivedAtMs(long? value)
            {
                _ArrivedAtMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.CompletedAtMs property.
            /// </summary>
            /// <param name="value">The time at which the job was marked complete (e.g. started driving to the next destination).</param>
            public DispatchJobBuilder CompletedAtMs(long? value)
            {
                _CompletedAtMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.DispatchRouteId property.
            /// </summary>
            /// <param name="value">ID of the route that this job belongs to.</param>
            public DispatchJobBuilder DispatchRouteId(long? value)
            {
                _DispatchRouteId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.DriverId property.
            /// </summary>
            /// <param name="value">ID of the driver assigned to the dispatch job.</param>
            public DispatchJobBuilder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.EnRouteAtMs property.
            /// </summary>
            /// <param name="value">The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).</param>
            public DispatchJobBuilder EnRouteAtMs(long? value)
            {
                _EnRouteAtMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.EstimatedArrivalMs property.
            /// </summary>
            /// <param name="value">The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.</param>
            public DispatchJobBuilder EstimatedArrivalMs(long? value)
            {
                _EstimatedArrivalMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.FleetViewerUrl property.
            /// </summary>
            /// <param name="value">Fleet viewer url of the dispatch job.</param>
            public DispatchJobBuilder FleetViewerUrl(string value)
            {
                _FleetViewerUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.GroupId property.
            /// </summary>
            /// <param name="value">GroupId</param>
            public DispatchJobBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.Id property.
            /// </summary>
            /// <param name="value">ID of the Samsara dispatch job.</param>
            public DispatchJobBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.JobState property.
            /// </summary>
            /// <param name="value">JobState</param>
            public DispatchJobBuilder JobState(JobStatus value)
            {
                _JobState = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.SkippedAtMs property.
            /// </summary>
            /// <param name="value">The time at which the job was marked skipped.</param>
            public DispatchJobBuilder SkippedAtMs(long? value)
            {
                _SkippedAtMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJob.VehicleId property.
            /// </summary>
            /// <param name="value">ID of the vehicle used for the dispatch job.</param>
            public DispatchJobBuilder VehicleId(long? value)
            {
                _VehicleId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DispatchJob.
            /// </summary>
            /// <returns>DispatchJob</returns>
            public DispatchJob Build()
            {
                Validate();
                return new DispatchJob(
                    DestinationAddress: _DestinationAddress,
                    DestinationAddressId: _DestinationAddressId,
                    DestinationLat: _DestinationLat,
                    DestinationLng: _DestinationLng,
                    DestinationName: _DestinationName,
                    Notes: _Notes,
                    ScheduledArrivalTimeMs: _ScheduledArrivalTimeMs,
                    ScheduledDepartureTimeMs: _ScheduledDepartureTimeMs,
                    ArrivedAtMs: _ArrivedAtMs,
                    CompletedAtMs: _CompletedAtMs,
                    DispatchRouteId: _DispatchRouteId,
                    DriverId: _DriverId,
                    EnRouteAtMs: _EnRouteAtMs,
                    EstimatedArrivalMs: _EstimatedArrivalMs,
                    FleetViewerUrl: _FleetViewerUrl,
                    GroupId: _GroupId,
                    Id: _Id,
                    JobState: _JobState,
                    SkippedAtMs: _SkippedAtMs,
                    VehicleId: _VehicleId
                );
            }

            private void Validate()
            { 
                if (_ScheduledArrivalTimeMs == null)
                {
                    throw new ArgumentException("ScheduledArrivalTimeMs is a required property for DispatchJob and cannot be null");
                } 
                if (_DispatchRouteId == null)
                {
                    throw new ArgumentException("DispatchRouteId is a required property for DispatchJob and cannot be null");
                } 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for DispatchJob and cannot be null");
                } 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for DispatchJob and cannot be null");
                } 
                if (_JobState == null)
                {
                    throw new ArgumentException("JobState is a required property for DispatchJob and cannot be null");
                } 
            }
        }

        
    }
}