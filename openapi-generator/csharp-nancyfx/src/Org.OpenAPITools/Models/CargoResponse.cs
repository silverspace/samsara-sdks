using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains the current cargo status of a sensor.
    /// </summary>
    public sealed class CargoResponse:  IEquatable<CargoResponse>
    { 
        /// <summary>
        /// GroupId
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Sensors
        /// </summary>
        public List<CargoResponseSensors> Sensors { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use CargoResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CargoResponse()
        {
        }

        private CargoResponse(long? GroupId, List<CargoResponseSensors> Sensors)
        {
            
            this.GroupId = GroupId;
            
            this.Sensors = Sensors;
            
        }

        /// <summary>
        /// Returns builder of CargoResponse.
        /// </summary>
        /// <returns>CargoResponseBuilder</returns>
        public static CargoResponseBuilder Builder()
        {
            return new CargoResponseBuilder();
        }

        /// <summary>
        /// Returns CargoResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CargoResponseBuilder</returns>
        public CargoResponseBuilder With()
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

        public bool Equals(CargoResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CargoResponse.
        /// </summary>
        /// <param name="left">Compared (CargoResponse</param>
        /// <param name="right">Compared (CargoResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CargoResponse left, CargoResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CargoResponse.
        /// </summary>
        /// <param name="left">Compared (CargoResponse</param>
        /// <param name="right">Compared (CargoResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CargoResponse left, CargoResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CargoResponse.
        /// </summary>
        public sealed class CargoResponseBuilder
        {
            private long? _GroupId;
            private List<CargoResponseSensors> _Sensors;

            internal CargoResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CargoResponse.GroupId property.
            /// </summary>
            /// <param name="value">GroupId</param>
            public CargoResponseBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for CargoResponse.Sensors property.
            /// </summary>
            /// <param name="value">Sensors</param>
            public CargoResponseBuilder Sensors(List<CargoResponseSensors> value)
            {
                _Sensors = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CargoResponse.
            /// </summary>
            /// <returns>CargoResponse</returns>
            public CargoResponse Build()
            {
                Validate();
                return new CargoResponse(
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