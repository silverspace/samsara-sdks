using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineResponse200
    /// </summary>
    public sealed class InlineResponse200:  IEquatable<InlineResponse200>
    { 
        /// <summary>
        /// Assets
        /// </summary>
        public List<Asset> Assets { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse200.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse200()
        {
        }

        private InlineResponse200(List<Asset> Assets)
        {
            
            this.Assets = Assets;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse200.
        /// </summary>
        /// <returns>InlineResponse200Builder</returns>
        public static InlineResponse200Builder Builder()
        {
            return new InlineResponse200Builder();
        }

        /// <summary>
        /// Returns InlineResponse200Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse200Builder</returns>
        public InlineResponse200Builder With()
        {
            return Builder()
                .Assets(Assets);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineResponse200 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse200.
        /// </summary>
        /// <param name="left">Compared (InlineResponse200</param>
        /// <param name="right">Compared (InlineResponse200</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse200 left, InlineResponse200 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse200.
        /// </summary>
        /// <param name="left">Compared (InlineResponse200</param>
        /// <param name="right">Compared (InlineResponse200</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse200 left, InlineResponse200 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse200.
        /// </summary>
        public sealed class InlineResponse200Builder
        {
            private List<Asset> _Assets;

            internal InlineResponse200Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse200.Assets property.
            /// </summary>
            /// <param name="value">Assets</param>
            public InlineResponse200Builder Assets(List<Asset> value)
            {
                _Assets = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse200.
            /// </summary>
            /// <returns>InlineResponse200</returns>
            public InlineResponse200 Build()
            {
                Validate();
                return new InlineResponse200(
                    Assets: _Assets
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}