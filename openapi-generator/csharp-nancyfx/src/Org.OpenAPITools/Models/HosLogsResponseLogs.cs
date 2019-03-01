using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// HosLogsResponseLogs
    /// </summary>
    public sealed class HosLogsResponseLogs:  IEquatable<HosLogsResponseLogs>
    { 
        /// <summary>
        /// Longitude at which the log was recorded.
        /// </summary>
        public double? LocLng { get; private set; }

        /// <summary>
        /// The time at which the log/HOS status started in UNIX milliseconds.
        /// </summary>
        public long? LogStartMs { get; private set; }

        /// <summary>
        /// ID of the driver.
        /// </summary>
        public long? DriverId { get; private set; }

        /// <summary>
        /// The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
        /// </summary>
        public string StatusType { get; private set; }

        /// <summary>
        /// City in which the log was recorded.
        /// </summary>
        public string LocCity { get; private set; }

        /// <summary>
        /// ID of the group.
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Name of location at which the log was recorded.
        /// </summary>
        public string LocName { get; private set; }

        /// <summary>
        /// Latitude at which the log was recorded.
        /// </summary>
        public double? LocLat { get; private set; }

        /// <summary>
        /// Remark associated with the log entry.
        /// </summary>
        public string Remark { get; private set; }

        /// <summary>
        /// State in which the log was recorded.
        /// </summary>
        public string LocState { get; private set; }

        /// <summary>
        /// ID of the vehicle.
        /// </summary>
        public long? VehicleId { get; private set; }

        /// <summary>
        /// CodriverIds
        /// </summary>
        public List<long?> CodriverIds { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use HosLogsResponseLogs.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public HosLogsResponseLogs()
        {
        }

        private HosLogsResponseLogs(double? LocLng, long? LogStartMs, long? DriverId, string StatusType, string LocCity, long? GroupId, string LocName, double? LocLat, string Remark, string LocState, long? VehicleId, List<long?> CodriverIds)
        {
            
            this.LocLng = LocLng;
            
            this.LogStartMs = LogStartMs;
            
            this.DriverId = DriverId;
            
            this.StatusType = StatusType;
            
            this.LocCity = LocCity;
            
            this.GroupId = GroupId;
            
            this.LocName = LocName;
            
            this.LocLat = LocLat;
            
            this.Remark = Remark;
            
            this.LocState = LocState;
            
            this.VehicleId = VehicleId;
            
            this.CodriverIds = CodriverIds;
            
        }

        /// <summary>
        /// Returns builder of HosLogsResponseLogs.
        /// </summary>
        /// <returns>HosLogsResponseLogsBuilder</returns>
        public static HosLogsResponseLogsBuilder Builder()
        {
            return new HosLogsResponseLogsBuilder();
        }

        /// <summary>
        /// Returns HosLogsResponseLogsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>HosLogsResponseLogsBuilder</returns>
        public HosLogsResponseLogsBuilder With()
        {
            return Builder()
                .LocLng(LocLng)
                .LogStartMs(LogStartMs)
                .DriverId(DriverId)
                .StatusType(StatusType)
                .LocCity(LocCity)
                .GroupId(GroupId)
                .LocName(LocName)
                .LocLat(LocLat)
                .Remark(Remark)
                .LocState(LocState)
                .VehicleId(VehicleId)
                .CodriverIds(CodriverIds);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(HosLogsResponseLogs other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (HosLogsResponseLogs.
        /// </summary>
        /// <param name="left">Compared (HosLogsResponseLogs</param>
        /// <param name="right">Compared (HosLogsResponseLogs</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (HosLogsResponseLogs left, HosLogsResponseLogs right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (HosLogsResponseLogs.
        /// </summary>
        /// <param name="left">Compared (HosLogsResponseLogs</param>
        /// <param name="right">Compared (HosLogsResponseLogs</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (HosLogsResponseLogs left, HosLogsResponseLogs right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of HosLogsResponseLogs.
        /// </summary>
        public sealed class HosLogsResponseLogsBuilder
        {
            private double? _LocLng;
            private long? _LogStartMs;
            private long? _DriverId;
            private string _StatusType;
            private string _LocCity;
            private long? _GroupId;
            private string _LocName;
            private double? _LocLat;
            private string _Remark;
            private string _LocState;
            private long? _VehicleId;
            private List<long?> _CodriverIds;

            internal HosLogsResponseLogsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.LocLng property.
            /// </summary>
            /// <param name="value">Longitude at which the log was recorded.</param>
            public HosLogsResponseLogsBuilder LocLng(double? value)
            {
                _LocLng = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.LogStartMs property.
            /// </summary>
            /// <param name="value">The time at which the log/HOS status started in UNIX milliseconds.</param>
            public HosLogsResponseLogsBuilder LogStartMs(long? value)
            {
                _LogStartMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.DriverId property.
            /// </summary>
            /// <param name="value">ID of the driver.</param>
            public HosLogsResponseLogsBuilder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.StatusType property.
            /// </summary>
            /// <param name="value">The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.</param>
            public HosLogsResponseLogsBuilder StatusType(string value)
            {
                _StatusType = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.LocCity property.
            /// </summary>
            /// <param name="value">City in which the log was recorded.</param>
            public HosLogsResponseLogsBuilder LocCity(string value)
            {
                _LocCity = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.GroupId property.
            /// </summary>
            /// <param name="value">ID of the group.</param>
            public HosLogsResponseLogsBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.LocName property.
            /// </summary>
            /// <param name="value">Name of location at which the log was recorded.</param>
            public HosLogsResponseLogsBuilder LocName(string value)
            {
                _LocName = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.LocLat property.
            /// </summary>
            /// <param name="value">Latitude at which the log was recorded.</param>
            public HosLogsResponseLogsBuilder LocLat(double? value)
            {
                _LocLat = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.Remark property.
            /// </summary>
            /// <param name="value">Remark associated with the log entry.</param>
            public HosLogsResponseLogsBuilder Remark(string value)
            {
                _Remark = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.LocState property.
            /// </summary>
            /// <param name="value">State in which the log was recorded.</param>
            public HosLogsResponseLogsBuilder LocState(string value)
            {
                _LocState = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.VehicleId property.
            /// </summary>
            /// <param name="value">ID of the vehicle.</param>
            public HosLogsResponseLogsBuilder VehicleId(long? value)
            {
                _VehicleId = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsResponseLogs.CodriverIds property.
            /// </summary>
            /// <param name="value">CodriverIds</param>
            public HosLogsResponseLogsBuilder CodriverIds(List<long?> value)
            {
                _CodriverIds = value;
                return this;
            }


            /// <summary>
            /// Builds instance of HosLogsResponseLogs.
            /// </summary>
            /// <returns>HosLogsResponseLogs</returns>
            public HosLogsResponseLogs Build()
            {
                Validate();
                return new HosLogsResponseLogs(
                    LocLng: _LocLng,
                    LogStartMs: _LogStartMs,
                    DriverId: _DriverId,
                    StatusType: _StatusType,
                    LocCity: _LocCity,
                    GroupId: _GroupId,
                    LocName: _LocName,
                    LocLat: _LocLat,
                    Remark: _Remark,
                    LocState: _LocState,
                    VehicleId: _VehicleId,
                    CodriverIds: _CodriverIds
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}