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
    /// Information about a notification contact for alerts.
    /// </summary>
    public partial class Contact
    {
        /// <summary>
        /// Initializes a new instance of the Contact class.
        /// </summary>
        public Contact()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the Contact class.
        /// </summary>
        /// <param name="email">Email address of the contact</param>
        /// <param name="firstName">First name of the contact</param>
        /// <param name="id">ID of the contact</param>
        /// <param name="lastName">Last name of the contact</param>
        /// <param name="phone">Phone number of the contact</param>
        public Contact(string email = default(string), string firstName = default(string), long? id = default(long?), string lastName = default(string), string phone = default(string))
        {
            Email = email;
            FirstName = firstName;
            Id = id;
            LastName = lastName;
            Phone = phone;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets email address of the contact
        /// </summary>
        [JsonProperty(PropertyName = "email")]
        public string Email { get; set; }

        /// <summary>
        /// Gets or sets first name of the contact
        /// </summary>
        [JsonProperty(PropertyName = "firstName")]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or sets ID of the contact
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public long? Id { get; set; }

        /// <summary>
        /// Gets or sets last name of the contact
        /// </summary>
        [JsonProperty(PropertyName = "lastName")]
        public string LastName { get; set; }

        /// <summary>
        /// Gets or sets phone number of the contact
        /// </summary>
        [JsonProperty(PropertyName = "phone")]
        public string Phone { get; set; }

    }
}
