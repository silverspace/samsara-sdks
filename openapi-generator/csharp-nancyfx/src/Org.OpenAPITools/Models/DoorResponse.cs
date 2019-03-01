using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains the current door status of a sensor.
    /// </summary>
    public sealed class DoorResponse:  IEquatable<DoorResponse>
    { 
        /// <summary>
        /// GroupId
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Sensors
        /// </summary>
        public List<DoorResponseSensors> Sensors { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DoorResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DoorResponse()
        {
        }

        private DoorResponse(long? GroupId, List<DoorResponseSensors> Sensors)
        {
            
            this.GroupId = GroupId;
            
            this.Sensors = Sensors;
            
        }

        /// <summary>
        /// Returns builder of DoorResponse.
        /// </summary>
        /// <returns>DoorResponseBuilder</returns>
        public static DoorResponseBuilder Builder()
        {
            return new DoorResponseBuilder();
        }

        /// <summary>
        /// Returns DoorResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DoorResponseBuilder</returns>
        public DoorResponseBuilder With()
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

        public bool Equals(DoorResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DoorResponse.
        /// </summary>
        /// <param name="left">Compared (DoorResponse</param>
        /// <param name="right">Compared (DoorResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DoorResponse left, DoorResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DoorResponse.
        /// </summary>
        /// <param name="left">Compared (DoorResponse</param>
        /// <param name="right">Compared (DoorResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DoorResponse left, DoorResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DoorResponse.
        /// </summary>
        public sealed class DoorResponseBuilder
        {
            private long? _GroupId;
            private List<DoorResponseSensors> _Sensors;

            internal DoorResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DoorResponse.GroupId property.
            /// </summary>
            /// <param name="value">GroupId</param>
            public DoorResponseBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DoorResponse.Sensors property.
            /// </summary>
            /// <param name="value">Sensors</param>
            public DoorResponseBuilder Sensors(List<DoorResponseSensors> value)
            {
                _Sensors = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DoorResponse.
            /// </summary>
            /// <returns>DoorResponse</returns>
            public DoorResponse Build()
            {
                Validate();
                return new DoorResponse(
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