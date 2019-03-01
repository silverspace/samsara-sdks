using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// VehicleMaintenancePassengerDiagnosticTroubleCodes
    /// </summary>
    public sealed class VehicleMaintenancePassengerDiagnosticTroubleCodes:  IEquatable<VehicleMaintenancePassengerDiagnosticTroubleCodes>
    { 
        /// <summary>
        /// DtcShortCode
        /// </summary>
        public string DtcShortCode { get; private set; }

        /// <summary>
        /// DtcId
        /// </summary>
        public int? DtcId { get; private set; }

        /// <summary>
        /// DtcDescription
        /// </summary>
        public string DtcDescription { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VehicleMaintenancePassengerDiagnosticTroubleCodes.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VehicleMaintenancePassengerDiagnosticTroubleCodes()
        {
        }

        private VehicleMaintenancePassengerDiagnosticTroubleCodes(string DtcShortCode, int? DtcId, string DtcDescription)
        {
            
            this.DtcShortCode = DtcShortCode;
            
            this.DtcId = DtcId;
            
            this.DtcDescription = DtcDescription;
            
        }

        /// <summary>
        /// Returns builder of VehicleMaintenancePassengerDiagnosticTroubleCodes.
        /// </summary>
        /// <returns>VehicleMaintenancePassengerDiagnosticTroubleCodesBuilder</returns>
        public static VehicleMaintenancePassengerDiagnosticTroubleCodesBuilder Builder()
        {
            return new VehicleMaintenancePassengerDiagnosticTroubleCodesBuilder();
        }

        /// <summary>
        /// Returns VehicleMaintenancePassengerDiagnosticTroubleCodesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleMaintenancePassengerDiagnosticTroubleCodesBuilder</returns>
        public VehicleMaintenancePassengerDiagnosticTroubleCodesBuilder With()
        {
            return Builder()
                .DtcShortCode(DtcShortCode)
                .DtcId(DtcId)
                .DtcDescription(DtcDescription);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VehicleMaintenancePassengerDiagnosticTroubleCodes other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VehicleMaintenancePassengerDiagnosticTroubleCodes.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenancePassengerDiagnosticTroubleCodes</param>
        /// <param name="right">Compared (VehicleMaintenancePassengerDiagnosticTroubleCodes</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VehicleMaintenancePassengerDiagnosticTroubleCodes left, VehicleMaintenancePassengerDiagnosticTroubleCodes right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VehicleMaintenancePassengerDiagnosticTroubleCodes.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenancePassengerDiagnosticTroubleCodes</param>
        /// <param name="right">Compared (VehicleMaintenancePassengerDiagnosticTroubleCodes</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VehicleMaintenancePassengerDiagnosticTroubleCodes left, VehicleMaintenancePassengerDiagnosticTroubleCodes right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VehicleMaintenancePassengerDiagnosticTroubleCodes.
        /// </summary>
        public sealed class VehicleMaintenancePassengerDiagnosticTroubleCodesBuilder
        {
            private string _DtcShortCode;
            private int? _DtcId;
            private string _DtcDescription;

            internal VehicleMaintenancePassengerDiagnosticTroubleCodesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VehicleMaintenancePassengerDiagnosticTroubleCodes.DtcShortCode property.
            /// </summary>
            /// <param name="value">DtcShortCode</param>
            public VehicleMaintenancePassengerDiagnosticTroubleCodesBuilder DtcShortCode(string value)
            {
                _DtcShortCode = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenancePassengerDiagnosticTroubleCodes.DtcId property.
            /// </summary>
            /// <param name="value">DtcId</param>
            public VehicleMaintenancePassengerDiagnosticTroubleCodesBuilder DtcId(int? value)
            {
                _DtcId = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenancePassengerDiagnosticTroubleCodes.DtcDescription property.
            /// </summary>
            /// <param name="value">DtcDescription</param>
            public VehicleMaintenancePassengerDiagnosticTroubleCodesBuilder DtcDescription(string value)
            {
                _DtcDescription = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VehicleMaintenancePassengerDiagnosticTroubleCodes.
            /// </summary>
            /// <returns>VehicleMaintenancePassengerDiagnosticTroubleCodes</returns>
            public VehicleMaintenancePassengerDiagnosticTroubleCodes Build()
            {
                Validate();
                return new VehicleMaintenancePassengerDiagnosticTroubleCodes(
                    DtcShortCode: _DtcShortCode,
                    DtcId: _DtcId,
                    DtcDescription: _DtcDescription
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}