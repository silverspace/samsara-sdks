using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains information about a sensor.
    /// </summary>
    public sealed class Sensor:  IEquatable<Sensor>
    { 
        /// <summary>
        /// ID of the sensor.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// MAC address of the sensor.
        /// </summary>
        public string MacAddress { get; private set; }

        /// <summary>
        /// Name of the sensor.
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Sensor.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Sensor()
        {
        }

        private Sensor(long? Id, string MacAddress, string Name)
        {
            
            this.Id = Id;
            
            this.MacAddress = MacAddress;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of Sensor.
        /// </summary>
        /// <returns>SensorBuilder</returns>
        public static SensorBuilder Builder()
        {
            return new SensorBuilder();
        }

        /// <summary>
        /// Returns SensorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SensorBuilder</returns>
        public SensorBuilder With()
        {
            return Builder()
                .Id(Id)
                .MacAddress(MacAddress)
                .Name(Name);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Sensor other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Sensor.
        /// </summary>
        /// <param name="left">Compared (Sensor</param>
        /// <param name="right">Compared (Sensor</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Sensor left, Sensor right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Sensor.
        /// </summary>
        /// <param name="left">Compared (Sensor</param>
        /// <param name="right">Compared (Sensor</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Sensor left, Sensor right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Sensor.
        /// </summary>
        public sealed class SensorBuilder
        {
            private long? _Id;
            private string _MacAddress;
            private string _Name;

            internal SensorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Sensor.Id property.
            /// </summary>
            /// <param name="value">ID of the sensor.</param>
            public SensorBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Sensor.MacAddress property.
            /// </summary>
            /// <param name="value">MAC address of the sensor.</param>
            public SensorBuilder MacAddress(string value)
            {
                _MacAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for Sensor.Name property.
            /// </summary>
            /// <param name="value">Name of the sensor.</param>
            public SensorBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Sensor.
            /// </summary>
            /// <returns>Sensor</returns>
            public Sensor Build()
            {
                Validate();
                return new Sensor(
                    Id: _Id,
                    MacAddress: _MacAddress,
                    Name: _Name
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for Sensor and cannot be null");
                } 
            }
        }

        
    }
}