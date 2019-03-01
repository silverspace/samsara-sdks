using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DispatchJobCreate
    /// </summary>
    public sealed class DispatchJobCreate:  IEquatable<DispatchJobCreate>
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
        /// Empty constructor required by some serializers.
        /// Use DispatchJobCreate.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DispatchJobCreate()
        {
        }

        private DispatchJobCreate(string DestinationAddress, long? DestinationAddressId, double? DestinationLat, double? DestinationLng, string DestinationName, string Notes, long? ScheduledArrivalTimeMs, long? ScheduledDepartureTimeMs)
        {
            
            this.DestinationAddress = DestinationAddress;
            
            this.DestinationAddressId = DestinationAddressId;
            
            this.DestinationLat = DestinationLat;
            
            this.DestinationLng = DestinationLng;
            
            this.DestinationName = DestinationName;
            
            this.Notes = Notes;
            
            this.ScheduledArrivalTimeMs = ScheduledArrivalTimeMs;
            
            this.ScheduledDepartureTimeMs = ScheduledDepartureTimeMs;
            
        }

        /// <summary>
        /// Returns builder of DispatchJobCreate.
        /// </summary>
        /// <returns>DispatchJobCreateBuilder</returns>
        public static DispatchJobCreateBuilder Builder()
        {
            return new DispatchJobCreateBuilder();
        }

        /// <summary>
        /// Returns DispatchJobCreateBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DispatchJobCreateBuilder</returns>
        public DispatchJobCreateBuilder With()
        {
            return Builder()
                .DestinationAddress(DestinationAddress)
                .DestinationAddressId(DestinationAddressId)
                .DestinationLat(DestinationLat)
                .DestinationLng(DestinationLng)
                .DestinationName(DestinationName)
                .Notes(Notes)
                .ScheduledArrivalTimeMs(ScheduledArrivalTimeMs)
                .ScheduledDepartureTimeMs(ScheduledDepartureTimeMs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DispatchJobCreate other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DispatchJobCreate.
        /// </summary>
        /// <param name="left">Compared (DispatchJobCreate</param>
        /// <param name="right">Compared (DispatchJobCreate</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DispatchJobCreate left, DispatchJobCreate right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DispatchJobCreate.
        /// </summary>
        /// <param name="left">Compared (DispatchJobCreate</param>
        /// <param name="right">Compared (DispatchJobCreate</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DispatchJobCreate left, DispatchJobCreate right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DispatchJobCreate.
        /// </summary>
        public sealed class DispatchJobCreateBuilder
        {
            private string _DestinationAddress;
            private long? _DestinationAddressId;
            private double? _DestinationLat;
            private double? _DestinationLng;
            private string _DestinationName;
            private string _Notes;
            private long? _ScheduledArrivalTimeMs;
            private long? _ScheduledDepartureTimeMs;

            internal DispatchJobCreateBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DispatchJobCreate.DestinationAddress property.
            /// </summary>
            /// <param name="value">The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.</param>
            public DispatchJobCreateBuilder DestinationAddress(string value)
            {
                _DestinationAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJobCreate.DestinationAddressId property.
            /// </summary>
            /// <param name="value">ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.</param>
            public DispatchJobCreateBuilder DestinationAddressId(long? value)
            {
                _DestinationAddressId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJobCreate.DestinationLat property.
            /// </summary>
            /// <param name="value">Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.</param>
            public DispatchJobCreateBuilder DestinationLat(double? value)
            {
                _DestinationLat = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJobCreate.DestinationLng property.
            /// </summary>
            /// <param name="value">Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.</param>
            public DispatchJobCreateBuilder DestinationLng(double? value)
            {
                _DestinationLng = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJobCreate.DestinationName property.
            /// </summary>
            /// <param name="value">The name of the job destination. If provided, it will take precedence over the name of the address book entry.</param>
            public DispatchJobCreateBuilder DestinationName(string value)
            {
                _DestinationName = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJobCreate.Notes property.
            /// </summary>
            /// <param name="value">Notes regarding the details of this job.</param>
            public DispatchJobCreateBuilder Notes(string value)
            {
                _Notes = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJobCreate.ScheduledArrivalTimeMs property.
            /// </summary>
            /// <param name="value">The time at which the assigned driver is scheduled to arrive at the job destination.</param>
            public DispatchJobCreateBuilder ScheduledArrivalTimeMs(long? value)
            {
                _ScheduledArrivalTimeMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchJobCreate.ScheduledDepartureTimeMs property.
            /// </summary>
            /// <param name="value">The time at which the assigned driver is scheduled to depart from the job destination.</param>
            public DispatchJobCreateBuilder ScheduledDepartureTimeMs(long? value)
            {
                _ScheduledDepartureTimeMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DispatchJobCreate.
            /// </summary>
            /// <returns>DispatchJobCreate</returns>
            public DispatchJobCreate Build()
            {
                Validate();
                return new DispatchJobCreate(
                    DestinationAddress: _DestinationAddress,
                    DestinationAddressId: _DestinationAddressId,
                    DestinationLat: _DestinationLat,
                    DestinationLng: _DestinationLng,
                    DestinationName: _DestinationName,
                    Notes: _Notes,
                    ScheduledArrivalTimeMs: _ScheduledArrivalTimeMs,
                    ScheduledDepartureTimeMs: _ScheduledDepartureTimeMs
                );
            }

            private void Validate()
            { 
                if (_ScheduledArrivalTimeMs == null)
                {
                    throw new ArgumentException("ScheduledArrivalTimeMs is a required property for DispatchJobCreate and cannot be null");
                } 
            }
        }

        
    }
}