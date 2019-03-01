using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DvirBase
    /// </summary>
    public sealed class DvirBase:  IEquatable<DvirBase>
    { 
        /// <summary>
        /// AuthorSignature
        /// </summary>
        public DvirBaseAuthorSignature AuthorSignature { get; private set; }

        /// <summary>
        /// Signifies if the defects on the vehicle corrected after the DVIR is done.
        /// </summary>
        public bool? DefectsCorrected { get; private set; }

        /// <summary>
        /// Signifies if the defects on this vehicle can be ignored.
        /// </summary>
        public bool? DefectsNeedNotBeCorrected { get; private set; }

        /// <summary>
        /// The id of this DVIR record.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Inspection type of the DVIR.
        /// </summary>
        public string InspectionType { get; private set; }

        /// <summary>
        /// The mechanics notes on the DVIR.
        /// </summary>
        public string MechanicNotes { get; private set; }

        /// <summary>
        /// MechanicOrAgentSignature
        /// </summary>
        public DvirBaseMechanicOrAgentSignature MechanicOrAgentSignature { get; private set; }

        /// <summary>
        /// NextDriverSignature
        /// </summary>
        public DvirBaseNextDriverSignature NextDriverSignature { get; private set; }

        /// <summary>
        /// The odometer reading in miles for the vehicle when the DVIR was done.
        /// </summary>
        public long? OdometerMiles { get; private set; }

        /// <summary>
        /// Timestamp of this DVIR in UNIX milliseconds.
        /// </summary>
        public long? TimeMs { get; private set; }

        /// <summary>
        /// Defects registered for the trailer which was part of the DVIR.
        /// </summary>
        public List<DvirBaseTrailerDefects> TrailerDefects { get; private set; }

        /// <summary>
        /// The id of the trailer which was part of the DVIR.
        /// </summary>
        public int? TrailerId { get; private set; }

        /// <summary>
        /// The name of the trailer which was part of the DVIR.
        /// </summary>
        public string TrailerName { get; private set; }

        /// <summary>
        /// Vehicle
        /// </summary>
        public DvirBaseVehicle Vehicle { get; private set; }

        /// <summary>
        /// The condition of vechile on which DVIR was done.
        /// </summary>
        public string VehicleCondition { get; private set; }

        /// <summary>
        /// Defects registered for the vehicle which was part of the DVIR.
        /// </summary>
        public List<DvirBaseTrailerDefects> VehicleDefects { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DvirBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DvirBase()
        {
        }

        private DvirBase(DvirBaseAuthorSignature AuthorSignature, bool? DefectsCorrected, bool? DefectsNeedNotBeCorrected, long? Id, string InspectionType, string MechanicNotes, DvirBaseMechanicOrAgentSignature MechanicOrAgentSignature, DvirBaseNextDriverSignature NextDriverSignature, long? OdometerMiles, long? TimeMs, List<DvirBaseTrailerDefects> TrailerDefects, int? TrailerId, string TrailerName, DvirBaseVehicle Vehicle, string VehicleCondition, List<DvirBaseTrailerDefects> VehicleDefects)
        {
            
            this.AuthorSignature = AuthorSignature;
            
            this.DefectsCorrected = DefectsCorrected;
            
            this.DefectsNeedNotBeCorrected = DefectsNeedNotBeCorrected;
            
            this.Id = Id;
            
            this.InspectionType = InspectionType;
            
            this.MechanicNotes = MechanicNotes;
            
            this.MechanicOrAgentSignature = MechanicOrAgentSignature;
            
            this.NextDriverSignature = NextDriverSignature;
            
            this.OdometerMiles = OdometerMiles;
            
            this.TimeMs = TimeMs;
            
            this.TrailerDefects = TrailerDefects;
            
            this.TrailerId = TrailerId;
            
            this.TrailerName = TrailerName;
            
            this.Vehicle = Vehicle;
            
            this.VehicleCondition = VehicleCondition;
            
            this.VehicleDefects = VehicleDefects;
            
        }

        /// <summary>
        /// Returns builder of DvirBase.
        /// </summary>
        /// <returns>DvirBaseBuilder</returns>
        public static DvirBaseBuilder Builder()
        {
            return new DvirBaseBuilder();
        }

        /// <summary>
        /// Returns DvirBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DvirBaseBuilder</returns>
        public DvirBaseBuilder With()
        {
            return Builder()
                .AuthorSignature(AuthorSignature)
                .DefectsCorrected(DefectsCorrected)
                .DefectsNeedNotBeCorrected(DefectsNeedNotBeCorrected)
                .Id(Id)
                .InspectionType(InspectionType)
                .MechanicNotes(MechanicNotes)
                .MechanicOrAgentSignature(MechanicOrAgentSignature)
                .NextDriverSignature(NextDriverSignature)
                .OdometerMiles(OdometerMiles)
                .TimeMs(TimeMs)
                .TrailerDefects(TrailerDefects)
                .TrailerId(TrailerId)
                .TrailerName(TrailerName)
                .Vehicle(Vehicle)
                .VehicleCondition(VehicleCondition)
                .VehicleDefects(VehicleDefects);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DvirBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DvirBase.
        /// </summary>
        /// <param name="left">Compared (DvirBase</param>
        /// <param name="right">Compared (DvirBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DvirBase left, DvirBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DvirBase.
        /// </summary>
        /// <param name="left">Compared (DvirBase</param>
        /// <param name="right">Compared (DvirBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DvirBase left, DvirBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DvirBase.
        /// </summary>
        public sealed class DvirBaseBuilder
        {
            private DvirBaseAuthorSignature _AuthorSignature;
            private bool? _DefectsCorrected;
            private bool? _DefectsNeedNotBeCorrected;
            private long? _Id;
            private string _InspectionType;
            private string _MechanicNotes;
            private DvirBaseMechanicOrAgentSignature _MechanicOrAgentSignature;
            private DvirBaseNextDriverSignature _NextDriverSignature;
            private long? _OdometerMiles;
            private long? _TimeMs;
            private List<DvirBaseTrailerDefects> _TrailerDefects;
            private int? _TrailerId;
            private string _TrailerName;
            private DvirBaseVehicle _Vehicle;
            private string _VehicleCondition;
            private List<DvirBaseTrailerDefects> _VehicleDefects;

            internal DvirBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DvirBase.AuthorSignature property.
            /// </summary>
            /// <param name="value">AuthorSignature</param>
            public DvirBaseBuilder AuthorSignature(DvirBaseAuthorSignature value)
            {
                _AuthorSignature = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.DefectsCorrected property.
            /// </summary>
            /// <param name="value">Signifies if the defects on the vehicle corrected after the DVIR is done.</param>
            public DvirBaseBuilder DefectsCorrected(bool? value)
            {
                _DefectsCorrected = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.DefectsNeedNotBeCorrected property.
            /// </summary>
            /// <param name="value">Signifies if the defects on this vehicle can be ignored.</param>
            public DvirBaseBuilder DefectsNeedNotBeCorrected(bool? value)
            {
                _DefectsNeedNotBeCorrected = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.Id property.
            /// </summary>
            /// <param name="value">The id of this DVIR record.</param>
            public DvirBaseBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.InspectionType property.
            /// </summary>
            /// <param name="value">Inspection type of the DVIR.</param>
            public DvirBaseBuilder InspectionType(string value)
            {
                _InspectionType = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.MechanicNotes property.
            /// </summary>
            /// <param name="value">The mechanics notes on the DVIR.</param>
            public DvirBaseBuilder MechanicNotes(string value)
            {
                _MechanicNotes = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.MechanicOrAgentSignature property.
            /// </summary>
            /// <param name="value">MechanicOrAgentSignature</param>
            public DvirBaseBuilder MechanicOrAgentSignature(DvirBaseMechanicOrAgentSignature value)
            {
                _MechanicOrAgentSignature = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.NextDriverSignature property.
            /// </summary>
            /// <param name="value">NextDriverSignature</param>
            public DvirBaseBuilder NextDriverSignature(DvirBaseNextDriverSignature value)
            {
                _NextDriverSignature = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.OdometerMiles property.
            /// </summary>
            /// <param name="value">The odometer reading in miles for the vehicle when the DVIR was done.</param>
            public DvirBaseBuilder OdometerMiles(long? value)
            {
                _OdometerMiles = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.TimeMs property.
            /// </summary>
            /// <param name="value">Timestamp of this DVIR in UNIX milliseconds.</param>
            public DvirBaseBuilder TimeMs(long? value)
            {
                _TimeMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.TrailerDefects property.
            /// </summary>
            /// <param name="value">Defects registered for the trailer which was part of the DVIR.</param>
            public DvirBaseBuilder TrailerDefects(List<DvirBaseTrailerDefects> value)
            {
                _TrailerDefects = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.TrailerId property.
            /// </summary>
            /// <param name="value">The id of the trailer which was part of the DVIR.</param>
            public DvirBaseBuilder TrailerId(int? value)
            {
                _TrailerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.TrailerName property.
            /// </summary>
            /// <param name="value">The name of the trailer which was part of the DVIR.</param>
            public DvirBaseBuilder TrailerName(string value)
            {
                _TrailerName = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.Vehicle property.
            /// </summary>
            /// <param name="value">Vehicle</param>
            public DvirBaseBuilder Vehicle(DvirBaseVehicle value)
            {
                _Vehicle = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.VehicleCondition property.
            /// </summary>
            /// <param name="value">The condition of vechile on which DVIR was done.</param>
            public DvirBaseBuilder VehicleCondition(string value)
            {
                _VehicleCondition = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBase.VehicleDefects property.
            /// </summary>
            /// <param name="value">Defects registered for the vehicle which was part of the DVIR.</param>
            public DvirBaseBuilder VehicleDefects(List<DvirBaseTrailerDefects> value)
            {
                _VehicleDefects = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DvirBase.
            /// </summary>
            /// <returns>DvirBase</returns>
            public DvirBase Build()
            {
                Validate();
                return new DvirBase(
                    AuthorSignature: _AuthorSignature,
                    DefectsCorrected: _DefectsCorrected,
                    DefectsNeedNotBeCorrected: _DefectsNeedNotBeCorrected,
                    Id: _Id,
                    InspectionType: _InspectionType,
                    MechanicNotes: _MechanicNotes,
                    MechanicOrAgentSignature: _MechanicOrAgentSignature,
                    NextDriverSignature: _NextDriverSignature,
                    OdometerMiles: _OdometerMiles,
                    TimeMs: _TimeMs,
                    TrailerDefects: _TrailerDefects,
                    TrailerId: _TrailerId,
                    TrailerName: _TrailerName,
                    Vehicle: _Vehicle,
                    VehicleCondition: _VehicleCondition,
                    VehicleDefects: _VehicleDefects
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}