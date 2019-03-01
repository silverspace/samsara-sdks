using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Information about an address/geofence. Geofences are either a circle or a polygon.
    /// </summary>
    public sealed class Address:  IEquatable<Address>
    { 
        /// <summary>
        /// Contacts
        /// </summary>
        public List<Contact> Contacts { get; private set; }

        /// <summary>
        /// The full address associated with this address/geofence, as it might be recognized by maps.google.com
        /// </summary>
        public string FormattedAddress { get; private set; }

        /// <summary>
        /// Geofence
        /// </summary>
        public AddressGeofence Geofence { get; private set; }

        /// <summary>
        /// ID of the address
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of the address or geofence
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Notes associated with an address.
        /// </summary>
        public string Notes { get; private set; }

        /// <summary>
        /// Tags
        /// </summary>
        public List<TagMetadata> Tags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Address.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Address()
        {
        }

        private Address(List<Contact> Contacts, string FormattedAddress, AddressGeofence Geofence, long? Id, string Name, string Notes, List<TagMetadata> Tags)
        {
            
            this.Contacts = Contacts;
            
            this.FormattedAddress = FormattedAddress;
            
            this.Geofence = Geofence;
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.Notes = Notes;
            
            this.Tags = Tags;
            
        }

        /// <summary>
        /// Returns builder of Address.
        /// </summary>
        /// <returns>AddressBuilder</returns>
        public static AddressBuilder Builder()
        {
            return new AddressBuilder();
        }

        /// <summary>
        /// Returns AddressBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AddressBuilder</returns>
        public AddressBuilder With()
        {
            return Builder()
                .Contacts(Contacts)
                .FormattedAddress(FormattedAddress)
                .Geofence(Geofence)
                .Id(Id)
                .Name(Name)
                .Notes(Notes)
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

        public bool Equals(Address other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Address.
        /// </summary>
        /// <param name="left">Compared (Address</param>
        /// <param name="right">Compared (Address</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Address left, Address right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Address.
        /// </summary>
        /// <param name="left">Compared (Address</param>
        /// <param name="right">Compared (Address</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Address left, Address right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Address.
        /// </summary>
        public sealed class AddressBuilder
        {
            private List<Contact> _Contacts;
            private string _FormattedAddress;
            private AddressGeofence _Geofence;
            private long? _Id;
            private string _Name;
            private string _Notes;
            private List<TagMetadata> _Tags;

            internal AddressBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Address.Contacts property.
            /// </summary>
            /// <param name="value">Contacts</param>
            public AddressBuilder Contacts(List<Contact> value)
            {
                _Contacts = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.FormattedAddress property.
            /// </summary>
            /// <param name="value">The full address associated with this address/geofence, as it might be recognized by maps.google.com</param>
            public AddressBuilder FormattedAddress(string value)
            {
                _FormattedAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.Geofence property.
            /// </summary>
            /// <param name="value">Geofence</param>
            public AddressBuilder Geofence(AddressGeofence value)
            {
                _Geofence = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.Id property.
            /// </summary>
            /// <param name="value">ID of the address</param>
            public AddressBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.Name property.
            /// </summary>
            /// <param name="value">Name of the address or geofence</param>
            public AddressBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.Notes property.
            /// </summary>
            /// <param name="value">Notes associated with an address.</param>
            public AddressBuilder Notes(string value)
            {
                _Notes = value;
                return this;
            }

            /// <summary>
            /// Sets value for Address.Tags property.
            /// </summary>
            /// <param name="value">Tags</param>
            public AddressBuilder Tags(List<TagMetadata> value)
            {
                _Tags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Address.
            /// </summary>
            /// <returns>Address</returns>
            public Address Build()
            {
                Validate();
                return new Address(
                    Contacts: _Contacts,
                    FormattedAddress: _FormattedAddress,
                    Geofence: _Geofence,
                    Id: _Id,
                    Name: _Name,
                    Notes: _Notes,
                    Tags: _Tags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}