using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject13
    /// </summary>
    public sealed class InlineObject13:  IEquatable<InlineObject13>
    { 
        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject13.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject13()
        {
        }

        private InlineObject13(long? GroupId)
        {
            
            this.GroupId = GroupId;
            
        }

        /// <summary>
        /// Returns builder of InlineObject13.
        /// </summary>
        /// <returns>InlineObject13Builder</returns>
        public static InlineObject13Builder Builder()
        {
            return new InlineObject13Builder();
        }

        /// <summary>
        /// Returns InlineObject13Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject13Builder</returns>
        public InlineObject13Builder With()
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

        public bool Equals(InlineObject13 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject13.
        /// </summary>
        /// <param name="left">Compared (InlineObject13</param>
        /// <param name="right">Compared (InlineObject13</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject13 left, InlineObject13 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject13.
        /// </summary>
        /// <param name="left">Compared (InlineObject13</param>
        /// <param name="right">Compared (InlineObject13</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject13 left, InlineObject13 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject13.
        /// </summary>
        public sealed class InlineObject13Builder
        {
            private long? _GroupId;

            internal InlineObject13Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject13.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject13Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject13.
            /// </summary>
            /// <returns>InlineObject13</returns>
            public InlineObject13 Build()
            {
                Validate();
                return new InlineObject13(
                    GroupId: _GroupId
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject13 and cannot be null");
                } 
            }
        }

        
    }
}