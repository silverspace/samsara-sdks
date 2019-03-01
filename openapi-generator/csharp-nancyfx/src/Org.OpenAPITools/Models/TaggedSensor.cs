using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedSensor
    /// </summary>
    public sealed class TaggedSensor:  IEquatable<TaggedSensor>
    { 
        /// <summary>
        /// The ID of the Sensor being tagged.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of the Sensor being tagged.
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedSensor.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedSensor()
        {
        }

        private TaggedSensor(long? Id, string Name)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of TaggedSensor.
        /// </summary>
        /// <returns>TaggedSensorBuilder</returns>
        public static TaggedSensorBuilder Builder()
        {
            return new TaggedSensorBuilder();
        }

        /// <summary>
        /// Returns TaggedSensorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedSensorBuilder</returns>
        public TaggedSensorBuilder With()
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

        public bool Equals(TaggedSensor other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedSensor.
        /// </summary>
        /// <param name="left">Compared (TaggedSensor</param>
        /// <param name="right">Compared (TaggedSensor</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedSensor left, TaggedSensor right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedSensor.
        /// </summary>
        /// <param name="left">Compared (TaggedSensor</param>
        /// <param name="right">Compared (TaggedSensor</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedSensor left, TaggedSensor right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedSensor.
        /// </summary>
        public sealed class TaggedSensorBuilder
        {
            private long? _Id;
            private string _Name;

            internal TaggedSensorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedSensor.Id property.
            /// </summary>
            /// <param name="value">The ID of the Sensor being tagged.</param>
            public TaggedSensorBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for TaggedSensor.Name property.
            /// </summary>
            /// <param name="value">Name of the Sensor being tagged.</param>
            public TaggedSensorBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedSensor.
            /// </summary>
            /// <returns>TaggedSensor</returns>
            public TaggedSensor Build()
            {
                Validate();
                return new TaggedSensor(
                    Id: _Id,
                    Name: _Name
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedSensor and cannot be null");
                } 
            }
        }

        
    }
}