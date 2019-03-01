using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject17
    /// </summary>
    public sealed class InlineObject17:  IEquatable<InlineObject17>
    { 
        /// <summary>
        /// End of the time range, specified in milliseconds UNIX time.
        /// </summary>
        public int? EndMs { get; private set; }

        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Beginning of the time range, specified in milliseconds UNIX time.
        /// </summary>
        public int? StartMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject17.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject17()
        {
        }

        private InlineObject17(int? EndMs, long? GroupId, int? StartMs)
        {
            
            this.EndMs = EndMs;
            
            this.GroupId = GroupId;
            
            this.StartMs = StartMs;
            
        }

        /// <summary>
        /// Returns builder of InlineObject17.
        /// </summary>
        /// <returns>InlineObject17Builder</returns>
        public static InlineObject17Builder Builder()
        {
            return new InlineObject17Builder();
        }

        /// <summary>
        /// Returns InlineObject17Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject17Builder</returns>
        public InlineObject17Builder With()
        {
            return Builder()
                .EndMs(EndMs)
                .GroupId(GroupId)
                .StartMs(StartMs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineObject17 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject17.
        /// </summary>
        /// <param name="left">Compared (InlineObject17</param>
        /// <param name="right">Compared (InlineObject17</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject17 left, InlineObject17 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject17.
        /// </summary>
        /// <param name="left">Compared (InlineObject17</param>
        /// <param name="right">Compared (InlineObject17</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject17 left, InlineObject17 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject17.
        /// </summary>
        public sealed class InlineObject17Builder
        {
            private int? _EndMs;
            private long? _GroupId;
            private int? _StartMs;

            internal InlineObject17Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject17.EndMs property.
            /// </summary>
            /// <param name="value">End of the time range, specified in milliseconds UNIX time.</param>
            public InlineObject17Builder EndMs(int? value)
            {
                _EndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject17.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject17Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject17.StartMs property.
            /// </summary>
            /// <param name="value">Beginning of the time range, specified in milliseconds UNIX time.</param>
            public InlineObject17Builder StartMs(int? value)
            {
                _StartMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject17.
            /// </summary>
            /// <returns>InlineObject17</returns>
            public InlineObject17 Build()
            {
                Validate();
                return new InlineObject17(
                    EndMs: _EndMs,
                    GroupId: _GroupId,
                    StartMs: _StartMs
                );
            }

            private void Validate()
            { 
                if (_EndMs == null)
                {
                    throw new ArgumentException("EndMs is a required property for InlineObject17 and cannot be null");
                } 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject17 and cannot be null");
                } 
                if (_StartMs == null)
                {
                    throw new ArgumentException("StartMs is a required property for InlineObject17 and cannot be null");
                } 
            }
        }

        
    }
}