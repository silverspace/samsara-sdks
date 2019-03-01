using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DriversResponse
    /// </summary>
    public sealed class DriversResponse:  IEquatable<DriversResponse>
    { 
        /// <summary>
        /// Drivers
        /// </summary>
        public List<Driver> Drivers { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DriversResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DriversResponse()
        {
        }

        private DriversResponse(List<Driver> Drivers)
        {
            
            this.Drivers = Drivers;
            
        }

        /// <summary>
        /// Returns builder of DriversResponse.
        /// </summary>
        /// <returns>DriversResponseBuilder</returns>
        public static DriversResponseBuilder Builder()
        {
            return new DriversResponseBuilder();
        }

        /// <summary>
        /// Returns DriversResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DriversResponseBuilder</returns>
        public DriversResponseBuilder With()
        {
            return Builder()
                .Drivers(Drivers);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DriversResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DriversResponse.
        /// </summary>
        /// <param name="left">Compared (DriversResponse</param>
        /// <param name="right">Compared (DriversResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DriversResponse left, DriversResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DriversResponse.
        /// </summary>
        /// <param name="left">Compared (DriversResponse</param>
        /// <param name="right">Compared (DriversResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DriversResponse left, DriversResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DriversResponse.
        /// </summary>
        public sealed class DriversResponseBuilder
        {
            private List<Driver> _Drivers;

            internal DriversResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DriversResponse.Drivers property.
            /// </summary>
            /// <param name="value">Drivers</param>
            public DriversResponseBuilder Drivers(List<Driver> value)
            {
                _Drivers = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DriversResponse.
            /// </summary>
            /// <returns>DriversResponse</returns>
            public DriversResponse Build()
            {
                Validate();
                return new DriversResponse(
                    Drivers: _Drivers
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}