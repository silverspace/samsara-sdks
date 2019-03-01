using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Tag
    /// </summary>
    public sealed class Tag:  IEquatable<Tag>
    { 
        /// <summary>
        /// The addresses that belong to this tag.
        /// </summary>
        public List<TaggedAddress> Addresses { get; private set; }

        /// <summary>
        /// The assets that belong to this tag.
        /// </summary>
        public List<TaggedAsset> Assets { get; private set; }

        /// <summary>
        /// The drivers that belong to this tag.
        /// </summary>
        public List<TaggedDriver> Drivers { get; private set; }

        /// <summary>
        /// The GroupID that this tag belongs to.
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// The ID of this tag.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// The machines that belong to this tag.
        /// </summary>
        public List<TaggedMachine> Machines { get; private set; }

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
        public List<TaggedSensor> Sensors { get; private set; }

        /// <summary>
        /// The vehicles that belong to this tag.
        /// </summary>
        public List<TaggedVehicle> Vehicles { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Tag.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Tag()
        {
        }

        private Tag(List<TaggedAddress> Addresses, List<TaggedAsset> Assets, List<TaggedDriver> Drivers, long? GroupId, long? Id, List<TaggedMachine> Machines, string Name, long? ParentTagId, List<TaggedSensor> Sensors, List<TaggedVehicle> Vehicles)
        {
            
            this.Addresses = Addresses;
            
            this.Assets = Assets;
            
            this.Drivers = Drivers;
            
            this.GroupId = GroupId;
            
            this.Id = Id;
            
            this.Machines = Machines;
            
            this.Name = Name;
            
            this.ParentTagId = ParentTagId;
            
            this.Sensors = Sensors;
            
            this.Vehicles = Vehicles;
            
        }

        /// <summary>
        /// Returns builder of Tag.
        /// </summary>
        /// <returns>TagBuilder</returns>
        public static TagBuilder Builder()
        {
            return new TagBuilder();
        }

        /// <summary>
        /// Returns TagBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TagBuilder</returns>
        public TagBuilder With()
        {
            return Builder()
                .Addresses(Addresses)
                .Assets(Assets)
                .Drivers(Drivers)
                .GroupId(GroupId)
                .Id(Id)
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

        public bool Equals(Tag other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Tag.
        /// </summary>
        /// <param name="left">Compared (Tag</param>
        /// <param name="right">Compared (Tag</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Tag left, Tag right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Tag.
        /// </summary>
        /// <param name="left">Compared (Tag</param>
        /// <param name="right">Compared (Tag</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Tag left, Tag right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Tag.
        /// </summary>
        public sealed class TagBuilder
        {
            private List<TaggedAddress> _Addresses;
            private List<TaggedAsset> _Assets;
            private List<TaggedDriver> _Drivers;
            private long? _GroupId;
            private long? _Id;
            private List<TaggedMachine> _Machines;
            private string _Name;
            private long? _ParentTagId;
            private List<TaggedSensor> _Sensors;
            private List<TaggedVehicle> _Vehicles;

            internal TagBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Tag.Addresses property.
            /// </summary>
            /// <param name="value">The addresses that belong to this tag.</param>
            public TagBuilder Addresses(List<TaggedAddress> value)
            {
                _Addresses = value;
                return this;
            }

            /// <summary>
            /// Sets value for Tag.Assets property.
            /// </summary>
            /// <param name="value">The assets that belong to this tag.</param>
            public TagBuilder Assets(List<TaggedAsset> value)
            {
                _Assets = value;
                return this;
            }

            /// <summary>
            /// Sets value for Tag.Drivers property.
            /// </summary>
            /// <param name="value">The drivers that belong to this tag.</param>
            public TagBuilder Drivers(List<TaggedDriver> value)
            {
                _Drivers = value;
                return this;
            }

            /// <summary>
            /// Sets value for Tag.GroupId property.
            /// </summary>
            /// <param name="value">The GroupID that this tag belongs to.</param>
            public TagBuilder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Tag.Id property.
            /// </summary>
            /// <param name="value">The ID of this tag.</param>
            public TagBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Tag.Machines property.
            /// </summary>
            /// <param name="value">The machines that belong to this tag.</param>
            public TagBuilder Machines(List<TaggedMachine> value)
            {
                _Machines = value;
                return this;
            }

            /// <summary>
            /// Sets value for Tag.Name property.
            /// </summary>
            /// <param name="value">Name of this tag.</param>
            public TagBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Tag.ParentTagId property.
            /// </summary>
            /// <param name="value">If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.</param>
            public TagBuilder ParentTagId(long? value)
            {
                _ParentTagId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Tag.Sensors property.
            /// </summary>
            /// <param name="value">The sensors that belong to this tag.</param>
            public TagBuilder Sensors(List<TaggedSensor> value)
            {
                _Sensors = value;
                return this;
            }

            /// <summary>
            /// Sets value for Tag.Vehicles property.
            /// </summary>
            /// <param name="value">The vehicles that belong to this tag.</param>
            public TagBuilder Vehicles(List<TaggedVehicle> value)
            {
                _Vehicles = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Tag.
            /// </summary>
            /// <returns>Tag</returns>
            public Tag Build()
            {
                Validate();
                return new Tag(
                    Addresses: _Addresses,
                    Assets: _Assets,
                    Drivers: _Drivers,
                    GroupId: _GroupId,
                    Id: _Id,
                    Machines: _Machines,
                    Name: _Name,
                    ParentTagId: _ParentTagId,
                    Sensors: _Sensors,
                    Vehicles: _Vehicles
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for Tag and cannot be null");
                } 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for Tag and cannot be null");
                } 
            }
        }

        
    }
}