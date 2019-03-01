// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class Tag
    {
        /// <summary>
        /// Initializes a new instance of the Tag class.
        /// </summary>
        public Tag()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the Tag class.
        /// </summary>
        /// <param name="id">The ID of this tag.</param>
        /// <param name="name">Name of this tag.</param>
        /// <param name="addresses">The addresses that belong to this
        /// tag.</param>
        /// <param name="assets">The assets that belong to this tag.</param>
        /// <param name="drivers">The drivers that belong to this tag.</param>
        /// <param name="groupId">The GroupID that this tag belongs to.</param>
        /// <param name="machines">The machines that belong to this
        /// tag.</param>
        /// <param name="parentTagId">If this tag is part a hierarchical tag
        /// tree as a child tag, the parentTagId is the ID of this tag's parent
        /// tag.</param>
        /// <param name="sensors">The sensors that belong to this tag.</param>
        /// <param name="vehicles">The vehicles that belong to this
        /// tag.</param>
        public Tag(long id, string name, IList<TaggedAddress> addresses = default(IList<TaggedAddress>), IList<TaggedAsset> assets = default(IList<TaggedAsset>), IList<TaggedDriver> drivers = default(IList<TaggedDriver>), long? groupId = default(long?), IList<TaggedMachine> machines = default(IList<TaggedMachine>), long? parentTagId = default(long?), IList<TaggedSensor> sensors = default(IList<TaggedSensor>), IList<TaggedVehicle> vehicles = default(IList<TaggedVehicle>))
        {
            Addresses = addresses;
            Assets = assets;
            Drivers = drivers;
            GroupId = groupId;
            Id = id;
            Machines = machines;
            Name = name;
            ParentTagId = parentTagId;
            Sensors = sensors;
            Vehicles = vehicles;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the addresses that belong to this tag.
        /// </summary>
        [JsonProperty(PropertyName = "addresses")]
        public IList<TaggedAddress> Addresses { get; set; }

        /// <summary>
        /// Gets or sets the assets that belong to this tag.
        /// </summary>
        [JsonProperty(PropertyName = "assets")]
        public IList<TaggedAsset> Assets { get; set; }

        /// <summary>
        /// Gets or sets the drivers that belong to this tag.
        /// </summary>
        [JsonProperty(PropertyName = "drivers")]
        public IList<TaggedDriver> Drivers { get; set; }

        /// <summary>
        /// Gets or sets the GroupID that this tag belongs to.
        /// </summary>
        [JsonProperty(PropertyName = "groupId")]
        public long? GroupId { get; set; }

        /// <summary>
        /// Gets or sets the ID of this tag.
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public long Id { get; set; }

        /// <summary>
        /// Gets or sets the machines that belong to this tag.
        /// </summary>
        [JsonProperty(PropertyName = "machines")]
        public IList<TaggedMachine> Machines { get; set; }

        /// <summary>
        /// Gets or sets name of this tag.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets if this tag is part a hierarchical tag tree as a child
        /// tag, the parentTagId is the ID of this tag's parent tag.
        /// </summary>
        [JsonProperty(PropertyName = "parentTagId")]
        public long? ParentTagId { get; set; }

        /// <summary>
        /// Gets or sets the sensors that belong to this tag.
        /// </summary>
        [JsonProperty(PropertyName = "sensors")]
        public IList<TaggedSensor> Sensors { get; set; }

        /// <summary>
        /// Gets or sets the vehicles that belong to this tag.
        /// </summary>
        [JsonProperty(PropertyName = "vehicles")]
        public IList<TaggedVehicle> Vehicles { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Name == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Name");
            }
            if (Addresses != null)
            {
                foreach (var element in Addresses)
                {
                    if (element != null)
                    {
                        element.Validate();
                    }
                }
            }
            if (Assets != null)
            {
                foreach (var element1 in Assets)
                {
                    if (element1 != null)
                    {
                        element1.Validate();
                    }
                }
            }
            if (Drivers != null)
            {
                foreach (var element2 in Drivers)
                {
                    if (element2 != null)
                    {
                        element2.Validate();
                    }
                }
            }
            if (Machines != null)
            {
                foreach (var element3 in Machines)
                {
                    if (element3 != null)
                    {
                        element3.Validate();
                    }
                }
            }
            if (Sensors != null)
            {
                foreach (var element4 in Sensors)
                {
                    if (element4 != null)
                    {
                        element4.Validate();
                    }
                }
            }
            if (Vehicles != null)
            {
                foreach (var element5 in Vehicles)
                {
                    if (element5 != null)
                    {
                        element5.Validate();
                    }
                }
            }
        }
    }
}
