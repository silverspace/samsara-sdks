// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class HosAuthenticationLogsResponse
    {
        /// <summary>
        /// Initializes a new instance of the HosAuthenticationLogsResponse
        /// class.
        /// </summary>
        public HosAuthenticationLogsResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the HosAuthenticationLogsResponse
        /// class.
        /// </summary>
        public HosAuthenticationLogsResponse(IList<HosAuthenticationLogsResponseAuthenticationLogsItem> authenticationLogs = default(IList<HosAuthenticationLogsResponseAuthenticationLogsItem>))
        {
            AuthenticationLogs = authenticationLogs;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "authenticationLogs")]
        public IList<HosAuthenticationLogsResponseAuthenticationLogsItem> AuthenticationLogs { get; set; }

    }
}
