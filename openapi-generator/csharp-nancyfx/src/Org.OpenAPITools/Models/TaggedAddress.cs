using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedAddress
    /// </summary>
    public sealed class TaggedAddress:  IEquatable<TaggedAddress>
    { 
        /// <summary>
        /// The ID of the address being tagged.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of the address being tagged.
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedAddress.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedAddress()
        {
        }

        private TaggedAddress(long? Id, string Name)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of TaggedAddress.
        /// </summary>
        /// <returns>TaggedAddressBuilder</returns>
        public static TaggedAddressBuilder Builder()
        {
            return new TaggedAddressBuilder();
        }

        /// <summary>
        /// Returns TaggedAddressBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedAddressBuilder</returns>
        public TaggedAddressBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(TaggedAddress other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedAddress.
        /// </summary>
        /// <param name="left">Compared (TaggedAddress</param>
        /// <param name="right">Compared (TaggedAddress</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedAddress left, TaggedAddress right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedAddress.
        /// </summary>
        /// <param name="left">Compared (TaggedAddress</param>
        /// <param name="right">Compared (TaggedAddress</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedAddress left, TaggedAddress right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedAddress.
        /// </summary>
        public sealed class TaggedAddressBuilder
        {
            private long? _Id;
            private string _Name;

            internal TaggedAddressBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedAddress.Id property.
            /// </summary>
            /// <param name="value">The ID of the address being tagged.</param>
            public TaggedAddressBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for TaggedAddress.Name property.
            /// </summary>
            /// <param name="value">Name of the address being tagged.</param>
            public TaggedAddressBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedAddress.
            /// </summary>
            /// <returns>TaggedAddress</returns>
            public TaggedAddress Build()
            {
                Validate();
                return new TaggedAddress(
                    Id: _Id,
                    Name: _Name
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedAddress and cannot be null");
                } 
            }
        }

        
    }
}