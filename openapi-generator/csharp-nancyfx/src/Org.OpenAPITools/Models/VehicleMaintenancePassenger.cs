using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Passenger vehicle data. Null if no data is available.
    /// </summary>
    public sealed class VehicleMaintenancePassenger:  IEquatable<VehicleMaintenancePassenger>
    { 
        /// <summary>
        /// CheckEngineLight
        /// </summary>
        public VehicleMaintenancePassengerCheckEngineLight CheckEngineLight { get; private set; }

        /// <summary>
        /// Passenger vehicle DTCs.
        /// </summary>
        public List<VehicleMaintenancePassengerDiagnosticTroubleCodes> DiagnosticTroubleCodes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VehicleMaintenancePassenger.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VehicleMaintenancePassenger()
        {
        }

        private VehicleMaintenancePassenger(VehicleMaintenancePassengerCheckEngineLight CheckEngineLight, List<VehicleMaintenancePassengerDiagnosticTroubleCodes> DiagnosticTroubleCodes)
        {
            
            this.CheckEngineLight = CheckEngineLight;
            
            this.DiagnosticTroubleCodes = DiagnosticTroubleCodes;
            
        }

        /// <summary>
        /// Returns builder of VehicleMaintenancePassenger.
        /// </summary>
        /// <returns>VehicleMaintenancePassengerBuilder</returns>
        public static VehicleMaintenancePassengerBuilder Builder()
        {
            return new VehicleMaintenancePassengerBuilder();
        }

        /// <summary>
        /// Returns VehicleMaintenancePassengerBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleMaintenancePassengerBuilder</returns>
        public VehicleMaintenancePassengerBuilder With()
        {
            return Builder()
                .CheckEngineLight(CheckEngineLight)
                .DiagnosticTroubleCodes(DiagnosticTroubleCodes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VehicleMaintenancePassenger other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VehicleMaintenancePassenger.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenancePassenger</param>
        /// <param name="right">Compared (VehicleMaintenancePassenger</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VehicleMaintenancePassenger left, VehicleMaintenancePassenger right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VehicleMaintenancePassenger.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenancePassenger</param>
        /// <param name="right">Compared (VehicleMaintenancePassenger</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VehicleMaintenancePassenger left, VehicleMaintenancePassenger right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VehicleMaintenancePassenger.
        /// </summary>
        public sealed class VehicleMaintenancePassengerBuilder
        {
            private VehicleMaintenancePassengerCheckEngineLight _CheckEngineLight;
            private List<VehicleMaintenancePassengerDiagnosticTroubleCodes> _DiagnosticTroubleCodes;

            internal VehicleMaintenancePassengerBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VehicleMaintenancePassenger.CheckEngineLight property.
            /// </summary>
            /// <param name="value">CheckEngineLight</param>
            public VehicleMaintenancePassengerBuilder CheckEngineLight(VehicleMaintenancePassengerCheckEngineLight value)
            {
                _CheckEngineLight = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenancePassenger.DiagnosticTroubleCodes property.
            /// </summary>
            /// <param name="value">Passenger vehicle DTCs.</param>
            public VehicleMaintenancePassengerBuilder DiagnosticTroubleCodes(List<VehicleMaintenancePassengerDiagnosticTroubleCodes> value)
            {
                _DiagnosticTroubleCodes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VehicleMaintenancePassenger.
            /// </summary>
            /// <returns>VehicleMaintenancePassenger</returns>
            public VehicleMaintenancePassenger Build()
            {
                Validate();
                return new VehicleMaintenancePassenger(
                    CheckEngineLight: _CheckEngineLight,
                    DiagnosticTroubleCodes: _DiagnosticTroubleCodes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}