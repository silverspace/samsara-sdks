// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class TaggedVehicleBase
    {
        /// <summary>
        /// Initializes a new instance of the TaggedVehicleBase class.
        /// </summary>
        public TaggedVehicleBase()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the TaggedVehicleBase class.
        /// </summary>
        /// <param name="id">The ID of the Vehicle being tagged.</param>
        public TaggedVehicleBase(long id)
        {
            Id = id;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the ID of the Vehicle being tagged.
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public long Id { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="Microsoft.Rest.ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            //Nothing to validate
        }
    }
}
