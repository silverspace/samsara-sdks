using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AddressesAddresses
    /// </summary>
    public sealed class AddressesAddresses:  IEquatable<AddressesAddresses>
    { 
        /// <summary>
        /// Notes associated with an address.
        /// </summary>
        public string Notes { get; private set; }

        /// <summary>
        /// The full address associated with this address/geofence, as it might be recognized by maps.google.com
        /// </summary>
        public string FormattedAddress { get; private set; }

        /// <summary>
        /// Geofence
        /// </summary>
        public AddressGeofence Geofence { get; private set; }

        /// <summary>
        /// A list of tag IDs.
        /// </summary>
        public List<long?> TagIds { get; private set; }

        /// <summary>
        /// The name of this address/geofence
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// A list of IDs for contact book entries.
        /// </summary>
        public List<long?> ContactIds { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AddressesAddresses.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AddressesAddresses()
        {
        }

        private AddressesAddresses(string Notes, string FormattedAddress, AddressGeofence Geofence, List<long?> TagIds, string Name, List<long?> ContactIds)
        {
            
            this.Notes = Notes;
            
            this.FormattedAddress = FormattedAddress;
            
            this.Geofence = Geofence;
            
            this.TagIds = TagIds;
            
            this.Name = Name;
            
            this.ContactIds = ContactIds;
            
        }

        /// <summary>
        /// Returns builder of AddressesAddresses.
        /// </summary>
        /// <returns>AddressesAddressesBuilder</returns>
        public static AddressesAddressesBuilder Builder()
        {
            return new AddressesAddressesBuilder();
        }

        /// <summary>
        /// Returns AddressesAddressesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AddressesAddressesBuilder</returns>
        public AddressesAddressesBuilder With()
        {
            return Builder()
                .Notes(Notes)
                .FormattedAddress(FormattedAddress)
                .Geofence(Geofence)
                .TagIds(TagIds)
                .Name(Name)
                .ContactIds(ContactIds);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AddressesAddresses other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AddressesAddresses.
        /// </summary>
        /// <param name="left">Compared (AddressesAddresses</param>
        /// <param name="right">Compared (AddressesAddresses</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AddressesAddresses left, AddressesAddresses right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AddressesAddresses.
        /// </summary>
        /// <param name="left">Compared (AddressesAddresses</param>
        /// <param name="right">Compared (AddressesAddresses</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AddressesAddresses left, AddressesAddresses right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AddressesAddresses.
        /// </summary>
        public sealed class AddressesAddressesBuilder
        {
            private string _Notes;
            private string _FormattedAddress;
            private AddressGeofence _Geofence;
            private List<long?> _TagIds;
            private string _Name;
            private List<long?> _ContactIds;

            internal AddressesAddressesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AddressesAddresses.Notes property.
            /// </summary>
            /// <param name="value">Notes associated with an address.</param>
            public AddressesAddressesBuilder Notes(string value)
            {
                _Notes = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressesAddresses.FormattedAddress property.
            /// </summary>
            /// <param name="value">The full address associated with this address/geofence, as it might be recognized by maps.google.com</param>
            public AddressesAddressesBuilder FormattedAddress(string value)
            {
                _FormattedAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressesAddresses.Geofence property.
            /// </summary>
            /// <param name="value">Geofence</param>
            public AddressesAddressesBuilder Geofence(AddressGeofence value)
            {
                _Geofence = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressesAddresses.TagIds property.
            /// </summary>
            /// <param name="value">A list of tag IDs.</param>
            public AddressesAddressesBuilder TagIds(List<long?> value)
            {
                _TagIds = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressesAddresses.Name property.
            /// </summary>
            /// <param name="value">The name of this address/geofence</param>
            public AddressesAddressesBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddressesAddresses.ContactIds property.
            /// </summary>
            /// <param name="value">A list of IDs for contact book entries.</param>
            public AddressesAddressesBuilder ContactIds(List<long?> value)
            {
                _ContactIds = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AddressesAddresses.
            /// </summary>
            /// <returns>AddressesAddresses</returns>
            public AddressesAddresses Build()
            {
                Validate();
                return new AddressesAddresses(
                    Notes: _Notes,
                    FormattedAddress: _FormattedAddress,
                    Geofence: _Geofence,
                    TagIds: _TagIds,
                    Name: _Name,
                    ContactIds: _ContactIds
                );
            }

            private void Validate()
            { 
                if (_FormattedAddress == null)
                {
                    throw new ArgumentException("FormattedAddress is a required property for AddressesAddresses and cannot be null");
                } 
                if (_Geofence == null)
                {
                    throw new ArgumentException("Geofence is a required property for AddressesAddresses and cannot be null");
                } 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for AddressesAddresses and cannot be null");
                } 
            }
        }

        
    }
}