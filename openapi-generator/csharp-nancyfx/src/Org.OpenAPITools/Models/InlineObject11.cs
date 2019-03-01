using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject11
    /// </summary>
    public sealed class InlineObject11:  IEquatable<InlineObject11>
    { 
        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject11.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject11()
        {
        }

        private InlineObject11(long? GroupId)
        {
            
            this.GroupId = GroupId;
            
        }

        /// <summary>
        /// Returns builder of InlineObject11.
        /// </summary>
        /// <returns>InlineObject11Builder</returns>
        public static InlineObject11Builder Builder()
        {
            return new InlineObject11Builder();
        }

        /// <summary>
        /// Returns InlineObject11Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject11Builder</returns>
        public InlineObject11Builder With()
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

        public bool Equals(InlineObject11 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject11.
        /// </summary>
        /// <param name="left">Compared (InlineObject11</param>
        /// <param name="right">Compared (InlineObject11</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject11 left, InlineObject11 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject11.
        /// </summary>
        /// <param name="left">Compared (InlineObject11</param>
        /// <param name="right">Compared (InlineObject11</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject11 left, InlineObject11 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject11.
        /// </summary>
        public sealed class InlineObject11Builder
        {
            private long? _GroupId;

            internal InlineObject11Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject11.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject11Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject11.
            /// </summary>
            /// <returns>InlineObject11</returns>
            public InlineObject11 Build()
            {
                Validate();
                return new InlineObject11(
                    GroupId: _GroupId
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject11 and cannot be null");
                } 
            }
        }

        
    }
}