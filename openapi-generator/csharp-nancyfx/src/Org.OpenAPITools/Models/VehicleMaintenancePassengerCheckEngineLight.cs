using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Passenger vehicle check engine light.
    /// </summary>
    public sealed class VehicleMaintenancePassengerCheckEngineLight:  IEquatable<VehicleMaintenancePassengerCheckEngineLight>
    { 
        /// <summary>
        /// IsOn
        /// </summary>
        public bool? IsOn { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VehicleMaintenancePassengerCheckEngineLight.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VehicleMaintenancePassengerCheckEngineLight()
        {
        }

        private VehicleMaintenancePassengerCheckEngineLight(bool? IsOn)
        {
            
            this.IsOn = IsOn;
            
        }

        /// <summary>
        /// Returns builder of VehicleMaintenancePassengerCheckEngineLight.
        /// </summary>
        /// <returns>VehicleMaintenancePassengerCheckEngineLightBuilder</returns>
        public static VehicleMaintenancePassengerCheckEngineLightBuilder Builder()
        {
            return new VehicleMaintenancePassengerCheckEngineLightBuilder();
        }

        /// <summary>
        /// Returns VehicleMaintenancePassengerCheckEngineLightBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleMaintenancePassengerCheckEngineLightBuilder</returns>
        public VehicleMaintenancePassengerCheckEngineLightBuilder With()
        {
            return Builder()
                .IsOn(IsOn);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VehicleMaintenancePassengerCheckEngineLight other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VehicleMaintenancePassengerCheckEngineLight.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenancePassengerCheckEngineLight</param>
        /// <param name="right">Compared (VehicleMaintenancePassengerCheckEngineLight</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VehicleMaintenancePassengerCheckEngineLight left, VehicleMaintenancePassengerCheckEngineLight right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VehicleMaintenancePassengerCheckEngineLight.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenancePassengerCheckEngineLight</param>
        /// <param name="right">Compared (VehicleMaintenancePassengerCheckEngineLight</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VehicleMaintenancePassengerCheckEngineLight left, VehicleMaintenancePassengerCheckEngineLight right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VehicleMaintenancePassengerCheckEngineLight.
        /// </summary>
        public sealed class VehicleMaintenancePassengerCheckEngineLightBuilder
        {
            private bool? _IsOn;

            internal VehicleMaintenancePassengerCheckEngineLightBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VehicleMaintenancePassengerCheckEngineLight.IsOn property.
            /// </summary>
            /// <param name="value">IsOn</param>
            public VehicleMaintenancePassengerCheckEngineLightBuilder IsOn(bool? value)
            {
                _IsOn = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VehicleMaintenancePassengerCheckEngineLight.
            /// </summary>
            /// <returns>VehicleMaintenancePassengerCheckEngineLight</returns>
            public VehicleMaintenancePassengerCheckEngineLight Build()
            {
                Validate();
                return new VehicleMaintenancePassengerCheckEngineLight(
                    IsOn: _IsOn
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}