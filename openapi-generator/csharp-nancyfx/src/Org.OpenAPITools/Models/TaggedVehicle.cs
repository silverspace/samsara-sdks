using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedVehicle
    /// </summary>
    public sealed class TaggedVehicle:  IEquatable<TaggedVehicle>
    { 
        /// <summary>
        /// The ID of the Vehicle being tagged.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of the Vehicle being tagged.
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedVehicle.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedVehicle()
        {
        }

        private TaggedVehicle(long? Id, string Name)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of TaggedVehicle.
        /// </summary>
        /// <returns>TaggedVehicleBuilder</returns>
        public static TaggedVehicleBuilder Builder()
        {
            return new TaggedVehicleBuilder();
        }

        /// <summary>
        /// Returns TaggedVehicleBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedVehicleBuilder</returns>
        public TaggedVehicleBuilder With()
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

        public bool Equals(TaggedVehicle other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedVehicle.
        /// </summary>
        /// <param name="left">Compared (TaggedVehicle</param>
        /// <param name="right">Compared (TaggedVehicle</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedVehicle left, TaggedVehicle right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedVehicle.
        /// </summary>
        /// <param name="left">Compared (TaggedVehicle</param>
        /// <param name="right">Compared (TaggedVehicle</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedVehicle left, TaggedVehicle right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedVehicle.
        /// </summary>
        public sealed class TaggedVehicleBuilder
        {
            private long? _Id;
            private string _Name;

            internal TaggedVehicleBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedVehicle.Id property.
            /// </summary>
            /// <param name="value">The ID of the Vehicle being tagged.</param>
            public TaggedVehicleBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for TaggedVehicle.Name property.
            /// </summary>
            /// <param name="value">Name of the Vehicle being tagged.</param>
            public TaggedVehicleBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedVehicle.
            /// </summary>
            /// <returns>TaggedVehicle</returns>
            public TaggedVehicle Build()
            {
                Validate();
                return new TaggedVehicle(
                    Id: _Id,
                    Name: _Name
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedVehicle and cannot be null");
                } 
            }
        }

        
    }
}