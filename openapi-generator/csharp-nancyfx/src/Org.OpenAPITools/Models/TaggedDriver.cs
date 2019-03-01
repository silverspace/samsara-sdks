using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedDriver
    /// </summary>
    public sealed class TaggedDriver:  IEquatable<TaggedDriver>
    { 
        /// <summary>
        /// The ID of the Driver being tagged.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of the Driver being tagged.
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedDriver.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedDriver()
        {
        }

        private TaggedDriver(long? Id, string Name)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of TaggedDriver.
        /// </summary>
        /// <returns>TaggedDriverBuilder</returns>
        public static TaggedDriverBuilder Builder()
        {
            return new TaggedDriverBuilder();
        }

        /// <summary>
        /// Returns TaggedDriverBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedDriverBuilder</returns>
        public TaggedDriverBuilder With()
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

        public bool Equals(TaggedDriver other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedDriver.
        /// </summary>
        /// <param name="left">Compared (TaggedDriver</param>
        /// <param name="right">Compared (TaggedDriver</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedDriver left, TaggedDriver right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedDriver.
        /// </summary>
        /// <param name="left">Compared (TaggedDriver</param>
        /// <param name="right">Compared (TaggedDriver</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedDriver left, TaggedDriver right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedDriver.
        /// </summary>
        public sealed class TaggedDriverBuilder
        {
            private long? _Id;
            private string _Name;

            internal TaggedDriverBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedDriver.Id property.
            /// </summary>
            /// <param name="value">The ID of the Driver being tagged.</param>
            public TaggedDriverBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for TaggedDriver.Name property.
            /// </summary>
            /// <param name="value">Name of the Driver being tagged.</param>
            public TaggedDriverBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedDriver.
            /// </summary>
            /// <returns>TaggedDriver</returns>
            public TaggedDriver Build()
            {
                Validate();
                return new TaggedDriver(
                    Id: _Id,
                    Name: _Name
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedDriver and cannot be null");
                } 
            }
        }

        
    }
}