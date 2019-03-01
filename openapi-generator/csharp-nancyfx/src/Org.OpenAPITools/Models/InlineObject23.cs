using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject23
    /// </summary>
    public sealed class InlineObject23:  IEquatable<InlineObject23>
    { 
        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject23.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject23()
        {
        }

        private InlineObject23(long? GroupId)
        {
            
            this.GroupId = GroupId;
            
        }

        /// <summary>
        /// Returns builder of InlineObject23.
        /// </summary>
        /// <returns>InlineObject23Builder</returns>
        public static InlineObject23Builder Builder()
        {
            return new InlineObject23Builder();
        }

        /// <summary>
        /// Returns InlineObject23Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject23Builder</returns>
        public InlineObject23Builder With()
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

        public bool Equals(InlineObject23 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject23.
        /// </summary>
        /// <param name="left">Compared (InlineObject23</param>
        /// <param name="right">Compared (InlineObject23</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject23 left, InlineObject23 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject23.
        /// </summary>
        /// <param name="left">Compared (InlineObject23</param>
        /// <param name="right">Compared (InlineObject23</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject23 left, InlineObject23 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject23.
        /// </summary>
        public sealed class InlineObject23Builder
        {
            private long? _GroupId;

            internal InlineObject23Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject23.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject23Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject23.
            /// </summary>
            /// <returns>InlineObject23</returns>
            public InlineObject23 Build()
            {
                Validate();
                return new InlineObject23(
                    GroupId: _GroupId
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject23 and cannot be null");
                } 
            }
        }

        
    }
}