using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DriverDailyLogResponseDays
    /// </summary>
    public sealed class DriverDailyLogResponseDays:  IEquatable<DriverDailyLogResponseDays>
    { 
        /// <summary>
        /// Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
        /// </summary>
        public long? CertifiedAtMs { get; private set; }

        /// <summary>
        /// End of the HOS day, specified in milliseconds UNIX time.
        /// </summary>
        public int? EndMs { get; private set; }

        /// <summary>
        /// End of the HOS day, specified in milliseconds UNIX time.
        /// </summary>
        public int? StartMs { get; private set; }

        /// <summary>
        /// List of trailer ID&#39;s associated with the driver for the day.
        /// </summary>
        public Object TrailerIds { get; private set; }

        /// <summary>
        /// Hours spent on duty or driving, rounded to two decimal places.
        /// </summary>
        public double? ActiveHours { get; private set; }

        /// <summary>
        /// Distance driven in miles, rounded to two decimal places.
        /// </summary>
        public double? DistanceMiles { get; private set; }

        /// <summary>
        /// Milliseconds spent on duty or driving.
        /// </summary>
        public long? ActiveMs { get; private set; }

        /// <summary>
        /// Whether this HOS day chart was certified by the driver.
        /// </summary>
        public bool? Certified { get; private set; }

        /// <summary>
        /// List of vehicle ID&#39;s associated with the driver for the day.
        /// </summary>
        public Object VehicleIds { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DriverDailyLogResponseDays.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DriverDailyLogResponseDays()
        {
        }

        private DriverDailyLogResponseDays(long? CertifiedAtMs, int? EndMs, int? StartMs, Object TrailerIds, double? ActiveHours, double? DistanceMiles, long? ActiveMs, bool? Certified, Object VehicleIds)
        {
            
            this.CertifiedAtMs = CertifiedAtMs;
            
            this.EndMs = EndMs;
            
            this.StartMs = StartMs;
            
            this.TrailerIds = TrailerIds;
            
            this.ActiveHours = ActiveHours;
            
            this.DistanceMiles = DistanceMiles;
            
            this.ActiveMs = ActiveMs;
            
            this.Certified = Certified;
            
            this.VehicleIds = VehicleIds;
            
        }

        /// <summary>
        /// Returns builder of DriverDailyLogResponseDays.
        /// </summary>
        /// <returns>DriverDailyLogResponseDaysBuilder</returns>
        public static DriverDailyLogResponseDaysBuilder Builder()
        {
            return new DriverDailyLogResponseDaysBuilder();
        }

        /// <summary>
        /// Returns DriverDailyLogResponseDaysBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DriverDailyLogResponseDaysBuilder</returns>
        public DriverDailyLogResponseDaysBuilder With()
        {
            return Builder()
                .CertifiedAtMs(CertifiedAtMs)
                .EndMs(EndMs)
                .StartMs(StartMs)
                .TrailerIds(TrailerIds)
                .ActiveHours(ActiveHours)
                .DistanceMiles(DistanceMiles)
                .ActiveMs(ActiveMs)
                .Certified(Certified)
                .VehicleIds(VehicleIds);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DriverDailyLogResponseDays other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DriverDailyLogResponseDays.
        /// </summary>
        /// <param name="left">Compared (DriverDailyLogResponseDays</param>
        /// <param name="right">Compared (DriverDailyLogResponseDays</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DriverDailyLogResponseDays left, DriverDailyLogResponseDays right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DriverDailyLogResponseDays.
        /// </summary>
        /// <param name="left">Compared (DriverDailyLogResponseDays</param>
        /// <param name="right">Compared (DriverDailyLogResponseDays</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DriverDailyLogResponseDays left, DriverDailyLogResponseDays right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DriverDailyLogResponseDays.
        /// </summary>
        public sealed class DriverDailyLogResponseDaysBuilder
        {
            private long? _CertifiedAtMs;
            private int? _EndMs;
            private int? _StartMs;
            private Object _TrailerIds;
            private double? _ActiveHours;
            private double? _DistanceMiles;
            private long? _ActiveMs;
            private bool? _Certified;
            private Object _VehicleIds;

            internal DriverDailyLogResponseDaysBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DriverDailyLogResponseDays.CertifiedAtMs property.
            /// </summary>
            /// <param name="value">Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.</param>
            public DriverDailyLogResponseDaysBuilder CertifiedAtMs(long? value)
            {
                _CertifiedAtMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverDailyLogResponseDays.EndMs property.
            /// </summary>
            /// <param name="value">End of the HOS day, specified in milliseconds UNIX time.</param>
            public DriverDailyLogResponseDaysBuilder EndMs(int? value)
            {
                _EndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverDailyLogResponseDays.StartMs property.
            /// </summary>
            /// <param name="value">End of the HOS day, specified in milliseconds UNIX time.</param>
            public DriverDailyLogResponseDaysBuilder StartMs(int? value)
            {
                _StartMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverDailyLogResponseDays.TrailerIds property.
            /// </summary>
            /// <param name="value">List of trailer ID&#39;s associated with the driver for the day.</param>
            public DriverDailyLogResponseDaysBuilder TrailerIds(Object value)
            {
                _TrailerIds = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverDailyLogResponseDays.ActiveHours property.
            /// </summary>
            /// <param name="value">Hours spent on duty or driving, rounded to two decimal places.</param>
            public DriverDailyLogResponseDaysBuilder ActiveHours(double? value)
            {
                _ActiveHours = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverDailyLogResponseDays.DistanceMiles property.
            /// </summary>
            /// <param name="value">Distance driven in miles, rounded to two decimal places.</param>
            public DriverDailyLogResponseDaysBuilder DistanceMiles(double? value)
            {
                _DistanceMiles = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverDailyLogResponseDays.ActiveMs property.
            /// </summary>
            /// <param name="value">Milliseconds spent on duty or driving.</param>
            public DriverDailyLogResponseDaysBuilder ActiveMs(long? value)
            {
                _ActiveMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverDailyLogResponseDays.Certified property.
            /// </summary>
            /// <param name="value">Whether this HOS day chart was certified by the driver.</param>
            public DriverDailyLogResponseDaysBuilder Certified(bool? value)
            {
                _Certified = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverDailyLogResponseDays.VehicleIds property.
            /// </summary>
            /// <param name="value">List of vehicle ID&#39;s associated with the driver for the day.</param>
            public DriverDailyLogResponseDaysBuilder VehicleIds(Object value)
            {
                _VehicleIds = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DriverDailyLogResponseDays.
            /// </summary>
            /// <returns>DriverDailyLogResponseDays</returns>
            public DriverDailyLogResponseDays Build()
            {
                Validate();
                return new DriverDailyLogResponseDays(
                    CertifiedAtMs: _CertifiedAtMs,
                    EndMs: _EndMs,
                    StartMs: _StartMs,
                    TrailerIds: _TrailerIds,
                    ActiveHours: _ActiveHours,
                    DistanceMiles: _DistanceMiles,
                    ActiveMs: _ActiveMs,
                    Certified: _Certified,
                    VehicleIds: _VehicleIds
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}