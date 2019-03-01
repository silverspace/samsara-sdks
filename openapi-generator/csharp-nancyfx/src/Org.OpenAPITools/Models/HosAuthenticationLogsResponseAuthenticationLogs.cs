using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// HosAuthenticationLogsResponseAuthenticationLogs
    /// </summary>
    public sealed class HosAuthenticationLogsResponseAuthenticationLogs:  IEquatable<HosAuthenticationLogsResponseAuthenticationLogs>
    { 
        /// <summary>
        /// The log type - one of &#39;signin&#39; or &#39;signout&#39;
        /// </summary>
        public string ActionType { get; private set; }

        /// <summary>
        /// Address at which the log was recorded, if applicable.
        /// </summary>
        public string Address { get; private set; }

        /// <summary>
        /// City in which the log was recorded, if applicable.
        /// </summary>
        public string City { get; private set; }

        /// <summary>
        /// The time at which the event was recorded in UNIX milliseconds.
        /// </summary>
        public long? HappenedAtMs { get; private set; }

        /// <summary>
        /// Address name from the group address book at which the log was recorded, if applicable.
        /// </summary>
        public string AddressName { get; private set; }

        /// <summary>
        /// State in which the log was recorded, if applicable.
        /// </summary>
        public string State { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use HosAuthenticationLogsResponseAuthenticationLogs.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public HosAuthenticationLogsResponseAuthenticationLogs()
        {
        }

        private HosAuthenticationLogsResponseAuthenticationLogs(string ActionType, string Address, string City, long? HappenedAtMs, string AddressName, string State)
        {
            
            this.ActionType = ActionType;
            
            this.Address = Address;
            
            this.City = City;
            
            this.HappenedAtMs = HappenedAtMs;
            
            this.AddressName = AddressName;
            
            this.State = State;
            
        }

        /// <summary>
        /// Returns builder of HosAuthenticationLogsResponseAuthenticationLogs.
        /// </summary>
        /// <returns>HosAuthenticationLogsResponseAuthenticationLogsBuilder</returns>
        public static HosAuthenticationLogsResponseAuthenticationLogsBuilder Builder()
        {
            return new HosAuthenticationLogsResponseAuthenticationLogsBuilder();
        }

        /// <summary>
        /// Returns HosAuthenticationLogsResponseAuthenticationLogsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>HosAuthenticationLogsResponseAuthenticationLogsBuilder</returns>
        public HosAuthenticationLogsResponseAuthenticationLogsBuilder With()
        {
            return Builder()
                .ActionType(ActionType)
                .Address(Address)
                .City(City)
                .HappenedAtMs(HappenedAtMs)
                .AddressName(AddressName)
                .State(State);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(HosAuthenticationLogsResponseAuthenticationLogs other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (HosAuthenticationLogsResponseAuthenticationLogs.
        /// </summary>
        /// <param name="left">Compared (HosAuthenticationLogsResponseAuthenticationLogs</param>
        /// <param name="right">Compared (HosAuthenticationLogsResponseAuthenticationLogs</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (HosAuthenticationLogsResponseAuthenticationLogs left, HosAuthenticationLogsResponseAuthenticationLogs right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (HosAuthenticationLogsResponseAuthenticationLogs.
        /// </summary>
        /// <param name="left">Compared (HosAuthenticationLogsResponseAuthenticationLogs</param>
        /// <param name="right">Compared (HosAuthenticationLogsResponseAuthenticationLogs</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (HosAuthenticationLogsResponseAuthenticationLogs left, HosAuthenticationLogsResponseAuthenticationLogs right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of HosAuthenticationLogsResponseAuthenticationLogs.
        /// </summary>
        public sealed class HosAuthenticationLogsResponseAuthenticationLogsBuilder
        {
            private string _ActionType;
            private string _Address;
            private string _City;
            private long? _HappenedAtMs;
            private string _AddressName;
            private string _State;

            internal HosAuthenticationLogsResponseAuthenticationLogsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for HosAuthenticationLogsResponseAuthenticationLogs.ActionType property.
            /// </summary>
            /// <param name="value">The log type - one of &#39;signin&#39; or &#39;signout&#39;</param>
            public HosAuthenticationLogsResponseAuthenticationLogsBuilder ActionType(string value)
            {
                _ActionType = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosAuthenticationLogsResponseAuthenticationLogs.Address property.
            /// </summary>
            /// <param name="value">Address at which the log was recorded, if applicable.</param>
            public HosAuthenticationLogsResponseAuthenticationLogsBuilder Address(string value)
            {
                _Address = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosAuthenticationLogsResponseAuthenticationLogs.City property.
            /// </summary>
            /// <param name="value">City in which the log was recorded, if applicable.</param>
            public HosAuthenticationLogsResponseAuthenticationLogsBuilder City(string value)
            {
                _City = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosAuthenticationLogsResponseAuthenticationLogs.HappenedAtMs property.
            /// </summary>
            /// <param name="value">The time at which the event was recorded in UNIX milliseconds.</param>
            public HosAuthenticationLogsResponseAuthenticationLogsBuilder HappenedAtMs(long? value)
            {
                _HappenedAtMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosAuthenticationLogsResponseAuthenticationLogs.AddressName property.
            /// </summary>
            /// <param name="value">Address name from the group address book at which the log was recorded, if applicable.</param>
            public HosAuthenticationLogsResponseAuthenticationLogsBuilder AddressName(string value)
            {
                _AddressName = value;
                return this;
            }

            /// <summary>
            /// Sets value for HosAuthenticationLogsResponseAuthenticationLogs.State property.
            /// </summary>
            /// <param name="value">State in which the log was recorded, if applicable.</param>
            public HosAuthenticationLogsResponseAuthenticationLogsBuilder State(string value)
            {
                _State = value;
                return this;
            }


            /// <summary>
            /// Builds instance of HosAuthenticationLogsResponseAuthenticationLogs.
            /// </summary>
            /// <returns>HosAuthenticationLogsResponseAuthenticationLogs</returns>
            public HosAuthenticationLogsResponseAuthenticationLogs Build()
            {
                Validate();
                return new HosAuthenticationLogsResponseAuthenticationLogs(
                    ActionType: _ActionType,
                    Address: _Address,
                    City: _City,
                    HappenedAtMs: _HappenedAtMs,
                    AddressName: _AddressName,
                    State: _State
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}