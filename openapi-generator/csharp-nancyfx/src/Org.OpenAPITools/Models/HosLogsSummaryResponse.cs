using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// HosLogsSummaryResponse
    /// </summary>
    public sealed class HosLogsSummaryResponse:  IEquatable<HosLogsSummaryResponse>
    { 
        /// <summary>
        /// Drivers
        /// </summary>
        public List<HosLogsSummaryResponseDrivers> Drivers { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use HosLogsSummaryResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public HosLogsSummaryResponse()
        {
        }

        private HosLogsSummaryResponse(List<HosLogsSummaryResponseDrivers> Drivers)
        {
            
            this.Drivers = Drivers;
            
        }

        /// <summary>
        /// Returns builder of HosLogsSummaryResponse.
        /// </summary>
        /// <returns>HosLogsSummaryResponseBuilder</returns>
        public static HosLogsSummaryResponseBuilder Builder()
        {
            return new HosLogsSummaryResponseBuilder();
        }

        /// <summary>
        /// Returns HosLogsSummaryResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>HosLogsSummaryResponseBuilder</returns>
        public HosLogsSummaryResponseBuilder With()
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

        public bool Equals(HosLogsSummaryResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (HosLogsSummaryResponse.
        /// </summary>
        /// <param name="left">Compared (HosLogsSummaryResponse</param>
        /// <param name="right">Compared (HosLogsSummaryResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (HosLogsSummaryResponse left, HosLogsSummaryResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (HosLogsSummaryResponse.
        /// </summary>
        /// <param name="left">Compared (HosLogsSummaryResponse</param>
        /// <param name="right">Compared (HosLogsSummaryResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (HosLogsSummaryResponse left, HosLogsSummaryResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of HosLogsSummaryResponse.
        /// </summary>
        public sealed class HosLogsSummaryResponseBuilder
        {
            private List<HosLogsSummaryResponseDrivers> _Drivers;

            internal HosLogsSummaryResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for HosLogsSummaryResponse.Drivers property.
            /// </summary>
            /// <param name="value">Drivers</param>
            public HosLogsSummaryResponseBuilder Drivers(List<HosLogsSummaryResponseDrivers> value)
            {
                _Drivers = value;
                return this;
            }


            /// <summary>
            /// Builds instance of HosLogsSummaryResponse.
            /// </summary>
            /// <returns>HosLogsSummaryResponse</returns>
            public HosLogsSummaryResponse Build()
            {
                Validate();
                return new HosLogsSummaryResponse(
                    Drivers: _Drivers
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}