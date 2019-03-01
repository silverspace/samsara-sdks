using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject6
    /// </summary>
    public sealed class InlineObject6:  IEquatable<InlineObject6>
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
        /// Use InlineObject6.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject6()
        {
        }

        private InlineObject6(long? DriverId, int? EndMs, long? GroupId, int? StartMs)
        {
            
            this.DriverId = DriverId;
            
            this.EndMs = EndMs;
            
            this.GroupId = GroupId;
            
            this.StartMs = StartMs;
            
        }

        /// <summary>
        /// Returns builder of InlineObject6.
        /// </summary>
        /// <returns>InlineObject6Builder</returns>
        public static InlineObject6Builder Builder()
        {
            return new InlineObject6Builder();
        }

        /// <summary>
        /// Returns InlineObject6Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject6Builder</returns>
        public InlineObject6Builder With()
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

        public bool Equals(InlineObject6 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject6.
        /// </summary>
        /// <param name="left">Compared (InlineObject6</param>
        /// <param name="right">Compared (InlineObject6</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject6 left, InlineObject6 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject6.
        /// </summary>
        /// <param name="left">Compared (InlineObject6</param>
        /// <param name="right">Compared (InlineObject6</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject6 left, InlineObject6 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject6.
        /// </summary>
        public sealed class InlineObject6Builder
        {
            private long? _DriverId;
            private int? _EndMs;
            private long? _GroupId;
            private int? _StartMs;

            internal InlineObject6Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject6.DriverId property.
            /// </summary>
            /// <param name="value">Driver ID to query.</param>
            public InlineObject6Builder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject6.EndMs property.
            /// </summary>
            /// <param name="value">End of the time range, specified in milliseconds UNIX time.</param>
            public InlineObject6Builder EndMs(int? value)
            {
                _EndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject6.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject6Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject6.StartMs property.
            /// </summary>
            /// <param name="value">Beginning of the time range, specified in milliseconds UNIX time.</param>
            public InlineObject6Builder StartMs(int? value)
            {
                _StartMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject6.
            /// </summary>
            /// <returns>InlineObject6</returns>
            public InlineObject6 Build()
            {
                Validate();
                return new InlineObject6(
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
                    throw new ArgumentException("DriverId is a required property for InlineObject6 and cannot be null");
                } 
                if (_EndMs == null)
                {
                    throw new ArgumentException("EndMs is a required property for InlineObject6 and cannot be null");
                } 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject6 and cannot be null");
                } 
                if (_StartMs == null)
                {
                    throw new ArgumentException("StartMs is a required property for InlineObject6 and cannot be null");
                } 
            }
        }

        
    }
}