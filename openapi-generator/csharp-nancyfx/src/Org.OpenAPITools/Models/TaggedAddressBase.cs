using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedAddressBase
    /// </summary>
    public sealed class TaggedAddressBase:  IEquatable<TaggedAddressBase>
    { 
        /// <summary>
        /// The ID of the address being tagged.
        /// </summary>
        public long? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedAddressBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedAddressBase()
        {
        }

        private TaggedAddressBase(long? Id)
        {
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of TaggedAddressBase.
        /// </summary>
        /// <returns>TaggedAddressBaseBuilder</returns>
        public static TaggedAddressBaseBuilder Builder()
        {
            return new TaggedAddressBaseBuilder();
        }

        /// <summary>
        /// Returns TaggedAddressBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedAddressBaseBuilder</returns>
        public TaggedAddressBaseBuilder With()
        {
            return Builder()
                .Id(Id);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(TaggedAddressBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedAddressBase.
        /// </summary>
        /// <param name="left">Compared (TaggedAddressBase</param>
        /// <param name="right">Compared (TaggedAddressBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedAddressBase left, TaggedAddressBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedAddressBase.
        /// </summary>
        /// <param name="left">Compared (TaggedAddressBase</param>
        /// <param name="right">Compared (TaggedAddressBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedAddressBase left, TaggedAddressBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedAddressBase.
        /// </summary>
        public sealed class TaggedAddressBaseBuilder
        {
            private long? _Id;

            internal TaggedAddressBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedAddressBase.Id property.
            /// </summary>
            /// <param name="value">The ID of the address being tagged.</param>
            public TaggedAddressBaseBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedAddressBase.
            /// </summary>
            /// <returns>TaggedAddressBase</returns>
            public TaggedAddressBase Build()
            {
                Validate();
                return new TaggedAddressBase(
                    Id: _Id
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedAddressBase and cannot be null");
                } 
            }
        }

        
    }
}