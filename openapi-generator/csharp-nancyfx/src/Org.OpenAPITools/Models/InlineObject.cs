using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject
    /// </summary>
    public sealed class InlineObject:  IEquatable<InlineObject>
    { 
        /// <summary>
        /// Addresses
        /// </summary>
        public List<AddressesAddresses> Addresses { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject()
        {
        }

        private InlineObject(List<AddressesAddresses> Addresses)
        {
            
            this.Addresses = Addresses;
            
        }

        /// <summary>
        /// Returns builder of InlineObject.
        /// </summary>
        /// <returns>InlineObjectBuilder</returns>
        public static InlineObjectBuilder Builder()
        {
            return new InlineObjectBuilder();
        }

        /// <summary>
        /// Returns InlineObjectBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObjectBuilder</returns>
        public InlineObjectBuilder With()
        {
            return Builder()
                .Addresses(Addresses);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineObject other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject.
        /// </summary>
        /// <param name="left">Compared (InlineObject</param>
        /// <param name="right">Compared (InlineObject</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject left, InlineObject right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject.
        /// </summary>
        /// <param name="left">Compared (InlineObject</param>
        /// <param name="right">Compared (InlineObject</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject left, InlineObject right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject.
        /// </summary>
        public sealed class InlineObjectBuilder
        {
            private List<AddressesAddresses> _Addresses;

            internal InlineObjectBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject.Addresses property.
            /// </summary>
            /// <param name="value">Addresses</param>
            public InlineObjectBuilder Addresses(List<AddressesAddresses> value)
            {
                _Addresses = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject.
            /// </summary>
            /// <returns>InlineObject</returns>
            public InlineObject Build()
            {
                Validate();
                return new InlineObject(
                    Addresses: _Addresses
                );
            }

            private void Validate()
            { 
                if (_Addresses == null)
                {
                    throw new ArgumentException("Addresses is a required property for InlineObject and cannot be null");
                } 
            }
        }

        
    }
}