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

    public partial class BodyModelModel
    {
        /// <summary>
        /// Initializes a new instance of the BodyModelModel class.
        /// </summary>
        public BodyModelModel()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the BodyModelModel class.
        /// </summary>
        /// <param name="groupId">Group ID to query.</param>
        /// <param name="sensors">List of sensor IDs to query.</param>
        public BodyModelModel(long groupId, IList<long?> sensors)
        {
            GroupId = groupId;
            Sensors = sensors;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets group ID to query.
        /// </summary>
        [JsonProperty(PropertyName = "groupId")]
        public long GroupId { get; set; }

        /// <summary>
        /// Gets or sets list of sensor IDs to query.
        /// </summary>
        [JsonProperty(PropertyName = "sensors")]
        public IList<long?> Sensors { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Sensors == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Sensors");
            }
        }
    }
}