using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// HumidityResponseSensors
    /// </summary>
    public sealed class HumidityResponseSensors:  IEquatable<HumidityResponseSensors>
    { 
        /// <summary>
        /// Name of the sensor.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Currently reported relative humidity in percent, from 0-100.
        /// </summary>
        public int? Humidity { get; private set; }

        /// <summary>
        /// ID of the sensor.
        /// </summary>
        public long? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use HumidityResponseSensors.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public HumidityResponseSensors()
        {
        }

        private HumidityResponseSensors(string Name, int? Humidity, long? Id)
        {
            
            this.Name = Name;
            
            this.Humidity = Humidity;
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of HumidityResponseSensors.
        /// </summary>
        /// <returns>HumidityResponseSensorsBuilder</returns>
        public static HumidityResponseSensorsBuilder Builder()
        {
            return new HumidityResponseSensorsBuilder();
        }

        /// <summary>
        /// Returns HumidityResponseSensorsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>HumidityResponseSensorsBuilder</returns>
        public HumidityResponseSensorsBuilder With()
        {
            return Builder()
                .Name(Name)
                .Humidity(Humidity)
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

        public bool Equals(HumidityResponseSensors other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (HumidityResponseSensors.
        /// </summary>
        /// <param name="left">Compared (HumidityResponseSensors</param>
        /// <param name="right">Compared (HumidityResponseSensors</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (HumidityResponseSensors left, HumidityResponseSensors right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (HumidityResponseSensors.
        /// </summary>
        /// <param name="left">Compared (HumidityResponseSensors</param>
        /// <param name="right">Compared (HumidityResponseSensors</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (HumidityResponseSensors left, HumidityResponseSensors right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of HumidityResponseSensors.
        /// </summary>
        public sealed class HumidityResponseSensorsBuilder
        {
            private string _Name;
            private int? _Humidity;
            private long? _Id;

            internal HumidityResponseSensorsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for HumidityResponseSensors.Name property.
            /// </summary>
            /// <param name="value">Name of the sensor.</param>
            public HumidityResponseSensorsBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for HumidityResponseSensors.Humidity property.
            /// </summary>
            /// <param name="value">Currently reported relative humidity in percent, from 0-100.</param>
            public HumidityResponseSensorsBuilder Humidity(int? value)
            {
                _Humidity = value;
                return this;
            }

            /// <summary>
            /// Sets value for HumidityResponseSensors.Id property.
            /// </summary>
            /// <param name="value">ID of the sensor.</param>
            public HumidityResponseSensorsBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of HumidityResponseSensors.
            /// </summary>
            /// <returns>HumidityResponseSensors</returns>
            public HumidityResponseSensors Build()
            {
                Validate();
                return new HumidityResponseSensors(
                    Name: _Name,
                    Humidity: _Humidity,
                    Id: _Id
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}