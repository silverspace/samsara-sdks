using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineResponse2009
    /// </summary>
    public sealed class InlineResponse2009:  IEquatable<InlineResponse2009>
    { 
        /// <summary>
        /// Tags
        /// </summary>
        public List<Tag> Tags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse2009.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse2009()
        {
        }

        private InlineResponse2009(List<Tag> Tags)
        {
            
            this.Tags = Tags;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse2009.
        /// </summary>
        /// <returns>InlineResponse2009Builder</returns>
        public static InlineResponse2009Builder Builder()
        {
            return new InlineResponse2009Builder();
        }

        /// <summary>
        /// Returns InlineResponse2009Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse2009Builder</returns>
        public InlineResponse2009Builder With()
        {
            return Builder()
                .Tags(Tags);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineResponse2009 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse2009.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2009</param>
        /// <param name="right">Compared (InlineResponse2009</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse2009 left, InlineResponse2009 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse2009.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2009</param>
        /// <param name="right">Compared (InlineResponse2009</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse2009 left, InlineResponse2009 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse2009.
        /// </summary>
        public sealed class InlineResponse2009Builder
        {
            private List<Tag> _Tags;

            internal InlineResponse2009Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse2009.Tags property.
            /// </summary>
            /// <param name="value">Tags</param>
            public InlineResponse2009Builder Tags(List<Tag> value)
            {
                _Tags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse2009.
            /// </summary>
            /// <returns>InlineResponse2009</returns>
            public InlineResponse2009 Build()
            {
                Validate();
                return new InlineResponse2009(
                    Tags: _Tags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}