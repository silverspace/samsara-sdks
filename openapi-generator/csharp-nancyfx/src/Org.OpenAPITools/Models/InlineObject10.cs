using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject10
    /// </summary>
    public sealed class InlineObject10:  IEquatable<InlineObject10>
    { 
        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject10.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject10()
        {
        }

        private InlineObject10(long? GroupId)
        {
            
            this.GroupId = GroupId;
            
        }

        /// <summary>
        /// Returns builder of InlineObject10.
        /// </summary>
        /// <returns>InlineObject10Builder</returns>
        public static InlineObject10Builder Builder()
        {
            return new InlineObject10Builder();
        }

        /// <summary>
        /// Returns InlineObject10Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject10Builder</returns>
        public InlineObject10Builder With()
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

        public bool Equals(InlineObject10 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject10.
        /// </summary>
        /// <param name="left">Compared (InlineObject10</param>
        /// <param name="right">Compared (InlineObject10</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject10 left, InlineObject10 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject10.
        /// </summary>
        /// <param name="left">Compared (InlineObject10</param>
        /// <param name="right">Compared (InlineObject10</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject10 left, InlineObject10 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject10.
        /// </summary>
        public sealed class InlineObject10Builder
        {
            private long? _GroupId;

            internal InlineObject10Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject10.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject10Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject10.
            /// </summary>
            /// <returns>InlineObject10</returns>
            public InlineObject10 Build()
            {
                Validate();
                return new InlineObject10(
                    GroupId: _GroupId
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject10 and cannot be null");
                } 
            }
        }

        
    }
}