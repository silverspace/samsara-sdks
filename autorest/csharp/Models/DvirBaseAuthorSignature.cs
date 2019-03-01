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
    /// The authors signature for the DVIR.
    /// </summary>
    public partial class DvirBaseAuthorSignature
    {
        /// <summary>
        /// Initializes a new instance of the DvirBaseAuthorSignature class.
        /// </summary>
        public DvirBaseAuthorSignature()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DvirBaseAuthorSignature class.
        /// </summary>
        /// <param name="driverId">ID of the driver who signed the DVIR. Will
        /// not be returned if mechanicUserId is returned.</param>
        /// <param name="email">Email of the  driver|mechanic who signed the
        /// DVIR.</param>
        /// <param name="mechanicUserId">ID of the mechanic who signed the
        /// DVIR. Will not be returned if driverId is returned.</param>
        /// <param name="name">The name of the driver or mechanic who signed
        /// the DVIR.</param>
        /// <param name="signedAt">The time in millis when the DVIR was
        /// signed</param>
        /// <param name="type">Type corresponds to whether the signature
        /// corresponds to driver|mechanic.</param>
        /// <param name="username">Username of the  driver|mechanic who signed
        /// the DVIR.</param>
        public DvirBaseAuthorSignature(long? driverId = default(long?), string email = default(string), long? mechanicUserId = default(long?), string name = default(string), long? signedAt = default(long?), string type = default(string), string username = default(string))
        {
            DriverId = driverId;
            Email = email;
            MechanicUserId = mechanicUserId;
            Name = name;
            SignedAt = signedAt;
            Type = type;
            Username = username;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets ID of the driver who signed the DVIR. Will not be
        /// returned if mechanicUserId is returned.
        /// </summary>
        [JsonProperty(PropertyName = "driverId")]
        public long? DriverId { get; set; }

        /// <summary>
        /// Gets or sets email of the  driver|mechanic who signed the DVIR.
        /// </summary>
        [JsonProperty(PropertyName = "email")]
        public string Email { get; set; }

        /// <summary>
        /// Gets or sets ID of the mechanic who signed the DVIR. Will not be
        /// returned if driverId is returned.
        /// </summary>
        [JsonProperty(PropertyName = "mechanicUserId")]
        public long? MechanicUserId { get; set; }

        /// <summary>
        /// Gets or sets the name of the driver or mechanic who signed the
        /// DVIR.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the time in millis when the DVIR was signed
        /// </summary>
        [JsonProperty(PropertyName = "signedAt")]
        public long? SignedAt { get; set; }

        /// <summary>
        /// Gets or sets type corresponds to whether the signature corresponds
        /// to driver|mechanic.
        /// </summary>
        [JsonProperty(PropertyName = "type")]
        public string Type { get; set; }

        /// <summary>
        /// Gets or sets username of the  driver|mechanic who signed the DVIR.
        /// </summary>
        [JsonProperty(PropertyName = "username")]
        public string Username { get; set; }

    }
}