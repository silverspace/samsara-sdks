using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DriverDailyLogResponse
    /// </summary>
    public sealed class DriverDailyLogResponse:  IEquatable<DriverDailyLogResponse>
    { 
        /// <summary>
        /// Days
        /// </summary>
        public List<DriverDailyLogResponseDays> Days { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DriverDailyLogResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DriverDailyLogResponse()
        {
        }

        private DriverDailyLogResponse(List<DriverDailyLogResponseDays> Days)
        {
            
            this.Days = Days;
            
        }

        /// <summary>
        /// Returns builder of DriverDailyLogResponse.
        /// </summary>
        /// <returns>DriverDailyLogResponseBuilder</returns>
        public static DriverDailyLogResponseBuilder Builder()
        {
            return new DriverDailyLogResponseBuilder();
        }

        /// <summary>
        /// Returns DriverDailyLogResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DriverDailyLogResponseBuilder</returns>
        public DriverDailyLogResponseBuilder With()
        {
            return Builder()
                .Days(Days);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DriverDailyLogResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DriverDailyLogResponse.
        /// </summary>
        /// <param name="left">Compared (DriverDailyLogResponse</param>
        /// <param name="right">Compared (DriverDailyLogResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DriverDailyLogResponse left, DriverDailyLogResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DriverDailyLogResponse.
        /// </summary>
        /// <param name="left">Compared (DriverDailyLogResponse</param>
        /// <param name="right">Compared (DriverDailyLogResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DriverDailyLogResponse left, DriverDailyLogResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DriverDailyLogResponse.
        /// </summary>
        public sealed class DriverDailyLogResponseBuilder
        {
            private List<DriverDailyLogResponseDays> _Days;

            internal DriverDailyLogResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DriverDailyLogResponse.Days property.
            /// </summary>
            /// <param name="value">Days</param>
            public DriverDailyLogResponseBuilder Days(List<DriverDailyLogResponseDays> value)
            {
                _Days = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DriverDailyLogResponse.
            /// </summary>
            /// <returns>DriverDailyLogResponse</returns>
            public DriverDailyLogResponse Build()
            {
                Validate();
                return new DriverDailyLogResponse(
                    Days: _Days
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}