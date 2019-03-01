using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject18
    /// </summary>
    public sealed class InlineObject18:  IEquatable<InlineObject18>
    { 
        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject18.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject18()
        {
        }

        private InlineObject18(long? GroupId)
        {
            
            this.GroupId = GroupId;
            
        }

        /// <summary>
        /// Returns builder of InlineObject18.
        /// </summary>
        /// <returns>InlineObject18Builder</returns>
        public static InlineObject18Builder Builder()
        {
            return new InlineObject18Builder();
        }

        /// <summary>
        /// Returns InlineObject18Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject18Builder</returns>
        public InlineObject18Builder With()
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

        public bool Equals(InlineObject18 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject18.
        /// </summary>
        /// <param name="left">Compared (InlineObject18</param>
        /// <param name="right">Compared (InlineObject18</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject18 left, InlineObject18 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject18.
        /// </summary>
        /// <param name="left">Compared (InlineObject18</param>
        /// <param name="right">Compared (InlineObject18</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject18 left, InlineObject18 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject18.
        /// </summary>
        public sealed class InlineObject18Builder
        {
            private long? _GroupId;

            internal InlineObject18Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject18.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject18Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject18.
            /// </summary>
            /// <returns>InlineObject18</returns>
            public InlineObject18 Build()
            {
                Validate();
                return new InlineObject18(
                    GroupId: _GroupId
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject18 and cannot be null");
                } 
            }
        }

        
    }
}