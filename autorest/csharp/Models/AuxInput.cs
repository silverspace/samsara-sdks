// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Digital value of an aux input.
    /// </summary>
    public partial class AuxInput
    {
        /// <summary>
        /// Initializes a new instance of the AuxInput class.
        /// </summary>
        public AuxInput()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the AuxInput class.
        /// </summary>
        /// <param name="timeMs">Timestamp in Unix epoch milliseconds.</param>
        /// <param name="value">Boolean representing the digital value of the
        /// aux input.</param>
        public AuxInput(double timeMs, bool value)
        {
            TimeMs = timeMs;
            Value = value;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets timestamp in Unix epoch milliseconds.
        /// </summary>
        [JsonProperty(PropertyName = "timeMs")]
        public double TimeMs { get; set; }

        /// <summary>
        /// Gets or sets boolean representing the digital value of the aux
        /// input.
        /// </summary>
        [JsonProperty(PropertyName = "value")]
        public bool Value { get; set; }

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
