using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// List of harsh events
    /// </summary>
    public sealed class SafetyReportHarshEvent:  IEquatable<SafetyReportHarshEvent>
    { 
        /// <summary>
        /// Type of the harsh event
        /// </summary>
        public string HarshEventType { get; private set; }

        /// <summary>
        /// Timestamp that the harsh event occurred in Unix milliseconds since epoch
        /// </summary>
        public int? TimestampMs { get; private set; }

        /// <summary>
        /// Vehicle associated with the harsh event
        /// </summary>
        public int? VehicleId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SafetyReportHarshEvent.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SafetyReportHarshEvent()
        {
        }

        private SafetyReportHarshEvent(string HarshEventType, int? TimestampMs, int? VehicleId)
        {
            
            this.HarshEventType = HarshEventType;
            
            this.TimestampMs = TimestampMs;
            
            this.VehicleId = VehicleId;
            
        }

        /// <summary>
        /// Returns builder of SafetyReportHarshEvent.
        /// </summary>
        /// <returns>SafetyReportHarshEventBuilder</returns>
        public static SafetyReportHarshEventBuilder Builder()
        {
            return new SafetyReportHarshEventBuilder();
        }

        /// <summary>
        /// Returns SafetyReportHarshEventBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SafetyReportHarshEventBuilder</returns>
        public SafetyReportHarshEventBuilder With()
        {
            return Builder()
                .HarshEventType(HarshEventType)
                .TimestampMs(TimestampMs)
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

        public bool Equals(SafetyReportHarshEvent other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SafetyReportHarshEvent.
        /// </summary>
        /// <param name="left">Compared (SafetyReportHarshEvent</param>
        /// <param name="right">Compared (SafetyReportHarshEvent</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SafetyReportHarshEvent left, SafetyReportHarshEvent right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SafetyReportHarshEvent.
        /// </summary>
        /// <param name="left">Compared (SafetyReportHarshEvent</param>
        /// <param name="right">Compared (SafetyReportHarshEvent</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SafetyReportHarshEvent left, SafetyReportHarshEvent right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SafetyReportHarshEvent.
        /// </summary>
        public sealed class SafetyReportHarshEventBuilder
        {
            private string _HarshEventType;
            private int? _TimestampMs;
            private int? _VehicleId;

            internal SafetyReportHarshEventBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SafetyReportHarshEvent.HarshEventType property.
            /// </summary>
            /// <param name="value">Type of the harsh event</param>
            public SafetyReportHarshEventBuilder HarshEventType(string value)
            {
                _HarshEventType = value;
                return this;
            }

            /// <summary>
            /// Sets value for SafetyReportHarshEvent.TimestampMs property.
            /// </summary>
            /// <param name="value">Timestamp that the harsh event occurred in Unix milliseconds since epoch</param>
            public SafetyReportHarshEventBuilder TimestampMs(int? value)
            {
                _TimestampMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for SafetyReportHarshEvent.VehicleId property.
            /// </summary>
            /// <param name="value">Vehicle associated with the harsh event</param>
            public SafetyReportHarshEventBuilder VehicleId(int? value)
            {
                _VehicleId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SafetyReportHarshEvent.
            /// </summary>
            /// <returns>SafetyReportHarshEvent</returns>
            public SafetyReportHarshEvent Build()
            {
                Validate();
                return new SafetyReportHarshEvent(
                    HarshEventType: _HarshEventType,
                    TimestampMs: _TimestampMs,
                    VehicleId: _VehicleId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}