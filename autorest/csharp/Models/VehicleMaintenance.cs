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
    /// Contains any J1939/Passenger engine light warnings and engine faults.
    /// </summary>
    public partial class VehicleMaintenance
    {
        /// <summary>
        /// Initializes a new instance of the VehicleMaintenance class.
        /// </summary>
        public VehicleMaintenance()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the VehicleMaintenance class.
        /// </summary>
        /// <param name="id">ID of the vehicle.</param>
        /// <param name="j1939">J1939 based data. Null if no data is
        /// available.</param>
        /// <param name="passenger">Passenger vehicle data. Null if no data is
        /// available.</param>
        public VehicleMaintenance(long id, VehicleMaintenanceJ1939 j1939 = default(VehicleMaintenanceJ1939), VehicleMaintenancePassenger passenger = default(VehicleMaintenancePassenger))
        {
            Id = id;
            J1939 = j1939;
            Passenger = passenger;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets ID of the vehicle.
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public long Id { get; set; }

        /// <summary>
        /// Gets or sets J1939 based data. Null if no data is available.
        /// </summary>
        [JsonProperty(PropertyName = "j1939")]
        public VehicleMaintenanceJ1939 J1939 { get; set; }

        /// <summary>
        /// Gets or sets passenger vehicle data. Null if no data is available.
        /// </summary>
        [JsonProperty(PropertyName = "passenger")]
        public VehicleMaintenancePassenger Passenger { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="Microsoft.Rest.ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
        }
    }
}
