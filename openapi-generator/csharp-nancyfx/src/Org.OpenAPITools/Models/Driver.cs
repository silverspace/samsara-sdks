using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Driver
    /// </summary>
    public sealed class Driver:  IEquatable<Driver>
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
        /// ID of the driver.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// True if the driver account has been deactivated.
        /// </summary>
        public bool? IsDeactivated { get; private set; }

        /// <summary>
        /// Tags
        /// </summary>
        public List<TagMetadata> Tags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Driver.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Driver()
        {
        }

        private Driver(bool? EldAdverseWeatherExemptionEnabled, bool? EldBigDayExemptionEnabled, int? EldDayStartHour, bool? EldExempt, string EldExemptReason, bool? EldPcEnabled, bool? EldYmEnabled, Dictionary<string, string> ExternalIds, long? GroupId, string LicenseNumber, string LicenseState, string Name, string Notes, string Phone, string Username, long? VehicleId, long? Id, bool? IsDeactivated, List<TagMetadata> Tags)
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
            
            this.Id = Id;
            
            this.IsDeactivated = IsDeactivated;
            
            this.Tags = Tags;
            
        }

        /// <summary>
        /// Returns builder of Driver.
        /// </summary>
        /// <returns>DriverBuilder</returns>
        public static DriverBuilder Builder()
        {
            return new DriverBuilder();
        }

        /// <summary>
        /// Returns DriverBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DriverBuilder</returns>
        public DriverBuilder With()
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
                .Id(Id)
                .IsDeactivated(IsDeactivated)
                .Tags(Tags);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Driver other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Driver.
        /// </summary>
        /// <param name="left">Compared (Driver</param>
        /// <param name="right">Compared (Driver</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Driver left, Driver right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Driver.
        /// </summary>
        /// <param name="left">Compared (Driver</param>
        /// <param name="right">Compared (Driver</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Driver left, Driver right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Driver.
        /// </summary>
        public sealed class DriverBuilder
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
            private long? _Id;
            private bool? _IsDeactivated;
            private List<TagMetadata> _Tags;

            internal DriverBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _EldPcEnabled = false;
                _EldYmEnabled = false;
            }

            /// <summary>
            /// Sets value for Driver.EldAdverseWeatherExemptionEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may use Adverse Weather exemptions in ELD logs.</param>
            public DriverBuilder EldAdverseWeatherExemptionEnabled(bool? value)
            {
                _EldAdverseWeatherExemptionEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.EldBigDayExemptionEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may use Big Day excemptions in ELD logs.</param>
            public DriverBuilder EldBigDayExemptionEnabled(bool? value)
            {
                _EldBigDayExemptionEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.EldDayStartHour property.
            /// </summary>
            /// <param name="value">0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.</param>
            public DriverBuilder EldDayStartHour(int? value)
            {
                _EldDayStartHour = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.EldExempt property.
            /// </summary>
            /// <param name="value">Flag indicating this driver is exempt from the Electronic Logging Mandate.</param>
            public DriverBuilder EldExempt(bool? value)
            {
                _EldExempt = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.EldExemptReason property.
            /// </summary>
            /// <param name="value">Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).</param>
            public DriverBuilder EldExemptReason(string value)
            {
                _EldExemptReason = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.EldPcEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.</param>
            public DriverBuilder EldPcEnabled(bool? value)
            {
                _EldPcEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.EldYmEnabled property.
            /// </summary>
            /// <param name="value">Flag indicating this driver may select the Yard Move duty status in ELD logs.</param>
            public DriverBuilder EldYmEnabled(bool? value)
            {
                _EldYmEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.ExternalIds property.
            /// </summary>
            /// <param name="value">Dictionary of external IDs (string key-value pairs)</param>
            public DriverBuilder ExternalIds(Dictionary<string, string> value)
            {
                _ExternalIds = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.GroupId property.
            /// </summary>
            /// <param name="value">ID of the group if the organization has multiple groups (uncommon).</param>
            public DriverBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.LicenseNumber property.
            /// </summary>
            /// <param name="value">Driver&#39;s state issued license number.</param>
            public DriverBuilder LicenseNumber(string value)
            {
                _LicenseNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.LicenseState property.
            /// </summary>
            /// <param name="value">Abbreviation of state that issued driver&#39;s license.</param>
            public DriverBuilder LicenseState(string value)
            {
                _LicenseState = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.Name property.
            /// </summary>
            /// <param name="value">Driver&#39;s name.</param>
            public DriverBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.Notes property.
            /// </summary>
            /// <param name="value">Notes about the driver.</param>
            public DriverBuilder Notes(string value)
            {
                _Notes = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.Phone property.
            /// </summary>
            /// <param name="value">Driver&#39;s phone number. Please include only digits, ex. 4157771234</param>
            public DriverBuilder Phone(string value)
            {
                _Phone = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.Username property.
            /// </summary>
            /// <param name="value">Driver&#39;s login username into the driver app.</param>
            public DriverBuilder Username(string value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.VehicleId property.
            /// </summary>
            /// <param name="value">ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).</param>
            public DriverBuilder VehicleId(long? value)
            {
                _VehicleId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.Id property.
            /// </summary>
            /// <param name="value">ID of the driver.</param>
            public DriverBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.IsDeactivated property.
            /// </summary>
            /// <param name="value">True if the driver account has been deactivated.</param>
            public DriverBuilder IsDeactivated(bool? value)
            {
                _IsDeactivated = value;
                return this;
            }

            /// <summary>
            /// Sets value for Driver.Tags property.
            /// </summary>
            /// <param name="value">Tags</param>
            public DriverBuilder Tags(List<TagMetadata> value)
            {
                _Tags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Driver.
            /// </summary>
            /// <returns>Driver</returns>
            public Driver Build()
            {
                Validate();
                return new Driver(
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
                    Id: _Id,
                    IsDeactivated: _IsDeactivated,
                    Tags: _Tags
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for Driver and cannot be null");
                } 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for Driver and cannot be null");
                } 
            }
        }

        
    }
}