// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class DispatchRouteHistoricalEntry
    {
        /// <summary>
        /// Initializes a new instance of the DispatchRouteHistoricalEntry
        /// class.
        /// </summary>
        public DispatchRouteHistoricalEntry()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DispatchRouteHistoricalEntry
        /// class.
        /// </summary>
        /// <param name="changedAtMs">Timestamp that the route was updated,
        /// represented as Unix milliseconds since epoch.</param>
        public DispatchRouteHistoricalEntry(long? changedAtMs = default(long?), DispatchRoute route = default(DispatchRoute))
        {
            ChangedAtMs = changedAtMs;
            Route = route;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets timestamp that the route was updated, represented as
        /// Unix milliseconds since epoch.
        /// </summary>
        [JsonProperty(PropertyName = "changed_at_ms")]
        public long? ChangedAtMs { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "route")]
        public DispatchRoute Route { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="Microsoft.Rest.ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Route != null)
            {
                Route.Validate();
            }
        }
    }
}
