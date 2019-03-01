using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject9
    /// </summary>
    public sealed class InlineObject9:  IEquatable<InlineObject9>
    { 
        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject9.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject9()
        {
        }

        private InlineObject9(long? GroupId)
        {
            
            this.GroupId = GroupId;
            
        }

        /// <summary>
        /// Returns builder of InlineObject9.
        /// </summary>
        /// <returns>InlineObject9Builder</returns>
        public static InlineObject9Builder Builder()
        {
            return new InlineObject9Builder();
        }

        /// <summary>
        /// Returns InlineObject9Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject9Builder</returns>
        public InlineObject9Builder With()
        {
            return Builder()
                .GroupId(GroupId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineObject9 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject9.
        /// </summary>
        /// <param name="left">Compared (InlineObject9</param>
        /// <param name="right">Compared (InlineObject9</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject9 left, InlineObject9 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject9.
        /// </summary>
        /// <param name="left">Compared (InlineObject9</param>
        /// <param name="right">Compared (InlineObject9</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject9 left, InlineObject9 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject9.
        /// </summary>
        public sealed class InlineObject9Builder
        {
            private long? _GroupId;

            internal InlineObject9Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject9.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject9Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject9.
            /// </summary>
            /// <returns>InlineObject9</returns>
            public InlineObject9 Build()
            {
                Validate();
                return new InlineObject9(
                    GroupId: _GroupId
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject9 and cannot be null");
                } 
            }
        }

        
    }
}