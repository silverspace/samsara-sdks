// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class HosAuthenticationLogsResponseAuthenticationLogsItem
    {
        /// <summary>
        /// Initializes a new instance of the
        /// HosAuthenticationLogsResponseAuthenticationLogsItem class.
        /// </summary>
        public HosAuthenticationLogsResponseAuthenticationLogsItem()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// HosAuthenticationLogsResponseAuthenticationLogsItem class.
        /// </summary>
        /// <param name="actionType">The log type - one of 'signin' or
        /// 'signout'</param>
        /// <param name="address">Address at which the log was recorded, if
        /// applicable.</param>
        /// <param name="addressName">Address name from the group address book
        /// at which the log was recorded, if applicable.</param>
        /// <param name="city">City in which the log was recorded, if
        /// applicable.</param>
        /// <param name="happenedAtMs">The time at which the event was recorded
        /// in UNIX milliseconds.</param>
        /// <param name="state">State in which the log was recorded, if
        /// applicable.</param>
        public HosAuthenticationLogsResponseAuthenticationLogsItem(string actionType = default(string), string address = default(string), string addressName = default(string), string city = default(string), long? happenedAtMs = default(long?), string state = default(string))
        {
            ActionType = actionType;
            Address = address;
            AddressName = addressName;
            City = city;
            HappenedAtMs = happenedAtMs;
            State = state;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the log type - one of 'signin' or 'signout'
        /// </summary>
        [JsonProperty(PropertyName = "actionType")]
        public string ActionType { get; set; }

        /// <summary>
        /// Gets or sets address at which the log was recorded, if applicable.
        /// </summary>
        [JsonProperty(PropertyName = "address")]
        public string Address { get; set; }

        /// <summary>
        /// Gets or sets address name from the group address book at which the
        /// log was recorded, if applicable.
        /// </summary>
        [JsonProperty(PropertyName = "addressName")]
        public string AddressName { get; set; }

        /// <summary>
        /// Gets or sets city in which the log was recorded, if applicable.
        /// </summary>
        [JsonProperty(PropertyName = "city")]
        public string City { get; set; }

        /// <summary>
        /// Gets or sets the time at which the event was recorded in UNIX
        /// milliseconds.
        /// </summary>
        [JsonProperty(PropertyName = "happenedAtMs")]
        public long? HappenedAtMs { get; set; }

        /// <summary>
        /// Gets or sets state in which the log was recorded, if applicable.
        /// </summary>
        [JsonProperty(PropertyName = "state")]
        public string State { get; set; }

    }
}