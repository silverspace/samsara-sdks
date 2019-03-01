using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains any J1939/Passenger engine light warnings and engine faults.
    /// </summary>
    public sealed class VehicleMaintenance:  IEquatable<VehicleMaintenance>
    { 
        /// <summary>
        /// ID of the vehicle.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// J1939
        /// </summary>
        public VehicleMaintenanceJ1939 J1939 { get; private set; }

        /// <summary>
        /// Passenger
        /// </summary>
        public VehicleMaintenancePassenger Passenger { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VehicleMaintenance.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VehicleMaintenance()
        {
        }

        private VehicleMaintenance(long? Id, VehicleMaintenanceJ1939 J1939, VehicleMaintenancePassenger Passenger)
        {
            
            this.Id = Id;
            
            this.J1939 = J1939;
            
            this.Passenger = Passenger;
            
        }

        /// <summary>
        /// Returns builder of VehicleMaintenance.
        /// </summary>
        /// <returns>VehicleMaintenanceBuilder</returns>
        public static VehicleMaintenanceBuilder Builder()
        {
            return new VehicleMaintenanceBuilder();
        }

        /// <summary>
        /// Returns VehicleMaintenanceBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VehicleMaintenanceBuilder</returns>
        public VehicleMaintenanceBuilder With()
        {
            return Builder()
                .Id(Id)
                .J1939(J1939)
                .Passenger(Passenger);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VehicleMaintenance other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VehicleMaintenance.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenance</param>
        /// <param name="right">Compared (VehicleMaintenance</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VehicleMaintenance left, VehicleMaintenance right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VehicleMaintenance.
        /// </summary>
        /// <param name="left">Compared (VehicleMaintenance</param>
        /// <param name="right">Compared (VehicleMaintenance</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VehicleMaintenance left, VehicleMaintenance right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VehicleMaintenance.
        /// </summary>
        public sealed class VehicleMaintenanceBuilder
        {
            private long? _Id;
            private VehicleMaintenanceJ1939 _J1939;
            private VehicleMaintenancePassenger _Passenger;

            internal VehicleMaintenanceBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VehicleMaintenance.Id property.
            /// </summary>
            /// <param name="value">ID of the vehicle.</param>
            public VehicleMaintenanceBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenance.J1939 property.
            /// </summary>
            /// <param name="value">J1939</param>
            public VehicleMaintenanceBuilder J1939(VehicleMaintenanceJ1939 value)
            {
                _J1939 = value;
                return this;
            }

            /// <summary>
            /// Sets value for VehicleMaintenance.Passenger property.
            /// </summary>
            /// <param name="value">Passenger</param>
            public VehicleMaintenanceBuilder Passenger(VehicleMaintenancePassenger value)
            {
                _Passenger = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VehicleMaintenance.
            /// </summary>
            /// <returns>VehicleMaintenance</returns>
            public VehicleMaintenance Build()
            {
                Validate();
                return new VehicleMaintenance(
                    Id: _Id,
                    J1939: _J1939,
                    Passenger: _Passenger
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for VehicleMaintenance and cannot be null");
                } 
            }
        }

        
    }
}