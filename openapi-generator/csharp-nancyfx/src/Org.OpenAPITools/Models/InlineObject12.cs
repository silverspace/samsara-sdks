using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject12
    /// </summary>
    public sealed class InlineObject12:  IEquatable<InlineObject12>
    { 
        /// <summary>
        /// Only type &#39;mechanic&#39; is currently accepted.
        /// </summary>
        public InspectionTypeEnum? InspectionType { get; private set; }

        /// <summary>
        /// Any notes from the mechanic.
        /// </summary>
        public string MechanicNotes { get; private set; }

        /// <summary>
        /// The current odometer of the vehicle.
        /// </summary>
        public int? OdometerMiles { get; private set; }

        /// <summary>
        /// Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
        /// </summary>
        public bool? PreviousDefectsCorrected { get; private set; }

        /// <summary>
        /// Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
        /// </summary>
        public bool? PreviousDefectsIgnored { get; private set; }

        /// <summary>
        /// Whether or not this vehicle or trailer is safe to drive.
        /// </summary>
        public SafeEnum? Safe { get; private set; }

        /// <summary>
        /// Id of trailer being inspected. Either vehicleId or trailerId must be provided.
        /// </summary>
        public int? TrailerId { get; private set; }

        /// <summary>
        /// The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email.
        /// </summary>
        public string UserEmail { get; private set; }

        /// <summary>
        /// Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
        /// </summary>
        public int? VehicleId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject12.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject12()
        {
        }

        private InlineObject12(InspectionTypeEnum? InspectionType, string MechanicNotes, int? OdometerMiles, bool? PreviousDefectsCorrected, bool? PreviousDefectsIgnored, SafeEnum? Safe, int? TrailerId, string UserEmail, int? VehicleId)
        {
            
            this.InspectionType = InspectionType;
            
            this.MechanicNotes = MechanicNotes;
            
            this.OdometerMiles = OdometerMiles;
            
            this.PreviousDefectsCorrected = PreviousDefectsCorrected;
            
            this.PreviousDefectsIgnored = PreviousDefectsIgnored;
            
            this.Safe = Safe;
            
            this.TrailerId = TrailerId;
            
            this.UserEmail = UserEmail;
            
            this.VehicleId = VehicleId;
            
        }

        /// <summary>
        /// Returns builder of InlineObject12.
        /// </summary>
        /// <returns>InlineObject12Builder</returns>
        public static InlineObject12Builder Builder()
        {
            return new InlineObject12Builder();
        }

        /// <summary>
        /// Returns InlineObject12Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject12Builder</returns>
        public InlineObject12Builder With()
        {
            return Builder()
                .InspectionType(InspectionType)
                .MechanicNotes(MechanicNotes)
                .OdometerMiles(OdometerMiles)
                .PreviousDefectsCorrected(PreviousDefectsCorrected)
                .PreviousDefectsIgnored(PreviousDefectsIgnored)
                .Safe(Safe)
                .TrailerId(TrailerId)
                .UserEmail(UserEmail)
                .VehicleId(VehicleId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineObject12 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject12.
        /// </summary>
        /// <param name="left">Compared (InlineObject12</param>
        /// <param name="right">Compared (InlineObject12</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject12 left, InlineObject12 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject12.
        /// </summary>
        /// <param name="left">Compared (InlineObject12</param>
        /// <param name="right">Compared (InlineObject12</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject12 left, InlineObject12 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject12.
        /// </summary>
        public sealed class InlineObject12Builder
        {
            private InspectionTypeEnum? _InspectionType;
            private string _MechanicNotes;
            private int? _OdometerMiles;
            private bool? _PreviousDefectsCorrected;
            private bool? _PreviousDefectsIgnored;
            private SafeEnum? _Safe;
            private int? _TrailerId;
            private string _UserEmail;
            private int? _VehicleId;

            internal InlineObject12Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject12.InspectionType property.
            /// </summary>
            /// <param name="value">Only type &#39;mechanic&#39; is currently accepted.</param>
            public InlineObject12Builder InspectionType(InspectionTypeEnum? value)
            {
                _InspectionType = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject12.MechanicNotes property.
            /// </summary>
            /// <param name="value">Any notes from the mechanic.</param>
            public InlineObject12Builder MechanicNotes(string value)
            {
                _MechanicNotes = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject12.OdometerMiles property.
            /// </summary>
            /// <param name="value">The current odometer of the vehicle.</param>
            public InlineObject12Builder OdometerMiles(int? value)
            {
                _OdometerMiles = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject12.PreviousDefectsCorrected property.
            /// </summary>
            /// <param name="value">Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.</param>
            public InlineObject12Builder PreviousDefectsCorrected(bool? value)
            {
                _PreviousDefectsCorrected = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject12.PreviousDefectsIgnored property.
            /// </summary>
            /// <param name="value">Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.</param>
            public InlineObject12Builder PreviousDefectsIgnored(bool? value)
            {
                _PreviousDefectsIgnored = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject12.Safe property.
            /// </summary>
            /// <param name="value">Whether or not this vehicle or trailer is safe to drive.</param>
            public InlineObject12Builder Safe(SafeEnum? value)
            {
                _Safe = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject12.TrailerId property.
            /// </summary>
            /// <param name="value">Id of trailer being inspected. Either vehicleId or trailerId must be provided.</param>
            public InlineObject12Builder TrailerId(int? value)
            {
                _TrailerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject12.UserEmail property.
            /// </summary>
            /// <param name="value">The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email.</param>
            public InlineObject12Builder UserEmail(string value)
            {
                _UserEmail = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject12.VehicleId property.
            /// </summary>
            /// <param name="value">Id of vehicle being inspected. Either vehicleId or trailerId must be provided.</param>
            public InlineObject12Builder VehicleId(int? value)
            {
                _VehicleId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject12.
            /// </summary>
            /// <returns>InlineObject12</returns>
            public InlineObject12 Build()
            {
                Validate();
                return new InlineObject12(
                    InspectionType: _InspectionType,
                    MechanicNotes: _MechanicNotes,
                    OdometerMiles: _OdometerMiles,
                    PreviousDefectsCorrected: _PreviousDefectsCorrected,
                    PreviousDefectsIgnored: _PreviousDefectsIgnored,
                    Safe: _Safe,
                    TrailerId: _TrailerId,
                    UserEmail: _UserEmail,
                    VehicleId: _VehicleId
                );
            }

            private void Validate()
            { 
                if (_InspectionType == null)
                {
                    throw new ArgumentException("InspectionType is a required property for InlineObject12 and cannot be null");
                } 
                if (_Safe == null)
                {
                    throw new ArgumentException("Safe is a required property for InlineObject12 and cannot be null");
                } 
                if (_UserEmail == null)
                {
                    throw new ArgumentException("UserEmail is a required property for InlineObject12 and cannot be null");
                } 
            }
        }

        
        public enum InspectionTypeEnum { Mechanic };
        public enum SafeEnum { Safe, Unsafe };
    }
}