using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// FleetVehicleResponseVehicleInfo
    /// </summary>
    public sealed class FleetVehicleResponseVehicleInfo:  IEquatable<FleetVehicleResponseVehicleInfo>
    { 
        /// <summary>
        /// Year of the vehicle.
        /// </summary>
        public long? Year { get; private set; }

        /// <summary>
        /// Model of the Vehicle.
        /// </summary>
        public string Model { get; private set; }

        /// <summary>
        /// Vehicle Identification Number.
        /// </summary>
        public string Vin { get; private set; }

        /// <summary>
        /// Make of the vehicle.
        /// </summary>
        public string Make { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use FleetVehicleResponseVehicleInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public FleetVehicleResponseVehicleInfo()
        {
        }

        private FleetVehicleResponseVehicleInfo(long? Year, string Model, string Vin, string Make)
        {
            
            this.Year = Year;
            
            this.Model = Model;
            
            this.Vin = Vin;
            
            this.Make = Make;
            
        }

        /// <summary>
        /// Returns builder of FleetVehicleResponseVehicleInfo.
        /// </summary>
        /// <returns>FleetVehicleResponseVehicleInfoBuilder</returns>
        public static FleetVehicleResponseVehicleInfoBuilder Builder()
        {
            return new FleetVehicleResponseVehicleInfoBuilder();
        }

        /// <summary>
        /// Returns FleetVehicleResponseVehicleInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>FleetVehicleResponseVehicleInfoBuilder</returns>
        public FleetVehicleResponseVehicleInfoBuilder With()
        {
            return Builder()
                .Year(Year)
                .Model(Model)
                .Vin(Vin)
                .Make(Make);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(FleetVehicleResponseVehicleInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (FleetVehicleResponseVehicleInfo.
        /// </summary>
        /// <param name="left">Compared (FleetVehicleResponseVehicleInfo</param>
        /// <param name="right">Compared (FleetVehicleResponseVehicleInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (FleetVehicleResponseVehicleInfo left, FleetVehicleResponseVehicleInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (FleetVehicleResponseVehicleInfo.
        /// </summary>
        /// <param name="left">Compared (FleetVehicleResponseVehicleInfo</param>
        /// <param name="right">Compared (FleetVehicleResponseVehicleInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (FleetVehicleResponseVehicleInfo left, FleetVehicleResponseVehicleInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of FleetVehicleResponseVehicleInfo.
        /// </summary>
        public sealed class FleetVehicleResponseVehicleInfoBuilder
        {
            private long? _Year;
            private string _Model;
            private string _Vin;
            private string _Make;

            internal FleetVehicleResponseVehicleInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for FleetVehicleResponseVehicleInfo.Year property.
            /// </summary>
            /// <param name="value">Year of the vehicle.</param>
            public FleetVehicleResponseVehicleInfoBuilder Year(long? value)
            {
                _Year = value;
                return this;
            }

            /// <summary>
            /// Sets value for FleetVehicleResponseVehicleInfo.Model property.
            /// </summary>
            /// <param name="value">Model of the Vehicle.</param>
            public FleetVehicleResponseVehicleInfoBuilder Model(string value)
            {
                _Model = value;
                return this;
            }

            /// <summary>
            /// Sets value for FleetVehicleResponseVehicleInfo.Vin property.
            /// </summary>
            /// <param name="value">Vehicle Identification Number.</param>
            public FleetVehicleResponseVehicleInfoBuilder Vin(string value)
            {
                _Vin = value;
                return this;
            }

            /// <summary>
            /// Sets value for FleetVehicleResponseVehicleInfo.Make property.
            /// </summary>
            /// <param name="value">Make of the vehicle.</param>
            public FleetVehicleResponseVehicleInfoBuilder Make(string value)
            {
                _Make = value;
                return this;
            }


            /// <summary>
            /// Builds instance of FleetVehicleResponseVehicleInfo.
            /// </summary>
            /// <returns>FleetVehicleResponseVehicleInfo</returns>
            public FleetVehicleResponseVehicleInfo Build()
            {
                Validate();
                return new FleetVehicleResponseVehicleInfo(
                    Year: _Year,
                    Model: _Model,
                    Vin: _Vin,
                    Make: _Make
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}