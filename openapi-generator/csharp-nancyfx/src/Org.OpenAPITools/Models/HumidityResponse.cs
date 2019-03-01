using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains the current humidity of a sensor.
    /// </summary>
    public sealed class HumidityResponse:  IEquatable<HumidityResponse>
    { 
        /// <summary>
        /// GroupId
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Sensors
        /// </summary>
        public List<HumidityResponseSensors> Sensors { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use HumidityResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public HumidityResponse()
        {
        }

        private HumidityResponse(long? GroupId, List<HumidityResponseSensors> Sensors)
        {
            
            this.GroupId = GroupId;
            
            this.Sensors = Sensors;
            
        }

        /// <summary>
        /// Returns builder of HumidityResponse.
        /// </summary>
        /// <returns>HumidityResponseBuilder</returns>
        public static HumidityResponseBuilder Builder()
        {
            return new HumidityResponseBuilder();
        }

        /// <summary>
        /// Returns HumidityResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>HumidityResponseBuilder</returns>
        public HumidityResponseBuilder With()
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

        public bool Equals(HumidityResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (HumidityResponse.
        /// </summary>
        /// <param name="left">Compared (HumidityResponse</param>
        /// <param name="right">Compared (HumidityResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (HumidityResponse left, HumidityResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (HumidityResponse.
        /// </summary>
        /// <param name="left">Compared (HumidityResponse</param>
        /// <param name="right">Compared (HumidityResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (HumidityResponse left, HumidityResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of HumidityResponse.
        /// </summary>
        public sealed class HumidityResponseBuilder
        {
            private long? _GroupId;
            private List<HumidityResponseSensors> _Sensors;

            internal HumidityResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for HumidityResponse.GroupId property.
            /// </summary>
            /// <param name="value">GroupId</param>
            public HumidityResponseBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for HumidityResponse.Sensors property.
            /// </summary>
            /// <param name="value">Sensors</param>
            public HumidityResponseBuilder Sensors(List<HumidityResponseSensors> value)
            {
                _Sensors = value;
                return this;
            }


            /// <summary>
            /// Builds instance of HumidityResponse.
            /// </summary>
            /// <returns>HumidityResponse</returns>
            public HumidityResponse Build()
            {
                Validate();
                return new HumidityResponse(
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