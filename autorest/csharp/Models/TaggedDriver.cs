// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class TaggedDriver : TaggedDriverBase
    {
        /// <summary>
        /// Initializes a new instance of the TaggedDriver class.
        /// </summary>
        public TaggedDriver()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the TaggedDriver class.
        /// </summary>
        /// <param name="id">The ID of the Driver being tagged.</param>
        /// <param name="name">Name of the Driver being tagged.</param>
        public TaggedDriver(long id, string name = default(string))
            : base(id)
        {
            Name = name;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets name of the Driver being tagged.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="Microsoft.Rest.ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public override void Validate()
        {
            base.Validate();
        }
    }
}
