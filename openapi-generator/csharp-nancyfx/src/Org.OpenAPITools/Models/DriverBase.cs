using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DriverBase
    /// </summary>
    public sealed class DriverBase:  IEquatable<DriverBase>
    { 
        /// <summary>
        /// Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
        /// </summary>
        public bool? EldAdverseWeatherExemptionEnabled { get; private set; }

        /// <summary>
        /// Flag indicating this driver may use Big Day excemptions in ELD logs.
        /// </summary>
        public bool? EldBigDayExemptionEnabled { get; private set; }

        /// <summary>
        /// 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
        /// </summary>
        public int? EldDayStartHour { get; private set; }

        /// <summary>
        /// Flag indicating this driver is exempt from the Electronic Logging Mandate.
        /// </summary>
        public bool? EldExempt { get; private set; }

        /// <summary>
        /// Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
        /// </summary>
        public string EldExemptReason { get; private set; }

        /// <summary>
        /// Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
        /// </summary>
        public bool? EldPcEnabled { get; private set; }

        /// <summary>
        /// Flag indicating this driver may select the Yard Move duty status in ELD logs.
        /// </summary>
        public bool? EldYmEnabled { get; private set; }

        /// <summary>
        /// Dictionary of external IDs (string key-value pairs)
        /// </summary>
        public Dictionary<string, string> ExternalIds { get; private set; }

        /// <summary>
        /// ID of the group if the organization has multiple groups (uncommon).
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Driver&#39;s state issued license number.
        /// </summary>
        public string LicenseNumber { get; private set; }

        /// <summary>
        /// Abbreviation of state that issued driver&#39;s license.
        /// </summary>
        public string LicenseState { get; private set; }

        /// <summary>
        /// Driver&#39;s name.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Notes about the driver.
        /// </summary>
        public string Notes { get; private set; }

        /// <summary>
        /// Driver&#39;s phone number. Please include only digits, ex. 4157771234
        /// </summary>
        public string Phone { get; private set; }

        /// <summary>
        /// Driver&#39;s login username into the driver app.
        /// </summary>
        public string Username { get; private set; }

        /// <summary>
        /// ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
        /// </summary>
        public long? VehicleId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DriverBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DriverBase()
        {
        }

        private DriverBase(bool? EldAdverseWeatherExemptionEnabled, bool? EldBigDayExemptionEnabled, int? EldDayStartHour, bool? EldExempt, string EldExemptReason, bool? EldPcEnabled, bool? EldYmEnabled, Dictionary<string, string> ExternalIds, long? GroupId, string LicenseNumber, string LicenseState, string Name, string Notes, string Phone, string Username, long? VehicleId)
        {
            
            this.EldAdverseWeatherExemptionEnabled = EldAdverseWeatherExemptionEnabled;
            
            this.EldBigDayExemptionEnabled = EldBigDayExemptionEnabled;
            
            this.EldDayStartHour = EldDayStartHour;
            
            this.EldExempt = EldExempt;
            
            this.EldExemptReason = EldExemptReason;
            
            this.EldPcEnabled = EldPcEnabled;
            
            this.EldYmEnabled = EldYmEnabled;
            
            this.ExternalIds = ExternalIds;
            
            this.GroupId = GroupId;
            
            this.LicenseNumber = LicenseNumber;
            
            this.LicenseState = LicenseState;
            
            this.Name = Name;
            
            this.Notes = Notes;
            
            this.Phone = Phone;
            
            this.Username = Username;
            
            this.VehicleId = VehicleId;
            
        }

        /// <summary>
        /// Returns builder of DriverBase.
        /// </summary>
        /// <returns>DriverBaseBuilder</returns>
        public static DriverBaseBuilder Builder()
        {
            return new DriverBaseBuilder();
        }

        /// <summary>
        /// Returns DriverBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DriverBaseBuilder</returns>
        public DriverBaseBuilder With()
        {
            return Builder()
                .EldAdverseWeatherExemptionEnabled(EldAdverseWeatherExemptionEnabled)
                .EldBigDayExemptionEnabled(EldBigDayExemptionEnabled)
                .EldDayStartHour(EldDayStartHour)
                .EldExempt(EldExempt)
                .EldExemptReason(EldExemptReason)
                .EldPcEnabled(EldPcEnabled)
                .EldYmEnabled(EldYmEnabled)
                .ExternalIds(ExternalIds)
                .GroupId(GroupId)
                .LicenseNumber(LicenseNumber)
                .LicenseState(LicenseState)
                .Name(Name)
                .Notes(Notes)
                .Phone(Phone)
                .Username(Username)
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

        public bool Equals(DriverBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DriverBase.
        /// </summary>
        /// <param name="left">Compared (DriverBase</param>
        /// <param name="right">Compared (DriverBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DriverBase left, DriverBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DriverBase.
        /// </summary>
        /// <param name="left">Compared (DriverBase</param>
        /// <param name="right">Compared (DriverBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DriverBase left, DriverBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DriverBase.
        /// </summary>
        public sealed class DriverBaseBuilder
        {
            private bool? _EldAdverseWeatherExemptionEnabled;
            private bool? _EldBigDayExemptionEnabled;
            private int? _EldDayStartHour;
            private bool? _EldExempt;
            private string _EldExemptReason;
            private bool? _EldPcEnabled;
            private bool? _EldYmEnabled;
            private Dictionary<string, string> _ExternalIds;
            private long? _GroupId;
            private string _LicenseNumber;
            private string _LicenseState;
            private string _Name;
            private string _Notes;
            private string _Phone;
            private string _Username;
            private long? _VehicleId;

            internal DriverBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _EldPcEnabled = false;
                _EldYmEnabled = false;
            }

            /// <summary>
            /// Sets value for DriverBase.EldAdverseWeatherExemptionEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may use Adverse Weather exemptions in ELD logs.</param>
            public DriverBaseBuilder EldAdverseWeatherExemptionEnabled(bool? value)
            {
                _EldAdverseWeatherExemptionEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.EldBigDayExemptionEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may use Big Day excemptions in ELD logs.</param>
            public DriverBaseBuilder EldBigDayExemptionEnabled(bool? value)
            {
                _EldBigDayExemptionEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.EldDayStartHour property.
            /// </summary>
            /// <param name="value">0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.</param>
            public DriverBaseBuilder EldDayStartHour(int? value)
            {
                _EldDayStartHour = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.EldExempt property.
            /// </summary>
            /// <param name="value">Flag indicating this driver is exempt from the Electronic Logging Mandate.</param>
            public DriverBaseBuilder EldExempt(bool? value)
            {
                _EldExempt = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.EldExemptReason property.
            /// </summary>
            /// <param name="value">Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).</param>
            public DriverBaseBuilder EldExemptReason(string value)
            {
                _EldExemptReason = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.EldPcEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.</param>
            public DriverBaseBuilder EldPcEnabled(bool? value)
            {
                _EldPcEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.EldYmEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may select the Yard Move duty status in ELD logs.</param>
            public DriverBaseBuilder EldYmEnabled(bool? value)
            {
                _EldYmEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.ExternalIds property.
            /// </summary>
            /// <param name="value">Dictionary of external IDs (string key-value pairs)</param>
            public DriverBaseBuilder ExternalIds(Dictionary<string, string> value)
            {
                _ExternalIds = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.GroupId property.
            /// </summary>
            /// <param name="value">ID of the group if the organization has multiple groups (uncommon).</param>
            public DriverBaseBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.LicenseNumber property.
            /// </summary>
            /// <param name="value">Driver&#39;s state issued license number.</param>
            public DriverBaseBuilder LicenseNumber(string value)
            {
                _LicenseNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.LicenseState property.
            /// </summary>
            /// <param name="value">Abbreviation of state that issued driver&#39;s license.</param>
            public DriverBaseBuilder LicenseState(string value)
            {
                _LicenseState = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.Name property.
            /// </summary>
            /// <param name="value">Driver&#39;s name.</param>
            public DriverBaseBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.Notes property.
            /// </summary>
            /// <param name="value">Notes about the driver.</param>
            public DriverBaseBuilder Notes(string value)
            {
                _Notes = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.Phone property.
            /// </summary>
            /// <param name="value">Driver&#39;s phone number. Please include only digits, ex. 4157771234</param>
            public DriverBaseBuilder Phone(string value)
            {
                _Phone = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.Username property.
            /// </summary>
            /// <param name="value">Driver&#39;s login username into the driver app.</param>
            public DriverBaseBuilder Username(string value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverBase.VehicleId property.
            /// </summary>
            /// <param name="value">ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).</param>
            public DriverBaseBuilder VehicleId(long? value)
            {
                _VehicleId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DriverBase.
            /// </summary>
            /// <returns>DriverBase</returns>
            public DriverBase Build()
            {
                Validate();
                return new DriverBase(
                    EldAdverseWeatherExemptionEnabled: _EldAdverseWeatherExemptionEnabled,
                    EldBigDayExemptionEnabled: _EldBigDayExemptionEnabled,
                    EldDayStartHour: _EldDayStartHour,
                    EldExempt: _EldExempt,
                    EldExemptReason: _EldExemptReason,
                    EldPcEnabled: _EldPcEnabled,
                    EldYmEnabled: _EldYmEnabled,
                    ExternalIds: _ExternalIds,
                    GroupId: _GroupId,
                    LicenseNumber: _LicenseNumber,
                    LicenseState: _LicenseState,
                    Name: _Name,
                    Notes: _Notes,
                    Phone: _Phone,
                    Username: _Username,
                    VehicleId: _VehicleId
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for DriverBase and cannot be null");
                } 
            }
        }

        
    }
}