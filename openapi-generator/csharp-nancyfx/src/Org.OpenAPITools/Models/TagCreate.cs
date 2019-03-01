using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TagCreate
    /// </summary>
    public sealed class TagCreate:  IEquatable<TagCreate>
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
        /// Name of this tag.
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
        /// Use TagCreate.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TagCreate()
        {
        }

        private TagCreate(List<TaggedAssetBase> Assets, List<TaggedDriverBase> Drivers, List<TaggedMachineBase> Machines, string Name, long? ParentTagId, List<TaggedSensorBase> Sensors, List<TaggedVehicleBase> Vehicles)
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
        /// Returns builder of TagCreate.
        /// </summary>
        /// <returns>TagCreateBuilder</returns>
        public static TagCreateBuilder Builder()
        {
            return new TagCreateBuilder();
        }

        /// <summary>
        /// Returns TagCreateBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TagCreateBuilder</returns>
        public TagCreateBuilder With()
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

        public bool Equals(TagCreate other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TagCreate.
        /// </summary>
        /// <param name="left">Compared (TagCreate</param>
        /// <param name="right">Compared (TagCreate</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TagCreate left, TagCreate right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TagCreate.
        /// </summary>
        /// <param name="left">Compared (TagCreate</param>
        /// <param name="right">Compared (TagCreate</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TagCreate left, TagCreate right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TagCreate.
        /// </summary>
        public sealed class TagCreateBuilder
        {
            private List<TaggedAssetBase> _Assets;
            private List<TaggedDriverBase> _Drivers;
            private List<TaggedMachineBase> _Machines;
            private string _Name;
            private long? _ParentTagId;
            private List<TaggedSensorBase> _Sensors;
            private List<TaggedVehicleBase> _Vehicles;

            internal TagCreateBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TagCreate.Assets property.
            /// </summary>
            /// <param name="value">The assets that belong to this tag.</param>
            public TagCreateBuilder Assets(List<TaggedAssetBase> value)
            {
                _Assets = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagCreate.Drivers property.
            /// </summary>
            /// <param name="value">The drivers that belong to this tag.</param>
            public TagCreateBuilder Drivers(List<TaggedDriverBase> value)
            {
                _Drivers = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagCreate.Machines property.
            /// </summary>
            /// <param name="value">The machines that belong to this tag.</param>
            public TagCreateBuilder Machines(List<TaggedMachineBase> value)
            {
                _Machines = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagCreate.Name property.
            /// </summary>
            /// <param name="value">Name of this tag.</param>
            public TagCreateBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagCreate.ParentTagId property.
            /// </summary>
            /// <param name="value">If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.</param>
            public TagCreateBuilder ParentTagId(long? value)
            {
                _ParentTagId = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagCreate.Sensors property.
            /// </summary>
            /// <param name="value">The sensors that belong to this tag.</param>
            public TagCreateBuilder Sensors(List<TaggedSensorBase> value)
            {
                _Sensors = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagCreate.Vehicles property.
            /// </summary>
            /// <param name="value">The vehicles that belong to this tag.</param>
            public TagCreateBuilder Vehicles(List<TaggedVehicleBase> value)
            {
                _Vehicles = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TagCreate.
            /// </summary>
            /// <returns>TagCreate</returns>
            public TagCreate Build()
            {
                Validate();
                return new TagCreate(
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
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for TagCreate and cannot be null");
                } 
            }
        }

        
    }
}