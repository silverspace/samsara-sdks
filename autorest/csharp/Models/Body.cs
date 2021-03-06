// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class Body
    {
        /// <summary>
        /// Initializes a new instance of the Body class.
        /// </summary>
        public Body()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the Body class.
        /// </summary>
        /// <param name="driverId">Driver ID to query.</param>
        /// <param name="endMs">End of the time range, specified in
        /// milliseconds UNIX time.</param>
        /// <param name="groupId">Group ID to query.</param>
        /// <param name="startMs">Beginning of the time range, specified in
        /// milliseconds UNIX time.</param>
        public Body(long driverId, int endMs, long groupId, int startMs)
        {
            DriverId = driverId;
            EndMs = endMs;
            GroupId = groupId;
            StartMs = startMs;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets driver ID to query.
        /// </summary>
        [JsonProperty(PropertyName = "driverId")]
        public long DriverId { get; set; }

        /// <summary>
        /// Gets or sets end of the time range, specified in milliseconds UNIX
        /// time.
        /// </summary>
        [JsonProperty(PropertyName = "endMs")]
        public int EndMs { get; set; }

        /// <summary>
        /// Gets or sets group ID to query.
        /// </summary>
        [JsonProperty(PropertyName = "groupId")]
        public long GroupId { get; set; }

        /// <summary>
        /// Gets or sets beginning of the time range, specified in milliseconds
        /// UNIX time.
        /// </summary>
        [JsonProperty(PropertyName = "startMs")]
        public int StartMs { get; set; }

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
