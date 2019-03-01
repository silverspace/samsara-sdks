using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DoorResponseSensors
    /// </summary>
    public sealed class DoorResponseSensors:  IEquatable<DoorResponseSensors>
    { 
        /// <summary>
        /// Flag indicating whether the current door is closed or open.
        /// </summary>
        public bool? DoorClosed { get; private set; }

        /// <summary>
        /// Name of the sensor.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// ID of the sensor.
        /// </summary>
        public long? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DoorResponseSensors.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DoorResponseSensors()
        {
        }

        private DoorResponseSensors(bool? DoorClosed, string Name, long? Id)
        {
            
            this.DoorClosed = DoorClosed;
            
            this.Name = Name;
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of DoorResponseSensors.
        /// </summary>
        /// <returns>DoorResponseSensorsBuilder</returns>
        public static DoorResponseSensorsBuilder Builder()
        {
            return new DoorResponseSensorsBuilder();
        }

        /// <summary>
        /// Returns DoorResponseSensorsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DoorResponseSensorsBuilder</returns>
        public DoorResponseSensorsBuilder With()
        {
            return Builder()
                .DoorClosed(DoorClosed)
                .Name(Name)
                .Id(Id);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DoorResponseSensors other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DoorResponseSensors.
        /// </summary>
        /// <param name="left">Compared (DoorResponseSensors</param>
        /// <param name="right">Compared (DoorResponseSensors</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DoorResponseSensors left, DoorResponseSensors right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DoorResponseSensors.
        /// </summary>
        /// <param name="left">Compared (DoorResponseSensors</param>
        /// <param name="right">Compared (DoorResponseSensors</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DoorResponseSensors left, DoorResponseSensors right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DoorResponseSensors.
        /// </summary>
        public sealed class DoorResponseSensorsBuilder
        {
            private bool? _DoorClosed;
            private string _Name;
            private long? _Id;

            internal DoorResponseSensorsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DoorResponseSensors.DoorClosed property.
            /// </summary>
            /// <param name="value">Flag indicating whether the current door is closed or open.</param>
            public DoorResponseSensorsBuilder DoorClosed(bool? value)
            {
                _DoorClosed = value;
                return this;
            }

            /// <summary>
            /// Sets value for DoorResponseSensors.Name property.
            /// </summary>
            /// <param name="value">Name of the sensor.</param>
            public DoorResponseSensorsBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DoorResponseSensors.Id property.
            /// </summary>
            /// <param name="value">ID of the sensor.</param>
            public DoorResponseSensorsBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DoorResponseSensors.
            /// </summary>
            /// <returns>DoorResponseSensors</returns>
            public DoorResponseSensors Build()
            {
                Validate();
                return new DoorResponseSensors(
                    DoorClosed: _DoorClosed,
                    Name: _Name,
                    Id: _Id
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}