using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// CargoResponseSensors
    /// </summary>
    public sealed class CargoResponseSensors:  IEquatable<CargoResponseSensors>
    { 
        /// <summary>
        /// Flag indicating whether the current cargo is empty or loaded.
        /// </summary>
        public bool? CargoEmpty { get; private set; }

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
        /// Use CargoResponseSensors.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CargoResponseSensors()
        {
        }

        private CargoResponseSensors(bool? CargoEmpty, string Name, long? Id)
        {
            
            this.CargoEmpty = CargoEmpty;
            
            this.Name = Name;
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of CargoResponseSensors.
        /// </summary>
        /// <returns>CargoResponseSensorsBuilder</returns>
        public static CargoResponseSensorsBuilder Builder()
        {
            return new CargoResponseSensorsBuilder();
        }

        /// <summary>
        /// Returns CargoResponseSensorsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CargoResponseSensorsBuilder</returns>
        public CargoResponseSensorsBuilder With()
        {
            return Builder()
                .CargoEmpty(CargoEmpty)
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

        public bool Equals(CargoResponseSensors other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CargoResponseSensors.
        /// </summary>
        /// <param name="left">Compared (CargoResponseSensors</param>
        /// <param name="right">Compared (CargoResponseSensors</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CargoResponseSensors left, CargoResponseSensors right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CargoResponseSensors.
        /// </summary>
        /// <param name="left">Compared (CargoResponseSensors</param>
        /// <param name="right">Compared (CargoResponseSensors</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CargoResponseSensors left, CargoResponseSensors right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CargoResponseSensors.
        /// </summary>
        public sealed class CargoResponseSensorsBuilder
        {
            private bool? _CargoEmpty;
            private string _Name;
            private long? _Id;

            internal CargoResponseSensorsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CargoResponseSensors.CargoEmpty property.
            /// </summary>
            /// <param name="value">Flag indicating whether the current cargo is empty or loaded.</param>
            public CargoResponseSensorsBuilder CargoEmpty(bool? value)
            {
                _CargoEmpty = value;
                return this;
            }

            /// <summary>
            /// Sets value for CargoResponseSensors.Name property.
            /// </summary>
            /// <param name="value">Name of the sensor.</param>
            public CargoResponseSensorsBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for CargoResponseSensors.Id property.
            /// </summary>
            /// <param name="value">ID of the sensor.</param>
            public CargoResponseSensorsBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CargoResponseSensors.
            /// </summary>
            /// <returns>CargoResponseSensors</returns>
            public CargoResponseSensors Build()
            {
                Validate();
                return new CargoResponseSensors(
                    CargoEmpty: _CargoEmpty,
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