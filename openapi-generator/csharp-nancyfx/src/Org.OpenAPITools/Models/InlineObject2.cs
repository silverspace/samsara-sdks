using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject2
    /// </summary>
    public sealed class InlineObject2:  IEquatable<InlineObject2>
    { 
        /// <summary>
        /// The address of the entry to add, as it would be recognized if provided to maps.google.com.
        /// </summary>
        public string Address { get; private set; }

        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Name of the location to add to the address book.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Radius in meters of the address (used for matching vehicle trip stops to this location).
        /// </summary>
        public int? Radius { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject2.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject2()
        {
        }

        private InlineObject2(string Address, long? GroupId, string Name, int? Radius)
        {
            
            this.Address = Address;
            
            this.GroupId = GroupId;
            
            this.Name = Name;
            
            this.Radius = Radius;
            
        }

        /// <summary>
        /// Returns builder of InlineObject2.
        /// </summary>
        /// <returns>InlineObject2Builder</returns>
        public static InlineObject2Builder Builder()
        {
            return new InlineObject2Builder();
        }

        /// <summary>
        /// Returns InlineObject2Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject2Builder</returns>
        public InlineObject2Builder With()
        {
            return Builder()
                .Address(Address)
                .GroupId(GroupId)
                .Name(Name)
                .Radius(Radius);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineObject2 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject2.
        /// </summary>
        /// <param name="left">Compared (InlineObject2</param>
        /// <param name="right">Compared (InlineObject2</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject2 left, InlineObject2 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject2.
        /// </summary>
        /// <param name="left">Compared (InlineObject2</param>
        /// <param name="right">Compared (InlineObject2</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject2 left, InlineObject2 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject2.
        /// </summary>
        public sealed class InlineObject2Builder
        {
            private string _Address;
            private long? _GroupId;
            private string _Name;
            private int? _Radius;

            internal InlineObject2Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject2.Address property.
            /// </summary>
            /// <param name="value">The address of the entry to add, as it would be recognized if provided to maps.google.com.</param>
            public InlineObject2Builder Address(string value)
            {
                _Address = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject2.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject2Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject2.Name property.
            /// </summary>
            /// <param name="value">Name of the location to add to the address book.</param>
            public InlineObject2Builder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject2.Radius property.
            /// </summary>
            /// <param name="value">Radius in meters of the address (used for matching vehicle trip stops to this location).</param>
            public InlineObject2Builder Radius(int? value)
            {
                _Radius = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject2.
            /// </summary>
            /// <returns>InlineObject2</returns>
            public InlineObject2 Build()
            {
                Validate();
                return new InlineObject2(
                    Address: _Address,
                    GroupId: _GroupId,
                    Name: _Name,
                    Radius: _Radius
                );
            }

            private void Validate()
            { 
                if (_Address == null)
                {
                    throw new ArgumentException("Address is a required property for InlineObject2 and cannot be null");
                } 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject2 and cannot be null");
                } 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for InlineObject2 and cannot be null");
                } 
                if (_Radius == null)
                {
                    throw new ArgumentException("Radius is a required property for InlineObject2 and cannot be null");
                } 
            }
        }

        
    }
}