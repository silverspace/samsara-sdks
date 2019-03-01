using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedVehicleBase
    /// </summary>
    public sealed class TaggedVehicleBase:  IEquatable<TaggedVehicleBase>
    { 
        /// <summary>
        /// The ID of the Vehicle being tagged.
        /// </summary>
        public long? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedVehicleBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedVehicleBase()
        {
        }

        private TaggedVehicleBase(long? Id)
        {
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of TaggedVehicleBase.
        /// </summary>
        /// <returns>TaggedVehicleBaseBuilder</returns>
        public static TaggedVehicleBaseBuilder Builder()
        {
            return new TaggedVehicleBaseBuilder();
        }

        /// <summary>
        /// Returns TaggedVehicleBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedVehicleBaseBuilder</returns>
        public TaggedVehicleBaseBuilder With()
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

        public bool Equals(TaggedVehicleBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedVehicleBase.
        /// </summary>
        /// <param name="left">Compared (TaggedVehicleBase</param>
        /// <param name="right">Compared (TaggedVehicleBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedVehicleBase left, TaggedVehicleBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedVehicleBase.
        /// </summary>
        /// <param name="left">Compared (TaggedVehicleBase</param>
        /// <param name="right">Compared (TaggedVehicleBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedVehicleBase left, TaggedVehicleBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedVehicleBase.
        /// </summary>
        public sealed class TaggedVehicleBaseBuilder
        {
            private long? _Id;

            internal TaggedVehicleBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedVehicleBase.Id property.
            /// </summary>
            /// <param name="value">The ID of the Vehicle being tagged.</param>
            public TaggedVehicleBaseBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedVehicleBase.
            /// </summary>
            /// <returns>TaggedVehicleBase</returns>
            public TaggedVehicleBase Build()
            {
                Validate();
                return new TaggedVehicleBase(
                    Id: _Id
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedVehicleBase and cannot be null");
                } 
            }
        }

        
    }
}