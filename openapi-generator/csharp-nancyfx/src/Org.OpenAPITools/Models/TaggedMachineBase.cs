using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedMachineBase
    /// </summary>
    public sealed class TaggedMachineBase:  IEquatable<TaggedMachineBase>
    { 
        /// <summary>
        /// The ID of the Machine being tagged.
        /// </summary>
        public long? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedMachineBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedMachineBase()
        {
        }

        private TaggedMachineBase(long? Id)
        {
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of TaggedMachineBase.
        /// </summary>
        /// <returns>TaggedMachineBaseBuilder</returns>
        public static TaggedMachineBaseBuilder Builder()
        {
            return new TaggedMachineBaseBuilder();
        }

        /// <summary>
        /// Returns TaggedMachineBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedMachineBaseBuilder</returns>
        public TaggedMachineBaseBuilder With()
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

        public bool Equals(TaggedMachineBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedMachineBase.
        /// </summary>
        /// <param name="left">Compared (TaggedMachineBase</param>
        /// <param name="right">Compared (TaggedMachineBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedMachineBase left, TaggedMachineBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedMachineBase.
        /// </summary>
        /// <param name="left">Compared (TaggedMachineBase</param>
        /// <param name="right">Compared (TaggedMachineBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedMachineBase left, TaggedMachineBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedMachineBase.
        /// </summary>
        public sealed class TaggedMachineBaseBuilder
        {
            private long? _Id;

            internal TaggedMachineBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedMachineBase.Id property.
            /// </summary>
            /// <param name="value">The ID of the Machine being tagged.</param>
            public TaggedMachineBaseBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedMachineBase.
            /// </summary>
            /// <returns>TaggedMachineBase</returns>
            public TaggedMachineBase Build()
            {
                Validate();
                return new TaggedMachineBase(
                    Id: _Id
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedMachineBase and cannot be null");
                } 
            }
        }

        
    }
}