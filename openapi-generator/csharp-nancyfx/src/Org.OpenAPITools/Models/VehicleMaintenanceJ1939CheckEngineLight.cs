using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// J1939 check engine lights.
    /// </summary>
    public sealed class VehicleMaintenanceJ1939CheckEngineLight:  IEquatable<VehicleMaintenanceJ1939CheckEngineLight>
    { 
        /// <summary>
        /// ProtectIsOn
        /// </summary>
        public bool? ProtectIsOn { get; private set; }

        /// <summary>
        /// StopIsOn
        /// </summary>
        public bool? StopIsOn { get; private set; }

        /// <summary>
        /// WarningIsOn
        /// </summary>
        public bool? WarningIsOn { get; private set; }

        /// <summary>
        /// EmissionsIsOn
        /// </summary>
        public bool? EmissionsIsOn { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VehicleMaintenanceJ1939CheckEngineLight.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VehicleMaintenanceJ1939CheckEngineLight()
        {
        }

        private VehicleMaintenanceJ1939CheckEngineLight(bool? ProtectIsOn, bool? StopIsOn, bool? WarningIsOn, bool? EmissionsIsOn)
        {
            
            this.ProtectIsOn = ProtectIsOn;
            
            this.StopIsOn = StopIsOn;
            
            this.WarningIsOn = WarningIsOn;
            
            this.EmissionsIsOn = EmissionsIsOn;
            
        }

        /// <summary>
        /// Returns builder of VehicleMaintenanceJ1939CheckEngineLight.
        /// </summary>
        /// <returns>VehicleMaintenanceJ1939CheckEngineLightBuilder</returns>
        public static VehicleMaintenanceJ1939CheckEngineLightBuilder Builder()
        {
            return new VehicleMaintenanceJ1939CheckEngineLightBuilder();
        }

        /// <summary>
        /// Returns VehicleMaintenanceJ1939CheckEngineLightBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleMaintenanceJ1939CheckEngineLightBuilder</returns>
        public VehicleMaintenanceJ1939CheckEngineLightBuilder With()
        {
            return Builder()
                .ProtectIsOn(ProtectIsOn)
                .StopIsOn(StopIsOn)
                .WarningIsOn(WarningIsOn)
                .EmissionsIsOn(EmissionsIsOn);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VehicleMaintenanceJ1939CheckEngineLight other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VehicleMaintenanceJ1939CheckEngineLight.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenanceJ1939CheckEngineLight</param>
        /// <param name="right">Compared (VehicleMaintenanceJ1939CheckEngineLight</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VehicleMaintenanceJ1939CheckEngineLight left, VehicleMaintenanceJ1939CheckEngineLight right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VehicleMaintenanceJ1939CheckEngineLight.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenanceJ1939CheckEngineLight</param>
        /// <param name="right">Compared (VehicleMaintenanceJ1939CheckEngineLight</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VehicleMaintenanceJ1939CheckEngineLight left, VehicleMaintenanceJ1939CheckEngineLight right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VehicleMaintenanceJ1939CheckEngineLight.
        /// </summary>
        public sealed class VehicleMaintenanceJ1939CheckEngineLightBuilder
        {
            private bool? _ProtectIsOn;
            private bool? _StopIsOn;
            private bool? _WarningIsOn;
            private bool? _EmissionsIsOn;

            internal VehicleMaintenanceJ1939CheckEngineLightBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939CheckEngineLight.ProtectIsOn property.
            /// </summary>
            /// <param name="value">ProtectIsOn</param>
            public VehicleMaintenanceJ1939CheckEngineLightBuilder ProtectIsOn(bool? value)
            {
                _ProtectIsOn = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939CheckEngineLight.StopIsOn property.
            /// </summary>
            /// <param name="value">StopIsOn</param>
            public VehicleMaintenanceJ1939CheckEngineLightBuilder StopIsOn(bool? value)
            {
                _StopIsOn = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939CheckEngineLight.WarningIsOn property.
            /// </summary>
            /// <param name="value">WarningIsOn</param>
            public VehicleMaintenanceJ1939CheckEngineLightBuilder WarningIsOn(bool? value)
            {
                _WarningIsOn = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939CheckEngineLight.EmissionsIsOn property.
            /// </summary>
            /// <param name="value">EmissionsIsOn</param>
            public VehicleMaintenanceJ1939CheckEngineLightBuilder EmissionsIsOn(bool? value)
            {
                _EmissionsIsOn = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VehicleMaintenanceJ1939CheckEngineLight.
            /// </summary>
            /// <returns>VehicleMaintenanceJ1939CheckEngineLight</returns>
            public VehicleMaintenanceJ1939CheckEngineLight Build()
            {
                Validate();
                return new VehicleMaintenanceJ1939CheckEngineLight(
                    ProtectIsOn: _ProtectIsOn,
                    StopIsOn: _StopIsOn,
                    WarningIsOn: _WarningIsOn,
                    EmissionsIsOn: _EmissionsIsOn
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}