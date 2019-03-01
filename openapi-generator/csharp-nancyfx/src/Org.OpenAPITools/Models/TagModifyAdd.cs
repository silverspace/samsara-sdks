using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Specify devices, etc. that should be added to the tag.
    /// </summary>
    public sealed class TagModifyAdd:  IEquatable<TagModifyAdd>
    { 
        /// <summary>
        /// The assets to be added to this tag.
        /// </summary>
        public List<TaggedAssetBase> Assets { get; private set; }

        /// <summary>
        /// The sensors to be added to this tag.
        /// </summary>
        public List<TaggedSensorBase> Sensors { get; private set; }

        /// <summary>
        /// The vehicles to be added to this tag.
        /// </summary>
        public List<TaggedVehicleBase> Vehicles { get; private set; }

        /// <summary>
        /// The machines to be added to this tag.
        /// </summary>
        public List<TaggedMachineBase> Machines { get; private set; }

        /// <summary>
        /// The drivers to be added to this tag.
        /// </summary>
        public List<TaggedDriverBase> Drivers { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TagModifyAdd.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TagModifyAdd()
        {
        }

        private TagModifyAdd(List<TaggedAssetBase> Assets, List<TaggedSensorBase> Sensors, List<TaggedVehicleBase> Vehicles, List<TaggedMachineBase> Machines, List<TaggedDriverBase> Drivers)
        {
            
            this.Assets = Assets;
            
            this.Sensors = Sensors;
            
            this.Vehicles = Vehicles;
            
            this.Machines = Machines;
            
            this.Drivers = Drivers;
            
        }

        /// <summary>
        /// Returns builder of TagModifyAdd.
        /// </summary>
        /// <returns>TagModifyAddBuilder</returns>
        public static TagModifyAddBuilder Builder()
        {
            return new TagModifyAddBuilder();
        }

        /// <summary>
        /// Returns TagModifyAddBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TagModifyAddBuilder</returns>
        public TagModifyAddBuilder With()
        {
            return Builder()
                .Assets(Assets)
                .Sensors(Sensors)
                .Vehicles(Vehicles)
                .Machines(Machines)
                .Drivers(Drivers);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(TagModifyAdd other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TagModifyAdd.
        /// </summary>
        /// <param name="left">Compared (TagModifyAdd</param>
        /// <param name="right">Compared (TagModifyAdd</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TagModifyAdd left, TagModifyAdd right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TagModifyAdd.
        /// </summary>
        /// <param name="left">Compared (TagModifyAdd</param>
        /// <param name="right">Compared (TagModifyAdd</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TagModifyAdd left, TagModifyAdd right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TagModifyAdd.
        /// </summary>
        public sealed class TagModifyAddBuilder
        {
            private List<TaggedAssetBase> _Assets;
            private List<TaggedSensorBase> _Sensors;
            private List<TaggedVehicleBase> _Vehicles;
            private List<TaggedMachineBase> _Machines;
            private List<TaggedDriverBase> _Drivers;

            internal TagModifyAddBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TagModifyAdd.Assets property.
            /// </summary>
            /// <param name="value">The assets to be added to this tag.</param>
            public TagModifyAddBuilder Assets(List<TaggedAssetBase> value)
            {
                _Assets = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagModifyAdd.Sensors property.
            /// </summary>
            /// <param name="value">The sensors to be added to this tag.</param>
            public TagModifyAddBuilder Sensors(List<TaggedSensorBase> value)
            {
                _Sensors = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagModifyAdd.Vehicles property.
            /// </summary>
            /// <param name="value">The vehicles to be added to this tag.</param>
            public TagModifyAddBuilder Vehicles(List<TaggedVehicleBase> value)
            {
                _Vehicles = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagModifyAdd.Machines property.
            /// </summary>
            /// <param name="value">The machines to be added to this tag.</param>
            public TagModifyAddBuilder Machines(List<TaggedMachineBase> value)
            {
                _Machines = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagModifyAdd.Drivers property.
            /// </summary>
            /// <param name="value">The drivers to be added to this tag.</param>
            public TagModifyAddBuilder Drivers(List<TaggedDriverBase> value)
            {
                _Drivers = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TagModifyAdd.
            /// </summary>
            /// <returns>TagModifyAdd</returns>
            public TagModifyAdd Build()
            {
                Validate();
                return new TagModifyAdd(
                    Assets: _Assets,
                    Sensors: _Sensors,
                    Vehicles: _Vehicles,
                    Machines: _Machines,
                    Drivers: _Drivers
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}