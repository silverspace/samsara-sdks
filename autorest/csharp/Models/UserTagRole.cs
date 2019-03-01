// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Linq;

    public partial class UserTagRole
    {
        /// <summary>
        /// Initializes a new instance of the UserTagRole class.
        /// </summary>
        public UserTagRole()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the UserTagRole class.
        /// </summary>
        /// <param name="roleId">The id of the role the user has been granted
        /// on this tag.</param>
        /// <param name="role">The name of the role the user has been granted
        /// on this tag.</param>
        public UserTagRole(string roleId, UserTagRoleTag tag, string role = default(string))
        {
            Role = role;
            RoleId = roleId;
            Tag = tag;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the name of the role the user has been granted on this
        /// tag.
        /// </summary>
        [JsonProperty(PropertyName = "role")]
        public string Role { get; set; }

        /// <summary>
        /// Gets or sets the id of the role the user has been granted on this
        /// tag.
        /// </summary>
        [JsonProperty(PropertyName = "roleId")]
        public string RoleId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "tag")]
        public UserTagRoleTag Tag { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (RoleId == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "RoleId");
            }
            if (Tag == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Tag");
            }
            if (Tag != null)
            {
                Tag.Validate();
            }
        }
    }
}