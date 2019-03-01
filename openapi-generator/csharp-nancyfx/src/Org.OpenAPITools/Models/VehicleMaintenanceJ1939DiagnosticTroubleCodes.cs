using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// VehicleMaintenanceJ1939DiagnosticTroubleCodes
    /// </summary>
    public sealed class VehicleMaintenanceJ1939DiagnosticTroubleCodes:  IEquatable<VehicleMaintenanceJ1939DiagnosticTroubleCodes>
    { 
        /// <summary>
        /// SpnDescription
        /// </summary>
        public string SpnDescription { get; private set; }

        /// <summary>
        /// FmiText
        /// </summary>
        public string FmiText { get; private set; }

        /// <summary>
        /// SpnId
        /// </summary>
        public int? SpnId { get; private set; }

        /// <summary>
        /// OccurrenceCount
        /// </summary>
        public int? OccurrenceCount { get; private set; }

        /// <summary>
        /// TxId
        /// </summary>
        public int? TxId { get; private set; }

        /// <summary>
        /// FmiId
        /// </summary>
        public int? FmiId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VehicleMaintenanceJ1939DiagnosticTroubleCodes.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VehicleMaintenanceJ1939DiagnosticTroubleCodes()
        {
        }

        private VehicleMaintenanceJ1939DiagnosticTroubleCodes(string SpnDescription, string FmiText, int? SpnId, int? OccurrenceCount, int? TxId, int? FmiId)
        {
            
            this.SpnDescription = SpnDescription;
            
            this.FmiText = FmiText;
            
            this.SpnId = SpnId;
            
            this.OccurrenceCount = OccurrenceCount;
            
            this.TxId = TxId;
            
            this.FmiId = FmiId;
            
        }

        /// <summary>
        /// Returns builder of VehicleMaintenanceJ1939DiagnosticTroubleCodes.
        /// </summary>
        /// <returns>VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder</returns>
        public static VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder Builder()
        {
            return new VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder();
        }

        /// <summary>
        /// Returns VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder</returns>
        public VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder With()
        {
            return Builder()
                .SpnDescription(SpnDescription)
                .FmiText(FmiText)
                .SpnId(SpnId)
                .OccurrenceCount(OccurrenceCount)
                .TxId(TxId)
                .FmiId(FmiId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VehicleMaintenanceJ1939DiagnosticTroubleCodes other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VehicleMaintenanceJ1939DiagnosticTroubleCodes.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenanceJ1939DiagnosticTroubleCodes</param>
        /// <param name="right">Compared (VehicleMaintenanceJ1939DiagnosticTroubleCodes</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VehicleMaintenanceJ1939DiagnosticTroubleCodes left, VehicleMaintenanceJ1939DiagnosticTroubleCodes right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VehicleMaintenanceJ1939DiagnosticTroubleCodes.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenanceJ1939DiagnosticTroubleCodes</param>
        /// <param name="right">Compared (VehicleMaintenanceJ1939DiagnosticTroubleCodes</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VehicleMaintenanceJ1939DiagnosticTroubleCodes left, VehicleMaintenanceJ1939DiagnosticTroubleCodes right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VehicleMaintenanceJ1939DiagnosticTroubleCodes.
        /// </summary>
        public sealed class VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder
        {
            private string _SpnDescription;
            private string _FmiText;
            private int? _SpnId;
            private int? _OccurrenceCount;
            private int? _TxId;
            private int? _FmiId;

            internal VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939DiagnosticTroubleCodes.SpnDescription property.
            /// </summary>
            /// <param name="value">SpnDescription</param>
            public VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder SpnDescription(string value)
            {
                _SpnDescription = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939DiagnosticTroubleCodes.FmiText property.
            /// </summary>
            /// <param name="value">FmiText</param>
            public VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder FmiText(string value)
            {
                _FmiText = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939DiagnosticTroubleCodes.SpnId property.
            /// </summary>
            /// <param name="value">SpnId</param>
            public VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder SpnId(int? value)
            {
                _SpnId = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939DiagnosticTroubleCodes.OccurrenceCount property.
            /// </summary>
            /// <param name="value">OccurrenceCount</param>
            public VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder OccurrenceCount(int? value)
            {
                _OccurrenceCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939DiagnosticTroubleCodes.TxId property.
            /// </summary>
            /// <param name="value">TxId</param>
            public VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder TxId(int? value)
            {
                _TxId = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenanceJ1939DiagnosticTroubleCodes.FmiId property.
            /// </summary>
            /// <param name="value">FmiId</param>
            public VehicleMaintenanceJ1939DiagnosticTroubleCodesBuilder FmiId(int? value)
            {
                _FmiId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VehicleMaintenanceJ1939DiagnosticTroubleCodes.
            /// </summary>
            /// <returns>VehicleMaintenanceJ1939DiagnosticTroubleCodes</returns>
            public VehicleMaintenanceJ1939DiagnosticTroubleCodes Build()
            {
                Validate();
                return new VehicleMaintenanceJ1939DiagnosticTroubleCodes(
                    SpnDescription: _SpnDescription,
                    FmiText: _FmiText,
                    SpnId: _SpnId,
                    OccurrenceCount: _OccurrenceCount,
                    TxId: _TxId,
                    FmiId: _FmiId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}