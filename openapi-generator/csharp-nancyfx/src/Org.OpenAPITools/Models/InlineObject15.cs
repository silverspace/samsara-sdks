using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject15
    /// </summary>
    public sealed class InlineObject15:  IEquatable<InlineObject15>
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
        /// Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
        /// </summary>
        public int? StartMs { get; private set; }

        /// <summary>
        /// Vehicle ID to query.
        /// </summary>
        public long? VehicleId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject15.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject15()
        {
        }

        private InlineObject15(int? EndMs, long? GroupId, int? StartMs, long? VehicleId)
        {
            
            this.EndMs = EndMs;
            
            this.GroupId = GroupId;
            
            this.StartMs = StartMs;
            
            this.VehicleId = VehicleId;
            
        }

        /// <summary>
        /// Returns builder of InlineObject15.
        /// </summary>
        /// <returns>InlineObject15Builder</returns>
        public static InlineObject15Builder Builder()
        {
            return new InlineObject15Builder();
        }

        /// <summary>
        /// Returns InlineObject15Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject15Builder</returns>
        public InlineObject15Builder With()
        {
            return Builder()
                .EndMs(EndMs)
                .GroupId(GroupId)
                .StartMs(StartMs)
                .VehicleId(VehicleId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineObject15 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject15.
        /// </summary>
        /// <param name="left">Compared (InlineObject15</param>
        /// <param name="right">Compared (InlineObject15</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject15 left, InlineObject15 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject15.
        /// </summary>
        /// <param name="left">Compared (InlineObject15</param>
        /// <param name="right">Compared (InlineObject15</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject15 left, InlineObject15 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject15.
        /// </summary>
        public sealed class InlineObject15Builder
        {
            private int? _EndMs;
            private long? _GroupId;
            private int? _StartMs;
            private long? _VehicleId;

            internal InlineObject15Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject15.EndMs property.
            /// </summary>
            /// <param name="value">End of the time range, specified in milliseconds UNIX time.</param>
            public InlineObject15Builder EndMs(int? value)
            {
                _EndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject15.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject15Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject15.StartMs property.
            /// </summary>
            /// <param name="value">Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs</param>
            public InlineObject15Builder StartMs(int? value)
            {
                _StartMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject15.VehicleId property.
            /// </summary>
            /// <param name="value">Vehicle ID to query.</param>
            public InlineObject15Builder VehicleId(long? value)
            {
                _VehicleId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject15.
            /// </summary>
            /// <returns>InlineObject15</returns>
            public InlineObject15 Build()
            {
                Validate();
                return new InlineObject15(
                    EndMs: _EndMs,
                    GroupId: _GroupId,
                    StartMs: _StartMs,
                    VehicleId: _VehicleId
                );
            }

            private void Validate()
            { 
                if (_EndMs == null)
                {
                    throw new ArgumentException("EndMs is a required property for InlineObject15 and cannot be null");
                } 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject15 and cannot be null");
                } 
                if (_StartMs == null)
                {
                    throw new ArgumentException("StartMs is a required property for InlineObject15 and cannot be null");
                } 
                if (_VehicleId == null)
                {
                    throw new ArgumentException("VehicleId is a required property for InlineObject15 and cannot be null");
                } 
            }
        }

        
    }
}