using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject21
    /// </summary>
    public sealed class InlineObject21:  IEquatable<InlineObject21>
    { 
        /// <summary>
        /// End of the time range, specified in milliseconds UNIX time.
        /// </summary>
        public int? EndMs { get; private set; }

        /// <summary>
        /// FillMissing
        /// </summary>
        public FillMissingEnum? FillMissing { get; private set; }

        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Series
        /// </summary>
        public List<SensorsHistorySeries> Series { get; private set; }

        /// <summary>
        /// Beginning of the time range, specified in milliseconds UNIX time.
        /// </summary>
        public int? StartMs { get; private set; }

        /// <summary>
        /// Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
        /// </summary>
        public int? StepMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject21.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject21()
        {
        }

        private InlineObject21(int? EndMs, FillMissingEnum? FillMissing, long? GroupId, List<SensorsHistorySeries> Series, int? StartMs, int? StepMs)
        {
            
            this.EndMs = EndMs;
            
            this.FillMissing = FillMissing;
            
            this.GroupId = GroupId;
            
            this.Series = Series;
            
            this.StartMs = StartMs;
            
            this.StepMs = StepMs;
            
        }

        /// <summary>
        /// Returns builder of InlineObject21.
        /// </summary>
        /// <returns>InlineObject21Builder</returns>
        public static InlineObject21Builder Builder()
        {
            return new InlineObject21Builder();
        }

        /// <summary>
        /// Returns InlineObject21Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject21Builder</returns>
        public InlineObject21Builder With()
        {
            return Builder()
                .EndMs(EndMs)
                .FillMissing(FillMissing)
                .GroupId(GroupId)
                .Series(Series)
                .StartMs(StartMs)
                .StepMs(StepMs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineObject21 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject21.
        /// </summary>
        /// <param name="left">Compared (InlineObject21</param>
        /// <param name="right">Compared (InlineObject21</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject21 left, InlineObject21 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject21.
        /// </summary>
        /// <param name="left">Compared (InlineObject21</param>
        /// <param name="right">Compared (InlineObject21</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject21 left, InlineObject21 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject21.
        /// </summary>
        public sealed class InlineObject21Builder
        {
            private int? _EndMs;
            private FillMissingEnum? _FillMissing;
            private long? _GroupId;
            private List<SensorsHistorySeries> _Series;
            private int? _StartMs;
            private int? _StepMs;

            internal InlineObject21Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _FillMissing = FillMissingEnum.WithNull;
            }

            /// <summary>
            /// Sets value for InlineObject21.EndMs property.
            /// </summary>
            /// <param name="value">End of the time range, specified in milliseconds UNIX time.</param>
            public InlineObject21Builder EndMs(int? value)
            {
                _EndMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject21.FillMissing property.
            /// </summary>
            /// <param name="value">FillMissing</param>
            public InlineObject21Builder FillMissing(FillMissingEnum? value)
            {
                _FillMissing = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject21.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject21Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject21.Series property.
            /// </summary>
            /// <param name="value">Series</param>
            public InlineObject21Builder Series(List<SensorsHistorySeries> value)
            {
                _Series = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject21.StartMs property.
            /// </summary>
            /// <param name="value">Beginning of the time range, specified in milliseconds UNIX time.</param>
            public InlineObject21Builder StartMs(int? value)
            {
                _StartMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject21.StepMs property.
            /// </summary>
            /// <param name="value">Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.</param>
            public InlineObject21Builder StepMs(int? value)
            {
                _StepMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject21.
            /// </summary>
            /// <returns>InlineObject21</returns>
            public InlineObject21 Build()
            {
                Validate();
                return new InlineObject21(
                    EndMs: _EndMs,
                    FillMissing: _FillMissing,
                    GroupId: _GroupId,
                    Series: _Series,
                    StartMs: _StartMs,
                    StepMs: _StepMs
                );
            }

            private void Validate()
            { 
                if (_EndMs == null)
                {
                    throw new ArgumentException("EndMs is a required property for InlineObject21 and cannot be null");
                } 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject21 and cannot be null");
                } 
                if (_Series == null)
                {
                    throw new ArgumentException("Series is a required property for InlineObject21 and cannot be null");
                } 
                if (_StartMs == null)
                {
                    throw new ArgumentException("StartMs is a required property for InlineObject21 and cannot be null");
                } 
                if (_StepMs == null)
                {
                    throw new ArgumentException("StepMs is a required property for InlineObject21 and cannot be null");
                } 
            }
        }

        
        public enum FillMissingEnum { WithNull, WithPrevious };
    }
}