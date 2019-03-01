using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject1
    /// </summary>
    public sealed class InlineObject1:  IEquatable<InlineObject1>
    { 
        /// <summary>
        /// A list of IDs for contact book entries.
        /// </summary>
        public List<long?> ContactIds { get; private set; }

        /// <summary>
        /// The full address associated with this address/geofence, as it might be recognized by maps.google.com
        /// </summary>
        public string FormattedAddress { get; private set; }

        /// <summary>
        /// Geofence
        /// </summary>
        public AddressGeofence Geofence { get; private set; }

        /// <summary>
        /// The name of this address/geofence
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Notes associated with an address.
        /// </summary>
        public string Notes { get; private set; }

        /// <summary>
        /// A list of tag IDs.
        /// </summary>
        public List<long?> TagIds { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject1.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject1()
        {
        }

        private InlineObject1(List<long?> ContactIds, string FormattedAddress, AddressGeofence Geofence, string Name, string Notes, List<long?> TagIds)
        {
            
            this.ContactIds = ContactIds;
            
            this.FormattedAddress = FormattedAddress;
            
            this.Geofence = Geofence;
            
            this.Name = Name;
            
            this.Notes = Notes;
            
            this.TagIds = TagIds;
            
        }

        /// <summary>
        /// Returns builder of InlineObject1.
        /// </summary>
        /// <returns>InlineObject1Builder</returns>
        public static InlineObject1Builder Builder()
        {
            return new InlineObject1Builder();
        }

        /// <summary>
        /// Returns InlineObject1Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject1Builder</returns>
        public InlineObject1Builder With()
        {
            return Builder()
                .ContactIds(ContactIds)
                .FormattedAddress(FormattedAddress)
                .Geofence(Geofence)
                .Name(Name)
                .Notes(Notes)
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

        public bool Equals(InlineObject1 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject1.
        /// </summary>
        /// <param name="left">Compared (InlineObject1</param>
        /// <param name="right">Compared (InlineObject1</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject1 left, InlineObject1 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject1.
        /// </summary>
        /// <param name="left">Compared (InlineObject1</param>
        /// <param name="right">Compared (InlineObject1</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject1 left, InlineObject1 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject1.
        /// </summary>
        public sealed class InlineObject1Builder
        {
            private List<long?> _ContactIds;
            private string _FormattedAddress;
            private AddressGeofence _Geofence;
            private string _Name;
            private string _Notes;
            private List<long?> _TagIds;

            internal InlineObject1Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject1.ContactIds property.
            /// </summary>
            /// <param name="value">A list of IDs for contact book entries.</param>
            public InlineObject1Builder ContactIds(List<long?> value)
            {
                _ContactIds = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject1.FormattedAddress property.
            /// </summary>
            /// <param name="value">The full address associated with this address/geofence, as it might be recognized by maps.google.com</param>
            public InlineObject1Builder FormattedAddress(string value)
            {
                _FormattedAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject1.Geofence property.
            /// </summary>
            /// <param name="value">Geofence</param>
            public InlineObject1Builder Geofence(AddressGeofence value)
            {
                _Geofence = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject1.Name property.
            /// </summary>
            /// <param name="value">The name of this address/geofence</param>
            public InlineObject1Builder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject1.Notes property.
            /// </summary>
            /// <param name="value">Notes associated with an address.</param>
            public InlineObject1Builder Notes(string value)
            {
                _Notes = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject1.TagIds property.
            /// </summary>
            /// <param name="value">A list of tag IDs.</param>
            public InlineObject1Builder TagIds(List<long?> value)
            {
                _TagIds = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject1.
            /// </summary>
            /// <returns>InlineObject1</returns>
            public InlineObject1 Build()
            {
                Validate();
                return new InlineObject1(
                    ContactIds: _ContactIds,
                    FormattedAddress: _FormattedAddress,
                    Geofence: _Geofence,
                    Name: _Name,
                    Notes: _Notes,
                    TagIds: _TagIds
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}