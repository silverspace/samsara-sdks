using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// A vehicle object as returned for fleet/vehicle
    /// </summary>
    public sealed class FleetVehicleResponse:  IEquatable<FleetVehicleResponse>
    { 
        /// <summary>
        /// ExternalIds
        /// </summary>
        public Dictionary<string, string> ExternalIds { get; private set; }

        /// <summary>
        /// Harsh event detection setting.
        /// </summary>
        public string HarshAccelSetting { get; private set; }

        /// <summary>
        /// ID of the vehicle.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of the vehicle.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// VehicleInfo
        /// </summary>
        public FleetVehicleResponseVehicleInfo VehicleInfo { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use FleetVehicleResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public FleetVehicleResponse()
        {
        }

        private FleetVehicleResponse(Dictionary<string, string> ExternalIds, string HarshAccelSetting, long? Id, string Name, FleetVehicleResponseVehicleInfo VehicleInfo)
        {
            
            this.ExternalIds = ExternalIds;
            
            this.HarshAccelSetting = HarshAccelSetting;
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.VehicleInfo = VehicleInfo;
            
        }

        /// <summary>
        /// Returns builder of FleetVehicleResponse.
        /// </summary>
        /// <returns>FleetVehicleResponseBuilder</returns>
        public static FleetVehicleResponseBuilder Builder()
        {
            return new FleetVehicleResponseBuilder();
        }

        /// <summary>
        /// Returns FleetVehicleResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>FleetVehicleResponseBuilder</returns>
        public FleetVehicleResponseBuilder With()
        {
            return Builder()
                .ExternalIds(ExternalIds)
                .HarshAccelSetting(HarshAccelSetting)
                .Id(Id)
                .Name(Name)
                .VehicleInfo(VehicleInfo);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(FleetVehicleResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (FleetVehicleResponse.
        /// </summary>
        /// <param name="left">Compared (FleetVehicleResponse</param>
        /// <param name="right">Compared (FleetVehicleResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (FleetVehicleResponse left, FleetVehicleResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (FleetVehicleResponse.
        /// </summary>
        /// <param name="left">Compared (FleetVehicleResponse</param>
        /// <param name="right">Compared (FleetVehicleResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (FleetVehicleResponse left, FleetVehicleResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of FleetVehicleResponse.
        /// </summary>
        public sealed class FleetVehicleResponseBuilder
        {
            private Dictionary<string, string> _ExternalIds;
            private string _HarshAccelSetting;
            private long? _Id;
            private string _Name;
            private FleetVehicleResponseVehicleInfo _VehicleInfo;

            internal FleetVehicleResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for FleetVehicleResponse.ExternalIds property.
            /// </summary>
            /// <param name="value">ExternalIds</param>
            public FleetVehicleResponseBuilder ExternalIds(Dictionary<string, string> value)
            {
                _ExternalIds = value;
                return this;
            }

            /// <summary>
            /// Sets value for FleetVehicleResponse.HarshAccelSetting property.
            /// </summary>
            /// <param name="value">Harsh event detection setting.</param>
            public FleetVehicleResponseBuilder HarshAccelSetting(string value)
            {
                _HarshAccelSetting = value;
                return this;
            }

            /// <summary>
            /// Sets value for FleetVehicleResponse.Id property.
            /// </summary>
            /// <param name="value">ID of the vehicle.</param>
            public FleetVehicleResponseBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for FleetVehicleResponse.Name property.
            /// </summary>
            /// <param name="value">Name of the vehicle.</param>
            public FleetVehicleResponseBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for FleetVehicleResponse.VehicleInfo property.
            /// </summary>
            /// <param name="value">VehicleInfo</param>
            public FleetVehicleResponseBuilder VehicleInfo(FleetVehicleResponseVehicleInfo value)
            {
                _VehicleInfo = value;
                return this;
            }


            /// <summary>
            /// Builds instance of FleetVehicleResponse.
            /// </summary>
            /// <returns>FleetVehicleResponse</returns>
            public FleetVehicleResponse Build()
            {
                Validate();
                return new FleetVehicleResponse(
                    ExternalIds: _ExternalIds,
                    HarshAccelSetting: _HarshAccelSetting,
                    Id: _Id,
                    Name: _Name,
                    VehicleInfo: _VehicleInfo
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for FleetVehicleResponse and cannot be null");
                } 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for FleetVehicleResponse and cannot be null");
                } 
            }
        }

        
    }
}