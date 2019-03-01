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

    /// <summary>
    /// Contains the trips for the vehicle in the requested timeframe. A trip
    /// is represented as an object that contains startMs, startLocation,
    /// startAddress, startCoordinates, endMs, endLocation, endAddress and
    /// endCoordinates.
    /// </summary>
    public partial class TripResponse
    {
        /// <summary>
        /// Initializes a new instance of the TripResponse class.
        /// </summary>
        public TripResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the TripResponse class.
        /// </summary>
        public TripResponse(IList<TripResponseTripsItem> trips = default(IList<TripResponseTripsItem>))
        {
            Trips = trips;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "trips")]
        public IList<TripResponseTripsItem> Trips { get; set; }

    }
}
