using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// The vehicle on which DVIR was done.
    /// </summary>
    public sealed class DvirBaseVehicle:  IEquatable<DvirBaseVehicle>
    { 
        /// <summary>
        /// The vehicle on which DVIR was done.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The vehicle id on which DVIR was done.
        /// </summary>
        public long? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DvirBaseVehicle.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DvirBaseVehicle()
        {
        }

        private DvirBaseVehicle(string Name, long? Id)
        {
            
            this.Name = Name;
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of DvirBaseVehicle.
        /// </summary>
        /// <returns>DvirBaseVehicleBuilder</returns>
        public static DvirBaseVehicleBuilder Builder()
        {
            return new DvirBaseVehicleBuilder();
        }

        /// <summary>
        /// Returns DvirBaseVehicleBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DvirBaseVehicleBuilder</returns>
        public DvirBaseVehicleBuilder With()
        {
            return Builder()
                .Name(Name)
                .Id(Id);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DvirBaseVehicle other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DvirBaseVehicle.
        /// </summary>
        /// <param name="left">Compared (DvirBaseVehicle</param>
        /// <param name="right">Compared (DvirBaseVehicle</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DvirBaseVehicle left, DvirBaseVehicle right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DvirBaseVehicle.
        /// </summary>
        /// <param name="left">Compared (DvirBaseVehicle</param>
        /// <param name="right">Compared (DvirBaseVehicle</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DvirBaseVehicle left, DvirBaseVehicle right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DvirBaseVehicle.
        /// </summary>
        public sealed class DvirBaseVehicleBuilder
        {
            private string _Name;
            private long? _Id;

            internal DvirBaseVehicleBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DvirBaseVehicle.Name property.
            /// </summary>
            /// <param name="value">The vehicle on which DVIR was done.</param>
            public DvirBaseVehicleBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseVehicle.Id property.
            /// </summary>
            /// <param name="value">The vehicle id on which DVIR was done.</param>
            public DvirBaseVehicleBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DvirBaseVehicle.
            /// </summary>
            /// <returns>DvirBaseVehicle</returns>
            public DvirBaseVehicle Build()
            {
                Validate();
                return new DvirBaseVehicle(
                    Name: _Name,
                    Id: _Id
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}