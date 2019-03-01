using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DriverForCreate
    /// </summary>
    public sealed class DriverForCreate:  IEquatable<DriverForCreate>
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
        /// Driver&#39;s password for the driver app.
        /// </summary>
        public string Password { get; private set; }

        /// <summary>
        /// A list of tag IDs.
        /// </summary>
        public List<long?> TagIds { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DriverForCreate.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DriverForCreate()
        {
        }

        private DriverForCreate(bool? EldAdverseWeatherExemptionEnabled, bool? EldBigDayExemptionEnabled, int? EldDayStartHour, bool? EldExempt, string EldExemptReason, bool? EldPcEnabled, bool? EldYmEnabled, Dictionary<string, string> ExternalIds, long? GroupId, string LicenseNumber, string LicenseState, string Name, string Notes, string Phone, string Username, long? VehicleId, string Password, List<long?> TagIds)
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
            
            this.Password = Password;
            
            this.TagIds = TagIds;
            
        }

        /// <summary>
        /// Returns builder of DriverForCreate.
        /// </summary>
        /// <returns>DriverForCreateBuilder</returns>
        public static DriverForCreateBuilder Builder()
        {
            return new DriverForCreateBuilder();
        }

        /// <summary>
        /// Returns DriverForCreateBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DriverForCreateBuilder</returns>
        public DriverForCreateBuilder With()
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
                .VehicleId(VehicleId)
                .Password(Password)
                .TagIds(TagIds);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DriverForCreate other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DriverForCreate.
        /// </summary>
        /// <param name="left">Compared (DriverForCreate</param>
        /// <param name="right">Compared (DriverForCreate</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DriverForCreate left, DriverForCreate right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DriverForCreate.
        /// </summary>
        /// <param name="left">Compared (DriverForCreate</param>
        /// <param name="right">Compared (DriverForCreate</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DriverForCreate left, DriverForCreate right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DriverForCreate.
        /// </summary>
        public sealed class DriverForCreateBuilder
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
            private string _Password;
            private List<long?> _TagIds;

            internal DriverForCreateBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _EldPcEnabled = false;
                _EldYmEnabled = false;
            }

            /// <summary>
            /// Sets value for DriverForCreate.EldAdverseWeatherExemptionEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may use Adverse Weather exemptions in ELD logs.</param>
            public DriverForCreateBuilder EldAdverseWeatherExemptionEnabled(bool? value)
            {
                _EldAdverseWeatherExemptionEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.EldBigDayExemptionEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may use Big Day excemptions in ELD logs.</param>
            public DriverForCreateBuilder EldBigDayExemptionEnabled(bool? value)
            {
                _EldBigDayExemptionEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.EldDayStartHour property.
            /// </summary>
            /// <param name="value">0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.</param>
            public DriverForCreateBuilder EldDayStartHour(int? value)
            {
                _EldDayStartHour = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.EldExempt property.
            /// </summary>
            /// <param name="value">Flag indicating this driver is exempt from the Electronic Logging Mandate.</param>
            public DriverForCreateBuilder EldExempt(bool? value)
            {
                _EldExempt = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.EldExemptReason property.
            /// </summary>
            /// <param name="value">Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).</param>
            public DriverForCreateBuilder EldExemptReason(string value)
            {
                _EldExemptReason = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.EldPcEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.</param>
            public DriverForCreateBuilder EldPcEnabled(bool? value)
            {
                _EldPcEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.EldYmEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may select the Yard Move duty status in ELD logs.</param>
            public DriverForCreateBuilder EldYmEnabled(bool? value)
            {
                _EldYmEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.ExternalIds property.
            /// </summary>
            /// <param name="value">Dictionary of external IDs (string key-value pairs)</param>
            public DriverForCreateBuilder ExternalIds(Dictionary<string, string> value)
            {
                _ExternalIds = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.GroupId property.
            /// </summary>
            /// <param name="value">ID of the group if the organization has multiple groups (uncommon).</param>
            public DriverForCreateBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.LicenseNumber property.
            /// </summary>
            /// <param name="value">Driver&#39;s state issued license number.</param>
            public DriverForCreateBuilder LicenseNumber(string value)
            {
                _LicenseNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.LicenseState property.
            /// </summary>
            /// <param name="value">Abbreviation of state that issued driver&#39;s license.</param>
            public DriverForCreateBuilder LicenseState(string value)
            {
                _LicenseState = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.Name property.
            /// </summary>
            /// <param name="value">Driver&#39;s name.</param>
            public DriverForCreateBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.Notes property.
            /// </summary>
            /// <param name="value">Notes about the driver.</param>
            public DriverForCreateBuilder Notes(string value)
            {
                _Notes = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.Phone property.
            /// </summary>
            /// <param name="value">Driver&#39;s phone number. Please include only digits, ex. 4157771234</param>
            public DriverForCreateBuilder Phone(string value)
            {
                _Phone = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.Username property.
            /// </summary>
            /// <param name="value">Driver&#39;s login username into the driver app.</param>
            public DriverForCreateBuilder Username(string value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.VehicleId property.
            /// </summary>
            /// <param name="value">ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).</param>
            public DriverForCreateBuilder VehicleId(long? value)
            {
                _VehicleId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.Password property.
            /// </summary>
            /// <param name="value">Driver&#39;s password for the driver app.</param>
            public DriverForCreateBuilder Password(string value)
            {
                _Password = value;
                return this;
            }

            /// <summary>
            /// Sets value for DriverForCreate.TagIds property.
            /// </summary>
            /// <param name="value">A list of tag IDs.</param>
            public DriverForCreateBuilder TagIds(List<long?> value)
            {
                _TagIds = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DriverForCreate.
            /// </summary>
            /// <returns>DriverForCreate</returns>
            public DriverForCreate Build()
            {
                Validate();
                return new DriverForCreate(
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
                    VehicleId: _VehicleId,
                    Password: _Password,
                    TagIds: _TagIds
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for DriverForCreate and cannot be null");
                } 
                if (_Password == null)
                {
                    throw new ArgumentException("Password is a required property for DriverForCreate and cannot be null");
                } 
            }
        }

        
    }
}