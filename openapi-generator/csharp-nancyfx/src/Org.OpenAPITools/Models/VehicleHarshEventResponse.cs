using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Harsh event details for a vehicle
    /// </summary>
    public sealed class VehicleHarshEventResponse:  IEquatable<VehicleHarshEventResponse>
    { 
        /// <summary>
        /// URL for downloading the forward facing video
        /// </summary>
        public string DownloadForwardVideoUrl { get; private set; }

        /// <summary>
        /// URL for downloading the inward facing video
        /// </summary>
        public string DownloadInwardVideoUrl { get; private set; }

        /// <summary>
        /// URL for downloading the tracked inward facing video
        /// </summary>
        public string DownloadTrackedInwardVideoUrl { get; private set; }

        /// <summary>
        /// Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
        /// </summary>
        public string HarshEventType { get; private set; }

        /// <summary>
        /// URL of the associated incident report page
        /// </summary>
        public string IncidentReportUrl { get; private set; }

        /// <summary>
        /// Whether the driver was deemed distracted during this harsh event
        /// </summary>
        public bool? IsDistracted { get; private set; }

        /// <summary>
        /// Location
        /// </summary>
        public VehicleHarshEventResponseLocation Location { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VehicleHarshEventResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VehicleHarshEventResponse()
        {
        }

        private VehicleHarshEventResponse(string DownloadForwardVideoUrl, string DownloadInwardVideoUrl, string DownloadTrackedInwardVideoUrl, string HarshEventType, string IncidentReportUrl, bool? IsDistracted, VehicleHarshEventResponseLocation Location)
        {
            
            this.DownloadForwardVideoUrl = DownloadForwardVideoUrl;
            
            this.DownloadInwardVideoUrl = DownloadInwardVideoUrl;
            
            this.DownloadTrackedInwardVideoUrl = DownloadTrackedInwardVideoUrl;
            
            this.HarshEventType = HarshEventType;
            
            this.IncidentReportUrl = IncidentReportUrl;
            
            this.IsDistracted = IsDistracted;
            
            this.Location = Location;
            
        }

        /// <summary>
        /// Returns builder of VehicleHarshEventResponse.
        /// </summary>
        /// <returns>VehicleHarshEventResponseBuilder</returns>
        public static VehicleHarshEventResponseBuilder Builder()
        {
            return new VehicleHarshEventResponseBuilder();
        }

        /// <summary>
        /// Returns VehicleHarshEventResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleHarshEventResponseBuilder</returns>
        public VehicleHarshEventResponseBuilder With()
        {
            return Builder()
                .DownloadForwardVideoUrl(DownloadForwardVideoUrl)
                .DownloadInwardVideoUrl(DownloadInwardVideoUrl)
                .DownloadTrackedInwardVideoUrl(DownloadTrackedInwardVideoUrl)
                .HarshEventType(HarshEventType)
                .IncidentReportUrl(IncidentReportUrl)
                .IsDistracted(IsDistracted)
                .Location(Location);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VehicleHarshEventResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VehicleHarshEventResponse.
        /// </summary>
        /// <param name="left">Compared (VehicleHarshEventResponse</param>
        /// <param name="right">Compared (VehicleHarshEventResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VehicleHarshEventResponse left, VehicleHarshEventResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VehicleHarshEventResponse.
        /// </summary>
        /// <param name="left">Compared (VehicleHarshEventResponse</param>
        /// <param name="right">Compared (VehicleHarshEventResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VehicleHarshEventResponse left, VehicleHarshEventResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VehicleHarshEventResponse.
        /// </summary>
        public sealed class VehicleHarshEventResponseBuilder
        {
            private string _DownloadForwardVideoUrl;
            private string _DownloadInwardVideoUrl;
            private string _DownloadTrackedInwardVideoUrl;
            private string _HarshEventType;
            private string _IncidentReportUrl;
            private bool? _IsDistracted;
            private VehicleHarshEventResponseLocation _Location;

            internal VehicleHarshEventResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VehicleHarshEventResponse.DownloadForwardVideoUrl property.
            /// </summary>
            /// <param name="value">URL for downloading the forward facing video</param>
            public VehicleHarshEventResponseBuilder DownloadForwardVideoUrl(string value)
            {
                _DownloadForwardVideoUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleHarshEventResponse.DownloadInwardVideoUrl property.
            /// </summary>
            /// <param name="value">URL for downloading the inward facing video</param>
            public VehicleHarshEventResponseBuilder DownloadInwardVideoUrl(string value)
            {
                _DownloadInwardVideoUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleHarshEventResponse.DownloadTrackedInwardVideoUrl property.
            /// </summary>
            /// <param name="value">URL for downloading the tracked inward facing video</param>
            public VehicleHarshEventResponseBuilder DownloadTrackedInwardVideoUrl(string value)
            {
                _DownloadTrackedInwardVideoUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleHarshEventResponse.HarshEventType property.
            /// </summary>
            /// <param name="value">Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]</param>
            public VehicleHarshEventResponseBuilder HarshEventType(string value)
            {
                _HarshEventType = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleHarshEventResponse.IncidentReportUrl property.
            /// </summary>
            /// <param name="value">URL of the associated incident report page</param>
            public VehicleHarshEventResponseBuilder IncidentReportUrl(string value)
            {
                _IncidentReportUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleHarshEventResponse.IsDistracted property.
            /// </summary>
            /// <param name="value">Whether the driver was deemed distracted during this harsh event</param>
            public VehicleHarshEventResponseBuilder IsDistracted(bool? value)
            {
                _IsDistracted = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleHarshEventResponse.Location property.
            /// </summary>
            /// <param name="value">Location</param>
            public VehicleHarshEventResponseBuilder Location(VehicleHarshEventResponseLocation value)
            {
                _Location = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VehicleHarshEventResponse.
            /// </summary>
            /// <returns>VehicleHarshEventResponse</returns>
            public VehicleHarshEventResponse Build()
            {
                Validate();
                return new VehicleHarshEventResponse(
                    DownloadForwardVideoUrl: _DownloadForwardVideoUrl,
                    DownloadInwardVideoUrl: _DownloadInwardVideoUrl,
                    DownloadTrackedInwardVideoUrl: _DownloadTrackedInwardVideoUrl,
                    HarshEventType: _HarshEventType,
                    IncidentReportUrl: _IncidentReportUrl,
                    IsDistracted: _IsDistracted,
                    Location: _Location
                );
            }

            private void Validate()
            { 
                if (_HarshEventType == null)
                {
                    throw new ArgumentException("HarshEventType is a required property for VehicleHarshEventResponse and cannot be null");
                } 
                if (_IncidentReportUrl == null)
                {
                    throw new ArgumentException("IncidentReportUrl is a required property for VehicleHarshEventResponse and cannot be null");
                } 
            }
        }

        
    }
}