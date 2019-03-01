using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedDriverBase
    /// </summary>
    public sealed class TaggedDriverBase:  IEquatable<TaggedDriverBase>
    { 
        /// <summary>
        /// The ID of the Driver being tagged.
        /// </summary>
        public long? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedDriverBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedDriverBase()
        {
        }

        private TaggedDriverBase(long? Id)
        {
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of TaggedDriverBase.
        /// </summary>
        /// <returns>TaggedDriverBaseBuilder</returns>
        public static TaggedDriverBaseBuilder Builder()
        {
            return new TaggedDriverBaseBuilder();
        }

        /// <summary>
        /// Returns TaggedDriverBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedDriverBaseBuilder</returns>
        public TaggedDriverBaseBuilder With()
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

        public bool Equals(TaggedDriverBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedDriverBase.
        /// </summary>
        /// <param name="left">Compared (TaggedDriverBase</param>
        /// <param name="right">Compared (TaggedDriverBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedDriverBase left, TaggedDriverBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedDriverBase.
        /// </summary>
        /// <param name="left">Compared (TaggedDriverBase</param>
        /// <param name="right">Compared (TaggedDriverBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedDriverBase left, TaggedDriverBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedDriverBase.
        /// </summary>
        public sealed class TaggedDriverBaseBuilder
        {
            private long? _Id;

            internal TaggedDriverBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedDriverBase.Id property.
            /// </summary>
            /// <param name="value">The ID of the Driver being tagged.</param>
            public TaggedDriverBaseBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedDriverBase.
            /// </summary>
            /// <returns>TaggedDriverBase</returns>
            public TaggedDriverBase Build()
            {
                Validate();
                return new TaggedDriverBase(
                    Id: _Id
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedDriverBase and cannot be null");
                } 
            }
        }

        
    }
}