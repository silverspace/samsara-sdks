using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains the current temperatures of a sensor.
    /// </summary>
    public sealed class TemperatureResponse:  IEquatable<TemperatureResponse>
    { 
        /// <summary>
        /// GroupId
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Sensors
        /// </summary>
        public List<TemperatureResponseSensors> Sensors { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TemperatureResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TemperatureResponse()
        {
        }

        private TemperatureResponse(long? GroupId, List<TemperatureResponseSensors> Sensors)
        {
            
            this.GroupId = GroupId;
            
            this.Sensors = Sensors;
            
        }

        /// <summary>
        /// Returns builder of TemperatureResponse.
        /// </summary>
        /// <returns>TemperatureResponseBuilder</returns>
        public static TemperatureResponseBuilder Builder()
        {
            return new TemperatureResponseBuilder();
        }

        /// <summary>
        /// Returns TemperatureResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TemperatureResponseBuilder</returns>
        public TemperatureResponseBuilder With()
        {
            return Builder()
                .GroupId(GroupId)
                .Sensors(Sensors);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(TemperatureResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TemperatureResponse.
        /// </summary>
        /// <param name="left">Compared (TemperatureResponse</param>
        /// <param name="right">Compared (TemperatureResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TemperatureResponse left, TemperatureResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TemperatureResponse.
        /// </summary>
        /// <param name="left">Compared (TemperatureResponse</param>
        /// <param name="right">Compared (TemperatureResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TemperatureResponse left, TemperatureResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TemperatureResponse.
        /// </summary>
        public sealed class TemperatureResponseBuilder
        {
            private long? _GroupId;
            private List<TemperatureResponseSensors> _Sensors;

            internal TemperatureResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TemperatureResponse.GroupId property.
            /// </summary>
            /// <param name="value">GroupId</param>
            public TemperatureResponseBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for TemperatureResponse.Sensors property.
            /// </summary>
            /// <param name="value">Sensors</param>
            public TemperatureResponseBuilder Sensors(List<TemperatureResponseSensors> value)
            {
                _Sensors = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TemperatureResponse.
            /// </summary>
            /// <returns>TemperatureResponse</returns>
            public TemperatureResponse Build()
            {
                Validate();
                return new TemperatureResponse(
                    GroupId: _GroupId,
                    Sensors: _Sensors
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}