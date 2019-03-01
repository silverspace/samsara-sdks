using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DriversSummaryResponseSummaries
    /// </summary>
    public sealed class DriversSummaryResponseSummaries:  IEquatable<DriversSummaryResponseSummaries>
    { 
        /// <summary>
        /// ID of the driver.
        /// </summary>
        public long? DriverId { get; private set; }

        /// <summary>
        /// Distance driven in miles, rounded to two decimal places.
        /// </summary>
        public double? DistanceMiles { get; private set; }

        /// <summary>
        /// Duration in milliseconds that driver was driving during the requested time range
        /// </summary>
        public long? DriveMs { get; private set; }

        /// <summary>
        /// Duration in milliseconds that driver was on duty or driving during the requested time range
        /// </summary>
        public long? ActiveMs { get; private set; }

        /// <summary>
        /// Username of the driver.
        /// </summary>
        public string DriverUsername { get; private set; }

        /// <summary>
        /// Group of the driver.
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Name of the driver.
        /// </summary>
        public string DriverName { get; private set; }

        /// <summary>
        /// Duration in milliseconds that driver was on duty during the requested time range
        /// </summary>
        public long? OnDutyMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DriversSummaryResponseSummaries.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DriversSummaryResponseSummaries()
        {
        }

        private DriversSummaryResponseSummaries(long? DriverId, double? DistanceMiles, long? DriveMs, long? ActiveMs, string DriverUsername, long? GroupId, string DriverName, long? OnDutyMs)
        {
            
            this.DriverId = DriverId;
            
            this.DistanceMiles = DistanceMiles;
            
            this.DriveMs = DriveMs;
            
            this.ActiveMs = ActiveMs;
            
            this.DriverUsername = DriverUsername;
            
            this.GroupId = GroupId;
            
            this.DriverName = DriverName;
            
            this.OnDutyMs = OnDutyMs;
            
        }

        /// <summary>
        /// Returns builder of DriversSummaryResponseSummaries.
        /// </summary>
        /// <returns>DriversSummaryResponseSummariesBuilder</returns>
        public static DriversSummaryResponseSummariesBuilder Builder()
        {
            return new DriversSummaryResponseSummariesBuilder();
        }

        /// <summary>
        /// Returns DriversSummaryResponseSummariesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DriversSummaryResponseSummariesBuilder</returns>
        public DriversSummaryResponseSummariesBuilder With()
        {
            return Builder()
                .DriverId(DriverId)
                .DistanceMiles(DistanceMiles)
                .DriveMs(DriveMs)
                .ActiveMs(ActiveMs)
                .DriverUsername(DriverUsername)
                .GroupId(GroupId)
                .DriverName(DriverName)
                .OnDutyMs(OnDutyMs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DriversSummaryResponseSummaries other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DriversSummaryResponseSummaries.
        /// </summary>
        /// <param name="left">Compared (DriversSummaryResponseSummaries</param>
        /// <param name="right">Compared (DriversSummaryResponseSummaries</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DriversSummaryResponseSummaries left, DriversSummaryResponseSummaries right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DriversSummaryResponseSummaries.
        /// </summary>
        /// <param name="left">Compared (DriversSummaryResponseSummaries</param>
        /// <param name="right">Compared (DriversSummaryResponseSummaries</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DriversSummaryResponseSummaries left, DriversSummaryResponseSummaries right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DriversSummaryResponseSummaries.
        /// </summary>
        public sealed class DriversSummaryResponseSummariesBuilder
        {
            private long? _DriverId;
            private double? _DistanceMiles;
            private long? _DriveMs;
            private long? _ActiveMs;
            private string _DriverUsername;
            private long? _GroupId;
            private string _DriverName;
            private long? _OnDutyMs;

            internal DriversSummaryResponseSummariesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DriversSummaryResponseSummaries.DriverId property.
            /// </summary>
            /// <param name="value">ID of the driver.</param>
            public DriversSummaryResponseSummariesBuilder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriversSummaryResponseSummaries.DistanceMiles property.
            /// </summary>
            /// <param name="value">Distance driven in miles, rounded to two decimal places.</param>
            public DriversSummaryResponseSummariesBuilder DistanceMiles(double? value)
            {
                _DistanceMiles = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriversSummaryResponseSummaries.DriveMs property.
            /// </summary>
            /// <param name="value">Duration in milliseconds that driver was driving during the requested time range</param>
            public DriversSummaryResponseSummariesBuilder DriveMs(long? value)
            {
                _DriveMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriversSummaryResponseSummaries.ActiveMs property.
            /// </summary>
            /// <param name="value">Duration in milliseconds that driver was on duty or driving during the requested time range</param>
            public DriversSummaryResponseSummariesBuilder ActiveMs(long? value)
            {
                _ActiveMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriversSummaryResponseSummaries.DriverUsername property.
            /// </summary>
            /// <param name="value">Username of the driver.</param>
            public DriversSummaryResponseSummariesBuilder DriverUsername(string value)
            {
                _DriverUsername = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriversSummaryResponseSummaries.GroupId property.
            /// </summary>
            /// <param name="value">Group of the driver.</param>
            public DriversSummaryResponseSummariesBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriversSummaryResponseSummaries.DriverName property.
            /// </summary>
            /// <param name="value">Name of the driver.</param>
            public DriversSummaryResponseSummariesBuilder DriverName(string value)
            {
                _DriverName = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriversSummaryResponseSummaries.OnDutyMs property.
            /// </summary>
            /// <param name="value">Duration in milliseconds that driver was on duty during the requested time range</param>
            public DriversSummaryResponseSummariesBuilder OnDutyMs(long? value)
            {
                _OnDutyMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DriversSummaryResponseSummaries.
            /// </summary>
            /// <returns>DriversSummaryResponseSummaries</returns>
            public DriversSummaryResponseSummaries Build()
            {
                Validate();
                return new DriversSummaryResponseSummaries(
                    DriverId: _DriverId,
                    DistanceMiles: _DistanceMiles,
                    DriveMs: _DriveMs,
                    ActiveMs: _ActiveMs,
                    DriverUsername: _DriverUsername,
                    GroupId: _GroupId,
                    DriverName: _DriverName,
                    OnDutyMs: _OnDutyMs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}