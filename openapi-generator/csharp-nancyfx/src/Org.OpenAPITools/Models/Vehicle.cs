using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// A vehicle object.
    /// </summary>
    public sealed class Vehicle:  IEquatable<Vehicle>
    { 
        /// <summary>
        /// Total engine hours for the vehicle.
        /// </summary>
        public long? EngineHours { get; private set; }

        /// <summary>
        /// The fuel level of the vehicle as a percentage. (0.0 to 1.0)
        /// </summary>
        public double? FuelLevelPercent { get; private set; }

        /// <summary>
        /// ID of the vehicle.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of the vehicle.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Note
        /// </summary>
        public string Note { get; private set; }

        /// <summary>
        /// The number of meters reported by the odometer.
        /// </summary>
        public long? OdometerMeters { get; private set; }

        /// <summary>
        /// Vehicle Identification Number.
        /// </summary>
        public string Vin { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Vehicle.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Vehicle()
        {
        }

        private Vehicle(long? EngineHours, double? FuelLevelPercent, long? Id, string Name, string Note, long? OdometerMeters, string Vin)
        {
            
            this.EngineHours = EngineHours;
            
            this.FuelLevelPercent = FuelLevelPercent;
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.Note = Note;
            
            this.OdometerMeters = OdometerMeters;
            
            this.Vin = Vin;
            
        }

        /// <summary>
        /// Returns builder of Vehicle.
        /// </summary>
        /// <returns>VehicleBuilder</returns>
        public static VehicleBuilder Builder()
        {
            return new VehicleBuilder();
        }

        /// <summary>
        /// Returns VehicleBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleBuilder</returns>
        public VehicleBuilder With()
        {
            return Builder()
                .EngineHours(EngineHours)
                .FuelLevelPercent(FuelLevelPercent)
                .Id(Id)
                .Name(Name)
                .Note(Note)
                .OdometerMeters(OdometerMeters)
                .Vin(Vin);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Vehicle other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Vehicle.
        /// </summary>
        /// <param name="left">Compared (Vehicle</param>
        /// <param name="right">Compared (Vehicle</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Vehicle left, Vehicle right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Vehicle.
        /// </summary>
        /// <param name="left">Compared (Vehicle</param>
        /// <param name="right">Compared (Vehicle</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Vehicle left, Vehicle right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Vehicle.
        /// </summary>
        public sealed class VehicleBuilder
        {
            private long? _EngineHours;
            private double? _FuelLevelPercent;
            private long? _Id;
            private string _Name;
            private string _Note;
            private long? _OdometerMeters;
            private string _Vin;

            internal VehicleBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Vehicle.EngineHours property.
            /// </summary>
            /// <param name="value">Total engine hours for the vehicle.</param>
            public VehicleBuilder EngineHours(long? value)
            {
                _EngineHours = value;
                return this;
            }

            /// <summary>
            /// Sets value for Vehicle.FuelLevelPercent property.
            /// </summary>
            /// <param name="value">The fuel level of the vehicle as a percentage. (0.0 to 1.0)</param>
            public VehicleBuilder FuelLevelPercent(double? value)
            {
                _FuelLevelPercent = value;
                return this;
            }

            /// <summary>
            /// Sets value for Vehicle.Id property.
            /// </summary>
            /// <param name="value">ID of the vehicle.</param>
            public VehicleBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Vehicle.Name property.
            /// </summary>
            /// <param name="value">Name of the vehicle.</param>
            public VehicleBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Vehicle.Note property.
            /// </summary>
            /// <param name="value">Note</param>
            public VehicleBuilder Note(string value)
            {
                _Note = value;
                return this;
            }

            /// <summary>
            /// Sets value for Vehicle.OdometerMeters property.
            /// </summary>
            /// <param name="value">The number of meters reported by the odometer.</param>
            public VehicleBuilder OdometerMeters(long? value)
            {
                _OdometerMeters = value;
                return this;
            }

            /// <summary>
            /// Sets value for Vehicle.Vin property.
            /// </summary>
            /// <param name="value">Vehicle Identification Number.</param>
            public VehicleBuilder Vin(string value)
            {
                _Vin = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Vehicle.
            /// </summary>
            /// <returns>Vehicle</returns>
            public Vehicle Build()
            {
                Validate();
                return new Vehicle(
                    EngineHours: _EngineHours,
                    FuelLevelPercent: _FuelLevelPercent,
                    Id: _Id,
                    Name: _Name,
                    Note: _Note,
                    OdometerMeters: _OdometerMeters,
                    Vin: _Vin
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for Vehicle and cannot be null");
                } 
            }
        }

        
    }
}