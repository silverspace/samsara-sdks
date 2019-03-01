using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Specify devices, etc. that should be removed from the tag.
    /// </summary>
    public sealed class TagModifyDelete:  IEquatable<TagModifyDelete>
    { 
        /// <summary>
        /// The assets to be removed from this tag.
        /// </summary>
        public List<TaggedAssetBase> Assets { get; private set; }

        /// <summary>
        /// The sensors to be removed from this tag.
        /// </summary>
        public List<TaggedSensorBase> Sensors { get; private set; }

        /// <summary>
        /// The vehicles to be removed from this tag.
        /// </summary>
        public List<TaggedVehicleBase> Vehicles { get; private set; }

        /// <summary>
        /// The machines to be removed from this tag.
        /// </summary>
        public List<TaggedMachineBase> Machines { get; private set; }

        /// <summary>
        /// The drivers to be removed from this tag.
        /// </summary>
        public List<TaggedDriverBase> Drivers { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TagModifyDelete.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TagModifyDelete()
        {
        }

        private TagModifyDelete(List<TaggedAssetBase> Assets, List<TaggedSensorBase> Sensors, List<TaggedVehicleBase> Vehicles, List<TaggedMachineBase> Machines, List<TaggedDriverBase> Drivers)
        {
            
            this.Assets = Assets;
            
            this.Sensors = Sensors;
            
            this.Vehicles = Vehicles;
            
            this.Machines = Machines;
            
            this.Drivers = Drivers;
            
        }

        /// <summary>
        /// Returns builder of TagModifyDelete.
        /// </summary>
        /// <returns>TagModifyDeleteBuilder</returns>
        public static TagModifyDeleteBuilder Builder()
        {
            return new TagModifyDeleteBuilder();
        }

        /// <summary>
        /// Returns TagModifyDeleteBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TagModifyDeleteBuilder</returns>
        public TagModifyDeleteBuilder With()
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

        public bool Equals(TagModifyDelete other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TagModifyDelete.
        /// </summary>
        /// <param name="left">Compared (TagModifyDelete</param>
        /// <param name="right">Compared (TagModifyDelete</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TagModifyDelete left, TagModifyDelete right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TagModifyDelete.
        /// </summary>
        /// <param name="left">Compared (TagModifyDelete</param>
        /// <param name="right">Compared (TagModifyDelete</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TagModifyDelete left, TagModifyDelete right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TagModifyDelete.
        /// </summary>
        public sealed class TagModifyDeleteBuilder
        {
            private List<TaggedAssetBase> _Assets;
            private List<TaggedSensorBase> _Sensors;
            private List<TaggedVehicleBase> _Vehicles;
            private List<TaggedMachineBase> _Machines;
            private List<TaggedDriverBase> _Drivers;

            internal TagModifyDeleteBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TagModifyDelete.Assets property.
            /// </summary>
            /// <param name="value">The assets to be removed from this tag.</param>
            public TagModifyDeleteBuilder Assets(List<TaggedAssetBase> value)
            {
                _Assets = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagModifyDelete.Sensors property.
            /// </summary>
            /// <param name="value">The sensors to be removed from this tag.</param>
            public TagModifyDeleteBuilder Sensors(List<TaggedSensorBase> value)
            {
                _Sensors = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagModifyDelete.Vehicles property.
            /// </summary>
            /// <param name="value">The vehicles to be removed from this tag.</param>
            public TagModifyDeleteBuilder Vehicles(List<TaggedVehicleBase> value)
            {
                _Vehicles = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagModifyDelete.Machines property.
            /// </summary>
            /// <param name="value">The machines to be removed from this tag.</param>
            public TagModifyDeleteBuilder Machines(List<TaggedMachineBase> value)
            {
                _Machines = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagModifyDelete.Drivers property.
            /// </summary>
            /// <param name="value">The drivers to be removed from this tag.</param>
            public TagModifyDeleteBuilder Drivers(List<TaggedDriverBase> value)
            {
                _Drivers = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TagModifyDelete.
            /// </summary>
            /// <returns>TagModifyDelete</returns>
            public TagModifyDelete Build()
            {
                Validate();
                return new TagModifyDelete(
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