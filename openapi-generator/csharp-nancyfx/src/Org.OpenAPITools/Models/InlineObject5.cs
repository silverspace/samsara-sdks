using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject5
    /// </summary>
    public sealed class InlineObject5:  IEquatable<InlineObject5>
    { 
        /// <summary>
        /// End time (ms) of queried time period.
        /// </summary>
        public long? EndMs { get; private set; }

        /// <summary>
        /// Org ID to query.
        /// </summary>
        public long? OrgId { get; private set; }

        /// <summary>
        /// Start time (ms) of queried time period.
        /// </summary>
        public long? StartMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject5.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject5()
        {
        }

        private InlineObject5(long? EndMs, long? OrgId, long? StartMs)
        {
            
            this.EndMs = EndMs;
            
            this.OrgId = OrgId;
            
            this.StartMs = StartMs;
            
        }

        /// <summary>
        /// Returns builder of InlineObject5.
        /// </summary>
        /// <returns>InlineObject5Builder</returns>
        public static InlineObject5Builder Builder()
        {
            return new InlineObject5Builder();
        }

        /// <summary>
        /// Returns InlineObject5Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject5Builder</returns>
        public InlineObject5Builder With()
        {
            return Builder()
                .EndMs(EndMs)
                .OrgId(OrgId)
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

        public bool Equals(InlineObject5 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject5.
        /// </summary>
        /// <param name="left">Compared (InlineObject5</param>
        /// <param name="right">Compared (InlineObject5</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject5 left, InlineObject5 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject5.
        /// </summary>
        /// <param name="left">Compared (InlineObject5</param>
        /// <param name="right">Compared (InlineObject5</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject5 left, InlineObject5 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject5.
        /// </summary>
        public sealed class InlineObject5Builder
        {
            private long? _EndMs;
            private long? _OrgId;
            private long? _StartMs;

            internal InlineObject5Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject5.EndMs property.
            /// </summary>
            /// <param name="value">End time (ms) of queried time period.</param>
            public InlineObject5Builder EndMs(long? value)
            {
                _EndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject5.OrgId property.
            /// </summary>
            /// <param name="value">Org ID to query.</param>
            public InlineObject5Builder OrgId(long? value)
            {
                _OrgId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject5.StartMs property.
            /// </summary>
            /// <param name="value">Start time (ms) of queried time period.</param>
            public InlineObject5Builder StartMs(long? value)
            {
                _StartMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject5.
            /// </summary>
            /// <returns>InlineObject5</returns>
            public InlineObject5 Build()
            {
                Validate();
                return new InlineObject5(
                    EndMs: _EndMs,
                    OrgId: _OrgId,
                    StartMs: _StartMs
                );
            }

            private void Validate()
            { 
                if (_EndMs == null)
                {
                    throw new ArgumentException("EndMs is a required property for InlineObject5 and cannot be null");
                } 
                if (_OrgId == null)
                {
                    throw new ArgumentException("OrgId is a required property for InlineObject5 and cannot be null");
                } 
                if (_StartMs == null)
                {
                    throw new ArgumentException("StartMs is a required property for InlineObject5 and cannot be null");
                } 
            }
        }

        
    }
}