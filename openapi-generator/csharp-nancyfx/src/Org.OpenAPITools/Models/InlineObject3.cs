using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject3
    /// </summary>
    public sealed class InlineObject3:  IEquatable<InlineObject3>
    { 
        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject3.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject3()
        {
        }

        private InlineObject3(long? GroupId)
        {
            
            this.GroupId = GroupId;
            
        }

        /// <summary>
        /// Returns builder of InlineObject3.
        /// </summary>
        /// <returns>InlineObject3Builder</returns>
        public static InlineObject3Builder Builder()
        {
            return new InlineObject3Builder();
        }

        /// <summary>
        /// Returns InlineObject3Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject3Builder</returns>
        public InlineObject3Builder With()
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

        public bool Equals(InlineObject3 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject3.
        /// </summary>
        /// <param name="left">Compared (InlineObject3</param>
        /// <param name="right">Compared (InlineObject3</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject3 left, InlineObject3 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject3.
        /// </summary>
        /// <param name="left">Compared (InlineObject3</param>
        /// <param name="right">Compared (InlineObject3</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject3 left, InlineObject3 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject3.
        /// </summary>
        public sealed class InlineObject3Builder
        {
            private long? _GroupId;

            internal InlineObject3Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject3.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject3Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject3.
            /// </summary>
            /// <returns>InlineObject3</returns>
            public InlineObject3 Build()
            {
                Validate();
                return new InlineObject3(
                    GroupId: _GroupId
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject3 and cannot be null");
                } 
            }
        }

        
    }
}