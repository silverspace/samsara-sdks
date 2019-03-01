using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedSensorBase
    /// </summary>
    public sealed class TaggedSensorBase:  IEquatable<TaggedSensorBase>
    { 
        /// <summary>
        /// The ID of the Sensor being tagged.
        /// </summary>
        public long? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedSensorBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedSensorBase()
        {
        }

        private TaggedSensorBase(long? Id)
        {
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of TaggedSensorBase.
        /// </summary>
        /// <returns>TaggedSensorBaseBuilder</returns>
        public static TaggedSensorBaseBuilder Builder()
        {
            return new TaggedSensorBaseBuilder();
        }

        /// <summary>
        /// Returns TaggedSensorBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedSensorBaseBuilder</returns>
        public TaggedSensorBaseBuilder With()
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

        public bool Equals(TaggedSensorBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedSensorBase.
        /// </summary>
        /// <param name="left">Compared (TaggedSensorBase</param>
        /// <param name="right">Compared (TaggedSensorBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedSensorBase left, TaggedSensorBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedSensorBase.
        /// </summary>
        /// <param name="left">Compared (TaggedSensorBase</param>
        /// <param name="right">Compared (TaggedSensorBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedSensorBase left, TaggedSensorBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedSensorBase.
        /// </summary>
        public sealed class TaggedSensorBaseBuilder
        {
            private long? _Id;

            internal TaggedSensorBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedSensorBase.Id property.
            /// </summary>
            /// <param name="value">The ID of the Sensor being tagged.</param>
            public TaggedSensorBaseBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedSensorBase.
            /// </summary>
            /// <returns>TaggedSensorBase</returns>
            public TaggedSensorBase Build()
            {
                Validate();
                return new TaggedSensorBase(
                    Id: _Id
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedSensorBase and cannot be null");
                } 
            }
        }

        
    }
}