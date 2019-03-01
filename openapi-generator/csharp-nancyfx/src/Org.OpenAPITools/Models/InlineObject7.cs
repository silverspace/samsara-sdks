using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject7
    /// </summary>
    public sealed class InlineObject7:  IEquatable<InlineObject7>
    { 
        /// <summary>
        /// Driver ID to query.
        /// </summary>
        public long? DriverId { get; private set; }

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
        /// Use InlineObject7.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject7()
        {
        }

        private InlineObject7(long? DriverId, int? EndMs, long? GroupId, int? StartMs)
        {
            
            this.DriverId = DriverId;
            
            this.EndMs = EndMs;
            
            this.GroupId = GroupId;
            
            this.StartMs = StartMs;
            
        }

        /// <summary>
        /// Returns builder of InlineObject7.
        /// </summary>
        /// <returns>InlineObject7Builder</returns>
        public static InlineObject7Builder Builder()
        {
            return new InlineObject7Builder();
        }

        /// <summary>
        /// Returns InlineObject7Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject7Builder</returns>
        public InlineObject7Builder With()
        {
            return Builder()
                .DriverId(DriverId)
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

        public bool Equals(InlineObject7 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject7.
        /// </summary>
        /// <param name="left">Compared (InlineObject7</param>
        /// <param name="right">Compared (InlineObject7</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject7 left, InlineObject7 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject7.
        /// </summary>
        /// <param name="left">Compared (InlineObject7</param>
        /// <param name="right">Compared (InlineObject7</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject7 left, InlineObject7 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject7.
        /// </summary>
        public sealed class InlineObject7Builder
        {
            private long? _DriverId;
            private int? _EndMs;
            private long? _GroupId;
            private int? _StartMs;

            internal InlineObject7Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject7.DriverId property.
            /// </summary>
            /// <param name="value">Driver ID to query.</param>
            public InlineObject7Builder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject7.EndMs property.
            /// </summary>
            /// <param name="value">End of the time range, specified in milliseconds UNIX time.</param>
            public InlineObject7Builder EndMs(int? value)
            {
                _EndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject7.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject7Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject7.StartMs property.
            /// </summary>
            /// <param name="value">Beginning of the time range, specified in milliseconds UNIX time.</param>
            public InlineObject7Builder StartMs(int? value)
            {
                _StartMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject7.
            /// </summary>
            /// <returns>InlineObject7</returns>
            public InlineObject7 Build()
            {
                Validate();
                return new InlineObject7(
                    DriverId: _DriverId,
                    EndMs: _EndMs,
                    GroupId: _GroupId,
                    StartMs: _StartMs
                );
            }

            private void Validate()
            { 
                if (_DriverId == null)
                {
                    throw new ArgumentException("DriverId is a required property for InlineObject7 and cannot be null");
                } 
                if (_EndMs == null)
                {
                    throw new ArgumentException("EndMs is a required property for InlineObject7 and cannot be null");
                } 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject7 and cannot be null");
                } 
                if (_StartMs == null)
                {
                    throw new ArgumentException("StartMs is a required property for InlineObject7 and cannot be null");
                } 
            }
        }

        
    }
}