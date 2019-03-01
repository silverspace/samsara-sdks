using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// J1939 based data. Null if no data is available.
    /// </summary>
    public sealed class VehicleMaintenanceJ1939:  IEquatable<VehicleMaintenanceJ1939>
    { 
        /// <summary>
        /// CheckEngineLight
        /// </summary>
        public VehicleMaintenanceJ1939CheckEngineLight CheckEngineLight { get; private set; }

        /// <summary>
        /// J1939 DTCs.
        /// </summary>
        public List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> DiagnosticTroubleCodes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VehicleMaintenanceJ1939.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VehicleMaintenanceJ1939()
        {
        }

        private VehicleMaintenanceJ1939(VehicleMaintenanceJ1939CheckEngineLight CheckEngineLight, List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> DiagnosticTroubleCodes)
        {
            
            this.CheckEngineLight = CheckEngineLight;
            
            this.DiagnosticTroubleCodes = DiagnosticTroubleCodes;
            
        }

        /// <summary>
        /// Returns builder of VehicleMaintenanceJ1939.
        /// </summary>
        /// <returns>VehicleMaintenanceJ1939Builder</returns>
        public static VehicleMaintenanceJ1939Builder Builder()
        {
            return new VehicleMaintenanceJ1939Builder();
        }

        /// <summary>
        /// Returns VehicleMaintenanceJ1939Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleMaintenanceJ1939Builder</returns>
        public VehicleMaintenanceJ1939Builder With()
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

        public bool Equals(VehicleMaintenanceJ1939 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VehicleMaintenanceJ1939.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenanceJ1939</param>
        /// <param name="right">Compared (VehicleMaintenanceJ1939</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VehicleMaintenanceJ1939 left, VehicleMaintenanceJ1939 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VehicleMaintenanceJ1939.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenanceJ1939</param>
        /// <param name="right">Compared (VehicleMaintenanceJ1939</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VehicleMaintenanceJ1939 left, VehicleMaintenanceJ1939 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VehicleMaintenanceJ1939.
        /// </summary>
        public sealed class VehicleMaintenanceJ1939Builder
        {
            private VehicleMaintenanceJ1939CheckEngineLight _CheckEngineLight;
            private List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> _DiagnosticTroubleCodes;

            internal VehicleMaintenanceJ1939Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939.CheckEngineLight property.
            /// </summary>
            /// <param name="value">CheckEngineLight</param>
            public VehicleMaintenanceJ1939Builder CheckEngineLight(VehicleMaintenanceJ1939CheckEngineLight value)
            {
                _CheckEngineLight = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939.DiagnosticTroubleCodes property.
            /// </summary>
            /// <param name="value">J1939 DTCs.</param>
            public VehicleMaintenanceJ1939Builder DiagnosticTroubleCodes(List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> value)
            {
                _DiagnosticTroubleCodes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VehicleMaintenanceJ1939.
            /// </summary>
            /// <returns>VehicleMaintenanceJ1939</returns>
            public VehicleMaintenanceJ1939 Build()
            {
                Validate();
                return new VehicleMaintenanceJ1939(
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