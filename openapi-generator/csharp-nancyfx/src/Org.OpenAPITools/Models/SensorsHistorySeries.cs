using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Sensor ID and field to query.
    /// </summary>
    public sealed class SensorsHistorySeries:  IEquatable<SensorsHistorySeries>
    { 
        /// <summary>
        /// Field to query.
        /// </summary>
        public FieldEnum? Field { get; private set; }

        /// <summary>
        /// Sensor ID to query.
        /// </summary>
        public long? WidgetId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SensorsHistorySeries.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SensorsHistorySeries()
        {
        }

        private SensorsHistorySeries(FieldEnum? Field, long? WidgetId)
        {
            
            this.Field = Field;
            
            this.WidgetId = WidgetId;
            
        }

        /// <summary>
        /// Returns builder of SensorsHistorySeries.
        /// </summary>
        /// <returns>SensorsHistorySeriesBuilder</returns>
        public static SensorsHistorySeriesBuilder Builder()
        {
            return new SensorsHistorySeriesBuilder();
        }

        /// <summary>
        /// Returns SensorsHistorySeriesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SensorsHistorySeriesBuilder</returns>
        public SensorsHistorySeriesBuilder With()
        {
            return Builder()
                .Field(Field)
                .WidgetId(WidgetId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SensorsHistorySeries other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SensorsHistorySeries.
        /// </summary>
        /// <param name="left">Compared (SensorsHistorySeries</param>
        /// <param name="right">Compared (SensorsHistorySeries</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SensorsHistorySeries left, SensorsHistorySeries right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SensorsHistorySeries.
        /// </summary>
        /// <param name="left">Compared (SensorsHistorySeries</param>
        /// <param name="right">Compared (SensorsHistorySeries</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SensorsHistorySeries left, SensorsHistorySeries right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SensorsHistorySeries.
        /// </summary>
        public sealed class SensorsHistorySeriesBuilder
        {
            private FieldEnum? _Field;
            private long? _WidgetId;

            internal SensorsHistorySeriesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SensorsHistorySeries.Field property.
            /// </summary>
            /// <param name="value">Field to query.</param>
            public SensorsHistorySeriesBuilder Field(FieldEnum? value)
            {
                _Field = value;
                return this;
            }

            /// <summary>
            /// Sets value for SensorsHistorySeries.WidgetId property.
            /// </summary>
            /// <param name="value">Sensor ID to query.</param>
            public SensorsHistorySeriesBuilder WidgetId(long? value)
            {
                _WidgetId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SensorsHistorySeries.
            /// </summary>
            /// <returns>SensorsHistorySeries</returns>
            public SensorsHistorySeries Build()
            {
                Validate();
                return new SensorsHistorySeries(
                    Field: _Field,
                    WidgetId: _WidgetId
                );
            }

            private void Validate()
            { 
                if (_Field == null)
                {
                    throw new ArgumentException("Field is a required property for SensorsHistorySeries and cannot be null");
                } 
                if (_WidgetId == null)
                {
                    throw new ArgumentException("WidgetId is a required property for SensorsHistorySeries and cannot be null");
                } 
            }
        }

        
        public enum FieldEnum { AmbientTemperature, ProbeTemperature, CurrentLoop1Raw, CurrentLoop1Mapped, CurrentLoop2Raw, CurrentLoop2Mapped, PmPowerTotal, PmPhase1Power, PmPhase2Power, PmPhase3Power, PmPhase1PowerFactor, PmPhase2PowerFactor, PmPhase3PowerFactor };
    }
}