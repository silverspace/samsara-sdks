using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TemperatureResponseSensors
    /// </summary>
    public sealed class TemperatureResponseSensors:  IEquatable<TemperatureResponseSensors>
    { 
        /// <summary>
        /// Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
        /// </summary>
        public int? ProbeTemperature { get; private set; }

        /// <summary>
        /// Name of the sensor.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// ID of the sensor.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Currently reported ambient temperature in millidegrees celsius.
        /// </summary>
        public int? AmbientTemperature { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TemperatureResponseSensors.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TemperatureResponseSensors()
        {
        }

        private TemperatureResponseSensors(int? ProbeTemperature, string Name, long? Id, int? AmbientTemperature)
        {
            
            this.ProbeTemperature = ProbeTemperature;
            
            this.Name = Name;
            
            this.Id = Id;
            
            this.AmbientTemperature = AmbientTemperature;
            
        }

        /// <summary>
        /// Returns builder of TemperatureResponseSensors.
        /// </summary>
        /// <returns>TemperatureResponseSensorsBuilder</returns>
        public static TemperatureResponseSensorsBuilder Builder()
        {
            return new TemperatureResponseSensorsBuilder();
        }

        /// <summary>
        /// Returns TemperatureResponseSensorsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TemperatureResponseSensorsBuilder</returns>
        public TemperatureResponseSensorsBuilder With()
        {
            return Builder()
                .ProbeTemperature(ProbeTemperature)
                .Name(Name)
                .Id(Id)
                .AmbientTemperature(AmbientTemperature);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(TemperatureResponseSensors other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TemperatureResponseSensors.
        /// </summary>
        /// <param name="left">Compared (TemperatureResponseSensors</param>
        /// <param name="right">Compared (TemperatureResponseSensors</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TemperatureResponseSensors left, TemperatureResponseSensors right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TemperatureResponseSensors.
        /// </summary>
        /// <param name="left">Compared (TemperatureResponseSensors</param>
        /// <param name="right">Compared (TemperatureResponseSensors</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TemperatureResponseSensors left, TemperatureResponseSensors right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TemperatureResponseSensors.
        /// </summary>
        public sealed class TemperatureResponseSensorsBuilder
        {
            private int? _ProbeTemperature;
            private string _Name;
            private long? _Id;
            private int? _AmbientTemperature;

            internal TemperatureResponseSensorsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TemperatureResponseSensors.ProbeTemperature property.
            /// </summary>
            /// <param name="value">Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.</param>
            public TemperatureResponseSensorsBuilder ProbeTemperature(int? value)
            {
                _ProbeTemperature = value;
                return this;
            }

            /// <summary>
            /// Sets value for TemperatureResponseSensors.Name property.
            /// </summary>
            /// <param name="value">Name of the sensor.</param>
            public TemperatureResponseSensorsBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for TemperatureResponseSensors.Id property.
            /// </summary>
            /// <param name="value">ID of the sensor.</param>
            public TemperatureResponseSensorsBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for TemperatureResponseSensors.AmbientTemperature property.
            /// </summary>
            /// <param name="value">Currently reported ambient temperature in millidegrees celsius.</param>
            public TemperatureResponseSensorsBuilder AmbientTemperature(int? value)
            {
                _AmbientTemperature = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TemperatureResponseSensors.
            /// </summary>
            /// <returns>TemperatureResponseSensors</returns>
            public TemperatureResponseSensors Build()
            {
                Validate();
                return new TemperatureResponseSensors(
                    ProbeTemperature: _ProbeTemperature,
                    Name: _Name,
                    Id: _Id,
                    AmbientTemperature: _AmbientTemperature
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}