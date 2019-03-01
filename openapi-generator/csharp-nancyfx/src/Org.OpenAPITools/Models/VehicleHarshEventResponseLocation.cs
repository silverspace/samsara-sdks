using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// VehicleHarshEventResponseLocation
    /// </summary>
    public sealed class VehicleHarshEventResponseLocation:  IEquatable<VehicleHarshEventResponseLocation>
    { 
        /// <summary>
        /// Address of location where the harsh event occurred
        /// </summary>
        public string Address { get; private set; }

        /// <summary>
        /// Latitude of location where the harsh event occurred
        /// </summary>
        public string Latitude { get; private set; }

        /// <summary>
        /// Longitude of location where the harsh event occurred
        /// </summary>
        public string Longitude { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VehicleHarshEventResponseLocation.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VehicleHarshEventResponseLocation()
        {
        }

        private VehicleHarshEventResponseLocation(string Address, string Latitude, string Longitude)
        {
            
            this.Address = Address;
            
            this.Latitude = Latitude;
            
            this.Longitude = Longitude;
            
        }

        /// <summary>
        /// Returns builder of VehicleHarshEventResponseLocation.
        /// </summary>
        /// <returns>VehicleHarshEventResponseLocationBuilder</returns>
        public static VehicleHarshEventResponseLocationBuilder Builder()
        {
            return new VehicleHarshEventResponseLocationBuilder();
        }

        /// <summary>
        /// Returns VehicleHarshEventResponseLocationBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleHarshEventResponseLocationBuilder</returns>
        public VehicleHarshEventResponseLocationBuilder With()
        {
            return Builder()
                .Address(Address)
                .Latitude(Latitude)
                .Longitude(Longitude);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VehicleHarshEventResponseLocation other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VehicleHarshEventResponseLocation.
        /// </summary>
        /// <param name="left">Compared (VehicleHarshEventResponseLocation</param>
        /// <param name="right">Compared (VehicleHarshEventResponseLocation</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VehicleHarshEventResponseLocation left, VehicleHarshEventResponseLocation right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VehicleHarshEventResponseLocation.
        /// </summary>
        /// <param name="left">Compared (VehicleHarshEventResponseLocation</param>
        /// <param name="right">Compared (VehicleHarshEventResponseLocation</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VehicleHarshEventResponseLocation left, VehicleHarshEventResponseLocation right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VehicleHarshEventResponseLocation.
        /// </summary>
        public sealed class VehicleHarshEventResponseLocationBuilder
        {
            private string _Address;
            private string _Latitude;
            private string _Longitude;

            internal VehicleHarshEventResponseLocationBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VehicleHarshEventResponseLocation.Address property.
            /// </summary>
            /// <param name="value">Address of location where the harsh event occurred</param>
            public VehicleHarshEventResponseLocationBuilder Address(string value)
            {
                _Address = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleHarshEventResponseLocation.Latitude property.
            /// </summary>
            /// <param name="value">Latitude of location where the harsh event occurred</param>
            public VehicleHarshEventResponseLocationBuilder Latitude(string value)
            {
                _Latitude = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleHarshEventResponseLocation.Longitude property.
            /// </summary>
            /// <param name="value">Longitude of location where the harsh event occurred</param>
            public VehicleHarshEventResponseLocationBuilder Longitude(string value)
            {
                _Longitude = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VehicleHarshEventResponseLocation.
            /// </summary>
            /// <returns>VehicleHarshEventResponseLocation</returns>
            public VehicleHarshEventResponseLocation Build()
            {
                Validate();
                return new VehicleHarshEventResponseLocation(
                    Address: _Address,
                    Latitude: _Latitude,
                    Longitude: _Longitude
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}