using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineResponse2001
    /// </summary>
    public sealed class InlineResponse2001:  IEquatable<InlineResponse2001>
    { 
        /// <summary>
        /// Assets
        /// </summary>
        public List<AssetCurrentLocationsResponse> Assets { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse2001.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse2001()
        {
        }

        private InlineResponse2001(List<AssetCurrentLocationsResponse> Assets)
        {
            
            this.Assets = Assets;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse2001.
        /// </summary>
        /// <returns>InlineResponse2001Builder</returns>
        public static InlineResponse2001Builder Builder()
        {
            return new InlineResponse2001Builder();
        }

        /// <summary>
        /// Returns InlineResponse2001Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse2001Builder</returns>
        public InlineResponse2001Builder With()
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

        public bool Equals(InlineResponse2001 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse2001.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2001</param>
        /// <param name="right">Compared (InlineResponse2001</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse2001 left, InlineResponse2001 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse2001.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2001</param>
        /// <param name="right">Compared (InlineResponse2001</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse2001 left, InlineResponse2001 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse2001.
        /// </summary>
        public sealed class InlineResponse2001Builder
        {
            private List<AssetCurrentLocationsResponse> _Assets;

            internal InlineResponse2001Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse2001.Assets property.
            /// </summary>
            /// <param name="value">Assets</param>
            public InlineResponse2001Builder Assets(List<AssetCurrentLocationsResponse> value)
            {
                _Assets = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse2001.
            /// </summary>
            /// <returns>InlineResponse2001</returns>
            public InlineResponse2001 Build()
            {
                Validate();
                return new InlineResponse2001(
                    Assets: _Assets
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}