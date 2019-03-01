using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineResponse2004
    /// </summary>
    public sealed class InlineResponse2004:  IEquatable<InlineResponse2004>
    { 
        /// <summary>
        /// Vehicles
        /// </summary>
        public List<VehicleMaintenance> Vehicles { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse2004.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse2004()
        {
        }

        private InlineResponse2004(List<VehicleMaintenance> Vehicles)
        {
            
            this.Vehicles = Vehicles;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse2004.
        /// </summary>
        /// <returns>InlineResponse2004Builder</returns>
        public static InlineResponse2004Builder Builder()
        {
            return new InlineResponse2004Builder();
        }

        /// <summary>
        /// Returns InlineResponse2004Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse2004Builder</returns>
        public InlineResponse2004Builder With()
        {
            return Builder()
                .Vehicles(Vehicles);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineResponse2004 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse2004.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2004</param>
        /// <param name="right">Compared (InlineResponse2004</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse2004 left, InlineResponse2004 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse2004.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2004</param>
        /// <param name="right">Compared (InlineResponse2004</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse2004 left, InlineResponse2004 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse2004.
        /// </summary>
        public sealed class InlineResponse2004Builder
        {
            private List<VehicleMaintenance> _Vehicles;

            internal InlineResponse2004Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse2004.Vehicles property.
            /// </summary>
            /// <param name="value">Vehicles</param>
            public InlineResponse2004Builder Vehicles(List<VehicleMaintenance> value)
            {
                _Vehicles = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse2004.
            /// </summary>
            /// <returns>InlineResponse2004</returns>
            public InlineResponse2004 Build()
            {
                Validate();
                return new InlineResponse2004(
                    Vehicles: _Vehicles
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}