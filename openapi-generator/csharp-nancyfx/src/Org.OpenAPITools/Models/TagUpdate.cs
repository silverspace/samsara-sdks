using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TagUpdate
    /// </summary>
    public sealed class TagUpdate:  IEquatable<TagUpdate>
    { 
        /// <summary>
        /// The assets that belong to this tag.
        /// </summary>
        public List<TaggedAssetBase> Assets { get; private set; }

        /// <summary>
        /// The drivers that belong to this tag.
        /// </summary>
        public List<TaggedDriverBase> Drivers { get; private set; }

        /// <summary>
        /// The machines that belong to this tag.
        /// </summary>
        public List<TaggedMachineBase> Machines { get; private set; }

        /// <summary>
        /// Updated name of this tag.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
        /// </summary>
        public long? ParentTagId { get; private set; }

        /// <summary>
        /// The sensors that belong to this tag.
        /// </summary>
        public List<TaggedSensorBase> Sensors { get; private set; }

        /// <summary>
        /// The vehicles that belong to this tag.
        /// </summary>
        public List<TaggedVehicleBase> Vehicles { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TagUpdate.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TagUpdate()
        {
        }

        private TagUpdate(List<TaggedAssetBase> Assets, List<TaggedDriverBase> Drivers, List<TaggedMachineBase> Machines, string Name, long? ParentTagId, List<TaggedSensorBase> Sensors, List<TaggedVehicleBase> Vehicles)
        {
            
            this.Assets = Assets;
            
            this.Drivers = Drivers;
            
            this.Machines = Machines;
            
            this.Name = Name;
            
            this.ParentTagId = ParentTagId;
            
            this.Sensors = Sensors;
            
            this.Vehicles = Vehicles;
            
        }

        /// <summary>
        /// Returns builder of TagUpdate.
        /// </summary>
        /// <returns>TagUpdateBuilder</returns>
        public static TagUpdateBuilder Builder()
        {
            return new TagUpdateBuilder();
        }

        /// <summary>
        /// Returns TagUpdateBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TagUpdateBuilder</returns>
        public TagUpdateBuilder With()
        {
            return Builder()
                .Assets(Assets)
                .Drivers(Drivers)
                .Machines(Machines)
                .Name(Name)
                .ParentTagId(ParentTagId)
                .Sensors(Sensors)
                .Vehicles(Vehicles);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(TagUpdate other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TagUpdate.
        /// </summary>
        /// <param name="left">Compared (TagUpdate</param>
        /// <param name="right">Compared (TagUpdate</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TagUpdate left, TagUpdate right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TagUpdate.
        /// </summary>
        /// <param name="left">Compared (TagUpdate</param>
        /// <param name="right">Compared (TagUpdate</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TagUpdate left, TagUpdate right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TagUpdate.
        /// </summary>
        public sealed class TagUpdateBuilder
        {
            private List<TaggedAssetBase> _Assets;
            private List<TaggedDriverBase> _Drivers;
            private List<TaggedMachineBase> _Machines;
            private string _Name;
            private long? _ParentTagId;
            private List<TaggedSensorBase> _Sensors;
            private List<TaggedVehicleBase> _Vehicles;

            internal TagUpdateBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TagUpdate.Assets property.
            /// </summary>
            /// <param name="value">The assets that belong to this tag.</param>
            public TagUpdateBuilder Assets(List<TaggedAssetBase> value)
            {
                _Assets = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagUpdate.Drivers property.
            /// </summary>
            /// <param name="value">The drivers that belong to this tag.</param>
            public TagUpdateBuilder Drivers(List<TaggedDriverBase> value)
            {
                _Drivers = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagUpdate.Machines property.
            /// </summary>
            /// <param name="value">The machines that belong to this tag.</param>
            public TagUpdateBuilder Machines(List<TaggedMachineBase> value)
            {
                _Machines = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagUpdate.Name property.
            /// </summary>
            /// <param name="value">Updated name of this tag.</param>
            public TagUpdateBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagUpdate.ParentTagId property.
            /// </summary>
            /// <param name="value">If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.</param>
            public TagUpdateBuilder ParentTagId(long? value)
            {
                _ParentTagId = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagUpdate.Sensors property.
            /// </summary>
            /// <param name="value">The sensors that belong to this tag.</param>
            public TagUpdateBuilder Sensors(List<TaggedSensorBase> value)
            {
                _Sensors = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagUpdate.Vehicles property.
            /// </summary>
            /// <param name="value">The vehicles that belong to this tag.</param>
            public TagUpdateBuilder Vehicles(List<TaggedVehicleBase> value)
            {
                _Vehicles = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TagUpdate.
            /// </summary>
            /// <returns>TagUpdate</returns>
            public TagUpdate Build()
            {
                Validate();
                return new TagUpdate(
                    Assets: _Assets,
                    Drivers: _Drivers,
                    Machines: _Machines,
                    Name: _Name,
                    ParentTagId: _ParentTagId,
                    Sensors: _Sensors,
                    Vehicles: _Vehicles
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}