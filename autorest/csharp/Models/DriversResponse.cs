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

    public partial class DriversResponse
    {
        /// <summary>
        /// Initializes a new instance of the DriversResponse class.
        /// </summary>
        public DriversResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DriversResponse class.
        /// </summary>
        public DriversResponse(IList<CurrentDriver> drivers = default(IList<CurrentDriver>))
        {
            Drivers = drivers;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "drivers")]
        public IList<CurrentDriver> Drivers { get; set; }

    }
}
