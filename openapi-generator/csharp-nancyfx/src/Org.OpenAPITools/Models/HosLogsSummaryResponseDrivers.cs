using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// HosLogsSummaryResponseDrivers
    /// </summary>
    public sealed class HosLogsSummaryResponseDrivers:  IEquatable<HosLogsSummaryResponseDrivers>
    { 
        /// <summary>
        /// The amount of time (in ms) remaining until the driver cannot drive without a rest break.
        /// </summary>
        public long? TimeUntilBreak { get; private set; }

        /// <summary>
        /// Name of the vehicle.
        /// </summary>
        public string VehicleName { get; private set; }

        /// <summary>
        /// The amount of driving time in violation today (in ms).
        /// </summary>
        public long? DrivingInViolationToday { get; private set; }

        /// <summary>
        /// ID of the driver.
        /// </summary>
        public long? DriverId { get; private set; }

        /// <summary>
        /// The amount of remaining cycle time (in ms).
        /// </summary>
        public long? CycleRemaining { get; private set; }

        /// <summary>
        /// Name of the driver.
        /// </summary>
        public string DriverName { get; private set; }

        /// <summary>
        /// The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
        /// </summary>
        public string DutyStatus { get; private set; }

        /// <summary>
        /// The amount of cycle time (in ms) available tomorrow.
        /// </summary>
        public long? CycleTomorrow { get; private set; }

        /// <summary>
        /// The amount of remaining shift drive time (in ms).
        /// </summary>
        public long? ShiftDriveRemaining { get; private set; }

        /// <summary>
        /// The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.
        /// </summary>
        public long? TimeInCurrentStatus { get; private set; }

        /// <summary>
        /// The amount of driving time in violation in this cycle (in ms).
        /// </summary>
        public long? DrivingInViolationCycle { get; private set; }

        /// <summary>
        /// The amount of remaining shift time (in ms).
        /// </summary>
        public long? ShiftRemaining { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use HosLogsSummaryResponseDrivers.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public HosLogsSummaryResponseDrivers()
        {
        }

        private HosLogsSummaryResponseDrivers(long? TimeUntilBreak, string VehicleName, long? DrivingInViolationToday, long? DriverId, long? CycleRemaining, string DriverName, string DutyStatus, long? CycleTomorrow, long? ShiftDriveRemaining, long? TimeInCurrentStatus, long? DrivingInViolationCycle, long? ShiftRemaining)
        {
            
            this.TimeUntilBreak = TimeUntilBreak;
            
            this.VehicleName = VehicleName;
            
            this.DrivingInViolationToday = DrivingInViolationToday;
            
            this.DriverId = DriverId;
            
            this.CycleRemaining = CycleRemaining;
            
            this.DriverName = DriverName;
            
            this.DutyStatus = DutyStatus;
            
            this.CycleTomorrow = CycleTomorrow;
            
            this.ShiftDriveRemaining = ShiftDriveRemaining;
            
            this.TimeInCurrentStatus = TimeInCurrentStatus;
            
            this.DrivingInViolationCycle = DrivingInViolationCycle;
            
            this.ShiftRemaining = ShiftRemaining;
            
        }

        /// <summary>
        /// Returns builder of HosLogsSummaryResponseDrivers.
        /// </summary>
        /// <returns>HosLogsSummaryResponseDriversBuilder</returns>
        public static HosLogsSummaryResponseDriversBuilder Builder()
        {
            return new HosLogsSummaryResponseDriversBuilder();
        }

        /// <summary>
        /// Returns HosLogsSummaryResponseDriversBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>HosLogsSummaryResponseDriversBuilder</returns>
        public HosLogsSummaryResponseDriversBuilder With()
        {
            return Builder()
                .TimeUntilBreak(TimeUntilBreak)
                .VehicleName(VehicleName)
                .DrivingInViolationToday(DrivingInViolationToday)
                .DriverId(DriverId)
                .CycleRemaining(CycleRemaining)
                .DriverName(DriverName)
                .DutyStatus(DutyStatus)
                .CycleTomorrow(CycleTomorrow)
                .ShiftDriveRemaining(ShiftDriveRemaining)
                .TimeInCurrentStatus(TimeInCurrentStatus)
                .DrivingInViolationCycle(DrivingInViolationCycle)
                .ShiftRemaining(ShiftRemaining);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(HosLogsSummaryResponseDrivers other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (HosLogsSummaryResponseDrivers.
        /// </summary>
        /// <param name="left">Compared (HosLogsSummaryResponseDrivers</param>
        /// <param name="right">Compared (HosLogsSummaryResponseDrivers</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (HosLogsSummaryResponseDrivers left, HosLogsSummaryResponseDrivers right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (HosLogsSummaryResponseDrivers.
        /// </summary>
        /// <param name="left">Compared (HosLogsSummaryResponseDrivers</param>
        /// <param name="right">Compared (HosLogsSummaryResponseDrivers</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (HosLogsSummaryResponseDrivers left, HosLogsSummaryResponseDrivers right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of HosLogsSummaryResponseDrivers.
        /// </summary>
        public sealed class HosLogsSummaryResponseDriversBuilder
        {
            private long? _TimeUntilBreak;
            private string _VehicleName;
            private long? _DrivingInViolationToday;
            private long? _DriverId;
            private long? _CycleRemaining;
            private string _DriverName;
            private string _DutyStatus;
            private long? _CycleTomorrow;
            private long? _ShiftDriveRemaining;
            private long? _TimeInCurrentStatus;
            private long? _DrivingInViolationCycle;
            private long? _ShiftRemaining;

            internal HosLogsSummaryResponseDriversBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.TimeUntilBreak property.
            /// </summary>
            /// <param name="value">The amount of time (in ms) remaining until the driver cannot drive without a rest break.</param>
            public HosLogsSummaryResponseDriversBuilder TimeUntilBreak(long? value)
            {
                _TimeUntilBreak = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.VehicleName property.
            /// </summary>
            /// <param name="value">Name of the vehicle.</param>
            public HosLogsSummaryResponseDriversBuilder VehicleName(string value)
            {
                _VehicleName = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.DrivingInViolationToday property.
            /// </summary>
            /// <param name="value">The amount of driving time in violation today (in ms).</param>
            public HosLogsSummaryResponseDriversBuilder DrivingInViolationToday(long? value)
            {
                _DrivingInViolationToday = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.DriverId property.
            /// </summary>
            /// <param name="value">ID of the driver.</param>
            public HosLogsSummaryResponseDriversBuilder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.CycleRemaining property.
            /// </summary>
            /// <param name="value">The amount of remaining cycle time (in ms).</param>
            public HosLogsSummaryResponseDriversBuilder CycleRemaining(long? value)
            {
                _CycleRemaining = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.DriverName property.
            /// </summary>
            /// <param name="value">Name of the driver.</param>
            public HosLogsSummaryResponseDriversBuilder DriverName(string value)
            {
                _DriverName = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.DutyStatus property.
            /// </summary>
            /// <param name="value">The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.</param>
            public HosLogsSummaryResponseDriversBuilder DutyStatus(string value)
            {
                _DutyStatus = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.CycleTomorrow property.
            /// </summary>
            /// <param name="value">The amount of cycle time (in ms) available tomorrow.</param>
            public HosLogsSummaryResponseDriversBuilder CycleTomorrow(long? value)
            {
                _CycleTomorrow = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.ShiftDriveRemaining property.
            /// </summary>
            /// <param name="value">The amount of remaining shift drive time (in ms).</param>
            public HosLogsSummaryResponseDriversBuilder ShiftDriveRemaining(long? value)
            {
                _ShiftDriveRemaining = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.TimeInCurrentStatus property.
            /// </summary>
            /// <param name="value">The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.</param>
            public HosLogsSummaryResponseDriversBuilder TimeInCurrentStatus(long? value)
            {
                _TimeInCurrentStatus = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.DrivingInViolationCycle property.
            /// </summary>
            /// <param name="value">The amount of driving time in violation in this cycle (in ms).</param>
            public HosLogsSummaryResponseDriversBuilder DrivingInViolationCycle(long? value)
            {
                _DrivingInViolationCycle = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponseDrivers.ShiftRemaining property.
            /// </summary>
            /// <param name="value">The amount of remaining shift time (in ms).</param>
            public HosLogsSummaryResponseDriversBuilder ShiftRemaining(long? value)
            {
                _ShiftRemaining = value;
                return this;
            }


            /// <summary>
            /// Builds instance of HosLogsSummaryResponseDrivers.
            /// </summary>
            /// <returns>HosLogsSummaryResponseDrivers</returns>
            public HosLogsSummaryResponseDrivers Build()
            {
                Validate();
                return new HosLogsSummaryResponseDrivers(
                    TimeUntilBreak: _TimeUntilBreak,
                    VehicleName: _VehicleName,
                    DrivingInViolationToday: _DrivingInViolationToday,
                    DriverId: _DriverId,
                    CycleRemaining: _CycleRemaining,
                    DriverName: _DriverName,
                    DutyStatus: _DutyStatus,
                    CycleTomorrow: _CycleTomorrow,
                    ShiftDriveRemaining: _ShiftDriveRemaining,
                    TimeInCurrentStatus: _TimeInCurrentStatus,
                    DrivingInViolationCycle: _DrivingInViolationCycle,
                    ShiftRemaining: _ShiftRemaining
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}