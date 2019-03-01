using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedMachine
    /// </summary>
    public sealed class TaggedMachine:  IEquatable<TaggedMachine>
    { 
        /// <summary>
        /// The ID of the Machine being tagged.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of the Machine being tagged.
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedMachine.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedMachine()
        {
        }

        private TaggedMachine(long? Id, string Name)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of TaggedMachine.
        /// </summary>
        /// <returns>TaggedMachineBuilder</returns>
        public static TaggedMachineBuilder Builder()
        {
            return new TaggedMachineBuilder();
        }

        /// <summary>
        /// Returns TaggedMachineBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedMachineBuilder</returns>
        public TaggedMachineBuilder With()
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

        public bool Equals(TaggedMachine other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedMachine.
        /// </summary>
        /// <param name="left">Compared (TaggedMachine</param>
        /// <param name="right">Compared (TaggedMachine</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedMachine left, TaggedMachine right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedMachine.
        /// </summary>
        /// <param name="left">Compared (TaggedMachine</param>
        /// <param name="right">Compared (TaggedMachine</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedMachine left, TaggedMachine right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedMachine.
        /// </summary>
        public sealed class TaggedMachineBuilder
        {
            private long? _Id;
            private string _Name;

            internal TaggedMachineBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedMachine.Id property.
            /// </summary>
            /// <param name="value">The ID of the Machine being tagged.</param>
            public TaggedMachineBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for TaggedMachine.Name property.
            /// </summary>
            /// <param name="value">Name of the Machine being tagged.</param>
            public TaggedMachineBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedMachine.
            /// </summary>
            /// <returns>TaggedMachine</returns>
            public TaggedMachine Build()
            {
                Validate();
                return new TaggedMachine(
                    Id: _Id,
                    Name: _Name
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedMachine and cannot be null");
                } 
            }
        }

        
    }
}